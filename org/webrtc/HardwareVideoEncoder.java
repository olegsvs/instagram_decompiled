package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.Surface;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase14.Context;
import org.webrtc.EncodedImage.Builder;
import org.webrtc.EncodedImage.FrameType;
import org.webrtc.ThreadUtils.ThreadChecker;
import org.webrtc.VideoEncoder.BitrateAllocation;
import org.webrtc.VideoEncoder.Callback;
import org.webrtc.VideoEncoder.CodecSpecificInfo;
import org.webrtc.VideoEncoder.ScalingSettings;
import org.webrtc.VideoEncoder.Settings;
import org.webrtc.VideoFrame.Buffer;

public class HardwareVideoEncoder implements VideoEncoder {
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final String KEY_BITRATE_MODE = "bitrate-mode";
    private static final int MAX_ENCODER_Q_SIZE = 2;
    private static final int MAX_VIDEO_FRAMERATE = 30;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final String TAG = "HardwareVideoEncoder";
    private static final int VIDEO_AVC_LEVEL_3 = 256;
    private static final int VIDEO_AVC_PROFILE_HIGH = 8;
    private static final int VIDEO_ControlRateConstant = 2;
    private int adjustedBitrate;
    private boolean automaticResizeOn;
    private final BitrateAdjuster bitrateAdjuster;
    private Callback callback;
    private MediaCodec codec;
    private final String codecName;
    private final VideoCodecType codecType;
    private ByteBuffer configBuffer = null;
    private final ThreadChecker encodeThreadChecker = new ThreadChecker();
    private final long forcedKeyFrameNs;
    private int height;
    private final int keyFrameIntervalSec;
    private long lastKeyFrameNs;
    private final BlockingDeque outputBuilders = new LinkedBlockingDeque();
    private Thread outputThread;
    private final ThreadChecker outputThreadChecker = new ThreadChecker();
    private final Map params;
    public volatile boolean running = false;
    private final Context sharedContext;
    private volatile Exception shutdownException = null;
    private final Integer surfaceColorFormat;
    private final GlRectDrawer textureDrawer = new GlRectDrawer();
    private EglBase14 textureEglBase;
    private Surface textureInputSurface;
    private boolean useSurfaceMode;
    private final VideoFrameDrawer videoFrameDrawer = new VideoFrameDrawer();
    private int width;
    private final Integer yuvColorFormat;
    private final YuvFormat yuvFormat;

    /* renamed from: org.webrtc.HardwareVideoEncoder$1 */
    public class C02201 extends Thread {
        public void run() {
            while (HardwareVideoEncoder.this.running) {
                HardwareVideoEncoder.deliverEncodedImage(HardwareVideoEncoder.this);
            }
            HardwareVideoEncoder.releaseCodecOnOutputThread(HardwareVideoEncoder.this);
        }
    }

    public enum YuvFormat {
        I420 {
            public void fillBuffer(ByteBuffer byteBuffer, Buffer buffer) {
                Buffer toI420 = buffer.toI420();
                YuvHelper.I420Copy(toI420.getDataY(), toI420.getStrideY(), toI420.getDataU(), toI420.getStrideU(), toI420.getDataV(), toI420.getStrideV(), byteBuffer, toI420.getWidth(), toI420.getHeight());
                toI420.release();
            }
        },
        NV12 {
            public void fillBuffer(ByteBuffer byteBuffer, Buffer buffer) {
                Buffer toI420 = buffer.toI420();
                YuvHelper.I420ToNV12(toI420.getDataY(), toI420.getStrideY(), toI420.getDataU(), toI420.getStrideU(), toI420.getDataV(), toI420.getStrideV(), byteBuffer, toI420.getWidth(), toI420.getHeight());
                toI420.release();
            }
        };

        public abstract void fillBuffer(ByteBuffer byteBuffer, Buffer buffer);

        public static YuvFormat valueOf(int i) {
            if (i == 19) {
                return I420;
            }
            if (!(i == 21 || i == 2141391872)) {
                if (i != MediaCodecUtils.COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unsupported colorFormat: ");
                    stringBuilder.append(i);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            return NV12;
        }
    }

    public String getImplementationName() {
        return "HWEncoder";
    }

    public HardwareVideoEncoder(String str, VideoCodecType videoCodecType, Integer num, Integer num2, Map map, int i, int i2, BitrateAdjuster bitrateAdjuster, Context context) {
        this.codecName = str;
        this.codecType = videoCodecType;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.yuvFormat = YuvFormat.valueOf(num2.intValue());
        this.params = map;
        this.keyFrameIntervalSec = i;
        this.forcedKeyFrameNs = TimeUnit.MILLISECONDS.toNanos((long) i2);
        this.bitrateAdjuster = bitrateAdjuster;
        this.sharedContext = context;
        this.encodeThreadChecker.detachThread();
    }

    private boolean canUseSurface() {
        return (this.sharedContext == null || this.surfaceColorFormat == null) ? false : true;
    }

    private Thread createOutputThread() {
        return new C02201();
    }

    public static void deliverEncodedImage(HardwareVideoEncoder hardwareVideoEncoder) {
        hardwareVideoEncoder.outputThreadChecker.checkIsOnValidThread();
        try {
            BufferInfo bufferInfo = new BufferInfo();
            int dequeueOutputBuffer = hardwareVideoEncoder.codec.dequeueOutputBuffer(bufferInfo, 100000);
            if (dequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer = hardwareVideoEncoder.codec.getOutputBuffers()[dequeueOutputBuffer];
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                String str;
                StringBuilder stringBuilder;
                if ((bufferInfo.flags & 2) != 0) {
                    str = TAG;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Config frame generated. Offset: ");
                    stringBuilder.append(bufferInfo.offset);
                    stringBuilder.append(". Size: ");
                    stringBuilder.append(bufferInfo.size);
                    Logging.m29383d(str, stringBuilder.toString());
                    hardwareVideoEncoder.configBuffer = ByteBuffer.allocateDirect(bufferInfo.size);
                    hardwareVideoEncoder.configBuffer.put(byteBuffer);
                } else {
                    ByteBuffer slice;
                    FrameType frameType;
                    hardwareVideoEncoder.bitrateAdjuster.reportEncodedFrame(bufferInfo.size);
                    if (hardwareVideoEncoder.adjustedBitrate != hardwareVideoEncoder.bitrateAdjuster.getAdjustedBitrateBps()) {
                        hardwareVideoEncoder.updateBitrate();
                    }
                    int i = 1;
                    if ((bufferInfo.flags & 1) == 0) {
                        i = 0;
                    }
                    if (i != 0) {
                        Logging.m29383d(TAG, "Sync frame generated");
                    }
                    if (i == 0 || hardwareVideoEncoder.codecType != VideoCodecType.H264) {
                        slice = byteBuffer.slice();
                    } else {
                        str = TAG;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Prepending config frame of size ");
                        stringBuilder.append(hardwareVideoEncoder.configBuffer.capacity());
                        stringBuilder.append(" to output buffer with offset ");
                        stringBuilder.append(bufferInfo.offset);
                        stringBuilder.append(", size ");
                        stringBuilder.append(bufferInfo.size);
                        Logging.m29383d(str, stringBuilder.toString());
                        slice = ByteBuffer.allocateDirect(bufferInfo.size + hardwareVideoEncoder.configBuffer.capacity());
                        hardwareVideoEncoder.configBuffer.rewind();
                        slice.put(hardwareVideoEncoder.configBuffer);
                        slice.put(byteBuffer);
                        slice.rewind();
                    }
                    if (i != 0) {
                        frameType = FrameType.VideoFrameKey;
                    } else {
                        frameType = FrameType.VideoFrameDelta;
                    }
                    Builder builder = (Builder) hardwareVideoEncoder.outputBuilders.poll();
                    builder.setBuffer(slice).setFrameType(frameType);
                    hardwareVideoEncoder.callback.onEncodedFrame(builder.createEncodedImage(), new CodecSpecificInfo());
                }
                hardwareVideoEncoder.codec.releaseOutputBuffer(dequeueOutputBuffer, false);
            }
        } catch (Throwable e) {
            Logging.m29385e(TAG, "deliverOutput failed", e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.webrtc.VideoCodecStatus encode(org.webrtc.VideoFrame r10, org.webrtc.VideoEncoder.EncodeInfo r11) {
        /*
        r9 = this;
        r0 = r9.encodeThreadChecker;
        r0.checkIsOnValidThread();
        r0 = r9.codec;
        if (r0 != 0) goto L_0x000c;
    L_0x0009:
        r0 = org.webrtc.VideoCodecStatus.UNINITIALIZED;
        return r0;
    L_0x000c:
        r2 = r10.getBuffer();
        r1 = r2 instanceof org.webrtc.VideoFrame.TextureBuffer;
        r0 = r10.getBuffer();
        r4 = r0.getWidth();
        r0 = r10.getBuffer();
        r3 = r0.getHeight();
        r0 = r9.canUseSurface();
        r8 = 0;
        r5 = 1;
        if (r0 == 0) goto L_0x002e;
    L_0x002a:
        if (r1 == 0) goto L_0x002e;
    L_0x002c:
        r1 = 1;
        goto L_0x002f;
    L_0x002e:
        r1 = 0;
    L_0x002f:
        r0 = r9.width;
        if (r4 != r0) goto L_0x003b;
    L_0x0033:
        r0 = r9.height;
        if (r3 != r0) goto L_0x003b;
    L_0x0037:
        r0 = r9.useSurfaceMode;
        if (r1 == r0) goto L_0x0044;
    L_0x003b:
        r1 = r9.resetCodec(r4, r3, r1);
        r0 = org.webrtc.VideoCodecStatus.OK;
        if (r1 == r0) goto L_0x0044;
    L_0x0043:
        return r1;
    L_0x0044:
        r0 = r9.outputBuilders;
        r0 = r0.size();
        r4 = 2;
        if (r0 <= r4) goto L_0x0057;
    L_0x004d:
        r1 = "HardwareVideoEncoder";
        r0 = "Dropped frame, encoder queue full";
        org.webrtc.Logging.m29384e(r1, r0);
        r0 = org.webrtc.VideoCodecStatus.NO_OUTPUT;
        return r0;
    L_0x0057:
        r7 = r11.frameTypes;
        r6 = r7.length;
        r3 = 0;
    L_0x005b:
        if (r8 >= r6) goto L_0x0067;
    L_0x005d:
        r1 = r7[r8];
        r0 = org.webrtc.EncodedImage.FrameType.VideoFrameKey;
        if (r1 != r0) goto L_0x0064;
    L_0x0063:
        r3 = 1;
    L_0x0064:
        r8 = r8 + 1;
        goto L_0x005b;
    L_0x0067:
        if (r3 != 0) goto L_0x0073;
    L_0x0069:
        r0 = r10.getTimestampNs();
        r0 = r9.shouldForceKeyFrame(r0);
        if (r0 == 0) goto L_0x007a;
    L_0x0073:
        r0 = r10.getTimestampNs();
        r9.requestKeyFrame(r0);
    L_0x007a:
        r1 = r2.getHeight();
        r0 = r2.getWidth();
        r1 = r1 * r0;
        r3 = r1 * 3;
        r3 = r3 / r4;
        r4 = org.webrtc.EncodedImage.builder();
        r0 = r10.getTimestampNs();
        r0 = r4.setCaptureTimeNs(r0);
        r1 = r0.setCompleteFrame(r5);
        r0 = r10.getBuffer();
        r0 = r0.getWidth();
        r1 = r1.setEncodedWidth(r0);
        r0 = r10.getBuffer();
        r0 = r0.getHeight();
        r1 = r1.setEncodedHeight(r0);
        r0 = r10.getRotation();
        r1 = r1.setRotation(r0);
        r0 = r9.outputBuilders;
        r0.offer(r1);
        r0 = r9.useSurfaceMode;
        if (r0 == 0) goto L_0x00c4;
    L_0x00bf:
        r1 = r9.encodeTextureBuffer(r10);
        goto L_0x00c8;
    L_0x00c4:
        r1 = r9.encodeByteBuffer(r10, r2, r3);
    L_0x00c8:
        r0 = org.webrtc.VideoCodecStatus.OK;
        if (r1 == r0) goto L_0x0043;
    L_0x00cc:
        r0 = r9.outputBuilders;
        r0.pollLast();
        goto L_0x0043;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.encode(org.webrtc.VideoFrame, org.webrtc.VideoEncoder$EncodeInfo):org.webrtc.VideoCodecStatus");
    }

    private VideoCodecStatus encodeByteBuffer(VideoFrame videoFrame, Buffer buffer, int i) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long timestampNs = (videoFrame.getTimestampNs() + 500) / 1000;
        try {
            int dequeueInputBuffer = this.codec.dequeueInputBuffer(0);
            if (dequeueInputBuffer == -1) {
                Logging.m29383d(TAG, "Dropped frame, no input buffers available");
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                this.yuvFormat.fillBuffer(this.codec.getInputBuffers()[dequeueInputBuffer], buffer);
                try {
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, i, timestampNs, 0);
                    return VideoCodecStatus.OK;
                } catch (Throwable e) {
                    Logging.m29385e(TAG, "queueInputBuffer failed", e);
                    return VideoCodecStatus.ERROR;
                }
            } catch (Throwable e2) {
                Logging.m29385e(TAG, "getInputBuffers failed", e2);
                return VideoCodecStatus.ERROR;
            }
        } catch (Throwable e22) {
            Logging.m29385e(TAG, "dequeueInputBuffer failed", e22);
            return VideoCodecStatus.ERROR;
        }
    }

    private VideoCodecStatus encodeTextureBuffer(VideoFrame videoFrame) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            GLES20.glClear(16384);
            this.videoFrameDrawer.drawFrame(new VideoFrame(videoFrame.getBuffer(), 0, videoFrame.getTimestampNs()), this.textureDrawer, null);
            this.textureEglBase.swapBuffers(videoFrame.getTimestampNs());
            return VideoCodecStatus.OK;
        } catch (Throwable e) {
            Logging.m29385e(TAG, "encodeTexture failed", e);
            return VideoCodecStatus.ERROR;
        }
    }

    public ScalingSettings getScalingSettings() {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.automaticResizeOn) {
            if (this.codecType == VideoCodecType.VP8) {
                return new ScalingSettings(29, 95);
            }
            if (this.codecType == VideoCodecType.H264) {
                return new ScalingSettings(24, 37);
            }
        }
        return ScalingSettings.OFF;
    }

    public VideoCodecStatus initEncode(Settings settings, Callback callback) {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.callback = callback;
        this.automaticResizeOn = settings.automaticResizeOn;
        this.width = settings.width;
        this.height = settings.height;
        this.useSurfaceMode = canUseSurface();
        if (!(settings.startBitrate == 0 || settings.maxFramerate == 0)) {
            this.bitrateAdjuster.setTargets(settings.startBitrate * JsonMappingException.MAX_REFS_TO_LIST, settings.maxFramerate);
        }
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("initEncode: ");
        stringBuilder.append(this.width);
        stringBuilder.append(" x ");
        stringBuilder.append(this.height);
        stringBuilder.append(". @ ");
        stringBuilder.append(settings.startBitrate);
        stringBuilder.append("kbps. Fps: ");
        stringBuilder.append(settings.maxFramerate);
        stringBuilder.append(" Use surface mode: ");
        stringBuilder.append(this.useSurfaceMode);
        Logging.m29383d(str, stringBuilder.toString());
        return initEncodeInternal();
    }

    private org.webrtc.VideoCodecStatus initEncodeInternal() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = r6.encodeThreadChecker;
        r0.checkIsOnValidThread();
        r0 = -1;
        r6.lastKeyFrameNs = r0;
        r0 = r6.codecName;	 Catch:{ IOException -> 0x0132, IOException -> 0x0132 }
        r0 = android.media.MediaCodec.createByCodecName(r0);	 Catch:{ IOException -> 0x0132, IOException -> 0x0132 }
        r6.codec = r0;	 Catch:{ IOException -> 0x0132, IOException -> 0x0132 }
        r0 = r6.useSurfaceMode;
        if (r0 == 0) goto L_0x0018;
    L_0x0015:
        r0 = r6.surfaceColorFormat;
        goto L_0x001a;
    L_0x0018:
        r0 = r6.yuvColorFormat;
    L_0x001a:
        r3 = r0.intValue();
        r0 = r6.codecType;	 Catch:{ IllegalStateException -> 0x0124 }
        r2 = r0.mimeType();	 Catch:{ IllegalStateException -> 0x0124 }
        r1 = r6.width;	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = r6.height;	 Catch:{ IllegalStateException -> 0x0124 }
        r4 = android.media.MediaFormat.createVideoFormat(r2, r1, r0);	 Catch:{ IllegalStateException -> 0x0124 }
        r1 = "bitrate";	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = r6.adjustedBitrate;	 Catch:{ IllegalStateException -> 0x0124 }
        r4.setInteger(r1, r0);	 Catch:{ IllegalStateException -> 0x0124 }
        r1 = r6.params;	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = "bitrate-mode";	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = r1.containsKey(r0);	 Catch:{ IllegalStateException -> 0x0124 }
        if (r0 == 0) goto L_0x004f;	 Catch:{ IllegalStateException -> 0x0124 }
    L_0x003d:
        r2 = "bitrate-mode";	 Catch:{ IllegalStateException -> 0x0124 }
        r1 = r6.params;	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = r1.get(r2);	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = (java.lang.String) r0;	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ IllegalStateException -> 0x0124 }
        r4.setInteger(r2, r0);	 Catch:{ IllegalStateException -> 0x0124 }
        goto L_0x0055;	 Catch:{ IllegalStateException -> 0x0124 }
    L_0x004f:
        r1 = "bitrate-mode";	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = 2;	 Catch:{ IllegalStateException -> 0x0124 }
        r4.setInteger(r1, r0);	 Catch:{ IllegalStateException -> 0x0124 }
    L_0x0055:
        r0 = "color-format";	 Catch:{ IllegalStateException -> 0x0124 }
        r4.setInteger(r0, r3);	 Catch:{ IllegalStateException -> 0x0124 }
        r1 = "frame-rate";	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = r6.bitrateAdjuster;	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = r0.getCodecConfigFramerate();	 Catch:{ IllegalStateException -> 0x0124 }
        r4.setInteger(r1, r0);	 Catch:{ IllegalStateException -> 0x0124 }
        r1 = "i-frame-interval";	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = r6.keyFrameIntervalSec;	 Catch:{ IllegalStateException -> 0x0124 }
        r4.setInteger(r1, r0);	 Catch:{ IllegalStateException -> 0x0124 }
        r1 = r6.codecType;	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = org.webrtc.VideoCodecType.H264;	 Catch:{ IllegalStateException -> 0x0124 }
        r3 = 1;	 Catch:{ IllegalStateException -> 0x0124 }
        if (r1 != r0) goto L_0x00cd;	 Catch:{ IllegalStateException -> 0x0124 }
    L_0x0073:
        r1 = r6.params;	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = "profile-level-id";	 Catch:{ IllegalStateException -> 0x0124 }
        r5 = r1.get(r0);	 Catch:{ IllegalStateException -> 0x0124 }
        r5 = (java.lang.String) r5;	 Catch:{ IllegalStateException -> 0x0124 }
        if (r5 != 0) goto L_0x0081;	 Catch:{ IllegalStateException -> 0x0124 }
    L_0x007f:
        r5 = "42e01f";	 Catch:{ IllegalStateException -> 0x0124 }
    L_0x0081:
        r2 = -1;	 Catch:{ IllegalStateException -> 0x0124 }
        r1 = r5.hashCode();	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = 1537948542; // 0x5bab3b7e float:9.6395267E16 double:7.598475397E-315;	 Catch:{ IllegalStateException -> 0x0124 }
        if (r1 == r0) goto L_0x009b;	 Catch:{ IllegalStateException -> 0x0124 }
    L_0x008b:
        r0 = 1595523974; // 0x5f19c386 float:1.1079847E19 double:7.882935827E-315;	 Catch:{ IllegalStateException -> 0x0124 }
        if (r1 == r0) goto L_0x0091;	 Catch:{ IllegalStateException -> 0x0124 }
    L_0x0090:
        goto L_0x00a4;	 Catch:{ IllegalStateException -> 0x0124 }
    L_0x0091:
        r0 = "640c1f";	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = r5.equals(r0);	 Catch:{ IllegalStateException -> 0x0124 }
        if (r0 == 0) goto L_0x00a4;	 Catch:{ IllegalStateException -> 0x0124 }
    L_0x0099:
        r2 = 0;	 Catch:{ IllegalStateException -> 0x0124 }
        goto L_0x00a4;	 Catch:{ IllegalStateException -> 0x0124 }
    L_0x009b:
        r0 = "42e01f";	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = r5.equals(r0);	 Catch:{ IllegalStateException -> 0x0124 }
        if (r0 == 0) goto L_0x00a4;	 Catch:{ IllegalStateException -> 0x0124 }
    L_0x00a3:
        r2 = 1;	 Catch:{ IllegalStateException -> 0x0124 }
    L_0x00a4:
        switch(r2) {
            case 0: goto L_0x00aa;
            case 1: goto L_0x00cd;
            default: goto L_0x00a7;
        };	 Catch:{ IllegalStateException -> 0x0124 }
    L_0x00a7:
        r2 = "HardwareVideoEncoder";	 Catch:{ IllegalStateException -> 0x0124 }
        goto L_0x00b9;	 Catch:{ IllegalStateException -> 0x0124 }
    L_0x00aa:
        r1 = "profile";	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = 8;	 Catch:{ IllegalStateException -> 0x0124 }
        r4.setInteger(r1, r0);	 Catch:{ IllegalStateException -> 0x0124 }
        r1 = "level";	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = 256; // 0x100 float:3.59E-43 double:1.265E-321;	 Catch:{ IllegalStateException -> 0x0124 }
        r4.setInteger(r1, r0);	 Catch:{ IllegalStateException -> 0x0124 }
        goto L_0x00cd;	 Catch:{ IllegalStateException -> 0x0124 }
    L_0x00b9:
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0124 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = "Unknown profile level id: ";	 Catch:{ IllegalStateException -> 0x0124 }
        r1.append(r0);	 Catch:{ IllegalStateException -> 0x0124 }
        r1.append(r5);	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = r1.toString();	 Catch:{ IllegalStateException -> 0x0124 }
        org.webrtc.Logging.m29387w(r2, r0);	 Catch:{ IllegalStateException -> 0x0124 }
    L_0x00cd:
        r2 = "HardwareVideoEncoder";	 Catch:{ IllegalStateException -> 0x0124 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0124 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = "Format: ";	 Catch:{ IllegalStateException -> 0x0124 }
        r1.append(r0);	 Catch:{ IllegalStateException -> 0x0124 }
        r1.append(r4);	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = r1.toString();	 Catch:{ IllegalStateException -> 0x0124 }
        org.webrtc.Logging.m29383d(r2, r0);	 Catch:{ IllegalStateException -> 0x0124 }
        r1 = r6.codec;	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = 0;	 Catch:{ IllegalStateException -> 0x0124 }
        r1.configure(r4, r0, r0, r3);	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = r6.useSurfaceMode;	 Catch:{ IllegalStateException -> 0x0124 }
        if (r0 == 0) goto L_0x010c;	 Catch:{ IllegalStateException -> 0x0124 }
    L_0x00ed:
        r2 = new org.webrtc.EglBase14;	 Catch:{ IllegalStateException -> 0x0124 }
        r1 = r6.sharedContext;	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = org.webrtc.EglBase.CONFIG_RECORDABLE;	 Catch:{ IllegalStateException -> 0x0124 }
        r2.<init>(r1, r0);	 Catch:{ IllegalStateException -> 0x0124 }
        r6.textureEglBase = r2;	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = r6.codec;	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = r0.createInputSurface();	 Catch:{ IllegalStateException -> 0x0124 }
        r6.textureInputSurface = r0;	 Catch:{ IllegalStateException -> 0x0124 }
        r1 = r6.textureEglBase;	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = r6.textureInputSurface;	 Catch:{ IllegalStateException -> 0x0124 }
        r1.createSurface(r0);	 Catch:{ IllegalStateException -> 0x0124 }
        r0 = r6.textureEglBase;	 Catch:{ IllegalStateException -> 0x0124 }
        r0.makeCurrent();	 Catch:{ IllegalStateException -> 0x0124 }
    L_0x010c:
        r0 = r6.codec;	 Catch:{ IllegalStateException -> 0x0124 }
        r0.start();	 Catch:{ IllegalStateException -> 0x0124 }
        r6.running = r3;
        r0 = r6.outputThreadChecker;
        r0.detachThread();
        r0 = r6.createOutputThread();
        r6.outputThread = r0;
        r0.start();
        r0 = org.webrtc.VideoCodecStatus.OK;
        return r0;
    L_0x0124:
        r2 = move-exception;
        r1 = "HardwareVideoEncoder";
        r0 = "initEncodeInternal failed";
        org.webrtc.Logging.m29385e(r1, r0, r2);
        r6.release();
        r0 = org.webrtc.VideoCodecStatus.FALLBACK_SOFTWARE;
        return r0;
    L_0x0132:
        r2 = "HardwareVideoEncoder";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Cannot create media encoder ";
        r1.append(r0);
        r0 = r6.codecName;
        r1.append(r0);
        r0 = r1.toString();
        org.webrtc.Logging.m29384e(r2, r0);
        r0 = org.webrtc.VideoCodecStatus.FALLBACK_SOFTWARE;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.initEncodeInternal():org.webrtc.VideoCodecStatus");
    }

    public VideoCodecStatus release() {
        VideoCodecStatus videoCodecStatus;
        EglBase14 eglBase14;
        Surface surface;
        this.encodeThreadChecker.checkIsOnValidThread();
        Thread thread = this.outputThread;
        if (thread != null) {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(thread, 5000)) {
                Logging.m29384e(TAG, "Media encoder release timeout");
                videoCodecStatus = VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                Logging.m29385e(TAG, "Media encoder release exception", this.shutdownException);
                videoCodecStatus = VideoCodecStatus.ERROR;
            }
            this.textureDrawer.release();
            this.videoFrameDrawer.release();
            eglBase14 = this.textureEglBase;
            if (eglBase14 != null) {
                eglBase14.release();
                this.textureEglBase = null;
            }
            surface = this.textureInputSurface;
            if (surface != null) {
                surface.release();
                this.textureInputSurface = null;
            }
            this.outputBuilders.clear();
            this.codec = null;
            this.outputThread = null;
            this.encodeThreadChecker.detachThread();
            return videoCodecStatus;
        }
        videoCodecStatus = VideoCodecStatus.OK;
        this.textureDrawer.release();
        this.videoFrameDrawer.release();
        eglBase14 = this.textureEglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.textureEglBase = null;
        }
        surface = this.textureInputSurface;
        if (surface != null) {
            surface.release();
            this.textureInputSurface = null;
        }
        this.outputBuilders.clear();
        this.codec = null;
        this.outputThread = null;
        this.encodeThreadChecker.detachThread();
        return videoCodecStatus;
    }

    public static void releaseCodecOnOutputThread(HardwareVideoEncoder hardwareVideoEncoder) {
        hardwareVideoEncoder.outputThreadChecker.checkIsOnValidThread();
        String str = TAG;
        Logging.m29383d(str, "Releasing MediaCodec on output thread");
        try {
            hardwareVideoEncoder.codec.stop();
        } catch (Throwable e) {
            Logging.m29385e(str, "Media encoder stop failed", e);
        }
        try {
            hardwareVideoEncoder.codec.release();
        } catch (Throwable e2) {
            Logging.m29385e(str, "Media encoder release failed", e2);
            hardwareVideoEncoder.shutdownException = e2;
        }
        hardwareVideoEncoder.configBuffer = null;
        Logging.m29383d(str, "Release on output thread done");
    }

    private void requestKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.codec.setParameters(bundle);
            this.lastKeyFrameNs = j;
        } catch (Throwable e) {
            Logging.m29385e(TAG, "requestKeyFrame failed", e);
        }
    }

    private VideoCodecStatus resetCodec(int i, int i2, boolean z) {
        this.encodeThreadChecker.checkIsOnValidThread();
        VideoCodecStatus release = release();
        if (release != VideoCodecStatus.OK) {
            return release;
        }
        this.width = i;
        this.height = i2;
        this.useSurfaceMode = z;
        return initEncodeInternal();
    }

    public VideoCodecStatus setChannelParameters(short s, long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        return VideoCodecStatus.OK;
    }

    public VideoCodecStatus setRateAllocation(BitrateAllocation bitrateAllocation, int i) {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (i > MAX_VIDEO_FRAMERATE) {
            i = MAX_VIDEO_FRAMERATE;
        }
        this.bitrateAdjuster.setTargets(bitrateAllocation.getSum(), i);
        return VideoCodecStatus.OK;
    }

    private boolean shouldForceKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long j2 = this.forcedKeyFrameNs;
        return j2 > 0 && j > this.lastKeyFrameNs + j2;
    }

    private VideoCodecStatus updateBitrate() {
        this.outputThreadChecker.checkIsOnValidThread();
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", this.adjustedBitrate);
            this.codec.setParameters(bundle);
            return VideoCodecStatus.OK;
        } catch (Throwable e) {
            Logging.m29385e(TAG, "updateBitrate failed", e);
            return VideoCodecStatus.ERROR;
        }
    }
}

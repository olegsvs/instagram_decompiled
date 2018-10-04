package org.webrtc;

import android.graphics.Matrix;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Surface;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.VideoFrame.Buffer;
import org.webrtc.VideoFrame.TextureBuffer;

public class MediaCodecVideoEncoder {
    private static final int BITRATE_ADJUSTMENT_FPS = 30;
    private static final double BITRATE_CORRECTION_MAX_SCALE = 4.0d;
    private static final double BITRATE_CORRECTION_SEC = 3.0d;
    private static final int BITRATE_CORRECTION_STEPS = 20;
    private static final int COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m = 2141391876;
    private static final int DEQUEUE_TIMEOUT = 0;
    private static final String[] H264_HW_EXCEPTION_MODELS = new String[]{"SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4"};
    private static final String H264_MIME_TYPE = "video/avc";
    private static final int MAXIMUM_INITIAL_FPS = 30;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final long QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_L_MS = 15000;
    private static final long QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS = 20000;
    private static final long QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_N_MS = 15000;
    private static final String TAG = "MediaCodecVideoEncoder";
    private static final int VIDEO_AVCLevel3 = 256;
    private static final int VIDEO_AVCProfileHigh = 8;
    private static final int VIDEO_ControlRateConstant = 2;
    private static final String VP8_MIME_TYPE = "video/x-vnd.on2.vp8";
    private static final String VP9_MIME_TYPE = "video/x-vnd.on2.vp9";
    private static int codecErrors;
    private static MediaCodecVideoEncoderErrorCallback errorCallback;
    private static final MediaCodecProperties exynosH264HighProfileHwProperties;
    private static final MediaCodecProperties exynosH264HwProperties;
    private static final MediaCodecProperties exynosVp8HwProperties = new MediaCodecProperties(MediaCodecUtils.EXYNOS_PREFIX, 23, BitrateAdjustmentType.DYNAMIC_ADJUSTMENT);
    private static final MediaCodecProperties exynosVp9HwProperties = new MediaCodecProperties(MediaCodecUtils.EXYNOS_PREFIX, 24, BitrateAdjustmentType.FRAMERATE_ADJUSTMENT);
    private static final MediaCodecProperties[] h264HighProfileHwList = new MediaCodecProperties[]{exynosH264HighProfileHwProperties};
    private static Set hwEncoderDisabledTypes = new HashSet();
    private static final MediaCodecProperties intelVp8HwProperties;
    private static final MediaCodecProperties mediatekH264HwProperties;
    private static final MediaCodecProperties qcomH264HwProperties = new MediaCodecProperties(MediaCodecUtils.QCOM_PREFIX, 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties qcomVp8HwProperties = new MediaCodecProperties(MediaCodecUtils.QCOM_PREFIX, 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties qcomVp9HwProperties;
    private static MediaCodecVideoEncoder runningInstance;
    private static final int[] supportedColorList = new int[]{19, 21, 2141391872, 2141391876};
    private static final int[] supportedSurfaceColorList = new int[]{2130708361};
    private static final MediaCodecProperties[] vp9HwList = new MediaCodecProperties[]{qcomVp9HwProperties, exynosVp9HwProperties};
    private double bitrateAccumulator;
    private double bitrateAccumulatorMax;
    private int bitrateAdjustmentScaleExp;
    private BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
    private double bitrateObservationTimeMs;
    private int colorFormat;
    private ByteBuffer configData = null;
    private GlRectDrawer drawer;
    private EglBase14 eglBase;
    private long forcedKeyFrameMs;
    private int height;
    private Surface inputSurface;
    private long lastKeyFrameMs;
    public MediaCodec mediaCodec;
    private Thread mediaCodecThread;
    private ByteBuffer[] outputBuffers;
    private int profile;
    private int targetBitrateBps;
    private int targetFps;
    private VideoCodecType type;
    private int width;

    public enum BitrateAdjustmentType {
        NO_ADJUSTMENT,
        FRAMERATE_ADJUSTMENT,
        DYNAMIC_ADJUSTMENT
    }

    public class EncoderProperties {
        public final BitrateAdjustmentType bitrateAdjustmentType;
        public final String codecName;
        public final int colorFormat;

        public EncoderProperties(String str, int i, BitrateAdjustmentType bitrateAdjustmentType) {
            this.codecName = str;
            this.colorFormat = i;
            this.bitrateAdjustmentType = bitrateAdjustmentType;
        }
    }

    public enum H264Profile {
        CONSTRAINED_BASELINE(0),
        BASELINE(1),
        MAIN(2),
        CONSTRAINED_HIGH(3),
        HIGH(4);
        
        private final int value;

        private H264Profile(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public class MediaCodecProperties {
        public final BitrateAdjustmentType bitrateAdjustmentType;
        public final String codecPrefix;
        public final int minSdk;

        public MediaCodecProperties(String str, int i, BitrateAdjustmentType bitrateAdjustmentType) {
            this.codecPrefix = str;
            this.minSdk = i;
            this.bitrateAdjustmentType = bitrateAdjustmentType;
        }
    }

    public interface MediaCodecVideoEncoderErrorCallback {
        void onMediaCodecVideoEncoderCriticalError(int i);
    }

    public class OutputBufferInfo {
        public final ByteBuffer buffer;
        public final int index;
        public final boolean isKeyFrame;
        public final long presentationTimestampUs;

        public OutputBufferInfo(int i, ByteBuffer byteBuffer, boolean z, long j) {
            this.index = i;
            this.buffer = byteBuffer;
            this.isKeyFrame = z;
            this.presentationTimestampUs = j;
        }

        public ByteBuffer getBuffer() {
            return this.buffer;
        }

        public int getIndex() {
            return this.index;
        }

        public long getPresentationTimestampUs() {
            return this.presentationTimestampUs;
        }

        public boolean isKeyFrame() {
            return this.isKeyFrame;
        }
    }

    public enum VideoCodecType {
        VIDEO_CODEC_VP8,
        VIDEO_CODEC_VP9,
        VIDEO_CODEC_H264;

        public static VideoCodecType fromNativeIndex(int i) {
            return values()[i];
        }
    }

    private static native void nativeFillInputBuffer(long j, int i, ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4);

    static {
        String str = MediaCodecUtils.INTEL_PREFIX;
        BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
        intelVp8HwProperties = new MediaCodecProperties(str, 21, bitrateAdjustmentType);
        qcomVp9HwProperties = new MediaCodecProperties(MediaCodecUtils.QCOM_PREFIX, 24, bitrateAdjustmentType);
        str = MediaCodecUtils.EXYNOS_PREFIX;
        BitrateAdjustmentType bitrateAdjustmentType2 = BitrateAdjustmentType.FRAMERATE_ADJUSTMENT;
        exynosH264HwProperties = new MediaCodecProperties(str, 21, bitrateAdjustmentType2);
        mediatekH264HwProperties = new MediaCodecProperties("OMX.MTK.", 27, bitrateAdjustmentType2);
        exynosH264HighProfileHwProperties = new MediaCodecProperties(MediaCodecUtils.EXYNOS_PREFIX, 23, bitrateAdjustmentType2);
    }

    public void checkKeyFrameRequired(boolean z, long j) {
        Object obj;
        Bundle bundle;
        j = (j + 500) / 1000;
        if (this.lastKeyFrameMs < 0) {
            this.lastKeyFrameMs = j;
        }
        if (!z) {
            long j2 = this.forcedKeyFrameMs;
            if (j2 > 0 && j > this.lastKeyFrameMs + j2) {
                obj = 1;
                if (z || r0 != null) {
                    if (z) {
                        Logging.m29383d(TAG, "Sync frame forced");
                    } else {
                        Logging.m29383d(TAG, "Sync frame request");
                    }
                    bundle = new Bundle();
                    bundle.putInt("request-sync", 0);
                    this.mediaCodec.setParameters(bundle);
                    this.lastKeyFrameMs = j;
                }
                return;
            }
        }
        obj = null;
        if (!z) {
        }
        if (z) {
            Logging.m29383d(TAG, "Sync frame forced");
        } else {
            Logging.m29383d(TAG, "Sync frame request");
        }
        bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.mediaCodec.setParameters(bundle);
        this.lastKeyFrameMs = j;
    }

    private void checkOnMediaCodecThread() {
        if (this.mediaCodecThread.getId() != Thread.currentThread().getId()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MediaCodecVideoEncoder previously operated on ");
            stringBuilder.append(this.mediaCodecThread);
            stringBuilder.append(" but is now called on ");
            stringBuilder.append(Thread.currentThread());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static android.media.MediaCodec createByCodecName(java.lang.String r0) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = android.media.MediaCodec.createByCodecName(r0);	 Catch:{ Exception -> 0x0005 }
        return r0;	 Catch:{ Exception -> 0x0005 }
    L_0x0005:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.MediaCodecVideoEncoder.createByCodecName(java.lang.String):android.media.MediaCodec");
    }

    public int dequeueInputBuffer() {
        checkOnMediaCodecThread();
        try {
            return this.mediaCodec.dequeueInputBuffer(0);
        } catch (Throwable e) {
            Logging.m29385e(TAG, "dequeueIntputBuffer failed", e);
            return -2;
        }
    }

    public OutputBufferInfo dequeueOutputBuffer() {
        checkOnMediaCodecThread();
        try {
            BufferInfo bufferInfo = new BufferInfo();
            int dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, 0);
            boolean z = true;
            if (dequeueOutputBuffer >= 0) {
                if (((bufferInfo.flags & 2) != 0 ? 1 : null) != null) {
                    String str = TAG;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Config frame generated. Offset: ");
                    stringBuilder.append(bufferInfo.offset);
                    stringBuilder.append(". Size: ");
                    stringBuilder.append(bufferInfo.size);
                    Logging.m29383d(str, stringBuilder.toString());
                    this.configData = ByteBuffer.allocateDirect(bufferInfo.size);
                    this.outputBuffers[dequeueOutputBuffer].position(bufferInfo.offset);
                    this.outputBuffers[dequeueOutputBuffer].limit(bufferInfo.offset + bufferInfo.size);
                    this.configData.put(this.outputBuffers[dequeueOutputBuffer]);
                    String str2 = JsonProperty.USE_DEFAULT_NAME;
                    int i = 0;
                    while (true) {
                        int i2 = 8;
                        if (bufferInfo.size < 8) {
                            i2 = bufferInfo.size;
                        }
                        if (i >= i2) {
                            break;
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(str2);
                        stringBuilder.append(Integer.toHexString(this.configData.get(i) & 255));
                        stringBuilder.append(" ");
                        str2 = stringBuilder.toString();
                        i++;
                    }
                    Logging.m29383d(TAG, str2);
                    this.mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                    dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, 0);
                }
            }
            StringBuilder stringBuilder2;
            if (dequeueOutputBuffer >= 0) {
                OutputBufferInfo outputBufferInfo;
                ByteBuffer duplicate = this.outputBuffers[dequeueOutputBuffer].duplicate();
                duplicate.position(bufferInfo.offset);
                duplicate.limit(bufferInfo.offset + bufferInfo.size);
                reportEncodedFrame(bufferInfo.size);
                if ((bufferInfo.flags & 1) == 0) {
                    z = false;
                }
                if (z) {
                    Logging.m29383d(TAG, "Sync frame generated");
                }
                if (z && this.type == VideoCodecType.VIDEO_CODEC_H264) {
                    String str3 = TAG;
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Appending config frame of size ");
                    stringBuilder2.append(this.configData.capacity());
                    stringBuilder2.append(" to output buffer with offset ");
                    stringBuilder2.append(bufferInfo.offset);
                    stringBuilder2.append(", size ");
                    stringBuilder2.append(bufferInfo.size);
                    Logging.m29383d(str3, stringBuilder2.toString());
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.configData.capacity() + bufferInfo.size);
                    this.configData.rewind();
                    allocateDirect.put(this.configData);
                    allocateDirect.put(duplicate);
                    allocateDirect.position(0);
                    outputBufferInfo = new OutputBufferInfo(dequeueOutputBuffer, allocateDirect, z, bufferInfo.presentationTimeUs);
                } else {
                    outputBufferInfo = new OutputBufferInfo(dequeueOutputBuffer, duplicate.slice(), z, bufferInfo.presentationTimeUs);
                }
                return outputBufferInfo;
            } else if (dequeueOutputBuffer == -3) {
                this.outputBuffers = this.mediaCodec.getOutputBuffers();
                return dequeueOutputBuffer();
            } else if (dequeueOutputBuffer == -2) {
                return dequeueOutputBuffer();
            } else {
                if (dequeueOutputBuffer == -1) {
                    return null;
                }
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("dequeueOutputBuffer: ");
                stringBuilder2.append(dequeueOutputBuffer);
                throw new RuntimeException(stringBuilder2.toString());
            }
        } catch (Throwable e) {
            Logging.m29385e(TAG, "dequeueOutputBuffer failed", e);
            return new OutputBufferInfo(-1, null, false, -1);
        }
    }

    public static void disableH264HwCodec() {
        Logging.m29387w(TAG, "H.264 encoding is disabled by application.");
        hwEncoderDisabledTypes.add(H264_MIME_TYPE);
    }

    public static void disableVp8HwCodec() {
        Logging.m29387w(TAG, "VP8 encoding is disabled by application.");
        hwEncoderDisabledTypes.add(VP8_MIME_TYPE);
    }

    public static void disableVp9HwCodec() {
        Logging.m29387w(TAG, "VP9 encoding is disabled by application.");
        hwEncoderDisabledTypes.add(VP9_MIME_TYPE);
    }

    public boolean encodeBuffer(boolean z, int i, int i2, long j) {
        checkOnMediaCodecThread();
        try {
            long j2 = j;
            checkKeyFrameRequired(z, j);
            this.mediaCodec.queueInputBuffer(i, 0, i2, j2, 0);
            return true;
        } catch (Throwable e) {
            Logging.m29385e(TAG, "encodeBuffer failed", e);
            return false;
        }
    }

    public boolean encodeFrame(long j, boolean z, VideoFrame videoFrame, int i, long j2) {
        checkOnMediaCodecThread();
        try {
            long j3 = j2;
            checkKeyFrameRequired(z, j3);
            Buffer buffer = videoFrame.getBuffer();
            if (buffer instanceof TextureBuffer) {
                TextureBuffer textureBuffer = (TextureBuffer) buffer;
                r0.eglBase.makeCurrent();
                GLES20.glClear(16384);
                VideoFrameDrawer.drawTexture(r0.drawer, textureBuffer, new Matrix(), r0.width, r0.height, 0, 0, r0.width, r0.height);
                r0.eglBase.swapBuffers(TimeUnit.MICROSECONDS.toNanos(j3));
            } else {
                RuntimeException runtimeException;
                Buffer toI420 = buffer.toI420();
                int i2 = (r0.height + 1) / 2;
                ByteBuffer dataY = toI420.getDataY();
                ByteBuffer dataU = toI420.getDataU();
                ByteBuffer dataV = toI420.getDataV();
                int strideY = toI420.getStrideY();
                int strideU = toI420.getStrideU();
                int strideV = toI420.getStrideV();
                if (dataY.capacity() < r0.height * strideY) {
                    runtimeException = new RuntimeException("Y-plane buffer size too small.");
                } else if (dataU.capacity() < strideU * i2) {
                    runtimeException = new RuntimeException("U-plane buffer size too small.");
                } else if (dataV.capacity() >= i2 * strideV) {
                    int i3 = i;
                    nativeFillInputBuffer(j, i3, dataY, strideY, dataU, strideU, dataV, strideV);
                    toI420.release();
                    r0.mediaCodec.queueInputBuffer(i3, 0, ((r0.width * r0.height) * 3) / 2, j3, 0);
                } else {
                    runtimeException = new RuntimeException("V-plane buffer size too small.");
                }
                throw runtimeException;
            }
            return true;
        } catch (Throwable e) {
            Logging.m29385e(TAG, "encodeFrame failed", e);
            return false;
        }
    }

    private static EncoderProperties findHwEncoder(String str, MediaCodecProperties[] mediaCodecPropertiesArr, int[] iArr) {
        if (VERSION.SDK_INT >= 19) {
            String str2;
            StringBuilder stringBuilder;
            if (str.equals(H264_MIME_TYPE)) {
                List asList = Arrays.asList(H264_HW_EXCEPTION_MODELS);
                String str3 = Build.MODEL;
                if (asList.contains(str3)) {
                    str2 = TAG;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Model: ");
                    stringBuilder.append(str3);
                    stringBuilder.append(" has black listed H.264 encoder.");
                    Logging.m29387w(str2, stringBuilder.toString());
                    return null;
                }
            }
            for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
                MediaCodecInfo codecInfoAt;
                try {
                    codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                } catch (Throwable e) {
                    Logging.m29385e(TAG, "Cannot retrieve encoder codec info", e);
                    codecInfoAt = null;
                }
                if (codecInfoAt != null) {
                    if (codecInfoAt.isEncoder()) {
                        String name;
                        for (String equals : codecInfoAt.getSupportedTypes()) {
                            if (equals.equals(str)) {
                                name = codecInfoAt.getName();
                                break;
                            }
                        }
                        name = null;
                        if (name != null) {
                            int i2;
                            Object obj;
                            CodecCapabilities capabilitiesForType;
                            str2 = TAG;
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Found candidate encoder ");
                            stringBuilder.append(name);
                            Logging.m29386v(str2, stringBuilder.toString());
                            BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
                            for (MediaCodecProperties mediaCodecProperties : mediaCodecPropertiesArr) {
                                if (name.startsWith(mediaCodecProperties.codecPrefix)) {
                                    if (VERSION.SDK_INT < mediaCodecProperties.minSdk) {
                                        str2 = TAG;
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append("Codec ");
                                        stringBuilder.append(name);
                                        stringBuilder.append(" is disabled due to SDK version ");
                                        stringBuilder.append(VERSION.SDK_INT);
                                        Logging.m29387w(str2, stringBuilder.toString());
                                    } else {
                                        if (mediaCodecProperties.bitrateAdjustmentType != bitrateAdjustmentType) {
                                            bitrateAdjustmentType = mediaCodecProperties.bitrateAdjustmentType;
                                            str2 = TAG;
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append("Codec ");
                                            stringBuilder.append(name);
                                            stringBuilder.append(" requires bitrate adjustment: ");
                                            stringBuilder.append(bitrateAdjustmentType);
                                            Logging.m29387w(str2, stringBuilder.toString());
                                        }
                                        obj = 1;
                                        if (obj == null) {
                                            try {
                                                capabilitiesForType = codecInfoAt.getCapabilitiesForType(str);
                                                for (int i3 : capabilitiesForType.colorFormats) {
                                                    str2 = TAG;
                                                    stringBuilder = new StringBuilder();
                                                    stringBuilder.append("   Color: 0x");
                                                    stringBuilder.append(Integer.toHexString(i3));
                                                    Logging.m29386v(str2, stringBuilder.toString());
                                                }
                                                for (int i22 : iArr) {
                                                    for (int i32 : capabilitiesForType.colorFormats) {
                                                        if (i32 != i22) {
                                                            str2 = TAG;
                                                            stringBuilder = new StringBuilder();
                                                            stringBuilder.append("Found target encoder for mime ");
                                                            stringBuilder.append(str);
                                                            stringBuilder.append(" : ");
                                                            stringBuilder.append(name);
                                                            stringBuilder.append(". Color: 0x");
                                                            stringBuilder.append(Integer.toHexString(i32));
                                                            stringBuilder.append(". Bitrate adjustment: ");
                                                            stringBuilder.append(bitrateAdjustmentType);
                                                            Logging.m29383d(str2, stringBuilder.toString());
                                                            return new EncoderProperties(name, i32, bitrateAdjustmentType);
                                                        }
                                                    }
                                                }
                                                continue;
                                            } catch (Throwable e2) {
                                                Logging.m29385e(TAG, "Cannot retrieve encoder capabilities", e2);
                                            }
                                        }
                                    }
                                }
                            }
                            obj = null;
                            if (obj == null) {
                                capabilitiesForType = codecInfoAt.getCapabilitiesForType(str);
                                for (i22 = 0; i22 < r7; i22++) {
                                    str2 = TAG;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("   Color: 0x");
                                    stringBuilder.append(Integer.toHexString(i32));
                                    Logging.m29386v(str2, stringBuilder.toString());
                                }
                                for (int i222 : iArr) {
                                    while (r0 < r1) {
                                        if (i32 != i222) {
                                        } else {
                                            str2 = TAG;
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append("Found target encoder for mime ");
                                            stringBuilder.append(str);
                                            stringBuilder.append(" : ");
                                            stringBuilder.append(name);
                                            stringBuilder.append(". Color: 0x");
                                            stringBuilder.append(Integer.toHexString(i32));
                                            stringBuilder.append(". Bitrate adjustment: ");
                                            stringBuilder.append(bitrateAdjustmentType);
                                            Logging.m29383d(str2, stringBuilder.toString());
                                            return new EncoderProperties(name, i32, bitrateAdjustmentType);
                                        }
                                    }
                                }
                                continue;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    private double getBitrateScale(int i) {
        double d = (double) i;
        Double.isNaN(d);
        return Math.pow(BITRATE_CORRECTION_MAX_SCALE, d / 20.0d);
    }

    public int getColorFormat() {
        return this.colorFormat;
    }

    public ByteBuffer[] getInputBuffers() {
        ByteBuffer[] inputBuffers = this.mediaCodec.getInputBuffers();
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Input buffers: ");
        stringBuilder.append(inputBuffers.length);
        Logging.m29383d(str, stringBuilder.toString());
        return inputBuffers;
    }

    private static final MediaCodecProperties[] h264HwList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(qcomH264HwProperties);
        arrayList.add(exynosH264HwProperties);
        if (PeerConnectionFactory.fieldTrialsFindFullName("WebRTC-MediaTekH264").equals(PeerConnectionFactory.TRIAL_ENABLED)) {
            arrayList.add(mediatekH264HwProperties);
        }
        return (MediaCodecProperties[]) arrayList.toArray(new MediaCodecProperties[arrayList.size()]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean initEncode(org.webrtc.MediaCodecVideoEncoder.VideoCodecType r15, int r16, int r17, int r18, int r19, int r20, org.webrtc.EglBase14.Context r21) {
        /*
        r14 = this;
        r10 = r21;
        if (r21 == 0) goto L_0x0006;
    L_0x0004:
        r4 = 1;
        goto L_0x0007;
    L_0x0006:
        r4 = 0;
    L_0x0007:
        r1 = "MediaCodecVideoEncoder";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = "Java initEncode: ";
        r2.append(r0);
        r2.append(r15);
        r0 = ". Profile: ";
        r2.append(r0);
        r5 = r16;
        r2.append(r5);
        r0 = " : ";
        r2.append(r0);
        r8 = r17;
        r2.append(r8);
        r0 = " x ";
        r2.append(r0);
        r7 = r18;
        r2.append(r7);
        r0 = ". @ ";
        r2.append(r0);
        r9 = r19;
        r2.append(r9);
        r0 = " kbps. Fps: ";
        r2.append(r0);
        r11 = r20;
        r2.append(r11);
        r0 = ". Encode from texture : ";
        r2.append(r0);
        r2.append(r4);
        r0 = r2.toString();
        org.webrtc.Logging.m29383d(r1, r0);
        r14.profile = r5;
        r14.width = r8;
        r14.height = r7;
        r0 = r14.mediaCodecThread;
        if (r0 != 0) goto L_0x0239;
    L_0x0061:
        r0 = org.webrtc.MediaCodecVideoEncoder.VideoCodecType.VIDEO_CODEC_VP8;
        r6 = 100;
        if (r15 != r0) goto L_0x0079;
    L_0x0067:
        r3 = "video/x-vnd.on2.vp8";
        r1 = vp8HwList();
        if (r4 == 0) goto L_0x0072;
    L_0x006f:
        r0 = supportedSurfaceColorList;
        goto L_0x0074;
    L_0x0072:
        r0 = supportedColorList;
    L_0x0074:
        r2 = findHwEncoder(r3, r1, r0);
        goto L_0x00c7;
    L_0x0079:
        r0 = org.webrtc.MediaCodecVideoEncoder.VideoCodecType.VIDEO_CODEC_VP9;
        if (r15 != r0) goto L_0x0084;
    L_0x007d:
        r3 = "video/x-vnd.on2.vp9";
        r1 = vp9HwList;
        if (r4 == 0) goto L_0x0072;
    L_0x0083:
        goto L_0x006f;
    L_0x0084:
        r0 = org.webrtc.MediaCodecVideoEncoder.VideoCodecType.VIDEO_CODEC_H264;
        if (r15 != r0) goto L_0x00c4;
    L_0x0088:
        r3 = "video/avc";
        r1 = h264HwList();
        if (r4 == 0) goto L_0x0093;
    L_0x0090:
        r0 = supportedSurfaceColorList;
        goto L_0x0095;
    L_0x0093:
        r0 = supportedColorList;
    L_0x0095:
        r2 = findHwEncoder(r3, r1, r0);
        r0 = org.webrtc.MediaCodecVideoEncoder.H264Profile.CONSTRAINED_HIGH;
        r0 = r0.getValue();
        if (r5 != r0) goto L_0x00c0;
    L_0x00a1:
        r1 = h264HighProfileHwList;
        if (r4 == 0) goto L_0x00a8;
    L_0x00a5:
        r0 = supportedSurfaceColorList;
        goto L_0x00aa;
    L_0x00a8:
        r0 = supportedColorList;
    L_0x00aa:
        r0 = findHwEncoder(r3, r1, r0);
        if (r0 == 0) goto L_0x00b9;
    L_0x00b0:
        r1 = "MediaCodecVideoEncoder";
        r0 = "High profile H.264 encoder supported.";
        org.webrtc.Logging.m29383d(r1, r0);
        r13 = 1;
        goto L_0x00c1;
    L_0x00b9:
        r1 = "MediaCodecVideoEncoder";
        r0 = "High profile H.264 encoder requested, but not supported. Use baseline.";
        org.webrtc.Logging.m29383d(r1, r0);
    L_0x00c0:
        r13 = 0;
    L_0x00c1:
        r6 = 20;
        goto L_0x00c8;
    L_0x00c4:
        r3 = 0;
        r2 = 0;
        r6 = 0;
    L_0x00c7:
        r13 = 0;
    L_0x00c8:
        if (r2 == 0) goto L_0x0222;
    L_0x00ca:
        runningInstance = r14;
        r0 = r2.colorFormat;
        r14.colorFormat = r0;
        r1 = r2.bitrateAdjustmentType;
        r14.bitrateAdjustmentType = r1;
        r0 = org.webrtc.MediaCodecVideoEncoder.BitrateAdjustmentType.FRAMERATE_ADJUSTMENT;
        r5 = 30;
        if (r1 != r0) goto L_0x00db;
    L_0x00da:
        goto L_0x00df;
    L_0x00db:
        r5 = java.lang.Math.min(r11, r5);
    L_0x00df:
        r0 = 0;
        r14.forcedKeyFrameMs = r0;
        r0 = -1;
        r14.lastKeyFrameMs = r0;
        r0 = org.webrtc.MediaCodecVideoEncoder.VideoCodecType.VIDEO_CODEC_VP8;
        if (r15 != r0) goto L_0x0111;
    L_0x00eb:
        r1 = r2.codecName;
        r0 = qcomVp8HwProperties;
        r0 = r0.codecPrefix;
        r0 = r1.startsWith(r0);
        if (r0 == 0) goto L_0x0111;
    L_0x00f7:
        r12 = android.os.Build.VERSION.SDK_INT;
        r11 = 21;
        r0 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;
        if (r12 == r11) goto L_0x010f;
    L_0x00ff:
        r11 = 22;
        if (r12 != r11) goto L_0x0104;
    L_0x0103:
        goto L_0x010f;
    L_0x0104:
        r11 = 23;
        if (r12 != r11) goto L_0x010d;
    L_0x0108:
        r0 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;
        r14.forcedKeyFrameMs = r0;
        goto L_0x0111;
    L_0x010d:
        if (r12 <= r11) goto L_0x0111;
    L_0x010f:
        r14.forcedKeyFrameMs = r0;
    L_0x0111:
        r11 = "MediaCodecVideoEncoder";
        r12 = new java.lang.StringBuilder;
        r12.<init>();
        r0 = "Color format: ";
        r12.append(r0);
        r0 = r14.colorFormat;
        r12.append(r0);
        r0 = ". Bitrate adjustment: ";
        r12.append(r0);
        r0 = r14.bitrateAdjustmentType;
        r12.append(r0);
        r0 = ". Key frame interval: ";
        r12.append(r0);
        r0 = r14.forcedKeyFrameMs;
        r12.append(r0);
        r0 = " . Initial fps: ";
        r12.append(r0);
        r12.append(r5);
        r0 = r12.toString();
        org.webrtc.Logging.m29383d(r11, r0);
        r0 = r9 * 1000;
        r14.targetBitrateBps = r0;
        r14.targetFps = r5;
        r0 = r14.targetBitrateBps;
        r0 = (double) r0;
        r11 = 4620693217682128896; // 0x4020000000000000 float:0.0 double:8.0;
        java.lang.Double.isNaN(r0);
        r0 = r0 / r11;
        r14.bitrateAccumulatorMax = r0;
        r0 = 0;
        r14.bitrateAccumulator = r0;
        r14.bitrateObservationTimeMs = r0;
        r0 = 0;
        r14.bitrateAdjustmentScaleExp = r0;
        r0 = java.lang.Thread.currentThread();
        r14.mediaCodecThread = r0;
        r3 = android.media.MediaFormat.createVideoFormat(r3, r8, r7);	 Catch:{ IllegalStateException -> 0x0215 }
        r1 = "bitrate";
        r0 = r14.targetBitrateBps;	 Catch:{ IllegalStateException -> 0x0215 }
        r3.setInteger(r1, r0);	 Catch:{ IllegalStateException -> 0x0215 }
        r1 = "bitrate-mode";
        r0 = 2;
        r3.setInteger(r1, r0);	 Catch:{ IllegalStateException -> 0x0215 }
        r1 = "color-format";
        r0 = r2.colorFormat;	 Catch:{ IllegalStateException -> 0x0215 }
        r3.setInteger(r1, r0);	 Catch:{ IllegalStateException -> 0x0215 }
        r1 = "frame-rate";
        r0 = r14.targetFps;	 Catch:{ IllegalStateException -> 0x0215 }
        r3.setInteger(r1, r0);	 Catch:{ IllegalStateException -> 0x0215 }
        r0 = "i-frame-interval";
        r3.setInteger(r0, r6);	 Catch:{ IllegalStateException -> 0x0215 }
        if (r13 == 0) goto L_0x0199;
    L_0x018b:
        r1 = "profile";
        r0 = 8;
        r3.setInteger(r1, r0);	 Catch:{ IllegalStateException -> 0x0215 }
        r1 = "level";
        r0 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r3.setInteger(r1, r0);	 Catch:{ IllegalStateException -> 0x0215 }
    L_0x0199:
        r5 = "MediaCodecVideoEncoder";
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0215 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0215 }
        r0 = "  Format: ";
        r1.append(r0);	 Catch:{ IllegalStateException -> 0x0215 }
        r1.append(r3);	 Catch:{ IllegalStateException -> 0x0215 }
        r0 = r1.toString();	 Catch:{ IllegalStateException -> 0x0215 }
        org.webrtc.Logging.m29383d(r5, r0);	 Catch:{ IllegalStateException -> 0x0215 }
        r0 = r2.codecName;	 Catch:{ IllegalStateException -> 0x0215 }
        r0 = createByCodecName(r0);	 Catch:{ IllegalStateException -> 0x0215 }
        r14.mediaCodec = r0;	 Catch:{ IllegalStateException -> 0x0215 }
        r14.type = r15;	 Catch:{ IllegalStateException -> 0x0215 }
        r0 = r14.mediaCodec;	 Catch:{ IllegalStateException -> 0x0215 }
        if (r0 != 0) goto L_0x01c7;
    L_0x01bd:
        r0 = "Can not create media encoder";
        org.webrtc.Logging.m29384e(r5, r0);	 Catch:{ IllegalStateException -> 0x0215 }
        r14.release();	 Catch:{ IllegalStateException -> 0x0215 }
        r0 = 0;
        return r0;
    L_0x01c7:
        r2 = r14.mediaCodec;	 Catch:{ IllegalStateException -> 0x0215 }
        r1 = 1;
        r0 = 0;
        r2.configure(r3, r0, r0, r1);	 Catch:{ IllegalStateException -> 0x0215 }
        if (r4 == 0) goto L_0x01ef;
    L_0x01d0:
        r1 = new org.webrtc.EglBase14;	 Catch:{ IllegalStateException -> 0x0215 }
        r0 = org.webrtc.EglBase.CONFIG_RECORDABLE;	 Catch:{ IllegalStateException -> 0x0215 }
        r1.<init>(r10, r0);	 Catch:{ IllegalStateException -> 0x0215 }
        r14.eglBase = r1;	 Catch:{ IllegalStateException -> 0x0215 }
        r0 = r14.mediaCodec;	 Catch:{ IllegalStateException -> 0x0215 }
        r0 = r0.createInputSurface();	 Catch:{ IllegalStateException -> 0x0215 }
        r14.inputSurface = r0;	 Catch:{ IllegalStateException -> 0x0215 }
        r1 = r14.eglBase;	 Catch:{ IllegalStateException -> 0x0215 }
        r0 = r14.inputSurface;	 Catch:{ IllegalStateException -> 0x0215 }
        r1.createSurface(r0);	 Catch:{ IllegalStateException -> 0x0215 }
        r0 = new org.webrtc.GlRectDrawer;	 Catch:{ IllegalStateException -> 0x0215 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x0215 }
        r14.drawer = r0;	 Catch:{ IllegalStateException -> 0x0215 }
    L_0x01ef:
        r0 = r14.mediaCodec;	 Catch:{ IllegalStateException -> 0x0215 }
        r0.start();	 Catch:{ IllegalStateException -> 0x0215 }
        r0 = r14.mediaCodec;	 Catch:{ IllegalStateException -> 0x0215 }
        r0 = r0.getOutputBuffers();	 Catch:{ IllegalStateException -> 0x0215 }
        r14.outputBuffers = r0;	 Catch:{ IllegalStateException -> 0x0215 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0215 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0215 }
        r0 = "Output buffers: ";
        r1.append(r0);	 Catch:{ IllegalStateException -> 0x0215 }
        r0 = r14.outputBuffers;	 Catch:{ IllegalStateException -> 0x0215 }
        r0 = r0.length;	 Catch:{ IllegalStateException -> 0x0215 }
        r1.append(r0);	 Catch:{ IllegalStateException -> 0x0215 }
        r0 = r1.toString();	 Catch:{ IllegalStateException -> 0x0215 }
        org.webrtc.Logging.m29383d(r5, r0);	 Catch:{ IllegalStateException -> 0x0215 }
        r0 = 1;
        return r0;
    L_0x0215:
        r2 = move-exception;
        r1 = "MediaCodecVideoEncoder";
        r0 = "initEncode failed";
        org.webrtc.Logging.m29385e(r1, r0, r2);
        r14.release();
        r0 = 0;
        return r0;
    L_0x0222:
        r2 = new java.lang.RuntimeException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Can not find HW encoder for ";
        r1.append(r0);
        r1.append(r15);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
    L_0x0239:
        r1 = new java.lang.RuntimeException;
        r0 = "Forgot to release()?";
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.MediaCodecVideoEncoder.initEncode(org.webrtc.MediaCodecVideoEncoder$VideoCodecType, int, int, int, int, int, org.webrtc.EglBase14$Context):boolean");
    }

    public static boolean isH264HighProfileHwSupported() {
        return (hwEncoderDisabledTypes.contains(H264_MIME_TYPE) || findHwEncoder(H264_MIME_TYPE, h264HighProfileHwList, supportedColorList) == null) ? false : true;
    }

    public static boolean isH264HwSupported() {
        return (hwEncoderDisabledTypes.contains(H264_MIME_TYPE) || findHwEncoder(H264_MIME_TYPE, h264HwList(), supportedColorList) == null) ? false : true;
    }

    public static boolean isH264HwSupportedUsingTextures() {
        return (hwEncoderDisabledTypes.contains(H264_MIME_TYPE) || findHwEncoder(H264_MIME_TYPE, h264HwList(), supportedSurfaceColorList) == null) ? false : true;
    }

    public static boolean isTextureBuffer(Buffer buffer) {
        return buffer instanceof TextureBuffer;
    }

    public static boolean isVp8HwSupported() {
        return (hwEncoderDisabledTypes.contains(VP8_MIME_TYPE) || findHwEncoder(VP8_MIME_TYPE, vp8HwList(), supportedColorList) == null) ? false : true;
    }

    public static boolean isVp8HwSupportedUsingTextures() {
        return (hwEncoderDisabledTypes.contains(VP8_MIME_TYPE) || findHwEncoder(VP8_MIME_TYPE, vp8HwList(), supportedSurfaceColorList) == null) ? false : true;
    }

    public static boolean isVp9HwSupported() {
        return (hwEncoderDisabledTypes.contains(VP9_MIME_TYPE) || findHwEncoder(VP9_MIME_TYPE, vp9HwList, supportedColorList) == null) ? false : true;
    }

    public static boolean isVp9HwSupportedUsingTextures() {
        return (hwEncoderDisabledTypes.contains(VP9_MIME_TYPE) || findHwEncoder(VP9_MIME_TYPE, vp9HwList, supportedSurfaceColorList) == null) ? false : true;
    }

    public static void printStackTrace() {
        MediaCodecVideoEncoder mediaCodecVideoEncoder = runningInstance;
        if (mediaCodecVideoEncoder != null) {
            Thread thread = mediaCodecVideoEncoder.mediaCodecThread;
            if (thread != null) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace.length > 0) {
                    String str = TAG;
                    Logging.m29383d(str, "MediaCodecVideoEncoder stacks trace:");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        Logging.m29383d(str, stackTraceElement.toString());
                    }
                }
            }
        }
    }

    public void release() {
        Logging.m29383d(TAG, "Java releaseEncoder");
        checkOnMediaCodecThread();
        final AnonymousClass1CaughtException anonymousClass1CaughtException = new Object() {
            /* renamed from: e */
            public Exception f72851e;
        };
        Object obj = null;
        if (this.mediaCodec != null) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new Runnable() {
                public void run() {
                    String str = MediaCodecVideoEncoder.TAG;
                    Logging.m29383d(str, "Java releaseEncoder on release thread");
                    try {
                        MediaCodecVideoEncoder.this.mediaCodec.stop();
                    } catch (Throwable e) {
                        Logging.m29385e(str, "Media encoder stop failed", e);
                    }
                    try {
                        MediaCodecVideoEncoder.this.mediaCodec.release();
                    } catch (Throwable e2) {
                        Logging.m29385e(str, "Media encoder release failed", e2);
                        anonymousClass1CaughtException.f72851e = e2;
                    }
                    Logging.m29383d(str, "Java releaseEncoder on release thread done");
                    countDownLatch.countDown();
                }
            }).start();
            if (!ThreadUtils.awaitUninterruptibly(countDownLatch, 5000)) {
                Logging.m29384e(TAG, "Media encoder release timeout");
                obj = 1;
            }
            this.mediaCodec = null;
        }
        this.mediaCodecThread = null;
        GlRectDrawer glRectDrawer = this.drawer;
        if (glRectDrawer != null) {
            glRectDrawer.release();
            this.drawer = null;
        }
        EglBase14 eglBase14 = this.eglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.eglBase = null;
        }
        Surface surface = this.inputSurface;
        if (surface != null) {
            surface.release();
            this.inputSurface = null;
        }
        runningInstance = null;
        if (obj != null) {
            codecErrors++;
            if (errorCallback != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invoke codec error callback. Errors: ");
                stringBuilder.append(codecErrors);
                Logging.m29384e(TAG, stringBuilder.toString());
                errorCallback.onMediaCodecVideoEncoderCriticalError(codecErrors);
            }
            throw new RuntimeException("Media encoder release timeout.");
        } else if (anonymousClass1CaughtException.f72851e == null) {
            Logging.m29383d(TAG, "Java releaseEncoder done");
        } else {
            RuntimeException runtimeException = new RuntimeException(anonymousClass1CaughtException.f72851e);
            runtimeException.setStackTrace(ThreadUtils.concatStackTraces(anonymousClass1CaughtException.f72851e.getStackTrace(), runtimeException.getStackTrace()));
            throw runtimeException;
        }
    }

    public boolean releaseOutputBuffer(int i) {
        checkOnMediaCodecThread();
        try {
            this.mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } catch (Throwable e) {
            Logging.m29385e(TAG, "releaseOutputBuffer failed", e);
            return false;
        }
    }

    private void reportEncodedFrame(int i) {
        if (this.targetFps == 0) {
            return;
        }
        if (this.bitrateAdjustmentType == BitrateAdjustmentType.DYNAMIC_ADJUSTMENT) {
            double d = (double) this.targetBitrateBps;
            int i2 = this.targetFps;
            double d2 = (double) i2;
            Double.isNaN(d2);
            d2 *= 8.0d;
            Double.isNaN(d);
            d /= d2;
            double d3 = this.bitrateAccumulator;
            d2 = (double) i;
            Double.isNaN(d2);
            this.bitrateAccumulator = d3 + (d2 - d);
            d = this.bitrateObservationTimeMs;
            d2 = (double) i2;
            Double.isNaN(d2);
            this.bitrateObservationTimeMs = d + (1000.0d / d2);
            d = this.bitrateAccumulatorMax * BITRATE_CORRECTION_SEC;
            d3 = Math.min(this.bitrateAccumulator, d);
            this.bitrateAccumulator = d3;
            this.bitrateAccumulator = Math.max(d3, -d);
            if (this.bitrateObservationTimeMs > 3000.0d) {
                String str = TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Acc: ");
                stringBuilder.append((int) this.bitrateAccumulator);
                stringBuilder.append(". Max: ");
                stringBuilder.append((int) this.bitrateAccumulatorMax);
                stringBuilder.append(". ExpScale: ");
                stringBuilder.append(this.bitrateAdjustmentScaleExp);
                Logging.m29383d(str, stringBuilder.toString());
                d = this.bitrateAccumulator;
                d3 = this.bitrateAccumulatorMax;
                Object obj = 1;
                if (d > d3) {
                    this.bitrateAdjustmentScaleExp -= (int) ((d / d3) + 0.5d);
                    this.bitrateAccumulator = d3;
                } else if (d < (-d3)) {
                    this.bitrateAdjustmentScaleExp += (int) (((-d) / d3) + 0.5d);
                    this.bitrateAccumulator = -d3;
                } else {
                    obj = null;
                }
                if (obj != null) {
                    int min = Math.min(this.bitrateAdjustmentScaleExp, 20);
                    this.bitrateAdjustmentScaleExp = min;
                    this.bitrateAdjustmentScaleExp = Math.max(min, -20);
                    str = TAG;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Adjusting bitrate scale to ");
                    stringBuilder.append(this.bitrateAdjustmentScaleExp);
                    stringBuilder.append(". Value: ");
                    stringBuilder.append(getBitrateScale(this.bitrateAdjustmentScaleExp));
                    Logging.m29383d(str, stringBuilder.toString());
                    setRates(this.targetBitrateBps / JsonMappingException.MAX_REFS_TO_LIST, this.targetFps);
                }
                this.bitrateObservationTimeMs = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
            }
        }
    }

    public static void setErrorCallback(MediaCodecVideoEncoderErrorCallback mediaCodecVideoEncoderErrorCallback) {
        Logging.m29383d(TAG, "Set error callback");
        errorCallback = mediaCodecVideoEncoderErrorCallback;
    }

    private boolean setRates(int i, int i2) {
        double d;
        checkOnMediaCodecThread();
        int i3 = i * JsonMappingException.MAX_REFS_TO_LIST;
        if (this.bitrateAdjustmentType == BitrateAdjustmentType.DYNAMIC_ADJUSTMENT) {
            d = (double) i3;
            Double.isNaN(d);
            this.bitrateAccumulatorMax = d / 8.0d;
            int i4 = this.targetBitrateBps;
            if (i4 > 0 && i3 < i4) {
                double d2 = this.bitrateAccumulator;
                Double.isNaN(d);
                d2 *= d;
                d = (double) i4;
                Double.isNaN(d);
                this.bitrateAccumulator = d2 / d;
            }
        }
        this.targetBitrateBps = i3;
        this.targetFps = i2;
        if (this.bitrateAdjustmentType == BitrateAdjustmentType.FRAMERATE_ADJUSTMENT) {
            int i5 = this.targetFps;
            if (i5 > 0) {
                i3 = (this.targetBitrateBps * 30) / i5;
                String str = TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("setRates: ");
                stringBuilder.append(i);
                stringBuilder.append(" -> ");
                stringBuilder.append(i3 / JsonMappingException.MAX_REFS_TO_LIST);
                stringBuilder.append(" kbps. Fps: ");
                stringBuilder.append(this.targetFps);
                Logging.m29386v(str, stringBuilder.toString());
                Bundle bundle = new Bundle();
                bundle.putInt("video-bitrate", i3);
                this.mediaCodec.setParameters(bundle);
                return true;
            }
        }
        if (this.bitrateAdjustmentType == BitrateAdjustmentType.DYNAMIC_ADJUSTMENT) {
            str = TAG;
            stringBuilder = new StringBuilder();
            stringBuilder.append("setRates: ");
            stringBuilder.append(i);
            stringBuilder.append(" kbps. Fps: ");
            stringBuilder.append(this.targetFps);
            stringBuilder.append(". ExpScale: ");
            stringBuilder.append(this.bitrateAdjustmentScaleExp);
            Logging.m29386v(str, stringBuilder.toString());
            int i6 = this.bitrateAdjustmentScaleExp;
            if (i6 != 0) {
                double d3 = (double) i3;
                d = getBitrateScale(i6);
                Double.isNaN(d3);
                i3 = (int) (d3 * d);
            }
        } else {
            str = TAG;
            stringBuilder = new StringBuilder();
            stringBuilder.append("setRates: ");
            stringBuilder.append(i);
            stringBuilder.append(" kbps. Fps: ");
            stringBuilder.append(this.targetFps);
            Logging.m29386v(str, stringBuilder.toString());
        }
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("video-bitrate", i3);
            this.mediaCodec.setParameters(bundle2);
            return true;
        } catch (Throwable e) {
            Logging.m29385e(TAG, "setRates failed", e);
            return false;
        }
    }

    public static EncoderProperties vp8HwEncoderProperties() {
        if (hwEncoderDisabledTypes.contains(VP8_MIME_TYPE)) {
            return null;
        }
        return findHwEncoder(VP8_MIME_TYPE, vp8HwList(), supportedColorList);
    }

    private static MediaCodecProperties[] vp8HwList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(qcomVp8HwProperties);
        arrayList.add(exynosVp8HwProperties);
        if (PeerConnectionFactory.fieldTrialsFindFullName("WebRTC-IntelVP8").equals(PeerConnectionFactory.TRIAL_ENABLED)) {
            arrayList.add(intelVp8HwProperties);
        }
        return (MediaCodecProperties[]) arrayList.toArray(new MediaCodecProperties[arrayList.size()]);
    }
}

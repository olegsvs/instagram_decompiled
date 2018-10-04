package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.view.Surface;
import com.facebook.forker.Process;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase.Context;
import org.webrtc.SurfaceTextureHelper.OnTextureFrameAvailableListener;
import org.webrtc.VideoFrame.Buffer;

public class MediaCodecVideoDecoder {
    private static final int COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m = 2141391876;
    private static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka = 2141391874;
    private static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka = 2141391873;
    private static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka = 2141391875;
    private static final int DEQUEUE_INPUT_TIMEOUT = 500000;
    private static final String FORMAT_KEY_CROP_BOTTOM = "crop-bottom";
    private static final String FORMAT_KEY_CROP_LEFT = "crop-left";
    private static final String FORMAT_KEY_CROP_RIGHT = "crop-right";
    private static final String FORMAT_KEY_CROP_TOP = "crop-top";
    private static final String FORMAT_KEY_SLICE_HEIGHT = "slice-height";
    private static final String FORMAT_KEY_STRIDE = "stride";
    private static final String H264_MIME_TYPE = "video/avc";
    private static final long MAX_DECODE_TIME_MS = 200;
    private static final int MAX_QUEUED_OUTPUTBUFFERS = 3;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final String TAG = "MediaCodecVideoDecoder";
    private static final String VP8_MIME_TYPE = "video/x-vnd.on2.vp8";
    private static final String VP9_MIME_TYPE = "video/x-vnd.on2.vp9";
    private static int codecErrors = 0;
    private static MediaCodecVideoDecoderErrorCallback errorCallback = null;
    private static Set hwDecoderDisabledTypes = new HashSet();
    private static MediaCodecVideoDecoder runningInstance = null;
    private static final List supportedColorList = Arrays.asList(new Integer[]{Integer.valueOf(19), Integer.valueOf(21), Integer.valueOf(2141391872), Integer.valueOf(2141391873), Integer.valueOf(2141391874), Integer.valueOf(2141391875), Integer.valueOf(2141391876)});
    private static final String supportedExynosH264HighProfileHwCodecPrefix = "OMX.Exynos.";
    private static final String supportedMediaTekH264HighProfileHwCodecPrefix = "OMX.MTK.";
    private static final String supportedQcomH264HighProfileHwCodecPrefix = "OMX.qcom.";
    private static final String[] supportedVp9HwCodecPrefixes = new String[]{"OMX.qcom.", "OMX.Exynos."};
    private int colorFormat;
    private final Queue decodeStartTimeMs = new ArrayDeque();
    private final Queue dequeuedSurfaceOutputBuffers = new ArrayDeque();
    private int droppedFrames;
    private boolean hasDecodedFirstFrame;
    public int height;
    private ByteBuffer[] inputBuffers;
    public MediaCodec mediaCodec;
    private Thread mediaCodecThread;
    private ByteBuffer[] outputBuffers;
    private int sliceHeight;
    private int stride;
    private Surface surface = null;
    private TextureListener textureListener;
    private boolean useSurface;
    public int width;

    public class DecodedOutputBuffer {
        public final long decodeTimeMs;
        public final long endDecodeTimeMs;
        public final int index;
        public final long ntpTimeStampMs;
        private final int offset;
        public final long presentationTimeStampMs;
        private final int size;
        public final long timeStampMs;

        public DecodedOutputBuffer(int i, int i2, int i3, long j, long j2, long j3, long j4, long j5) {
            this.index = i;
            this.offset = i2;
            this.size = i3;
            this.presentationTimeStampMs = j;
            this.timeStampMs = j2;
            this.ntpTimeStampMs = j3;
            this.decodeTimeMs = j4;
            this.endDecodeTimeMs = j5;
        }

        public long getDecodeTimeMs() {
            return this.decodeTimeMs;
        }

        public int getIndex() {
            return this.index;
        }

        public long getNtpTimestampMs() {
            return this.ntpTimeStampMs;
        }

        public int getOffset() {
            return this.offset;
        }

        public long getPresentationTimestampMs() {
            return this.presentationTimeStampMs;
        }

        public int getSize() {
            return this.size;
        }

        public long getTimestampMs() {
            return this.timeStampMs;
        }
    }

    public class DecodedTextureBuffer {
        private final long decodeTimeMs;
        private final long frameDelayMs;
        private final long ntpTimeStampMs;
        private final long presentationTimeStampMs;
        private final long timeStampMs;
        private final Buffer videoFrameBuffer;

        public DecodedTextureBuffer(Buffer buffer, long j, long j2, long j3, long j4, long j5) {
            this.videoFrameBuffer = buffer;
            this.presentationTimeStampMs = j;
            this.timeStampMs = j2;
            this.ntpTimeStampMs = j3;
            this.decodeTimeMs = j4;
            this.frameDelayMs = j5;
        }

        public long getDecodeTimeMs() {
            return this.decodeTimeMs;
        }

        public long getFrameDelayMs() {
            return this.frameDelayMs;
        }

        public long getNtpTimestampMs() {
            return this.ntpTimeStampMs;
        }

        public long getPresentationTimestampMs() {
            return this.presentationTimeStampMs;
        }

        public long getTimeStampMs() {
            return this.timeStampMs;
        }

        public Buffer getVideoFrameBuffer() {
            return this.videoFrameBuffer;
        }
    }

    public class DecoderProperties {
        public final String codecName;
        public final int colorFormat;

        public DecoderProperties(String str, int i) {
            this.codecName = str;
            this.colorFormat = i;
        }
    }

    public interface MediaCodecVideoDecoderErrorCallback {
        void onMediaCodecVideoDecoderCriticalError(int i);
    }

    public class TimeStamps {
        public final long decodeStartTimeMs;
        public final long ntpTimeStampMs;
        public final long timeStampMs;

        public TimeStamps(long j, long j2, long j3) {
            this.decodeStartTimeMs = j;
            this.timeStampMs = j2;
            this.ntpTimeStampMs = j3;
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

    public class TextureListener implements OnTextureFrameAvailableListener {
        private DecodedOutputBuffer bufferToRender;
        private final Object newFrameLock = new Object();
        private DecodedTextureBuffer renderedBuffer;
        private final SurfaceTextureHelper surfaceTextureHelper;

        public TextureListener(SurfaceTextureHelper surfaceTextureHelper) {
            this.surfaceTextureHelper = surfaceTextureHelper;
            surfaceTextureHelper.startListening(this);
        }

        public void addBufferToRender(DecodedOutputBuffer decodedOutputBuffer) {
            if (this.bufferToRender == null) {
                this.bufferToRender = decodedOutputBuffer;
            } else {
                Logging.m29384e(MediaCodecVideoDecoder.TAG, "Unexpected addBufferToRender() called while waiting for a texture.");
                throw new IllegalStateException("Waiting for a texture.");
            }
        }

        public org.webrtc.MediaCodecVideoDecoder.DecodedTextureBuffer dequeueTextureBuffer(int r5) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r4 = this;
            r3 = r4.newFrameLock;
            monitor-enter(r3);
            r0 = r4.renderedBuffer;	 Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x001d;	 Catch:{ all -> 0x0024 }
        L_0x0007:
            if (r5 <= 0) goto L_0x001d;	 Catch:{ all -> 0x0024 }
        L_0x0009:
            r0 = r4.isWaitingForTexture();	 Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x001d;	 Catch:{ all -> 0x0024 }
        L_0x000f:
            r2 = r4.newFrameLock;	 Catch:{ InterruptedException -> 0x0016 }
            r0 = (long) r5;	 Catch:{ InterruptedException -> 0x0016 }
            r2.wait(r0);	 Catch:{ InterruptedException -> 0x0016 }
            goto L_0x001d;	 Catch:{ InterruptedException -> 0x0016 }
        L_0x0016:
            r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0024 }
            r0.interrupt();	 Catch:{ all -> 0x0024 }
        L_0x001d:
            r1 = r4.renderedBuffer;	 Catch:{ all -> 0x0024 }
            r0 = 0;	 Catch:{ all -> 0x0024 }
            r4.renderedBuffer = r0;	 Catch:{ all -> 0x0024 }
            monitor-exit(r3);	 Catch:{ all -> 0x0024 }
            return r1;	 Catch:{ all -> 0x0024 }
        L_0x0024:
            r0 = move-exception;	 Catch:{ all -> 0x0024 }
            monitor-exit(r3);	 Catch:{ all -> 0x0024 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.MediaCodecVideoDecoder.TextureListener.dequeueTextureBuffer(int):org.webrtc.MediaCodecVideoDecoder$DecodedTextureBuffer");
        }

        public boolean isWaitingForTexture() {
            boolean z;
            synchronized (this.newFrameLock) {
                z = this.bufferToRender != null;
            }
            return z;
        }

        public void onTextureFrameAvailable(int i, float[] fArr, long j) {
            synchronized (this.newFrameLock) {
                if (this.renderedBuffer == null) {
                    this.renderedBuffer = new DecodedTextureBuffer(this.surfaceTextureHelper.createTextureBuffer(MediaCodecVideoDecoder.this.width, MediaCodecVideoDecoder.this.height, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr)), this.bufferToRender.presentationTimeStampMs, this.bufferToRender.timeStampMs, this.bufferToRender.ntpTimeStampMs, this.bufferToRender.decodeTimeMs, SystemClock.elapsedRealtime() - this.bufferToRender.endDecodeTimeMs);
                    this.bufferToRender = null;
                    this.newFrameLock.notifyAll();
                } else {
                    Logging.m29384e(MediaCodecVideoDecoder.TAG, "Unexpected onTextureFrameAvailable() called while already holding a texture.");
                    throw new IllegalStateException("Already holding a texture.");
                }
            }
        }

        public void release() {
            this.surfaceTextureHelper.stopListening();
            synchronized (this.newFrameLock) {
                if (this.renderedBuffer != null) {
                    this.renderedBuffer.getVideoFrameBuffer().release();
                    this.renderedBuffer = null;
                }
            }
            this.surfaceTextureHelper.dispose();
        }
    }

    private void MaybeRenderDecodedTextureBuffer() {
        if (!this.dequeuedSurfaceOutputBuffers.isEmpty()) {
            if (!this.textureListener.isWaitingForTexture()) {
                DecodedOutputBuffer decodedOutputBuffer = (DecodedOutputBuffer) this.dequeuedSurfaceOutputBuffers.remove();
                this.textureListener.addBufferToRender(decodedOutputBuffer);
                this.mediaCodec.releaseOutputBuffer(decodedOutputBuffer.index, true);
            }
        }
    }

    private void checkOnMediaCodecThread() {
        if (this.mediaCodecThread.getId() != Thread.currentThread().getId()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MediaCodecVideoDecoder previously operated on ");
            stringBuilder.append(this.mediaCodecThread);
            stringBuilder.append(" but is now called on ");
            stringBuilder.append(Thread.currentThread());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private int dequeueInputBuffer() {
        checkOnMediaCodecThread();
        try {
            return this.mediaCodec.dequeueInputBuffer(500000);
        } catch (Throwable e) {
            Logging.m29385e(TAG, "dequeueIntputBuffer failed", e);
            return -2;
        }
    }

    private DecodedOutputBuffer dequeueOutputBuffer(int i) {
        checkOnMediaCodecThread();
        if (!this.decodeStartTimeMs.isEmpty()) {
            BufferInfo bufferInfo = new BufferInfo();
            while (true) {
                int dequeueOutputBuffer = r4.mediaCodec.dequeueOutputBuffer(bufferInfo, TimeUnit.MILLISECONDS.toMicros((long) i));
                String str;
                StringBuilder stringBuilder;
                switch (dequeueOutputBuffer) {
                    case Process.SD_BLACK_HOLE /*-3*/:
                        r4.outputBuffers = r4.mediaCodec.getOutputBuffers();
                        str = TAG;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Decoder output buffers changed: ");
                        stringBuilder.append(r4.outputBuffers.length);
                        Logging.m29383d(str, stringBuilder.toString());
                        if (r4.hasDecodedFirstFrame) {
                            throw new RuntimeException("Unexpected output buffer change event.");
                        }
                        continue;
                    case -2:
                        int integer;
                        int integer2;
                        MediaFormat outputFormat = r4.mediaCodec.getOutputFormat();
                        String str2 = TAG;
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Decoder format changed: ");
                        stringBuilder2.append(outputFormat.toString());
                        Logging.m29383d(str2, stringBuilder2.toString());
                        if (outputFormat.containsKey(FORMAT_KEY_CROP_LEFT) && outputFormat.containsKey(FORMAT_KEY_CROP_RIGHT) && outputFormat.containsKey(FORMAT_KEY_CROP_BOTTOM) && outputFormat.containsKey(FORMAT_KEY_CROP_TOP)) {
                            integer = (outputFormat.getInteger(FORMAT_KEY_CROP_RIGHT) + 1) - outputFormat.getInteger(FORMAT_KEY_CROP_LEFT);
                            integer2 = (outputFormat.getInteger(FORMAT_KEY_CROP_BOTTOM) + 1) - outputFormat.getInteger(FORMAT_KEY_CROP_TOP);
                        } else {
                            integer = outputFormat.getInteger("width");
                            integer2 = outputFormat.getInteger("height");
                        }
                        if (r4.hasDecodedFirstFrame) {
                            if (integer != r4.width || integer2 != r4.height) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Unexpected size change. Configured ");
                                stringBuilder.append(r4.width);
                                stringBuilder.append("*");
                                stringBuilder.append(r4.height);
                                stringBuilder.append(". New ");
                                stringBuilder.append(integer);
                                stringBuilder.append("*");
                                stringBuilder.append(integer2);
                                throw new RuntimeException(stringBuilder.toString());
                            }
                        }
                        r4.width = integer;
                        r4.height = integer2;
                        if (!r4.useSurface && outputFormat.containsKey("color-format")) {
                            r4.colorFormat = outputFormat.getInteger("color-format");
                            String str3 = TAG;
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Color: 0x");
                            stringBuilder.append(Integer.toHexString(r4.colorFormat));
                            Logging.m29383d(str3, stringBuilder.toString());
                            if (!supportedColorList.contains(Integer.valueOf(r4.colorFormat))) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Non supported color format: ");
                                stringBuilder.append(r4.colorFormat);
                                throw new IllegalStateException(stringBuilder.toString());
                            }
                        }
                        if (outputFormat.containsKey(FORMAT_KEY_STRIDE)) {
                            r4.stride = outputFormat.getInteger(FORMAT_KEY_STRIDE);
                        }
                        if (outputFormat.containsKey(FORMAT_KEY_SLICE_HEIGHT)) {
                            r4.sliceHeight = outputFormat.getInteger(FORMAT_KEY_SLICE_HEIGHT);
                        }
                        str = TAG;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Frame stride and slice height: ");
                        stringBuilder.append(r4.stride);
                        stringBuilder.append(" x ");
                        stringBuilder.append(r4.sliceHeight);
                        Logging.m29383d(str, stringBuilder.toString());
                        r4.stride = Math.max(r4.width, r4.stride);
                        r4.sliceHeight = Math.max(r4.height, r4.sliceHeight);
                        continue;
                    case -1:
                        break;
                    default:
                        r4.hasDecodedFirstFrame = true;
                        TimeStamps timeStamps = (TimeStamps) r4.decodeStartTimeMs.remove();
                        long elapsedRealtime = SystemClock.elapsedRealtime() - timeStamps.decodeStartTimeMs;
                        if (elapsedRealtime > MAX_DECODE_TIME_MS) {
                            String str4 = TAG;
                            StringBuilder stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("Very high decode time: ");
                            stringBuilder3.append(elapsedRealtime);
                            stringBuilder3.append("ms. Q size: ");
                            stringBuilder3.append(r4.decodeStartTimeMs.size());
                            stringBuilder3.append(". Might be caused by resuming H264 decoding after a pause.");
                            Logging.m29384e(str4, stringBuilder3.toString());
                            elapsedRealtime = MAX_DECODE_TIME_MS;
                        }
                        return new DecodedOutputBuffer(dequeueOutputBuffer, bufferInfo.offset, bufferInfo.size, TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs), timeStamps.timeStampMs, timeStamps.ntpTimeStampMs, elapsedRealtime, SystemClock.elapsedRealtime());
                }
            }
        }
        return null;
    }

    private DecodedTextureBuffer dequeueTextureBuffer(int i) {
        checkOnMediaCodecThread();
        if (this.useSurface) {
            DecodedOutputBuffer dequeueOutputBuffer = dequeueOutputBuffer(i);
            if (dequeueOutputBuffer != null) {
                this.dequeuedSurfaceOutputBuffers.add(dequeueOutputBuffer);
            }
            MaybeRenderDecodedTextureBuffer();
            DecodedTextureBuffer dequeueTextureBuffer = this.textureListener.dequeueTextureBuffer(i);
            if (dequeueTextureBuffer != null) {
                MaybeRenderDecodedTextureBuffer();
                return dequeueTextureBuffer;
            }
            if (this.dequeuedSurfaceOutputBuffers.size() < Math.min(3, this.outputBuffers.length)) {
                if (i <= 0 || this.dequeuedSurfaceOutputBuffers.isEmpty()) {
                    return null;
                }
            }
            this.droppedFrames++;
            dequeueOutputBuffer = (DecodedOutputBuffer) this.dequeuedSurfaceOutputBuffers.remove();
            String str;
            StringBuilder stringBuilder;
            if (i > 0) {
                str = TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Draining decoder. Dropping frame with TS: ");
                stringBuilder.append(dequeueOutputBuffer.presentationTimeStampMs);
                stringBuilder.append(". Total number of dropped frames: ");
                stringBuilder.append(this.droppedFrames);
                Logging.m29387w(str, stringBuilder.toString());
            } else {
                str = TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Too many output buffers ");
                stringBuilder.append(this.dequeuedSurfaceOutputBuffers.size());
                stringBuilder.append(". Dropping frame with TS: ");
                stringBuilder.append(dequeueOutputBuffer.presentationTimeStampMs);
                stringBuilder.append(". Total number of dropped frames: ");
                stringBuilder.append(this.droppedFrames);
                Logging.m29387w(str, stringBuilder.toString());
            }
            this.mediaCodec.releaseOutputBuffer(dequeueOutputBuffer.index, false);
            return new DecodedTextureBuffer(null, dequeueOutputBuffer.presentationTimeStampMs, dequeueOutputBuffer.timeStampMs, dequeueOutputBuffer.ntpTimeStampMs, dequeueOutputBuffer.decodeTimeMs, SystemClock.elapsedRealtime() - dequeueOutputBuffer.endDecodeTimeMs);
        }
        throw new IllegalStateException("dequeueTexture() called for byte buffer decoding.");
    }

    public static void disableH264HwCodec() {
        Logging.m29387w(TAG, "H.264 decoding is disabled by application.");
        hwDecoderDisabledTypes.add(H264_MIME_TYPE);
    }

    public static void disableVp8HwCodec() {
        Logging.m29387w(TAG, "VP8 decoding is disabled by application.");
        hwDecoderDisabledTypes.add(VP8_MIME_TYPE);
    }

    public static void disableVp9HwCodec() {
        Logging.m29387w(TAG, "VP9 decoding is disabled by application.");
        hwDecoderDisabledTypes.add(VP9_MIME_TYPE);
    }

    private static DecoderProperties findDecoder(String str, String[] strArr) {
        if (VERSION.SDK_INT < 19) {
            return null;
        }
        String str2 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Trying to find HW decoder for mime ");
        stringBuilder.append(str);
        Logging.m29383d(str2, stringBuilder.toString());
        for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
            MediaCodecInfo codecInfoAt;
            try {
                codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            } catch (Throwable e) {
                Logging.m29385e(str2, "Cannot retrieve decoder codec info", e);
                codecInfoAt = null;
            }
            if (codecInfoAt != null) {
                if (!codecInfoAt.isEncoder()) {
                    String name;
                    for (String equals : codecInfoAt.getSupportedTypes()) {
                        if (equals.equals(str)) {
                            name = codecInfoAt.getName();
                            break;
                        }
                    }
                    name = null;
                    if (name != null) {
                        Object obj;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Found candidate decoder ");
                        stringBuilder.append(name);
                        Logging.m29383d(str2, stringBuilder.toString());
                        for (String equals2 : strArr) {
                            if (name.startsWith(equals2)) {
                                obj = 1;
                                break;
                            }
                        }
                        obj = null;
                        if (obj != null) {
                            try {
                                int intValue;
                                CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(str);
                                for (int i2 : capabilitiesForType.colorFormats) {
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("   Color: 0x");
                                    stringBuilder.append(Integer.toHexString(i2));
                                    Logging.m29386v(str2, stringBuilder.toString());
                                }
                                for (Integer intValue2 : supportedColorList) {
                                    intValue = intValue2.intValue();
                                    for (int i3 : capabilitiesForType.colorFormats) {
                                        if (i3 == intValue) {
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append("Found target decoder ");
                                            stringBuilder.append(name);
                                            stringBuilder.append(". Color: 0x");
                                            stringBuilder.append(Integer.toHexString(i3));
                                            Logging.m29383d(str2, stringBuilder.toString());
                                            return new DecoderProperties(name, i3);
                                        }
                                    }
                                }
                                continue;
                            } catch (Throwable e2) {
                                Logging.m29385e(str2, "Cannot retrieve decoder capabilities", e2);
                            }
                        }
                    }
                }
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("No HW decoder found for mime ");
        stringBuilder.append(str);
        Logging.m29383d(str2, stringBuilder.toString());
        return null;
    }

    public int getColorFormat() {
        return this.colorFormat;
    }

    public int getHeight() {
        return this.height;
    }

    public ByteBuffer[] getInputBuffers() {
        return this.inputBuffers;
    }

    public ByteBuffer[] getOutputBuffers() {
        return this.outputBuffers;
    }

    public int getSliceHeight() {
        return this.sliceHeight;
    }

    public int getStride() {
        return this.stride;
    }

    public int getWidth() {
        return this.width;
    }

    private boolean initDecode(VideoCodecType videoCodecType, int i, int i2, Context context) {
        if (this.mediaCodecThread == null) {
            String str;
            String[] supportedVp8HwCodecPrefixes;
            StringBuilder stringBuilder;
            this.useSurface = context != null;
            if (videoCodecType == VideoCodecType.VIDEO_CODEC_VP8) {
                str = VP8_MIME_TYPE;
                supportedVp8HwCodecPrefixes = supportedVp8HwCodecPrefixes();
            } else if (videoCodecType == VideoCodecType.VIDEO_CODEC_VP9) {
                str = VP9_MIME_TYPE;
                supportedVp8HwCodecPrefixes = supportedVp9HwCodecPrefixes;
            } else if (videoCodecType == VideoCodecType.VIDEO_CODEC_H264) {
                str = H264_MIME_TYPE;
                supportedVp8HwCodecPrefixes = supportedH264HwCodecPrefixes();
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("initDecode: Non-supported codec ");
                stringBuilder.append(videoCodecType);
                throw new RuntimeException(stringBuilder.toString());
            }
            DecoderProperties findDecoder = findDecoder(str, supportedVp8HwCodecPrefixes);
            if (findDecoder != null) {
                String str2 = TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Java initDecode: ");
                stringBuilder.append(videoCodecType);
                stringBuilder.append(" : ");
                stringBuilder.append(i);
                stringBuilder.append(" x ");
                stringBuilder.append(i2);
                stringBuilder.append(". Color: 0x");
                stringBuilder.append(Integer.toHexString(findDecoder.colorFormat));
                stringBuilder.append(". Use Surface: ");
                stringBuilder.append(this.useSurface);
                Logging.m29383d(str2, stringBuilder.toString());
                runningInstance = this;
                this.mediaCodecThread = Thread.currentThread();
                try {
                    this.width = i;
                    this.height = i2;
                    this.stride = i;
                    this.sliceHeight = i2;
                    if (this.useSurface) {
                        SurfaceTextureHelper create = SurfaceTextureHelper.create("Decoder SurfaceTextureHelper", context);
                        if (create != null) {
                            this.textureListener = new TextureListener(create);
                            this.surface = new Surface(create.getSurfaceTexture());
                        }
                    }
                    MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, i, i2);
                    if (!this.useSurface) {
                        createVideoFormat.setInteger("color-format", findDecoder.colorFormat);
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("  Format: ");
                    stringBuilder.append(createVideoFormat);
                    Logging.m29383d(str2, stringBuilder.toString());
                    this.mediaCodec = MediaCodecVideoEncoder.createByCodecName(findDecoder.codecName);
                    if (this.mediaCodec == null) {
                        Logging.m29384e(str2, "Can not create media decoder");
                        return false;
                    }
                    this.mediaCodec.configure(createVideoFormat, this.surface, null, 0);
                    this.mediaCodec.start();
                    this.colorFormat = findDecoder.colorFormat;
                    this.outputBuffers = this.mediaCodec.getOutputBuffers();
                    this.inputBuffers = this.mediaCodec.getInputBuffers();
                    this.decodeStartTimeMs.clear();
                    this.hasDecodedFirstFrame = false;
                    this.dequeuedSurfaceOutputBuffers.clear();
                    this.droppedFrames = 0;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Input buffers: ");
                    stringBuilder.append(this.inputBuffers.length);
                    stringBuilder.append(". Output buffers: ");
                    stringBuilder.append(this.outputBuffers.length);
                    Logging.m29383d(str2, stringBuilder.toString());
                    return true;
                } catch (Throwable e) {
                    Logging.m29385e(str2, "initDecode failed", e);
                    return false;
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot find HW decoder for ");
            stringBuilder.append(videoCodecType);
            throw new RuntimeException(stringBuilder.toString());
        }
        throw new RuntimeException("initDecode: Forgot to release()?");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isH264HighProfileHwSupported() {
        /*
        r1 = hwDecoderDisabledTypes;
        r0 = "video/avc";
        r0 = r1.contains(r0);
        r4 = 0;
        if (r0 == 0) goto L_0x000c;
    L_0x000b:
        return r4;
    L_0x000c:
        r0 = "WebRTC-H264HighProfile";
        r1 = org.webrtc.PeerConnectionFactory.fieldTrialsFindFullName(r0);
        r0 = "Disabled";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x001b;
    L_0x001a:
        goto L_0x000b;
    L_0x001b:
        r1 = android.os.Build.VERSION.SDK_INT;
        r0 = 21;
        r3 = 1;
        if (r1 < r0) goto L_0x0031;
    L_0x0022:
        r2 = "video/avc";
        r1 = new java.lang.String[r3];
        r0 = "OMX.qcom.";
        r1[r4] = r0;
        r0 = findDecoder(r2, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0030:
        return r3;
    L_0x0031:
        r1 = android.os.Build.VERSION.SDK_INT;
        r0 = 23;
        if (r1 < r0) goto L_0x0046;
    L_0x0037:
        r2 = "video/avc";
        r1 = new java.lang.String[r3];
        r0 = "OMX.Exynos.";
        r1[r4] = r0;
        r0 = findDecoder(r2, r1);
        if (r0 == 0) goto L_0x0046;
    L_0x0045:
        goto L_0x0030;
    L_0x0046:
        r0 = "WebRTC-MediaTekH264";
        r1 = org.webrtc.PeerConnectionFactory.fieldTrialsFindFullName(r0);
        r0 = "Enabled";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x000b;
    L_0x0054:
        r1 = android.os.Build.VERSION.SDK_INT;
        r0 = 27;
        if (r1 < r0) goto L_0x000b;
    L_0x005a:
        r2 = "video/avc";
        r1 = new java.lang.String[r3];
        r0 = "OMX.MTK.";
        r1[r4] = r0;
        r0 = findDecoder(r2, r1);
        if (r0 == 0) goto L_0x000b;
    L_0x0068:
        goto L_0x0030;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.MediaCodecVideoDecoder.isH264HighProfileHwSupported():boolean");
    }

    public static boolean isH264HwSupported() {
        return (hwDecoderDisabledTypes.contains(H264_MIME_TYPE) || findDecoder(H264_MIME_TYPE, supportedH264HwCodecPrefixes()) == null) ? false : true;
    }

    public static boolean isVp8HwSupported() {
        return (hwDecoderDisabledTypes.contains(VP8_MIME_TYPE) || findDecoder(VP8_MIME_TYPE, supportedVp8HwCodecPrefixes()) == null) ? false : true;
    }

    public static boolean isVp9HwSupported() {
        return (hwDecoderDisabledTypes.contains(VP9_MIME_TYPE) || findDecoder(VP9_MIME_TYPE, supportedVp9HwCodecPrefixes) == null) ? false : true;
    }

    public static void printStackTrace() {
        MediaCodecVideoDecoder mediaCodecVideoDecoder = runningInstance;
        if (mediaCodecVideoDecoder != null) {
            Thread thread = mediaCodecVideoDecoder.mediaCodecThread;
            if (thread != null) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace.length > 0) {
                    String str = TAG;
                    Logging.m29383d(str, "MediaCodecVideoDecoder stacks trace:");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        Logging.m29383d(str, stackTraceElement.toString());
                    }
                }
            }
        }
    }

    private boolean queueInputBuffer(int i, int i2, long j, long j2, long j3) {
        checkOnMediaCodecThread();
        try {
            int i3 = i;
            this.inputBuffers[i].position(0);
            int i4 = i2;
            this.inputBuffers[i].limit(i4);
            this.decodeStartTimeMs.add(new TimeStamps(SystemClock.elapsedRealtime(), j2, j3));
            this.mediaCodec.queueInputBuffer(i3, 0, i4, j, 0);
            return true;
        } catch (Throwable e) {
            Logging.m29385e(TAG, "decode failed", e);
            return false;
        }
    }

    private void release() {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Java releaseDecoder. Total number of dropped frames: ");
        stringBuilder.append(this.droppedFrames);
        Logging.m29383d(str, stringBuilder.toString());
        checkOnMediaCodecThread();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() {
            public void run() {
                try {
                    String str = MediaCodecVideoDecoder.TAG;
                    Logging.m29383d(str, "Java releaseDecoder on release thread");
                    MediaCodecVideoDecoder.this.mediaCodec.stop();
                    MediaCodecVideoDecoder.this.mediaCodec.release();
                    Logging.m29383d(str, "Java releaseDecoder on release thread done");
                } catch (Throwable e) {
                    Logging.m29385e(MediaCodecVideoDecoder.TAG, "Media decoder release failed", e);
                }
                countDownLatch.countDown();
            }
        }).start();
        if (!ThreadUtils.awaitUninterruptibly(countDownLatch, 5000)) {
            Logging.m29384e(TAG, "Media decoder release timeout");
            codecErrors++;
            if (errorCallback != null) {
                str = TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Invoke codec error callback. Errors: ");
                stringBuilder.append(codecErrors);
                Logging.m29384e(str, stringBuilder.toString());
                errorCallback.onMediaCodecVideoDecoderCriticalError(codecErrors);
            }
        }
        this.mediaCodec = null;
        this.mediaCodecThread = null;
        runningInstance = null;
        if (this.useSurface) {
            this.surface.release();
            this.surface = null;
            this.textureListener.release();
        }
        Logging.m29383d(TAG, "Java releaseDecoder done");
    }

    private void reset(int i, int i2) {
        if (this.mediaCodecThread == null || this.mediaCodec == null) {
            throw new RuntimeException("Incorrect reset call for non-initialized decoder.");
        }
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Java reset: ");
        stringBuilder.append(i);
        stringBuilder.append(" x ");
        stringBuilder.append(i2);
        Logging.m29383d(str, stringBuilder.toString());
        this.mediaCodec.flush();
        this.width = i;
        this.height = i2;
        this.decodeStartTimeMs.clear();
        this.dequeuedSurfaceOutputBuffers.clear();
        this.hasDecodedFirstFrame = false;
        this.droppedFrames = 0;
    }

    private void returnDecodedOutputBuffer(int i) {
        checkOnMediaCodecThread();
        if (this.useSurface) {
            throw new IllegalStateException("returnDecodedOutputBuffer() called for surface decoding.");
        }
        this.mediaCodec.releaseOutputBuffer(i, false);
    }

    public static void setErrorCallback(MediaCodecVideoDecoderErrorCallback mediaCodecVideoDecoderErrorCallback) {
        Logging.m29383d(TAG, "Set error callback");
        errorCallback = mediaCodecVideoDecoderErrorCallback;
    }

    private static final String[] supportedH264HwCodecPrefixes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("OMX.qcom.");
        arrayList.add(MediaCodecUtils.INTEL_PREFIX);
        arrayList.add("OMX.Exynos.");
        if (PeerConnectionFactory.fieldTrialsFindFullName("WebRTC-MediaTekH264").equals(PeerConnectionFactory.TRIAL_ENABLED) && VERSION.SDK_INT >= 27) {
            arrayList.add(supportedMediaTekH264HighProfileHwCodecPrefix);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static final String[] supportedVp8HwCodecPrefixes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("OMX.qcom.");
        arrayList.add(MediaCodecUtils.NVIDIA_PREFIX);
        arrayList.add("OMX.Exynos.");
        arrayList.add(MediaCodecUtils.INTEL_PREFIX);
        if (PeerConnectionFactory.fieldTrialsFindFullName("WebRTC-MediaTekVP8").equals(PeerConnectionFactory.TRIAL_ENABLED) && VERSION.SDK_INT >= 24) {
            arrayList.add(supportedMediaTekH264HighProfileHwCodecPrefix);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}

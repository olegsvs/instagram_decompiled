package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase.Context;
import org.webrtc.EncodedImage.FrameType;
import org.webrtc.SurfaceTextureHelper.OnTextureFrameAvailableListener;
import org.webrtc.ThreadUtils.ThreadChecker;
import org.webrtc.VideoDecoder.Callback;
import org.webrtc.VideoDecoder.DecodeInfo;
import org.webrtc.VideoDecoder.Settings;
import org.webrtc.VideoFrame.Buffer;

public class HardwareVideoDecoder implements OnTextureFrameAvailableListener, VideoDecoder {
    private static final int DEQUEUE_INPUT_TIMEOUT_US = 500000;
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final String MEDIA_FORMAT_KEY_CROP_BOTTOM = "crop-bottom";
    private static final String MEDIA_FORMAT_KEY_CROP_LEFT = "crop-left";
    private static final String MEDIA_FORMAT_KEY_CROP_RIGHT = "crop-right";
    private static final String MEDIA_FORMAT_KEY_CROP_TOP = "crop-top";
    private static final String MEDIA_FORMAT_KEY_SLICE_HEIGHT = "slice-height";
    private static final String MEDIA_FORMAT_KEY_STRIDE = "stride";
    private static final String TAG = "HardwareVideoDecoder";
    private Callback callback;
    private MediaCodec codec = null;
    private final String codecName;
    private final VideoCodecType codecType;
    private int colorFormat;
    private ThreadChecker decoderThreadChecker;
    private final Object dimensionLock = new Object();
    private final BlockingDeque frameInfos;
    private boolean hasDecodedFirstFrame;
    private int height;
    private boolean keyFrameRequired;
    private Thread outputThread;
    private ThreadChecker outputThreadChecker;
    private DecodedTextureMetadata renderedTextureMetadata;
    private final Object renderedTextureMetadataLock = new Object();
    public volatile boolean running = false;
    private final Context sharedContext;
    private volatile Exception shutdownException = null;
    private int sliceHeight;
    private int stride;
    private Surface surface = null;
    private SurfaceTextureHelper surfaceTextureHelper;
    private int width;

    public class DecodedTextureMetadata {
        public final Integer decodeTimeMs;
        public final int height;
        public final long presentationTimestampUs;
        public final int rotation;
        public final int width;

        public DecodedTextureMetadata(int i, int i2, int i3, long j, Integer num) {
            this.width = i;
            this.height = i2;
            this.rotation = i3;
            this.presentationTimestampUs = j;
            this.decodeTimeMs = num;
        }
    }

    public class FrameInfo {
        public final long decodeStartTimeMs;
        public final int rotation;

        public FrameInfo(long j, int i) {
            this.decodeStartTimeMs = j;
            this.rotation = i;
        }
    }

    public String getImplementationName() {
        return "HWDecoder";
    }

    public boolean getPrefersLateDecoding() {
        return true;
    }

    public HardwareVideoDecoder(String str, VideoCodecType videoCodecType, int i, Context context) {
        if (isSupportedColorFormat(i)) {
            this.codecName = str;
            this.codecType = videoCodecType;
            this.colorFormat = i;
            this.sharedContext = context;
            this.frameInfos = new LinkedBlockingDeque();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported color format: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private Buffer copyI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        int i5 = i;
        if (i % 2 == 0) {
            int i6 = i3;
            int i7 = (i3 + 1) / 2;
            int i8 = i2 % 2;
            int i9 = i4;
            int i10 = i8 == 0 ? (i4 + 1) / 2 : i4 / 2;
            int i11 = i / 2;
            int i12 = (i * i4) + 0;
            int i13 = i * i2;
            int i14 = i11 * i10;
            int i15 = i13 + i14;
            int i16 = i13 + ((i11 * i2) / 2);
            i14 += i16;
            Buffer allocate = JavaI420Buffer.allocate(i6, i9);
            ByteBuffer byteBuffer2 = byteBuffer;
            byteBuffer2.limit(i12);
            byteBuffer2.position(0);
            YuvHelper.copyPlane(byteBuffer2.slice(), i5, allocate.getDataY(), allocate.getStrideY(), i6, i9);
            byteBuffer2.limit(i15);
            byteBuffer2.position(i13);
            YuvHelper.copyPlane(byteBuffer2.slice(), i11, allocate.getDataU(), allocate.getStrideU(), i7, i10);
            if (i8 == 1) {
                byteBuffer2.position(i13 + ((i10 - 1) * i11));
                ByteBuffer dataU = allocate.getDataU();
                dataU.position(allocate.getStrideU() * i10);
                dataU.put(byteBuffer2);
            }
            byteBuffer2.limit(i14);
            byteBuffer2.position(i16);
            YuvHelper.copyPlane(byteBuffer2.slice(), i11, allocate.getDataV(), allocate.getStrideV(), i7, i10);
            if (i8 == 1) {
                byteBuffer2.position(i16 + (i11 * (i10 - 1)));
                ByteBuffer dataV = allocate.getDataV();
                dataV.position(allocate.getStrideV() * i10);
                dataV.put(byteBuffer2);
            }
            return allocate;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stride is not divisible by two: ");
        stringBuilder.append(i5);
        throw new AssertionError(stringBuilder.toString());
    }

    private Buffer copyNV12ToI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        return new NV12Buffer(i3, i4, i, i2, byteBuffer, null).toI420();
    }

    private Thread createOutputThread() {
        return new Thread("HardwareVideoDecoder.outputThread") {
            public void run() {
                HardwareVideoDecoder.this.outputThreadChecker = new ThreadChecker();
                while (HardwareVideoDecoder.this.running) {
                    HardwareVideoDecoder.deliverDecodedFrame(HardwareVideoDecoder.this);
                }
                HardwareVideoDecoder.releaseCodecOnOutputThread(HardwareVideoDecoder.this);
            }
        };
    }

    public VideoCodecStatus decode(EncodedImage encodedImage, DecodeInfo decodeInfo) {
        this.decoderThreadChecker.checkIsOnValidThread();
        boolean z = false;
        if (this.codec != null) {
            if (this.callback != null) {
                if (encodedImage.buffer == null) {
                    Logging.m29384e(TAG, "decode() - no input data");
                    return VideoCodecStatus.ERR_PARAMETER;
                }
                int remaining = encodedImage.buffer.remaining();
                if (remaining == 0) {
                    Logging.m29384e(TAG, "decode() - input buffer empty");
                    return VideoCodecStatus.ERR_PARAMETER;
                }
                synchronized (this.dimensionLock) {
                    int i = this.width;
                    int i2 = this.height;
                }
                if (encodedImage.encodedWidth * encodedImage.encodedHeight > 0 && !(encodedImage.encodedWidth == i && encodedImage.encodedHeight == i2)) {
                    VideoCodecStatus reinitDecode = reinitDecode(encodedImage.encodedWidth, encodedImage.encodedHeight);
                    if (reinitDecode != VideoCodecStatus.OK) {
                        return reinitDecode;
                    }
                }
                if (this.keyFrameRequired) {
                    if (encodedImage.frameType != FrameType.VideoFrameKey) {
                        Logging.m29384e(TAG, "decode() - key frame required first");
                        return VideoCodecStatus.NO_OUTPUT;
                    } else if (!encodedImage.completeFrame) {
                        Logging.m29384e(TAG, "decode() - complete frame required first");
                        return VideoCodecStatus.NO_OUTPUT;
                    }
                }
                try {
                    int dequeueInputBuffer = this.codec.dequeueInputBuffer(500000);
                    if (dequeueInputBuffer < 0) {
                        Logging.m29384e(TAG, "decode() - no HW buffers available; decoder falling behind");
                        return VideoCodecStatus.ERROR;
                    }
                    try {
                        ByteBuffer byteBuffer = this.codec.getInputBuffers()[dequeueInputBuffer];
                        if (byteBuffer.capacity() < remaining) {
                            Logging.m29384e(TAG, "decode() - HW buffer too small");
                            return VideoCodecStatus.ERROR;
                        }
                        byteBuffer.put(encodedImage.buffer);
                        this.frameInfos.offer(new FrameInfo(SystemClock.elapsedRealtime(), encodedImage.rotation));
                        try {
                            this.codec.queueInputBuffer(dequeueInputBuffer, 0, remaining, TimeUnit.NANOSECONDS.toMicros(encodedImage.captureTimeNs), 0);
                            if (this.keyFrameRequired) {
                                this.keyFrameRequired = false;
                            }
                            return VideoCodecStatus.OK;
                        } catch (Throwable e) {
                            Logging.m29385e(TAG, "queueInputBuffer failed", e);
                            this.frameInfos.pollLast();
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
        }
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("decode uninitalized, codec: ");
        if (this.codec != null) {
            z = true;
        }
        stringBuilder.append(z);
        stringBuilder.append(", callback: ");
        stringBuilder.append(this.callback);
        Logging.m29383d(str, stringBuilder.toString());
        return VideoCodecStatus.UNINITIALIZED;
    }

    private void deliverByteFrame(int i, BufferInfo bufferInfo, int i2, Integer num) {
        HardwareVideoDecoder hardwareVideoDecoder = this;
        synchronized (this.dimensionLock) {
            int i3 = this.width;
            int i4 = this.height;
            int i5 = hardwareVideoDecoder.stride;
            int i6 = hardwareVideoDecoder.sliceHeight;
        }
        if (bufferInfo.size < ((i3 * i4) * 3) / 2) {
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Insufficient output buffer size: ");
            stringBuilder.append(bufferInfo.size);
            Logging.m29384e(str, stringBuilder.toString());
            return;
        }
        Buffer copyI420Buffer;
        if (bufferInfo.size < ((i5 * i4) * 3) / 2 && i6 == i4 && i5 > i3) {
            i5 = (bufferInfo.size * 2) / (i4 * 3);
        }
        ByteBuffer byteBuffer = hardwareVideoDecoder.codec.getOutputBuffers()[i];
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        ByteBuffer slice = byteBuffer.slice();
        if (hardwareVideoDecoder.colorFormat == 19) {
            copyI420Buffer = copyI420Buffer(slice, i5, i6, i3, i4);
        } else {
            copyI420Buffer = copyNV12ToI420Buffer(slice, i5, i6, i3, i4);
        }
        hardwareVideoDecoder.codec.releaseOutputBuffer(i, false);
        VideoFrame videoFrame = new VideoFrame(copyI420Buffer, i2, bufferInfo.presentationTimeUs * 1000);
        hardwareVideoDecoder.callback.onDecodedFrame(videoFrame, num, null);
        videoFrame.release();
    }

    public static void deliverDecodedFrame(HardwareVideoDecoder hardwareVideoDecoder) {
        hardwareVideoDecoder.outputThreadChecker.checkIsOnValidThread();
        try {
            BufferInfo bufferInfo = new BufferInfo();
            int dequeueOutputBuffer = hardwareVideoDecoder.codec.dequeueOutputBuffer(bufferInfo, 100000);
            if (dequeueOutputBuffer == -2) {
                hardwareVideoDecoder.reformat(hardwareVideoDecoder.codec.getOutputFormat());
            } else if (dequeueOutputBuffer < 0) {
                String str = TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("dequeueOutputBuffer returned ");
                stringBuilder.append(dequeueOutputBuffer);
                Logging.m29386v(str, stringBuilder.toString());
            } else {
                FrameInfo frameInfo = (FrameInfo) hardwareVideoDecoder.frameInfos.poll();
                Integer num = null;
                int i = 0;
                if (frameInfo != null) {
                    num = Integer.valueOf((int) (SystemClock.elapsedRealtime() - frameInfo.decodeStartTimeMs));
                    i = frameInfo.rotation;
                }
                hardwareVideoDecoder.hasDecodedFirstFrame = true;
                if (hardwareVideoDecoder.surfaceTextureHelper != null) {
                    hardwareVideoDecoder.deliverTextureFrame(dequeueOutputBuffer, bufferInfo, i, num);
                } else {
                    hardwareVideoDecoder.deliverByteFrame(dequeueOutputBuffer, bufferInfo, i, num);
                }
            }
        } catch (Throwable e) {
            Logging.m29385e(TAG, "deliverDecodedFrame failed", e);
        }
    }

    private void deliverTextureFrame(int i, BufferInfo bufferInfo, int i2, Integer num) {
        synchronized (this.dimensionLock) {
            try {
                int i3 = this.width;
                int i4 = this.height;
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    break;
                }
            }
        }
        synchronized (this.renderedTextureMetadataLock) {
            try {
                if (this.renderedTextureMetadata == null) {
                    this.renderedTextureMetadata = new DecodedTextureMetadata(i3, i4, i2, bufferInfo.presentationTimeUs, num);
                    this.codec.releaseOutputBuffer(i, true);
                }
            } catch (Throwable th3) {
                th2 = th3;
                throw th2;
            }
        }
    }

    public VideoCodecStatus initDecode(Settings settings, Callback callback) {
        this.decoderThreadChecker = new ThreadChecker();
        this.callback = callback;
        Context context = this.sharedContext;
        if (context != null) {
            this.surfaceTextureHelper = SurfaceTextureHelper.create("decoder-texture-thread", context);
            this.surface = new Surface(this.surfaceTextureHelper.getSurfaceTexture());
            this.surfaceTextureHelper.startListening(this);
        }
        return initDecodeInternal(settings.width, settings.height);
    }

    private org.webrtc.VideoCodecStatus initDecodeInternal(int r7, int r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = r6.decoderThreadChecker;
        r0.checkIsOnValidThread();
        r1 = "HardwareVideoDecoder";
        r0 = "initDecodeInternal";
        org.webrtc.Logging.m29383d(r1, r0);
        r0 = r6.outputThread;
        if (r0 == 0) goto L_0x0018;
    L_0x0010:
        r0 = "initDecodeInternal called while the codec is already running";
        org.webrtc.Logging.m29384e(r1, r0);
        r0 = org.webrtc.VideoCodecStatus.FALLBACK_SOFTWARE;
        return r0;
    L_0x0018:
        r6.width = r7;
        r6.height = r8;
        r6.stride = r7;
        r6.sliceHeight = r8;
        r5 = 0;
        r6.hasDecodedFirstFrame = r5;
        r4 = 1;
        r6.keyFrameRequired = r4;
        r0 = r6.codecName;	 Catch:{ IOException -> 0x0073, IOException -> 0x0073 }
        r0 = android.media.MediaCodec.createByCodecName(r0);	 Catch:{ IOException -> 0x0073, IOException -> 0x0073 }
        r6.codec = r0;	 Catch:{ IOException -> 0x0073, IOException -> 0x0073 }
        r0 = r6.codecType;	 Catch:{ IllegalStateException -> 0x0065 }
        r0 = r0.mimeType();	 Catch:{ IllegalStateException -> 0x0065 }
        r3 = android.media.MediaFormat.createVideoFormat(r0, r7, r8);	 Catch:{ IllegalStateException -> 0x0065 }
        r0 = r6.sharedContext;	 Catch:{ IllegalStateException -> 0x0065 }
        if (r0 != 0) goto L_0x0043;	 Catch:{ IllegalStateException -> 0x0065 }
    L_0x003c:
        r1 = "color-format";	 Catch:{ IllegalStateException -> 0x0065 }
        r0 = r6.colorFormat;	 Catch:{ IllegalStateException -> 0x0065 }
        r3.setInteger(r1, r0);	 Catch:{ IllegalStateException -> 0x0065 }
    L_0x0043:
        r2 = r6.codec;	 Catch:{ IllegalStateException -> 0x0065 }
        r1 = r6.surface;	 Catch:{ IllegalStateException -> 0x0065 }
        r0 = 0;	 Catch:{ IllegalStateException -> 0x0065 }
        r2.configure(r3, r1, r0, r5);	 Catch:{ IllegalStateException -> 0x0065 }
        r0 = r6.codec;	 Catch:{ IllegalStateException -> 0x0065 }
        r0.start();	 Catch:{ IllegalStateException -> 0x0065 }
        r6.running = r4;
        r0 = r6.createOutputThread();
        r6.outputThread = r0;
        r0.start();
        r1 = "HardwareVideoDecoder";
        r0 = "initDecodeInternal done";
        org.webrtc.Logging.m29383d(r1, r0);
        r0 = org.webrtc.VideoCodecStatus.OK;
        return r0;
    L_0x0065:
        r2 = move-exception;
        r1 = "HardwareVideoDecoder";
        r0 = "initDecode failed";
        org.webrtc.Logging.m29385e(r1, r0, r2);
        r6.release();
        r0 = org.webrtc.VideoCodecStatus.FALLBACK_SOFTWARE;
        return r0;
    L_0x0073:
        r2 = "HardwareVideoDecoder";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Cannot create media decoder ";
        r1.append(r0);
        r0 = r6.codecName;
        r1.append(r0);
        r0 = r1.toString();
        org.webrtc.Logging.m29384e(r2, r0);
        r0 = org.webrtc.VideoCodecStatus.FALLBACK_SOFTWARE;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoDecoder.initDecodeInternal(int, int):org.webrtc.VideoCodecStatus");
    }

    private boolean isSupportedColorFormat(int i) {
        for (int i2 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public void onTextureFrameAvailable(int i, float[] fArr, long j) {
        VideoFrame videoFrame;
        int intValue;
        synchronized (this.renderedTextureMetadataLock) {
            if (this.renderedTextureMetadata != null) {
                videoFrame = new VideoFrame(this.surfaceTextureHelper.createTextureBuffer(this.renderedTextureMetadata.width, this.renderedTextureMetadata.height, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr)), this.renderedTextureMetadata.rotation, this.renderedTextureMetadata.presentationTimestampUs * 1000);
                intValue = this.renderedTextureMetadata.decodeTimeMs.intValue();
                this.renderedTextureMetadata = null;
            } else {
                throw new IllegalStateException("Rendered texture metadata was null in onTextureFrameAvailable.");
            }
        }
        this.callback.onDecodedFrame(videoFrame, Integer.valueOf(intValue), null);
        videoFrame.release();
    }

    private void reformat(MediaFormat mediaFormat) {
        int integer;
        int integer2;
        Throwable th;
        this.outputThreadChecker.checkIsOnValidThread();
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Decoder format changed: ");
        stringBuilder.append(mediaFormat.toString());
        Logging.m29383d(str, stringBuilder.toString());
        if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_LEFT) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_RIGHT) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_BOTTOM) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_TOP)) {
            integer = (mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_RIGHT) + 1) - mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_LEFT);
            integer2 = (mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_BOTTOM) + 1) - mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_TOP);
        } else {
            integer = mediaFormat.getInteger("width");
            integer2 = mediaFormat.getInteger("height");
        }
        synchronized (this.dimensionLock) {
            try {
                if (!this.hasDecodedFirstFrame || (this.width == integer && this.height == integer2)) {
                    this.width = integer;
                    this.height = integer2;
                    if (this.surfaceTextureHelper == null && mediaFormat.containsKey("color-format")) {
                        this.colorFormat = mediaFormat.getInteger("color-format");
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Color: 0x");
                        stringBuilder.append(Integer.toHexString(this.colorFormat));
                        Logging.m29383d(str, stringBuilder.toString());
                        if (!isSupportedColorFormat(this.colorFormat)) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Unsupported color format: ");
                            stringBuilder.append(this.colorFormat);
                            stopOnOutputThread(new IllegalStateException(stringBuilder.toString()));
                            return;
                        }
                    }
                    synchronized (this.dimensionLock) {
                        try {
                            if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_STRIDE)) {
                                this.stride = mediaFormat.getInteger(MEDIA_FORMAT_KEY_STRIDE);
                            }
                            if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_SLICE_HEIGHT)) {
                                this.sliceHeight = mediaFormat.getInteger(MEDIA_FORMAT_KEY_SLICE_HEIGHT);
                            }
                            String str2 = TAG;
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Frame stride and slice height: ");
                            stringBuilder.append(this.stride);
                            stringBuilder.append(" x ");
                            stringBuilder.append(this.sliceHeight);
                            Logging.m29383d(str2, stringBuilder.toString());
                            this.stride = Math.max(this.width, this.stride);
                            this.sliceHeight = Math.max(this.height, this.sliceHeight);
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected size change. Configured ");
                stringBuilder.append(this.width);
                stringBuilder.append("*");
                stringBuilder.append(this.height);
                stringBuilder.append(". New ");
                stringBuilder.append(integer);
                stringBuilder.append("*");
                stringBuilder.append(integer2);
                stopOnOutputThread(new RuntimeException(stringBuilder.toString()));
            } catch (Throwable th3) {
                while (true) {
                    th = th3;
                    break;
                }
            }
        }
    }

    private VideoCodecStatus reinitDecode(int i, int i2) {
        this.decoderThreadChecker.checkIsOnValidThread();
        VideoCodecStatus releaseInternal = releaseInternal();
        if (releaseInternal != VideoCodecStatus.OK) {
            return releaseInternal;
        }
        return initDecodeInternal(i, i2);
    }

    public VideoCodecStatus release() {
        Logging.m29383d(TAG, "release");
        VideoCodecStatus releaseInternal = releaseInternal();
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
            this.surface = null;
            this.surfaceTextureHelper.stopListening();
            this.surfaceTextureHelper.dispose();
            this.surfaceTextureHelper = null;
        }
        synchronized (this.renderedTextureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.callback = null;
        this.frameInfos.clear();
        return releaseInternal;
    }

    public static void releaseCodecOnOutputThread(HardwareVideoDecoder hardwareVideoDecoder) {
        hardwareVideoDecoder.outputThreadChecker.checkIsOnValidThread();
        String str = TAG;
        Logging.m29383d(str, "Releasing MediaCodec on output thread");
        try {
            hardwareVideoDecoder.codec.stop();
        } catch (Throwable e) {
            Logging.m29385e(str, "Media decoder stop failed", e);
        }
        try {
            hardwareVideoDecoder.codec.release();
        } catch (Throwable e2) {
            Logging.m29385e(str, "Media decoder release failed", e2);
            hardwareVideoDecoder.shutdownException = e2;
        }
        Logging.m29383d(str, "Release on output thread done");
    }

    private VideoCodecStatus releaseInternal() {
        if (this.running) {
            try {
                VideoCodecStatus videoCodecStatus;
                this.running = false;
                if (!ThreadUtils.joinUninterruptibly(this.outputThread, 5000)) {
                    Logging.m29385e(TAG, "Media decoder release timeout", new RuntimeException());
                    videoCodecStatus = VideoCodecStatus.TIMEOUT;
                } else if (this.shutdownException != null) {
                    Logging.m29385e(TAG, "Media decoder release error", new RuntimeException(this.shutdownException));
                    this.shutdownException = null;
                    videoCodecStatus = VideoCodecStatus.ERROR;
                } else {
                    this.codec = null;
                    this.outputThread = null;
                    return VideoCodecStatus.OK;
                }
                this.codec = null;
                this.outputThread = null;
                return videoCodecStatus;
            } catch (Throwable th) {
                this.codec = null;
                this.outputThread = null;
            }
        } else {
            Logging.m29383d(TAG, "release: Decoder is not running.");
            return VideoCodecStatus.OK;
        }
    }

    private void stopOnOutputThread(Exception exception) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exception;
    }
}

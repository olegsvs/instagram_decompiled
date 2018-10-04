package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.VideoFrame.Buffer;
import org.webrtc.VideoFrame.I420Buffer;
import org.webrtc.VideoFrame.TextureBuffer;
import org.webrtc.VideoFrame.TextureBuffer.Type;

public class VideoRenderer {
    public long nativeVideoRenderer;

    public interface Callbacks {
        void renderFrame(I420Frame i420Frame);
    }

    public class I420Frame {
        private final Buffer backingBuffer;
        public final int height;
        public long nativeFramePointer;
        public int rotationDegree;
        public final float[] samplingMatrix;
        public int textureId;
        public final int width;
        public final boolean yuvFrame;
        public ByteBuffer[] yuvPlanes;
        public final int[] yuvStrides;

        public I420Frame(int i, int i2, int i3, int i4, float[] fArr, long j) {
            this.width = i;
            this.height = i2;
            this.yuvStrides = null;
            this.yuvPlanes = null;
            this.samplingMatrix = fArr;
            this.textureId = i4;
            this.yuvFrame = false;
            this.rotationDegree = i3;
            this.nativeFramePointer = j;
            this.backingBuffer = null;
            if (i3 % 90 != 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Rotation degree not multiple of 90: ");
                stringBuilder.append(i3);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }

        public I420Frame(int i, int i2, int i3, int[] iArr, ByteBuffer[] byteBufferArr, long j) {
            this.width = i;
            this.height = i2;
            this.yuvStrides = iArr;
            this.yuvPlanes = byteBufferArr;
            this.yuvFrame = true;
            this.rotationDegree = i3;
            this.nativeFramePointer = j;
            this.backingBuffer = null;
            if (i3 % 90 == 0) {
                this.samplingMatrix = RendererCommon.verticalFlipMatrix();
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Rotation degree not multiple of 90: ");
            stringBuilder.append(i3);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public I420Frame(int i, Buffer buffer, long j) {
            this.width = buffer.getWidth();
            this.height = buffer.getHeight();
            this.rotationDegree = i;
            if (i % 90 == 0) {
                if (buffer instanceof TextureBuffer) {
                    TextureBuffer textureBuffer = (TextureBuffer) buffer;
                    if (textureBuffer.getType() == Type.OES) {
                        this.yuvFrame = false;
                        this.textureId = textureBuffer.getTextureId();
                        this.samplingMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBuffer.getTransformMatrix());
                        this.yuvStrides = null;
                        this.yuvPlanes = null;
                        this.nativeFramePointer = j;
                        this.backingBuffer = buffer;
                        return;
                    }
                }
                if (buffer instanceof I420Buffer) {
                    I420Buffer i420Buffer = (I420Buffer) buffer;
                    this.yuvFrame = true;
                    this.yuvStrides = new int[]{i420Buffer.getStrideY(), i420Buffer.getStrideU(), i420Buffer.getStrideV()};
                    this.yuvPlanes = new ByteBuffer[]{i420Buffer.getDataY(), i420Buffer.getDataU(), i420Buffer.getDataV()};
                    this.samplingMatrix = RendererCommon.verticalFlipMatrix();
                    this.textureId = 0;
                } else {
                    this.yuvFrame = false;
                    this.textureId = 0;
                    this.samplingMatrix = null;
                    this.yuvStrides = null;
                    this.yuvPlanes = null;
                }
                this.nativeFramePointer = j;
                this.backingBuffer = buffer;
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Rotation degree not multiple of 90: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public static I420Frame createI420Frame(int i, int i2, int i3, int i4, ByteBuffer byteBuffer, int i5, ByteBuffer byteBuffer2, int i6, ByteBuffer byteBuffer3, long j) {
            return new I420Frame(i, i2, i3, new int[]{i4, i5, i6}, new ByteBuffer[]{byteBuffer, byteBuffer2, byteBuffer3}, j);
        }

        public int rotatedHeight() {
            return this.rotationDegree % 180 == 0 ? this.height : this.width;
        }

        public int rotatedWidth() {
            return this.rotationDegree % 180 == 0 ? this.width : this.height;
        }

        public String toString() {
            String stringBuilder;
            StringBuilder stringBuilder2;
            if (this.yuvFrame) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Y: ");
                stringBuilder3.append(this.yuvStrides[0]);
                stringBuilder3.append(", U: ");
                stringBuilder3.append(this.yuvStrides[1]);
                stringBuilder3.append(", V: ");
                stringBuilder3.append(this.yuvStrides[2]);
                stringBuilder = stringBuilder3.toString();
            } else {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Texture: ");
                stringBuilder2.append(this.textureId);
                stringBuilder = stringBuilder2.toString();
            }
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(this.width);
            stringBuilder2.append("x");
            stringBuilder2.append(this.height);
            stringBuilder2.append(", ");
            stringBuilder2.append(stringBuilder);
            return stringBuilder2.toString();
        }

        public VideoFrame toVideoFrame() {
            Buffer buffer;
            Buffer buffer2 = this.backingBuffer;
            if (buffer2 != null) {
                buffer2.retain();
                VideoRenderer.renderFrameDone(this);
                buffer = this.backingBuffer;
            } else if (this.yuvFrame) {
                int i = this.width;
                int i2 = this.height;
                ByteBuffer[] byteBufferArr = this.yuvPlanes;
                ByteBuffer byteBuffer = byteBufferArr[0];
                int[] iArr = this.yuvStrides;
                buffer = JavaI420Buffer.wrap(i, i2, byteBuffer, iArr[0], byteBufferArr[1], iArr[1], byteBufferArr[2], iArr[2], new -$$Lambda$VideoRenderer$I420Frame$8Y6fPWpiKPpBpaEooUIl-xhtFOM());
            } else {
                buffer = new TextureBufferImpl(this.width, this.height, Type.OES, this.textureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(this.samplingMatrix), null, null, new -$$Lambda$VideoRenderer$I420Frame$dgskWdlR2arV2Ew3x8m11GD3jac());
            }
            return new VideoFrame(buffer, this.rotationDegree, 0);
        }
    }

    private static native long nativeCreateVideoRenderer(Callbacks callbacks);

    private static native void nativeFreeWrappedVideoRenderer(long j);

    private static native void nativeReleaseFrame(long j);

    public VideoRenderer(Callbacks callbacks) {
        this.nativeVideoRenderer = nativeCreateVideoRenderer(callbacks);
    }

    public void dispose() {
        long j = this.nativeVideoRenderer;
        if (j != 0) {
            nativeFreeWrappedVideoRenderer(j);
            this.nativeVideoRenderer = 0;
        }
    }

    public static void renderFrameDone(I420Frame i420Frame) {
        i420Frame.yuvPlanes = null;
        i420Frame.textureId = 0;
        if (i420Frame.nativeFramePointer != 0) {
            nativeReleaseFrame(i420Frame.nativeFramePointer);
            i420Frame.nativeFramePointer = 0;
        }
    }
}

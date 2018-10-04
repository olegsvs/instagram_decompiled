package org.webrtc;

import android.graphics.Matrix;
import java.nio.ByteBuffer;

public class VideoFrame implements RefCounted {
    private final Buffer buffer;
    private final int rotation;
    private final long timestampNs;

    public interface Buffer extends RefCounted {
        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        int getHeight();

        int getWidth();

        void release();

        void retain();

        I420Buffer toI420();
    }

    public interface I420Buffer extends Buffer {
        ByteBuffer getDataU();

        ByteBuffer getDataV();

        ByteBuffer getDataY();

        int getStrideU();

        int getStrideV();

        int getStrideY();
    }

    public interface TextureBuffer extends Buffer {

        public enum Type {
            OES(36197),
            RGB(3553);
            
            private final int glTarget;

            private Type(int i) {
                this.glTarget = i;
            }

            public int getGlTarget() {
                return this.glTarget;
            }
        }

        int getTextureId();

        Matrix getTransformMatrix();

        Type getType();
    }

    private static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, ByteBuffer byteBuffer4, int i8, ByteBuffer byteBuffer5, int i9, ByteBuffer byteBuffer6, int i10, int i11, int i12);

    public VideoFrame(Buffer buffer, int i, long j) {
        if (buffer == null) {
            throw new IllegalArgumentException("buffer not allowed to be null");
        } else if (i % 90 == 0) {
            this.buffer = buffer;
            this.rotation = i;
            this.timestampNs = j;
        } else {
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
    }

    public static Buffer cropAndScaleI420(I420Buffer i420Buffer, int i, int i2, int i3, int i4, int i5, int i6) {
        I420Buffer i420Buffer2 = i420Buffer;
        int i7 = i;
        int i8 = i2;
        int i9 = i3;
        int i10 = i4;
        int i11 = i5;
        int i12 = i6;
        if (i9 == i11 && i10 == i12) {
            ByteBuffer dataY = i420Buffer.getDataY();
            ByteBuffer dataU = i420Buffer.getDataU();
            ByteBuffer dataV = i420Buffer.getDataV();
            dataY.position(i + (i420Buffer.getStrideY() * i2));
            int i13 = i / 2;
            i11 = i2 / 2;
            dataU.position((i420Buffer.getStrideU() * i11) + i13);
            dataV.position(i13 + (i11 * i420Buffer.getStrideV()));
            i420Buffer.retain();
            int width = i420Buffer.getWidth();
            int height = i420Buffer.getHeight();
            ByteBuffer slice = dataY.slice();
            i7 = i420Buffer.getStrideY();
            ByteBuffer slice2 = dataU.slice();
            i9 = i420Buffer.getStrideU();
            ByteBuffer slice3 = dataV.slice();
            int strideV = i420Buffer.getStrideV();
            i420Buffer.getClass();
            return JavaI420Buffer.wrap(width, height, slice, i7, slice2, i9, slice3, strideV, new -$$Lambda$cpstbe6pEi-a9uN5WMp-TN86PFo(i420Buffer2));
        }
        Buffer allocate = JavaI420Buffer.allocate(i11, i12);
        nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i7, i8, i9, i10, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV(), i5, i6);
        return allocate;
    }

    public Buffer getBuffer() {
        return this.buffer;
    }

    public int getRotatedHeight() {
        if (this.rotation % 180 == 0) {
            return this.buffer.getHeight();
        }
        return this.buffer.getWidth();
    }

    public int getRotatedWidth() {
        if (this.rotation % 180 == 0) {
            return this.buffer.getWidth();
        }
        return this.buffer.getHeight();
    }

    public int getRotation() {
        return this.rotation;
    }

    public long getTimestampNs() {
        return this.timestampNs;
    }

    public void release() {
        this.buffer.release();
    }

    public void retain() {
        this.buffer.retain();
    }
}

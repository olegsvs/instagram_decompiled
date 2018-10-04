package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.VideoFrame.Buffer;
import org.webrtc.VideoFrame.I420Buffer;

public class JavaI420Buffer implements I420Buffer {
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    private JavaI420Buffer(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable) {
        this.width = i;
        this.height = i2;
        this.dataY = byteBuffer;
        this.dataU = byteBuffer2;
        this.dataV = byteBuffer3;
        this.strideY = i3;
        this.strideU = i4;
        this.strideV = i5;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public static JavaI420Buffer allocate(int i, int i2) {
        int i3 = i2;
        int i4 = (i2 + 1) / 2;
        int i5 = i;
        int i6 = (i + 1) / 2;
        int i7 = i * i2;
        int i8 = i6 * i4;
        int i9 = i7 + i8;
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(((i6 * 2) * i4) + i7);
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i7);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i7);
        nativeAllocateByteBuffer.limit(i9);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i9);
        nativeAllocateByteBuffer.limit(i9 + i8);
        return new JavaI420Buffer(i5, i3, slice, i, slice2, i6, nativeAllocateByteBuffer.slice(), i6, new -$$Lambda$JavaI420Buffer$_Oc35sRrucoGcYlFFmf5S-RP8fI(nativeAllocateByteBuffer));
    }

    public Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return VideoFrame.cropAndScaleI420(this, i, i2, i3, i4, i5, i6);
    }

    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    public int getHeight() {
        return this.height;
    }

    public int getStrideU() {
        return this.strideU;
    }

    public int getStrideV() {
        return this.strideV;
    }

    public int getStrideY() {
        return this.strideY;
    }

    public int getWidth() {
        return this.width;
    }

    public void release() {
        this.refCountDelegate.release();
    }

    public void retain() {
        this.refCountDelegate.retain();
    }

    public I420Buffer toI420() {
        retain();
        return this;
    }

    public static JavaI420Buffer wrap(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable) {
        if (byteBuffer == null || byteBuffer2 == null || byteBuffer3 == null) {
            throw new IllegalArgumentException("Data buffers cannot be null.");
        } else if (byteBuffer.isDirect() && byteBuffer2.isDirect() && byteBuffer3.isDirect()) {
            byteBuffer = byteBuffer.slice();
            byteBuffer2 = byteBuffer2.slice();
            byteBuffer3 = byteBuffer3.slice();
            int i6 = (i2 + 1) / 2;
            int i7 = i3 * i2;
            int i8 = i4 * i6;
            i6 *= i5;
            StringBuilder stringBuilder;
            if (byteBuffer.capacity() < i7) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Y-buffer must be at least ");
                stringBuilder.append(i7);
                stringBuilder.append(" bytes.");
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (byteBuffer2.capacity() < i8) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("U-buffer must be at least ");
                stringBuilder.append(i8);
                stringBuilder.append(" bytes.");
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (byteBuffer3.capacity() >= i6) {
                return new JavaI420Buffer(i, i2, byteBuffer, i3, byteBuffer2, i4, byteBuffer3, i5, runnable);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("V-buffer must be at least ");
                stringBuilder.append(i6);
                stringBuilder.append(" bytes.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        } else {
            throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
        }
    }
}

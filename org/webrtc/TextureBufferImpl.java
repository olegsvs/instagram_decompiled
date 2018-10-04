package org.webrtc;

import android.graphics.Matrix;
import android.os.Handler;
import org.webrtc.VideoFrame.Buffer;
import org.webrtc.VideoFrame.I420Buffer;
import org.webrtc.VideoFrame.TextureBuffer;
import org.webrtc.VideoFrame.TextureBuffer.Type;

public class TextureBufferImpl implements TextureBuffer {
    private final int height;
    private final int id;
    private final RefCountDelegate refCountDelegate;
    private final Handler toI420Handler;
    private final Matrix transformMatrix;
    private final Type type;
    private final int width;
    private final YuvConverter yuvConverter;

    public TextureBufferImpl(int i, int i2, Type type, int i3, Matrix matrix, Handler handler, YuvConverter yuvConverter, Runnable runnable) {
        this.width = i;
        this.height = i2;
        this.type = type;
        this.id = i3;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        Matrix matrix = new Matrix(this.transformMatrix);
        matrix.preTranslate(((float) i) / ((float) this.width), ((float) i2) / ((float) this.height));
        matrix.preScale(((float) i3) / ((float) this.width), ((float) i4) / ((float) this.height));
        retain();
        return new TextureBufferImpl(i5, i6, this.type, this.id, matrix, this.toI420Handler, this.yuvConverter, new -$$Lambda$9teQ5BwuCad-aBl5uXiVcJ4zLnU());
    }

    public int getHeight() {
        return this.height;
    }

    public int getTextureId() {
        return this.id;
    }

    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    public Type getType() {
        return this.type;
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
        return (I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new -$$Lambda$TextureBufferImpl$LiRTMmF7eRfFNZfCJkIBMN6wcLQ());
    }
}

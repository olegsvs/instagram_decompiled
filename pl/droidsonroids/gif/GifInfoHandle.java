package pl.droidsonroids.gif;

import X.AnonymousClass0CF;
import android.graphics.Bitmap;
import android.view.Surface;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class GifInfoHandle {
    private volatile long gifInfoPtr;

    private static native void bindSurface(long j, Surface surface, long[] jArr);

    private static native void free(long j);

    private static native long getAllocationByteCount(long j);

    private static native String getComment(long j);

    private static native int getCurrentFrameIndex(long j);

    private static native int getCurrentLoop(long j);

    private static native int getCurrentPosition(long j);

    private static native int getDuration(long j);

    private static native int getFrameDuration(long j, int i);

    private static native int getHeight(long j);

    private static native int getLoopCount(long j);

    private static native long getMetadataByteCount(long j);

    private static native int getNativeErrorCode(long j);

    private static native int getNumberOfFrames(long j);

    private static native long[] getSavedState(long j);

    private static native long getSourceLength(long j);

    private static native int getWidth(long j);

    private static native void glTexImage2D(long j, int i, int i2);

    private static native void glTexSubImage2D(long j, int i, int i2);

    private static native void initTexImageDescriptor(long j);

    private static native boolean isAnimationCompleted(long j);

    private static native boolean isOpaque(long j);

    public static native long openByteArray(byte[] bArr);

    public static native long openDirectByteBuffer(ByteBuffer byteBuffer);

    public static native long openFd(FileDescriptor fileDescriptor, long j);

    public static native long openFile(String str);

    public static native long openStream(InputStream inputStream);

    private static native void postUnbindSurface(long j);

    private static native long renderFrame(long j, Bitmap bitmap);

    private static native boolean reset(long j);

    private static native long restoreRemainder(long j);

    private static native int restoreSavedState(long j, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j);

    private static native void seekToFrame(long j, int i, Bitmap bitmap);

    private static native void seekToFrameGL(long j, int i);

    private static native void seekToTime(long j, int i, Bitmap bitmap);

    private static native void setLoopCount(long j, char c);

    private static native void setOptions(long j, char c, boolean z);

    private static native void setSpeedFactor(long j, float f);

    private static native void startDecoderThread(long j);

    private static native void stopDecoderThread(long j);

    static {
        AnonymousClass0CF.E("pl_droidsonroids_gif");
    }

    public GifInfoHandle(String str) {
        this.gifInfoPtr = openFile(str);
    }

    public final void finalize() {
        try {
            recycle();
        } finally {
            super.finalize();
        }
    }

    public final synchronized int getCurrentFrameIndex() {
        return getCurrentFrameIndex(this.gifInfoPtr);
    }

    public final synchronized int getDuration() {
        return getDuration(this.gifInfoPtr);
    }

    public final synchronized int getFrameDuration(int i) {
        throwIfFrameIndexOutOfBounds(i);
        return getFrameDuration(this.gifInfoPtr, i);
    }

    public final synchronized int getHeight() {
        return getHeight(this.gifInfoPtr);
    }

    public final synchronized int getWidth() {
        return getWidth(this.gifInfoPtr);
    }

    public final synchronized void recycle() {
        free(this.gifInfoPtr);
        this.gifInfoPtr = 0;
    }

    public final synchronized void seekToTime(int i, Bitmap bitmap) {
        seekToTime(this.gifInfoPtr, i, bitmap);
    }

    private void throwIfFrameIndexOutOfBounds(int i) {
        float numberOfFrames = (float) getNumberOfFrames(this.gifInfoPtr);
        if (i < 0 || ((float) i) >= numberOfFrames) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Frame index is not in range <0;");
            stringBuilder.append(numberOfFrames);
            stringBuilder.append('>');
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
    }
}

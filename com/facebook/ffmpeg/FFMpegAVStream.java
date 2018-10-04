package com.facebook.ffmpeg;

import X.AnonymousClass1tB;
import java.nio.ByteBuffer;

public class FFMpegAVStream {
    private long mNativeContext;

    private native void nativeFinalize();

    private native void nativeSetOrientationHint(int i);

    private native void nativeWriteFrame(FFMpegBufferInfo fFMpegBufferInfo, ByteBuffer byteBuffer, int i);

    public FFMpegAVStream(long j) {
        this.mNativeContext = j;
    }

    public final void finalize() {
        super.finalize();
        nativeFinalize();
    }

    public final void setOrientationHint(int i) {
        Object obj;
        if (!(i == 0 || i == 90 || i == 180)) {
            if (i != 270) {
                obj = null;
                if (obj == null) {
                    nativeSetOrientationHint(i);
                }
                throw new IllegalArgumentException();
            }
        }
        obj = 1;
        if (obj == null) {
            throw new IllegalArgumentException();
        }
        nativeSetOrientationHint(i);
    }

    public final void writeFrame(FFMpegBufferInfo fFMpegBufferInfo, ByteBuffer byteBuffer) {
        writeFrame(fFMpegBufferInfo, byteBuffer, -1);
    }

    public final void writeFrame(FFMpegBufferInfo fFMpegBufferInfo, ByteBuffer byteBuffer, int i) {
        AnonymousClass1tB.m13606B(fFMpegBufferInfo);
        AnonymousClass1tB.m13606B(byteBuffer);
        nativeWriteFrame(fFMpegBufferInfo, byteBuffer, i);
    }
}

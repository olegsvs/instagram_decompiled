package com.instagram.util.jpeg;

import X.AnonymousClass0LH;

public class NativeImage {
    private int mBufferId;
    private long mBufferPtr;
    private int mHeight;
    private int mWidth;

    public NativeImage(int i, int i2, int i3) {
        this(i, i2, i3, 0);
    }

    public NativeImage(int i, int i2, int i3, long j) {
        this.mBufferId = i;
        this.mWidth = i2;
        this.mHeight = i3;
        this.mBufferPtr = j;
    }

    public void assertDimensions(int i, int i2) {
        boolean z = true;
        AnonymousClass0LH.B(getWidth() == i);
        if (getHeight() != i2) {
            z = false;
        }
        AnonymousClass0LH.B(z);
    }

    public int getBufferId() {
        return this.mBufferId;
    }

    public long getBufferPtr() {
        return this.mBufferPtr;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }
}

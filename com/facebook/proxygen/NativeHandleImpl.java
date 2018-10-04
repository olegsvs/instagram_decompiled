package com.facebook.proxygen;

import com.facebook.proxygen.utils.Preconditions;

public class NativeHandleImpl implements NativeHandle {
    private long mNativeHandle;

    public long getNativeHandle() {
        return this.mNativeHandle;
    }

    public void setNativeHandle(long j) {
        boolean z;
        if (this.mNativeHandle != 0) {
            if (j != 0) {
                z = false;
                Preconditions.checkState(z);
                this.mNativeHandle = j;
            }
        }
        z = true;
        Preconditions.checkState(z);
        this.mNativeHandle = j;
    }
}

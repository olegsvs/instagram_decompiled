package com.facebook.react.common;

import X.AnonymousClass0KZ;

public final class ClearableSynchronizedPool implements AnonymousClass0KZ {
    private final Object[] mPool;
    private int mSize = 0;

    public ClearableSynchronizedPool(int i) {
        this.mPool = new Object[i];
    }

    public final synchronized Object acquire() {
        if (this.mSize == 0) {
            return null;
        }
        this.mSize--;
        int i = this.mSize;
        Object obj = this.mPool[i];
        this.mPool[i] = null;
        return obj;
    }

    public final synchronized void clear() {
        for (int i = 0; i < this.mSize; i++) {
            this.mPool[i] = null;
        }
        this.mSize = 0;
    }

    public final synchronized boolean release(Object obj) {
        if (this.mSize == this.mPool.length) {
            return false;
        }
        this.mPool[this.mSize] = obj;
        this.mSize++;
        return true;
    }
}

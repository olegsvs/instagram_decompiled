package com.facebook.react.bridge;

public final class JavaScriptContextHolder {
    private long mContext;

    public JavaScriptContextHolder(long j) {
        this.mContext = j;
    }

    public final synchronized void clear() {
        this.mContext = 0;
    }
}

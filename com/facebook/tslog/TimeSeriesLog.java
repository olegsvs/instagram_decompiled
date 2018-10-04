package com.facebook.tslog;

import X.AnonymousClass0CF;

public class TimeSeriesLog {
    public long nativeTSLog;

    private static native void nativeDispose(long j);

    private static native void nativeFlushBucket(long j);

    private static native long nativeInit(String str, int i, long j);

    private static native void nativeStart(long j);

    private static native void nativeStop(long j);

    private static native String nativeToString(long j);

    static {
        AnonymousClass0CF.E("tslog-jni");
    }

    public TimeSeriesLog(String str, int i) {
        this(str, i, 0);
    }

    public TimeSeriesLog(String str, int i, long j) {
        this.nativeTSLog = nativeInit(str, i, j);
        Long.valueOf(this.nativeTSLog);
    }

    public final void dispose() {
        nativeDispose(this.nativeTSLog);
    }

    public final void flushBucket() {
        nativeFlushBucket(this.nativeTSLog);
    }

    public final String getString() {
        return nativeToString(this.nativeTSLog);
    }

    public final void start() {
        nativeStart(this.nativeTSLog);
    }

    public final void stop() {
        nativeStop(this.nativeTSLog);
    }
}

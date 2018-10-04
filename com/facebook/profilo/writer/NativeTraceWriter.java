package com.facebook.profilo.writer;

import X.AnonymousClass0CF;
import com.facebook.jni.HybridData;

public final class NativeTraceWriter {
    private HybridData mHybridData;

    private static native HybridData initHybrid(String str, String str2, NativeTraceWriterCallbacks nativeTraceWriterCallbacks);

    public native String getTraceFolder(long j);

    public native void loop();

    static {
        AnonymousClass0CF.m856E("profilo");
    }

    public NativeTraceWriter(String str, String str2, NativeTraceWriterCallbacks nativeTraceWriterCallbacks) {
        this.mHybridData = initHybrid(str, str2, nativeTraceWriterCallbacks);
    }
}

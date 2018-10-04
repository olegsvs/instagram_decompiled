package com.facebook.jsi;

import X.AnonymousClass0CF;
import com.facebook.jni.HybridData;
import java.nio.charset.Charset;

public class JSRuntime implements AutoCloseable {
    private final HybridData mHybridData;

    public static native byte[] compileJavaScript(byte[] bArr);

    public static native JSRuntime makeCustomJSCRuntime(boolean z);

    public static native JSRuntime makeCustomJSCRuntimeWithHeapSpec(long j, boolean z);

    public static native JSRuntime makeHermesRuntime(boolean z);

    public static native JSRuntime makeHermesRuntimeWithHeapSpec(long j, long j2, boolean z);

    public native void callFunction(String str);

    public native void evaluateJavaScript(byte[] bArr);

    public native void evaluateJavaScriptFile(String str);

    public native int getGlobalNumberProperty(String str);

    public native String getGlobalStringProperty(String str);

    public native String getRecordedGCStats();

    public native void setGlobalNumberProperty(String str, int i);

    public native void setGlobalStringProperty(String str, String str2);

    static {
        AnonymousClass0CF.E("jsijni");
    }

    private JSRuntime(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public final void close() {
        this.mHybridData.resetNative();
    }

    public final void evaluateJavaScript(String str) {
        evaluateJavaScript(str.getBytes(Charset.forName("UTF-8")));
    }

    public static JSRuntime makeCustomJSCRuntime() {
        return makeCustomJSCRuntime(false);
    }
}

package com.facebook.react.bridge;

import com.facebook.jni.HybridData;

public class JSCJavaScriptExecutor extends JavaScriptExecutor {
    private static native HybridData initHybrid(ReadableNativeMap readableNativeMap);

    public final String getName() {
        return "JSCJavaScriptExecutor";
    }

    static {
        ReactBridge.staticInit();
    }

    public JSCJavaScriptExecutor(ReadableNativeMap readableNativeMap) {
        super(initHybrid(readableNativeMap));
    }
}

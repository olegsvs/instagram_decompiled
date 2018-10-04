package com.facebook.react.bridge;

import com.facebook.jni.HybridData;

public class ProxyJavaScriptExecutor extends JavaScriptExecutor {
    private static native HybridData initHybrid(JavaJSExecutor javaJSExecutor);

    public final String getName() {
        return "ProxyJavaScriptExecutor";
    }

    static {
        ReactBridge.staticInit();
    }
}

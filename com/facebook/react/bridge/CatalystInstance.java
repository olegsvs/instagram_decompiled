package com.facebook.react.bridge;

import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import java.util.List;

public interface CatalystInstance extends JSInstance, MemoryPressureListener {
    void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener);

    void addJSIModules(List list);

    void callFunction(String str, String str2, NativeArray nativeArray);

    void destroy();

    JSIModule getJSIModule(Class cls);

    JavaScriptModule getJSModule(Class cls);

    JavaScriptContextHolder getJavaScriptContextHolder();

    NativeModule getNativeModule(Class cls);

    ReactQueueConfiguration getReactQueueConfiguration();

    String getSourceURL();

    void initialize();

    void invokeCallback(int i, NativeArrayInterface nativeArrayInterface);

    boolean isDestroyed();

    void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener);

    void runJSBundle();

    void setGlobalVariable(String str, String str2);
}

package com.facebook.react.bridge;

public final class JSCJavaScriptExecutorFactory implements JavaScriptExecutorFactory {
    private final String mAppName;
    private final String mDeviceName;

    public final String toString() {
        return "JSCExecutor";
    }

    public JSCJavaScriptExecutorFactory(String str, String str2) {
        this.mAppName = str;
        this.mDeviceName = str2;
    }

    public final JavaScriptExecutor create() {
        ReadableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("OwnerIdentity", "ReactNative");
        writableNativeMap.putString("AppIdentity", this.mAppName);
        writableNativeMap.putString("DeviceIdentity", this.mDeviceName);
        return new JSCJavaScriptExecutor(writableNativeMap);
    }
}

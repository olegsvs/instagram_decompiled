package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;

public abstract class NativeAnalyticsFunnelLoggerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec {
    @ReactMethod
    public abstract void addActionToFunnel(String str, double d, String str2, String str3, ReadableMap readableMap);

    @ReactMethod
    public abstract void addFunnelTag(String str, double d, String str2);

    @ReactMethod
    public abstract void cancelFunnel(String str, double d);

    @ReactMethod
    public abstract void endFunnel(String str, double d);

    @ReactMethod
    public abstract void startFunnel(String str, double d);

    @ReactMethod
    public void startFunnel_DEV_MODE(String str, double d) {
    }

    public NativeAnalyticsFunnelLoggerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}

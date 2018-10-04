package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;

public abstract class NativeAnalyticsSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec {
    @ReactMethod
    public abstract void logCounter(String str, double d);

    @ReactMethod
    public abstract void logEvent(String str, ReadableMap readableMap, String str2);

    @ReactMethod
    public abstract void logRealtimeEvent(String str, ReadableMap readableMap, String str2);

    public NativeAnalyticsSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}

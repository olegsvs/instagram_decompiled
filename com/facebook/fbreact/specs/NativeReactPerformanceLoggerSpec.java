package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;

public abstract class NativeReactPerformanceLoggerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec {
    @ReactMethod
    public abstract void logEvents(ReadableMap readableMap);

    public NativeReactPerformanceLoggerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}

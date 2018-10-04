package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;

public abstract class NativeIGReactAPISpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec {
    @ReactMethod
    public abstract void get(String str, ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void post(String str, ReadableMap readableMap, Promise promise);

    public NativeIGReactAPISpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}

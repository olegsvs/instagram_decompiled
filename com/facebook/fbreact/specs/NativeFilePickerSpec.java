package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;

public abstract class NativeFilePickerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec {
    @ReactMethod
    public void listProviders(ReadableMap readableMap, Callback callback) {
    }

    @ReactMethod
    public abstract void pick(ReadableMap readableMap, Callback callback);

    public NativeFilePickerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}

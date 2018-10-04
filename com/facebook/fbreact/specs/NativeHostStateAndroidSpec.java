package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;

public abstract class NativeHostStateAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec {
    @ReactMethod
    public abstract void getCurrentHostState(Callback callback, Callback callback2);

    public NativeHostStateAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}

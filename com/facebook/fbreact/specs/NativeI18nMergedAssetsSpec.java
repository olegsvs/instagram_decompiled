package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;

public abstract class NativeI18nMergedAssetsSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec {
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getString(double d);

    public NativeI18nMergedAssetsSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}

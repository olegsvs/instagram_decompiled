package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;

public abstract class NativeIGBrandedContentReactModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec {
    @ReactMethod
    public abstract void updateWhitelistSettings(boolean z, String str, String str2, Promise promise);

    public NativeIGBrandedContentReactModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}

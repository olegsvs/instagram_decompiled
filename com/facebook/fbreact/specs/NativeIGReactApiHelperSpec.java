package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;

public abstract class NativeIGReactApiHelperSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec {
    @ReactMethod
    public abstract void getApiUrlWithPath(String str, Promise promise);

    @ReactMethod
    public abstract void getHttpHeaders(Promise promise);

    public NativeIGReactApiHelperSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}

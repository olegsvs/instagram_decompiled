package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;

public abstract class NativeIGSharedPreferencesModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec {
    @ReactMethod
    public abstract void getBoolean(String str, String str2, boolean z, Promise promise);

    @ReactMethod
    public abstract void getString(String str, String str2, String str3, Promise promise);

    public NativeIGSharedPreferencesModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}

package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import java.util.Map;

public abstract class NativeRelayConfigSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec {
    @ReactMethod
    public void getSandbox(Callback callback) {
    }

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public void setSandbox(String str) {
    }

    public NativeRelayConfigSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public final Map getConstants() {
        return getTypedExportedConstants();
    }
}

package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import java.util.Map;

public abstract class NativeIGReactAlertBarSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec {
    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void showErrors(ReadableMap readableMap);

    @ReactMethod
    public abstract void showMessage(String str, double d);

    public NativeIGReactAlertBarSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public final Map getConstants() {
        return getTypedExportedConstants();
    }
}

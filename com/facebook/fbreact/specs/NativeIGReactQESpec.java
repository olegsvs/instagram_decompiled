package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import java.util.Map;

public abstract class NativeIGReactQESpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec {
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean booleanValueForConfiguration(String str, String str2, String str3, String str4, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean booleanValueForUniverse(String str, String str2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract double doubleValueForConfiguration(String str, String str2, String str3, String str4, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract double doubleValueForUniverse(String str, String str2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean exposeValueForBoolExperiment(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String exposeValueForExperiment(String str);

    public abstract Map getTypedExportedConstants();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract double integerValueForConfiguration(String str, String str2, String str3, String str4, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract double integerValueForUniverse(String str, String str2, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String stringValueForConfiguration(String str, String str2, String str3, String str4, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String stringValueForUniverse(String str, String str2, boolean z);

    public NativeIGReactQESpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public final Map getConstants() {
        return getTypedExportedConstants();
    }
}

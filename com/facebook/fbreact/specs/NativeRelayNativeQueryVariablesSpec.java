package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactModuleWithSpec;
import java.util.Map;

public abstract class NativeRelayNativeQueryVariablesSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec {
    public abstract Map getTypedExportedConstants();

    public NativeRelayNativeQueryVariablesSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public final Map getConstants() {
        return getTypedExportedConstants();
    }
}

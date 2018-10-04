package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.Map;

public abstract class NativeNavigationSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec {
    @ReactMethod
    public abstract void clearRightBarButton(double d);

    @ReactMethod
    public abstract void dismiss(double d, ReadableMap readableMap);

    @ReactMethod
    public void getSavedInstanceState(double d, String str, Callback callback) {
    }

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void navigate(double d, String str, ReadableMap readableMap);

    @ReactMethod
    public abstract void openURL(double d, String str);

    @ReactMethod
    public abstract void pop(double d);

    @ReactMethod
    public void popToScreen(double d, double d2) {
    }

    @ReactMethod
    public void present(double d, String str) {
    }

    @ReactMethod
    public abstract void reloadReact();

    @ReactMethod
    public void replaceTarget(double d, String str, String str2) {
    }

    @ReactMethod
    public abstract void setBarLeftAction(double d, ReadableMap readableMap);

    @ReactMethod
    public abstract void setBarPrimaryAction(double d, ReadableMap readableMap);

    @ReactMethod
    public abstract void setBarTitle(double d, String str);

    @ReactMethod
    public void setInstanceStateToSave(double d, String str, ReadableMap readableMap) {
    }

    @ReactMethod
    public void setRouteStack(double d, ReadableArray readableArray) {
    }

    @ReactMethod
    public void updateAppRegistryConfiguration(String str) {
    }

    @ReactMethod
    public void updateNativeRoutesConfiguration(String str) {
    }

    public NativeNavigationSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public final Map getConstants() {
        return getTypedExportedConstants();
    }
}

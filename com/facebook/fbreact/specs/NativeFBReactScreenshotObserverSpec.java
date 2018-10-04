package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;

public abstract class NativeFBReactScreenshotObserverSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec {
    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void removeListeners(double d);

    @ReactMethod
    public void startObserving() {
    }

    @ReactMethod
    public void stopObserving() {
    }

    public NativeFBReactScreenshotObserverSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}

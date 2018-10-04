package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;

public abstract class NativeFBShopNativeModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec {
    @ReactMethod
    public abstract void launchFeedbackPopover(double d, String str, boolean z);

    @ReactMethod
    public abstract void storeFrontScrollViewDidLoad(double d, double d2);

    @ReactMethod
    public abstract void storeFrontViewLayoutChanged(double d, double d2, double d3, double d4);

    public NativeFBShopNativeModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}

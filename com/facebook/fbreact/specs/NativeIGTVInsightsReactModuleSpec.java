package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;

public abstract class NativeIGTVInsightsReactModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec {
    @ReactMethod
    public abstract void seekToTime(double d);

    public NativeIGTVInsightsReactModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}

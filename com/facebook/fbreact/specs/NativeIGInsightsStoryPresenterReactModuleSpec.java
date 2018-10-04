package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;

public abstract class NativeIGInsightsStoryPresenterReactModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec {
    @ReactMethod
    public abstract void openStoryViewerForMediaIDs(ReadableArray readableArray, String str, double d, String str2);

    @ReactMethod
    public abstract void openTutorialViewerForMediaIDs(ReadableArray readableArray, String str, double d, String str2, String str3);

    public NativeIGInsightsStoryPresenterReactModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}

package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;

public abstract class NativeIGInsightsReactModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec {
    @ReactMethod
    public abstract void navigateToCreatePromotion();

    @ReactMethod
    public abstract void navigateToFeedbackChannel(String str);

    @ReactMethod
    public abstract void navigateToSeeMorePromotions();

    @ReactMethod
    public void navigateToSeeMoreStories() {
    }

    @ReactMethod
    public abstract void navigateToSingleFeedView(String str);

    @ReactMethod
    public abstract void navigateToStoriesCamera();

    @ReactMethod
    public abstract void navigateToTopPostsCamera();

    @ReactMethod
    public void showInsightsFilterView(String str, String str2, String str3, String str4, String str5) {
    }

    public NativeIGInsightsReactModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}

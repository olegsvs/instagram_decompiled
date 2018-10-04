package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

public abstract class NativeIGCommentModerationReactModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec {
    @ReactMethod
    public abstract void fetchBlockedCommenters(Promise promise);

    @ReactMethod
    public abstract void fetchCommentAudienceControlType(Promise promise);

    @ReactMethod
    public abstract void fetchCommentCategoryFilterDisabled(Promise promise);

    @ReactMethod
    public abstract void fetchCommentFilter(Promise promise);

    @ReactMethod
    public abstract void fetchCommentFilterKeywords(Promise promise);

    @ReactMethod
    public abstract void fetchCurrentUser(Promise promise);

    @ReactMethod
    public abstract void openCommenterBlockingViewControllerWithReactTag(double d, ReadableArray readableArray, Callback callback);

    @ReactMethod
    public abstract void setBlockedCommenters(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void setCommentAudienceControlType(String str, Promise promise);

    @ReactMethod
    public abstract void setCommentCategoryFilterDisabled(boolean z, Promise promise);

    @ReactMethod
    public abstract void setCustomKeywords(String str, Promise promise);

    @ReactMethod
    public abstract void setUseDefaultKeywords(boolean z, Promise promise);

    public NativeIGCommentModerationReactModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}

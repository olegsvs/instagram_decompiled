package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;

public abstract class NativeIGCheckpointReactModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec {
    @ReactMethod
    public abstract void closeCheckpoint(double d);

    @ReactMethod
    public abstract void continueChallengeWithData(ReadableMap readableMap, double d);

    @ReactMethod
    public abstract void extractCountryCodeAndNumber(String str, Promise promise);

    @ReactMethod
    public void fetchBBT(Promise promise) {
    }

    @ReactMethod
    public abstract void fetchFacebookToken(Promise promise);

    @ReactMethod
    public void fetchGoogleOAuthToken(double d, Promise promise) {
    }

    @ReactMethod
    public abstract void generateURIWithPreviewDataString(String str, Promise promise);

    @ReactMethod
    public void goToHomeScreen() {
    }

    @ReactMethod
    public abstract void logoutAllUsersWithReactTag(double d);

    @ReactMethod
    public abstract void proceedAndUpdateChallengeWithParams(ReadableMap readableMap, ReadableMap readableMap2, double d, Promise promise);

    @ReactMethod
    public abstract void proceedChallengeWithParams(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void replayChallengeWithParams(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void resetChallengeWithReactTag(double d);

    public NativeIGCheckpointReactModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}

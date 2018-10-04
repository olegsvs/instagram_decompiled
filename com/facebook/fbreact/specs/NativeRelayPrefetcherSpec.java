package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;

public abstract class NativeRelayPrefetcherSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec {
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableArray getPrefetchedQueryIDs();

    @ReactMethod
    public abstract void provideResponseIfAvailable(String str, Promise promise);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap provideResponseIfAvailableSync(String str);

    public NativeRelayPrefetcherSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}

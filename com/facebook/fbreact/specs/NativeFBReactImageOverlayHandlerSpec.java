package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;

public abstract class NativeFBReactImageOverlayHandlerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec {
    @ReactMethod
    public void extractPixelColorFromImages(ReadableMap readableMap, Callback callback) {
    }

    @ReactMethod
    public abstract void generateImageFromImages(ReadableMap readableMap, Callback callback);

    @ReactMethod
    public void processImage(ReadableMap readableMap, Callback callback) {
    }

    public NativeFBReactImageOverlayHandlerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}

package com.instagram.react.views.image;

import X.AnonymousClass0Gs;
import X.AnonymousClass0RJ;
import X.AnonymousClass5t9;
import android.text.TextUtils;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "ImageLoader")
public class IgReactImageLoaderModule extends ReactContextBaseJavaModule {
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";
    public static final String MODULE_NAME = "ImageLoader";

    public String getName() {
        return MODULE_NAME;
    }

    public IgReactImageLoaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void getSize(String str, Promise promise) {
        if (TextUtils.isEmpty(str)) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        AnonymousClass0RJ D = AnonymousClass0Gs.f2431j.D(str);
        D.f4635F = false;
        D.C(new AnonymousClass5t9(this, promise)).A().G();
    }
}

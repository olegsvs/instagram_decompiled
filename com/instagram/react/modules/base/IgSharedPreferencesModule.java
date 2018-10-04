package com.instagram.react.modules.base;

import android.content.Context;
import com.facebook.fbreact.specs.NativeIGSharedPreferencesModuleSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "IGSharedPreferencesModule")
public class IgSharedPreferencesModule extends NativeIGSharedPreferencesModuleSpec {
    public static final String MODULE_NAME = "IGSharedPreferencesModule";
    private Context mContext;

    public String getName() {
        return MODULE_NAME;
    }

    public IgSharedPreferencesModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mContext = reactApplicationContext.getApplicationContext();
    }

    public void getBoolean(String str, String str2, boolean z, Promise promise) {
        promise.resolve(Boolean.valueOf(this.mContext.getSharedPreferences(str, 0).getBoolean(str2, z)));
    }

    public void getString(String str, String str2, String str3, Promise promise) {
        promise.resolve(this.mContext.getSharedPreferences(str, 0).getString(str2, str3));
    }
}

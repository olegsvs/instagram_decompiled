package com.instagram.react.modules.product;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0F4;
import X.AnonymousClass0HV;
import X.AnonymousClass4WE;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.facebook.fbreact.specs.NativeIGGeoGatingReactModuleSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashSet;

@ReactModule(name = "IGGeoGatingReactModule")
public class IgReactGeoGatingModule extends NativeIGGeoGatingReactModuleSpec {
    private static final String FRAGMENT_ARGUMENTS = "fragment_arguments";
    public static final String MODULE_NAME = "IGGeoGatingReactModule";
    private static final String SETTING_TYPE_FEED = "feed";
    private AnonymousClass0Cm mUserSession;

    public String getName() {
        return MODULE_NAME;
    }

    public IgReactGeoGatingModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public void setupNativeModule() {
        if (getCurrentActivity() == null || getCurrentActivity().getIntent() == null) {
            this.mUserSession = null;
            return;
        }
        Bundle extras = getCurrentActivity().getIntent().getExtras();
        if (extras.getBundle(FRAGMENT_ARGUMENTS) != null) {
            this.mUserSession = AnonymousClass0Ce.G(extras.getBundle(FRAGMENT_ARGUMENTS));
        } else {
            this.mUserSession = AnonymousClass0Ce.G(extras);
        }
    }

    public void updateGeoGatingSettings(boolean z, ReadableArray readableArray, String str) {
        AnonymousClass0Cm anonymousClass0Cm = this.mUserSession;
        if (anonymousClass0Cm != null) {
            AnonymousClass0HV.D(anonymousClass0Cm).NA(str, z);
            z = new HashSet();
            for (int i = 0; i < readableArray.size(); i++) {
                z.add(readableArray.getString(i));
            }
            AnonymousClass0HV D = AnonymousClass0HV.D(this.mUserSession);
            Editor edit = D.f2646B.edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            String str2 = "_limit_location_list";
            stringBuilder.append(str2);
            edit.remove(stringBuilder.toString()).apply();
            Editor edit2 = D.f2646B.edit();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(str2);
            edit2.putStringSet(stringBuilder2.toString(), z).apply();
            if (str.equals(SETTING_TYPE_FEED)) {
                AnonymousClass0F4.f2058E.C(new AnonymousClass4WE());
            }
        }
    }
}

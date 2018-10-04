package com.instagram.react.modules.product;

import X.AnonymousClass0Iu;
import X.AnonymousClass0Pt;
import X.AnonymousClass0Pu;
import X.AnonymousClass0Pv;
import X.AnonymousClass0Px;
import X.AnonymousClass5se;
import android.support.v4.app.FragmentActivity;
import com.facebook.fbreact.specs.NativeIGBrandedContentReactModuleSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "IGBrandedContentReactModule")
public class IgReactBrandedContentModule extends NativeIGBrandedContentReactModuleSpec {
    public static final String MODULE_NAME = "IGBrandedContentReactModule";

    public String getName() {
        return MODULE_NAME;
    }

    public IgReactBrandedContentModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private void scheduleTask(AnonymousClass0Iu anonymousClass0Iu, Promise promise) {
        if (getCurrentActivity() != null) {
            if (getCurrentActivity() instanceof FragmentActivity) {
                anonymousClass0Iu.f2849B = new AnonymousClass5se(this, promise);
                AnonymousClass0Px.B(getReactApplicationContext(), ((FragmentActivity) getCurrentActivity()).E(), anonymousClass0Iu);
            }
        }
    }

    public void updateWhitelistSettings(boolean z, String str, String str2, Promise promise) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt();
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "business/branded_content/update_whitelist_settings/";
        scheduleTask(anonymousClass0Pt.D("require_approval", z ? "1" : "0").G("added_user_ids", str).G("removed_user_ids", str2).M(AnonymousClass0Pv.class).N().H(), promise);
    }
}

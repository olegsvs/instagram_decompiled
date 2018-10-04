package com.instagram.react.modules.product;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0GA;
import X.AnonymousClass0Iu;
import X.AnonymousClass0Ix;
import X.AnonymousClass0Pt;
import X.AnonymousClass0Pu;
import X.AnonymousClass0Pv;
import X.AnonymousClass5t0;
import android.app.Activity;
import com.facebook.fbreact.specs.NativeIGShoppingCatalogSettingsModuleSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "IGShoppingCatalogSettingsModule")
public class IgReactShoppingCatalogSettingsModule extends NativeIGShoppingCatalogSettingsModuleSpec {
    public static final String MODULE_NAME = "IGShoppingCatalogSettingsModule";

    public String getName() {
        return MODULE_NAME;
    }

    public IgReactShoppingCatalogSettingsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private static AnonymousClass0Iu createCatalogSelectedTask(AnonymousClass0Cm anonymousClass0Cm, String str) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "commerce/onboard/";
        return anonymousClass0Pt.D("current_catalog_id", str).M(AnonymousClass0Pv.class).N().H();
    }

    public void selectCatalog(String str, String str2, Callback callback, Callback callback2) {
        IgReactShoppingCatalogSettingsModule igReactShoppingCatalogSettingsModule = this;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            callback2.invoke(new Object[0]);
            return;
        }
        AnonymousClass0Cm G = AnonymousClass0Ce.G(currentActivity.getIntent().getExtras());
        AnonymousClass0GA createCatalogSelectedTask = createCatalogSelectedTask(G, str);
        createCatalogSelectedTask.f2849B = new AnonymousClass5t0(igReactShoppingCatalogSettingsModule, G, str, str2, callback, callback2);
        AnonymousClass0Ix.D(createCatalogSelectedTask);
    }
}

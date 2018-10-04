package com.instagram.react.modules.product;

import X.AnonymousClass5sy;
import X.AnonymousClass5sz;
import android.app.Activity;
import com.facebook.fbreact.specs.NativeIGPostInsightsReactModuleSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.business.insights.activity.PostInsightsActivity;

@ReactModule(name = "IGPostInsightsReactModule")
public class IgReactPostInsightsModule extends NativeIGPostInsightsReactModuleSpec {
    public static final String MODULE_NAME = "IGPostInsightsReactModule";

    public String getName() {
        return MODULE_NAME;
    }

    public IgReactPostInsightsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public void didFinishLoading(double d) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity instanceof PostInsightsActivity) {
            UiThreadUtil.runOnUiThread(new AnonymousClass5sy(this, currentActivity));
        }
    }

    public void toggleNavigationBar(double d, boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity instanceof PostInsightsActivity) {
            UiThreadUtil.runOnUiThread(new AnonymousClass5sz(this, currentActivity, z));
        }
    }
}

package com.instagram.react.modules.product;

import X.AnonymousClass0P7;
import X.AnonymousClass0PZ;
import X.AnonymousClass107;
import X.AnonymousClass1Ud;
import X.AnonymousClass1Xe;
import X.AnonymousClass3Mh;
import X.AnonymousClass5su;
import X.AnonymousClass5sv;
import X.AnonymousClass5sw;
import android.support.v4.app.FragmentActivity;
import com.facebook.fbreact.specs.NativeLeadGenHelperSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "LeadGenHelper")
public class IgReactLeadAdsModule extends NativeLeadGenHelperSpec implements AnonymousClass0PZ {
    public static final String REACT_MODULE_NAME = "LeadGenHelper";

    public String getModuleName() {
        return "LeadAds";
    }

    public String getName() {
        return REACT_MODULE_NAME;
    }

    public boolean isOrganicEligible() {
        return true;
    }

    public boolean isSponsoredEligible() {
        return true;
    }

    public IgReactLeadAdsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public void onAppPrepareToClose() {
        AnonymousClass1Xe.f19849E.B(1);
    }

    public void onScroll(double d) {
        AnonymousClass1Ud B = AnonymousClass5sw.m28583B(getCurrentActivity());
        if (B != null) {
            B.f19133B = (int) d;
        }
    }

    public void openAdUrl(String str, String str2, double d, double d2, String str3) {
        String str4 = str2;
        AnonymousClass0P7 A = AnonymousClass107.f13182C.A(str2);
        IgReactLeadAdsModule igReactLeadAdsModule = this;
        FragmentActivity fragmentActivity = (FragmentActivity) getCurrentActivity();
        if (fragmentActivity != null) {
            double d3 = d2;
            getReactApplicationContext().runOnUiQueueThread(new AnonymousClass5su(igReactLeadAdsModule, A, d3, d, str3, str, fragmentActivity, str4));
        }
    }

    public void openDialer(String str, String str2, double d, double d2, String str3) {
        FragmentActivity fragmentActivity = (FragmentActivity) getCurrentActivity();
        if (fragmentActivity != null) {
            getReactApplicationContext().runOnUiQueueThread(new AnonymousClass5sv(this, str, fragmentActivity));
        }
    }

    public void submitForm(String str, String str2) {
        AnonymousClass3Mh.B().B(str, true);
    }
}

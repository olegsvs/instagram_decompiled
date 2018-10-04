package com.instagram.react.modules.product;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cf;
import X.AnonymousClass0Cm;
import X.AnonymousClass0FO;
import X.AnonymousClass0IL;
import X.AnonymousClass0In;
import X.AnonymousClass0It;
import X.AnonymousClass0Ix;
import X.AnonymousClass0Iy;
import X.AnonymousClass0OR;
import X.AnonymousClass0a2;
import X.AnonymousClass0xr;
import X.AnonymousClass1PO;
import X.AnonymousClass2HL;
import X.AnonymousClass2NX;
import X.AnonymousClass35N;
import X.AnonymousClass5sX;
import X.AnonymousClass5sY;
import X.AnonymousClass5sa;
import X.AnonymousClass5sb;
import X.AnonymousClass5sc;
import X.AnonymousClass5sd;
import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.webkit.CookieManager;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "IGBoostPostReactModule")
public class IgReactBoostPostModule extends ReactContextBaseJavaModule {
    public static final String MODULE_NAME = "IGBoostPostReactModule";

    public String getName() {
        return MODULE_NAME;
    }

    public IgReactBoostPostModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void clearTokenAndReLoginToFB(Callback callback, Callback callback2) {
        AnonymousClass0FO.G(getUserSession(this), true);
        AnonymousClass0IL C = AnonymousClass0In.C(getCurrentActivity());
        if (C == null) {
            callback2.invoke(new Object[0]);
            return;
        }
        C.registerLifecycleListener(new AnonymousClass5sa(this, callback, callback2, C));
        AnonymousClass0FO.C(getUserSession(this), C, AnonymousClass2HL.PUBLISH_AS_SELF_OR_MANAGED_PAGE);
    }

    @ReactMethod
    public static void clearWebviewCookie() {
        CookieManager instance = CookieManager.getInstance();
        if (VERSION.SDK_INT >= 21) {
            instance.removeAllCookies(null);
        } else {
            instance.removeAllCookie();
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getFBAccessToken() {
        return AnonymousClass0a2.B(getUserSession(this));
    }

    @ReactMethod
    public void getFBAuth(Callback callback, Callback callback2) {
        if (AnonymousClass0a2.B(getUserSession(this)) == null) {
            callback2.invoke(new Object[0]);
            return;
        }
        callback.invoke(new Object[]{AnonymousClass0a2.B(getUserSession(this)), AnonymousClass0a2.I(getUserSession(this))});
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getIGAccessToken() {
        return AnonymousClass0Cf.F(getUserSession(this));
    }

    public static AnonymousClass0Cm getUserSession(IgReactBoostPostModule igReactBoostPostModule) {
        return AnonymousClass0Ce.G(igReactBoostPostModule.getCurrentActivity().getIntent().getExtras());
    }

    @ReactMethod
    public void maybeShowRapidFeedbackSurvey() {
        AnonymousClass0OR.F(new Handler(), new AnonymousClass5sY(this), 500, -2060209262);
    }

    @ReactMethod
    public void navigateToAppealPostWithReactTag(int i, String str, String str2) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            UiThreadUtil.runOnUiThread(new AnonymousClass5sd(this, (FragmentActivity) currentActivity, str2, str));
        }
    }

    @ReactMethod
    public void navigateToBoostPost(String str) {
        UiThreadUtil.runOnUiThread(new AnonymousClass5sc(this, str, AnonymousClass0In.C(getCurrentActivity())));
    }

    @ReactMethod
    public void navigateToCreatePromotion() {
        AnonymousClass2NX.C();
        AnonymousClass0xr.F("ads_manager", AnonymousClass0a2.I(getUserSession(this)), null);
        UiThreadUtil.runOnUiThread(new AnonymousClass5sb(this, AnonymousClass0In.B(getCurrentActivity())));
    }

    @ReactMethod
    public void pushAdsPreviewForMediaID(String str, String str2, int i, String str3) {
        IgReactBoostPostModule igReactBoostPostModule = this;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            UiThreadUtil.runOnUiThread(new AnonymousClass5sX(igReactBoostPostModule, (FragmentActivity) currentActivity, str, str2, str3));
        }
    }

    @ReactMethod
    public void pushPaymentDetailViewWithReactTag(int i, String str) {
        i = getCurrentActivity();
        if (i != 0) {
            AnonymousClass35N.D(i, str, getUserSession(this));
        }
    }

    @ReactMethod
    public void refreshMediaAfterPromotion(String str) {
        AnonymousClass0Ix.D(AnonymousClass0It.B(str, getUserSession(this)));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean shouldShowUnifiedInsights(int i) {
        return AnonymousClass0Iy.I((long) i);
    }

    @ReactMethod
    public void showPromoteSuccessNotification(String str) {
        AnonymousClass0OR.F(new Handler(), new AnonymousClass1PO(getReactApplicationContext(), str), 500, 1433861897);
    }
}

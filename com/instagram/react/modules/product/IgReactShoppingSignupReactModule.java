package com.instagram.react.modules.product;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Ci;
import X.AnonymousClass0Cm;
import X.AnonymousClass0GA;
import X.AnonymousClass0Gn;
import X.AnonymousClass0IE;
import X.AnonymousClass0Iu;
import X.AnonymousClass0Ix;
import X.AnonymousClass0Pt;
import X.AnonymousClass0Pu;
import X.AnonymousClass0Pv;
import X.AnonymousClass1IX;
import X.AnonymousClass2HP;
import X.AnonymousClass5t1;
import X.AnonymousClass5t2;
import X.AnonymousClass5t3;
import android.app.Activity;
import com.facebook.fbreact.specs.NativeIGShoppingBusinessSignupModuleSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "IGShoppingSignupReactModule")
public class IgReactShoppingSignupReactModule extends NativeIGShoppingBusinessSignupModuleSpec {
    public static final String HAS_DECLINED_SHOPPING_SIGNUP = "has_declined_shopping_signup";
    public static final String MODULE_NAME = "IGShoppingSignupReactModule";

    public String getName() {
        return MODULE_NAME;
    }

    public IgReactShoppingSignupReactModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private static AnonymousClass0Iu createUserSignupTask(AnonymousClass0Cm anonymousClass0Cm, boolean z) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "commerce/signup/";
        anonymousClass0Cm = anonymousClass0Pt.M(AnonymousClass0Pv.class);
        if (z) {
            anonymousClass0Cm.D(HAS_DECLINED_SHOPPING_SIGNUP, "1");
        }
        return anonymousClass0Cm.N().H();
    }

    public void registerGetStarted(Callback callback, Callback callback2) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            AnonymousClass0GA createUserSignupTask = createUserSignupTask(AnonymousClass0Ce.G(currentActivity.getIntent().getExtras()), false);
            createUserSignupTask.f2849B = new AnonymousClass5t3(this, callback, callback2);
            AnonymousClass0Ix.D(createUserSignupTask);
            return;
        }
        callback2.invoke(new Object[0]);
        AnonymousClass0Gn.G("IgReactShoppingSignupReactModule", new IllegalArgumentException("Activity can not be null to register get started"));
    }

    public void registerNotInterestedInShopping() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            AnonymousClass0Cm G = AnonymousClass0Ce.G(currentActivity.getIntent().getExtras());
            AnonymousClass0Ci B = G.B();
            AnonymousClass2HP anonymousClass2HP = B.GC;
            B.GC = AnonymousClass2HP.NOT_INTERESTED;
            B.D();
            AnonymousClass0GA createUserSignupTask = createUserSignupTask(G, true);
            createUserSignupTask.f2849B = new AnonymousClass5t2(this, B, anonymousClass2HP);
            AnonymousClass0Ix.D(createUserSignupTask);
            return;
        }
        AnonymousClass0Gn.G("IgReactShoppingSignupReactModule", new IllegalArgumentException("Activity can not be null to register not interested"));
    }

    public void syncShoppingOnboardingState(Callback callback, Callback callback2) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            String E = AnonymousClass0IE.E("users/%s/info/", new Object[]{AnonymousClass0Ce.G(currentActivity.getIntent().getExtras()).B().getId()});
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(r4);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
            anonymousClass0Pt.f4229M = E;
            AnonymousClass0GA H = anonymousClass0Pt.M(AnonymousClass1IX.class).H();
            H.f2849B = new AnonymousClass5t1(this, callback, callback2);
            AnonymousClass0Ix.D(H);
            return;
        }
        AnonymousClass0Gn.L("IgReactShoppingSignupReactModule", new IllegalArgumentException("Activity can not be null to sync the onboarding state"));
    }
}

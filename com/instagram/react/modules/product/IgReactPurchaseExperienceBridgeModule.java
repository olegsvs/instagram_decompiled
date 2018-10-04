package com.instagram.react.modules.product;

import X.AnonymousClass0Ci;
import X.AnonymousClass0F4;
import X.AnonymousClass0cq;
import X.AnonymousClass0cs;
import X.AnonymousClass62u;
import X.AnonymousClass62v;
import com.facebook.C0164R;
import com.facebook.fbreact.specs.NativeIGPurchaseExperienceBridgeModuleSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "IGPurchaseExperienceBridgeModule")
public class IgReactPurchaseExperienceBridgeModule extends NativeIGPurchaseExperienceBridgeModuleSpec {
    public static final String MODULE_NAME = "IGPurchaseExperienceBridgeModule";
    private String mOrderId;
    private AnonymousClass62v mShoppingCheckoutDelegate;
    private AnonymousClass0Ci mUser;

    public String getName() {
        return MODULE_NAME;
    }

    public IgReactPurchaseExperienceBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public void checkoutConfirmationWillDismiss() {
        AnonymousClass62v anonymousClass62v = this.mShoppingCheckoutDelegate;
        if (anonymousClass62v != null) {
            String str = this.mOrderId;
            AnonymousClass0cq anonymousClass0cq = new AnonymousClass0cq();
            anonymousClass0cq.f7260G = anonymousClass62v.f71273B.getString(C0164R.string.order_confirmation_toast_text);
            anonymousClass0cq.f7259F = true;
            anonymousClass0cq.f7256C = anonymousClass62v.f71273B.getString(C0164R.string.order_confirmation_toast_button);
            anonymousClass0cq.f7257D = new AnonymousClass62u(anonymousClass62v, str);
            AnonymousClass0F4.f2058E.B(new AnonymousClass0cs(anonymousClass0cq.A()));
        }
    }

    public void onPaymentSuccess(String str) {
        this.mOrderId = str;
        str = this.mUser;
        if (str != null) {
            str.HB = Boolean.valueOf(true);
            str.D();
        }
    }

    public void setDelegate(AnonymousClass62v anonymousClass62v) {
        this.mShoppingCheckoutDelegate = anonymousClass62v;
    }

    public void setUser(AnonymousClass0Ci anonymousClass0Ci) {
        this.mUser = anonymousClass0Ci;
    }
}

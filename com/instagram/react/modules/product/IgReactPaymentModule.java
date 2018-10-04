package com.instagram.react.modules.product;

import X.AnonymousClass0F4;
import X.AnonymousClass0F8;
import X.AnonymousClass36T;
import X.AnonymousClass36U;
import X.AnonymousClass5gr;
import X.AnonymousClass5gs;
import X.AnonymousClass5gw;
import X.AnonymousClass5sx;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesCallResult;
import com.facebook.android.instantexperiences.payment.PaymentsCheckoutJSBridgeCallResult;
import com.facebook.fbreact.specs.NativeIGReactPaymentModuleSpec;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "IGReactPaymentModule")
public class IgReactPaymentModule extends NativeIGReactPaymentModuleSpec implements LifecycleEventListener {
    public static final String REACT_MODULE_NAME = "IGReactPaymentModule";
    private AnonymousClass0F8 mPaymentProcessEventListener = new AnonymousClass5sx(this);

    public String getName() {
        return REACT_MODULE_NAME;
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
    }

    public void onHostResume() {
    }

    public IgReactPaymentModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        AnonymousClass0F4.f2058E.A(AnonymousClass36U.class, this.mPaymentProcessEventListener);
    }

    public void checkoutCancel(String str) {
        if (AnonymousClass36T.f37848B != null) {
            AnonymousClass5gw anonymousClass5gw = AnonymousClass36T.f37848B;
            InstantExperiencesCallResult paymentsCheckoutJSBridgeCallResult = new PaymentsCheckoutJSBridgeCallResult("checkoutCancel", null);
            if (str.equals(anonymousClass5gw.f68158B.f67515B)) {
                AnonymousClass5gr.m28261B("payment_cancel", anonymousClass5gw.f68158B, new HashMap());
                AnonymousClass5gr.m28262C();
                anonymousClass5gw.f68158B.m28151C(paymentsCheckoutJSBridgeCallResult);
                anonymousClass5gw.f68159C.mo6393A(anonymousClass5gw.f68158B);
                return;
            }
            AnonymousClass5gr.m28262C();
        }
    }

    public void handlePaymentResponse(String str, String str2) {
        if (AnonymousClass36T.f37848B != null) {
            AnonymousClass5gw anonymousClass5gw = AnonymousClass36T.f37848B;
            InstantExperiencesCallResult paymentsCheckoutJSBridgeCallResult = new PaymentsCheckoutJSBridgeCallResult("chargeRequest", str);
            if (str2.equals(anonymousClass5gw.f68158B.f67515B)) {
                anonymousClass5gw.f68158B.m28151C(paymentsCheckoutJSBridgeCallResult);
                anonymousClass5gw.f68159C.mo6393A(anonymousClass5gw.f68158B);
                Map hashMap = new HashMap();
                hashMap.put(AnonymousClass5gs.RESPONSE, str);
                AnonymousClass5gr.m28261B("payment_response_from_rn", anonymousClass5gw.f68158B, hashMap);
                return;
            }
            AnonymousClass5gr.m28262C();
        }
    }

    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }
}

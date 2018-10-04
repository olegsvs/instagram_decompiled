package X;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;
import com.instagram.react.modules.product.IgReactPaymentModule;

/* renamed from: X.5sx */
public final class AnonymousClass5sx implements AnonymousClass0F8 {
    /* renamed from: B */
    public final /* synthetic */ IgReactPaymentModule f69611B;

    public AnonymousClass5sx(IgReactPaymentModule igReactPaymentModule) {
        this.f69611B = igReactPaymentModule;
    }

    public final /* bridge */ /* synthetic */ void onEvent(AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.I(this, -1022327222);
        AnonymousClass36U anonymousClass36U = (AnonymousClass36U) anonymousClass0F6;
        int I2 = AnonymousClass0cQ.I(this, -203467952);
        WritableMap createMap = Arguments.createMap();
        createMap.putString("paymentID", anonymousClass36U.f37850C);
        createMap.putString("status", anonymousClass36U.f37851D);
        createMap.putString("errorMessage", anonymousClass36U.f37849B);
        ((RCTDeviceEventEmitter) this.f69611B.getReactApplicationContext().getJSModule(RCTDeviceEventEmitter.class)).emit("IGPaymentProcessEvent", createMap);
        AnonymousClass0cQ.H(this, 374569222, I2);
        AnonymousClass0cQ.H(this, -2070435001, I);
    }
}

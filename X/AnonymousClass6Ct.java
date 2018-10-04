package X;

import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCall;
import com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCallResult;

/* renamed from: X.6Ct */
public final class AnonymousClass6Ct extends AnonymousClass5dE {
    public AnonymousClass6Ct(AnonymousClass5dW anonymousClass5dW) {
        super(AnonymousClass6Cq.m29461C(), anonymousClass5dW);
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ void mo6393A(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        super.mo6393A((CanMakePaymentJSBridgeCall) instantExperiencesJSBridgeCall);
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void mo6391B(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        CanMakePaymentJSBridgeCall canMakePaymentJSBridgeCall = (CanMakePaymentJSBridgeCall) instantExperiencesJSBridgeCall;
        super.mo6391B(canMakePaymentJSBridgeCall);
        boolean FY = canMakePaymentJSBridgeCall.f67518E.mL().FY();
        canMakePaymentJSBridgeCall.m28151C(new CanMakePaymentJSBridgeCallResult(FY));
        canMakePaymentJSBridgeCall.m28151C(new CanMakePaymentJSBridgeCallResult(FY));
        super.mo6393A(canMakePaymentJSBridgeCall);
    }
}

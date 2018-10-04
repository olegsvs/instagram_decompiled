package X;

import com.facebook.react.bridge.Callback;
import com.instagram.react.modules.product.IgReactShoppingSignupReactModule;

/* renamed from: X.5t3 */
public final class AnonymousClass5t3 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ Callback f69625B;
    /* renamed from: C */
    public final /* synthetic */ Callback f69626C;

    public AnonymousClass5t3(IgReactShoppingSignupReactModule igReactShoppingSignupReactModule, Callback callback, Callback callback2) {
        this.f69626C = callback;
        this.f69625B = callback2;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -1145874666);
        super.onFail(anonymousClass0Q6);
        this.f69625B.invoke(new Object[0]);
        AnonymousClass0cQ.H(this, -628682449, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 975241801);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.I(this, -633736162);
        super.onSuccess(anonymousClass0Pn);
        this.f69626C.invoke(new Object[0]);
        AnonymousClass0cQ.H(this, 1704516241, I2);
        AnonymousClass0cQ.H(this, 1570753420, I);
    }
}

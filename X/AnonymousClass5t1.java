package X;

import com.facebook.react.bridge.Callback;
import com.instagram.react.modules.product.IgReactShoppingSignupReactModule;

/* renamed from: X.5t1 */
public final class AnonymousClass5t1 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ Callback f69621B;
    /* renamed from: C */
    public final /* synthetic */ Callback f69622C;

    public AnonymousClass5t1(IgReactShoppingSignupReactModule igReactShoppingSignupReactModule, Callback callback, Callback callback2) {
        this.f69622C = callback;
        this.f69621B = callback2;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 564453036);
        super.onFail(anonymousClass0Q6);
        this.f69621B.invoke(new Object[0]);
        AnonymousClass0cQ.H(this, -1978105685, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1201172382);
        AnonymousClass1Nf anonymousClass1Nf = (AnonymousClass1Nf) obj;
        int I2 = AnonymousClass0cQ.I(this, -1676004142);
        super.onSuccess(anonymousClass1Nf);
        String A = anonymousClass1Nf.f17816C.GC != null ? anonymousClass1Nf.f17816C.GC.A() : null;
        this.f69622C.invoke(new Object[]{A});
        AnonymousClass0cQ.H(this, 775384343, I2);
        AnonymousClass0cQ.H(this, 1174861753, I);
    }
}

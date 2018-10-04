package X;

import com.instagram.react.modules.product.IgReactShoppingSignupReactModule;

/* renamed from: X.5t2 */
public final class AnonymousClass5t2 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2HP f69623B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Ci f69624C;

    public AnonymousClass5t2(IgReactShoppingSignupReactModule igReactShoppingSignupReactModule, AnonymousClass0Ci anonymousClass0Ci, AnonymousClass2HP anonymousClass2HP) {
        this.f69624C = anonymousClass0Ci;
        this.f69623B = anonymousClass2HP;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 1213751111);
        super.onFail(anonymousClass0Q6);
        this.f69624C.GC = this.f69623B;
        this.f69624C.D();
        AnonymousClass0cQ.H(this, 317473179, I);
    }
}

package X;

import com.facebook.C0164R;

/* renamed from: X.605 */
public final class AnonymousClass605 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6F8 f70755B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Ci f70756C;

    public AnonymousClass605(AnonymousClass6F8 anonymousClass6F8, AnonymousClass0Ci anonymousClass0Ci) {
        this.f70755B = anonymousClass6F8;
        this.f70756C = anonymousClass0Ci;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 1296475329);
        if (anonymousClass0Q6.B()) {
            new AnonymousClass0P2(this.f70755B.f73263C).L(((AnonymousClass0Pn) anonymousClass0Q6.f4288C).A()).S(C0164R.string.ok, new AnonymousClass604(this)).F(true).A().show();
        }
        AnonymousClass0cQ.H(this, 4175980, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -852886046);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.I(this, -1234662976);
        AnonymousClass0OR.D(this.f70755B.f73265E, new AnonymousClass603(this), 1258499313);
        AnonymousClass0cQ.H(this, 1042777943, I2);
        AnonymousClass0cQ.H(this, 1155617828, I);
    }
}

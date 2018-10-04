package X;

/* renamed from: X.4z8 */
public final class AnonymousClass4z8 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4z9 f59074B;

    public AnonymousClass4z8(AnonymousClass4z9 anonymousClass4z9) {
        this.f59074B = anonymousClass4z9;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -467547566);
        super.onFail(anonymousClass0Q6);
        AnonymousClass3nj.D(this.f59074B.getContext());
        AnonymousClass0cQ.H(this, 781825116, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 523113438);
        this.f59074B.f59078E = false;
        AnonymousClass0eT.D(AnonymousClass0eT.E(this.f59074B.getActivity()));
        AnonymousClass0cQ.H(this, -1510055510, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -1576833148);
        this.f59074B.f59078E = true;
        AnonymousClass0cQ.H(this, 346729131, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1864025641);
        AnonymousClass2DN anonymousClass2DN = (AnonymousClass2DN) obj;
        int I2 = AnonymousClass0cQ.I(this, 439635299);
        AnonymousClass4z9.m25519B(this.f59074B, anonymousClass2DN);
        AnonymousClass0cQ.H(this, 1658957792, I2);
        AnonymousClass0cQ.H(this, 628067210, I);
    }
}

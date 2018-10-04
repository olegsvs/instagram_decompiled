package X;

/* renamed from: X.3lA */
public final class AnonymousClass3lA extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3lD f44128B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Ci f44129C;

    public AnonymousClass3lA(AnonymousClass3lD anonymousClass3lD, AnonymousClass0Ci anonymousClass0Ci) {
        this.f44128B = anonymousClass3lD;
        this.f44129C = anonymousClass0Ci;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -972682902);
        if (this.f44128B.f44141G == this.f44129C) {
            AnonymousClass3lD anonymousClass3lD = this.f44128B;
            anonymousClass3lD.f44140F = AnonymousClass3lC.m20586B(anonymousClass3lD.f44141G);
            AnonymousClass3lD.m20588C(this.f44128B);
        }
        AnonymousClass0cQ.H(this, -2005920645, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -210585741);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.I(this, -342140581);
        this.f44129C.w(false);
        this.f44128B.f44142H.B().K();
        if (this.f44128B.f44141G == this.f44129C) {
            this.f44128B.f44140F = AnonymousClass3lC.REMOVED;
            AnonymousClass3lD.m20588C(this.f44128B);
        }
        AnonymousClass0cQ.H(this, -1179935901, I2);
        AnonymousClass0cQ.H(this, -1471181298, I);
    }
}

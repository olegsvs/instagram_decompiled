package X;

/* renamed from: X.2z9 */
public final class AnonymousClass2z9 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2zA f36630B;

    public AnonymousClass2z9(AnonymousClass2zA anonymousClass2zA) {
        this.f36630B = anonymousClass2zA;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 647985507);
        this.f36630B.f36633D.setIsLoading(false);
        this.f36630B.f36632C.m14961E();
        AnonymousClass0cQ.H(this, 721006787, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -766061578);
        AnonymousClass2z5 anonymousClass2z5 = (AnonymousClass2z5) obj;
        int I2 = AnonymousClass0cQ.I(this, 91305480);
        if (!(AnonymousClass0Ow.D(anonymousClass2z5.f36626B) == null || AnonymousClass0Ow.D(anonymousClass2z5.f36626B).isEmpty())) {
            this.f36630B.f36633D.setIsLoading(false);
            AnonymousClass2z4 anonymousClass2z4 = this.f36630B.f36631B;
            anonymousClass2z4.f36621B.B(AnonymousClass0Ow.D(anonymousClass2z5.f36626B));
            anonymousClass2z4.m18127F();
        }
        AnonymousClass0cQ.H(this, -1403487943, I2);
        AnonymousClass0cQ.H(this, 629927634, I);
    }
}

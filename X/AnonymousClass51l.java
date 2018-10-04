package X;

/* renamed from: X.51l */
public final class AnonymousClass51l extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass51m f59361B;

    public AnonymousClass51l(AnonymousClass51m anonymousClass51m) {
        this.f59361B = anonymousClass51m;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 1003529262);
        AnonymousClass3nj.F(this.f59361B.getContext(), this.f59361B.f59367G.f1759C, anonymousClass0Q6);
        AnonymousClass0cQ.H(this, 123228369, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 1696889654);
        this.f59361B.f59366F.setEnabled(true);
        this.f59361B.f59366F.setShowProgressBar(false);
        AnonymousClass0cQ.H(this, -605543544, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -1458328595);
        this.f59361B.f59366F.setEnabled(false);
        this.f59361B.f59366F.setShowProgressBar(true);
        AnonymousClass0cQ.H(this, -1942073185, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1441057173);
        AnonymousClass2Dm anonymousClass2Dm = (AnonymousClass2Dm) obj;
        int I2 = AnonymousClass0cQ.I(this, -790894895);
        AnonymousClass51m anonymousClass51m = this.f59361B;
        anonymousClass51m.f59362B = anonymousClass51m.f59363C.getPhoneNumber();
        AnonymousClass0OR.D(this.f59361B.f59364D, this.f59361B.f59365E, 655463635);
        AnonymousClass0cQ.H(this, -837802368, I2);
        AnonymousClass0cQ.H(this, 1290733892, I);
    }
}

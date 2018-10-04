package X;

/* renamed from: X.5a6 */
public final class AnonymousClass5a6 extends AnonymousClass56K {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Fv f66542B;

    public AnonymousClass5a6(AnonymousClass5Fv anonymousClass5Fv, AnonymousClass0Ci anonymousClass0Ci) {
        this.f66542B = anonymousClass5Fv;
        super(anonymousClass0Ci);
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 597485691);
        super.onFail(anonymousClass0Q6);
        AnonymousClass0Ci B = this.f66542B.f61628F.B();
        if (B != null) {
            AnonymousClass5Fv.m26087C(this.f66542B, B.qB == AnonymousClass0Lo.PrivacyStatusPrivate);
            AnonymousClass3nj.F(this.f66542B.getContext(), this.f66542B.f61628F.f1759C, anonymousClass0Q6);
        }
        AnonymousClass0cQ.H(this, -1741719658, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -2036214582);
        super.onFinish();
        this.f66542B.f61624B = false;
        AnonymousClass0cQ.H(this, 2050799620, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 346865474);
        AnonymousClass2MI anonymousClass2MI = (AnonymousClass2MI) obj;
        int I2 = AnonymousClass0cQ.I(this, -1477039842);
        super.onSuccess(anonymousClass2MI);
        if (anonymousClass2MI.f29530B.qB == AnonymousClass0Lo.PrivacyStatusPrivate) {
            AnonymousClass2Go.B("private_account_switched_on");
        } else {
            AnonymousClass2Go.B("private_account_switched_off");
        }
        AnonymousClass0cQ.H(this, -243557935, I2);
        AnonymousClass0cQ.H(this, 121643885, I);
    }
}

package X;

/* renamed from: X.1EK */
public final class AnonymousClass1EK extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0S7 f15880B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0S9 f15881C;

    public AnonymousClass1EK(AnonymousClass0S7 anonymousClass0S7, AnonymousClass0S9 anonymousClass0S9) {
        this.f15880B = anonymousClass0S7;
        this.f15881C = anonymousClass0S9;
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.m5859I(this, 306472248);
        this.f15880B.f4850C = false;
        this.f15881C.Gx();
        AnonymousClass0cQ.m5858H(this, 2127170038, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.m5859I(this, 725211186);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.m5859I(this, 2044415842);
        super.onSuccess(anonymousClass0Pn);
        if (this.f15881C.vY(anonymousClass0Pn)) {
            this.f15880B.f4849B = anonymousClass0Pn;
            this.f15880B.f4851D = System.currentTimeMillis();
        }
        AnonymousClass0cQ.m5858H(this, -1256161096, I2);
        AnonymousClass0cQ.m5858H(this, -1766210130, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int I = AnonymousClass0cQ.m5859I(this, 1560530193);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.m5859I(this, 1482251198);
        super.onSuccessInBackground(anonymousClass0Pn);
        if (this.f15881C.vY(anonymousClass0Pn)) {
            this.f15881C.UFA(anonymousClass0Pn);
        }
        AnonymousClass0cQ.m5858H(this, 1595577113, I2);
        AnonymousClass0cQ.m5858H(this, 1332915240, I);
    }
}

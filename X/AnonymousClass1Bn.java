package X;

/* renamed from: X.1Bn */
public final class AnonymousClass1Bn extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0lK f15456B;

    public AnonymousClass1Bn(AnonymousClass0lK anonymousClass0lK) {
        this.f15456B = anonymousClass0lK;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.m5859I(this, 1551422662);
        this.f15456B.f9516F = false;
        AnonymousClass0Mt.m3248K(System.currentTimeMillis());
        AnonymousClass0cQ.m5858H(this, 1855188067, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.m5859I(this, 2006109263);
        AnonymousClass0m7 anonymousClass0m7 = (AnonymousClass0m7) obj;
        int I2 = AnonymousClass0cQ.m5859I(this, 2111714596);
        if (anonymousClass0m7 != null) {
            if (anonymousClass0m7.f9718B != null) {
                AnonymousClass0i7 B = AnonymousClass0i7.m6828B();
                if (B.m6830A() == null) {
                    this.f15456B.f9514D = new AnonymousClass2H4(this, anonymousClass0m7);
                    AnonymousClass0F4.f2058E.m1504A(AnonymousClass0ky.class, this.f15456B.f9514D);
                    B.m6835F();
                } else {
                    AnonymousClass0lK.m7292B(this.f15456B, anonymousClass0m7.f9718B);
                }
                AnonymousClass0Mt.m3248K(System.currentTimeMillis());
                AnonymousClass0cQ.m5858H(this, -2107269013, I2);
                AnonymousClass0cQ.m5858H(this, 737648814, I);
            }
        }
        this.f15456B.f9516F = false;
        AnonymousClass0Mt.m3248K(System.currentTimeMillis());
        AnonymousClass0cQ.m5858H(this, -2107269013, I2);
        AnonymousClass0cQ.m5858H(this, 737648814, I);
    }
}

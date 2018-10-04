package X;

/* renamed from: X.1Y4 */
public final class AnonymousClass1Y4 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0P7 f19929B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass1bb f19930C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Cm f19931D;

    public AnonymousClass1Y4(AnonymousClass1bb anonymousClass1bb, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0P7 anonymousClass0P7) {
        this.f19930C = anonymousClass1bb;
        this.f19931D = anonymousClass0Cm;
        this.f19929B = anonymousClass0P7;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.m5859I(this, -1600743551);
        if (this.f19930C == null) {
            AnonymousClass1hN.m12568B(this.f19929B, AnonymousClass0ek.m6398B(this.f19931D).m6407R(this.f19929B), this.f19931D.m1037B());
        }
        if (anonymousClass0Q6.m3973B()) {
            if (this.f19930C != null) {
                AnonymousClass1hN.m12568B(this.f19929B, AnonymousClass0ek.m6398B(this.f19931D).m6407R(this.f19929B), this.f19931D.m1037B());
                AnonymousClass0ek.m6398B(this.f19931D).m6408S(this.f19930C);
            }
            AnonymousClass0kr.m7219D(this.f19931D.f1759C, (AnonymousClass0Pn) anonymousClass0Q6.f4288C);
        }
        AnonymousClass0cQ.m5858H(this, 216031376, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.m5859I(this, 125675294);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.m5859I(this, 203851251);
        if (this.f19930C != null) {
            AnonymousClass0ek.m6398B(this.f19931D).m6408S(this.f19930C);
        }
        AnonymousClass0cQ.m5858H(this, -998390104, I2);
        AnonymousClass0cQ.m5858H(this, 1229434902, I);
    }
}

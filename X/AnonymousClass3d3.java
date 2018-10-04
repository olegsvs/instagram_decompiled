package X;

/* renamed from: X.3d3 */
public final class AnonymousClass3d3 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Iw f42850B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass3gm f42851C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0PA f42852D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0Cm f42853E;

    public AnonymousClass3d3(AnonymousClass3gm anonymousClass3gm, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Iw anonymousClass0Iw, AnonymousClass0PA anonymousClass0PA) {
        this.f42851C = anonymousClass3gm;
        this.f42853E = anonymousClass0Cm;
        this.f42850B = anonymousClass0Iw;
        this.f42852D = anonymousClass0PA;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -1394112962);
        if (this.f42851C == null || anonymousClass0Q6.B()) {
            AnonymousClass0Iw anonymousClass0Iw = this.f42850B;
            if (anonymousClass0Iw != null) {
                anonymousClass0Iw.onFail(anonymousClass0Q6);
            }
            AnonymousClass0PA anonymousClass0PA = this.f42852D;
            boolean S = AnonymousClass0ew.B(this.f42853E).S(this.f42852D);
            AnonymousClass2Gk.m14903B(anonymousClass0PA, S ? AnonymousClass0x8.SAVED : AnonymousClass0x8.NOT_SAVED, S ? AnonymousClass0x8.NOT_SAVED : AnonymousClass0x8.SAVED);
        }
        if (this.f42851C != null && anonymousClass0Q6.B()) {
            AnonymousClass0ew.B(this.f42853E).T(this.f42851C);
        }
        AnonymousClass0cQ.H(this, -1991613528, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -784161125);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.I(this, 1759067992);
        if (this.f42851C != null) {
            AnonymousClass0ew.B(this.f42853E).T(this.f42851C);
        }
        AnonymousClass0Iw anonymousClass0Iw = this.f42850B;
        if (anonymousClass0Iw != null) {
            anonymousClass0Iw.onSuccess(anonymousClass0Pn);
        }
        AnonymousClass0cQ.H(this, -1316308627, I2);
        AnonymousClass0cQ.H(this, 156749001, I);
    }
}

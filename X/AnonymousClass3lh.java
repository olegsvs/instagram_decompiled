package X;

/* renamed from: X.3lh */
public final class AnonymousClass3lh extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0x5 f44218B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Ci f44219C;

    public AnonymousClass3lh(AnonymousClass0x5 anonymousClass0x5, AnonymousClass0Ci anonymousClass0Ci) {
        this.f44218B = anonymousClass0x5;
        this.f44219C = anonymousClass0Ci;
    }

    public final void onFailInBackground(AnonymousClass0fq anonymousClass0fq) {
        int I = AnonymousClass0cQ.I(this, 1470079737);
        if (AnonymousClass0er.B(this.f44218B.f12473E).Q(this.f44219C) == AnonymousClass0Lq.FollowStatusFetching) {
            this.f44218B.E(this.f44219C);
        }
        AnonymousClass0cQ.H(this, 863363769, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int I = AnonymousClass0cQ.I(this, -2089375488);
        AnonymousClass3lV anonymousClass3lV = (AnonymousClass3lV) obj;
        int I2 = AnonymousClass0cQ.I(this, 760690505);
        this.f44218B.H(this.f44219C, anonymousClass3lV, null);
        AnonymousClass0cQ.H(this, 728416620, I2);
        AnonymousClass0cQ.H(this, -1340207171, I);
    }
}

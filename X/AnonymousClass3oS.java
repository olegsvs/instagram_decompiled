package X;

/* renamed from: X.3oS */
public final class AnonymousClass3oS implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3oW f44777B;
    /* renamed from: C */
    public final /* synthetic */ int f44778C;
    /* renamed from: D */
    public final /* synthetic */ int f44779D;

    public AnonymousClass3oS(AnonymousClass3oW anonymousClass3oW, int i, int i2) {
        this.f44777B = anonymousClass3oW;
        this.f44779D = i;
        this.f44778C = i2;
    }

    public final void run() {
        if (this.f44777B.f44806U != this.f44779D || this.f44777B.f44794I != this.f44778C) {
            this.f44777B.f44806U = this.f44779D;
            this.f44777B.f44794I = this.f44778C;
            this.f44777B.f44803R.QLA(this.f44777B.f44806U, this.f44777B.f44794I);
        }
    }
}

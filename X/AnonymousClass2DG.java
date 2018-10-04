package X;

/* renamed from: X.2DG */
public final class AnonymousClass2DG implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Gf f27567B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass2DH f27568C;

    public AnonymousClass2DG(AnonymousClass0Gf anonymousClass0Gf, AnonymousClass2DH anonymousClass2DH) {
        this.f27567B = anonymousClass0Gf;
        this.f27568C = anonymousClass2DH;
    }

    public final void run() {
        Integer.valueOf(this.f27567B.f2401D + 1);
        Integer.valueOf(this.f27567B.f2401D + this.f27567B.f2402E);
        AnonymousClass2DI.m14722B();
        AnonymousClass0Gf.B(this.f27567B, this.f27568C);
        AnonymousClass2DI.m14722B();
        AnonymousClass0Gf anonymousClass0Gf = this.f27567B;
        anonymousClass0Gf.f2402E--;
        anonymousClass0Gf = this.f27567B;
        anonymousClass0Gf.f2401D++;
    }
}

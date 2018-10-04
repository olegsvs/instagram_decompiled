package X;

/* renamed from: X.2k9 */
public final class AnonymousClass2k9 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2kC f33192B;

    public AnonymousClass2k9(AnonymousClass2kC anonymousClass2kC) {
        this.f33192B = anonymousClass2kC;
    }

    public final void run() {
        this.f33192B.f33205I = Boolean.valueOf(false);
        AnonymousClass2kC anonymousClass2kC = this.f33192B;
        anonymousClass2kC.f33203G = Boolean.valueOf(anonymousClass2kC.f33199C.C());
        if (this.f33192B.f33203G.booleanValue() && this.f33192B.f33198B != null) {
            anonymousClass2kC = this.f33192B;
            anonymousClass2kC.f33200D = anonymousClass2kC.f33198B.getX();
            anonymousClass2kC = this.f33192B;
            anonymousClass2kC.f33201E = anonymousClass2kC.f33198B.getY();
            this.f33192B.f33199C.B(this.f33192B.f33200D, this.f33192B.f33201E);
        }
    }
}

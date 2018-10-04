package X;

/* renamed from: X.20e */
public final class AnonymousClass20e implements Runnable {
    /* renamed from: B */
    private /* synthetic */ String f25217B;
    /* renamed from: C */
    private /* synthetic */ AnonymousClass1ho f25218C;
    /* renamed from: D */
    private /* synthetic */ AnonymousClass20d f25219D;

    public AnonymousClass20e(AnonymousClass20d anonymousClass20d, AnonymousClass1ho anonymousClass1ho, String str) {
        this.f25219D = anonymousClass20d;
        this.f25218C = anonymousClass1ho;
        this.f25217B = str;
    }

    public final void run() {
        if (this.f25219D.f25214B > 0) {
            this.f25218C.D(this.f25219D.f25215C != null ? this.f25219D.f25215C.getBundle(this.f25217B) : null);
        }
        if (this.f25219D.f25214B >= 2) {
            this.f25218C.G();
        }
        if (this.f25219D.f25214B >= 3) {
            this.f25218C.E();
        }
        if (this.f25219D.f25214B >= 4) {
            this.f25218C.H();
        }
        int i = this.f25219D.f25214B;
    }
}

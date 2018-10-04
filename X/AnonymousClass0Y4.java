package X;

/* renamed from: X.0Y4 */
public final class AnonymousClass0Y4 extends AnonymousClass0Xx {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Xx f6242B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Y3 f6243C;

    public AnonymousClass0Y4(AnonymousClass0Xx anonymousClass0Xx, AnonymousClass0Y0 anonymousClass0Y0, AnonymousClass0Y3 anonymousClass0Y3) {
        this.f6242B = anonymousClass0Xx;
        this.f6243C = anonymousClass0Y3;
        super(anonymousClass0Y0);
    }

    public final void run() {
        AnonymousClass0Xx anonymousClass0Xx = this.f6242B;
        anonymousClass0Xx.run();
        if (anonymousClass0Xx.m5274A()) {
            m5278E(anonymousClass0Xx.f6234C);
            return;
        }
        try {
            m5279F(this.f6243C.WVA(anonymousClass0Xx.f6235D, this.f6242B.f6233B.f6238B));
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            m5278E(e);
        }
    }

    public final String toString() {
        return this.f6242B.toString();
    }
}

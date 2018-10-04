package X;

/* renamed from: X.1S1 */
public final class AnonymousClass1S1 extends AnonymousClass0VA {
    /* renamed from: B */
    private final AnonymousClass0QW f18695B;

    public AnonymousClass1S1(AnonymousClass0QW anonymousClass0QW) {
        this.f18695B = anonymousClass0QW;
    }

    /* renamed from: B */
    public static void m11463B(AnonymousClass1S1 anonymousClass1S1) {
        anonymousClass1S1.f18695B.NM().registerLifecycleListener(anonymousClass1S1);
        anonymousClass1S1.f18695B.NT().m6300A(new AnonymousClass3UP(anonymousClass1S1));
    }

    public final void St() {
        AnonymousClass1S1.m11463B(this);
    }

    public final void gx() {
        this.f18695B.NM().unregisterLifecycleListener(this);
        this.f18695B.NT().m6300A(null);
        this.f18695B.PLA();
    }
}

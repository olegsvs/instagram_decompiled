package X;

/* renamed from: X.4GJ */
public final class AnonymousClass4GJ extends AnonymousClass0VA implements AnonymousClass1d2 {
    /* renamed from: B */
    private final AnonymousClass0IQ f52156B;
    /* renamed from: C */
    private final AnonymousClass0IR f52157C;
    /* renamed from: D */
    private final AnonymousClass4GM f52158D;

    public AnonymousClass4GJ(AnonymousClass0IL anonymousClass0IL, AnonymousClass0IQ anonymousClass0IQ, AnonymousClass0IR anonymousClass0IR, AnonymousClass4GM anonymousClass4GM) {
        this.f52156B = anonymousClass0IQ;
        this.f52157C = anonymousClass0IR;
        this.f52158D = anonymousClass4GM;
        this.f52156B.registerLifecycleListener(this);
        this.f52157C.addFragmentVisibilityListener(this);
        if (anonymousClass0IL.getUserVisibleHint()) {
            m23704C();
        }
    }

    /* renamed from: B */
    private void m23703B() {
        AnonymousClass4GM anonymousClass4GM = this.f52158D;
        if (anonymousClass4GM.f52164D) {
            AnonymousClass5SH anonymousClass5SH = anonymousClass4GM.f52167G;
            anonymousClass5SH.f63827B.getViewTreeObserver().removeOnPreDrawListener(anonymousClass4GM.f52165E);
            anonymousClass4GM.f52169I.A(anonymousClass4GM.f52162B.now());
            anonymousClass4GM.f52169I.B();
        }
        anonymousClass4GM.f52164D = false;
    }

    /* renamed from: C */
    private void m23704C() {
        AnonymousClass4GM anonymousClass4GM = this.f52158D;
        if (!anonymousClass4GM.f52164D) {
            AnonymousClass5SH anonymousClass5SH = anonymousClass4GM.f52167G;
            anonymousClass5SH.f63827B.getViewTreeObserver().addOnPreDrawListener(anonymousClass4GM.f52165E);
            anonymousClass4GM.f52164D = true;
        }
    }

    public final void St() {
        m23703B();
    }

    public final void gi() {
        this.f52156B.unregisterLifecycleListener(this);
        this.f52157C.removeFragmentVisibilityListener(this);
    }

    public final void gx() {
        m23704C();
    }

    public final void nm(AnonymousClass0IL anonymousClass0IL) {
        m23703B();
    }

    public final void om(AnonymousClass0IL anonymousClass0IL) {
        m23704C();
    }
}

package X;

/* renamed from: X.3vs */
public final class AnonymousClass3vs implements AnonymousClass2wp {
    /* renamed from: B */
    public final int f47050B;
    /* renamed from: C */
    public final AnonymousClass3vt f47051C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass3vt f47052D;
    /* renamed from: E */
    private boolean f47053E;
    /* renamed from: F */
    private final AnonymousClass3vl f47054F;

    public final void sb() {
    }

    public AnonymousClass3vs(AnonymousClass3vt anonymousClass3vt, AnonymousClass3vt anonymousClass3vt2, AnonymousClass3vl anonymousClass3vl, int i) {
        this.f47052D = anonymousClass3vt;
        this.f47051C = anonymousClass3vt2;
        this.f47054F = anonymousClass3vl;
        this.f47050B = i;
    }

    /* renamed from: B */
    private void m21558B() {
        if (!this.f47053E) {
            this.f47052D.f47062I.m17858A(this.f47052D.f47060G[this.f47050B], this.f47052D.f47059F[this.f47050B], 0, null, this.f47052D.f47063J);
            this.f47053E = true;
        }
    }

    public final int LUA(long j) {
        int A;
        if (!this.f47052D.f47065L || j <= this.f47054F.m21541F()) {
            A = this.f47054F.m21536A(j, true, true);
            if (A == -1) {
                A = 0;
            }
        } else {
            A = this.f47054F.m21537B();
        }
        if (A > 0) {
            m21558B();
        }
        return A;
    }

    public final boolean LY() {
        if (!this.f47052D.f47065L) {
            if (this.f47052D.m21564A() || !this.f47054F.m21545J()) {
                return false;
            }
        }
        return true;
    }

    public final int hIA(AnonymousClass2uL anonymousClass2uL, AnonymousClass3vB anonymousClass3vB, boolean z) {
        if (this.f47052D.m21564A()) {
            return -3;
        }
        int K = this.f47054F.m21546K(anonymousClass2uL, anonymousClass3vB, z, this.f47052D.f47065L, this.f47052D.f47057D);
        if (K == -4) {
            m21558B();
        }
        return K;
    }
}

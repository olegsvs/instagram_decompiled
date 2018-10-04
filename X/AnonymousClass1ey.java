package X;

/* renamed from: X.1ey */
public final class AnonymousClass1ey extends AnonymousClass0lo {
    /* renamed from: B */
    public final AnonymousClass1ex f21067B;
    /* renamed from: C */
    public boolean f21068C;
    /* renamed from: D */
    private AnonymousClass0jO f21069D;
    /* renamed from: E */
    private AnonymousClass0nS f21070E;

    public AnonymousClass1ey(AnonymousClass0nS anonymousClass0nS, AnonymousClass0jO anonymousClass0jO, AnonymousClass1ex anonymousClass1ex) {
        this.f21070E = anonymousClass0nS;
        this.f21069D = anonymousClass0jO;
        this.f21067B = anonymousClass1ex;
    }

    /* renamed from: I */
    public final int mo2673I() {
        if (this.f21070E == AnonymousClass0nS.FEED) {
            return m7399K() - (this.f21068C ? m7399K() % this.f21067B.f21066B : 0);
        } else if (this.f21070E != AnonymousClass0nS.GRID) {
            throw new UnsupportedOperationException("View mode not handled");
        } else if (this.f21068C) {
            r2 = (double) m7399K();
            r0 = (double) this.f21067B.f21066B;
            Double.isNaN(r2);
            Double.isNaN(r0);
            return (int) Math.floor(r2 / r0);
        } else {
            r2 = (double) m7399K();
            r0 = (double) this.f21067B.f21066B;
            Double.isNaN(r2);
            Double.isNaN(r0);
            return (int) Math.ceil(r2 / r0);
        }
    }

    /* renamed from: L */
    public final String mo1796L(Object obj) {
        return ((AnonymousClass0P7) obj).getId();
    }

    /* renamed from: T */
    public final boolean m12351T(String str) {
        for (AnonymousClass0P7 MA : this.f9605C) {
            if (MA.MA().getId().equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: U */
    public final AnonymousClass2MJ m12352U(int i) {
        return new AnonymousClass2MJ(this.f9605C, i * this.f21067B.f21066B, this.f21067B.f21066B);
    }

    /* renamed from: V */
    public final void m12353V(AnonymousClass0nS anonymousClass0nS, boolean z) {
        this.f21070E = anonymousClass0nS;
        if (z) {
            this.f21069D.m7109C(anonymousClass0nS, this.f9605C, true);
        }
    }
}

package X;

/* renamed from: X.2vc */
public final class AnonymousClass2vc {
    /* renamed from: B */
    public int f35912B;
    /* renamed from: C */
    public final int f35913C;
    /* renamed from: D */
    public int f35914D;
    /* renamed from: E */
    public long f35915E;
    /* renamed from: F */
    private final AnonymousClass2yc f35916F;
    /* renamed from: G */
    private final boolean f35917G;
    /* renamed from: H */
    private int f35918H;
    /* renamed from: I */
    private int f35919I;
    /* renamed from: J */
    private final AnonymousClass2yc f35920J;

    public AnonymousClass2vc(AnonymousClass2yc anonymousClass2yc, AnonymousClass2yc anonymousClass2yc2, boolean z) {
        this.f35920J = anonymousClass2yc;
        this.f35916F = anonymousClass2yc2;
        this.f35917G = z;
        anonymousClass2yc2.m18064T(12);
        this.f35913C = anonymousClass2yc2.m18057M();
        anonymousClass2yc.m18064T(12);
        this.f35919I = anonymousClass2yc.m18057M();
        Object obj = 1;
        if (anonymousClass2yc.m18048D() != 1) {
            obj = null;
        }
        String str = "first_chunk must be 1";
        if (obj != null) {
            this.f35912B = -1;
            return;
        }
        throw new IllegalStateException(String.valueOf(str));
    }

    /* renamed from: A */
    public final boolean m17788A() {
        int i = this.f35912B + 1;
        this.f35912B = i;
        if (i == this.f35913C) {
            return false;
        }
        long N;
        if (this.f35917G) {
            N = this.f35916F.m18058N();
        } else {
            N = this.f35916F.m18056L();
        }
        this.f35915E = N;
        if (this.f35912B == this.f35918H) {
            this.f35914D = this.f35920J.m18057M();
            this.f35920J.m18065U(4);
            int i2 = this.f35919I - 1;
            this.f35919I = i2;
            this.f35918H = i2 > 0 ? this.f35920J.m18057M() - 1 : -1;
        }
        return true;
    }
}

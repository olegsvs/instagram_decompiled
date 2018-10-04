package X;

/* renamed from: X.0p5 */
public abstract class AnonymousClass0p5 {
    /* renamed from: B */
    public final String f10475B;
    /* renamed from: C */
    public final Object f10476C;
    /* renamed from: D */
    public final boolean f10477D;
    /* renamed from: E */
    public final Object f10478E;
    /* renamed from: F */
    private final AnonymousClass0Kh f10479F;
    /* renamed from: G */
    private AnonymousClass1YI f10480G;

    /* renamed from: B */
    public abstract int mo1849B();

    public AnonymousClass0p5(Object obj, Object obj2, String str, AnonymousClass0Kh anonymousClass0Kh, boolean z) {
        this.f10476C = obj;
        this.f10478E = obj2;
        this.f10475B = str;
        this.f10479F = anonymousClass0Kh;
        this.f10477D = z;
    }

    /* renamed from: A */
    public final boolean m7782A(int i) {
        return this.f10479F.m2842B(i) != null;
    }

    /* renamed from: C */
    public final void m7784C(int i) {
        AnonymousClass1cR anonymousClass1cR = (AnonymousClass1cR) this.f10479F.m2842B(i);
        anonymousClass1cR.f20631C = this.f10480G;
        anonymousClass1cR.mo2633A(this.f10476C, this.f10478E);
    }

    /* renamed from: D */
    public final void m7785D(int i, Object obj) {
        AnonymousClass1cW anonymousClass1cW = (AnonymousClass1cW) this.f10479F.m2842B(i);
        anonymousClass1cW.f20637C = this.f10480G;
        anonymousClass1cW.mo2635A(this.f10476C, this.f10478E, obj);
    }

    /* renamed from: E */
    public void mo1851E(AnonymousClass1YI anonymousClass1YI) {
        if (anonymousClass1YI != null) {
            this.f10480G = anonymousClass1YI;
        }
    }
}

package X;

/* renamed from: X.4Ou */
public final class AnonymousClass4Ou {
    /* renamed from: B */
    public boolean f53633B;
    /* renamed from: C */
    public boolean f53634C = AnonymousClass0Mt.D(this.f53635D);
    /* renamed from: D */
    public final AnonymousClass0Cm f53635D;
    /* renamed from: E */
    private final AnonymousClass4Ot f53636E;

    public AnonymousClass4Ou(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass4Ot anonymousClass4Ot) {
        this.f53635D = anonymousClass0Cm;
        this.f53636E = anonymousClass4Ot;
    }

    /* renamed from: A */
    public final boolean m24109A() {
        return AnonymousClass0a2.K(this.f53635D);
    }

    /* renamed from: B */
    public static void m24108B(AnonymousClass4Ou anonymousClass4Ou) {
        anonymousClass4Ou.f53636E.zz();
    }

    /* renamed from: B */
    public final void m24110B(boolean z) {
        m24109A();
        this.f53634C = z;
        AnonymousClass0Mt.N(z);
        AnonymousClass4Ou.m24108B(this);
    }

    /* renamed from: C */
    public final void m24111C(boolean z) {
        m24109A();
        this.f53634C = z;
        AnonymousClass4Ou.m24108B(this);
    }

    /* renamed from: D */
    public final boolean m24112D() {
        return m24109A() && this.f53634C && !this.f53633B;
    }
}

package X;

/* renamed from: X.4iB */
public final class AnonymousClass4iB implements AnonymousClass0U2 {
    /* renamed from: D */
    public static final AnonymousClass0U3 f56405D = new AnonymousClass4iA();
    /* renamed from: B */
    public final AnonymousClass0Tw f56406B;
    /* renamed from: C */
    public final AnonymousClass0Cm f56407C;

    public AnonymousClass4iB(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Tw anonymousClass0Tw) {
        this.f56407C = anonymousClass0Cm;
        this.f56406B = anonymousClass0Tw;
    }

    public final /* bridge */ /* synthetic */ void BV(AnonymousClass0U0 anonymousClass0U0, AnonymousClass0VN anonymousClass0VN) {
        this.f56406B.K((AnonymousClass4jx) anonymousClass0U0, false);
    }

    public final /* bridge */ /* synthetic */ void CV(AnonymousClass0U0 anonymousClass0U0) {
        this.f56406B.K((AnonymousClass4jx) anonymousClass0U0, true);
    }

    public final /* bridge */ /* synthetic */ void KMA(AnonymousClass0U0 anonymousClass0U0, AnonymousClass0db anonymousClass0db, AnonymousClass0XZ anonymousClass0XZ) {
        AnonymousClass4jx anonymousClass4jx = (AnonymousClass4jx) anonymousClass0U0;
        AnonymousClass0Cn anonymousClass0Cn = this.f56407C;
        String str = anonymousClass4jx.f56701C;
        boolean z = anonymousClass4jx.f56700B;
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        String str2 = "direct_v2/threads/%s/%s/";
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = z ? "mute" : "unmute";
        AnonymousClass0GA H = anonymousClass0Pt.L(str2, objArr).M(AnonymousClass0Pv.class).H();
        H.f2849B = new AnonymousClass4iZ(this.f56407C, anonymousClass0XZ);
        AnonymousClass0Ix.D(H);
    }

    public final /* bridge */ /* synthetic */ boolean UC(AnonymousClass0U0 anonymousClass0U0) {
        AnonymousClass4jx anonymousClass4jx = (AnonymousClass4jx) anonymousClass0U0;
        AnonymousClass0Tw anonymousClass0Tw = this.f56406B;
        synchronized (anonymousClass0Tw) {
            AnonymousClass0Vw c = anonymousClass0Tw.c(anonymousClass4jx.f56701C);
            if (c != null) {
                AnonymousClass4gz anonymousClass4gz;
                synchronized (c) {
                    anonymousClass4gz = c.f5813M;
                }
                anonymousClass4gz.m24794D(anonymousClass4jx.f5324C, Boolean.valueOf(anonymousClass4jx.f56700B));
                anonymousClass0Tw.AA(c.F());
            }
        }
        return true;
    }

    public final void mJA(AnonymousClass0U0 anonymousClass0U0) {
        AnonymousClass4jx anonymousClass4jx = (AnonymousClass4jx) anonymousClass0U0;
    }
}

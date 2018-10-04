package X;

/* renamed from: X.4iD */
public final class AnonymousClass4iD implements AnonymousClass0U2 {
    /* renamed from: D */
    public static final AnonymousClass0U3 f56408D = new AnonymousClass4iC();
    /* renamed from: B */
    public final AnonymousClass0Tw f56409B;
    /* renamed from: C */
    public final AnonymousClass0Cm f56410C;

    public AnonymousClass4iD(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Tw anonymousClass0Tw) {
        this.f56410C = anonymousClass0Cm;
        this.f56409B = anonymousClass0Tw;
    }

    public final /* bridge */ /* synthetic */ void BV(AnonymousClass0U0 anonymousClass0U0, AnonymousClass0VN anonymousClass0VN) {
        this.f56409B.L((AnonymousClass4k0) anonymousClass0U0, false);
    }

    public final /* bridge */ /* synthetic */ void CV(AnonymousClass0U0 anonymousClass0U0) {
        this.f56409B.L((AnonymousClass4k0) anonymousClass0U0, true);
    }

    public final /* bridge */ /* synthetic */ void KMA(AnonymousClass0U0 anonymousClass0U0, AnonymousClass0db anonymousClass0db, AnonymousClass0XZ anonymousClass0XZ) {
        AnonymousClass4k0 anonymousClass4k0 = (AnonymousClass4k0) anonymousClass0U0;
        AnonymousClass0Cn anonymousClass0Cn = this.f56410C;
        String str = anonymousClass4k0.f56704C;
        boolean z = anonymousClass4k0.f56703B;
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        String str2 = "direct_v2/threads/%s/%s/";
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = z ? "mute_video_call" : "unmute_video_call";
        AnonymousClass0GA H = anonymousClass0Pt.L(str2, objArr).M(AnonymousClass0Pv.class).H();
        H.f2849B = new AnonymousClass4iZ(this.f56410C, anonymousClass0XZ);
        AnonymousClass0Ix.D(H);
    }

    public final /* bridge */ /* synthetic */ boolean UC(AnonymousClass0U0 anonymousClass0U0) {
        AnonymousClass4k0 anonymousClass4k0 = (AnonymousClass4k0) anonymousClass0U0;
        AnonymousClass0Tw anonymousClass0Tw = this.f56409B;
        synchronized (anonymousClass0Tw) {
            AnonymousClass0Vw c = anonymousClass0Tw.c(anonymousClass4k0.f56704C);
            if (c != null) {
                AnonymousClass4gz anonymousClass4gz;
                synchronized (c) {
                    anonymousClass4gz = c.f5819S;
                }
                anonymousClass4gz.m24794D(anonymousClass4k0.f5324C, Boolean.valueOf(anonymousClass4k0.f56703B));
                anonymousClass0Tw.AA(c.F());
            }
        }
        return true;
    }

    public final void mJA(AnonymousClass0U0 anonymousClass0U0) {
        AnonymousClass4k0 anonymousClass4k0 = (AnonymousClass4k0) anonymousClass0U0;
    }
}

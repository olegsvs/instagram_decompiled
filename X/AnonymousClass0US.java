package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.0US */
public final class AnonymousClass0US implements AnonymousClass0U2 {
    /* renamed from: D */
    public static final AnonymousClass0U3 f5446D = new AnonymousClass0ZA();
    /* renamed from: B */
    public final AnonymousClass0Cm f5447B;
    /* renamed from: C */
    private final AnonymousClass0Tw f5448C;

    public AnonymousClass0US(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Tw anonymousClass0Tw) {
        this.f5447B = anonymousClass0Cm;
        this.f5448C = anonymousClass0Tw;
    }

    /* renamed from: A */
    public final boolean m4731A(AnonymousClass0UR anonymousClass0UR) {
        AnonymousClass0WH S = this.f5448C.m4621S(anonymousClass0UR.f5445C);
        if (S == null) {
            return false;
        }
        AnonymousClass4gz anonymousClass4gz;
        AnonymousClass0Vw anonymousClass0Vw = S.f5958J;
        synchronized (anonymousClass0Vw) {
            anonymousClass4gz = anonymousClass0Vw.f5810J;
        }
        anonymousClass4gz.D(anonymousClass0UR.f5324C, Boolean.valueOf(anonymousClass0UR.f5444B));
        AnonymousClass0Tw anonymousClass0Tw = this.f5448C;
        synchronized (anonymousClass0Tw) {
            anonymousClass0Tw.m4643o("DirectThreadStore.notifyUnreadStateChanged", 150);
            anonymousClass0Tw.AA(anonymousClass0Vw.m4934F());
        }
        return true;
    }

    /* renamed from: B */
    public static void m4730B(AnonymousClass0US anonymousClass0US, AnonymousClass0UR anonymousClass0UR, boolean z) {
        AnonymousClass0Vw c = AnonymousClass0Tw.m4598C(anonymousClass0US.f5447B).m4631c(anonymousClass0UR.f5445C.f5871C);
        if (c != null) {
            synchronized (c) {
                anonymousClass0US = c.f5810J;
            }
            anonymousClass0US.A(anonymousClass0UR.f5324C, Boolean.valueOf(anonymousClass0UR.f5444B), z);
        }
    }

    public final /* bridge */ /* synthetic */ void BV(AnonymousClass0U0 anonymousClass0U0, AnonymousClass0VN anonymousClass0VN) {
        AnonymousClass0US.m4730B(this, (AnonymousClass0UR) anonymousClass0U0, false);
    }

    public final /* bridge */ /* synthetic */ void CV(AnonymousClass0U0 anonymousClass0U0) {
        AnonymousClass0US.m4730B(this, (AnonymousClass0UR) anonymousClass0U0, true);
    }

    public final /* bridge */ /* synthetic */ void KMA(AnonymousClass0U0 anonymousClass0U0, AnonymousClass0db anonymousClass0db, AnonymousClass0XZ anonymousClass0XZ) {
        AnonymousClass0UR anonymousClass0UR = (AnonymousClass0UR) anonymousClass0U0;
        AnonymousClass0Cn anonymousClass0Cn = this.f5447B;
        DirectThreadKey directThreadKey = anonymousClass0UR.f5445C;
        boolean z = anonymousClass0UR.f5444B;
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        AnonymousClass0Pt M = anonymousClass0Pt.m3943L("direct_v2/threads/%s/mark_unread/", directThreadKey.f5871C).m3944M(AnonymousClass0Pv.class);
        M.m3936E("marked", z);
        AnonymousClass0GA H = M.m3939H();
        H.f2849B = new AnonymousClass4iZ(this.f5447B, anonymousClass0XZ);
        AnonymousClass0Ix.m2384D(H);
    }

    public final /* bridge */ /* synthetic */ boolean UC(AnonymousClass0U0 anonymousClass0U0) {
        return m4731A((AnonymousClass0UR) anonymousClass0U0);
    }

    public final void mJA(AnonymousClass0U0 anonymousClass0U0) {
        AnonymousClass0UR anonymousClass0UR = (AnonymousClass0UR) anonymousClass0U0;
    }
}

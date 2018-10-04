package X;

/* renamed from: X.0iN */
public final class AnonymousClass0iN {
    /* renamed from: B */
    private static final AnonymousClass0IP f8674B = AnonymousClass0Ix.m2382B();

    /* renamed from: B */
    public static void m6876B(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0XM anonymousClass0XM, AnonymousClass0iM anonymousClass0iM, AnonymousClass0iL anonymousClass0iL) {
        f8674B.schedule(AnonymousClass0iN.m6878D(anonymousClass0Cm, anonymousClass0XM.m5230A(), anonymousClass0iM, anonymousClass0iL, anonymousClass0XM.f6154H.m7421A(), null));
    }

    /* renamed from: C */
    public static void m6877C(AnonymousClass0Cm anonymousClass0Cm, String str, AnonymousClass0iM anonymousClass0iM, AnonymousClass0iL anonymousClass0iL, String str2, AnonymousClass0Iw anonymousClass0Iw) {
        AnonymousClass0IP anonymousClass0IP = f8674B;
        AnonymousClass0GA D = AnonymousClass0iN.m6878D(anonymousClass0Cm, str, anonymousClass0iM, anonymousClass0iL, str2, null);
        D.f2849B = anonymousClass0Iw;
        anonymousClass0IP.schedule(D);
    }

    /* renamed from: D */
    private static AnonymousClass0Iu m6878D(AnonymousClass0Cm anonymousClass0Cm, String str, AnonymousClass0iM anonymousClass0iM, AnonymousClass0iL anonymousClass0iL, String str2, AnonymousClass0Ci anonymousClass0Ci) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt((AnonymousClass0Cn) anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "megaphone/log/";
        anonymousClass0Cm = anonymousClass0Pt.m3935D("type", str).m3935D("action", anonymousClass0iM.f8673B).m3944M(AnonymousClass0Pv.class);
        if (anonymousClass0iL != null) {
            anonymousClass0Cm.m3935D("display_medium", anonymousClass0iL.f8639B);
        }
        if (str2 != null) {
            anonymousClass0Cm.m3935D("uuid", str2);
        }
        if (anonymousClass0Ci != null) {
            anonymousClass0Cm.m3935D("target_user_id", anonymousClass0Ci.getId());
        }
        return anonymousClass0Cm.m3939H();
    }
}

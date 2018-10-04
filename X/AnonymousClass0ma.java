package X;

/* renamed from: X.0ma */
public final class AnonymousClass0ma {
    /* renamed from: B */
    public static AnonymousClass0Iu m7545B(AnonymousClass0Cm anonymousClass0Cm, String str, String str2, String str3) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt((AnonymousClass0Cn) anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "discover/aysf_dismiss/";
        anonymousClass0Pt = anonymousClass0Pt.m3935D("target_id", str).m3935D("uuid", str2).m3944M(AnonymousClass0Pv.class);
        if (str3 != null) {
            anonymousClass0Pt.m3935D("algorithm", str3);
        }
        return anonymousClass0Pt.m3939H();
    }

    /* renamed from: C */
    public static AnonymousClass0Iu m7546C(AnonymousClass0Cm anonymousClass0Cm, String str, String str2) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt((AnonymousClass0Cn) anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "discover/chaining_dismiss/";
        return anonymousClass0Pt.m3935D("target_id", str).m3935D("chaining_user_id", str2).m3944M(AnonymousClass0Pv.class).m3939H();
    }
}

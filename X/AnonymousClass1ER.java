package X;

/* renamed from: X.1ER */
public abstract class AnonymousClass1ER {
    /* renamed from: B */
    public static AnonymousClass0Iu m10195B(AnonymousClass0Cm anonymousClass0Cm, String str, boolean z, String str2) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt((AnonymousClass0Cn) anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        anonymousClass0Pt.f4229M = "direct_v2/ranked_recipients/";
        anonymousClass0Pt = anonymousClass0Pt.m3935D("use_unified_inbox", "true").m3944M(AnonymousClass1ES.class);
        if (!(str == null || str.isEmpty())) {
            anonymousClass0Pt.m3935D("query", str);
        }
        anonymousClass0Pt.m3935D("mode", str2);
        anonymousClass0Pt.m3935D("show_threads", z ? "true" : "false");
        return anonymousClass0Pt.m3939H();
    }
}

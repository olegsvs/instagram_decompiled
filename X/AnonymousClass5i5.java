package X;

/* renamed from: X.5i5 */
public final class AnonymousClass5i5 {
    /* renamed from: B */
    public static AnonymousClass0Iu m28317B(AnonymousClass0Cm anonymousClass0Cm, String str, String str2) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        anonymousClass0Pt.f4229M = "survey/get/";
        anonymousClass0Pt = anonymousClass0Pt.D("type", str).D("timezone_offset", Long.toString(AnonymousClass0dw.J().longValue())).M(AnonymousClass3QQ.class);
        if (str2 != null) {
            anonymousClass0Pt.D("extra_data_token", str2);
        }
        return anonymousClass0Pt.H();
    }
}

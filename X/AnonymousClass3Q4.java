package X;

import android.content.Context;

/* renamed from: X.3Q4 */
public final class AnonymousClass3Q4 {
    /* renamed from: B */
    public static void m19584B(Context context, AnonymousClass0Cn anonymousClass0Cn) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "consent/new_user_flow_begins/";
        AnonymousClass0Ix.D(anonymousClass0Pt.D("device_id", AnonymousClass0Dt.f1941C.A(context)).M(AnonymousClass3Pz.class).N().H());
    }

    /* renamed from: C */
    public static void m19585C(AnonymousClass3Q3 anonymousClass3Q3, AnonymousClass0Iw anonymousClass0Iw) {
        AnonymousClass0Pt anonymousClass0Pt = anonymousClass3Q3.f41034B;
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.M(AnonymousClass3Pz.class);
        if (anonymousClass3Q3.f41038F == AnonymousClass3Q8.EXISTING_USER) {
            anonymousClass3Q3.f41034B.f4229M = "consent/existing_user_flow/";
        } else if (anonymousClass3Q3.f41038F == AnonymousClass3Q8.NEW_USER) {
            anonymousClass3Q3.f41034B.f4229M = "consent/new_user_flow/";
            anonymousClass3Q3.f41034B.D("device_id", AnonymousClass0Dt.B(anonymousClass3Q3.f41035C)).D("guid", AnonymousClass0Dt.f1941C.A(anonymousClass3Q3.f41035C)).F("phone_id", AnonymousClass0N2.B().B()).D("gdpr_s", anonymousClass3Q3.f41036D);
        }
        AnonymousClass3Q5 anonymousClass3Q5 = anonymousClass3Q3.f41037E;
        if (anonymousClass3Q5 != null) {
            anonymousClass3Q3.f41034B.D("current_screen_key", anonymousClass3Q5.m19587A());
        }
        AnonymousClass0GA H = anonymousClass3Q3.f41034B.N().H();
        H.f2849B = anonymousClass0Iw;
        AnonymousClass0Ix.D(H);
    }
}

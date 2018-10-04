package X;

import android.content.Context;

/* renamed from: X.50o */
public final class AnonymousClass50o {
    /* renamed from: B */
    public static void m25586B(AnonymousClass0Cn anonymousClass0Cn, Context context, AnonymousClass0Fz anonymousClass0Fz, AnonymousClass0Iw anonymousClass0Iw) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "accounts/generate_two_factor_totp_key/";
        AnonymousClass0GA H = anonymousClass0Pt.D("device_id", AnonymousClass0Dt.B(context)).M(AnonymousClass50s.class).N().H();
        H.f2849B = anonymousClass0Iw;
        AnonymousClass0Px.B(context, anonymousClass0Fz, H);
    }
}

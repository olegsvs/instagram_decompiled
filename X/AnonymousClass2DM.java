package X;

import android.content.Context;

/* renamed from: X.2DM */
public final class AnonymousClass2DM {
    /* renamed from: B */
    public static AnonymousClass0Iu m14723B(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "accounts/disable_sms_two_factor/";
        return anonymousClass0Pt.M(AnonymousClass0Pv.class).N().H();
    }

    /* renamed from: C */
    public static AnonymousClass0Iu m14724C(Context context, String str, String str2) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt();
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "accounts/enable_sms_two_factor/";
        return anonymousClass0Pt.M(AnonymousClass2aa.class).D("phone_number", str).D("device_id", AnonymousClass0Dt.B(context)).D("guid", AnonymousClass0Dt.f1941C.A(context)).D("verification_code", str2).N().H();
    }

    /* renamed from: D */
    public static AnonymousClass0Iu m14725D() {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt();
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "accounts/regen_backup_codes/";
        return anonymousClass0Pt.M(AnonymousClass2Zv.class).N().H();
    }

    /* renamed from: E */
    public static AnonymousClass0Iu m14726E(Context context, AnonymousClass0Cm anonymousClass0Cm, String str) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "accounts/send_two_factor_enable_sms/";
        return anonymousClass0Pt.M(AnonymousClass2aT.class).D("phone_number", str).D("device_id", AnonymousClass0Dt.B(context)).D("guid", AnonymousClass0Dt.f1941C.A(context)).N().H();
    }

    /* renamed from: F */
    public static AnonymousClass0Iu m14727F(Context context, String str, String str2) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(AnonymousClass0G7.G());
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "accounts/send_two_factor_login_sms/";
        return anonymousClass0Pt.M(AnonymousClass2aH.class).D("username", str).D("two_factor_identifier", str2).D("device_id", AnonymousClass0Dt.B(context)).D("guid", AnonymousClass0Dt.f1941C.A(context)).N().H();
    }

    /* renamed from: G */
    public static AnonymousClass0Iu m14728G(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "accounts/account_security_info/";
        return anonymousClass0Pt.M(AnonymousClass2Zv.class).N().H();
    }

    /* renamed from: H */
    public static AnonymousClass0Iu m14729H(Context context, String str, String str2, String str3, String str4) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(AnonymousClass0G7.G());
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "accounts/two_factor_login/";
        return anonymousClass0Pt.M(AnonymousClass2aH.class).D("username", str).F("verification_method", str4).D("two_factor_identifier", str2).D("device_id", AnonymousClass0Dt.B(context)).D("guid", AnonymousClass0Dt.f1941C.A(context)).D("verification_code", str3).N().H();
    }
}

package X;

import android.text.TextUtils;

/* renamed from: X.5za */
public final class AnonymousClass5za {
    /* renamed from: B */
    public static AnonymousClass0Iu m28730B(AnonymousClass0Cm anonymousClass0Cm, String str) {
        AnonymousClass1Cy.D(TextUtils.isEmpty(str) ^ 1);
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "school/invite/";
        return anonymousClass0Pt.M(AnonymousClass0Pv.class).D("invitee_id", str).N().H();
    }

    /* renamed from: C */
    public static AnonymousClass0Iu m28731C(AnonymousClass0Cm anonymousClass0Cm, String str, boolean z) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "school/opt_out/";
        return anonymousClass0Pt.M(AnonymousClass5zg.class).E("is_wrong_school", z).D("school_id", str).N().H();
    }

    /* renamed from: D */
    public static AnonymousClass0Iu m28732D(AnonymousClass0Cm anonymousClass0Cm, String str, String str2, String str3) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "school/";
        return anonymousClass0Pt.D("page_fbid", str).F("class_year", str2).F("description", str3).M(AnonymousClass5zg.class).N().H();
    }
}

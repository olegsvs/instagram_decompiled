package X;

import java.util.List;

/* renamed from: X.33a */
public final class AnonymousClass33a {
    /* renamed from: B */
    public static void m18357B(String str, String str2, String str3) {
        AnonymousClass33e.EDIT_PROFILE_CANCEL.m18380A().F("entry_point", str).F("fb_user_id", str3).F("step", str2).R();
    }

    /* renamed from: C */
    public static void m18358C(String str, String str2, List list, String str3, String str4) {
        str2 = AnonymousClass33e.EDIT_PROFILE_START_STEP.m18380A().F("entry_point", str).F("fb_user_id", str4).F("step", str2);
        str = AnonymousClass0lA.B();
        for (String C : list) {
            str.C(C);
        }
        String str5 = "page_id";
        AnonymousClass0db F = AnonymousClass0db.C().F(str5, str);
        str2.D("available_options", F).D("default_values", AnonymousClass0db.C().G(str5, str3));
        str2.R();
    }

    /* renamed from: D */
    public static void m18359D(String str, String str2, String str3, String str4) {
        AnonymousClass33e.EDIT_PROFILE_TAP_COMPONENT.m18380A().F("entry_point", str).F("fb_user_id", str4).F("step", str2).F("component", str3).R();
    }
}

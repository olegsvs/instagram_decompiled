package X;

import android.content.SharedPreferences;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;

/* renamed from: X.0Mt */
public final class AnonymousClass0Mt {
    /* renamed from: B */
    public static void m3239B() {
        AnonymousClass0Mt.m3244G().edit().clear().apply();
    }

    /* renamed from: C */
    public static boolean m3240C() {
        return AnonymousClass0Mt.m3244G().getBoolean("auto_cross_post_to_facebook_feed", false);
    }

    /* renamed from: D */
    public static boolean m3241D(AnonymousClass0Cm anonymousClass0Cm) {
        if (AnonymousClass0Mt.m3244G().getBoolean("auto_cross_post_reels_to_facebook", false) || AnonymousClass0HV.m2008D(anonymousClass0Cm).f2646B.getBoolean("auto_share_to_facebook", false)) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public static String m3242E() {
        return AnonymousClass0Mt.m3244G().getString("biz_social_context", null);
    }

    /* renamed from: F */
    public static int m3243F() {
        return AnonymousClass0Mt.m3244G().getInt("invite_suggestions", -1);
    }

    /* renamed from: G */
    public static SharedPreferences m3244G() {
        return AnonymousClass0Mu.m3254C("facebookPreferences");
    }

    /* renamed from: H */
    public static SharedPreferences m3245H(AnonymousClass0Cm anonymousClass0Cm) {
        return AnonymousClass0Mu.m3253B(anonymousClass0Cm, "facebookPreferences");
    }

    /* renamed from: I */
    public static SharedPreferences m3246I(String str) {
        return AnonymousClass0Mu.m3255D(str, "facebookPreferences");
    }

    /* renamed from: J */
    public static String m3247J() {
        return AnonymousClass0Mt.m3244G().getString(MemoryDumpUploadJob.EXTRA_USER_ID, null);
    }

    /* renamed from: K */
    public static void m3248K(long j) {
        AnonymousClass0Mt.m3244G().edit().putLong("last_first_party_to_third_check", j).apply();
    }

    /* renamed from: L */
    public static void m3249L(long j) {
        AnonymousClass0Mt.m3244G().edit().putLong("last_invite_count_access_notoken", j).apply();
    }

    /* renamed from: M */
    public static void m3250M(boolean z) {
        AnonymousClass0Mt.m3244G().edit().putBoolean("auto_cross_post_to_facebook_feed", z).apply();
    }

    /* renamed from: N */
    public static void m3251N(boolean z) {
        AnonymousClass0Mt.m3244G().edit().putBoolean("auto_cross_post_reels_to_facebook", z).apply();
    }

    /* renamed from: O */
    public static void m3252O(String str, String str2, String str3) {
        AnonymousClass0Mt.m3244G().edit().putString("page_access_token", str3).putString("page_id", str).putString("page_name", str2).putBoolean("token_has_manage_pages", true).apply();
    }
}

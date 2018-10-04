package X;

import android.content.Context;
import android.preference.PreferenceManager;

/* renamed from: X.3K0 */
public final class AnonymousClass3K0 {
    /* renamed from: B */
    public static AnonymousClass3Jw m19389B(Context context) {
        AnonymousClass3Jw D = AnonymousClass3K0.m19391D(context);
        if (D == null) {
            return null;
        }
        if (D.f40127E > AnonymousClass0FF.B(context)) {
            return D;
        }
        AnonymousClass3K0.m19390C(context);
        return null;
    }

    /* renamed from: C */
    public static void m19390C(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().remove("self_update_job_download_info").apply();
    }

    /* renamed from: D */
    public static AnonymousClass3Jw m19391D(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("self_update_job_download_info", null);
        if (string == null) {
            return null;
        }
        return AnonymousClass3Jw.parseFromJson(string);
    }
}

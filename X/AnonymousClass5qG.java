package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: X.5qG */
public final class AnonymousClass5qG {
    /* renamed from: B */
    public static final String f69298B = "QPPreferenceUtil";

    /* renamed from: B */
    public static void m28534B(Context context) {
        context = AnonymousClass5qG.m28537E(context);
        context.edit().remove("qp_cooldown_response_json").apply();
        context.edit().remove("qp_cooldown_response_expiration_time").apply();
    }

    /* renamed from: C */
    public static void m28535C(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0TD anonymousClass0TD) {
        String C = AnonymousClass0oA.C(anonymousClass0Cm, anonymousClass0TD);
        AnonymousClass0HV.D(anonymousClass0Cm).f2646B.edit().remove(AnonymousClass0HV.E(C)).apply();
        AnonymousClass0HV.D(anonymousClass0Cm).f2646B.edit().remove(AnonymousClass0HV.F(C)).apply();
    }

    /* renamed from: D */
    public static AnonymousClass1IC m28536D(Context context) {
        String string = AnonymousClass5qG.m28537E(context).getString("qp_cooldown_response_json", null);
        if (string != null) {
            try {
                return AnonymousClass1I7.parseFromJson(string);
            } catch (Throwable e) {
                AnonymousClass0Dc.G(f69298B, "failed to parse stored QP cooldown response.", e);
            }
        }
        return null;
    }

    /* renamed from: E */
    public static SharedPreferences m28537E(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    /* renamed from: F */
    public static long m28538F(AnonymousClass0Cm anonymousClass0Cm, String str) {
        return AnonymousClass0HV.D(anonymousClass0Cm).f2646B.getLong(AnonymousClass0HV.E(str), -1);
    }

    /* renamed from: G */
    public static boolean m28539G(Context context) {
        return AnonymousClass5qG.m28537E(context).getLong("qp_cooldown_response_expiration_time", 0) <= System.currentTimeMillis();
    }
}

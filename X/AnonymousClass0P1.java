package X;

import android.content.SharedPreferences;

/* renamed from: X.0P1 */
public final class AnonymousClass0P1 implements AnonymousClass0G2 {
    /* renamed from: B */
    private SharedPreferences f3967B;

    public final void onUserSessionWillEnd(boolean z) {
    }

    private AnonymousClass0P1(AnonymousClass0Cm anonymousClass0Cm) {
        this.f3967B = AnonymousClass0Mu.m3253B(anonymousClass0Cm, "TimeSpentPreferences");
    }

    /* renamed from: B */
    public static long m3703B(AnonymousClass0Cm anonymousClass0Cm) {
        return AnonymousClass0P1.m3704C(anonymousClass0Cm).getLong("DAILY_QUOTA", 0);
    }

    /* renamed from: C */
    public static SharedPreferences m3704C(AnonymousClass0Cm anonymousClass0Cm) {
        Class cls = AnonymousClass0P1.class;
        AnonymousClass0P1 anonymousClass0P1 = (AnonymousClass0P1) anonymousClass0Cm.m1036A(cls);
        if (anonymousClass0P1 == null) {
            anonymousClass0P1 = new AnonymousClass0P1(anonymousClass0Cm);
            anonymousClass0Cm.m1039D(cls, anonymousClass0P1);
        }
        return anonymousClass0P1.f3967B;
    }

    /* renamed from: D */
    public static void m3705D(AnonymousClass0Cm anonymousClass0Cm, long j) {
        AnonymousClass0P1.m3704C(anonymousClass0Cm).edit().putLong("DAILY_QUOTA", j).apply();
    }
}

package X;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.142 */
public final class AnonymousClass142 implements AnonymousClass0G2 {
    /* renamed from: B */
    public SharedPreferences f13819B;

    private AnonymousClass142(AnonymousClass0Cm anonymousClass0Cm) {
        this.f13819B = AnonymousClass0Mu.m3253B(anonymousClass0Cm, "IgJobSchedulerPreferences");
    }

    /* renamed from: A */
    public final synchronized Set m9147A() {
        return this.f13819B.getStringSet("services_waiting_for_connectivity_change", new HashSet());
    }

    /* renamed from: B */
    public static synchronized AnonymousClass142 m9146B(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass142 anonymousClass142;
        Class cls = AnonymousClass142.class;
        synchronized (cls) {
            anonymousClass142 = (AnonymousClass142) anonymousClass0Cm.m1036A(cls);
            if (anonymousClass142 == null) {
                anonymousClass142 = new AnonymousClass142(anonymousClass0Cm);
                anonymousClass0Cm.m1039D(cls, anonymousClass142);
            }
        }
        return anonymousClass142;
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.f13819B.edit().clear().apply();
    }
}

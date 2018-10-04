package X;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.59U */
public final class AnonymousClass59U {
    /* renamed from: B */
    public final List f60621B = new CopyOnWriteArrayList();

    /* renamed from: A */
    public final void m25866A(boolean z) {
        if (AnonymousClass59U.m25865B() != z) {
            for (AnonymousClass5u6 A : this.f60621B) {
                A.m28616A(z);
            }
            AnonymousClass0HV.C().f2646B.edit().putBoolean("show_stories_insights", z).apply();
        }
    }

    /* renamed from: B */
    public static boolean m25865B() {
        return AnonymousClass0HV.C().f2646B.getBoolean("show_stories_insights", true);
    }
}

package X;

import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.11V */
public final class AnonymousClass11V implements AnonymousClass0G2 {
    /* renamed from: B */
    public final CopyOnWriteArraySet f13417B = new CopyOnWriteArraySet();

    public final void onUserSessionWillEnd(boolean z) {
    }

    private AnonymousClass11V() {
    }

    /* renamed from: B */
    public static synchronized AnonymousClass11V m8801B(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass11V anonymousClass11V;
        Class cls = AnonymousClass11V.class;
        synchronized (cls) {
            anonymousClass11V = (AnonymousClass11V) anonymousClass0Cm.m1036A(cls);
            if (anonymousClass11V == null) {
                anonymousClass11V = new AnonymousClass11V();
                anonymousClass0Cm.m1039D(cls, anonymousClass11V);
            }
        }
        return anonymousClass11V;
    }
}

package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.66E */
public final class AnonymousClass66E implements AnonymousClass0G2 {
    /* renamed from: B */
    public final Set f71730B = new HashSet();

    /* renamed from: B */
    public static AnonymousClass66E m28983B(AnonymousClass0Cm anonymousClass0Cm) {
        Class cls = AnonymousClass66E.class;
        AnonymousClass66E anonymousClass66E = (AnonymousClass66E) anonymousClass0Cm.A(cls);
        if (anonymousClass66E != null) {
            return anonymousClass66E;
        }
        Object anonymousClass66E2 = new AnonymousClass66E();
        anonymousClass0Cm.D(cls, anonymousClass66E2);
        return anonymousClass66E2;
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.f71730B.clear();
    }
}

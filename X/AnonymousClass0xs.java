package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0xs */
public final class AnonymousClass0xs {
    /* renamed from: B */
    public static Set f12668B;
    /* renamed from: C */
    private static AnonymousClass0xs f12669C;

    /* renamed from: B */
    public static synchronized AnonymousClass0xs m8589B() {
        AnonymousClass0xs anonymousClass0xs;
        synchronized (AnonymousClass0xs.class) {
            if (f12669C == null) {
                f12669C = new AnonymousClass0xs();
                f12668B = new HashSet();
            }
            anonymousClass0xs = f12669C;
        }
        return anonymousClass0xs;
    }
}

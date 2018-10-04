package X;

import java.util.List;

/* renamed from: X.5rA */
public final class AnonymousClass5rA extends AnonymousClass19N {
    /* renamed from: A */
    public final boolean m28564A(List list, AnonymousClass0T7 anonymousClass0T7, AnonymousClass0oj anonymousClass0oj) {
        for (AnonymousClass19O GHA : list) {
            if (GHA.GHA(anonymousClass0T7, anonymousClass0oj)) {
                return true;
            }
        }
        if (list == null) {
            return true;
        }
        if (list.isEmpty()) {
            return true;
        }
        return false;
    }
}

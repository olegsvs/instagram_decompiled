package X;

import java.util.Comparator;

/* renamed from: X.5Qw */
public final class AnonymousClass5Qw implements Comparator {
    public final int compare(Object obj, Object obj2) {
        AnonymousClass0Ot anonymousClass0Ot = (AnonymousClass0Ot) obj;
        AnonymousClass0Ot anonymousClass0Ot2 = (AnonymousClass0Ot) obj2;
        if (anonymousClass0Ot.f3955B > anonymousClass0Ot2.f3955B) {
            return 1;
        }
        return anonymousClass0Ot.f3955B == anonymousClass0Ot2.f3955B ? 0 : -1;
    }
}

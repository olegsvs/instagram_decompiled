package X;

import java.util.Comparator;

/* renamed from: X.4Ak */
public final class AnonymousClass4Ak implements Comparator {
    public AnonymousClass4Ak(AnonymousClass4Am anonymousClass4Am) {
    }

    public final int compare(Object obj, Object obj2) {
        AnonymousClass0OA anonymousClass0OA = (AnonymousClass0OA) obj;
        AnonymousClass0OA anonymousClass0OA2 = (AnonymousClass0OA) obj2;
        if (anonymousClass0OA.kC > anonymousClass0OA2.kC) {
            return -1;
        }
        return anonymousClass0OA.kC == anonymousClass0OA2.kC ? 0 : 1;
    }
}

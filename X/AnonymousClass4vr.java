package X;

import java.util.Comparator;

/* renamed from: X.4vr */
public final class AnonymousClass4vr implements Comparator {
    public final int compare(Object obj, Object obj2) {
        AnonymousClass0nO anonymousClass0nO = (AnonymousClass0nO) obj2;
        obj = ((AnonymousClass4vt) ((AnonymousClass0nO) obj).f10057B).f58580B;
        int i = ((AnonymousClass4vt) anonymousClass0nO.f10057B).f58580B;
        if (obj < i) {
            return -1;
        }
        return obj == i ? 0 : 1;
    }
}

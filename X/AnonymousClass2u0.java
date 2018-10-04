package X;

import java.util.Comparator;

/* renamed from: X.2u0 */
public final class AnonymousClass2u0 implements Comparator {
    public final int compare(Object obj, Object obj2) {
        AnonymousClass2u1 anonymousClass2u1 = (AnonymousClass2u1) obj;
        AnonymousClass2u1 anonymousClass2u12 = (AnonymousClass2u1) obj2;
        if (anonymousClass2u1.f35502C < anonymousClass2u12.f35502C) {
            return -1;
        }
        return anonymousClass2u12.f35502C < anonymousClass2u1.f35502C ? 1 : 0;
    }
}

package X;

import java.util.Comparator;

/* renamed from: X.1UJ */
public final class AnonymousClass1UJ implements Comparator {
    public AnonymousClass1UJ(AnonymousClass0Nx anonymousClass0Nx) {
    }

    public final int compare(Object obj, Object obj2) {
        AnonymousClass0IC anonymousClass0IC = (AnonymousClass0IC) obj;
        AnonymousClass0IC anonymousClass0IC2 = (AnonymousClass0IC) obj2;
        if (((Long) anonymousClass0IC.f2727B).longValue() < ((Long) anonymousClass0IC2.f2727B).longValue()) {
            return -1;
        }
        return ((Long) anonymousClass0IC.f2727B).longValue() > ((Long) anonymousClass0IC2.f2727B).longValue() ? 1 : 0;
    }
}

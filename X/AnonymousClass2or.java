package X;

import java.util.Comparator;

/* renamed from: X.2or */
public final class AnonymousClass2or implements Comparator {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: A */
    public final int m17300A(X.AnonymousClass2ok r4, X.AnonymousClass2ok r5) {
        /*
        r3 = this;
        r1 = r4.f34351D;
        r0 = r5.f34351D;
        r3 = 1;
        r2 = -1;
        if (r1 == r0) goto L_0x0012;
    L_0x0008:
        r0 = r4.f34351D;
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        return r2;
    L_0x000d:
        r0 = r5.f34351D;
        if (r0 == 0) goto L_0x0012;
    L_0x0011:
        return r3;
    L_0x0012:
        r0 = r4.f34354G;
        r1 = X.AnonymousClass2or.m17299B(r0);
        r0 = r5.f34354G;
        r0 = X.AnonymousClass2or.m17299B(r0);
        if (r1 >= r0) goto L_0x0021;
    L_0x0020:
        goto L_0x000c;
    L_0x0021:
        if (r1 != r0) goto L_0x0011;
    L_0x0023:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2or.A(X.2ok, X.2ok):int");
    }

    /* renamed from: B */
    private static int m17299B(Integer num) {
        switch (num.intValue()) {
            case 1:
                return null;
            case 2:
                return 1;
            case 3:
                return 3;
            case 4:
                return 2;
            default:
                return Integer.MAX_VALUE;
        }
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return m17300A((AnonymousClass2ok) obj, (AnonymousClass2ok) obj2);
    }
}

package X;

import java.math.BigInteger;
import java.util.Comparator;

/* renamed from: X.0Wx */
public final class AnonymousClass0Wx extends AnonymousClass0WU {
    /* renamed from: B */
    public static final Comparator f6072B = new AnonymousClass1bs();
    /* renamed from: C */
    public static final AnonymousClass0Wx f6073C = new AnonymousClass0Wx();

    private AnonymousClass0Wx() {
        super("MINCURSOR", "MAXCURSOR", f6072B);
    }

    /* renamed from: B */
    public static String m5188B(String str, boolean z, boolean z2) {
        if (str != null && z) {
            return new BigInteger(str).add(BigInteger.ONE).toString();
        }
        if (str != null || z2) {
            return f6073C.f5989C;
        }
        return f6073C.f5990D;
    }

    /* renamed from: C */
    public static String m5189C(String str, boolean z, boolean z2) {
        if (str != null && z) {
            return new BigInteger(str).subtract(BigInteger.ONE).toString();
        }
        if (str != null || z2) {
            return f6073C.f5990D;
        }
        return f6073C.f5989C;
    }
}

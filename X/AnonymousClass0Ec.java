package X;

import com.facebook.profilo.core.TriggerRegistry;
import java.util.Random;

/* renamed from: X.0Ec */
public final class AnonymousClass0Ec implements AnonymousClass0Ed, AnonymousClass0Ee {
    /* renamed from: C */
    public static final int f2002C = TriggerRegistry.m9886B("qpl");
    /* renamed from: D */
    public static final int f2003D = TriggerRegistry.m9886B("sequence_qpl");
    /* renamed from: B */
    private Random f2004B = new Random();

    public final boolean NF(int i, Object obj, int i2, Object obj2) {
        return obj == obj2;
    }

    public final boolean iX(int i, Object obj, int i2) {
        return i == i2;
    }

    public final boolean xW() {
        return true;
    }

    /* renamed from: A */
    public final int m1462A(int i, AnonymousClass1CF anonymousClass1CF) {
        AnonymousClass1Mt A = ((AnonymousClass1Mv) anonymousClass1CF).m11027A(i);
        if (A != null) {
            int i2 = A.f17743B;
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 == 1 || this.f2004B.nextInt(i2) == 0) {
                        return A.f17745D;
                    }
                }
            }
        }
        return 0;
    }

    /* renamed from: B */
    public static int m1461B(Object obj) {
        return ((AnonymousClass0KT) obj).getMarkerId();
    }

    public final int SH(Object obj, AnonymousClass1CF anonymousClass1CF) {
        return m1462A(AnonymousClass0Ec.m1461B(obj), anonymousClass1CF);
    }

    public final int SK(Object obj, AnonymousClass1CF anonymousClass1CF) {
        return ((AnonymousClass1Mv) anonymousClass1CF).m11027A(AnonymousClass0Ec.m1461B(obj)).f17744C;
    }
}

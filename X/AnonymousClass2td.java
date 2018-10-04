package X;

/* renamed from: X.2td */
public final class AnonymousClass2td {
    /* renamed from: B */
    public static void m17603B(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: C */
    public static void m17604C(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: D */
    public static Object m17605D(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }

    /* renamed from: E */
    public static void m17606E(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }
}

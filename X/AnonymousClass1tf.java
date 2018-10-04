package X;

/* renamed from: X.1tf */
public final class AnonymousClass1tf {
    /* renamed from: D */
    public static String f23812D = "legacy_zero";
    /* renamed from: B */
    public final AnonymousClass1tS f23813B;
    /* renamed from: C */
    public final AnonymousClass1ta[] f23814C;

    public AnonymousClass1tf(AnonymousClass1tS anonymousClass1tS, AnonymousClass1ta[] anonymousClass1taArr) {
        this.f23813B = anonymousClass1tS;
        this.f23814C = anonymousClass1taArr;
    }

    /* renamed from: A */
    public final long m13642A(String str, long j) {
        AnonymousClass1ta C = AnonymousClass1tf.m13641C(this, str);
        if (C == null) {
            return j;
        }
        try {
            return C.m13636B();
        } catch (AnonymousClass1tc e) {
            this.f23813B.ZKA(str, e.getMessage());
            return j;
        }
    }

    /* renamed from: B */
    public static AnonymousClass1tf m13640B(AnonymousClass1tS anonymousClass1tS, AnonymousClass1ta[] anonymousClass1taArr) {
        return new AnonymousClass1tf(anonymousClass1tS, anonymousClass1taArr);
    }

    /* renamed from: C */
    private static AnonymousClass1ta m13641C(AnonymousClass1tf anonymousClass1tf, String str) {
        if ((anonymousClass1tf.f23814C != null ? 1 : null) == null) {
            return null;
        }
        int EP = anonymousClass1tf.f23813B.EP(str);
        if (EP < 0 && str.equals(f23812D)) {
            EP = 0;
        }
        if (EP >= 0) {
            return anonymousClass1tf.f23814C[EP];
        }
        anonymousClass1tf.f23813B.ZKA(str, "Requested param not found");
        return null;
    }
}

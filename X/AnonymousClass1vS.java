package X;

/* renamed from: X.1vS */
public final class AnonymousClass1vS {
    /* renamed from: B */
    public static float m13770B(float f, float f2, float f3, float f4, float f5) {
        float f6 = f;
        for (int i = 0; i < 8; i++) {
            float f7 = (((((f3 * f6) + f4) * f6) + f5) * f6) - f;
            if (Math.abs(f7) < f2) {
                break;
            }
            float f8 = ((((f3 * 3.0f) * f6) + (2.0f * f4)) * f6) + f5;
            if (((double) Math.abs(f8)) < 1.0E-6d) {
                break;
            }
            f6 -= f7 / f8;
        }
        float f9 = 0.0f;
        f6 = 1.0f;
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return f6;
        }
        float f10 = f;
        while (f9 < f6) {
            float f11 = ((((f3 * f10) + f4) * f10) + f5) * f10;
            if (Math.abs(f11 - f) < f2) {
                break;
            }
            if (f > f11) {
                f9 = f10;
            } else {
                f6 = f10;
            }
            f10 = ((f6 - f9) * 0.5f) + f9;
        }
        return f10;
    }
}

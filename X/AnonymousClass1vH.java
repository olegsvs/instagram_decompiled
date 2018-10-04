package X;

/* renamed from: X.1vH */
public final class AnonymousClass1vH {
    /* renamed from: B */
    private static final AnonymousClass2RW f24190B = new AnonymousClass2RW();

    /* renamed from: B */
    public static AnonymousClass2RW m13741B(AnonymousClass2dS anonymousClass2dS, float f, float f2) {
        float[] fArr = anonymousClass2dS.f30426B;
        if (fArr == null) {
            return anonymousClass2dS.f31813B;
        }
        int B = AnonymousClass1vT.m13771B(fArr, 0, fArr.length, f);
        if (B >= 0) {
            return anonymousClass2dS.f31814C[B];
        }
        int i = -(B + 1);
        if (i == 0) {
            return anonymousClass2dS.f31814C[0];
        }
        if (i == fArr.length) {
            return anonymousClass2dS.f31814C[fArr.length - 1];
        }
        AnonymousClass2RW anonymousClass2RW = anonymousClass2dS.f31814C[i - 1];
        AnonymousClass2RW anonymousClass2RW2 = anonymousClass2dS.f31814C[i];
        anonymousClass2dS = AnonymousClass1vU.m13773B(anonymousClass2dS, i, f, f2);
        if (anonymousClass2dS == 1.0f) {
            return anonymousClass2RW2;
        }
        AnonymousClass2RW anonymousClass2RW3 = f24190B;
        B = anonymousClass2RW2.f30435E;
        int i2 = anonymousClass2RW.f30435E;
        anonymousClass2RW3.f30435E = (int) ((((float) (B - i2)) * anonymousClass2dS) + ((float) i2));
        B = anonymousClass2RW2.f30434D;
        i2 = anonymousClass2RW.f30434D;
        anonymousClass2RW3.f30434D = (int) ((((float) (B - i2)) * anonymousClass2dS) + ((float) i2));
        B = anonymousClass2RW2.f30433C;
        i2 = anonymousClass2RW.f30433C;
        anonymousClass2RW3.f30433C = (int) ((((float) (B - i2)) * anonymousClass2dS) + ((float) i2));
        B = anonymousClass2RW2.f30432B;
        i2 = anonymousClass2RW.f30432B;
        anonymousClass2RW3.f30432B = (int) ((((float) (B - i2)) * anonymousClass2dS) + ((float) i2));
        return anonymousClass2RW3;
    }
}

package X;

import com.facebook.C0164R;

/* renamed from: X.2bt */
public final class AnonymousClass2bt implements AnonymousClass2Jr {
    /* renamed from: B */
    private final float[] f31501B = new float[3];
    /* renamed from: C */
    private final float[] f31502C = new float[3];

    /* renamed from: B */
    private int m16440B(int i) {
        if (i == -16777216) {
            return -4969017;
        }
        AnonymousClass1lz.m12962G(i, this.f31501B);
        float[] fArr = this.f31502C;
        float[] fArr2 = this.f31501B;
        fArr[0] = fArr2[0];
        float f = 0.0f;
        if (fArr2[1] != 0.0f) {
            f = 1.0f;
        }
        fArr[1] = f;
        float[] fArr3 = this.f31502C;
        fArr3[2] = 0.8f;
        return AnonymousClass1lz.m12957B(fArr3);
    }

    /* renamed from: C */
    private int m16441C(int i) {
        if (i == -16777216) {
            return -16777216;
        }
        AnonymousClass1lz.m12962G(i, this.f31501B);
        float[] fArr = this.f31502C;
        float[] fArr2 = this.f31501B;
        fArr[0] = fArr2[0];
        fArr[1] = Math.min(1.0f, fArr2[1] * 1.1f);
        float[] fArr3 = this.f31502C;
        fArr3[2] = 0.95f;
        return AnonymousClass1lz.m12957B(fArr3);
    }

    public final AnonymousClass2Ju VF(int i) {
        return new AnonymousClass2Ju(m16441C(i), new AnonymousClass2KA(m16440B(i), C0164R.dimen.text_format_shadow_distance_neon, C0164R.dimen.text_format_shadow_radius_neon));
    }
}

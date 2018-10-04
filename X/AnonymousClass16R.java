package X;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* renamed from: X.16R */
public final class AnonymousClass16R implements Interpolator {
    /* renamed from: B */
    private final float[] f14536B;
    /* renamed from: C */
    private final float[] f14537C;

    public AnonymousClass16R(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        this(path);
    }

    public AnonymousClass16R(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.f14536B = new float[i];
        this.f14537C = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (i - 1)), fArr, null);
            this.f14536B[i2] = fArr[0];
            this.f14537C[i2] = fArr[1];
        }
    }

    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f14536B.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f14536B[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f14536B;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f14537C[i];
        }
        f = (f - fArr[i]) / f2;
        float[] fArr2 = this.f14537C;
        f2 = fArr2[i];
        return f2 + (f * (fArr2[length] - f2));
    }
}

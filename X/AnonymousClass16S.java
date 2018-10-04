package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.16S */
public final class AnonymousClass16S {
    /* renamed from: B */
    public int f14538B = -1;
    /* renamed from: C */
    public float f14539C;
    /* renamed from: D */
    public final int f14540D;
    /* renamed from: E */
    public float f14541E;

    public AnonymousClass16S(int i, float f, int i2) {
        this.f14540D = i;
        this.f14541E = f;
        this.f14538B = i2;
    }

    /* renamed from: A */
    public final void m9427A(Canvas canvas, Paint paint, Paint paint2, float f, float f2, RectF rectF, float f3) {
        float f4 = this.f14541E;
        if (f4 < 0.0f) {
            this.f14541E = f4 + f;
        }
        f4 = this.f14541E;
        if (f4 > 0.0f) {
            this.f14539C += f4;
            this.f14541E = 0.0f;
        } else if (f4 == 0.0f) {
            this.f14539C += f;
        }
        if (this.f14539C > 1.0f) {
            int i = this.f14538B;
            if (i > 0) {
                this.f14538B = i - 1;
            }
            if (this.f14538B != 0) {
                this.f14539C %= 1.0f;
            } else {
                this.f14539C = 1.0f;
            }
        }
        if (this.f14541E >= 0.0f) {
            float f5;
            float f6 = this.f14539C;
            if (f6 < 0.5f) {
                f5 = 1.0f - (f6 * 2.0f);
            } else {
                f5 = 1.0f - GradientSpinner.f10552W.getInterpolation(1.0f - ((f6 * 2.0f) - 1.0f));
            }
            float f7 = f3;
            AnonymousClass16S.m9426B(canvas, paint, paint2, f7, f2, f5, this.f14540D, 30, false, rectF);
        }
    }

    /* renamed from: B */
    public static void m9426B(Canvas canvas, Paint paint, Paint paint2, float f, float f2, float f3, int i, int i2, boolean z, RectF rectF) {
        float f4 = 360.0f / ((float) i2);
        float f5 = (1.0f - f3) * f4;
        if (!z) {
            f5 = Math.max(f5, 0.1f);
        }
        float f6 = f2 + ((((((float) i) * f4) + 270.0f) - (f4 / 2.0f)) - (f5 / 2.0f));
        Paint paint3 = paint;
        RectF rectF2 = rectF;
        if (z) {
            double width = (double) (rectF2.width() / 2.0f);
            Double.isNaN(width);
            float f7 = ((float) (width * 6.283185307179586d)) * (f5 / 360.0f);
            if (f7 < f) {
                paint.setStrokeWidth(f7);
            } else {
                paint.setStrokeWidth(f);
            }
        }
        canvas.drawArc(rectF2, f6, f5, false, paint3);
        if (paint2.getAlpha() > 0) {
            canvas.drawArc(rectF2, f6, f5, null, paint2);
        }
    }
}

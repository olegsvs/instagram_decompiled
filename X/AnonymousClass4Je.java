package X;

import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.4Je */
public final class AnonymousClass4Je {
    /* renamed from: B */
    private static final RectF f52708B = new RectF();
    /* renamed from: C */
    private static final RectF f52709C = new RectF();

    /* renamed from: B */
    public static void m23840B(Drawable drawable, AnonymousClass4Jd anonymousClass4Jd, AnonymousClass27l anonymousClass27l, int i, int i2) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        f52709C.set(0.0f, 0.0f, (float) intrinsicWidth, (float) intrinsicHeight);
        f52708B.set(0.0f, 0.0f, (float) i, (float) i2);
        anonymousClass4Jd.f52705C.reset();
        Matrix matrix = anonymousClass4Jd.f52705C;
        RectF rectF = f52709C;
        RectF rectF2 = f52708B;
        matrix.setRectToRect(rectF, rectF2, ScaleToFit.CENTER);
        float f = ((AnonymousClass27n) anonymousClass27l.f26360F.get(0)).f26388Y;
        anonymousClass4Jd.f52705C.postScale(f, f, rectF2.centerX(), rectF2.centerY());
        anonymousClass4Jd.f52707E.setImageMatrix(anonymousClass4Jd.f52705C);
    }
}

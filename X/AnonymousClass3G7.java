package X;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: X.3G7 */
public final class AnonymousClass3G7 {
    /* renamed from: B */
    public static final AnonymousClass0e5 f39619B = AnonymousClass0e5.C(40.0d, 7.0d);

    /* renamed from: B */
    public static boolean m19168B() {
        return ((String) AnonymousClass0CC.Mf.G()).equals("aspect_fill");
    }

    /* renamed from: C */
    public static boolean m19169C(boolean z, int i, int i2, int i3) {
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i3);
        RectF rectF = new RectF(0.0f, 0.0f, (float) i, (float) i2);
        matrix.mapRect(rectF);
        rectF.offsetTo(0.0f, 0.0f);
        return z && rectF.width() / rectF.height() > 0.75f && (((Boolean) AnonymousClass0E6.C(AnonymousClass0CC.kG)).booleanValue() || ((Boolean) AnonymousClass0CC.bf.G()).booleanValue());
    }
}

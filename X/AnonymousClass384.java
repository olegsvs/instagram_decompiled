package X;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

/* renamed from: X.384 */
public final class AnonymousClass384 {
    /* renamed from: A */
    public final Bitmap m18653A(Bitmap bitmap) {
        try {
            return bitmap.copy(bitmap.getConfig(), false);
        } catch (Bitmap bitmap2) {
            AnonymousClass0Dc.G("IgBitmapUtilImpl", "Exception when copying bitmap", bitmap2);
            return null;
        }
    }

    /* renamed from: B */
    public final Bitmap m18654B(int i, int i2) {
        try {
            return Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        } catch (int i22) {
            AnonymousClass0Dc.G("IgBitmapUtilImpl", "Exception when creating bitmap", i22);
            return null;
        }
    }
}

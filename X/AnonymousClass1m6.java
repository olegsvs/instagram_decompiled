package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;

/* renamed from: X.1m6 */
public final class AnonymousClass1m6 {
    /* renamed from: B */
    public static AnonymousClass1m5 m12977B(Resources resources, Bitmap bitmap) {
        if (VERSION.SDK_INT >= 21) {
            return new AnonymousClass2OS(resources, bitmap);
        }
        return new AnonymousClass2OT(resources, bitmap);
    }
}

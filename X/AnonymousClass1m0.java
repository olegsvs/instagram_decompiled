package X;

import android.graphics.Paint;
import android.os.Build.VERSION;

/* renamed from: X.1m0 */
public final class AnonymousClass1m0 {
    /* renamed from: B */
    public static boolean m12967B(Paint paint, String str) {
        if (VERSION.SDK_INT >= 23) {
            return paint.hasGlyph(str);
        }
        return AnonymousClass1m1.m12968B(paint, str);
    }
}

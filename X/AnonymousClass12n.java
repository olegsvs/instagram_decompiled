package X;

import android.os.Build.VERSION;
import android.widget.EdgeEffect;

/* renamed from: X.12n */
public final class AnonymousClass12n {
    /* renamed from: B */
    private static final AnonymousClass1nP f13615B;

    static {
        if (VERSION.SDK_INT >= 21) {
            f13615B = new AnonymousClass2Oh();
        } else {
            f13615B = new AnonymousClass1nP();
        }
    }

    /* renamed from: B */
    public static void m8995B(EdgeEffect edgeEffect, float f, float f2) {
        f13615B.A(edgeEffect, f, f2);
    }
}

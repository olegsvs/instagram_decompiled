package X;

import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: X.16Q */
public final class AnonymousClass16Q {
    /* renamed from: B */
    public static Interpolator m9425B(float f, float f2, float f3, float f4) {
        if (VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, f2, f3, f4);
        }
        return new AnonymousClass16R(f, f2, f3, f4);
    }
}

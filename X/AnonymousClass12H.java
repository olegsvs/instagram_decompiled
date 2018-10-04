package X;

import android.view.animation.Interpolator;

/* renamed from: X.12H */
public final class AnonymousClass12H implements Interpolator {
    public final float getInterpolation(float f) {
        f -= 1.0f;
        return ((((f * f) * f) * f) * f) + 1.0f;
    }
}

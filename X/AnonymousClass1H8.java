package X;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

/* renamed from: X.1H8 */
public final class AnonymousClass1H8 {
    /* renamed from: B */
    public static void m10614B(View view, int i, boolean z) {
        if (!(view == null || (z && view.getVisibility() == 0))) {
            if (z || view.getVisibility() == 0) {
                view.clearAnimation();
                Animation alphaAnimation = new AlphaAnimation(view.getAlpha(), z ? 1.0f : 0.0f);
                alphaAnimation.setDuration((long) i);
                alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                alphaAnimation.setAnimationListener(new AnonymousClass1eM(view, z));
                view.startAnimation(alphaAnimation);
            }
        }
    }
}

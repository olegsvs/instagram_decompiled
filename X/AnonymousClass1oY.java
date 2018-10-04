package X;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: X.1oY */
public final class AnonymousClass1oY implements AnimatorUpdateListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1oZ f22944B;

    public AnonymousClass1oY(AnonymousClass1oZ anonymousClass1oZ) {
        this.f22944B = anonymousClass1oZ;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f22944B.f22948E = valueAnimator.getAnimatedFraction();
    }
}

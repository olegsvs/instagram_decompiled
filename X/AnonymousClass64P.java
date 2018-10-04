package X;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: X.64P */
public final class AnonymousClass64P implements AnimatorUpdateListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass64T f71444B;

    public AnonymousClass64P(AnonymousClass64T anonymousClass64T) {
        this.f71444B = anonymousClass64T;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass64T anonymousClass64T = this.f71444B;
        anonymousClass64T.f71469C = valueAnimator.getAnimatedFraction();
        anonymousClass64T.invalidateSelf();
    }
}

package X;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: X.38u */
public final class AnonymousClass38u implements AnimatorUpdateListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3yA f38299B;

    public AnonymousClass38u(AnonymousClass3yA anonymousClass3yA) {
        this.f38299B = anonymousClass3yA;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f38299B.f47560J.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}

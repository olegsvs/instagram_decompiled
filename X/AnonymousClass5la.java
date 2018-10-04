package X;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: X.5la */
public final class AnonymousClass5la implements AnimatorUpdateListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0ti f68807B;

    public AnonymousClass5la(AnonymousClass0ti anonymousClass0ti) {
        this.f68807B = anonymousClass0ti;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f68807B.f11707G.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f68807B.f11705E.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}

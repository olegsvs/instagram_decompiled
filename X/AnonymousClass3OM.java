package X;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: X.3OM */
public final class AnonymousClass3OM implements AnimatorUpdateListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0qs f40733B;

    public AnonymousClass3OM(AnonymousClass0qs anonymousClass0qs) {
        this.f40733B = anonymousClass0qs;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f40733B.f11033E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}

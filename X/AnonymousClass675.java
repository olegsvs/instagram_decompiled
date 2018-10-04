package X;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: X.675 */
public final class AnonymousClass675 implements AnimatorUpdateListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass67B f71905B;
    /* renamed from: C */
    public final /* synthetic */ boolean f71906C;
    /* renamed from: D */
    public final /* synthetic */ int f71907D;

    public AnonymousClass675(AnonymousClass67B anonymousClass67B, boolean z, int i) {
        this.f71905B = anonymousClass67B;
        this.f71906C = z;
        this.f71907D = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = (this.f71906C && intValue == this.f71907D) ? 1 : 0;
        AnonymousClass67B.m29067F(this.f71905B, intValue, i);
    }
}

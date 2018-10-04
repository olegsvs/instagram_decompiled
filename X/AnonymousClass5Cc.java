package X;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.widget.FrameLayout.LayoutParams;

/* renamed from: X.5Cc */
public final class AnonymousClass5Cc implements AnimatorUpdateListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Ce f61117B;
    /* renamed from: C */
    public final /* synthetic */ int f61118C;
    /* renamed from: D */
    public final /* synthetic */ int f61119D;
    /* renamed from: E */
    public final /* synthetic */ LayoutParams f61120E;

    public AnonymousClass5Cc(AnonymousClass5Ce anonymousClass5Ce, int i, LayoutParams layoutParams, int i2) {
        this.f61117B = anonymousClass5Ce;
        this.f61119D = i;
        this.f61120E = layoutParams;
        this.f61118C = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f61117B.f61126C.setTranslationY((float) (this.f61119D + intValue));
        this.f61120E.height = this.f61118C - intValue;
        this.f61117B.f61126C.requestLayout();
    }
}

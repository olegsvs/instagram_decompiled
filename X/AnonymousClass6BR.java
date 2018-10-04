package X;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* renamed from: X.6BR */
public final class AnonymousClass6BR implements AnimatorUpdateListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6BV f72737B;
    /* renamed from: C */
    public final /* synthetic */ View f72738C;
    /* renamed from: D */
    public final /* synthetic */ View f72739D;
    /* renamed from: E */
    public final /* synthetic */ View f72740E;

    public AnonymousClass6BR(AnonymousClass6BV anonymousClass6BV, View view, View view2, View view3) {
        this.f72737B = anonymousClass6BV;
        this.f72739D = view;
        this.f72740E = view2;
        this.f72738C = view3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = ((float) this.f72737B.f72762K) * floatValue;
        this.f72739D.setAlpha(1.0f - floatValue);
        float f2 = -f;
        this.f72740E.setTranslationY(f2);
        this.f72738C.setTranslationY(f2);
    }
}

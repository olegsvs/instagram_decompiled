package X;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: X.5M7 */
public final class AnonymousClass5M7 implements AnimationListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5M8 f62505B;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public AnonymousClass5M7(AnonymousClass5M8 anonymousClass5M8) {
        this.f62505B = anonymousClass5M8;
    }

    public final void onAnimationEnd(Animation animation) {
        animation = this.f62505B.f62507C.f66634D.A();
        AnonymousClass14J anonymousClass5M6 = new AnonymousClass5M6(this);
        AnonymousClass14H D = AnonymousClass14H.C(animation).J().L(AnonymousClass5PI.f63089B).C(1.0f, 0.5f, (float) (animation.getWidth() / 2)).D(1.0f, 0.5f, (float) (animation.getHeight() / 2));
        AnonymousClass14H G = D.H(D.f13861a.getTranslationX(), animation.getTranslationX() + ((float) (animation.getWidth() / 4))).G(animation.getTranslationY() + ((float) (animation.getHeight() / 4)));
        G.f13848N = anonymousClass5M6;
        G.N();
    }
}

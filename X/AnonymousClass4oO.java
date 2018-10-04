package X;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;

/* renamed from: X.4oO */
public final class AnonymousClass4oO {
    /* renamed from: B */
    public AnonymousClass4oQ f57544B;
    /* renamed from: C */
    private final int f57545C;

    public AnonymousClass4oO(boolean z) {
        this.f57545C = z ? -90 : 90;
    }

    /* renamed from: B */
    public static void m25125B(AnonymousClass4oO anonymousClass4oO, boolean z) {
        AnonymousClass4oQ anonymousClass4oQ = anonymousClass4oO.f57544B;
        if (anonymousClass4oQ != null) {
            anonymousClass4oQ.f57548B.clearAnimation();
            Animation rotateAnimation = new RotateAnimation(z ? 0.0f : (float) anonymousClass4oO.f57545C, z ? (float) anonymousClass4oO.f57545C : 0.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(200);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            rotateAnimation.setFillAfter(true);
            rotateAnimation.setAnimationListener(new AnonymousClass4oN(anonymousClass4oO, z));
            anonymousClass4oO.f57544B.f57548B.startAnimation(rotateAnimation);
        }
    }
}

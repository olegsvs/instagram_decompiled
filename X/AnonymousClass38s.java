package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.38s */
public final class AnonymousClass38s extends AnimatorListenerAdapter {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass38t f38294B;

    public AnonymousClass38s(AnonymousClass38t anonymousClass38t) {
        this.f38294B = anonymousClass38t;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f38294B.f38295B) {
            animator.start();
        }
    }
}

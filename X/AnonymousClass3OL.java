package X;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

/* renamed from: X.3OL */
public final class AnonymousClass3OL implements AnimatorListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0qs f40732B;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public AnonymousClass3OL(AnonymousClass0qs anonymousClass0qs) {
        this.f40732B = anonymousClass0qs;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f40732B.f11035G = AnonymousClass0wN.POST_TRANSITION;
    }

    public final void onAnimationStart(Animator animator) {
        this.f40732B.f11035G = AnonymousClass0wN.IN_TRANSITION;
    }
}

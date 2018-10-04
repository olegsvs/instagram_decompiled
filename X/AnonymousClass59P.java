package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.59P */
public final class AnonymousClass59P extends AnimatorListenerAdapter {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass59T f60596B;

    public AnonymousClass59P(AnonymousClass59T anonymousClass59T) {
        this.f60596B = anonymousClass59T;
    }

    public final void onAnimationCancel(Animator animator) {
        onAnimationEnd(animator);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f60596B.f60615M.setVisibility(8);
        this.f60596B.f60615M.setAlpha(1.0f);
        this.f60596B.f60609G = false;
    }
}

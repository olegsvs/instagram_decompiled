package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.62p */
public final class AnonymousClass62p extends AnimatorListenerAdapter {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass62s f71246B;

    public AnonymousClass62p(AnonymousClass62s anonymousClass62s) {
        this.f71246B = anonymousClass62s;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f71246B.f71254G) {
            this.f71246B.f71249B.setVisibility(8);
        }
    }

    public final void onAnimationStart(Animator animator) {
        if (this.f71246B.f71254G) {
            this.f71246B.f71249B.setVisibility(0);
        }
    }
}

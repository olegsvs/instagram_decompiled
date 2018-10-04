package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.5jP */
public final class AnonymousClass5jP extends AnimatorListenerAdapter {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5jQ f68552B;

    public AnonymousClass5jP(AnonymousClass5jQ anonymousClass5jQ) {
        this.f68552B = anonymousClass5jQ;
    }

    public final void onAnimationStart(Animator animator) {
        this.f68552B.f68561J.setVisibility(4);
        this.f68552B.f68555D.setVisibility(0);
    }
}

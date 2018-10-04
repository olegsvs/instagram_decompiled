package X;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.instagram.feed.ui.views.CabooseLayout;

/* renamed from: X.12G */
public final class AnonymousClass12G implements AnimatorListener {
    /* renamed from: B */
    public final /* synthetic */ CabooseLayout f13506B;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public AnonymousClass12G(CabooseLayout cabooseLayout) {
        this.f13506B = cabooseLayout;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f13506B.f13497G = AnonymousClass12E.SHOWN;
    }

    public final void onAnimationStart(Animator animator) {
        this.f13506B.setVisibility(0);
        this.f13506B.f13497G = AnonymousClass12E.SHOWING;
    }
}

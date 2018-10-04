package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.1lU */
public final class AnonymousClass1lU extends AnimatorListenerAdapter {
    /* renamed from: B */
    public View f22488B;

    public AnonymousClass1lU(View view) {
        this.f22488B = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f22488B.setLayerType(0, null);
        animator.removeListener(this);
    }

    public final void onAnimationStart(Animator animator) {
        this.f22488B.setLayerType(2, null);
    }
}

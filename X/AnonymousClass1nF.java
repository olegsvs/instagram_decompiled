package X;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

/* renamed from: X.1nF */
public final class AnonymousClass1nF implements AnimatorListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1nH f22663B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass1nG f22664C;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public AnonymousClass1nF(AnonymousClass1nH anonymousClass1nH, AnonymousClass1nG anonymousClass1nG) {
        this.f22663B = anonymousClass1nH;
        this.f22664C = anonymousClass1nG;
    }

    public final void onAnimationRepeat(Animator animator) {
        AnonymousClass1nH.m13102B(this.f22663B, 1.0f, this.f22664C, true);
        AnonymousClass1nG anonymousClass1nG = this.f22664C;
        anonymousClass1nG.f22683T = anonymousClass1nG.f22680Q;
        anonymousClass1nG.f22681R = anonymousClass1nG.f22675L;
        anonymousClass1nG.f22682S = anonymousClass1nG.f22678O;
        AnonymousClass1nG anonymousClass1nG2 = this.f22664C;
        anonymousClass1nG2.m13101B((anonymousClass1nG2.f22672I + 1) % anonymousClass1nG2.f22673J.length);
        if (this.f22663B.f22690C) {
            this.f22663B.f22690C = false;
            animator.cancel();
            animator.setDuration(1332);
            animator.start();
            anonymousClass1nG2 = this.f22664C;
            if (anonymousClass1nG2.f22679P) {
                anonymousClass1nG2.f22679P = false;
            }
            return;
        }
        AnonymousClass1nH anonymousClass1nH = this.f22663B;
        anonymousClass1nH.f22693F += 1.0f;
    }

    public final void onAnimationStart(Animator animator) {
        this.f22663B.f22693F = 0.0f;
    }
}

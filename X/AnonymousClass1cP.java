package X;

import android.animation.Animator;

/* renamed from: X.1cP */
public final class AnonymousClass1cP extends AnonymousClass0vP {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0vN f20626B;

    public AnonymousClass1cP(AnonymousClass0vN anonymousClass0vN) {
        this.f20626B = anonymousClass0vN;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f20626B.f12064H != null && this.f20626B.f12064H.get() != null) {
            ((AnonymousClass0vJ) this.f20626B.f12064H.get()).Tl();
        }
    }

    public final void onAnimationStart(Animator animator) {
        if (this.f20626B.f12064H != null && this.f20626B.f12064H.get() != null) {
            ((AnonymousClass0vJ) this.f20626B.f12064H.get()).Ul();
        }
    }
}

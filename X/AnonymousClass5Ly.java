package X;

import android.view.animation.DecelerateInterpolator;

/* renamed from: X.5Ly */
public final class AnonymousClass5Ly implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5M2 f62489B;

    public AnonymousClass5Ly(AnonymousClass5M2 anonymousClass5M2) {
        this.f62489B = anonymousClass5M2;
    }

    public final void run() {
        AnonymousClass5M2 anonymousClass5M2 = this.f62489B;
        anonymousClass5M2.f62495D.setVisibility(0);
        anonymousClass5M2.f62493B.setScaleX(0.0f);
        anonymousClass5M2.f62493B.setScaleY(0.0f);
        anonymousClass5M2.f62494C.setScaleX(1.0f);
        anonymousClass5M2.f62494C.setScaleY(1.0f);
        anonymousClass5M2.f62496E.setTranslationX((float) (-anonymousClass5M2.f62496E.getWidth()));
        anonymousClass5M2.f62493B.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new DecelerateInterpolator()).setDuration(300).withEndAction(new AnonymousClass5M1(anonymousClass5M2));
        anonymousClass5M2.f62496E.animate().translationX(0.0f).setInterpolator(new DecelerateInterpolator()).setDuration(300);
    }
}

package X;

import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: X.5Lz */
public final class AnonymousClass5Lz implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5M2 f62490B;

    public AnonymousClass5Lz(AnonymousClass5M2 anonymousClass5M2) {
        this.f62490B = anonymousClass5M2;
    }

    public final void run() {
        AnonymousClass5M2 anonymousClass5M2 = this.f62490B;
        anonymousClass5M2.f62494C.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(1000).withEndAction(new AnonymousClass5M0(anonymousClass5M2));
    }
}

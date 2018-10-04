package X;

import android.animation.ObjectAnimator;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* renamed from: X.59O */
public final class AnonymousClass59O implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass59T f60595B;

    public AnonymousClass59O(AnonymousClass59T anonymousClass59T) {
        this.f60595B = anonymousClass59T;
    }

    public final void run() {
        if (this.f60595B.f60610H) {
            this.f60595B.f60615M.animate().cancel();
            this.f60595B.f60615M.setVisibility(0);
            if (this.f60595B.f60614L == null) {
                AnonymousClass59T anonymousClass59T = this.f60595B;
                anonymousClass59T.f60614L = ObjectAnimator.ofInt(anonymousClass59T.f60615M, ReactProgressBarViewManager.PROP_PROGRESS, new int[]{0, this.f60595B.f60615M.getMax()});
            }
            this.f60595B.f60614L.setDuration(1500);
            this.f60595B.f60614L.start();
        }
    }
}

package X;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.instagram.creation.video.widget.scrubber.IgScrubberProgressIndicator;

/* renamed from: X.3Ik */
public final class AnonymousClass3Ik implements AnimatorListener {
    /* renamed from: B */
    public final /* synthetic */ IgScrubberProgressIndicator f39967B;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public AnonymousClass3Ik(IgScrubberProgressIndicator igScrubberProgressIndicator) {
        this.f39967B = igScrubberProgressIndicator;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f39967B.f39970D) {
            IgScrubberProgressIndicator igScrubberProgressIndicator = this.f39967B;
            igScrubberProgressIndicator.post(igScrubberProgressIndicator.f39969C);
        }
    }
}

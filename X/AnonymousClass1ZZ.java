package X;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;

/* renamed from: X.1ZZ */
public final class AnonymousClass1ZZ implements AnimatorListener {
    /* renamed from: B */
    public final /* synthetic */ SegmentedProgressBar f20238B;
    /* renamed from: C */
    public final /* synthetic */ int f20239C;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public AnonymousClass1ZZ(SegmentedProgressBar segmentedProgressBar, int i) {
        this.f20238B = segmentedProgressBar;
        this.f20239C = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f20238B.f14138T.remove(this.f20239C);
    }
}

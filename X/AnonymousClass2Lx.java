package X;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;

/* renamed from: X.2Lx */
public final class AnonymousClass2Lx implements AnimatorUpdateListener {
    /* renamed from: B */
    public final /* synthetic */ SegmentedProgressBar f29472B;

    public AnonymousClass2Lx(SegmentedProgressBar segmentedProgressBar) {
        this.f29472B = segmentedProgressBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f29472B.invalidate();
    }
}

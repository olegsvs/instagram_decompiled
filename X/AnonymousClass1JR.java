package X;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.instagram.ui.widget.imageview.PulsingMultiImageView;

/* renamed from: X.1JR */
public final class AnonymousClass1JR implements AnimatorUpdateListener {
    /* renamed from: B */
    public final /* synthetic */ PulsingMultiImageView f17072B;

    public AnonymousClass1JR(PulsingMultiImageView pulsingMultiImageView) {
        this.f17072B = pulsingMultiImageView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f17072B.invalidate();
    }
}

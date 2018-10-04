package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.instagram.common.ui.widget.imageview.FadingCarouselImageView;

/* renamed from: X.26C */
public final class AnonymousClass26C extends AnimatorListenerAdapter {
    /* renamed from: B */
    public final /* synthetic */ FadingCarouselImageView f25950B;

    public AnonymousClass26C(FadingCarouselImageView fadingCarouselImageView) {
        this.f25950B = fadingCarouselImageView;
    }

    public final void onAnimationEnd(Animator animator) {
        FadingCarouselImageView fadingCarouselImageView = this.f25950B;
        fadingCarouselImageView.f25951B = fadingCarouselImageView.f25955F;
        this.f25950B.f25952C.set(this.f25950B.f25956G);
        if (this.f25950B.f25951B != null) {
            this.f25950B.invalidate();
        }
        FadingCarouselImageView.m14423C(this.f25950B);
    }
}

package X;

import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.widget.ImageView;

/* renamed from: X.4jV */
public final class AnonymousClass4jV extends AnonymousClass0xQ {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4jX f56632B;
    /* renamed from: C */
    public final /* synthetic */ ImageView f56633C;
    /* renamed from: D */
    public final /* synthetic */ OnClickListener f56634D;

    public AnonymousClass4jV(AnonymousClass4jX anonymousClass4jX, ImageView imageView, OnClickListener onClickListener) {
        this.f56632B = anonymousClass4jX;
        this.f56633C = imageView;
        this.f56634D = onClickListener;
    }

    public final void onAnimationStart(Animation animation) {
        this.f56633C.setVisibility(8);
        this.f56632B.f56639E.A().setVisibility(0);
        this.f56632B.f56639E.A().setOnClickListener(this.f56634D);
    }
}

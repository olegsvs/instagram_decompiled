package X;

import android.view.animation.Animation;
import android.widget.ImageView;

/* renamed from: X.4jT */
public final class AnonymousClass4jT extends AnonymousClass0xQ {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4jX f56629B;
    /* renamed from: C */
    public final /* synthetic */ ImageView f56630C;

    public AnonymousClass4jT(AnonymousClass4jX anonymousClass4jX, ImageView imageView) {
        this.f56629B = anonymousClass4jX;
        this.f56630C = imageView;
    }

    public final void onAnimationStart(Animation animation) {
        int width = this.f56630C.getWidth();
        AnonymousClass4jX anonymousClass4jX = this.f56629B;
        AnonymousClass4jX.m24908B(anonymousClass4jX, (-width) - anonymousClass4jX.f56646L);
        this.f56630C.setVisibility(0);
    }
}

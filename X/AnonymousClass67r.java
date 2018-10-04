package X;

import android.view.View;
import android.view.animation.Animation;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.67r */
public final class AnonymousClass67r implements AnonymousClass14J {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6GI f72023B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass14H f72024C;
    /* renamed from: D */
    public final /* synthetic */ View f72025D;
    /* renamed from: E */
    public final /* synthetic */ CircularImageView f72026E;

    public AnonymousClass67r(AnonymousClass6GI anonymousClass6GI, CircularImageView circularImageView, View view, AnonymousClass14H anonymousClass14H) {
        this.f72023B = anonymousClass6GI;
        this.f72026E = circularImageView;
        this.f72025D = view;
        this.f72024C = anonymousClass14H;
    }

    public final void onFinish() {
        AnonymousClass6GI anonymousClass6GI = this.f72023B;
        View view = this.f72026E;
        View view2 = this.f72025D;
        Animation animation = anonymousClass6GI.f73690W;
        if (animation != null) {
            animation.cancel();
        }
        anonymousClass6GI.f73690W = AnonymousClass5PI.m26431C();
        anonymousClass6GI.f73690W.setAnimationListener(new AnonymousClass67t(anonymousClass6GI, view2));
        view.startAnimation(anonymousClass6GI.f73690W);
        this.f72023B.f73691X.remove(this.f72024C);
    }
}

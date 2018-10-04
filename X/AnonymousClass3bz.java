package X;

import android.graphics.RectF;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.3bz */
public final class AnonymousClass3bz {
    /* renamed from: B */
    public GradientSpinnerAvatarView f42694B;
    /* renamed from: C */
    public AnonymousClass10I f42695C;

    public AnonymousClass3bz(AnonymousClass10I anonymousClass10I) {
        this.f42695C = anonymousClass10I;
    }

    public AnonymousClass3bz(GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        this.f42694B = gradientSpinnerAvatarView;
    }

    /* renamed from: A */
    public final RectF m20175A() {
        GradientSpinnerAvatarView gradientSpinnerAvatarView = this.f42694B;
        if (gradientSpinnerAvatarView != null) {
            return gradientSpinnerAvatarView.getAvatarBounds();
        }
        return this.f42695C.iI();
    }

    /* renamed from: B */
    public final void m20176B() {
        GradientSpinnerAvatarView gradientSpinnerAvatarView = this.f42694B;
        if (gradientSpinnerAvatarView != null) {
            gradientSpinnerAvatarView.f12679B.setVisibility(0);
            if (gradientSpinnerAvatarView.f12687J) {
                gradientSpinnerAvatarView.f12682E.setVisibility(0);
            }
            return;
        }
        this.f42695C.xTA();
    }
}

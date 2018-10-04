package X;

import android.view.View;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.instagram.arlink.fragment.NametagController;
import com.instagram.arlink.ui.NametagCardHintView;

/* renamed from: X.4AY */
public final class AnonymousClass4AY extends AnonymousClass14I {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Ru f51110B;

    public AnonymousClass4AY(AnonymousClass5Ru anonymousClass5Ru) {
        this.f51110B = anonymousClass5Ru;
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        float B = (float) AnonymousClass0dh.B(anonymousClass0cN.E(), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d);
        float f = 1.0f - B;
        this.f51110B.f63584L.setAlpha(f);
        int i = 0;
        this.f51110B.f63584L.setVisibility(f > 0.0f ? 0 : 8);
        if (this.f51110B.f63590R) {
            this.f51110B.f63577E.setAlpha(f);
            NametagCardHintView nametagCardHintView = this.f51110B.f63577E;
            if (f <= 0.0f) {
                i = 8;
            }
            nametagCardHintView.setVisibility(i);
        }
        if (anonymousClass0cN.G()) {
            if (anonymousClass0cN.f7106D == StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
                NametagController nametagController = this.f51110B.f63580H;
                nametagController.f63537J = true;
                nametagController.f63533F.f51040B = true;
                nametagController.mBottomButton.setEnabled(true);
                nametagController.f63538K = true;
            } else {
                NametagController nametagController2 = this.f51110B.f63580H;
                nametagController2.f63537J = false;
                nametagController2.f63533F.f51040B = false;
                nametagController2.mBottomButton.setEnabled(true);
            }
        }
        NametagController nametagController3 = this.f51110B.f63580H;
        if (nametagController3.f63538K) {
            nametagController3.mCardView.setAlpha(B);
            i = 0;
            nametagController3.mCardView.setVisibility(B > 0.0f ? 0 : 8);
            float f2 = 1.0f - B;
            nametagController3.mGradientOverlay.setAlpha(f2);
            View view = nametagController3.mGradientOverlay;
            if (f2 <= 0.0f) {
                i = 8;
            }
            view.setVisibility(i);
            nametagController3.f63530C.A(B);
        }
    }
}

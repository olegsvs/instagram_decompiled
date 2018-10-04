package X;

import android.view.animation.Animation;
import com.instagram.ui.mediaactions.MediaActionsView;

/* renamed from: X.1WP */
public final class AnonymousClass1WP extends AnonymousClass0xQ {
    /* renamed from: B */
    public final /* synthetic */ MediaActionsView f19505B;
    /* renamed from: C */
    public final /* synthetic */ boolean f19506C;

    public AnonymousClass1WP(MediaActionsView mediaActionsView, boolean z) {
        this.f19505B = mediaActionsView;
        this.f19506C = z;
    }

    public final void onAnimationEnd(Animation animation) {
        if (!this.f19506C) {
            this.f19505B.f12023F.setVisibility(8);
        }
        this.f19505B.f12024G = false;
    }
}

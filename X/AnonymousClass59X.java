package X;

import android.view.View;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.instagram.reels.feedback.FeedbackTrayView;
import com.instagram.reels.fragment.ReelViewerFragment;

/* renamed from: X.59X */
public final class AnonymousClass59X {
    /* renamed from: B */
    public AnonymousClass59F f60626B;
    /* renamed from: C */
    public final ReelViewerFragment f60627C;
    /* renamed from: D */
    public FeedbackTrayView f60628D;
    /* renamed from: E */
    public AnonymousClass0P7 f60629E;
    /* renamed from: F */
    public View f60630F;
    /* renamed from: G */
    public final AnonymousClass0Cm f60631G;

    public AnonymousClass59X(View view, ReelViewerFragment reelViewerFragment, AnonymousClass59F anonymousClass59F, AnonymousClass0Cm anonymousClass0Cm) {
        this.f60630F = view;
        this.f60626B = anonymousClass59F;
        this.f60627C = reelViewerFragment;
        this.f60631G = anonymousClass0Cm;
    }

    /* renamed from: A */
    public final void m25868A(boolean z) {
        FeedbackTrayView feedbackTrayView = this.f60628D;
        if (feedbackTrayView != null) {
            feedbackTrayView.f60797E.N(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
            feedbackTrayView.f60798F.N(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        }
        ReelViewerFragment reelViewerFragment = this.f60627C;
        if (!z) {
            AnonymousClass14s F = reelViewerFragment.f4306C.m25976F(reelViewerFragment.c());
            F.f14077E = false;
            ReelViewerFragment.d(reelViewerFragment, F);
            ReelViewerFragment.b(reelViewerFragment);
        }
    }
}

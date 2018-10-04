package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.reels.fragment.ReelDashboardFragment;

/* renamed from: X.5tr */
public final class AnonymousClass5tr implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5tv f69771B;
    /* renamed from: C */
    public final /* synthetic */ int f69772C;

    public AnonymousClass5tr(AnonymousClass5tv anonymousClass5tv, int i) {
        this.f69771B = anonymousClass5tv;
        this.f69772C = i;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -387214308);
        ReelDashboardFragment reelDashboardFragment = this.f69771B.f69777B;
        int i = this.f69772C;
        if (reelDashboardFragment.mImageViewPager.getCurrentWrappedDataIndex() != i) {
            reelDashboardFragment.mImageViewPager.F(i, 0.0f);
        } else {
            ReelDashboardFragment.m29911J(reelDashboardFragment);
        }
        AnonymousClass0cQ.L(this, -882288901, M);
    }
}

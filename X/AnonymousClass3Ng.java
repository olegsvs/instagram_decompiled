package X;

import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.reels.fragment.ReelViewerFragment;

/* renamed from: X.3Ng */
public final class AnonymousClass3Ng implements AnonymousClass0wo {
    /* renamed from: B */
    private final AnonymousClass0IL f40667B;
    /* renamed from: C */
    private final double f40668C;
    /* renamed from: D */
    private final ReelViewerFragment f40669D;

    public AnonymousClass3Ng(AnonymousClass0IL anonymousClass0IL, ReelViewerFragment reelViewerFragment, double d) {
        this.f40667B = anonymousClass0IL;
        this.f40669D = reelViewerFragment;
        this.f40668C = d;
    }

    public final void vWA(AnonymousClass0we anonymousClass0we, AnonymousClass0wM anonymousClass0wM) {
        if (this.f40667B.isResumed()) {
            ReboundViewPager reboundViewPager = this.f40669D.mViewPager;
            if (reboundViewPager != null && reboundViewPager.getAdapter() != null) {
                if (reboundViewPager.getAdapter().getCount() != 0) {
                    float currentOffset = reboundViewPager.getCurrentOffset();
                    int firstVisiblePosition = reboundViewPager.getFirstVisiblePosition();
                    int lastVisiblePosition = reboundViewPager.getLastVisiblePosition();
                    double d = (double) (currentOffset - ((float) firstVisiblePosition));
                    double d2 = this.f40668C;
                    if (d < d2) {
                        lastVisiblePosition = firstVisiblePosition;
                    } else if (((double) (((float) lastVisiblePosition) - currentOffset)) < d2) {
                        firstVisiblePosition = lastVisiblePosition;
                    }
                    while (firstVisiblePosition <= lastVisiblePosition) {
                        anonymousClass0we.B(anonymousClass0wM, firstVisiblePosition);
                        firstVisiblePosition++;
                    }
                }
            }
        }
    }
}

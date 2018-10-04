package com.instagram.mainfeed.tooltip;

import X.AnonymousClass0Cm;
import X.AnonymousClass0Co;
import X.AnonymousClass0P7;
import X.AnonymousClass0VA;
import X.AnonymousClass0cQ;
import X.AnonymousClass0hk;
import X.AnonymousClass0jU;
import X.AnonymousClass0lW;
import X.AnonymousClass0m1;
import X.AnonymousClass0m2;
import X.AnonymousClass0p6;
import X.AnonymousClass0pl;
import android.app.Activity;
import android.content.Context;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.facebook.C0164R;
import com.instagram.ui.listview.StickyHeaderListView;

public class FavoritesFeedTooltipHelper extends AnonymousClass0VA implements OnScrollListener, AnonymousClass0hk {
    /* renamed from: B */
    private AnonymousClass0jU f9416B;
    /* renamed from: C */
    private AnonymousClass0Cm f9417C;
    public Context mContext;
    public ListView mListView;
    public StickyHeaderListView mStickyHeaderListView;

    public final boolean VTA() {
        return false;
    }

    public FavoritesFeedTooltipHelper(Activity activity, ListView listView, AnonymousClass0Cm anonymousClass0Cm, StickyHeaderListView stickyHeaderListView) {
        this.mContext = activity;
        this.mListView = listView;
        this.f9417C = anonymousClass0Cm;
        this.mStickyHeaderListView = stickyHeaderListView;
        this.f9416B = new AnonymousClass0jU(activity, this);
    }

    public final void gi() {
        FavoritesFeedTooltipHelperLifecycleUtil.cleanupReferences(this);
    }

    public final boolean jTA() {
        return AnonymousClass0lW.m7297C(this.f9417C);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AnonymousClass0cQ.m5858H(this, 1322282310, AnonymousClass0cQ.m5859I(this, 206119242));
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.m5859I(this, -598571125);
        if (i == 0) {
            if (jTA()) {
                int lastVisiblePosition = this.mListView.getLastVisiblePosition();
                for (int firstVisiblePosition = this.mListView.getFirstVisiblePosition(); firstVisiblePosition <= lastVisiblePosition; firstVisiblePosition++) {
                    if ((AnonymousClass0m2.m7431K(this.mListView, firstVisiblePosition) == AnonymousClass0p6.MEDIA_HEADER ? 1 : null) != null) {
                        ListView listView = this.mListView;
                        AnonymousClass0pl anonymousClass0pl = (AnonymousClass0pl) listView.getChildAt(firstVisiblePosition - listView.getFirstVisiblePosition()).getTag();
                        AnonymousClass0P7 anonymousClass0P7 = anonymousClass0pl.f10726Q;
                        if (!(anonymousClass0P7 == null || !anonymousClass0P7.wA() || AnonymousClass0Co.m1046F(this.f9417C, anonymousClass0P7))) {
                            AnonymousClass0m2.m7438R(anonymousClass0pl.m7879C(), this.mListView, this.mStickyHeaderListView, AnonymousClass0m1.FAVORITES, this.f9416B, this.mContext.getResources().getString(C0164R.string.tooltip_shared_with_close_friends, new Object[]{anonymousClass0P7.MA().uT()}), 500);
                            break;
                        }
                    }
                }
                AnonymousClass0cQ.m5858H(this, -854314285, I);
                return;
            }
        }
        AnonymousClass0cQ.m5858H(this, 1118225751, I);
    }

    public final void rDA() {
        AnonymousClass0lW.m7296B(this.f9417C);
    }
}

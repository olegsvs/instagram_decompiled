package com.instagram.ui.widget.singlescrolllistview;

import X.AnonymousClass0Gn;
import X.AnonymousClass0TK;
import X.AnonymousClass0cQ;
import X.AnonymousClass3k8;
import X.AnonymousClass6Bp;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.facebook.C0164R;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.HashMap;
import java.util.Map;

public class SingleScrollTopLockingListView extends RefreshableListView implements AnonymousClass0TK, OnScrollListener {
    /* renamed from: H */
    private static final String f12074H = "SingleScrollTopLockingListView";
    /* renamed from: B */
    public final float f12075B;
    /* renamed from: C */
    public AnonymousClass6Bp f12076C;
    /* renamed from: D */
    public int f12077D;
    /* renamed from: E */
    private GestureDetector f12078E;
    /* renamed from: F */
    private Map f12079F;
    /* renamed from: G */
    private boolean f12080G;

    public final void PGA(View view, Bundle bundle) {
    }

    public final void Ry(Bundle bundle) {
    }

    public final void St() {
    }

    public final void cBA() {
    }

    public final void gx() {
    }

    public final void oh() {
    }

    public final void onStart() {
    }

    public final void wh(View view) {
    }

    public final void xc(int i, int i2, Intent intent) {
    }

    public SingleScrollTopLockingListView(Context context) {
        this(context, null);
    }

    public SingleScrollTopLockingListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SingleScrollTopLockingListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12079F = new HashMap();
        Resources resources = getResources();
        this.f12075B = TypedValue.applyDimension(1, (float) resources.getDimensionPixelSize(C0164R.dimen.fling_velocity_threshold_dp), resources.getDisplayMetrics());
        this.f12078E = new GestureDetector(context, new AnonymousClass3k8(this));
    }

    /* renamed from: D */
    private static String m8331D(SingleScrollTopLockingListView singleScrollTopLockingListView, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(": mediaItemsInCache=");
        stringBuilder.append(singleScrollTopLockingListView.f12079F.keySet().size());
        stringBuilder.append(", firstVisiblePosition=");
        stringBuilder.append(singleScrollTopLockingListView.getFirstVisiblePosition());
        stringBuilder.append(", lastVisiblePosition=");
        stringBuilder.append(singleScrollTopLockingListView.getLastVisiblePosition());
        stringBuilder.append(", currentMediaId=");
        stringBuilder.append(singleScrollTopLockingListView.f12076C.C());
        return stringBuilder.toString();
    }

    /* renamed from: E */
    public final void mo1966E() {
        m8334G(700);
    }

    /* renamed from: E */
    private static void m8332E(SingleScrollTopLockingListView singleScrollTopLockingListView, boolean z) {
        int height = singleScrollTopLockingListView.getHeight() / 2;
        if (!z) {
            height = -height;
        }
        singleScrollTopLockingListView.smoothScrollBy(height, 700);
    }

    /* renamed from: F */
    private void m8333F() {
        String C = this.f12076C.C();
        if (C != null) {
            int currentViewHeight = getCurrentViewHeight();
            if (currentViewHeight != -1) {
                if (!this.f12079F.containsKey(C) || currentViewHeight != ((Integer) this.f12079F.get(C)).intValue()) {
                    this.f12079F.put(C, Integer.valueOf(currentViewHeight));
                }
            }
        }
    }

    /* renamed from: G */
    public final void mo1967G() {
        m8335H(700);
    }

    /* renamed from: G */
    private void m8334G(int i) {
        View currentMediaFooterView = getCurrentMediaFooterView();
        if (currentMediaFooterView != null) {
            smoothScrollBy(currentMediaFooterView.getBottom() - this.f12077D, i);
            return;
        }
        AnonymousClass0Gn.m1876C(f12074H, m8331D(this, "scrollToNextItem_footerNotFound"));
        m8332E(this, true);
    }

    /* renamed from: H */
    private void m8335H(int i) {
        String D = this.f12076C.D();
        int i2 = 0;
        if (D == null || !this.f12079F.containsKey(D)) {
            String D2;
            String str = f12074H;
            if (D == null) {
                D2 = m8331D(this, "scrollToPrevItem_prevItemNull");
            } else {
                D2 = m8331D(this, "scrollToPrevItem_prevItemHeightNotCached");
            }
            AnonymousClass0Gn.m1876C(str, D2);
            m8332E(this, false);
        } else {
            int intValue = ((Integer) this.f12079F.get(D)).intValue();
            if (intValue <= 0) {
                D = f12074H;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("scrollToPrevItem_prevItemHeight=");
                stringBuilder.append(intValue);
                AnonymousClass0Gn.m1876C(D, m8331D(this, stringBuilder.toString()));
                m8332E(this, false);
                return;
            }
            intValue += this.f12077D;
            int B = this.f12076C.B();
            int A = this.f12076C.A();
            View childAt = getChildAt(B - getFirstVisiblePosition());
            View childAt2 = getChildAt(A - getFirstVisiblePosition());
            if (childAt != null && childAt.getTop() >= 0) {
                intValue -= childAt.getTop();
            } else if (childAt2 != null && childAt2.getBottom() < getBottom()) {
                Integer num = (Integer) this.f12079F.get(this.f12076C.C());
                if (num != null) {
                    i2 = num.intValue() - childAt2.getBottom();
                }
                intValue += i2;
            }
            smoothScrollBy(-intValue, i);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f12078E != null) {
            m8333F();
            this.f12080G = this.f12078E.onTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void ei() {
        this.f12079F = null;
    }

    private View getCurrentMediaFooterView() {
        return getChildAt(this.f12076C.A() - getFirstVisiblePosition());
    }

    private int getCurrentViewHeight() {
        int A = this.f12076C.A() - getFirstVisiblePosition();
        View childAt = getChildAt(this.f12076C.B() - getFirstVisiblePosition());
        View childAt2 = getChildAt(A);
        if (childAt != null) {
            if (childAt2 != null) {
                return childAt2.getBottom() - childAt.getTop();
            }
        }
        return -1;
    }

    public final void gi() {
        this.f12078E = null;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f12080G) {
            if (!super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
        }
        return true;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.m5859I(this, 564055402);
        m8333F();
        AnonymousClass0cQ.m5858H(this, 2106638763, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        AnonymousClass0cQ.m5858H(this, 1618540188, AnonymousClass0cQ.m5859I(this, -244675548));
    }

    public void setScrollOffset(int i) {
        this.f12077D = i;
    }
}

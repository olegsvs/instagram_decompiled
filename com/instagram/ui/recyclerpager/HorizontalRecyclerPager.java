package com.instagram.ui.recyclerpager;

import X.AnonymousClass0cQ;
import X.AnonymousClass0e8;
import X.AnonymousClass0la;
import X.AnonymousClass0rr;
import X.AnonymousClass0sf;
import X.AnonymousClass10n;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class HorizontalRecyclerPager extends RecyclerView {
    /* renamed from: B */
    public int f11295B;
    /* renamed from: C */
    public boolean f11296C;
    /* renamed from: D */
    public int f11297D = 0;
    /* renamed from: E */
    public int f11298E = 0;

    public HorizontalRecyclerPager(Context context) {
        super(context);
        m8037R();
    }

    public HorizontalRecyclerPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m8037R();
    }

    public HorizontalRecyclerPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m8037R();
    }

    public final void PA() {
        m8036Q(this, this.f11296C, false, true);
    }

    /* renamed from: Q */
    public static void m8036Q(HorizontalRecyclerPager horizontalRecyclerPager, boolean z, boolean z2, boolean z3) {
        AnonymousClass0rr anonymousClass0rr = (AnonymousClass0rr) horizontalRecyclerPager.getLayoutManager();
        View O = anonymousClass0rr.mo1888O(anonymousClass0rr.ZA());
        if (O != null) {
            int left;
            if (z) {
                left = O.getLeft() - AnonymousClass0la.m7306G(O);
            } else {
                left = O.getRight() + AnonymousClass0la.m7308I(O);
            }
            left = z ? (left - horizontalRecyclerPager.getWidth()) + horizontalRecyclerPager.f11297D : left - horizontalRecyclerPager.f11297D;
            if (z2) {
                left = z ? left - horizontalRecyclerPager.f11295B : left + horizontalRecyclerPager.f11295B;
            }
            if (z3) {
                horizontalRecyclerPager.JA(left, 0);
            } else {
                horizontalRecyclerPager.scrollBy(left, 0);
            }
        }
    }

    /* renamed from: R */
    private void m8037R() {
        this.f11296C = AnonymousClass0e8.m6200D(getContext());
        setLayoutManager(new AnonymousClass0sf(getContext(), 0, false));
        setHasFixedSize(true);
        setItemAnimator(new AnonymousClass10n());
    }

    /* renamed from: e */
    public final boolean mo1898e(int i, int i2) {
        this.f11298E = i;
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.m5863M(this, 1078189374);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        switch (motionEvent.getAction()) {
            case 0:
                this.f11298E = 0;
                break;
            case 1:
                AnonymousClass0rr anonymousClass0rr = (AnonymousClass0rr) getLayoutManager();
                View O = anonymousClass0rr.mo1888O(anonymousClass0rr.aA());
                if (O != null) {
                    int right = O.getRight() + AnonymousClass0la.m7308I(O);
                    int left = O.getLeft() - AnonymousClass0la.m7306G(O);
                    int i = this.f11298E;
                    if (i <= 0) {
                        if (i != 0 || Math.abs(right) >= Math.abs(left)) {
                            JA(this.f11296C ? ((left - getWidth()) - this.f11295B) + this.f11297D : (left - this.f11295B) - this.f11297D, 0);
                            if (getScrollState() == 1) {
                                OA();
                            }
                        }
                    }
                    JA(this.f11296C ? ((right - getWidth()) + this.f11295B) + this.f11297D : (right + this.f11295B) - this.f11297D, 0);
                }
                break;
            default:
                break;
        }
        AnonymousClass0cQ.m5862L(this, -96762475, M);
        return onTouchEvent;
    }

    public void setExtraScroll(int i) {
        this.f11295B = i;
    }

    public void setHorizontalPeekOffset(int i) {
        this.f11297D = i;
    }
}

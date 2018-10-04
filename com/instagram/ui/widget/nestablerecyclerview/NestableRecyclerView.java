package com.instagram.ui.widget.nestablerecyclerview;

import X.AnonymousClass0e8;
import X.AnonymousClass1mg;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class NestableRecyclerView extends RecyclerView {
    /* renamed from: B */
    private int f71443B;

    public NestableRecyclerView(Context context) {
        super(context);
    }

    public NestableRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NestableRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: Q */
    private boolean m28868Q() {
        boolean C = getLayoutManager().C();
        boolean D = AnonymousClass0e8.D(getContext());
        int i = -1;
        if (C) {
            int i2;
            if (D) {
                i2 = -1;
                i = 1;
            } else {
                i2 = 1;
            }
            if ((this.f71443B != 1 || canScrollHorizontally(r3)) && (this.f71443B != 2 || canScrollHorizontally(r1))) {
                return false;
            }
        } else if (this.f71443B != 1 || canScrollVertically(-1)) {
            if (this.f71443B != 2 || canScrollVertically(1)) {
                return false;
            }
        }
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (AnonymousClass1mg.B(motionEvent) == 0) {
            if (!m28868Q()) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setPassThroughEdge(int i) {
        this.f71443B = i;
    }
}

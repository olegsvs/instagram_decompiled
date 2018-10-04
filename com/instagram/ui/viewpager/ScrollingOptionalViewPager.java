package com.instagram.ui.viewpager;

import X.AnonymousClass0cQ;
import X.AnonymousClass1LZ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class ScrollingOptionalViewPager extends AnonymousClass1LZ {
    /* renamed from: B */
    private boolean f17372B = true;

    public ScrollingOptionalViewPager(Context context) {
        super(context);
    }

    public ScrollingOptionalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean getScrollingEnabled() {
        return this.f17372B;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f17372B ? super.onInterceptTouchEvent(motionEvent) : false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.m5863M(this, -23641839);
        if (this.f17372B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            AnonymousClass0cQ.m5862L(this, -1181352443, M);
            return onTouchEvent;
        }
        AnonymousClass0cQ.m5862L(this, -1975381279, M);
        return false;
    }

    public void setCurrentItem(int i) {
        if (this.f17372B) {
            super.setCurrentItem(i);
        } else {
            mo2479P(i, false);
        }
    }

    public void setScrollingEnabled(boolean z) {
        this.f17372B = z;
    }
}

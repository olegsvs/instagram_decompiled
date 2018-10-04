package com.instagram.common.ui.widget.touchinterceptorlayout;

import X.AnonymousClass0eR;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;

public class TouchInterceptorLinearLayout extends LinearLayout {
    /* renamed from: B */
    private final AnonymousClass0eR f7719B;

    public TouchInterceptorLinearLayout(Context context) {
        this(context, null);
    }

    public TouchInterceptorLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TouchInterceptorLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7719B = new AnonymousClass0eR(this, context, attributeSet);
    }

    /* renamed from: A */
    public final void m6306A(OnTouchListener onTouchListener) {
        this.f7719B.m6302A(onTouchListener, onTouchListener);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f7719B.m6303B(motionEvent);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (!this.f7719B.m6304C(z)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAndSaveInterceptTouchEvent(OnTouchListener onTouchListener) {
        this.f7719B.m6305D(onTouchListener, onTouchListener);
    }

    public void setAndSaveInterceptTouchEvent(OnTouchListener onTouchListener, OnTouchListener onTouchListener2) {
        this.f7719B.m6305D(onTouchListener, onTouchListener2);
    }

    public void setKeepObservingAfterRequestDisallowTouchEvent(boolean z) {
        this.f7719B.f7715C = z;
    }
}

package com.instagram.common.ui.widget.touchinterceptorlayout;

import X.AnonymousClass0eR;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

public class TouchInterceptorFrameLayout extends FrameLayout {
    /* renamed from: B */
    public final AnonymousClass0eR f7713B;

    public TouchInterceptorFrameLayout(Context context) {
        this(context, null);
    }

    public TouchInterceptorFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TouchInterceptorFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7713B = new AnonymousClass0eR(this, context, attributeSet);
    }

    /* renamed from: A */
    public final void m6300A(OnTouchListener onTouchListener) {
        this.f7713B.m6302A(onTouchListener, onTouchListener);
    }

    /* renamed from: B */
    public final void m6301B(OnTouchListener onTouchListener, OnTouchListener onTouchListener2) {
        this.f7713B.m6302A(onTouchListener, onTouchListener2);
    }

    public final void attachViewToParent(View view, int i, LayoutParams layoutParams) {
        super.attachViewToParent(view, i, layoutParams);
    }

    public final void detachViewFromParent(View view) {
        super.detachViewFromParent(view);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f7713B.m6303B(motionEvent);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (!this.f7713B.m6304C(z)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAndSaveInterceptTouchEvent(OnTouchListener onTouchListener) {
        this.f7713B.m6305D(onTouchListener, onTouchListener);
    }

    public void setAndSaveInterceptTouchEvent(OnTouchListener onTouchListener, OnTouchListener onTouchListener2) {
        this.f7713B.m6305D(onTouchListener, onTouchListener2);
    }

    public void setKeepObservingAfterRequestDisallowTouchEvent(boolean z) {
        this.f7713B.f7715C = z;
    }
}

package com.instagram.igtv.ui;

import X.AnonymousClass0cQ;
import X.AnonymousClass4ut;
import X.AnonymousClass4uu;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class GestureManagerFrameLayout extends FrameLayout {
    /* renamed from: B */
    public boolean f58424B;
    /* renamed from: C */
    private AnonymousClass4ut f58425C;
    /* renamed from: D */
    private boolean f58426D;

    public GestureManagerFrameLayout(Context context) {
        this(context, null);
    }

    public GestureManagerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GestureManagerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent.getActionMasked() == 0) {
            this.f58424B = false;
            this.f58426D = false;
        }
        if (super.dispatchTouchEvent(motionEvent) || this.f58426D) {
            z = true;
        }
        for (AnonymousClass4uu anonymousClass4uu : this.f58425C.f58420B) {
            if (anonymousClass4uu.JX()) {
                anonymousClass4uu.dc(motionEvent, z);
            }
        }
        return z;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean A = this.f58425C.m25351A(true, motionEvent);
        this.f58426D = A;
        return A;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, -1474436906);
        boolean A = this.f58425C.m25351A(false, motionEvent);
        this.f58426D = A;
        AnonymousClass0cQ.L(this, -1837881433, M);
        return A;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        this.f58424B = z;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setGestureManager(AnonymousClass4ut anonymousClass4ut) {
        this.f58425C = anonymousClass4ut;
    }
}

package com.instagram.feed.ui.views;

import X.AnonymousClass0cQ;
import X.AnonymousClass12E;
import X.AnonymousClass12F;
import X.AnonymousClass12G;
import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.facebook.C0164R;

public class CabooseLayout extends FrameLayout {
    /* renamed from: B */
    public ViewPropertyAnimator f13492B;
    /* renamed from: C */
    public AnimatorListener f13493C = new AnonymousClass12F(this);
    /* renamed from: D */
    public View f13494D;
    /* renamed from: E */
    public ViewPropertyAnimator f13495E;
    /* renamed from: F */
    public AnimatorListener f13496F = new AnonymousClass12G(this);
    /* renamed from: G */
    public AnonymousClass12E f13497G = AnonymousClass12E.SHOWN;
    /* renamed from: H */
    private int f13498H;
    /* renamed from: I */
    private int f13499I;

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public CabooseLayout(Context context) {
        super(context);
    }

    public CabooseLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CabooseLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: B */
    public static View m8852B(Context context, ViewGroup viewGroup) {
        return (FrameLayout) LayoutInflater.from(context).inflate(C0164R.layout.caboose_shadow, viewGroup, false);
    }

    public int getContentHeight() {
        return this.f13498H;
    }

    public static int getHiddenVisibility(CabooseLayout cabooseLayout) {
        if (cabooseLayout.getContentHeight() != 0) {
            if (cabooseLayout.getBottom() != 0) {
                return 8;
            }
        }
        return 4;
    }

    public AnonymousClass12E getState() {
        return this.f13497G;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = getMeasuredHeight() + this.f13499I;
        for (int childCount = getChildCount() - 1; childCount > -1; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getId() == C0164R.id.caboose_shadow) {
                childAt.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                childAt.layout(0, measuredHeight - childAt.getMeasuredHeight(), childAt.getMeasuredWidth(), measuredHeight);
                measuredHeight -= childAt.getMeasuredHeight();
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            measureChild(childAt, i, MeasureSpec.makeMeasureSpec(0, 0));
            if (childAt.getId() == C0164R.id.zoomable_view_container) {
                int measuredHeight = childAt.getMeasuredHeight() / 2;
                this.f13499I = childAt.getMeasuredHeight() - measuredHeight;
                i3 += measuredHeight;
            } else if (childAt.getId() != C0164R.id.caboose_shadow) {
                i3 += childAt.getMeasuredHeight();
            }
        }
        setMeasuredDimension(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
        this.f13498H = i3;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass0cQ.m5862L(this, 636863703, AnonymousClass0cQ.m5863M(this, 619789472));
        return false;
    }
}

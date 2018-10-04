package com.instagram.tagging.widget;

import X.AnonymousClass0cQ;
import X.AnonymousClass3hc;
import X.AnonymousClass3iQ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class PhotoScrollView extends ScrollView {
    /* renamed from: B */
    public float f43571B;
    /* renamed from: C */
    private AnonymousClass3hc f43572C;

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public PhotoScrollView(Context context) {
        super(context);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
    }

    public PhotoScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
    }

    public PhotoScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
    }

    /* renamed from: B */
    public static void m20470B(PhotoScrollView photoScrollView, float f) {
        int childCount = photoScrollView.getChildCount();
        if (childCount != 0) {
            photoScrollView.smoothScrollTo(0, (int) ((((float) (photoScrollView.getChildAt(childCount - 1).getBottom() + photoScrollView.getPaddingBottom())) * f) - ((float) (photoScrollView.getHeight() / 2))));
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i2 = this.f43572C;
        if (i2 != 0) {
            i2.m20457A(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, 674608206);
        super.onSizeChanged(i, i2, i3, i4);
        postDelayed(new AnonymousClass3iQ(this), 500);
        AnonymousClass0cQ.O(this, 1217616503, N);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass0cQ.L(this, 1512504232, AnonymousClass0cQ.M(this, -1070831124));
        return false;
    }

    public void setOnMeasureListener(AnonymousClass3hc anonymousClass3hc) {
        this.f43572C = anonymousClass3hc;
    }

    public void setScrollTarget(float f) {
        this.f43571B = f;
        m20470B(this, f);
    }
}

package com.instagram.ui.widget.flowlayout;

import X.AnonymousClass0e8;
import X.AnonymousClass0eY;
import X.AnonymousClass0mE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.facebook.forker.Process;

public class HorizontalFlowLayout extends ViewGroup {
    public HorizontalFlowLayout(Context context) {
        super(context);
    }

    public HorizontalFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HorizontalFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: B */
    private int[] m26223B(int i, boolean z) {
        boolean D = AnonymousClass0e8.D(getContext());
        int E = AnonymousClass0mE.E(this);
        int D2 = AnonymousClass0mE.D(this);
        int i2 = D ? i - E : E;
        int paddingTop = getPaddingTop();
        int i3 = Process.WAIT_RESULT_TIMEOUT;
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            Object obj;
            View childAt = getChildAt(i5);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
            int C = AnonymousClass0eY.C(marginLayoutParams);
            int measuredWidth = (childAt.getMeasuredWidth() + C) + AnonymousClass0eY.B(marginLayoutParams);
            int measuredHeight = (marginLayoutParams.topMargin + childAt.getMeasuredHeight()) + marginLayoutParams.bottomMargin;
            if (!D && r12 + measuredWidth > E + i) {
                i2 = E;
            } else if (!D || r12 - measuredWidth >= D2) {
                obj = null;
                if (obj != null) {
                    paddingTop += i4;
                    i4 = 0;
                }
                if (z) {
                    if (D) {
                        C += i2;
                        childAt.layout(C, marginLayoutParams.topMargin + paddingTop, childAt.getMeasuredWidth() + C, (marginLayoutParams.topMargin + paddingTop) + childAt.getMeasuredHeight());
                    } else {
                        childAt.layout((i2 - childAt.getMeasuredWidth()) - C, marginLayoutParams.topMargin + paddingTop, i2 - C, (marginLayoutParams.topMargin + paddingTop) + childAt.getMeasuredHeight());
                    }
                }
                i4 = Math.max(i4, measuredHeight);
                i2 = D ? i2 + measuredWidth : i2 - measuredWidth;
                i3 = Math.max(i3, i2);
            } else {
                i2 = D2 + i;
            }
            obj = 1;
            if (obj != null) {
                paddingTop += i4;
                i4 = 0;
            }
            if (z) {
                if (D) {
                    childAt.layout((i2 - childAt.getMeasuredWidth()) - C, marginLayoutParams.topMargin + paddingTop, i2 - C, (marginLayoutParams.topMargin + paddingTop) + childAt.getMeasuredHeight());
                } else {
                    C += i2;
                    childAt.layout(C, marginLayoutParams.topMargin + paddingTop, childAt.getMeasuredWidth() + C, (marginLayoutParams.topMargin + paddingTop) + childAt.getMeasuredHeight());
                }
            }
            i4 = Math.max(i4, measuredHeight);
            if (D) {
            }
            i3 = Math.max(i3, i2);
        }
        return new int[]{Math.max(getPaddingLeft(), i3) + getPaddingRight(), Math.max(getPaddingTop(), paddingTop + i4) + getPaddingBottom()};
    }

    public final boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams;
    }

    public final LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-2, -2);
    }

    public final LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    public final LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new MarginLayoutParams(layoutParams);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m26223B(i3 - i, true);
    }

    public final void onMeasure(int i, int i2) {
        int i3 = i;
        HorizontalFlowLayout horizontalFlowLayout = this;
        int size = (MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int i4 = 0;
        while (true) {
            int i5 = i2;
            if (i4 >= getChildCount()) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                measureChildWithMargins(childAt, i3, 0, i5, 0);
            }
            i4++;
        }
        if (MeasureSpec.getMode(i3) == 0) {
            size = -1;
        }
        int[] B = m26223B(size, false);
        setMeasuredDimension(resolveSize(B[0], i3), resolveSize(B[1], i2));
    }
}

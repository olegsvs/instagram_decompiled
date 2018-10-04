package com.instagram.ui.widget.pilelayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class PileLayout extends FrameLayout {
    public PileLayout(Context context) {
        this(context, null);
    }

    public PileLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PileLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 0) {
                i8 += childAt.getMeasuredWidth();
                i7++;
            }
        }
        if (i7 != 0) {
            i3 = ((i3 - i) - getPaddingLeft()) - getPaddingRight();
            int ceil = i7 > 1 ? (int) Math.ceil((double) Math.max(0.0f, ((float) (i8 - i3)) / ((float) (i7 - 1)))) : 0;
            i = (i + getPaddingLeft()) + Math.max(0, (i3 - i8) / 2);
            while (i6 < childCount) {
                View childAt2 = getChildAt(i6);
                if (childAt2.getVisibility() == 0) {
                    i5 = childAt2.getMeasuredWidth();
                    childAt2.layout(i, i2, i + i5, childAt2.getMeasuredHeight() + i2);
                    i += i5 - ceil;
                }
                i6++;
            }
        }
    }
}

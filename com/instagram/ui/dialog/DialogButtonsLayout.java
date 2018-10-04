package com.instagram.ui.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

public class DialogButtonsLayout extends LinearLayout {
    public DialogButtonsLayout(Context context) {
        super(context);
    }

    public DialogButtonsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DialogButtonsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void onMeasure(int i, int i2) {
        int i3 = 0;
        super.onMeasure(i, MeasureSpec.makeMeasureSpec(0, 0));
        int childCount = getChildCount();
        int i4 = 0;
        while (i3 < childCount) {
            if (getChildAt(i3).getMeasuredHeight() > i4) {
                i4 = getChildAt(i3).getMeasuredHeight();
            }
            i3++;
        }
        super.onMeasure(i, MeasureSpec.makeMeasureSpec(i4, 1073741824));
    }
}

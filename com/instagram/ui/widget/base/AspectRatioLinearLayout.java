package com.instagram.ui.widget.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

public class AspectRatioLinearLayout extends LinearLayout {
    /* renamed from: B */
    private float f28979B = 1.0f;

    public AspectRatioLinearLayout(Context context) {
        super(context);
    }

    public AspectRatioLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AspectRatioLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.f28979B;
        if (f > 1.0f) {
            measuredHeight = (int) (((float) measuredWidth) / f);
        } else {
            measuredWidth = (int) (((float) measuredHeight) * f);
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        this.f28979B = f;
        requestLayout();
    }
}

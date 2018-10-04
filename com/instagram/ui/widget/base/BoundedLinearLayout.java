package com.instagram.ui.widget.base;

import X.AnonymousClass0eS;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

public class BoundedLinearLayout extends LinearLayout {
    /* renamed from: B */
    private int f28992B;
    /* renamed from: C */
    private int f28993C;

    public BoundedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.BoundedView);
        this.f28993C = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f28992B = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int i3 = this.f28993C;
        if (i3 > 0 && i3 < size) {
            i = MeasureSpec.makeMeasureSpec(this.f28993C, MeasureSpec.getMode(i));
        }
        size = MeasureSpec.getSize(i2);
        i3 = this.f28992B;
        if (i3 > 0 && i3 < size) {
            i2 = MeasureSpec.makeMeasureSpec(this.f28992B, MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        this.f28992B = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        this.f28993C = i;
        requestLayout();
    }
}

package com.instagram.ui.text;

import X.AnonymousClass0cQ;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class BadgeTextView extends TextView {
    public BadgeTextView(Context context) {
        super(context);
    }

    public BadgeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BadgeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BadgeTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final void onMeasure(int i, int i2) {
        int N = AnonymousClass0cQ.N(this, -1559050703);
        super.onMeasure(i, i2);
        if (getMeasuredWidth() < getMeasuredHeight()) {
            int measuredHeight = (getMeasuredHeight() - getMeasuredWidth()) / 2;
            setPadding(getPaddingLeft() + measuredHeight, getPaddingTop(), getPaddingRight() + measuredHeight, getPaddingBottom());
            setMeasuredDimension(getMeasuredHeight(), getMeasuredHeight());
        }
        AnonymousClass0cQ.O(this, -994216764, N);
    }
}

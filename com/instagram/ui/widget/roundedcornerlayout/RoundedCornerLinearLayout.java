package com.instagram.ui.widget.roundedcornerlayout;

import X.AnonymousClass1DN;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class RoundedCornerLinearLayout extends LinearLayout {
    /* renamed from: B */
    private AnonymousClass1DN f29462B;

    public RoundedCornerLinearLayout(Context context) {
        super(context);
        m15185B(null);
    }

    public RoundedCornerLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m15185B(attributeSet);
    }

    public RoundedCornerLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m15185B(attributeSet);
    }

    /* renamed from: B */
    private void m15185B(AttributeSet attributeSet) {
        this.f29462B = AnonymousClass1DN.B(getContext(), attributeSet);
        setLayerType(2, null);
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f29462B.A(canvas);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f29462B.B(getMeasuredWidth(), getMeasuredHeight());
    }
}

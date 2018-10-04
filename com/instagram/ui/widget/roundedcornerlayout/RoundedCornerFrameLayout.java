package com.instagram.ui.widget.roundedcornerlayout;

import X.AnonymousClass1DN;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class RoundedCornerFrameLayout extends FrameLayout {
    /* renamed from: B */
    private AnonymousClass1DN f11568B;

    public RoundedCornerFrameLayout(Context context) {
        super(context);
        m8143B(null);
    }

    public RoundedCornerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m8143B(attributeSet);
    }

    public RoundedCornerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m8143B(attributeSet);
    }

    /* renamed from: B */
    private void m8143B(AttributeSet attributeSet) {
        this.f11568B = AnonymousClass1DN.m10075B(getContext(), attributeSet);
        setLayerType(2, null);
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f11568B.m10078A(canvas);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f11568B.m10079B(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setStrokeColor(int i) {
        if (this.f11568B.m10081D(i)) {
            invalidate();
        }
    }

    public void setStrokeWidth(float f) {
        if (this.f11568B.m10082E(f)) {
            invalidate();
        }
    }
}

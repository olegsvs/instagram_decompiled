package com.instagram.ui.widget.dashededge;

import X.AnonymousClass2KT;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class DashedEdgeLinearLayout extends LinearLayout {
    /* renamed from: B */
    private final AnonymousClass2KT f29018B;

    public DashedEdgeLinearLayout(Context context) {
        this(context, null);
    }

    public DashedEdgeLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DashedEdgeLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29018B = new AnonymousClass2KT(context, attributeSet);
        setWillNotDraw(false);
    }

    public final void onDraw(Canvas canvas) {
        this.f29018B.m15093A(canvas);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f29018B.m15094B(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setDashedEdgeColor(int i) {
        if (this.f29018B.m15095C(i)) {
            invalidate();
        }
    }
}

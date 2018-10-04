package com.instagram.ui.widget.dashededge;

import X.AnonymousClass2KT;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class DashedEdgeFrameLayout extends FrameLayout {
    /* renamed from: B */
    private final AnonymousClass2KT f29008B;

    public DashedEdgeFrameLayout(Context context) {
        this(context, null);
    }

    public DashedEdgeFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DashedEdgeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29008B = new AnonymousClass2KT(context, attributeSet);
        setWillNotDraw(false);
    }

    public final void onDraw(Canvas canvas) {
        this.f29008B.m15093A(canvas);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f29008B.m15094B(getMeasuredWidth(), getMeasuredHeight());
    }
}

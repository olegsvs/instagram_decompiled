package com.instagram.igtv.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

public class SystemWindowSpy extends View {
    /* renamed from: B */
    private final Rect f58455B;

    public SystemWindowSpy(Context context) {
        this(context, null);
    }

    public SystemWindowSpy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SystemWindowSpy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58455B = new Rect();
        setFitsSystemWindows(true);
    }

    public final boolean fitSystemWindows(Rect rect) {
        this.f58455B.set(rect);
        requestLayout();
        return false;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, MeasureSpec.makeMeasureSpec(resolveSize(this.f58455B.bottom, i2), 1073741824));
    }
}

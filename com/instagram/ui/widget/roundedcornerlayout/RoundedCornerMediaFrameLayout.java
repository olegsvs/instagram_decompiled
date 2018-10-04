package com.instagram.ui.widget.roundedcornerlayout;

import X.AnonymousClass1DN;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.instagram.common.ui.widget.framelayout.MediaFrameLayout;

public class RoundedCornerMediaFrameLayout extends MediaFrameLayout {
    /* renamed from: B */
    private AnonymousClass1DN f29463B;

    public RoundedCornerMediaFrameLayout(Context context) {
        super(context);
        m15186B(null);
    }

    public RoundedCornerMediaFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m15186B(attributeSet);
    }

    public RoundedCornerMediaFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m15186B(attributeSet);
    }

    /* renamed from: B */
    private void m15186B(AttributeSet attributeSet) {
        this.f29463B = AnonymousClass1DN.B(getContext(), attributeSet);
        setLayerType(2, null);
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f29463B.A(canvas);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f29463B.B(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setRadius(int i) {
        if (this.f29463B.C(i)) {
            invalidate();
        }
    }
}

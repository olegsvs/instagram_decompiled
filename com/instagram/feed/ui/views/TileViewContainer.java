package com.instagram.feed.ui.views;

import X.AnonymousClass0eS;
import X.AnonymousClass1DN;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class TileViewContainer extends LinearLayout {
    /* renamed from: B */
    private int f26556B = 0;
    /* renamed from: C */
    private AnonymousClass1DN f26557C;

    public TileViewContainer(Context context) {
        super(context);
        m14558B(null);
    }

    public TileViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m14558B(attributeSet);
    }

    public TileViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m14558B(attributeSet);
    }

    /* renamed from: B */
    private void m14558B(AttributeSet attributeSet) {
        this.f26557C = AnonymousClass1DN.B(getContext(), attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.TileViewContainer);
            this.f26556B = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
        }
        setLayerType(2, null);
    }

    public final void dispatchDraw(Canvas canvas) {
        canvas.drawColor(this.f26556B);
        super.dispatchDraw(canvas);
        this.f26557C.A(canvas);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f26557C.B(getMeasuredWidth(), getMeasuredHeight());
    }
}

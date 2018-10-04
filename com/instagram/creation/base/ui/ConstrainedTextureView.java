package com.instagram.creation.base.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;

public class ConstrainedTextureView extends TextureView {
    /* renamed from: B */
    private float f39102B = 1.0f;

    public ConstrainedTextureView(Context context) {
        super(context);
    }

    public ConstrainedTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConstrainedTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public float getAspectRatio() {
        return this.f39102B;
    }

    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int i3;
        super.onMeasure(i, i2);
        if (this.f39102B < 1.0f) {
            measuredHeight = getMeasuredHeight();
            i3 = (int) ((((float) measuredHeight) * this.f39102B) + 0.5f);
        } else {
            i3 = getMeasuredWidth();
            measuredHeight = (int) ((((float) i3) / this.f39102B) + 0.5f);
        }
        setMeasuredDimension(i3, measuredHeight);
    }

    public void setAspectRatio(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException();
        } else if (this.f39102B != f) {
            this.f39102B = f;
            requestLayout();
        }
    }
}

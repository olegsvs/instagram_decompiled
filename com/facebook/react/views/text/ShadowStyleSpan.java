package com.facebook.react.views.text;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class ShadowStyleSpan extends CharacterStyle {
    private final int mColor;
    private final float mDx;
    private final float mDy;
    private final float mRadius;

    public ShadowStyleSpan(float f, float f2, float f3, int i) {
        this.mDx = f;
        this.mDy = f2;
        this.mRadius = f3;
        this.mColor = i;
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.mRadius, this.mDx, this.mDy, this.mColor);
    }
}

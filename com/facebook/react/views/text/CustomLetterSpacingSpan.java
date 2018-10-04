package com.facebook.react.views.text;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class CustomLetterSpacingSpan extends MetricAffectingSpan {
    private final float mLetterSpacing;

    public CustomLetterSpacingSpan(float f) {
        this.mLetterSpacing = f;
    }

    private void apply(TextPaint textPaint) {
        if (!Float.isNaN(this.mLetterSpacing)) {
            textPaint.setLetterSpacing(this.mLetterSpacing / textPaint.getTextSize());
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        apply(textPaint);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        apply(textPaint);
    }
}

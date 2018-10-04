package com.facebook.react.views.text;

import android.graphics.Paint.FontMetricsInt;
import android.text.style.LineHeightSpan;

public final class CustomLineHeightSpan implements LineHeightSpan {
    private final int mHeight;

    public CustomLineHeightSpan(float f) {
        this.mHeight = (int) Math.ceil((double) f);
    }

    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = this.mHeight;
        if (i5 > i6) {
            i5 = Math.min(i6, fontMetricsInt.descent);
            fontMetricsInt.descent = i5;
            fontMetricsInt.bottom = i5;
            fontMetricsInt.ascent = 0;
            fontMetricsInt.top = 0;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.descent > this.mHeight) {
            fontMetricsInt.bottom = fontMetricsInt.descent;
            i6 = (-this.mHeight) + fontMetricsInt.descent;
            fontMetricsInt.ascent = i6;
            fontMetricsInt.top = i6;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.bottom > this.mHeight) {
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = fontMetricsInt.ascent + this.mHeight;
        } else {
            i6 = (-fontMetricsInt.top) + fontMetricsInt.bottom;
            i = this.mHeight;
            if (i6 > i) {
                fontMetricsInt.top = fontMetricsInt.bottom - this.mHeight;
                return;
            }
            double d = (double) fontMetricsInt.top;
            i = (double) (((float) (i - ((-fontMetricsInt.top) + fontMetricsInt.bottom))) / 2.0f);
            double ceil = Math.ceil(i);
            Double.isNaN(d);
            fontMetricsInt.top = (int) (d - ceil);
            d = (double) fontMetricsInt.bottom;
            ceil = Math.floor(i);
            Double.isNaN(d);
            fontMetricsInt.bottom = (int) (d + ceil);
            fontMetricsInt.ascent = fontMetricsInt.top;
            fontMetricsInt.descent = fontMetricsInt.bottom;
        }
    }
}

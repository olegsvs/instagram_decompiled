package com.instagram.ui.text;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomTypefaceSpan extends TypefaceSpan {
    /* renamed from: B */
    private final Typeface f28832B;

    public CustomTypefaceSpan(Typeface typeface) {
        this(JsonProperty.USE_DEFAULT_NAME, typeface);
    }

    public CustomTypefaceSpan(String str, Typeface typeface) {
        super(str);
        this.f28832B = typeface;
    }

    /* renamed from: B */
    private static void m15010B(Paint paint, Typeface typeface) {
        int i;
        Typeface typeface2 = paint.getTypeface();
        if (typeface2 == null) {
            i = 0;
        } else {
            i = typeface2.getStyle();
        }
        i &= typeface.getStyle() ^ -1;
        if ((i & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((i & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }

    public final void updateDrawState(TextPaint textPaint) {
        m15010B(textPaint, this.f28832B);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        m15010B(textPaint, this.f28832B);
    }
}

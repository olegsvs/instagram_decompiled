package com.facebook.react.views.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.text.style.ReplacementSpan;
import java.text.BreakIterator;

public final class CustomTextTransformSpan extends ReplacementSpan {
    private final TextTransform mTransform;

    public CustomTextTransformSpan(TextTransform textTransform) {
        this.mTransform = textTransform;
    }

    private static String capitalize(String str) {
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        StringBuilder stringBuilder = new StringBuilder(str.length());
        int first = wordInstance.first();
        while (true) {
            int next = wordInstance.next();
            int i = first;
            first = next;
            if (next == -1) {
                return stringBuilder.toString();
            }
            String substring = str.substring(i, next);
            if (Character.isLetterOrDigit(substring.charAt(0))) {
                stringBuilder.append(Character.toUpperCase(substring.charAt(0)));
                stringBuilder.append(substring.substring(1).toLowerCase());
            } else {
                stringBuilder.append(substring);
            }
        }
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.drawText(transformText(charSequence), i, i2, f, (float) i4, paint);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        return Math.round(paint.measureText(transformText(charSequence), i, i2));
    }

    private CharSequence transformText(CharSequence charSequence) {
        switch (this.mTransform.ordinal()) {
            case 1:
                return charSequence.toString().toUpperCase();
            case 2:
                return charSequence.toString().toLowerCase();
            case 3:
                return capitalize(charSequence.toString());
            default:
                return charSequence;
        }
    }
}

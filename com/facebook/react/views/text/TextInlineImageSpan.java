package com.facebook.react.views.text;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.widget.TextView;

public abstract class TextInlineImageSpan extends ReplacementSpan {
    public abstract Drawable getDrawable();

    public abstract int getHeight();

    public abstract void onAttachedToWindow();

    public abstract void onDetachedFromWindow();

    public abstract void onFinishTemporaryDetach();

    public abstract void onStartTemporaryDetach();

    public abstract void setTextView(TextView textView);

    public static void possiblyUpdateInlineImageSpans(Spannable spannable, TextView textView) {
        int i = 0;
        TextInlineImageSpan[] textInlineImageSpanArr = (TextInlineImageSpan[]) spannable.getSpans(0, spannable.length(), TextInlineImageSpan.class);
        int length = textInlineImageSpanArr.length;
        while (i < length) {
            TextInlineImageSpan textInlineImageSpan = textInlineImageSpanArr[i];
            textInlineImageSpan.onAttachedToWindow();
            textInlineImageSpan.setTextView(textView);
            i++;
        }
    }
}

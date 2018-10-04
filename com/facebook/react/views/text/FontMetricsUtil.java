package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;

public final class FontMetricsUtil {
    public static WritableArray getFontMetrics(CharSequence charSequence, Layout layout, TextPaint textPaint, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < layout.getLineCount(); i++) {
            Rect rect = new Rect();
            layout.getLineBounds(i, rect);
            WritableMap createMap = Arguments.createMap();
            TextPaint textPaint2 = new TextPaint(textPaint);
            textPaint2.setTextSize(textPaint2.getTextSize() * 100.0f);
            Rect rect2 = new Rect();
            textPaint2.getTextBounds("T", 0, 1, rect2);
            Rect rect3 = new Rect();
            textPaint2.getTextBounds("x", 0, 1, rect3);
            createMap.putDouble("x", (double) (((float) rect.left) / displayMetrics.density));
            createMap.putDouble("y", (double) (((float) rect.top) / displayMetrics.density));
            createMap.putDouble("width", (double) (layout.getLineWidth(i) / displayMetrics.density));
            createMap.putDouble("height", (double) (((float) rect.height()) / displayMetrics.density));
            createMap.putDouble("descender", (double) (((float) layout.getLineDescent(i)) / displayMetrics.density));
            createMap.putDouble("ascender", (double) (((float) (-layout.getLineAscent(i))) / displayMetrics.density));
            createMap.putDouble("baseline", (double) (((float) layout.getLineBaseline(i)) / displayMetrics.density));
            createMap.putDouble("capHeight", (double) ((((float) (rect2.height() / 100)) * textPaint.getTextSize()) / displayMetrics.density));
            createMap.putDouble("xHeight", (double) ((((float) (rect3.height() / 100)) * textPaint.getTextSize()) / displayMetrics.density));
            createMap.putString("text", charSequence.subSequence(layout.getLineStart(i), layout.getLineEnd(i)).toString());
            createArray.pushMap(createMap);
        }
        return createArray;
    }
}

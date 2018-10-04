package com.facebook.react.uimanager;

import android.util.TypedValue;

public final class PixelUtil {
    public static float toDIPFromPixel(float f) {
        return f / DisplayMetricsHolder.getWindowDisplayMetrics().density;
    }

    public static float toPixelFromDIP(double d) {
        return toPixelFromDIP((float) d);
    }

    public static float toPixelFromDIP(float f) {
        return TypedValue.applyDimension(1, f, DisplayMetricsHolder.getWindowDisplayMetrics());
    }

    public static float toPixelFromSP(float f) {
        return TypedValue.applyDimension(2, f, DisplayMetricsHolder.getWindowDisplayMetrics());
    }
}

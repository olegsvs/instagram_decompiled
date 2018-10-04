package com.facebook.react.views.view;

public final class ColorUtil {
    public static int getOpacityFromColor(int i) {
        i >>>= 24;
        return i == 255 ? -1 : i == 0 ? -2 : -3;
    }

    public static int multiplyColorAlpha(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }
}

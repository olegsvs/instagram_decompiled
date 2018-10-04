package com.facebook.react.uimanager;

public final class FloatUtil {
    public static boolean floatsEqual(float f, float f2) {
        if (!Float.isNaN(f)) {
            if (!Float.isNaN(f2)) {
                if (Math.abs(f2 - f) < 1.0E-5f) {
                    return true;
                }
                return false;
            }
        }
        if (Float.isNaN(f) && Float.isNaN(f2)) {
            return true;
        }
        return false;
    }
}

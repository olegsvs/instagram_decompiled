package com.facebook.react.views.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;

public final class DefaultStyleValuesUtil {
    private DefaultStyleValuesUtil() {
        throw new AssertionError("Never invoke this for an Utility class!");
    }

    private static ColorStateList getDefaultTextAttribute(Context context, int i) {
        Throwable th;
        TypedArray typedArray = null;
        try {
            typedArray = context.getTheme().obtainStyledAttributes(new int[]{i});
            try {
                ColorStateList colorStateList = typedArray.getColorStateList(0);
                if (typedArray != null) {
                    typedArray.recycle();
                }
                return colorStateList;
            } catch (Throwable th2) {
                th = th2;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    public static ColorStateList getDefaultTextColor(Context context) {
        return getDefaultTextAttribute(context, 16842904);
    }

    public static int getDefaultTextColorHighlight(Context context) {
        return getDefaultTextAttribute(context, 16842905).getDefaultColor();
    }

    public static ColorStateList getDefaultTextColorHint(Context context) {
        return getDefaultTextAttribute(context, 16842906);
    }
}

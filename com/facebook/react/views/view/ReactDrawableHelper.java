package com.facebook.react.views.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.TypedValue;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;

public final class ReactDrawableHelper {
    private static final TypedValue sResolveOutValue = new TypedValue();

    public static Drawable createDrawableFromJSDescription(Context context, ReadableMap readableMap) {
        String string = readableMap.getString("type");
        StringBuilder stringBuilder;
        if ("ThemeAttrAndroid".equals(string)) {
            String string2 = readableMap.getString("attribute");
            SoftAssertions.assertNotNull(string2);
            int identifier = context.getResources().getIdentifier(string2, "attr", "android");
            if (identifier != 0) {
                Theme theme = context.getTheme();
                TypedValue typedValue = sResolveOutValue;
                if (!theme.resolveAttribute(identifier, typedValue, true)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Attribute ");
                    stringBuilder.append(string2);
                    stringBuilder.append(" couldn't be resolved into a drawable");
                    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
                } else if (VERSION.SDK_INT >= 21) {
                    return context.getResources().getDrawable(typedValue.resourceId, context.getTheme());
                } else {
                    return context.getResources().getDrawable(typedValue.resourceId);
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Attribute ");
            stringBuilder.append(string2);
            stringBuilder.append(" couldn't be found in the resource list");
            throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
        } else if (!"RippleAndroid".equals(string)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid type for android drawable: ");
            stringBuilder.append(string);
            throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
        } else if (VERSION.SDK_INT >= 21) {
            Drawable drawable;
            if (!readableMap.hasKey("color") || readableMap.isNull("color")) {
                Theme theme2 = context.getTheme();
                TypedValue typedValue2 = sResolveOutValue;
                if (theme2.resolveAttribute(16843820, typedValue2, true)) {
                    context = context.getResources().getColor(typedValue2.resourceId);
                } else {
                    throw new JSApplicationIllegalArgumentException("Attribute colorControlHighlight couldn't be resolved into a drawable");
                }
            }
            context = readableMap.getInt("color");
            if (readableMap.hasKey("borderless") && !readableMap.isNull("borderless")) {
                if (readableMap.getBoolean("borderless")) {
                    drawable = null;
                    return new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{context}), null, drawable);
                }
            }
            drawable = new ColorDrawable(-1);
            return new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{context}), null, drawable);
        } else {
            throw new JSApplicationIllegalArgumentException("Ripple drawable is not available on android API <21");
        }
    }
}

package com.facebook.react.modules.i18nmanager;

import X.AnonymousClass1mQ;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import java.util.Locale;

public final class I18nUtil {
    private static I18nUtil sharedI18nUtilInstance;

    private I18nUtil() {
    }

    public final void allowRTL(Context context, boolean z) {
        setPref(context, "RCTI18nUtil_allowRTL", z);
    }

    public final boolean doLeftAndRightSwapInRTL(Context context) {
        return isPrefSet(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }

    public final void forceRTL(Context context, boolean z) {
        setPref(context, "RCTI18nUtil_forceRTL", z);
    }

    public static I18nUtil getInstance() {
        if (sharedI18nUtilInstance == null) {
            sharedI18nUtilInstance = new I18nUtil();
        }
        return sharedI18nUtilInstance;
    }

    private static boolean isDevicePreferredLanguageRTL() {
        return AnonymousClass1mQ.m12987B(Locale.getDefault()) == 1;
    }

    private static boolean isPrefSet(Context context, String str, boolean z) {
        return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean(str, z);
    }

    public final boolean isRTL(Context context) {
        if (isRTLForced(context)) {
            return true;
        }
        if (isRTLAllowed(context) && isDevicePreferredLanguageRTL()) {
            return true;
        }
        return false;
    }

    private boolean isRTLAllowed(Context context) {
        return isPrefSet(context, "RCTI18nUtil_allowRTL", true);
    }

    private boolean isRTLForced(Context context) {
        return isPrefSet(context, "RCTI18nUtil_forceRTL", false);
    }

    private static void setPref(Context context, String str, boolean z) {
        Editor edit = context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public final void swapLeftAndRightInRTL(Context context, boolean z) {
        setPref(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", z);
    }
}

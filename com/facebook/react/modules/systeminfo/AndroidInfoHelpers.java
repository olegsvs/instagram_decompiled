package com.facebook.react.modules.systeminfo;

import android.os.Build;
import android.os.Build.VERSION;
import java.util.Locale;

public final class AndroidInfoHelpers {
    public static String getFriendlyDeviceName() {
        if (isRunningOnGenymotion()) {
            return Build.MODEL;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Build.MODEL);
        stringBuilder.append(" - ");
        stringBuilder.append(VERSION.RELEASE);
        stringBuilder.append(" - API ");
        stringBuilder.append(VERSION.SDK_INT);
        return stringBuilder.toString();
    }

    public static String getServerHost() {
        return getServerIpAddress(8081);
    }

    private static String getServerIpAddress(int i) {
        String str = isRunningOnGenymotion() ? "10.0.3.2" : isRunningOnStockEmulator() ? "10.0.2.2" : "localhost";
        return String.format(Locale.US, "%s:%d", new Object[]{str, Integer.valueOf(i)});
    }

    private static boolean isRunningOnGenymotion() {
        return Build.FINGERPRINT.contains("vbox");
    }

    private static boolean isRunningOnStockEmulator() {
        return Build.FINGERPRINT.contains("generic");
    }
}

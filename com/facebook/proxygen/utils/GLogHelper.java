package com.facebook.proxygen.utils;

public class GLogHelper {
    private static native void log(int i, String str);

    public static native void vlog(int i, String str);

    public static void log(GLogHandler$GLogSeverity gLogHandler$GLogSeverity, String str) {
        log(gLogHandler$GLogSeverity.ordinal(), str);
    }
}

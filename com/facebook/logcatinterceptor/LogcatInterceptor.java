package com.facebook.logcatinterceptor;

import X.AnonymousClass0CF;

public final class LogcatInterceptor {
    private static boolean sInstalled = false;

    private static native String nativeGetLogcatContents();

    private static native void nativeInstall(int i, int i2);

    private static native void nativeIntegrateWithBreakpad();

    static {
        AnonymousClass0CF.m856E("logcat-interceptor");
    }

    public static String getLogcatContents() {
        if (sInstalled) {
            return nativeGetLogcatContents();
        }
        throw new RuntimeException("Logcat interceptor not installed");
    }

    public static synchronized void install(int i, int i2) {
        synchronized (LogcatInterceptor.class) {
            if (!sInstalled) {
                nativeInstall(i, i2);
                sInstalled = true;
            }
        }
    }

    public static void integrateWithBreakpad() {
        if (sInstalled) {
            nativeIntegrateWithBreakpad();
            return;
        }
        throw new RuntimeException("Logcat interceptor not installed");
    }

    public static synchronized boolean isInstalled() {
        boolean z;
        synchronized (LogcatInterceptor.class) {
            z = sInstalled;
        }
        return z;
    }
}

package com.facebook.react.common;

public final class SystemClock {
    public static long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public static long nanoTime() {
        return System.nanoTime();
    }

    public static long uptimeMillis() {
        return android.os.SystemClock.uptimeMillis();
    }
}

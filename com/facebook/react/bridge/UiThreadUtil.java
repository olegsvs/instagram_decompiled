package com.facebook.react.bridge;

import X.AnonymousClass0OR;
import android.os.Handler;
import android.os.Looper;

public final class UiThreadUtil {
    private static Handler sMainHandler;

    public static void assertOnUiThread() {
        SoftAssertions.assertCondition(isOnUiThread(), "Expected to run on UI thread!");
    }

    public static boolean isOnUiThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void runOnUiThread(Runnable runnable) {
        synchronized (UiThreadUtil.class) {
            if (sMainHandler == null) {
                sMainHandler = new Handler(Looper.getMainLooper());
            }
        }
        AnonymousClass0OR.D(sMainHandler, runnable, 1865100480);
    }
}

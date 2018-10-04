package com.facebook.acra.util;

import X.AnonymousClass00b;
import android.os.Build.VERSION;

public class NoSync {
    private static Thread sLoadSoThread;
    private static boolean sSyncDisabled;

    private static native boolean disableFSSync(int i);

    private NoSync() {
    }

    public static void disableFSSync() {
        if (!sSyncDisabled) {
            sSyncDisabled = disableFSSync(VERSION.SDK_INT);
        }
    }

    public static void safeToLoadNativeLibraries() {
        synchronized (NoSync.class) {
            if (sLoadSoThread == null) {
                sLoadSoThread = new Thread(new AnonymousClass00b());
                sLoadSoThread.start();
            }
        }
    }
}

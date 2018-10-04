package com.facebook.analytics.appstatelogger;

import X.AnonymousClass0CF;
import X.AnonymousClass0Db;
import X.AnonymousClass0Dc;
import android.content.Context;
import com.facebook.breakpad.BreakpadManager;

public class AppStateLoggerNative {
    private static final String TAG = "AppStateLoggerNative";
    private static volatile boolean sAppStateLoggerNativeInited;

    private static native boolean registerOomHandler();

    private static native void registerStreamWithBreakpad(String str);

    private static native void registerWithNativeCrashHandler(String str);

    private static native void setBreakpadStreamDataNative(byte[] bArr);

    public static void initializeNativeCrashReporting(String str, Context context) {
        AnonymousClass0CF.E("appstatelogger");
        registerWithNativeCrashHandler(str);
        registerStreamWithBreakpad();
        if (AnonymousClass0Db.C(context, "app_state_log_vm_oom")) {
            registerOomHandler();
        }
        sAppStateLoggerNativeInited = true;
    }

    private static void registerStreamWithBreakpad() {
        try {
            registerStreamWithBreakpad(System.mapLibraryName(BreakpadManager.getNativeLibraryName()));
        } catch (Throwable e) {
            AnonymousClass0Dc.S(TAG, e, "registerAppStateLoggerStreamWithBreakpad failed", new Object[0]);
        }
    }

    public static void setBreakpadStreamData(byte[] bArr) {
        if (!sAppStateLoggerNativeInited) {
            AnonymousClass0Dc.P(TAG, "AppStateLoggerNative.initializeNativeCrashReporting not called.  setBreakpadStreamData will most lickly crash.");
        }
        setBreakpadStreamDataNative(bArr);
    }
}

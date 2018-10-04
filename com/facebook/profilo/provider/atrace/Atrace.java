package com.facebook.profilo.provider.atrace;

import X.AnonymousClass01S;
import X.AnonymousClass0Eg;

public final class Atrace {
    private static boolean sHasHook;
    private static boolean sHookFailed;

    private static native void enableSystraceNative();

    private static native boolean installSystraceHook(int i);

    public static native boolean isEnabled();

    private static native void restoreSystraceNative();

    public static void enableSystrace() {
        if (hasHacks()) {
            enableSystraceNative();
            AnonymousClass01S.m79B();
        }
    }

    public static synchronized boolean hasHacks() {
        boolean z;
        synchronized (Atrace.class) {
            if (!(sHasHook || sHookFailed)) {
                sHasHook = installSystraceHook(AnonymousClass0Eg.f2007B);
                sHookFailed = !sHasHook;
            }
            z = sHasHook;
        }
        return z;
    }

    public static void restoreSystrace() {
        if (hasHacks()) {
            restoreSystraceNative();
            AnonymousClass01S.m79B();
        }
    }
}

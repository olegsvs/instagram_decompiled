package com.facebook.react.bridge;

import X.AnonymousClass0CF;

public final class ReactBridge {
    private static boolean sDidInit;

    public static void staticInit() {
        if (!sDidInit) {
            AnonymousClass0CF.E("reactnativejni");
            sDidInit = true;
        }
    }
}

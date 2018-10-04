package com.facebook.profilo.provider.stacktrace;

import X.AnonymousClass0CF;

public class StackTraceWhitelist {
    private static native void nativeAddToWhitelist(int i);

    private static native void nativeRemoveFromWhitelist(int i);

    static {
        AnonymousClass0CF.m856E("profilo_stacktrace");
    }

    public static void add(int i) {
        nativeAddToWhitelist(i);
    }
}

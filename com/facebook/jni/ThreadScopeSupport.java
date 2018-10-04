package com.facebook.jni;

import X.AnonymousClass0CF;

public class ThreadScopeSupport {
    private static native void runStdFunctionImpl(long j);

    static {
        AnonymousClass0CF.m856E("fbjni");
    }

    private static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }
}

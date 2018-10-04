package com.facebook.jni;

import X.AnonymousClass0CF;

public class Countable {
    private long mInstance = 0;

    public native void dispose();

    static {
        AnonymousClass0CF.m856E("fb");
    }

    public void finalize() {
        dispose();
        super.finalize();
    }
}

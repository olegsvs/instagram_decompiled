package com.facebook.common.jniexecutors;

import X.AnonymousClass0CF;
import com.facebook.jni.HybridData;

public class NativeRunnable implements Runnable {
    public HybridData mHybridData;

    public native void run();

    static {
        AnonymousClass0CF.E("jniexecutors");
    }

    public NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

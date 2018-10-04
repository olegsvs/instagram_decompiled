package com.facebook.cameracore.mediapipeline.arclass.common;

import X.AnonymousClass0CF;
import com.facebook.jni.HybridData;

public class ARClass {
    private final HybridData mHybridData;

    private static native HybridData initHybrid(int i, boolean z, long j);

    public native long getRefreshTimeSeconds();

    public native int getValue();

    public native boolean isValid();

    static {
        AnonymousClass0CF.E("arclass");
    }

    private ARClass(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

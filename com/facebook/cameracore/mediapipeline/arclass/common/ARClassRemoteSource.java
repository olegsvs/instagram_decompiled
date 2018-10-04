package com.facebook.cameracore.mediapipeline.arclass.common;

import X.AnonymousClass0CF;
import com.facebook.jni.HybridData;

public abstract class ARClassRemoteSource {
    private final HybridData mHybridData;

    static {
        AnonymousClass0CF.E("arclass");
    }

    public ARClassRemoteSource(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

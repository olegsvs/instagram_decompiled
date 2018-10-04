package com.facebook.cameracore.mediapipeline.arclass.common;

import X.AnonymousClass0CF;
import com.facebook.jni.HybridData;

public class ARClassSource {
    public HybridData mHybridData;

    private static native HybridData initHybrid(ARClassRemoteSource aRClassRemoteSource, ARClassPersistentStore aRClassPersistentStore, ARClassConfigSource aRClassConfigSource);

    public native ARClass getARClass();

    static {
        AnonymousClass0CF.E("arclass");
    }

    public ARClassSource(ARClassRemoteSource aRClassRemoteSource, ARClassPersistentStore aRClassPersistentStore, ARClassConfigSource aRClassConfigSource) {
        this.mHybridData = initHybrid(aRClassRemoteSource, aRClassPersistentStore, aRClassConfigSource);
    }

    private ARClassSource(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

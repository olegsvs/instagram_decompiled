package com.facebook.cameracore.mediapipeline.dataproviders.doodling.interfaces;

import com.facebook.jni.HybridData;

public abstract class DoodlingDataProvider {
    private final HybridData mHybridData;

    public DoodlingDataProvider(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

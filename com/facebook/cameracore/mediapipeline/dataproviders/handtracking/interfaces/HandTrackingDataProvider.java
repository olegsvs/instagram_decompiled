package com.facebook.cameracore.mediapipeline.dataproviders.handtracking.interfaces;

import com.facebook.jni.HybridData;

public abstract class HandTrackingDataProvider {
    private final HybridData mHybridData;

    public abstract boolean isReady();

    public HandTrackingDataProvider(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

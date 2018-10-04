package com.facebook.cameracore.mediapipeline.dataproviders.bodytracker.interfaces;

import com.facebook.jni.HybridData;

public abstract class BodyTrackerDataProvider {
    private final HybridData mHybridData;

    public abstract boolean isBodyTrackerReady();

    public BodyTrackerDataProvider(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

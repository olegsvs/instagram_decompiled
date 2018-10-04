package com.facebook.cameracore.mediapipeline.dataproviders.objecttracker.interfaces;

import com.facebook.jni.HybridData;

public abstract class ObjectTrackerDataProvider {
    private final HybridData mHybridData;

    public abstract boolean isReady();

    public ObjectTrackerDataProvider(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

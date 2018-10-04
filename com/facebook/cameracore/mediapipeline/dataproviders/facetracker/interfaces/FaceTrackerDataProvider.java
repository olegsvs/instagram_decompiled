package com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces;

import com.facebook.jni.HybridData;

public abstract class FaceTrackerDataProvider {
    private final HybridData mHybridData;

    public abstract boolean isFaceTrackerReady();

    public abstract void suppressRandomFaceTrackingSampling();

    public FaceTrackerDataProvider(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

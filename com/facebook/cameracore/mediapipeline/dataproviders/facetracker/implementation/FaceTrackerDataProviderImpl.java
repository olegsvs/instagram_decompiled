package com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation;

import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProvider;
import com.facebook.jni.HybridData;

public class FaceTrackerDataProviderImpl extends FaceTrackerDataProvider {
    private static native HybridData initHybrid();

    public native boolean isFaceTrackerReady();

    public native void suppressRandomFaceTrackingSampling();

    public FaceTrackerDataProviderImpl() {
        super(initHybrid());
    }
}

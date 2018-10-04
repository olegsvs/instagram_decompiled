package com.facebook.cameracore.mediapipeline.services.targetrecognition.interfaces;

import com.facebook.jni.HybridData;

public abstract class TargetRecognitionService {
    private final HybridData mHybridData;

    public abstract boolean isReady();

    public TargetRecognitionService(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

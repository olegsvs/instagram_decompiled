package com.facebook.cameracore.mediapipeline.dataproviders.framebrightness.interfaces;

import com.facebook.jni.HybridData;

public abstract class FrameBrightnessDataProvider {
    private final HybridData mHybridData;

    public FrameBrightnessDataProvider(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

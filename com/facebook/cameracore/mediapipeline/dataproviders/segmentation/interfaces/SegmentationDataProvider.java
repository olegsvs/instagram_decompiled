package com.facebook.cameracore.mediapipeline.dataproviders.segmentation.interfaces;

import com.facebook.jni.HybridData;

public abstract class SegmentationDataProvider {
    private final HybridData mHybridData;

    public abstract boolean isReady();

    public SegmentationDataProvider(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

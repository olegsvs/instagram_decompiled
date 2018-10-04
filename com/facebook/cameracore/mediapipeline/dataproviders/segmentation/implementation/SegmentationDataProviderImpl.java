package com.facebook.cameracore.mediapipeline.dataproviders.segmentation.implementation;

import com.facebook.cameracore.mediapipeline.dataproviders.segmentation.interfaces.SegmentationDataProvider;
import com.facebook.jni.HybridData;

public class SegmentationDataProviderImpl extends SegmentationDataProvider {
    private static native HybridData initHybrid();

    public native boolean isReady();

    public SegmentationDataProviderImpl() {
        super(initHybrid());
    }
}

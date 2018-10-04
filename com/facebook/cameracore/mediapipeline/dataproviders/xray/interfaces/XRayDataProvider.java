package com.facebook.cameracore.mediapipeline.dataproviders.xray.interfaces;

import com.facebook.jni.HybridData;

public abstract class XRayDataProvider {
    private final HybridData mHybridData;

    public abstract boolean isReady();

    public XRayDataProvider(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

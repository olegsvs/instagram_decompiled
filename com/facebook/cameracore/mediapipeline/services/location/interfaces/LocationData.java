package com.facebook.cameracore.mediapipeline.services.location.interfaces;

import com.facebook.jni.HybridData;

public class LocationData {
    public HybridData mHybridData;

    private native HybridData initHybrid(boolean z, double d, double d2);
}

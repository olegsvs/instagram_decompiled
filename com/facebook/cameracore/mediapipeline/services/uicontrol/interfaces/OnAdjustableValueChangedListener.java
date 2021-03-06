package com.facebook.cameracore.mediapipeline.services.uicontrol.interfaces;

import com.facebook.jni.HybridData;

public class OnAdjustableValueChangedListener {
    public HybridData mHybridData;

    public native void onAdjustableValueChanged(float f);

    private OnAdjustableValueChangedListener(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

package com.facebook.cameracore.mediapipeline.services.uicontrol.interfaces;

import com.facebook.jni.HybridData;

public class OnPickerItemSelectedListener {
    public HybridData mHybridData;

    public native void onPickerItemSelected(int i);

    private OnPickerItemSelectedListener(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

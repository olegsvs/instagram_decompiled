package com.facebook.cameracore.mediapipeline.services.audiograph.implementation;

import com.facebook.jni.HybridData;

public class AudioGraphServiceController {
    private HybridData mHybridData = initHybrid();

    private native HybridData initHybrid();

    public native int readCaptureSamples(short[] sArr, int i, int i2);

    public native int readPreviewSamples(short[] sArr, int i, int i2);

    public native void setCaptureEnabled(boolean z);

    public native void setPreviewEnabled(boolean z);

    public final void release() {
        this.mHybridData.resetNative();
    }
}

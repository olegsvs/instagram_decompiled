package com.facebook.cameracore.mediapipeline.services.audiograph.implementation;

import com.facebook.jni.HybridData;

public class MicrophoneSink {
    private HybridData mHybridData = initHybrid();

    private native HybridData initHybrid();

    public native void write(short[] sArr, int i, int i2);

    public final void release() {
        this.mHybridData.resetNative();
    }
}

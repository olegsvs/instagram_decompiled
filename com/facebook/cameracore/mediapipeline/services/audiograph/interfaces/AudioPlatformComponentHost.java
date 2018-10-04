package com.facebook.cameracore.mediapipeline.services.audiograph.interfaces;

import com.facebook.cameracore.mediapipeline.services.audioclassic.interfaces.AudioRenderCallback;
import com.facebook.jni.HybridData;

public abstract class AudioPlatformComponentHost {
    public HybridData mHybridData;

    public abstract boolean onInputDataAvailable(byte[] bArr, int i, int i2);

    public abstract void setRenderCallback(AudioRenderCallback audioRenderCallback);

    public abstract void startRecording(boolean z);

    public abstract void stopRecording();

    public final void release() {
        HybridData hybridData = this.mHybridData;
        if (hybridData != null) {
            hybridData.resetNative();
        }
    }
}

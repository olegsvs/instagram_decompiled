package com.facebook.audiofiltercore;

import com.facebook.jni.HybridData;

public class VolumeLevelAudioTransform extends NativeSimpleAudioTransform {
    private static native HybridData initHybrid(float f);

    public native float getVolumeMultiplier();

    public native void setVolumeMultiplier(float f);

    public VolumeLevelAudioTransform(float f) {
        super(initHybrid(f));
    }
}

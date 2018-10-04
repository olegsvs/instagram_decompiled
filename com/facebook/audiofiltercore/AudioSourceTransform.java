package com.facebook.audiofiltercore;

import com.facebook.jni.HybridData;

public class AudioSourceTransform extends NativeSimpleAudioTransform {
    private static native HybridData initHybrid(int i, float f);

    public native void addAudioProcessor(AudioProcessorConfiguration audioProcessorConfiguration);

    public AudioSourceTransform(int i, float f) {
        super(initHybrid(i, f));
    }
}

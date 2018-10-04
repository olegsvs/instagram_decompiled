package com.facebook.audiofiltercore;

import com.facebook.jni.HybridData;

public abstract class NativeRestartableAudioInput extends NativeAudioInput implements RestartableAudioInput {
    public native long getRestartableAudioInputNativeReference();

    public native double getTimeElapsed();

    public native void restart();

    public NativeRestartableAudioInput(HybridData hybridData) {
        super(hybridData);
    }
}

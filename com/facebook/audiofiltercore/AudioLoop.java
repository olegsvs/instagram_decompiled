package com.facebook.audiofiltercore;

import com.facebook.jni.HybridData;

public class AudioLoop extends NativeAudioInput {
    private static native HybridData initHybridJava(RestartableAudioInput restartableAudioInput);

    private static native HybridData initHybridNative(long j);

    public AudioLoop(RestartableAudioInput restartableAudioInput) {
        super(initHybrid(restartableAudioInput));
    }

    private static HybridData initHybrid(RestartableAudioInput restartableAudioInput) {
        if (restartableAudioInput instanceof NativeRestartableAudioInput) {
            return initHybridNative(((NativeRestartableAudioInput) restartableAudioInput).getRestartableAudioInputNativeReference());
        }
        return initHybridJava(restartableAudioInput);
    }
}

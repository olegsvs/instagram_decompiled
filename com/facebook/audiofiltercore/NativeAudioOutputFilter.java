package com.facebook.audiofiltercore;

import com.facebook.jni.HybridData;

public abstract class NativeAudioOutputFilter extends NativeAudioOutput implements AudioOutput {
    private native void setOutputJava(AudioOutput audioOutput);

    private native void setOutputNative(long j);

    public NativeAudioOutputFilter(HybridData hybridData) {
        super(hybridData);
    }

    public final void setOutput(AudioOutput audioOutput) {
        if (audioOutput instanceof NativeAudioOutput) {
            setOutputNative(((NativeAudioOutput) audioOutput).getAudioOutputNativeReference());
        } else {
            setOutputJava(audioOutput);
        }
    }
}

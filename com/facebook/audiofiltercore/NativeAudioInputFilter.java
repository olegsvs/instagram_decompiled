package com.facebook.audiofiltercore;

import X.AnonymousClass2gD;
import com.facebook.jni.HybridData;

public abstract class NativeAudioInputFilter extends NativeAudioInput implements AudioInput {
    private native void setInputJava(AudioInput audioInput);

    private native void setInputNative(long j);

    public NativeAudioInputFilter(HybridData hybridData) {
        super(hybridData);
    }

    public final void setInput(AudioInput audioInput) {
        if (audioInput instanceof AnonymousClass2gD) {
            setInputNative(((AnonymousClass2gD) audioInput).getAudioInputNativeReference());
        } else {
            setInputJava(audioInput);
        }
    }
}

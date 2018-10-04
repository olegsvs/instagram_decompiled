package com.facebook.audiofiltercore;

import X.AnonymousClass2gD;
import com.facebook.jni.HybridData;

public class AudioMixer extends NativeAudioOutputFilter implements AudioInput, AnonymousClass2gD {

    public interface CompletionCallback {
        void onComplete();
    }

    private native void addInputJava(AudioInput audioInput, CompletionCallback completionCallback);

    private native void addInputNative(long j, CompletionCallback completionCallback);

    private static native HybridData initHybrid();

    private native void removeInputJava(AudioInput audioInput);

    private native void removeInputNative(long j);

    public native void close();

    public native long getAudioInputNativeReference();

    public native int read(short[] sArr, int i);

    public AudioMixer() {
        super(initHybrid());
    }

    public final void addInput(AudioInput audioInput, CompletionCallback completionCallback) {
        if (audioInput instanceof AnonymousClass2gD) {
            addInputNative(((AnonymousClass2gD) audioInput).getAudioInputNativeReference(), completionCallback);
        } else {
            addInputJava(audioInput, completionCallback);
        }
    }

    public final void removeInput(AudioInput audioInput) {
        if (audioInput instanceof AnonymousClass2gD) {
            removeInputNative(((AnonymousClass2gD) audioInput).getAudioInputNativeReference());
        } else {
            removeInputJava(audioInput);
        }
    }
}

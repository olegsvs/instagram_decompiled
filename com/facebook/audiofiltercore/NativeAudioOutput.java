package com.facebook.audiofiltercore;

import X.AnonymousClass0CF;
import com.facebook.jni.HybridData;

public abstract class NativeAudioOutput implements AudioOutput {
    private HybridData mHybridData;

    public native void flush();

    public native long getAudioOutputNativeReference();

    public native void write(short[] sArr, int i);

    static {
        AnonymousClass0CF.E("audiofiltercore");
    }

    public NativeAudioOutput(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

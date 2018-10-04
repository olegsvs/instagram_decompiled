package com.facebook.audiofiltercore;

import X.AnonymousClass0CF;
import X.AnonymousClass2gD;
import com.facebook.jni.HybridData;

public abstract class NativeAudioInput implements AudioInput, AnonymousClass2gD {
    private HybridData mHybridData;

    public native void close();

    public native long getAudioInputNativeReference();

    public native int read(short[] sArr, int i);

    static {
        AnonymousClass0CF.E("audiofiltercore");
    }

    public NativeAudioInput(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

package com.facebook.audiofiltercore;

import X.AnonymousClass0CF;
import com.facebook.jni.HybridData;

public abstract class NativeSimpleAudioTransform implements SimpleAudioTransform {
    private HybridData mHybridData;

    public native long getSimpleAudioTransformNativeReference();

    public native boolean isActive();

    public native void processSamples(short[] sArr, short[] sArr2, int i);

    static {
        AnonymousClass0CF.E("audiofiltercore");
    }

    public NativeSimpleAudioTransform(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

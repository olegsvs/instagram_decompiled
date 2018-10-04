package com.facebook.audiofiltercore;

import X.AnonymousClass0CF;
import com.facebook.jni.HybridData;

public abstract class NativeBufferedAudioTransform implements BufferedAudioTransform {
    private HybridData mHybridData;

    public native void flush();

    public native int getAvailableSampleCount();

    public native long getBufferedAudioTransformNativeReference();

    public native boolean isActive();

    public native void processSamples(short[] sArr, int i);

    public native int receiveSamples(short[] sArr, int i);

    static {
        AnonymousClass0CF.E("audiofiltercore");
    }

    public NativeBufferedAudioTransform(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

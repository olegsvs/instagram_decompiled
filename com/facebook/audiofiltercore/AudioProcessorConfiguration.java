package com.facebook.audiofiltercore;

import X.AnonymousClass0CF;
import com.facebook.jni.HybridData;

public class AudioProcessorConfiguration {
    private final HybridData mHybridData;

    public native String getName();

    static {
        AnonymousClass0CF.E("audiofiltercore");
    }

    private AudioProcessorConfiguration(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

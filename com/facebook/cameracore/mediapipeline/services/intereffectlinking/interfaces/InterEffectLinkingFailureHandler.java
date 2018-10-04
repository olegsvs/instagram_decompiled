package com.facebook.cameracore.mediapipeline.services.intereffectlinking.interfaces;

import com.facebook.jni.HybridData;

public class InterEffectLinkingFailureHandler {
    private final HybridData mHybridData;

    private native HybridData initHybrid();

    public native void notifyApplyEffectFailed(String str, String str2);

    private InterEffectLinkingFailureHandler(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

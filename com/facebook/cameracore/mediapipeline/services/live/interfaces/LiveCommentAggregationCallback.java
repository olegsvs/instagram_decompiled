package com.facebook.cameracore.mediapipeline.services.live.interfaces;

import com.facebook.jni.HybridData;

public class LiveCommentAggregationCallback {
    private HybridData mHybridData;

    private native void callCallbackNative(String[] strArr, int[] iArr);

    private LiveCommentAggregationCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

package com.facebook.cameracore.mediapipeline.services.touch.interfaces;

import X.AnonymousClass2kF;
import X.AnonymousClass3s7;
import com.facebook.jni.HybridData;

public abstract class TouchService {
    private HybridData mHybridData;

    public abstract AnonymousClass3s7 getGestureProcessor();

    public abstract void setTouchConfig(AnonymousClass2kF anonymousClass2kF);

    public TouchService(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

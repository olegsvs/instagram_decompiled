package com.facebook.cameracore.mediapipeline.services.targetrecognition.implementation;

import X.AnonymousClass0CF;
import com.facebook.cameracore.mediapipeline.services.targetrecognition.interfaces.TargetRecognitionService;
import com.facebook.jni.HybridData;

public class TargetRecognitionServiceImpl extends TargetRecognitionService {
    private static native HybridData initHybrid();

    public native boolean isReady();

    static {
        AnonymousClass0CF.E("filters-native-android");
    }

    public TargetRecognitionServiceImpl() {
        super(initHybrid());
    }
}

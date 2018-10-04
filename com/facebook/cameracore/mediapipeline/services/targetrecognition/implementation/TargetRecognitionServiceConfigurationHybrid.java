package com.facebook.cameracore.mediapipeline.services.targetrecognition.implementation;

import X.AnonymousClass2k3;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.targetrecognition.interfaces.TargetRecognitionServiceDataSource;
import com.facebook.jni.HybridData;

public class TargetRecognitionServiceConfigurationHybrid extends ServiceConfiguration {
    private final AnonymousClass2k3 mConfiguration;

    private static native HybridData initHybrid(String str, String str2, TargetRecognitionServiceDataSource targetRecognitionServiceDataSource);
}

package com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation;

import X.AnonymousClass1s4;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler;
import com.facebook.jni.HybridData;

public class FaceTrackerDataProviderConfigurationHybrid extends ServiceConfiguration {
    private final AnonymousClass1s4 mConfiguration;

    private static native HybridData initHybrid(int i, int i2, boolean z, boolean z2, String[] strArr, String[] strArr2, FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler faceTrackerDataProviderConfiguration$FaceTrackerErrorHandler);

    public FaceTrackerDataProviderConfigurationHybrid(AnonymousClass1s4 anonymousClass1s4) {
        super(initHybrid(anonymousClass1s4.f23568D.m13529A(), anonymousClass1s4.f23567C.m13528A(), anonymousClass1s4.f23571G, anonymousClass1s4.f23572H, anonymousClass1s4.f23570F, anonymousClass1s4.f23569E, anonymousClass1s4.f23566B));
        this.mConfiguration = anonymousClass1s4;
    }
}

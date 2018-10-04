package com.facebook.cameracore.mediapipeline.dataproviders.speed.implementation;

import X.AnonymousClass1sF;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class SpeedDataProviderConfigurationHybrid extends ServiceConfiguration {
    private final AnonymousClass1sF mConfiguration;
    private final SpeedDataSourceWrapper mSpeedDataSourceWrapper;

    private static native HybridData initHybrid(SpeedDataSourceWrapper speedDataSourceWrapper);
}

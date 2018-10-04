package com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation;

import X.AnonymousClass1s6;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class MotionDataProviderConfigurationHybrid extends ServiceConfiguration {
    private final AnonymousClass1s6 mConfiguration;
    private final MotionDataSourceWrapper mMotionDataSourceWrapper;

    private static native HybridData initHybrid(MotionDataSourceWrapper motionDataSourceWrapper);

    public MotionDataProviderConfigurationHybrid(AnonymousClass1s6 anonymousClass1s6) {
        this.mConfiguration = anonymousClass1s6;
        MotionDataSourceWrapper motionDataSourceWrapper = new MotionDataSourceWrapper(this.mConfiguration.f23573B);
        this.mMotionDataSourceWrapper = motionDataSourceWrapper;
        this.mHybridData = initHybrid(motionDataSourceWrapper);
    }
}

package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation;

import X.AnonymousClass1sH;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.WorldTrackingDataProviderDelegateWrapper;
import com.facebook.jni.HybridData;

public class WorldTrackerDataProviderConfigurationHybrid extends ServiceConfiguration {
    private final AnonymousClass1sH mConfiguration;

    private static native HybridData initHybrid(int i, int i2, DeviceConfig deviceConfig, WorldTrackingDataProviderDelegateWrapper worldTrackingDataProviderDelegateWrapper, boolean z);

    public WorldTrackerDataProviderConfigurationHybrid(AnonymousClass1sH anonymousClass1sH) {
        super(initHybrid(anonymousClass1sH.f23600D, anonymousClass1sH.f23601E, anonymousClass1sH.f23599C, anonymousClass1sH.f23598B, anonymousClass1sH.f23602F));
        this.mConfiguration = anonymousClass1sH;
    }
}

package com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation;

import X.AnonymousClass1sB;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class PlatformEventsDataProviderConfigurationHybrid extends ServiceConfiguration {
    private final AnonymousClass1sB mConfiguration;
    private final PlatformEventsServiceObjectsWrapper mObjectsWrapper;

    private static native HybridData initHybrid(PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper);

    public PlatformEventsDataProviderConfigurationHybrid(AnonymousClass1sB anonymousClass1sB) {
        this.mConfiguration = anonymousClass1sB;
        PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper = new PlatformEventsServiceObjectsWrapper(this.mConfiguration.f23585B, this.mConfiguration.f23586C);
        this.mObjectsWrapper = platformEventsServiceObjectsWrapper;
        this.mHybridData = initHybrid(platformEventsServiceObjectsWrapper);
    }
}

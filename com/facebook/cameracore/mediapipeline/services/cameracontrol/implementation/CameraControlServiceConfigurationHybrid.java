package com.facebook.cameracore.mediapipeline.services.cameracontrol.implementation;

import X.AnonymousClass2jJ;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.cameracontrol.interfaces.CameraControlServiceDelegateWrapper;
import com.facebook.jni.HybridData;

public class CameraControlServiceConfigurationHybrid extends ServiceConfiguration {
    private final AnonymousClass2jJ mConfiguration;

    private static native HybridData initHybrid(CameraControlServiceDelegateWrapper cameraControlServiceDelegateWrapper);

    public CameraControlServiceConfigurationHybrid(AnonymousClass2jJ anonymousClass2jJ) {
        super(initHybrid(anonymousClass2jJ.f33020B));
        this.mConfiguration = anonymousClass2jJ;
    }
}

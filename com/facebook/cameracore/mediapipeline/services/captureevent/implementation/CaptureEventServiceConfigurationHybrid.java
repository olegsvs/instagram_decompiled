package com.facebook.cameracore.mediapipeline.services.captureevent.implementation;

import X.AnonymousClass2jN;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class CaptureEventServiceConfigurationHybrid extends ServiceConfiguration {
    private final CaptureEventInputWrapper mCaptureEventInputWrapper;
    private final AnonymousClass2jN mConfiguration;

    private static native HybridData initHybrid(CaptureEventInputWrapper captureEventInputWrapper);

    public CaptureEventServiceConfigurationHybrid(AnonymousClass2jN anonymousClass2jN) {
        this.mConfiguration = anonymousClass2jN;
        CaptureEventInputWrapper captureEventInputWrapper = new CaptureEventInputWrapper(this.mConfiguration.f33028B);
        this.mCaptureEventInputWrapper = captureEventInputWrapper;
        this.mHybridData = initHybrid(captureEventInputWrapper);
    }
}

package com.facebook.cameracore.mediapipeline.dataproviders.segmentation.implementation;

import X.AnonymousClass1sE;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class SegmentationDataProviderConfigurationHybrid extends ServiceConfiguration {
    private final AnonymousClass1sE mSegmentationDataProviderConfiguration;

    private static native HybridData initHybrid(String str, String str2, boolean z);

    public SegmentationDataProviderConfigurationHybrid(AnonymousClass1sE anonymousClass1sE) {
        super(initHybrid(anonymousClass1sE.f23589B, anonymousClass1sE.f23591D, anonymousClass1sE.f23590C));
        this.mSegmentationDataProviderConfiguration = anonymousClass1sE;
    }
}

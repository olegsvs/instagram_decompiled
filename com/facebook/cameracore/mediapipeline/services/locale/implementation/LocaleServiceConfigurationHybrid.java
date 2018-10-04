package com.facebook.cameracore.mediapipeline.services.locale.implementation;

import X.AnonymousClass2jq;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.locale.interfaces.LocaleDataSource;
import com.facebook.jni.HybridData;

public class LocaleServiceConfigurationHybrid extends ServiceConfiguration {
    private final AnonymousClass2jq mConfiguration;

    private static native HybridData initHybrid(LocaleDataSource localeDataSource);
}

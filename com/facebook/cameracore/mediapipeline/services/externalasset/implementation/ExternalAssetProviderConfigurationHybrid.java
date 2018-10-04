package com.facebook.cameracore.mediapipeline.services.externalasset.implementation;

import X.AnonymousClass2ja;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class ExternalAssetProviderConfigurationHybrid extends ServiceConfiguration {
    private final ExternalAssetDataSourceWrapper mAssetDataSourceWrapper;
    private final AnonymousClass2ja mConfiguration;

    private static native HybridData initHybrid(ExternalAssetDataSourceWrapper externalAssetDataSourceWrapper);

    public ExternalAssetProviderConfigurationHybrid(AnonymousClass2ja anonymousClass2ja) {
        this.mConfiguration = anonymousClass2ja;
        ExternalAssetDataSourceWrapper externalAssetDataSourceWrapper = new ExternalAssetDataSourceWrapper(this.mConfiguration.f33066B, this.mConfiguration.f33067C);
        this.mAssetDataSourceWrapper = externalAssetDataSourceWrapper;
        this.mHybridData = initHybrid(externalAssetDataSourceWrapper);
    }

    public final void destroy() {
        this.mAssetDataSourceWrapper.destroy();
        super.destroy();
    }
}

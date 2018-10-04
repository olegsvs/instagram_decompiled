package com.facebook.cameracore.mediapipeline.arengineservices.igeffectservicehost;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.PluginConfigProvider;
import com.facebook.jni.HybridData;

public class IgPluginConfigProvider extends PluginConfigProvider {
    private static native HybridData initHybrid();

    public IgPluginConfigProvider() {
        this.mHybridData = initHybrid();
    }
}

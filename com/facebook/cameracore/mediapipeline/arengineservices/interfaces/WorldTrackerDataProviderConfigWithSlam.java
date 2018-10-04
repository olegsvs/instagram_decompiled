package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.WorldTrackerDataProviderConfig;

public class WorldTrackerDataProviderConfigWithSlam {
    public final WorldTrackerDataProviderConfig config;
    public final boolean isSlamSupported;

    public WorldTrackerDataProviderConfigWithSlam(WorldTrackerDataProviderConfig worldTrackerDataProviderConfig, boolean z) {
        this.config = worldTrackerDataProviderConfig;
        this.isSlamSupported = z;
    }
}

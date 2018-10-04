package com.facebook.cameracore.mediapipeline.dataproviders.xray.interfaces;

public class XRayDataProviderConfig {
    public final int frameProcessorDelayTolerance;
    public final int frameProcessorTimeToLive;
    public final int frameProcessorWaitTimeout;

    public XRayDataProviderConfig() {
        this(30000, 70000, 15000);
    }

    public XRayDataProviderConfig(int i, int i2, int i3) {
        this.frameProcessorDelayTolerance = i;
        this.frameProcessorWaitTimeout = i2;
        this.frameProcessorTimeToLive = i3;
    }
}

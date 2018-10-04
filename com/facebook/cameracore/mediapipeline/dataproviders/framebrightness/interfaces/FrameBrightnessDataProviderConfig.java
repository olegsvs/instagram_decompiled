package com.facebook.cameracore.mediapipeline.dataproviders.framebrightness.interfaces;

public final class FrameBrightnessDataProviderConfig {
    public final int frameProcessorDelayTolerance;
    public final int frameProcessorTimeToLive;
    public final int frameProcessorWaitTimeout;

    public FrameBrightnessDataProviderConfig() {
        this(30000, 70000, 15000);
    }

    public FrameBrightnessDataProviderConfig(int i, int i2, int i3) {
        this.frameProcessorDelayTolerance = i;
        this.frameProcessorWaitTimeout = i2;
        this.frameProcessorTimeToLive = i3;
    }
}

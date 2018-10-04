package com.facebook.cameracore.mediapipeline.dataproviders.bodytracker.interfaces;

public class BodyTrackerDataProviderConfig {
    public final int frameProcessorDelayTolerance;
    public final int frameProcessorTimeToLive;
    public final int frameProcessorWaitTimeout;

    public BodyTrackerDataProviderConfig() {
        this(30000, 70000, 15000);
    }

    public BodyTrackerDataProviderConfig(int i, int i2, int i3) {
        this.frameProcessorDelayTolerance = i;
        this.frameProcessorWaitTimeout = i2;
        this.frameProcessorTimeToLive = i3;
    }
}

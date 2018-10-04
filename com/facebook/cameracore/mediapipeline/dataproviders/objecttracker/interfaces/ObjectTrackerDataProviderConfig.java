package com.facebook.cameracore.mediapipeline.dataproviders.objecttracker.interfaces;

public final class ObjectTrackerDataProviderConfig {
    public final int frameProcessorDelayTolerance;
    public final int frameProcessorTimeToLive;
    public final int frameProcessorWaitTimeout;

    public ObjectTrackerDataProviderConfig() {
        this(30000, 70000, 15000);
    }

    public ObjectTrackerDataProviderConfig(int i, int i2, int i3) {
        this.frameProcessorDelayTolerance = i;
        this.frameProcessorWaitTimeout = i2;
        this.frameProcessorTimeToLive = i3;
    }
}

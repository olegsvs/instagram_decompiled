package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces;

public class WorldTrackerDataProviderConfig {
    public final int frameProcessorDelayTolerance;
    public final int frameProcessorTimeToLive;
    public final int frameProcessorWaitTimeout;

    public WorldTrackerDataProviderConfig() {
        this(15000, 35000, 15000);
    }

    public WorldTrackerDataProviderConfig(int i, int i2, int i3) {
        this.frameProcessorDelayTolerance = i;
        this.frameProcessorWaitTimeout = i2;
        this.frameProcessorTimeToLive = i3;
    }
}

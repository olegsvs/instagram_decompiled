package com.facebook.cameracore.mediapipeline.dataproviders.segmentation.interfaces;

public class SegmentationDataProviderConfig {
    public final int frameProcessorDelayTolerance;
    public final int frameProcessorTimeToLive;
    public final int frameProcessorWaitTimeout;

    public SegmentationDataProviderConfig() {
        this(30000, 70000, 15000);
    }

    public SegmentationDataProviderConfig(int i, int i2, int i3) {
        this.frameProcessorDelayTolerance = i;
        this.frameProcessorWaitTimeout = i2;
        this.frameProcessorTimeToLive = i3;
    }
}

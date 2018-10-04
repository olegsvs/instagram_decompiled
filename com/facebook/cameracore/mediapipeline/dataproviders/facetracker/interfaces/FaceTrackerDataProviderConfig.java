package com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces;

public class FaceTrackerDataProviderConfig {
    public final int executionMode;
    public final int frameProcessorDelayTolerance;
    public final int frameProcessorTimeToLive;
    public final int frameProcessorWaitTimeout;
    public final boolean useAmlFaceTracker;
    public final boolean useHalide;
    public final boolean useLazyFaceTracker;
    public final boolean useSynchronousFaceTracker;

    public FaceTrackerDataProviderConfig() {
        this(false, false);
    }

    public FaceTrackerDataProviderConfig(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, int i4) {
        this.frameProcessorDelayTolerance = i;
        this.frameProcessorWaitTimeout = i2;
        this.frameProcessorTimeToLive = i3;
        this.useAmlFaceTracker = z;
        this.useHalide = z2;
        this.useSynchronousFaceTracker = z3;
        this.useLazyFaceTracker = z4;
        this.executionMode = i4;
    }

    public FaceTrackerDataProviderConfig(boolean z, boolean z2) {
        this(30000, 70000, 15000, z, z2, false, false, 0);
    }

    public int getExecutionMode() {
        return this.executionMode;
    }

    public boolean getUseAmlFaceTracker() {
        return this.useAmlFaceTracker;
    }

    public boolean getUseHalide() {
        return this.useHalide;
    }

    public boolean getUseLazyFaceTracker() {
        return this.useLazyFaceTracker;
    }

    public boolean getUseSynchronousFaceTracker() {
        return this.useSynchronousFaceTracker;
    }
}

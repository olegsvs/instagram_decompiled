package com.facebook.cameracore.mediapipeline.sessionrecording.interfaces;

public class SessionRecordingConfig {
    private final String deviceType;
    private final String productName;
    private final boolean recordSnapshotEnabled;
    private final boolean recordingEnabled;
    private final boolean renderingEnabled;
    private final String sessionName;
    private final String storageDirPath;
    private final boolean trackingEnabled;
    private final boolean videoCompressionEnabled;

    public String getDeviceType() {
        return this.deviceType;
    }

    public String getProductName() {
        return this.productName;
    }

    public String getSessionName() {
        return this.sessionName;
    }

    public String getStorageDirPath() {
        return this.storageDirPath;
    }

    public boolean isRecordSnapshotEnabled() {
        return this.recordSnapshotEnabled;
    }

    public boolean isRecordingEnabled() {
        return this.recordingEnabled;
    }

    public boolean isRenderingEnabled() {
        return this.renderingEnabled;
    }

    public boolean isTrackingEnabled() {
        return this.trackingEnabled;
    }

    public boolean isVideoCompressionEnabled() {
        return this.videoCompressionEnabled;
    }
}

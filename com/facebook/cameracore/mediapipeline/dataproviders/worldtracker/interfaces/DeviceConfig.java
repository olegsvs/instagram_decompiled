package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces;

import X.AnonymousClass1sG;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DeviceConfig {
    public static final Boolean DEFAULT_IS_CALIBRATED_DEVICE = Boolean.valueOf(false);
    public static final Boolean DEFAULT_IS_SLAM_CAPABLE = Boolean.valueOf(false);
    public static final Boolean DEFAULT_SKIP_ATTITUDE_INPUT = Boolean.valueOf(false);
    public static final Boolean DEFAULT_USE_VISION_ONLY_SLAM = Boolean.valueOf(false);
    public final double attitudeTimeDelay;
    public final double imuFromLandscapeCameraX;
    public final double imuFromLandscapeCameraY;
    public final double imuFromLandscapeCameraZ;
    public final boolean isCalibratedDeviceConfig;
    public final boolean isSlamCapable;
    private AnonymousClass1sG mCameraConfig;
    public final boolean skipAttitudeInput;
    public final String slamConfigurationParams;
    public final boolean useVisionOnlySlam;

    public DeviceConfig(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, Boolean bool, Boolean bool2, String str, Boolean bool3) {
        double d10 = d7;
        double d11 = d6;
        double d12 = d2;
        double d13 = d;
        Boolean bool4 = bool2;
        Boolean bool5 = bool;
        double d14 = d3;
        double d15 = d4;
        double d16 = d5;
        this(d13, d12, d14, d15, d16, d11, d10, d8, DEFAULT_SKIP_ATTITUDE_INPUT, d9, bool5, bool4, str, bool3);
    }

    public DeviceConfig(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, Boolean bool, double d9, Boolean bool2, Boolean bool3, String str, Boolean bool4) {
        this.mCameraConfig = new AnonymousClass1sG(d, d2, d3, d4, d5);
        this.imuFromLandscapeCameraX = d6;
        this.imuFromLandscapeCameraY = d7;
        this.imuFromLandscapeCameraZ = d8;
        this.skipAttitudeInput = bool.booleanValue();
        this.attitudeTimeDelay = d9;
        this.useVisionOnlySlam = bool2.booleanValue();
        this.isSlamCapable = bool3.booleanValue();
        this.slamConfigurationParams = str;
        this.isCalibratedDeviceConfig = bool4.booleanValue();
    }

    public AnonymousClass1sG getCameraConfig() {
        return this.mCameraConfig;
    }

    public double getCameraDistortion1() {
        return getCameraConfig().f23593B;
    }

    public double getCameraDistortion2() {
        return getCameraConfig().f23594C;
    }

    public double getCameraFocalLength() {
        return getCameraConfig().f23595D;
    }

    public double getCameraPrincipalPointX() {
        return getCameraConfig().f23596E;
    }

    public double getCameraPrincipalPointY() {
        return getCameraConfig().f23597F;
    }

    public static DeviceConfig getDefault() {
        return new DeviceConfig(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 0.8d, 0.5d, 0.5d, -2.221441469079183d, 2.221441469079183d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, DEFAULT_SKIP_ATTITUDE_INPUT, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, DEFAULT_USE_VISION_ONLY_SLAM, DEFAULT_IS_SLAM_CAPABLE, JsonProperty.USE_DEFAULT_NAME, DEFAULT_IS_CALIBRATED_DEVICE);
    }
}

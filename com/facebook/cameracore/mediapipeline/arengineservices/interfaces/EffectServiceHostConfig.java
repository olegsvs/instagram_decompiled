package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import X.AnonymousClass2hv;
import com.facebook.cameracore.mediapipeline.dataproviders.bodytracker.interfaces.BodyTrackerDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.framebrightness.interfaces.FrameBrightnessDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.objecttracker.interfaces.ObjectTrackerDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.segmentation.interfaces.SegmentationDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.xray.interfaces.XRayDataProviderConfig;
import com.facebook.cameracore.mediapipeline.sessionrecording.interfaces.SessionRecordingConfig;

public class EffectServiceHostConfig {
    private final BodyTrackerDataProviderConfig mBodyTrackerDataProviderConfig;
    private final FaceTrackerDataProviderConfig mFaceTrackerDataProviderConfig;
    private final FrameBrightnessDataProviderConfig mFrameBrightnessDataProviderConfig;
    private final ObjectTrackerDataProviderConfig mObjectTrackerDataProviderConfig;
    private final SegmentationDataProviderConfig mSegmentationDataProviderConfig;
    private final SessionRecordingConfig mSessionRecordingConfig;
    private final String mSlamLibraryPath;
    private final WorldTrackerDataProviderConfigWithSlam mWorldTrackerDataProviderConfigWithSlam;
    private final XRayDataProviderConfig mXRayDataProviderConfig;

    public EffectServiceHostConfig(AnonymousClass2hv anonymousClass2hv) {
        this.mBodyTrackerDataProviderConfig = anonymousClass2hv.f32666B;
        this.mFaceTrackerDataProviderConfig = anonymousClass2hv.f32667C;
        this.mFrameBrightnessDataProviderConfig = anonymousClass2hv.f32668D;
        this.mObjectTrackerDataProviderConfig = anonymousClass2hv.f32669E;
        this.mSegmentationDataProviderConfig = anonymousClass2hv.f32670F;
        this.mXRayDataProviderConfig = anonymousClass2hv.f32674J;
        this.mWorldTrackerDataProviderConfigWithSlam = anonymousClass2hv.f32673I;
        this.mSessionRecordingConfig = anonymousClass2hv.f32671G;
        this.mSlamLibraryPath = anonymousClass2hv.f32672H;
    }

    public BodyTrackerDataProviderConfig getBodyTrackerDataProviderConfig() {
        return this.mBodyTrackerDataProviderConfig;
    }

    public FaceTrackerDataProviderConfig getFaceTrackerDataProviderConfig() {
        return this.mFaceTrackerDataProviderConfig;
    }

    public FrameBrightnessDataProviderConfig getFrameBrightnessDataProviderConfig() {
        return this.mFrameBrightnessDataProviderConfig;
    }

    public ObjectTrackerDataProviderConfig getObjectTrackerDataProviderConfig() {
        return this.mObjectTrackerDataProviderConfig;
    }

    public SegmentationDataProviderConfig getSegmentationDataProviderConfig() {
        return this.mSegmentationDataProviderConfig;
    }

    public SessionRecordingConfig getSessionRecordingConfig() {
        return this.mSessionRecordingConfig;
    }

    public String getSlamLibraryPath() {
        return this.mSlamLibraryPath;
    }

    public WorldTrackerDataProviderConfigWithSlam getWorldTrackerDataProviderConfigWithSlam() {
        return this.mWorldTrackerDataProviderConfigWithSlam;
    }

    public XRayDataProviderConfig getXRayDataProviderConfig() {
        return this.mXRayDataProviderConfig;
    }

    public static AnonymousClass2hv newBuilder() {
        return new AnonymousClass2hv();
    }
}

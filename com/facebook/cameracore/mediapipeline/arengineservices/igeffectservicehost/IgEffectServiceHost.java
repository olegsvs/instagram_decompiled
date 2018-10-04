package com.facebook.cameracore.mediapipeline.arengineservices.igeffectservicehost;

import X.AnonymousClass0CF;
import X.AnonymousClass0Jt;
import X.AnonymousClass1QD;
import X.AnonymousClass1QE;
import X.AnonymousClass2hw;
import X.AnonymousClass2hy;
import X.AnonymousClass2i2;
import X.AnonymousClass2kD;
import X.AnonymousClass3rj;
import X.AnonymousClass3s0;
import X.AnonymousClass3s3;
import android.content.Context;
import com.facebook.cameracore.mediapipeline.arclass.common.ARClassSource;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.PluginConfigProvider;
import com.facebook.cameracore.mediapipeline.dataproviders.bodytracker.interfaces.BodyTrackerDataProvider;
import com.facebook.cameracore.mediapipeline.dataproviders.doodling.interfaces.DoodlingDataProvider;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation.FaceTrackerDataProviderImpl;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProvider;
import com.facebook.cameracore.mediapipeline.dataproviders.framebrightness.interfaces.FrameBrightnessDataProvider;
import com.facebook.cameracore.mediapipeline.dataproviders.handtracking.interfaces.HandTrackingDataProvider;
import com.facebook.cameracore.mediapipeline.dataproviders.objecttracker.interfaces.ObjectTrackerDataProvider;
import com.facebook.cameracore.mediapipeline.dataproviders.segmentation.implementation.SegmentationDataProviderImpl;
import com.facebook.cameracore.mediapipeline.dataproviders.segmentation.interfaces.SegmentationDataProvider;
import com.facebook.cameracore.mediapipeline.dataproviders.volume.interfaces.VolumeDataProvider;
import com.facebook.cameracore.mediapipeline.dataproviders.xray.interfaces.XRayDataProvider;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.mediapipeline.services.date.interfaces.DateService;
import com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl;
import com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig;
import com.facebook.cameracore.mediapipeline.services.location.interfaces.LocationService;
import com.facebook.cameracore.mediapipeline.services.networking.implementation.HTTPClientServiceImpl;
import com.facebook.cameracore.mediapipeline.services.networking.implementation.NetworkClientImpl;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.HTTPClientService;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkClient;
import com.facebook.cameracore.mediapipeline.services.targetrecognition.implementation.TargetRecognitionServiceImpl;
import com.facebook.cameracore.mediapipeline.services.targetrecognition.interfaces.TargetRecognitionService;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.TouchServiceImpl;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchService;
import com.facebook.jni.HybridData;

public class IgEffectServiceHost extends EffectServiceHost {
    private ARClassSource mARClassSource;
    private ARExperimentConfig mARExperimentConfig;
    private AnalyticsLogger mAnalyticsLogger;
    private FaceTrackerDataProvider mFaceTrackerDataProvider;
    private final AnonymousClass2i2 mFaceTrackerDataProviderHolder = new AnonymousClass2i2();
    private HTTPClientService mHTTPClientService;
    private NetworkClient mNetworkClient;
    private SegmentationDataProvider mSegmentationDataProvider;
    private TargetRecognitionService mTargetRecognitionService;
    private AnonymousClass2kD mTouchInput;
    private TouchService mTouchService;

    private native HybridData initHybrid(EffectServiceHostConfig effectServiceHostConfig, AnalyticsLogger analyticsLogger, ARExperimentConfig aRExperimentConfig, ARClassSource aRClassSource);

    public final BodyTrackerDataProvider createBodyTrackerDataProvider() {
        return null;
    }

    public DateService createDateService() {
        return null;
    }

    public DoodlingDataProvider createDoodlingDataProvider() {
        return null;
    }

    public final FrameBrightnessDataProvider createFrameBrightnessDataProvider() {
        return null;
    }

    public final HandTrackingDataProvider createHandTrackingDataProvider() {
        return null;
    }

    public LocationService createLocationService() {
        return null;
    }

    public final ObjectTrackerDataProvider createObjectTrackerDataProvider() {
        return null;
    }

    public VolumeDataProvider createVolumeDataProvider() {
        return null;
    }

    public final XRayDataProvider createXRayDataProvider() {
        return null;
    }

    public void destroyBodyTrackerDataProvider() {
    }

    public void destroyDateService() {
    }

    public void destroyDoodlingDataProvider() {
    }

    public void destroyFrameBrightnessDataProvider() {
    }

    public final void destroyHandTrackingDataProvider() {
    }

    public void destroyLocationService() {
    }

    public void destroyObjectTrackerDataProvider() {
    }

    public void destroyVolumeDataProvider() {
    }

    public void destroyXRayDataProvider() {
    }

    public DateService getDateService() {
        return null;
    }

    public DoodlingDataProvider getDoodlingDataProvider() {
        return null;
    }

    public LocationService getLocationService() {
        return null;
    }

    static {
        AnonymousClass0CF.E("graphicsengine-arengineservices-igeffectservicehost-native");
    }

    public IgEffectServiceHost(Context context, EffectServiceHostConfig effectServiceHostConfig, AnonymousClass1QE anonymousClass1QE) {
        super(context, effectServiceHostConfig);
        AnalyticsLogger analyticsLoggerImpl = new AnalyticsLoggerImpl(new AnonymousClass1QD(), AnonymousClass0Jt.f2948B);
        this.mAnalyticsLogger = analyticsLoggerImpl;
        analyticsLoggerImpl.setSessionListener(anonymousClass1QE);
        this.mARExperimentConfig = new ARExperimentConfigImpl(new AnonymousClass3s0());
        this.mARClassSource = new ARClassSource(null, null, null);
        this.mHybridData = initHybrid(effectServiceHostConfig, this.mAnalyticsLogger, this.mARExperimentConfig, this.mARClassSource);
        this.mNetworkClient = new NetworkClientImpl(new AnonymousClass3s3());
    }

    public FaceTrackerDataProvider createFaceTrackerDataProvider() {
        if (this.mFaceTrackerDataProvider == null) {
            this.mFaceTrackerDataProvider = this.mFaceTrackerDataProviderHolder.f32743B;
        }
        if (this.mFaceTrackerDataProvider == null) {
            this.mFaceTrackerDataProvider = new FaceTrackerDataProviderImpl();
            this.mFaceTrackerDataProviderHolder.f32743B = this.mFaceTrackerDataProvider;
        }
        return this.mFaceTrackerDataProvider;
    }

    public HTTPClientService createHTTPClientService() {
        if (this.mHTTPClientService == null) {
            this.mHTTPClientService = new HTTPClientServiceImpl(this.mNetworkClient);
        }
        return this.mHTTPClientService;
    }

    public final SegmentationDataProvider createSegmentationDataProvider() {
        if (this.mSegmentationDataProvider == null) {
            this.mSegmentationDataProvider = new SegmentationDataProviderImpl();
        }
        return this.mSegmentationDataProvider;
    }

    public final AnonymousClass2hw createServiceConfigurationBuilder(AnonymousClass2hy anonymousClass2hy) {
        return new AnonymousClass3rj(anonymousClass2hy);
    }

    public TargetRecognitionService createTargetRecognitionService() {
        if (this.mTargetRecognitionService == null) {
            this.mTargetRecognitionService = new TargetRecognitionServiceImpl();
        }
        return this.mTargetRecognitionService;
    }

    public final TouchService createTouchService() {
        if (this.mTouchService == null) {
            this.mTouchService = new TouchServiceImpl();
            AnonymousClass2kD anonymousClass2kD = this.mTouchInput;
            if (anonymousClass2kD != null) {
                anonymousClass2kD.m17010B(this.mTouchService.getGestureProcessor());
            }
        }
        return this.mTouchService;
    }

    public final void destroy() {
        super.destroy();
        this.mFaceTrackerDataProviderHolder.f32743B = null;
        this.mARExperimentConfig.release();
        AnalyticsLogger analyticsLogger = this.mAnalyticsLogger;
        if (analyticsLogger != null) {
            analyticsLogger.release();
        }
        this.mAnalyticsLogger = null;
        NetworkClient networkClient = this.mNetworkClient;
        if (networkClient != null) {
            networkClient.release();
        }
        this.mNetworkClient = null;
    }

    public void destroyFaceTrackerDataProvider() {
        this.mFaceTrackerDataProvider = null;
    }

    public void destroyHTTPClientService() {
        this.mHTTPClientService = null;
    }

    public void destroySegmentationDataProvider() {
        this.mSegmentationDataProvider = null;
    }

    public void destroyTargetRecognitionService() {
        this.mTargetRecognitionService = null;
    }

    public void destroyTouchService() {
        AnonymousClass2kD anonymousClass2kD = this.mTouchInput;
        if (anonymousClass2kD != null) {
            anonymousClass2kD.m17010B(null);
        }
        this.mTouchService = null;
    }

    public final AnalyticsLogger getAnalyticsLogger() {
        return this.mAnalyticsLogger;
    }

    public final PluginConfigProvider getEnginePluginConfigProvider() {
        return new IgPluginConfigProvider();
    }

    public final FaceTrackerDataProvider getFaceTrackerDataProvider() {
        return this.mFaceTrackerDataProvider;
    }

    public final SegmentationDataProvider getSegmentationDataProvider() {
        return this.mSegmentationDataProvider;
    }

    public final TouchService getTouchService() {
        return this.mTouchService;
    }

    public final void setTouchInput(AnonymousClass2kD anonymousClass2kD) {
        this.mTouchInput = anonymousClass2kD;
        TouchService touchService = this.mTouchService;
        if (touchService != null) {
            this.mTouchInput.m17010B(touchService.getGestureProcessor());
        }
    }
}

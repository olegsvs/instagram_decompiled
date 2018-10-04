package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import X.AnonymousClass1rZ;
import X.AnonymousClass1ra;
import X.AnonymousClass2Q5;
import X.AnonymousClass2hs;
import X.AnonymousClass2ht;
import X.AnonymousClass2hu;
import X.AnonymousClass2hw;
import X.AnonymousClass2hy;
import X.AnonymousClass2kD;
import X.AnonymousClass2kF;
import android.content.Context;
import com.facebook.cameracore.mediapipeline.dataproviders.bodytracker.interfaces.BodyTrackerDataProvider;
import com.facebook.cameracore.mediapipeline.dataproviders.doodling.interfaces.DoodlingDataProvider;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProvider;
import com.facebook.cameracore.mediapipeline.dataproviders.framebrightness.interfaces.FrameBrightnessDataProvider;
import com.facebook.cameracore.mediapipeline.dataproviders.handtracking.interfaces.HandTrackingDataProvider;
import com.facebook.cameracore.mediapipeline.dataproviders.objecttracker.interfaces.ObjectTrackerDataProvider;
import com.facebook.cameracore.mediapipeline.dataproviders.segmentation.interfaces.SegmentationDataProvider;
import com.facebook.cameracore.mediapipeline.dataproviders.volume.interfaces.VolumeDataProvider;
import com.facebook.cameracore.mediapipeline.dataproviders.xray.interfaces.XRayDataProvider;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.mediapipeline.services.audioclassic.implementation.AudioServiceImpl;
import com.facebook.cameracore.mediapipeline.services.audioclassic.interfaces.AudioService;
import com.facebook.cameracore.mediapipeline.services.audiograph.implementation.AudioPlatformComponentHostImpl;
import com.facebook.cameracore.mediapipeline.services.audiograph.interfaces.AudioPlatformComponentHost;
import com.facebook.cameracore.mediapipeline.services.date.interfaces.DateService;
import com.facebook.cameracore.mediapipeline.services.location.interfaces.LocationService;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.HTTPClientService;
import com.facebook.cameracore.mediapipeline.services.targetrecognition.interfaces.TargetRecognitionService;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchService;
import com.facebook.cameracore.util.Reference;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public abstract class EffectServiceHost {
    private EffectAttribution mAttribution;
    public AudioService mAudioClassicService;
    public AudioPlatformComponentHost mAudioPlatformComponentHost;
    public final Context mContext;
    private EffectManifest mEffectManifest;
    private final EffectServiceHostConfig mEffectServiceHostConfig;
    public HybridData mHybridData;
    private String mProductSessionId;
    private AnonymousClass2hw mServiceConfigurationHybridBuilder;

    private native int nativeGetFrameFormat();

    private native void nativeSetCameraSensorRotation(int i);

    private native void nativeSetCurrentOptimizationMode(int i);

    private native void nativeUpdateFrame(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, long j, Reference reference);

    private native void nativeUpdateFrame(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, byte[] bArr, long j, Reference reference);

    public native void cleanupServices();

    public abstract BodyTrackerDataProvider createBodyTrackerDataProvider();

    public abstract DateService createDateService();

    public abstract DoodlingDataProvider createDoodlingDataProvider();

    public abstract FaceTrackerDataProvider createFaceTrackerDataProvider();

    public abstract FrameBrightnessDataProvider createFrameBrightnessDataProvider();

    public abstract HTTPClientService createHTTPClientService();

    public abstract HandTrackingDataProvider createHandTrackingDataProvider();

    public abstract LocationService createLocationService();

    public abstract ObjectTrackerDataProvider createObjectTrackerDataProvider();

    public abstract SegmentationDataProvider createSegmentationDataProvider();

    public abstract AnonymousClass2hw createServiceConfigurationBuilder(AnonymousClass2hy anonymousClass2hy);

    public abstract TargetRecognitionService createTargetRecognitionService();

    public abstract TouchService createTouchService();

    public abstract VolumeDataProvider createVolumeDataProvider();

    public abstract XRayDataProvider createXRayDataProvider();

    public abstract void destroyBodyTrackerDataProvider();

    public abstract void destroyDateService();

    public abstract void destroyDoodlingDataProvider();

    public abstract void destroyFaceTrackerDataProvider();

    public abstract void destroyFrameBrightnessDataProvider();

    public abstract void destroyHTTPClientService();

    public abstract void destroyHandTrackingDataProvider();

    public abstract void destroyLocationService();

    public abstract void destroyObjectTrackerDataProvider();

    public abstract void destroySegmentationDataProvider();

    public abstract void destroyTargetRecognitionService();

    public abstract void destroyTouchService();

    public abstract void destroyVolumeDataProvider();

    public abstract void destroyXRayDataProvider();

    public abstract AnalyticsLogger getAnalyticsLogger();

    public abstract PluginConfigProvider getEnginePluginConfigProvider();

    public abstract FaceTrackerDataProvider getFaceTrackerDataProvider();

    public abstract SegmentationDataProvider getSegmentationDataProvider();

    public abstract TouchService getTouchService();

    public native boolean isFrameDataNeeded();

    public native boolean isPreviewCaptureOutputSupported();

    public native void resetServices();

    public abstract void setTouchInput(AnonymousClass2kD anonymousClass2kD);

    public native void stopEffect();

    public EffectServiceHost(Context context, EffectServiceHostConfig effectServiceHostConfig) {
        this.mContext = context;
        this.mEffectServiceHostConfig = effectServiceHostConfig;
    }

    public AudioService createAudioClassicService(boolean z, boolean z2) {
        if (this.mAudioClassicService == null) {
            this.mAudioClassicService = new AudioServiceImpl(this.mContext, z, z2);
        }
        this.mAudioClassicService.reset();
        return this.mAudioClassicService;
    }

    public AudioPlatformComponentHost createAudioPlatformComponentHost() {
        if (this.mAudioPlatformComponentHost == null) {
            this.mAudioPlatformComponentHost = new AudioPlatformComponentHostImpl(this.mContext);
        }
        return this.mAudioPlatformComponentHost;
    }

    public final List createServiceConfigurations(AnonymousClass2hy anonymousClass2hy) {
        destroyServiceConfigurations();
        AnonymousClass2hw createServiceConfigurationBuilder = createServiceConfigurationBuilder(anonymousClass2hy);
        this.mServiceConfigurationHybridBuilder = createServiceConfigurationBuilder;
        return createServiceConfigurationBuilder.f32675B;
    }

    public void destroy() {
        this.mHybridData.resetNative();
        destroyServiceConfigurations();
    }

    public void destroyAudioClassicService() {
        AudioService audioService = this.mAudioClassicService;
        if (audioService != null) {
            audioService.release();
        }
        this.mAudioClassicService = null;
    }

    public void destroyAudioPlatformComponentHost() {
        AudioPlatformComponentHost audioPlatformComponentHost = this.mAudioPlatformComponentHost;
        if (audioPlatformComponentHost != null) {
            audioPlatformComponentHost.release();
        }
        this.mAudioPlatformComponentHost = null;
    }

    public final void destroyServiceConfigurations() {
        AnonymousClass2hw anonymousClass2hw = this.mServiceConfigurationHybridBuilder;
        if (anonymousClass2hw != null) {
            for (ServiceConfiguration destroy : anonymousClass2hw.f32675B) {
                destroy.destroy();
            }
        }
    }

    public final AudioService getAudioClassicService() {
        return this.mAudioClassicService;
    }

    public final AudioPlatformComponentHost getAudioPlatformComponentHost() {
        return this.mAudioPlatformComponentHost;
    }

    public final EffectServiceHostConfig getEffectServiceHostConfig() {
        return this.mEffectServiceHostConfig;
    }

    public final AnonymousClass2ht getFrameFormatForPostProcessing() {
        int nativeGetFrameFormat = nativeGetFrameFormat();
        switch (nativeGetFrameFormat) {
            case 0:
                return AnonymousClass2ht.NONE;
            case 1:
                return AnonymousClass2ht.YUV;
            case 2:
                return AnonymousClass2ht.Y;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Received incorrect value: ");
                stringBuilder.append(nativeGetFrameFormat);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final EffectManifest getManifest() {
        return this.mEffectManifest;
    }

    public final String getProductSessionId() {
        return this.mProductSessionId;
    }

    public static ScheduledExecutorService newSingleBackgroundThreadScheduledExecutor(String str) {
        return Executors.newSingleThreadScheduledExecutor(new AnonymousClass2hs(str));
    }

    public void setAttribution(EffectAttribution effectAttribution) {
        this.mAttribution = effectAttribution;
    }

    public final void setCameraSensorRotation(int i) {
        nativeSetCameraSensorRotation(i);
    }

    public final void setCurrentOptimizationMode(AnonymousClass2hu anonymousClass2hu) {
        nativeSetCurrentOptimizationMode(anonymousClass2hu.m16966A());
    }

    public void setManifest(EffectManifest effectManifest) {
        this.mEffectManifest = effectManifest;
        TouchService touchService = getTouchService();
        if (touchService != null) {
            touchService.setTouchConfig(new AnonymousClass2kF(effectManifest.supportsTapGesture, effectManifest.supportsPanGesture, effectManifest.supportsPinchGesture, effectManifest.supportsRotateGesture, effectManifest.supportsLongPressGesture, effectManifest.supportsRawTouchGesture));
        }
    }

    public final void setProductSessionId(String str) {
        if (str != null) {
            this.mProductSessionId = str;
        }
    }

    public final void updateFrame(AnonymousClass2Q5 anonymousClass2Q5, int i, int i2, int i3, boolean z) {
        AnonymousClass1ra anonymousClass1ra = (AnonymousClass1ra) anonymousClass2Q5.get();
        AnonymousClass1rZ[] YP = anonymousClass1ra.YP();
        EffectServiceHost effectServiceHost = this;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        boolean z2 = z;
        if (anonymousClass1ra.uK() != null) {
            nativeUpdateFrame(i4, i5, i4, 0, i4, 0, i4, 0, i6, z2, anonymousClass1ra.VP(), anonymousClass1ra.uK(), anonymousClass1ra.AT(), anonymousClass2Q5.m15651A());
        } else if (YP != null && YP.length > 0) {
            int BR;
            int WP;
            int BR2;
            int WP2;
            int BR3 = YP[0].BR() != 0 ? YP[0].BR() : i4;
            int WP3 = YP[0].WP();
            if (YP.length > 1) {
                BR = YP[1].BR() != 0 ? YP[1].BR() : i4;
                WP = YP[1].WP();
            } else {
                BR = i4;
                WP = 0;
            }
            if (YP.length > 2) {
                BR2 = YP[2].BR() != 0 ? YP[2].BR() : i4;
                WP2 = YP[2].WP();
            } else {
                BR2 = i4;
                WP2 = 0;
            }
            int VP = anonymousClass1ra.VP();
            ByteBuffer tK = YP[0].tK();
            ByteBuffer byteBuffer = null;
            ByteBuffer tK2 = YP.length > 1 ? YP[1].tK() : null;
            if (YP.length > 2) {
                byteBuffer = YP[2].tK();
            }
            nativeUpdateFrame(i4, i5, BR3, WP3, BR, WP, BR2, WP2, i6, z2, VP, tK, tK2, byteBuffer, anonymousClass1ra.AT(), anonymousClass2Q5.m15651A());
        }
    }
}

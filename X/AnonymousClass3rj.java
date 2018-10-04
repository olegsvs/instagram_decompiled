package X;

import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation.FaceTrackerDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation.MotionDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation.PlatformEventsDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.dataproviders.segmentation.implementation.SegmentationDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation.WorldTrackerDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.cameracontrol.implementation.CameraControlServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.captureevent.implementation.CaptureEventServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.externalasset.implementation.ExternalAssetProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.instruction.implementation.InstructionServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.persistence.implementation.PersistenceServiceConfigurationHybrid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3rj */
public final class AnonymousClass3rj extends AnonymousClass2hw {
    public AnonymousClass3rj(AnonymousClass2hy anonymousClass2hy) {
        super(anonymousClass2hy);
    }

    /* renamed from: A */
    public final List mo3907A(AnonymousClass2hy anonymousClass2hy) {
        List arrayList = new ArrayList();
        if (anonymousClass2hy != null) {
            if (anonymousClass2hy.f32707B != null) {
                arrayList.add(new ExternalAssetProviderConfigurationHybrid(anonymousClass2hy.f32707B));
            }
            if (anonymousClass2hy.f32709D != null) {
                arrayList.add(new CameraControlServiceConfigurationHybrid(anonymousClass2hy.f32709D));
            }
            if (anonymousClass2hy.f32711F != null) {
                arrayList.add(new CaptureEventServiceConfigurationHybrid(anonymousClass2hy.f32711F));
            }
            if (anonymousClass2hy.f32715J != null) {
                arrayList.add(new FaceTrackerDataProviderConfigurationHybrid(anonymousClass2hy.f32715J));
            }
            if (anonymousClass2hy.f32718M != null) {
                arrayList.add(new InstructionServiceConfigurationHybrid(anonymousClass2hy.f32718M));
            }
            if (anonymousClass2hy.f32722Q != null) {
                arrayList.add(new MotionDataProviderConfigurationHybrid(anonymousClass2hy.f32722Q));
            }
            if (anonymousClass2hy.f32731Z != null) {
                arrayList.add(new SegmentationDataProviderConfigurationHybrid(anonymousClass2hy.f32731Z));
            }
            if (anonymousClass2hy.f32736e != null) {
                arrayList.add(new WorldTrackerDataProviderConfigurationHybrid(anonymousClass2hy.f32736e));
            }
            if (anonymousClass2hy.f32729X != null) {
                arrayList.add(new PlatformEventsDataProviderConfigurationHybrid(anonymousClass2hy.f32729X));
            }
            if (anonymousClass2hy.f32728W != null) {
                arrayList.add(new PersistenceServiceConfigurationHybrid(anonymousClass2hy.f32728W));
            }
        }
        return arrayList;
    }
}

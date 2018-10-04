package X;

import com.facebook.cameracore.assets.modelcache.segmentation.SegmentationModelCache;

/* renamed from: X.433 */
public abstract class AnonymousClass433 extends AnonymousClass3rc {
    public AnonymousClass433(AnonymousClass2hN anonymousClass2hN, AnonymousClass0G4 anonymousClass0G4, AnonymousClass3xY anonymousClass3xY, AnonymousClass3xT anonymousClass3xT) {
        super(anonymousClass2hN, anonymousClass0G4, anonymousClass3xY, anonymousClass3xT);
    }

    /* renamed from: B */
    public final String mo5116B(AnonymousClass2gu anonymousClass2gu) {
        SegmentationModelCache segmentationModelCache = (SegmentationModelCache) m20953C();
        if (segmentationModelCache == null) {
            return null;
        }
        if (AnonymousClass1vn.f24281E[0].equals(anonymousClass2gu.f32459E)) {
            return segmentationModelCache.getInitNetPath(anonymousClass2gu.m16908A());
        }
        if (AnonymousClass1vn.f24281E[1].equals(anonymousClass2gu.f32459E)) {
            return segmentationModelCache.getPredictNetPath(anonymousClass2gu.m16908A());
        }
        AnonymousClass0Dc.V("SegmentationSingleCacheAssetStorageAdapter", "Unknown asset: %s", new Object[]{anonymousClass2gu.f32459E});
        return null;
    }

    /* renamed from: D */
    public final int mo5117D() {
        return ((Integer) AnonymousClass0CC.lc.G()).intValue();
    }
}

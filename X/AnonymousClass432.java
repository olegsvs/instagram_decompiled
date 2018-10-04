package X;

import com.facebook.cameracore.assets.modelcache.facetracker.FacetrackerModelCache;

/* renamed from: X.432 */
public abstract class AnonymousClass432 extends AnonymousClass3rc {
    public AnonymousClass432(AnonymousClass2hN anonymousClass2hN, AnonymousClass0G4 anonymousClass0G4, AnonymousClass3xY anonymousClass3xY, AnonymousClass3xT anonymousClass3xT) {
        super(anonymousClass2hN, anonymousClass0G4, anonymousClass3xY, anonymousClass3xT);
    }

    /* renamed from: B */
    public final String mo5116B(AnonymousClass2gu anonymousClass2gu) {
        FacetrackerModelCache facetrackerModelCache = (FacetrackerModelCache) m20953C();
        if (facetrackerModelCache == null) {
            return null;
        }
        if (AnonymousClass1vn.f24278B[0].equals(anonymousClass2gu.f32459E)) {
            return facetrackerModelCache.getFaceDetectPath(anonymousClass2gu.m16908A());
        }
        if (AnonymousClass1vn.f24278B[1].equals(anonymousClass2gu.f32459E)) {
            return facetrackerModelCache.getFaceAlignPath(anonymousClass2gu.m16908A());
        }
        if (AnonymousClass1vn.f24278B[2].equals(anonymousClass2gu.f32459E)) {
            return facetrackerModelCache.getFaceContourPath(anonymousClass2gu.m16908A());
        }
        if (AnonymousClass1vn.f24278B[3].equals(anonymousClass2gu.f32459E)) {
            return facetrackerModelCache.getMeshPath(anonymousClass2gu.m16908A());
        }
        AnonymousClass0Dc.V("FacetrackerSingleCacheAssetStorageAdapter", "Unknown asset: %s", new Object[]{anonymousClass2gu.f32459E});
        return null;
    }

    /* renamed from: D */
    public final int mo5117D() {
        return ((Integer) AnonymousClass0CC.fD.G()).intValue();
    }
}

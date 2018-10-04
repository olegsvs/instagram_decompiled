package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;

/* renamed from: X.2mG */
public final class AnonymousClass2mG {
    /* renamed from: B */
    public int f33861B;
    /* renamed from: C */
    public final AnonymousClass2mI f33862C;
    /* renamed from: D */
    public boolean f33863D;
    /* renamed from: E */
    public int f33864E;
    /* renamed from: F */
    public int f33865F;
    /* renamed from: G */
    public int f33866G;

    public AnonymousClass2mG(AnonymousClass2mI anonymousClass2mI) {
        this.f33862C = anonymousClass2mI;
    }

    /* renamed from: A */
    public final boolean m17158A() {
        Object obj = this.f33862C.m17162A().getFaceTrackerDataProvider() != null ? 1 : null;
        Object obj2 = this.f33862C.m17162A().getSegmentationDataProvider() != null ? 1 : null;
        if (!(obj == null && obj2 == null)) {
            if (obj == null || this.f33862C.m17162A().getFaceTrackerDataProvider().isFaceTrackerReady()) {
                if (obj2 == null || this.f33862C.m17162A().getSegmentationDataProvider().isReady()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: B */
    public final void m17159B(int i, int i2, int i3, boolean z) {
        this.f33865F = i;
        this.f33864E = i2;
        this.f33861B = i3;
        this.f33863D = z;
        this.f33866G = i;
        AnonymousClass2mI anonymousClass2mI = this.f33862C;
        AnonymousClass2mI.m17161B(anonymousClass2mI).setupImageSourceFacet(this.f33865F, this.f33864E, this.f33866G, this.f33861B, this.f33863D);
    }

    /* renamed from: C */
    public final void m17160C(AnonymousClass2Q5 anonymousClass2Q5) {
        EffectServiceHost A = this.f33862C.m17162A();
        AnonymousClass2Q5 anonymousClass2Q52 = anonymousClass2Q5;
        if (anonymousClass2Q5 != null) {
            if (A.isFrameDataNeeded()) {
                this.f33862C.m17162A().updateFrame(anonymousClass2Q52, this.f33865F, this.f33864E, this.f33861B, this.f33863D);
            }
        }
    }
}

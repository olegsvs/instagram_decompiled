package X;

/* renamed from: X.2hG */
public enum AnonymousClass2hG {
    ARVersionedCapabilitiesFacetracker("faceTracker"),
    ARVersionedCapabilitiesSegmentation("segmentation"),
    ARVersionedCapabilitiesBodytracker("bodyTracker"),
    ARVersionedCapabilitiesHandtracker("handTracker"),
    ARVersionedCapabilitiesTargetRecognition("targetRecognition"),
    ARVersionedCapabilitiesXRay("xRay");
    
    /* renamed from: J */
    private static final String f32538J = null;
    /* renamed from: B */
    private final String f32539B;

    static {
        f32538J = "ARModelMetadataRequest$ARVersionedCapabilities";
    }

    private AnonymousClass2hG(String str) {
        this.f32539B = str;
    }

    /* renamed from: A */
    public final String m16921A() {
        return this.f32539B;
    }

    /* renamed from: B */
    public static AnonymousClass2hG m16920B(String str) {
        for (AnonymousClass2hG anonymousClass2hG : AnonymousClass2hG.values()) {
            if (anonymousClass2hG.f32539B.equals(str)) {
                return anonymousClass2hG;
            }
        }
        AnonymousClass0Dc.V(f32538J, "Unsupported capability: ", new Object[]{str});
        return null;
    }
}

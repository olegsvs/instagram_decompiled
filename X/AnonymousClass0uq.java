package X;

/* renamed from: X.0uq */
public final class AnonymousClass0uq extends AnonymousClass0ur {
    /* renamed from: B */
    private final AnonymousClass0G4 f11932B;
    /* renamed from: C */
    private final AnonymousClass0G4 f11933C;

    public AnonymousClass0uq(AnonymousClass0G4 anonymousClass0G4, AnonymousClass0G4 anonymousClass0G42, AnonymousClass0PZ anonymousClass0PZ, String str) {
        super(anonymousClass0PZ, str);
        this.f11932B = anonymousClass0G4;
        this.f11933C = anonymousClass0G42;
    }

    /* renamed from: A */
    public final void mo1952A(AnonymousClass0NN anonymousClass0NN) {
        if ("video_should_start".equals(anonymousClass0NN.f3556F)) {
            anonymousClass0NN.m3298F("trigger", (String) this.f11933C.get());
        }
        AnonymousClass0vM anonymousClass0vM = (AnonymousClass0vM) this.f11932B.get();
        if (anonymousClass0vM != null) {
            anonymousClass0NN.m3294B("carousel_index", anonymousClass0vM.f12053C);
            anonymousClass0NN.m3294B("carousel_size", anonymousClass0vM.f12057G);
            anonymousClass0NN.m3294B("carousel_m_t", anonymousClass0vM.f12056F);
            anonymousClass0NN.m3298F("carousel_media_id", anonymousClass0vM.f12055E);
            anonymousClass0NN.m3298F("carousel_cover_media_id", anonymousClass0vM.f12052B);
            if (anonymousClass0vM.f12054D) {
                anonymousClass0NN.m3294B("is_dash_eligible", 1);
                anonymousClass0NN.m3298F("playback_format", "dash");
            }
        }
    }
}

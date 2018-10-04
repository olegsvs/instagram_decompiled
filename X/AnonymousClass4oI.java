package X;

/* renamed from: X.4oI */
public final class AnonymousClass4oI extends AnonymousClass0ur {
    /* renamed from: B */
    private final AnonymousClass0G4 f57522B;

    public AnonymousClass4oI(AnonymousClass0G4 anonymousClass0G4, AnonymousClass0PZ anonymousClass0PZ, String str) {
        super(anonymousClass0PZ, str);
        this.f57522B = anonymousClass0G4;
    }

    /* renamed from: A */
    public final void m25115A(AnonymousClass0NN anonymousClass0NN) {
        AnonymousClass1Xl anonymousClass1Xl = (AnonymousClass1Xl) this.f57522B.get();
        if (anonymousClass1Xl != null) {
            anonymousClass0NN.F("channel_id", anonymousClass1Xl.f19864B);
            anonymousClass0NN.F("channel_type", anonymousClass1Xl.f19866D);
            if (anonymousClass1Xl.f19865C != null) {
                anonymousClass0NN.F("channel_session_id", anonymousClass1Xl.f19865C);
            }
        }
    }
}

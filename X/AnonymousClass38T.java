package X;

/* renamed from: X.38T */
public final class AnonymousClass38T implements AnonymousClass2HV {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass44c f38231B;

    public AnonymousClass38T(AnonymousClass44c anonymousClass44c) {
        this.f38231B = anonymousClass44c;
    }

    public final void zu(AnonymousClass14H anonymousClass14H, float f) {
        switch (AnonymousClass38Z.f38240B[this.f38231B.f49452D.ordinal()]) {
            case 1:
                if (!this.f38231B.f49463O) {
                    this.f38231B.f49471W.setBackgroundColor(((int) (f * 256.0f)) << 24);
                    return;
                }
                return;
            case 2:
                if (!this.f38231B.f49463O) {
                    this.f38231B.f49471W.setBackgroundColor(((int) ((1.0f - f) * 256.0f)) << 24);
                    return;
                }
                return;
            default:
                return;
        }
    }
}

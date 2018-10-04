package X;

/* renamed from: X.29H */
public final class AnonymousClass29H implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2eY f26690B;

    public AnonymousClass29H(AnonymousClass2eY anonymousClass2eY) {
        this.f26690B = anonymousClass2eY;
    }

    public final void run() {
        AnonymousClass2eY anonymousClass2eY = this.f26690B;
        if (anonymousClass2eY.f31991L == AnonymousClass29J.LOADED_HIGH_RESOLUTION) {
            AnonymousClass2eY.m16756C(anonymousClass2eY, anonymousClass2eY.f31989J);
            anonymousClass2eY.invalidateSelf();
        }
    }
}

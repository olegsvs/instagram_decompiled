package X;

/* renamed from: X.3If */
public final class AnonymousClass3If implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3Ig f39960B;
    /* renamed from: C */
    public final /* synthetic */ String f39961C;

    public AnonymousClass3If(AnonymousClass3Ig anonymousClass3Ig, String str) {
        this.f39960B = anonymousClass3Ig;
        this.f39961C = str;
    }

    public final void run() {
        AnonymousClass4Iq anonymousClass4Iq = (AnonymousClass4Iq) this.f39960B.f39964D.get();
        if (anonymousClass4Iq != null) {
            anonymousClass4Iq.m23794b(this.f39961C);
        }
    }
}

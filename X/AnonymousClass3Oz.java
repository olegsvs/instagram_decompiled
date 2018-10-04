package X;

/* renamed from: X.3Oz */
public final class AnonymousClass3Oz implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass40V f40802B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0G4 f40803C;

    public AnonymousClass3Oz(AnonymousClass40V anonymousClass40V, AnonymousClass0G4 anonymousClass0G4) {
        this.f40802B = anonymousClass40V;
        this.f40803C = anonymousClass0G4;
    }

    public final void run() {
        this.f40802B.f48279F = (AnonymousClass2Vh) this.f40803C.get();
        AnonymousClass40V anonymousClass40V = this.f40802B;
        AnonymousClass1ut anonymousClass1ut = new AnonymousClass1ut();
        anonymousClass1ut.f24082G = this.f40802B.f48279F.getTextureId();
        anonymousClass1ut.f24084I = 3553;
        anonymousClass40V.f48280G = anonymousClass1ut.m13709A();
    }
}

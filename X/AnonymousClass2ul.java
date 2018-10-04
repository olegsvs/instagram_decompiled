package X;

/* renamed from: X.2ul */
public final class AnonymousClass2ul implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2uq f35679B;
    /* renamed from: C */
    public final /* synthetic */ String f35680C;
    /* renamed from: D */
    public final /* synthetic */ long f35681D;
    /* renamed from: E */
    public final /* synthetic */ long f35682E;

    public AnonymousClass2ul(AnonymousClass2uq anonymousClass2uq, String str, long j, long j2) {
        this.f35679B = anonymousClass2uq;
        this.f35680C = str;
        this.f35682E = j;
        this.f35681D = j2;
    }

    public final void run() {
        this.f35679B.f35694C.onAudioDecoderInitialized(this.f35680C, this.f35682E, this.f35681D);
    }
}

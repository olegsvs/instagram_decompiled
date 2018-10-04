package X;

/* renamed from: X.2un */
public final class AnonymousClass2un implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2uq f35685B;
    /* renamed from: C */
    public final /* synthetic */ int f35686C;
    /* renamed from: D */
    public final /* synthetic */ long f35687D;
    /* renamed from: E */
    public final /* synthetic */ long f35688E;

    public AnonymousClass2un(AnonymousClass2uq anonymousClass2uq, int i, long j, long j2) {
        this.f35685B = anonymousClass2uq;
        this.f35686C = i;
        this.f35687D = j;
        this.f35688E = j2;
    }

    public final void run() {
        this.f35685B.f35694C.onAudioSinkUnderrun(this.f35686C, this.f35687D, this.f35688E);
    }
}

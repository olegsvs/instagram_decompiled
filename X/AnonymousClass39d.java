package X;

/* renamed from: X.39d */
public final class AnonymousClass39d implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass39f f38429B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass45p f38430C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass3AB f38431D;
    /* renamed from: E */
    public final /* synthetic */ String f38432E;
    /* renamed from: F */
    public final /* synthetic */ int f38433F;

    public AnonymousClass39d(AnonymousClass39f anonymousClass39f, AnonymousClass45p anonymousClass45p, AnonymousClass3AB anonymousClass3AB, int i, String str) {
        this.f38429B = anonymousClass39f;
        this.f38430C = anonymousClass45p;
        this.f38431D = anonymousClass3AB;
        this.f38433F = i;
        this.f38432E = str;
    }

    public final void run() {
        AnonymousClass39f anonymousClass39f = this.f38429B;
        anonymousClass39f.f38444H = new AnonymousClass39e(this.f38430C, this.f38431D, AnonymousClass0fo.f7997C.B(anonymousClass39f.f38438B));
        if (this.f38429B.f38438B && this.f38430C.f50018C) {
            AnonymousClass39f.m18780B(this.f38429B);
        }
        this.f38429B.f38445I.m20864G(null, this.f38430C.f50019D, this.f38429B.f38444H.f38434B.f38513C, this.f38429B.f38444H, this.f38433F, this.f38430C.f50018C ? 1.0f : 0.0f, true, this.f38432E);
    }
}

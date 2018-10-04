package X;

/* renamed from: X.3T5 */
public final class AnonymousClass3T5 implements AnonymousClass0GA {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3TB f41454B;
    /* renamed from: C */
    public final /* synthetic */ boolean f41455C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Ci f41456D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0Cm f41457E;

    public final String getName() {
        return "forceSynchronizeQE";
    }

    public final void onStart() {
    }

    public AnonymousClass3T5(AnonymousClass3TB anonymousClass3TB, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ci anonymousClass0Ci, boolean z) {
        this.f41454B = anonymousClass3TB;
        this.f41457E = anonymousClass0Cm;
        this.f41456D = anonymousClass0Ci;
        this.f41455C = z;
    }

    public final void onFinish() {
        AnonymousClass3TB anonymousClass3TB = this.f41454B;
        AnonymousClass0Cm anonymousClass0Cm = this.f41457E;
        AnonymousClass0Ci anonymousClass0Ci = this.f41456D;
        boolean z = this.f41455C;
        anonymousClass3TB.m19694A();
        if (z) {
            anonymousClass3TB.mo4976C(anonymousClass0Cm, anonymousClass0Ci);
        } else {
            anonymousClass3TB.mo4975B(anonymousClass0Ci);
        }
    }

    public final void run() {
        AnonymousClass0M7.f3347C.B(this.f41457E);
    }
}

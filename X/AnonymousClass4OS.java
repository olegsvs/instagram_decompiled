package X;

/* renamed from: X.4OS */
public final class AnonymousClass4OS implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5TL f53554B;
    /* renamed from: C */
    public final /* synthetic */ int f53555C;

    public AnonymousClass4OS(AnonymousClass5TL anonymousClass5TL, int i) {
        this.f53554B = anonymousClass5TL;
        this.f53555C = i;
    }

    public final void run() {
        if (this.f53554B.f64411K != null) {
            AnonymousClass4QA anonymousClass4QA = this.f53554B.f64411K;
            anonymousClass4QA.f53859B.setProgress(this.f53555C);
        }
    }
}

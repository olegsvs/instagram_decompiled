package X;

/* renamed from: X.05n */
public final class AnonymousClass05n implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0AC f193B;

    public AnonymousClass05n(AnonymousClass0AC anonymousClass0AC) {
        this.f193B = anonymousClass0AC;
    }

    public final void run() {
        this.f193B.f1164C.set(false);
        while (!this.f193B.f1170I.isEmpty()) {
            ((Runnable) this.f193B.f1170I.remove()).run();
        }
    }
}

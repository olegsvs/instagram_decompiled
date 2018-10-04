package X;

/* renamed from: X.21J */
public final class AnonymousClass21J implements Runnable {
    /* renamed from: B */
    private /* synthetic */ AnonymousClass21F f25286B;
    /* renamed from: C */
    private /* synthetic */ AnonymousClass2TP f25287C;

    public AnonymousClass21J(AnonymousClass2TP anonymousClass2TP, AnonymousClass21F anonymousClass21F) {
        this.f25287C = anonymousClass2TP;
        this.f25286B = anonymousClass21F;
    }

    public final void run() {
        synchronized (this.f25287C.f30780B) {
            if (this.f25287C.f30781C != null) {
                this.f25287C.f30781C.Gh(this.f25286B);
            }
        }
    }
}

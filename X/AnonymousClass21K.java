package X;

/* renamed from: X.21K */
public final class AnonymousClass21K implements Runnable {
    /* renamed from: B */
    private /* synthetic */ AnonymousClass21F f25288B;
    /* renamed from: C */
    private /* synthetic */ AnonymousClass2TQ f25289C;

    public AnonymousClass21K(AnonymousClass2TQ anonymousClass2TQ, AnonymousClass21F anonymousClass21F) {
        this.f25289C = anonymousClass2TQ;
        this.f25288B = anonymousClass21F;
    }

    public final void run() {
        synchronized (this.f25289C.f30783B) {
            if (this.f25289C.f30784C != null) {
                this.f25289C.f30784C.hl(this.f25288B.mo3137E());
            }
        }
    }
}

package X;

/* renamed from: X.21v */
public final class AnonymousClass21v implements Runnable {
    /* renamed from: B */
    private final /* synthetic */ AnonymousClass21r f25343B;
    /* renamed from: C */
    private final /* synthetic */ AnonymousClass2Tg f25344C;

    public AnonymousClass21v(AnonymousClass2Tg anonymousClass2Tg, AnonymousClass21r anonymousClass21r) {
        this.f25344C = anonymousClass2Tg;
        this.f25343B = anonymousClass21r;
    }

    public final void run() {
        synchronized (this.f25344C.f30821B) {
            if (this.f25344C.f30822C != null) {
                this.f25344C.f30822C.uBA(this.f25343B.mo3156D());
            }
        }
    }
}

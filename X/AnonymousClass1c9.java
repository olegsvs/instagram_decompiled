package X;

/* renamed from: X.1c9 */
public final class AnonymousClass1c9 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1H4 f20605B;

    public AnonymousClass1c9(AnonymousClass1H4 anonymousClass1H4) {
        this.f20605B = anonymousClass1H4;
    }

    public final void run() {
        synchronized (this.f20605B.f16656J) {
            this.f20605B.f16656J.notifyAll();
        }
    }
}

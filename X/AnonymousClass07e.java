package X;

/* renamed from: X.07e */
public final class AnonymousClass07e implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass07m f582B;

    public AnonymousClass07e(AnonymousClass07m anonymousClass07m) {
        this.f582B = anonymousClass07m;
    }

    public final void run() {
        AnonymousClass0Ap anonymousClass0Ap = this.f582B.f642T;
        synchronized (anonymousClass0Ap) {
            boolean z = true;
            if (anonymousClass0Ap.f1302D) {
                z = false;
            } else {
                anonymousClass0Ap.f1302D = true;
            }
        }
        if (z) {
            anonymousClass0Ap.f1301C.m726A(AnonymousClass06J.ABORTED_PREEMPTIVE_RECONNECT, AnonymousClass07s.NETWORK_THREAD_LOOP, null);
        }
    }
}

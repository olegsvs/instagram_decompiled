package X;

/* renamed from: X.1ST */
public final class AnonymousClass1ST implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Uw f18784B;
    /* renamed from: C */
    public final /* synthetic */ Object f18785C;

    public AnonymousClass1ST(AnonymousClass0Uw anonymousClass0Uw, Object obj) {
        this.f18784B = anonymousClass0Uw;
        this.f18785C = obj;
    }

    public final void run() {
        if (this.f18784B.f5587E) {
            this.f18784B.f5585C.add(this.f18785C);
            return;
        }
        AnonymousClass0Uw.m4794B(this.f18784B, this.f18785C);
        while (!this.f18784B.f5585C.isEmpty()) {
            AnonymousClass0Uw.m4794B(this.f18784B, this.f18784B.f5585C.remove());
        }
    }
}

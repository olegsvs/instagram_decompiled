package X;

/* renamed from: X.1iB */
public final class AnonymousClass1iB implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Fx f21616B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass1I4 f21617C;

    public AnonymousClass1iB(AnonymousClass1Fx anonymousClass1Fx, AnonymousClass1I4 anonymousClass1I4) {
        this.f21616B = anonymousClass1Fx;
        this.f21617C = anonymousClass1I4;
    }

    public final void run() {
        if (this.f21616B.f16149D.getAndSet(false)) {
            if (this.f21616B.f16147B != null) {
                this.f21616B.f16147B.kk(this.f21617C);
            }
            AnonymousClass1Fx.m10394D(this.f21616B);
        }
    }
}

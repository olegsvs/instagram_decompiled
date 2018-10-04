package X;

/* renamed from: X.00R */
public final class AnonymousClass00R implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Bg f61B;
    /* renamed from: C */
    public final /* synthetic */ boolean f62C;

    public AnonymousClass00R(AnonymousClass0Bg anonymousClass0Bg, boolean z) {
        this.f61B = anonymousClass0Bg;
        this.f62C = z;
    }

    public final void run() {
        synchronized (this.f61B) {
            try {
                if (!this.f61B.f1400B) {
                    this.f61B.m1300D(AnonymousClass1I8.ANR_RECOVERED);
                }
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                    break;
                }
            }
        }
        synchronized (this.f61B.f1401C) {
            try {
                this.f61B.m1297A(this.f62C);
            } catch (Throwable th3) {
                th2 = th3;
                throw th2;
            }
        }
    }
}

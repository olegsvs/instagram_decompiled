package X;

/* renamed from: X.1p4 */
public final class AnonymousClass1p4 extends Thread {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1p5 f23072B;

    public AnonymousClass1p4(AnonymousClass1p5 anonymousClass1p5) {
        this.f23072B = anonymousClass1p5;
    }

    public final void run() {
        try {
            Thread.sleep((long) this.f23072B.f23074B);
        } catch (Throwable e) {
            AnonymousClass0Dc.I(AnonymousClass1p5.f23073f, e, "Interrupted while waiting", new Object[0]);
        }
        synchronized (this.f23072B) {
            if (AnonymousClass1GY.D(this.f23072B.f23076D.intValue(), 2)) {
                this.f23072B.f23076D = Integer.valueOf(0);
            }
        }
        AnonymousClass1p5.m13354C(this.f23072B);
        AnonymousClass1p5.m13353B(this.f23072B);
    }
}

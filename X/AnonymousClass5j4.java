package X;

/* renamed from: X.5j4 */
public final class AnonymousClass5j4 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5jH f68479B;

    public AnonymousClass5j4(AnonymousClass5jH anonymousClass5jH) {
        this.f68479B = anonymousClass5jH;
    }

    public final void run() {
        if (this.f68479B.f68520Q == null || !this.f68479B.f68511H) {
            AnonymousClass5jH.m28347F(this.f68479B);
        } else {
            this.f68479B.f68520Q.close();
        }
    }
}

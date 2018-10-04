package X;

/* renamed from: X.0Cc */
public final class AnonymousClass0Cc {
    /* renamed from: C */
    public static AnonymousClass0Cc f1696C = new AnonymousClass0Cc();
    /* renamed from: B */
    public volatile boolean f1697B;

    /* renamed from: A */
    public final synchronized void m943A() {
        while (!this.f1697B) {
            try {
                wait();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }
}

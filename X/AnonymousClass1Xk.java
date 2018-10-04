package X;

/* renamed from: X.1Xk */
public final class AnonymousClass1Xk {
    /* renamed from: C */
    private static AnonymousClass1Xk f19862C;
    /* renamed from: B */
    public boolean f19863B;

    /* renamed from: B */
    public static synchronized AnonymousClass1Xk m11794B() {
        AnonymousClass1Xk anonymousClass1Xk;
        synchronized (AnonymousClass1Xk.class) {
            if (f19862C == null) {
                f19862C = new AnonymousClass1Xk();
            }
            anonymousClass1Xk = f19862C;
        }
        return anonymousClass1Xk;
    }
}

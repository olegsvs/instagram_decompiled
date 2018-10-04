package X;

/* renamed from: X.1w1 */
public abstract class AnonymousClass1w1 {
    /* renamed from: B */
    public final String f24318B;
    /* renamed from: C */
    public AnonymousClass1w0 f24319C;
    /* renamed from: D */
    private long f24320D = -1;
    /* renamed from: E */
    private final long f24321E;

    /* renamed from: C */
    public boolean mo3014C() {
        return false;
    }

    public AnonymousClass1w1(String str) {
        this.f24318B = str;
        this.f24319C = AnonymousClass1w0.NO_RESPONSE;
        this.f24321E = System.currentTimeMillis();
    }

    /* renamed from: A */
    public final int m13813A() {
        long j = this.f24320D;
        if (j != -1) {
            return (int) (j - this.f24321E);
        }
        throw new IllegalArgumentException("End timestamp not initialized yet.");
    }

    /* renamed from: B */
    public final String m13814B() {
        return this.f24319C.m13812A();
    }

    /* renamed from: D */
    public final void m13816D() {
        this.f24320D = System.currentTimeMillis();
    }
}

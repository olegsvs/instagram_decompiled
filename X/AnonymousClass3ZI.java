package X;

/* renamed from: X.3ZI */
public final class AnonymousClass3ZI implements AnonymousClass18t {
    /* renamed from: B */
    private AnonymousClass1uB f42302B;
    /* renamed from: C */
    private long f42303C = 0;

    public AnonymousClass3ZI(AnonymousClass1uB anonymousClass1uB) {
        this.f42302B = anonymousClass1uB;
    }

    public final void pe(long j, long j2) {
        Long.valueOf(j);
        Long.valueOf(j2);
        long max = Math.max(j - this.f42303C, 0);
        this.f42303C = j;
        this.f42302B.mo2988C((int) max);
    }
}

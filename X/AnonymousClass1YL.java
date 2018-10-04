package X;

/* renamed from: X.1YL */
public final class AnonymousClass1YL {
    /* renamed from: B */
    public long f19987B = -1;
    /* renamed from: C */
    public long f19988C = 0;
    /* renamed from: D */
    public long f19989D = 0;

    /* renamed from: B */
    public static void m11841B(AnonymousClass1YL anonymousClass1YL, AnonymousClass1cw anonymousClass1cw, AnonymousClass0p5 anonymousClass0p5) {
        if (anonymousClass1YL.f19987B >= 0) {
            long A = anonymousClass1cw.m12165A(anonymousClass0p5) - anonymousClass1YL.f19987B;
            anonymousClass1YL.f19989D += A;
            anonymousClass1YL.f19988C = Math.max(anonymousClass1YL.f19988C, A);
            anonymousClass1YL.f19987B = -1;
        }
    }
}

package X;

/* renamed from: X.2x6 */
public final class AnonymousClass2x6 {
    /* renamed from: B */
    public final long f36167B;
    /* renamed from: C */
    public final long f36168C;
    /* renamed from: D */
    public final boolean f36169D;

    private AnonymousClass2x6(boolean z, long j, long j2) {
        this.f36169D = z;
        this.f36168C = j;
        this.f36167B = j2;
    }

    /* renamed from: B */
    public static AnonymousClass2x6 m17893B(AnonymousClass2xH anonymousClass2xH, long j) {
        AnonymousClass2xH anonymousClass2xH2 = anonymousClass2xH;
        int size = anonymousClass2xH2.f36208B.size();
        int i = 0;
        long j2 = Long.MAX_VALUE;
        int i2 = 0;
        Object obj = null;
        boolean z = false;
        long j3 = 0;
        while (i2 < size) {
            AnonymousClass2x7 B = ((AnonymousClass2xJ) ((AnonymousClass2xD) anonymousClass2xH2.f36208B.get(i2)).f36190D.get(i)).mo4620B();
            long j4 = j;
            if (B == null) {
                return new AnonymousClass2x6(true, 0, j4);
            }
            z |= B.RX();
            int RR = B.RR(j4);
            if (RR == 0) {
                obj = 1;
                j3 = 0;
                j2 = 0;
            } else if (obj == null) {
                long yL = B.yL();
                j3 = Math.max(j3, B.xS(yL));
                if (RR != -1) {
                    yL = (yL + ((long) RR)) - 1;
                    j2 = Math.min(j2, B.xS(yL) + B.WL(yL, j4));
                }
            }
            i2++;
            i = 0;
        }
        return new AnonymousClass2x6(z, j3, j2);
    }
}

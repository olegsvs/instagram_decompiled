package X;

/* renamed from: X.0b8 */
public final class AnonymousClass0b8 implements AnonymousClass0b7 {
    /* renamed from: E */
    private static AnonymousClass0b8 f6648E;
    /* renamed from: B */
    public volatile double f6649B = -1.0d;
    /* renamed from: C */
    public long f6650C;
    /* renamed from: D */
    public long f6651D;

    public final void NKA(double d) {
    }

    private AnonymousClass0b8() {
    }

    /* renamed from: B */
    public static synchronized AnonymousClass0b8 m5521B() {
        AnonymousClass0b8 anonymousClass0b8;
        synchronized (AnonymousClass0b8.class) {
            if (f6648E == null) {
                f6648E = new AnonymousClass0b8();
            }
            anonymousClass0b8 = f6648E;
        }
        return anonymousClass0b8;
    }

    public final void Ke(double d, long j, long j2) {
        long j3 = this.f6651D;
        if (j3 != 0) {
            double d2 = (double) (this.f6650C / j3);
            Double.isNaN(d2);
            d = (d2 + d) / 2.0d;
        }
        this.f6649B = d;
        this.f6650C += j;
        this.f6651D += j2;
    }
}

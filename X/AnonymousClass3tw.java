package X;

/* renamed from: X.3tw */
public final class AnonymousClass3tw implements AnonymousClass2qq {
    /* renamed from: B */
    private final long f46175B;
    /* renamed from: C */
    private final long f46176C;
    /* renamed from: D */
    private final long f46177D;
    /* renamed from: E */
    private final long f46178E;
    /* renamed from: F */
    private final AnonymousClass2te f46179F;

    public AnonymousClass3tw(long j, long j2, long j3, long j4, AnonymousClass2te anonymousClass2te) {
        this.f46178E = j;
        this.f46177D = j2;
        this.f46176C = j3;
        this.f46175B = j4;
        this.f46179F = anonymousClass2te;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    AnonymousClass3tw anonymousClass3tw = (AnonymousClass3tw) obj;
                    if (anonymousClass3tw.f46178E != this.f46178E || anonymousClass3tw.f46177D != this.f46177D || anonymousClass3tw.f46176C != this.f46176C || anonymousClass3tw.f46175B != this.f46175B) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final long[] fK(long[] jArr) {
        jArr = gK(jArr);
        jArr[0] = jArr[0] / 1000;
        jArr[1] = jArr[1] / 1000;
        return jArr;
    }

    public final long[] gK(long[] jArr) {
        if (jArr == null || jArr.length < 2) {
            jArr = new long[2];
        }
        long min = Math.min(this.f46177D, (this.f46179F.zG() * 1000) - this.f46176C);
        long j = this.f46178E;
        long j2 = this.f46175B;
        if (j2 != -1) {
            j = Math.max(j, min - j2);
        }
        jArr[0] = j;
        jArr[1] = min;
        return jArr;
    }

    public final int hashCode() {
        return ((((((527 + ((int) this.f46178E)) * 31) + ((int) this.f46177D)) * 31) + ((int) this.f46176C)) * 31) + ((int) this.f46175B);
    }
}

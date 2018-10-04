package X;

/* renamed from: X.2rd */
public final class AnonymousClass2rd {
    /* renamed from: E */
    public static long f35105E = -1;
    /* renamed from: B */
    public final long f35106B;
    /* renamed from: C */
    public final long f35107C;
    /* renamed from: D */
    private final long f35108D;

    public AnonymousClass2rd(long j, long j2, long j3) {
        this.f35108D = j2;
        if (j > 0) {
            this.f35107C = j;
            this.f35106B = (8000000 * j) / j2;
        } else if (j3 > 0) {
            this.f35107C = (j3 * j2) / 8000000;
            this.f35106B = j3;
        } else {
            this.f35107C = j;
            this.f35106B = j3;
        }
        if (this.f35107C <= 0 || this.f35108D <= 0 || this.f35106B <= 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SegmentInfo size (");
            stringBuilder.append(j);
            stringBuilder.append(") duration (");
            stringBuilder.append(j2);
            stringBuilder.append(") or bitrate (");
            stringBuilder.append(j3);
            stringBuilder.append(") is <= 0 ");
            throw new AssertionError(stringBuilder.toString());
        }
    }
}

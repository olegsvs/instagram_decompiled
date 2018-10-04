package X;

/* renamed from: X.1jP */
public final class AnonymousClass1jP {
    /* renamed from: B */
    public final long f21943B;
    /* renamed from: C */
    public boolean f21944C;
    /* renamed from: D */
    public long f21945D;
    /* renamed from: E */
    public final boolean f21946E;
    /* renamed from: F */
    public final long f21947F;

    public AnonymousClass1jP(long j, long j2) {
        this(j, j2, false);
    }

    public AnonymousClass1jP(long j, long j2, boolean z) {
        this.f21947F = j;
        this.f21943B = j2;
        this.f21946E = z;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WifiScanOperationParams{timeoutMs=");
        stringBuilder.append(this.f21947F);
        stringBuilder.append(", ageLimitMs=");
        stringBuilder.append(this.f21943B);
        stringBuilder.append(", returnAllResults=");
        stringBuilder.append(this.f21946E);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

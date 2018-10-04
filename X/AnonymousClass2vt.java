package X;

/* renamed from: X.2vt */
public final class AnonymousClass2vt {
    /* renamed from: B */
    public final long f36026B;
    /* renamed from: C */
    public final int[] f36027C;
    /* renamed from: D */
    public final int f36028D;
    /* renamed from: E */
    public final long[] f36029E;
    /* renamed from: F */
    public final int f36030F;
    /* renamed from: G */
    public final int[] f36031G;
    /* renamed from: H */
    public final long[] f36032H;

    public AnonymousClass2vt(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z = true;
        AnonymousClass2yO.m18013B(iArr.length == jArr2.length);
        AnonymousClass2yO.m18013B(jArr.length == jArr2.length);
        if (iArr2.length != jArr2.length) {
            z = false;
        }
        AnonymousClass2yO.m18013B(z);
        this.f36029E = jArr;
        this.f36031G = iArr;
        this.f36028D = i;
        this.f36032H = jArr2;
        this.f36027C = iArr2;
        this.f36026B = j;
        this.f36030F = jArr.length;
    }

    /* renamed from: A */
    public final int m17828A(long j) {
        for (int E = AnonymousClass2yi.m18084E(this.f36032H, j, true, false); E >= 0; E--) {
            if ((this.f36027C[E] & 1) != 0) {
                return E;
            }
        }
        return -1;
    }

    /* renamed from: B */
    public final int m17829B(long j) {
        for (int D = AnonymousClass2yi.m18083D(this.f36032H, j, true, false); D < this.f36032H.length; D++) {
            if ((this.f36027C[D] & 1) != 0) {
                return D;
            }
        }
        return -1;
    }
}

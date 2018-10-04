package X;

/* renamed from: X.2st */
public final class AnonymousClass2st {
    /* renamed from: E */
    private static final long[] f35345E = new long[]{128, 64, 32, 16, 8, 4, 2, 1};
    /* renamed from: B */
    public int f35346B;
    /* renamed from: C */
    public int f35347C;
    /* renamed from: D */
    private final byte[] f35348D = new byte[8];

    /* renamed from: A */
    public final long m17579A(AnonymousClass2sO anonymousClass2sO, boolean z, boolean z2, int i) {
        int C;
        if (this.f35347C == 0) {
            if (!anonymousClass2sO.kIA(this.f35348D, 0, 1, z)) {
                return -1;
            }
            C = AnonymousClass2st.m17578C(this.f35348D[0] & 255);
            this.f35346B = C;
            if (C != -1) {
                this.f35347C = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        C = this.f35346B;
        if (C > i) {
            this.f35347C = 0;
            return -2;
        }
        if (C != 1) {
            anonymousClass2sO.readFully(this.f35348D, 1, C - 1);
        }
        this.f35347C = 0;
        return AnonymousClass2st.m17577B(this.f35348D, this.f35346B, z2);
    }

    /* renamed from: B */
    public static long m17577B(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= f35345E[i - 1] ^ -1;
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: C */
    public static int m17578C(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f35345E;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }
}

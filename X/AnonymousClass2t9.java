package X;

import java.io.InputStream;

/* renamed from: X.2t9 */
public final class AnonymousClass2t9 extends InputStream {
    /* renamed from: B */
    private boolean f35393B = false;
    /* renamed from: C */
    private final AnonymousClass2t7 f35394C;
    /* renamed from: D */
    private final AnonymousClass2tB f35395D;
    /* renamed from: E */
    private boolean f35396E = false;
    /* renamed from: F */
    private final byte[] f35397F;

    public AnonymousClass2t9(AnonymousClass2t7 anonymousClass2t7, AnonymousClass2tB anonymousClass2tB) {
        this.f35394C = anonymousClass2t7;
        this.f35395D = anonymousClass2tB;
        this.f35397F = new byte[1];
    }

    /* renamed from: B */
    public static void m17588B(AnonymousClass2t9 anonymousClass2t9) {
        if (!anonymousClass2t9.f35396E) {
            anonymousClass2t9.f35394C.tGA(anonymousClass2t9.f35395D);
            anonymousClass2t9.f35396E = true;
        }
    }

    public final void close() {
        if (!this.f35393B) {
            this.f35394C.close();
            this.f35393B = true;
        }
    }

    public final int read() {
        if (read(this.f35397F) == -1) {
            return -1;
        }
        return this.f35397F[0] & 255;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        AnonymousClass2td.m17606E(this.f35393B ^ 1);
        AnonymousClass2t9.m17588B(this);
        return this.f35394C.read(bArr, i, i2);
    }

    public final long skip(long j) {
        AnonymousClass2td.m17606E(this.f35393B ^ 1);
        AnonymousClass2t9.m17588B(this);
        return super.skip(j);
    }
}

package X;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: X.194 */
public final class AnonymousClass194 extends FilterInputStream {
    /* renamed from: B */
    public final long f15062B;
    /* renamed from: C */
    public final AnonymousClass18t f15063C;
    /* renamed from: D */
    public long f15064D = 0;

    public AnonymousClass194(InputStream inputStream, long j, AnonymousClass18t anonymousClass18t) {
        super(inputStream);
        this.f15062B = j;
        this.f15063C = anonymousClass18t;
    }

    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f15064D++;
            this.f15063C.pe(this.f15064D, this.f15062B);
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read >= 0) {
            this.f15064D = ((long) read) + this.f15064D;
            this.f15063C.pe(this.f15064D, this.f15062B);
        }
        return read;
    }
}

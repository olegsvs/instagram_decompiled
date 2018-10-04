package X;

import java.io.InputStream;

/* renamed from: X.0nC */
public final class AnonymousClass0nC implements AnonymousClass0aF {
    /* renamed from: B */
    private final InputStream f10026B;
    /* renamed from: C */
    private final long f10027C;

    public AnonymousClass0nC(InputStream inputStream, long j) {
        this.f10026B = inputStream;
        this.f10027C = j;
    }

    public final long MF() {
        return this.f10027C;
    }

    public final InputStream UJ() {
        return this.f10026B;
    }

    public final void close() {
        this.f10026B.close();
    }
}

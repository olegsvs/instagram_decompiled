package X;

import android.net.Uri;

/* renamed from: X.3uS */
public final class AnonymousClass3uS implements AnonymousClass2tH {
    /* renamed from: B */
    private final AnonymousClass2t4 f46448B;
    /* renamed from: C */
    private final AnonymousClass2t7 f46449C;
    /* renamed from: D */
    private final AnonymousClass2sS f46450D;
    /* renamed from: E */
    private volatile boolean f46451E;
    /* renamed from: F */
    private boolean f46452F = true;
    /* renamed from: G */
    private final AnonymousClass2sU f46453G;
    /* renamed from: H */
    private final int f46454H;
    /* renamed from: I */
    private final Uri f46455I;

    public AnonymousClass3uS(Uri uri, AnonymousClass2t7 anonymousClass2t7, AnonymousClass2sS anonymousClass2sS, AnonymousClass2t4 anonymousClass2t4, int i, long j) {
        this.f46455I = (Uri) AnonymousClass2td.m17605D(uri);
        this.f46449C = (AnonymousClass2t7) AnonymousClass2td.m17605D(anonymousClass2t7);
        this.f46450D = (AnonymousClass2sS) AnonymousClass2td.m17605D(anonymousClass2sS);
        this.f46448B = (AnonymousClass2t4) AnonymousClass2td.m17605D(anonymousClass2t4);
        this.f46454H = i;
        AnonymousClass2sU anonymousClass2sU = new AnonymousClass2sU();
        this.f46453G = anonymousClass2sU;
        anonymousClass2sU.f35204B = j;
    }

    public final void BE() {
        this.f46451E = true;
    }

    public final void LZ() {
        Throwable th;
        int i = 0;
        while (i == 0 && !this.f46451E) {
            AnonymousClass2sO anonymousClass3uQ;
            try {
                long j = this.f46453G.f35204B;
                long tGA = this.f46449C.tGA(new AnonymousClass2tB(this.f46455I, j, -1, null));
                if (tGA != -1) {
                    tGA += j;
                }
                anonymousClass3uQ = new AnonymousClass3uQ(this.f46449C, j, tGA);
                try {
                    AnonymousClass2sN A = this.f46450D.m17535A(anonymousClass3uQ);
                    if (this.f46452F) {
                        A.sLA();
                        this.f46452F = false;
                    }
                    while (i == 0 && !this.f46451E) {
                        this.f46448B.uC(this.f46454H);
                        i = A.bIA(anonymousClass3uQ, this.f46453G);
                    }
                    if (i == 1) {
                        i = 0;
                    } else {
                        this.f46453G.f35204B = anonymousClass3uQ.gP();
                    }
                    this.f46449C.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                anonymousClass3uQ = null;
            }
        }
        return;
        if (anonymousClass3uQ != null) {
            this.f46453G.f35204B = anonymousClass3uQ.gP();
        }
        this.f46449C.close();
        throw th;
    }

    public final boolean sX() {
        return this.f46451E;
    }
}

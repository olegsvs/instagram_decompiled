package X;

import java.util.Random;
import java.util.concurrent.Executor;

/* renamed from: X.1vu */
public final class AnonymousClass1vu {
    /* renamed from: B */
    private AnonymousClass2UO f24295B;
    /* renamed from: C */
    private Executor f24296C;
    /* renamed from: D */
    private AnonymousClass1vs f24297D;
    /* renamed from: E */
    private AnonymousClass1vs f24298E;
    /* renamed from: F */
    private final Random f24299F = new Random();

    public AnonymousClass1vu(AnonymousClass1vs anonymousClass1vs, AnonymousClass1vs anonymousClass1vs2, Executor executor, AnonymousClass2UO anonymousClass2UO) {
        this.f24298E = anonymousClass1vs;
        this.f24297D = anonymousClass1vs2;
        this.f24296C = executor;
        this.f24295B = anonymousClass2UO;
    }

    /* renamed from: A */
    public final void m13808A() {
        boolean B = AnonymousClass1vu.m13807B(this, this.f24298E);
        Object obj = (B || !AnonymousClass1vu.m13807B(this, this.f24297D)) ? null : 1;
        if (B || obj != null) {
            AnonymousClass1vt anonymousClass2Rp = obj != null ? new AnonymousClass2Rp(this.f24297D, this.f24296C, this.f24295B) : new AnonymousClass2Rq(this.f24298E, this.f24296C, this.f24295B);
            AnonymousClass0GG.B(anonymousClass2Rp.f24294C, new AnonymousClass1vr(anonymousClass2Rp), -643775691);
        }
    }

    /* renamed from: B */
    private static boolean m13807B(AnonymousClass1vu anonymousClass1vu, AnonymousClass1vs anonymousClass1vs) {
        return anonymousClass1vs.f24292D > 0 && anonymousClass1vu.f24299F.nextInt(anonymousClass1vs.f24292D) == 0;
    }
}

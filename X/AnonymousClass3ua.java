package X;

import java.util.List;

/* renamed from: X.3ua */
public final class AnonymousClass3ua implements AnonymousClass2sw {
    /* renamed from: B */
    public final long f46594B;
    /* renamed from: C */
    private final long f46595C;
    /* renamed from: D */
    private final AnonymousClass2sw f46596D;

    public AnonymousClass3ua(AnonymousClass2sw anonymousClass2sw, boolean z, long j, long j2) {
        this.f46596D = anonymousClass2sw;
        this.f46594B = j;
        if (!z) {
            j = 0;
        }
        this.f46595C = j + j2;
    }

    public final List bK(long j) {
        return this.f46596D.bK(j - this.f46595C);
    }

    public final long eL(int i) {
        return this.f46596D.eL(i) + this.f46595C;
    }

    public final int fL() {
        return this.f46596D.fL();
    }

    public final int jO(long j) {
        return this.f46596D.jO(j - this.f46595C);
    }
}

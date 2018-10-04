package X;

import java.util.Random;

/* renamed from: X.0Jw */
public final class AnonymousClass0Jw {
    /* renamed from: B */
    public final AnonymousClass0EW f2950B;
    /* renamed from: C */
    private final Random f2951C = new Random();

    public AnonymousClass0Jw(AnonymousClass0EW anonymousClass0EW) {
        this.f2950B = anonymousClass0EW;
    }

    /* renamed from: A */
    public final int m2757A(int i) {
        if (i != 0) {
            if (i == 1) {
                return 1;
            }
            if (this.f2951C.nextInt(i) == 0) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}

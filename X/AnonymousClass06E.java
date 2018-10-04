package X;

import android.os.PowerManager;

/* renamed from: X.06E */
public final class AnonymousClass06E {
    /* renamed from: C */
    public static final AnonymousClass06E f267C = new AnonymousClass06E();
    /* renamed from: B */
    private final PowerManager f268B;

    private AnonymousClass06E() {
        this.f268B = null;
    }

    public AnonymousClass06E(AnonymousClass06F anonymousClass06F) {
        AnonymousClass05y A = anonymousClass06F.m380A("power", PowerManager.class);
        if (A.mo83B()) {
            this.f268B = (PowerManager) A.mo82A();
            return;
        }
        throw new IllegalArgumentException("Cannot acquire power service");
    }

    /* renamed from: A */
    public final AnonymousClass06D m378A() {
        return AnonymousClass06D.m376B(this.f268B);
    }
}

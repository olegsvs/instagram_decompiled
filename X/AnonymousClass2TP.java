package X;

import java.util.concurrent.Executor;

/* renamed from: X.2TP */
public final class AnonymousClass2TP implements AnonymousClass21M {
    /* renamed from: B */
    public final Object f30780B = new Object();
    /* renamed from: C */
    public AnonymousClass21B f30781C;
    /* renamed from: D */
    private final Executor f30782D;

    public AnonymousClass2TP(Executor executor, AnonymousClass21B anonymousClass21B) {
        this.f30782D = executor;
        this.f30781C = anonymousClass21B;
    }

    public final void Gh(AnonymousClass21F anonymousClass21F) {
        synchronized (this.f30780B) {
            if (this.f30781C == null) {
                return;
            }
            AnonymousClass0GG.B(this.f30782D, new AnonymousClass21J(this, anonymousClass21F), -1843675072);
        }
    }
}

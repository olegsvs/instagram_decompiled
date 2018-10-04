package X;

import java.util.concurrent.Executor;

/* renamed from: X.22m */
public final class AnonymousClass22m {
    /* renamed from: B */
    public static Executor m14274B(Executor executor, AnonymousClass1Fj anonymousClass1Fj) {
        AnonymousClass1Cy.G(executor);
        AnonymousClass1Cy.G(anonymousClass1Fj);
        if (executor == AnonymousClass1kC.INSTANCE) {
            return executor;
        }
        return new AnonymousClass22l(executor, anonymousClass1Fj);
    }
}

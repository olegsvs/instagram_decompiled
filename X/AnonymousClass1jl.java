package X;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.1jl */
public abstract class AnonymousClass1jl implements Iterable {
    /* renamed from: B */
    public final AnonymousClass1Fp f22008B = AnonymousClass1Ga.f16303B;

    public final String toString() {
        Iterator it = ((Iterable) this.f22008B.mo2318A(this)).iterator();
        AnonymousClass222 anonymousClass222 = AnonymousClass227.f25357B;
        Appendable stringBuilder = new StringBuilder("[");
        try {
            AnonymousClass1Cy.m9952G(stringBuilder);
            if (it.hasNext()) {
                stringBuilder.append(anonymousClass222.A(it.next()));
                while (it.hasNext()) {
                    stringBuilder.append(anonymousClass222.f25352B);
                    stringBuilder.append(anonymousClass222.A(it.next()));
                }
            }
            stringBuilder.append(']');
            return stringBuilder.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}

package X;

import java.util.Map.Entry;

/* renamed from: X.22B */
public final class AnonymousClass22B extends AnonymousClass1Dd {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Dd f25363B;

    public AnonymousClass22B(AnonymousClass22C anonymousClass22C, AnonymousClass1Dd anonymousClass1Dd) {
        this.f25363B = anonymousClass1Dd;
    }

    public final boolean hasNext() {
        return this.f25363B.hasNext();
    }

    public final Object next() {
        return ((Entry) this.f25363B.next()).getKey();
    }
}

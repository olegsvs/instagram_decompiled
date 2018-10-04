package X;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.25V */
public final class AnonymousClass25V extends AbstractCollection {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0LM f25765B;

    public AnonymousClass25V(AnonymousClass0LM anonymousClass0LM) {
        this.f25765B = anonymousClass0LM;
    }

    public final void clear() {
        this.f25765B.clear();
    }

    public final boolean contains(Object obj) {
        return this.f25765B.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.f25765B.isEmpty();
    }

    public final Iterator iterator() {
        return new AnonymousClass2Un(this.f25765B);
    }

    public final int size() {
        return this.f25765B.size();
    }
}

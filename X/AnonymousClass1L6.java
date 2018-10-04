package X;

import java.util.NoSuchElementException;

/* renamed from: X.1L6 */
public final class AnonymousClass1L6 extends AnonymousClass1Dd {
    /* renamed from: B */
    public boolean f17286B;
    /* renamed from: C */
    public final /* synthetic */ Object f17287C;

    public AnonymousClass1L6(Object obj) {
        this.f17287C = obj;
    }

    public final boolean hasNext() {
        return this.f17286B ^ 1;
    }

    public final Object next() {
        if (this.f17286B) {
            throw new NoSuchElementException();
        }
        this.f17286B = true;
        return this.f17287C;
    }
}

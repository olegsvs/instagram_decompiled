package X;

import java.util.Iterator;

/* renamed from: X.3Hj */
public final class AnonymousClass3Hj implements Iterator {
    /* renamed from: B */
    public Iterator f39865B = this.f39866C.f39868B.iterator();
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass3Hk f39866C;
    /* renamed from: D */
    private Object f39867D;

    public AnonymousClass3Hj(AnonymousClass3Hk anonymousClass3Hk) {
        this.f39866C = anonymousClass3Hk;
    }

    public final boolean hasNext() {
        return this.f39865B.hasNext();
    }

    public final Object next() {
        Object next = this.f39865B.next();
        this.f39867D = next;
        return next;
    }

    public final void remove() {
        this.f39865B.remove();
        if (this.f39866C.f39869C != null) {
            this.f39866C.f39869C.m21883A(this.f39867D);
        }
    }
}

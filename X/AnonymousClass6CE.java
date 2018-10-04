package X;

import java.util.NoSuchElementException;

/* renamed from: X.6CE */
public abstract class AnonymousClass6CE extends AnonymousClass5e6 {
    /* renamed from: B */
    public AnonymousClass5e5 f72879B = AnonymousClass5e5.NOT_READY;
    /* renamed from: C */
    private Object f72880C;

    /* renamed from: A */
    public abstract Object mo6780A();

    /* renamed from: B */
    private boolean mo6781B() {
        this.f72879B = AnonymousClass5e5.FAILED;
        this.f72880C = mo6780A();
        if (this.f72879B == AnonymousClass5e5.DONE) {
            return false;
        }
        this.f72879B = AnonymousClass5e5.READY;
        return true;
    }

    public final boolean hasNext() {
        if ((this.f72879B != AnonymousClass5e5.FAILED ? 1 : null) != null) {
            switch (this.f72879B.ordinal()) {
                case 0:
                    return true;
                case 2:
                    return false;
                default:
                    return mo6781B();
            }
        }
        throw new IllegalStateException();
    }

    public final Object next() {
        if (hasNext()) {
            this.f72879B = AnonymousClass5e5.NOT_READY;
            return this.f72880C;
        }
        throw new NoSuchElementException();
    }
}

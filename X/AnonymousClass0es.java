package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.0es */
public final class AnonymousClass0es implements AnonymousClass0et {
    /* renamed from: B */
    public CountDownLatch f7847B = new CountDownLatch(1);
    /* renamed from: C */
    public Object f7848C;

    public AnonymousClass0es(AnonymousClass0em anonymousClass0em) {
    }

    public final void cx(Object obj) {
        this.f7847B.countDown();
        this.f7848C = obj;
    }

    public final void nk(Exception exception) {
        this.f7847B.countDown();
    }
}

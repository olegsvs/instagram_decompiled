package X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3xn */
public final class AnonymousClass3xn implements AnonymousClass2gn {
    /* renamed from: B */
    public final /* synthetic */ CountDownLatch f47448B;
    /* renamed from: C */
    public final /* synthetic */ AtomicReference f47449C;

    public AnonymousClass3xn(AnonymousClass37O anonymousClass37O, AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.f47449C = atomicReference;
        this.f47448B = countDownLatch;
    }

    public final void hl(Exception exception) {
        this.f47448B.countDown();
    }

    public final /* bridge */ /* synthetic */ void uBA(Object obj) {
        this.f47449C.set((AnonymousClass2gy) obj);
        this.f47448B.countDown();
    }
}

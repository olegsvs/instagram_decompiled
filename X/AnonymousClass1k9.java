package X;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1k9 */
public final class AnonymousClass1k9 extends AnonymousClass1kA {
    /* renamed from: B */
    public final AtomicIntegerFieldUpdater f22071B;
    /* renamed from: C */
    public final AtomicReferenceFieldUpdater f22072C;

    public AnonymousClass1k9(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f22072C = atomicReferenceFieldUpdater;
        this.f22071B = atomicIntegerFieldUpdater;
    }

    /* renamed from: A */
    public final void mo2721A(AnonymousClass1k8 anonymousClass1k8, Set set, Set set2) {
        this.f22072C.compareAndSet(anonymousClass1k8, set, set2);
    }

    /* renamed from: B */
    public final int mo2722B(AnonymousClass1k8 anonymousClass1k8) {
        return this.f22071B.decrementAndGet(anonymousClass1k8);
    }
}

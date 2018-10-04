package X;

import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: X.259 */
public final class AnonymousClass259 extends LinkedBlockingDeque {
    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        return super.offerFirst((Runnable) obj);
    }

    public final /* bridge */ /* synthetic */ Object remove() {
        return (Runnable) super.removeFirst();
    }
}

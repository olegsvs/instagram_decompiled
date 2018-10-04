package X;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.06X */
public final class AnonymousClass06X implements Future {
    /* renamed from: C */
    public static final AnonymousClass06X f370C = new AnonymousClass06X(null);
    /* renamed from: B */
    private final Object f371B;

    public final boolean cancel(boolean z) {
        return false;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public AnonymousClass06X(Object obj) {
        this.f371B = obj;
    }

    public final Object get() {
        return this.f371B;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return get();
    }
}

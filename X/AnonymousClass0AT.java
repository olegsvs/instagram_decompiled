package X;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.0AT */
public final class AnonymousClass0AT extends FutureTask implements AnonymousClass06Y {
    /* renamed from: B */
    private final AnonymousClass06V f1253B = new AnonymousClass06V();

    public AnonymousClass0AT(Runnable runnable, Object obj) {
        super(runnable, obj);
    }

    public AnonymousClass0AT(Callable callable) {
        super(callable);
    }

    public final void done() {
        this.f1253B.m401A();
    }
}

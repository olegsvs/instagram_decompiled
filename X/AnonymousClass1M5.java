package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.1M5 */
public final class AnonymousClass1M5 implements Executor {
    /* renamed from: C */
    public static AnonymousClass1M5 f17516C;
    /* renamed from: D */
    public static final ThreadFactory f17517D = new AnonymousClass1M6();
    /* renamed from: B */
    private Executor f17518B;

    public AnonymousClass1M5(Executor executor) {
        this.f17518B = executor;
    }

    public final synchronized void execute(Runnable runnable) {
        AnonymousClass0GG.m1763B(this.f17518B, runnable, 1335715926);
    }
}

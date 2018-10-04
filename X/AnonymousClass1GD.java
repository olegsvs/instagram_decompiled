package X;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1GD */
public final class AnonymousClass1GD extends AbstractExecutorService implements ScheduledExecutorService {
    /* renamed from: B */
    public final Handler f16223B;

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public AnonymousClass1GD(Handler handler) {
        this.f16223B = handler;
    }

    /* renamed from: A */
    public final ScheduledFuture m10433A(Runnable runnable, Object obj) {
        if (runnable != null) {
            Object anonymousClass1iE = new AnonymousClass1iE(this.f16223B, runnable, obj);
            AnonymousClass0GG.m1763B(this, anonymousClass1iE, 445125091);
            return anonymousClass1iE;
        }
        throw new NullPointerException();
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void execute(Runnable runnable) {
        AnonymousClass0OR.m3624D(this.f16223B, runnable, 1217376857);
    }

    public final /* bridge */ /* synthetic */ RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new AnonymousClass1iE(this.f16223B, runnable, obj);
    }

    public final /* bridge */ /* synthetic */ RunnableFuture newTaskFor(Callable callable) {
        return new AnonymousClass1iE(this.f16223B, callable);
    }

    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        Object anonymousClass1iE = new AnonymousClass1iE(this.f16223B, runnable, null);
        AnonymousClass0OR.m3626F(this.f16223B, anonymousClass1iE, timeUnit.toMillis(j), -1850758711);
        return anonymousClass1iE;
    }

    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        Object anonymousClass1iE = new AnonymousClass1iE(this.f16223B, callable);
        AnonymousClass0OR.m3626F(this.f16223B, anonymousClass1iE, timeUnit.toMillis(j), -343507236);
        return anonymousClass1iE;
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return m10433A(runnable, obj);
    }
}

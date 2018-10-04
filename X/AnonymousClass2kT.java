package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.2kT */
public class AnonymousClass2kT implements AnonymousClass1Fk {
    /* renamed from: B */
    private boolean f33252B;
    /* renamed from: C */
    private boolean f33253C;
    /* renamed from: D */
    private Throwable f33254D;
    /* renamed from: E */
    private final AnonymousClass22j f33255E = new AnonymousClass22j();
    /* renamed from: F */
    private Object f33256F;

    /* renamed from: A */
    public final synchronized boolean m17013A(Object obj) {
        if (this.f33253C) {
            return false;
        }
        this.f33256F = obj;
        this.f33253C = true;
        this.f33255E.m14273B();
        notifyAll();
        return true;
    }

    /* renamed from: B */
    public final synchronized boolean m17014B(Throwable th) {
        if (th == null) {
            throw new NullPointerException();
        } else if (this.f33253C) {
            return false;
        } else {
            this.f33254D = th;
            this.f33253C = true;
            this.f33255E.m14273B();
            notifyAll();
            return true;
        }
    }

    public final synchronized boolean cancel(boolean z) {
        if (this.f33253C) {
            return false;
        }
        this.f33252B = true;
        this.f33253C = true;
        notifyAll();
        this.f33255E.m14273B();
        return true;
    }

    public final synchronized Object get() {
        try {
        } catch (Throwable e) {
            throw new ExecutionException(e);
        }
        return get(0, TimeUnit.MILLISECONDS);
    }

    public final synchronized Object get(long j, TimeUnit timeUnit) {
        ExecutionException interruptedException;
        if (Thread.interrupted()) {
            interruptedException = new InterruptedException();
        } else {
            if (!this.f33253C) {
                if (j > 0) {
                    timeUnit.timedWait(this, j);
                } else {
                    wait();
                }
            }
            if (!this.f33253C) {
                interruptedException = new TimeoutException();
            } else if (this.f33252B) {
                interruptedException = new CancellationException();
            } else if (this.f33254D == null) {
            } else {
                interruptedException = new ExecutionException(this.f33254D);
            }
        }
        throw interruptedException;
        return this.f33256F;
    }

    public final synchronized boolean isCancelled() {
        return this.f33252B;
    }

    public final synchronized boolean isDone() {
        return this.f33253C;
    }

    public final void oB(Runnable runnable, Executor executor) {
        this.f33255E.m14272A(runnable, executor);
    }
}

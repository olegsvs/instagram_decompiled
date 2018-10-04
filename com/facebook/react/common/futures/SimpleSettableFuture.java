package com.facebook.react.common.futures;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class SimpleSettableFuture implements Future {
    private Exception mException;
    private final CountDownLatch mReadyLatch = new CountDownLatch(1);
    private Object mResult;

    public final boolean isCancelled() {
        return false;
    }

    public final boolean cancel(boolean z) {
        throw new UnsupportedOperationException();
    }

    private void checkNotSet() {
        if (this.mReadyLatch.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }

    public final Object get() {
        this.mReadyLatch.await();
        Throwable th = this.mException;
        if (th == null) {
            return this.mResult;
        }
        throw new ExecutionException(th);
    }

    public final Object get(long j, TimeUnit timeUnit) {
        if (this.mReadyLatch.await(j, timeUnit)) {
            Throwable th = this.mException;
            if (th == null) {
                return this.mResult;
            }
            throw new ExecutionException(th);
        }
        throw new TimeoutException("Timed out waiting for result");
    }

    public final Object getOrThrow() {
        try {
            return get();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean isDone() {
        return this.mReadyLatch.getCount() == 0;
    }

    public final void set(Object obj) {
        checkNotSet();
        this.mResult = obj;
        this.mReadyLatch.countDown();
    }

    public final void setException(Exception exception) {
        checkNotSet();
        this.mException = exception;
        this.mReadyLatch.countDown();
    }
}

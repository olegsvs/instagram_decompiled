package org.webrtc;

import java.util.concurrent.atomic.AtomicInteger;

public class RefCountDelegate implements RefCounted {
    private final AtomicInteger refCount = new AtomicInteger(1);
    private final Runnable releaseCallback;

    public RefCountDelegate(Runnable runnable) {
        this.releaseCallback = runnable;
    }

    public void release() {
        if (this.refCount.decrementAndGet() == 0) {
            Runnable runnable = this.releaseCallback;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void retain() {
        this.refCount.incrementAndGet();
    }
}

package com.facebook.react.common;

import X.AnonymousClass0LR;

public final class SingleThreadAsserter {
    private Thread mThread = null;

    public final void assertNow() {
        Thread currentThread = Thread.currentThread();
        if (this.mThread == null) {
            this.mThread = currentThread;
        }
        AnonymousClass0LR.B(this.mThread == currentThread);
    }
}

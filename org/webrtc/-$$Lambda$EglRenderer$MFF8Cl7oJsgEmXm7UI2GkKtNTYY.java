package org.webrtc;

import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class -$$Lambda$EglRenderer$MFF8Cl7oJsgEmXm7UI2GkKtNTYY implements Runnable {
    private final /* synthetic */ EglRenderer f$0;
    private final /* synthetic */ CountDownLatch f$1;

    public /* synthetic */ -$$Lambda$EglRenderer$MFF8Cl7oJsgEmXm7UI2GkKtNTYY(EglRenderer eglRenderer, CountDownLatch countDownLatch) {
        this.f$0 = eglRenderer;
        this.f$1 = countDownLatch;
    }

    public final void run() {
        EglRenderer.lambda$release$1(this.f$0, this.f$1);
    }
}

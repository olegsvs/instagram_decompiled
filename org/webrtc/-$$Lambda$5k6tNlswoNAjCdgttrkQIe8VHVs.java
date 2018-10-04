package org.webrtc;

import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class -$$Lambda$5k6tNlswoNAjCdgttrkQIe8VHVs implements Runnable {
    private final /* synthetic */ CountDownLatch f$0;

    public /* synthetic */ -$$Lambda$5k6tNlswoNAjCdgttrkQIe8VHVs(CountDownLatch countDownLatch) {
        this.f$0 = countDownLatch;
    }

    public final void run() {
        this.f$0.countDown();
    }
}

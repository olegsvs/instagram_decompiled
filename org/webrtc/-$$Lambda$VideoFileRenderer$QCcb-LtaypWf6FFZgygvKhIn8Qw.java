package org.webrtc;

import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class -$$Lambda$VideoFileRenderer$QCcb-LtaypWf6FFZgygvKhIn8Qw implements Runnable {
    private final /* synthetic */ VideoFileRenderer f$0;
    private final /* synthetic */ CountDownLatch f$1;

    public /* synthetic */ -$$Lambda$VideoFileRenderer$QCcb-LtaypWf6FFZgygvKhIn8Qw(VideoFileRenderer videoFileRenderer, CountDownLatch countDownLatch) {
        this.f$0 = videoFileRenderer;
        this.f$1 = countDownLatch;
    }

    public final void run() {
        VideoFileRenderer.lambda$release$1(this.f$0, this.f$1);
    }
}

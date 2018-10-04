package org.webrtc;

import java.util.concurrent.CountDownLatch;
import org.webrtc.EglRenderer.FrameListener;

public final /* synthetic */ class -$$Lambda$EglRenderer$6uTxCXz4FQA7p26IUV3iP2Ty5gk implements Runnable {
    private final /* synthetic */ EglRenderer f$0;
    private final /* synthetic */ CountDownLatch f$1;
    private final /* synthetic */ FrameListener f$2;

    public /* synthetic */ -$$Lambda$EglRenderer$6uTxCXz4FQA7p26IUV3iP2Ty5gk(EglRenderer eglRenderer, CountDownLatch countDownLatch, FrameListener frameListener) {
        this.f$0 = eglRenderer;
        this.f$1 = countDownLatch;
        this.f$2 = frameListener;
    }

    public final void run() {
        EglRenderer.lambda$removeFrameListener$4(this.f$0, this.f$1, this.f$2);
    }
}

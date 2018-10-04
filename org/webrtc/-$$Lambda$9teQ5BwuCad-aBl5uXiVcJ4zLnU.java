package org.webrtc;

public final /* synthetic */ class -$$Lambda$9teQ5BwuCad-aBl5uXiVcJ4zLnU implements Runnable {
    private final /* synthetic */ TextureBufferImpl f$0;

    public /* synthetic */ -$$Lambda$9teQ5BwuCad-aBl5uXiVcJ4zLnU(TextureBufferImpl textureBufferImpl) {
        this.f$0 = textureBufferImpl;
    }

    public final void run() {
        this.f$0.release();
    }
}

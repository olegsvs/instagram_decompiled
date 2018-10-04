package org.webrtc;

import java.util.concurrent.Callable;

public final /* synthetic */ class -$$Lambda$TextureBufferImpl$LiRTMmF7eRfFNZfCJkIBMN6wcLQ implements Callable {
    private final /* synthetic */ TextureBufferImpl f$0;

    public /* synthetic */ -$$Lambda$TextureBufferImpl$LiRTMmF7eRfFNZfCJkIBMN6wcLQ(TextureBufferImpl textureBufferImpl) {
        this.f$0 = textureBufferImpl;
    }

    public final Object call() {
        return this.f$0.yuvConverter.convert(this.f$0);
    }
}

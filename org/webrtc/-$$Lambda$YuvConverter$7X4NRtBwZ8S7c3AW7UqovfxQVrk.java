package org.webrtc;

import java.nio.ByteBuffer;

public final /* synthetic */ class -$$Lambda$YuvConverter$7X4NRtBwZ8S7c3AW7UqovfxQVrk implements Runnable {
    private final /* synthetic */ ByteBuffer f$0;

    public /* synthetic */ -$$Lambda$YuvConverter$7X4NRtBwZ8S7c3AW7UqovfxQVrk(ByteBuffer byteBuffer) {
        this.f$0 = byteBuffer;
    }

    public final void run() {
        JniCommon.nativeFreeByteBuffer(this.f$0);
    }
}

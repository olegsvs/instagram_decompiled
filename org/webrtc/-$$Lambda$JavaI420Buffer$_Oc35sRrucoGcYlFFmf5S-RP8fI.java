package org.webrtc;

import java.nio.ByteBuffer;

public final /* synthetic */ class -$$Lambda$JavaI420Buffer$_Oc35sRrucoGcYlFFmf5S-RP8fI implements Runnable {
    private final /* synthetic */ ByteBuffer f$0;

    public /* synthetic */ -$$Lambda$JavaI420Buffer$_Oc35sRrucoGcYlFFmf5S-RP8fI(ByteBuffer byteBuffer) {
        this.f$0 = byteBuffer;
    }

    public final void run() {
        JniCommon.nativeFreeByteBuffer(this.f$0);
    }
}

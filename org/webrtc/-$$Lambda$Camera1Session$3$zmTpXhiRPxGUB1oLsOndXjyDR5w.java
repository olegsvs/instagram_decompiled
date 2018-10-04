package org.webrtc;

import org.webrtc.Camera1Session.C02073;

public final /* synthetic */ class -$$Lambda$Camera1Session$3$zmTpXhiRPxGUB1oLsOndXjyDR5w implements Runnable {
    private final /* synthetic */ C02073 f$0;
    private final /* synthetic */ byte[] f$1;

    public /* synthetic */ -$$Lambda$Camera1Session$3$zmTpXhiRPxGUB1oLsOndXjyDR5w(C02073 c02073, byte[] bArr) {
        this.f$0 = c02073;
        this.f$1 = bArr;
    }

    public final void run() {
        C02073.lambda$onPreviewFrame$0(this.f$0, this.f$1);
    }
}

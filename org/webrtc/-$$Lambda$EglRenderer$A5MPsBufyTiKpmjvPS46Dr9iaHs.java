package org.webrtc;

import org.webrtc.EglBase.Context;

public final /* synthetic */ class -$$Lambda$EglRenderer$A5MPsBufyTiKpmjvPS46Dr9iaHs implements Runnable {
    private final /* synthetic */ EglRenderer f$0;
    private final /* synthetic */ Context f$1;
    private final /* synthetic */ int[] f$2;

    public /* synthetic */ -$$Lambda$EglRenderer$A5MPsBufyTiKpmjvPS46Dr9iaHs(EglRenderer eglRenderer, Context context, int[] iArr) {
        this.f$0 = eglRenderer;
        this.f$1 = context;
        this.f$2 = iArr;
    }

    public final void run() {
        EglRenderer.lambda$init$0(this.f$0, this.f$1, this.f$2);
    }
}

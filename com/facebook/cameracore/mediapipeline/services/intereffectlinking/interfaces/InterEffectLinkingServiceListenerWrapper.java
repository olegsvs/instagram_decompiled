package com.facebook.cameracore.mediapipeline.services.intereffectlinking.interfaces;

import X.AnonymousClass0OR;
import X.AnonymousClass2jl;
import X.AnonymousClass2jm;
import android.os.Handler;

public class InterEffectLinkingServiceListenerWrapper {
    /* renamed from: B */
    public final AnonymousClass2jl f33134B;
    /* renamed from: C */
    private final Handler f33135C;

    public void requestEffect(String str, boolean z, InterEffectLinkingFailureHandler interEffectLinkingFailureHandler) {
        AnonymousClass0OR.D(this.f33135C, new AnonymousClass2jm(this, str, z, interEffectLinkingFailureHandler), 1580069404);
    }
}

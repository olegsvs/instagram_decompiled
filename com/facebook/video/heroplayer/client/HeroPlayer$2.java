package com.facebook.video.heroplayer.client;

import X.AnonymousClass1H4;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

public class HeroPlayer$2 extends ResultReceiver {
    /* renamed from: B */
    public final /* synthetic */ Runnable f20606B;

    public HeroPlayer$2(AnonymousClass1H4 anonymousClass1H4, Handler handler, Runnable runnable) {
        this.f20606B = runnable;
        super(handler);
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        this.f20606B.run();
    }
}

package com.facebook.fbreact.autoupdater.ighttp;

import X.AnonymousClass1Lz;
import X.AnonymousClass1eN;
import X.AnonymousClass1eO;
import X.AnonymousClass1eQ;
import X.AnonymousClass1eR;
import android.app.IntentService;
import android.content.Intent;

public class IgHttpUpdateService extends IntentService {
    public IgHttpUpdateService() {
        super("IgHttpUpdateService");
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            new AnonymousClass1eN(this, AnonymousClass1Lz.m10919B(this), new AnonymousClass1eO(this), new AnonymousClass1eQ(this), new AnonymousClass1eR(intent.getStringExtra("IgSessionManager.USER_ID"))).m12290A();
        }
    }
}

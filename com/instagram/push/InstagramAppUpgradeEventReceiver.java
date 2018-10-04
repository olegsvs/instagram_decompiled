package com.instagram.push;

import X.AnonymousClass0F9;
import X.AnonymousClass0Kl;
import X.AnonymousClass0ap;
import X.AnonymousClass0cQ;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class InstagramAppUpgradeEventReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.m5854D(this, -760917670);
        AnonymousClass0F9.m1509C().m1518H(AnonymousClass0Kl.APP_UPGRADED);
        AnonymousClass0ap.m5491C();
        AnonymousClass0ap.m5490B().zIA();
        AnonymousClass0cQ.m5855E(this, context, intent, -373187546, D);
    }
}

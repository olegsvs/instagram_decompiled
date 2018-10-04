package com.instagram.store;

import X.AnonymousClass0Cd;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0F9;
import X.AnonymousClass0Kl;
import X.AnonymousClass0MM;
import X.AnonymousClass0cQ;
import X.AnonymousClass0dL;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.instagram.service.session.ShouldInitUserSession;

@ShouldInitUserSession
public class PendingActionReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.m5854D(this, 2118832900);
        AnonymousClass0F9.m1509C().m1518H(AnonymousClass0Kl.PENDING_ACTION_RECEIVER);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && AnonymousClass0MM.m3152H(context) && AnonymousClass0Cd.f1698B.m970N()) {
            AnonymousClass0Cm H = AnonymousClass0Ce.m951H(this);
            AnonymousClass0dL.m6024B(H).m6026B(context, null);
            AnonymousClass0dL.m6024B(H).m6028D();
        }
        AnonymousClass0cQ.m5855E(this, context, intent, 155358993, D);
    }
}

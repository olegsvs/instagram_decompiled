package com.instagram.push.fbns;

import X.AnonymousClass08U;
import X.AnonymousClass0Cd;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0F9;
import X.AnonymousClass0Kl;
import X.AnonymousClass0a2;
import X.AnonymousClass0ap;
import X.AnonymousClass0cQ;
import X.AnonymousClass1BY;
import X.AnonymousClass1Bi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.instagram.service.session.ShouldInitUserSession;

@ShouldInitUserSession
public class FbnsInitBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.m5854D(this, 1034830735);
        AnonymousClass0F9.m1509C().m1518H(AnonymousClass0Kl.FBNS);
        if (intent == null) {
            AnonymousClass0cQ.m5855E(this, context, intent, 1289756810, D);
        } else if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && !"android.intent.action.BOOT_COMPLETED".equals(intent.getAction()) && !"android.intent.action.USER_PRESENT".equals(intent.getAction()) && !"com.facebook.rti.intent.ACTION_FBNS_STARTED".equals(intent.getAction()) && !"com.facebook.rti.intent.ACTION_FBNS_STOPPED".equals(intent.getAction())) {
            AnonymousClass0cQ.m5855E(this, context, intent, 150658261, D);
        } else if (("com.facebook.rti.intent.ACTION_FBNS_STARTED".equals(intent.getAction()) || "com.facebook.rti.intent.ACTION_FBNS_STOPPED".equals(intent.getAction())) && !new AnonymousClass1Bi(context).m9867I(intent)) {
            AnonymousClass0cQ.m5855E(this, context, intent, -1844159087, D);
        } else {
            if (AnonymousClass1BY.m9829C()) {
                AnonymousClass08U.m526B(context);
            }
            if (AnonymousClass1BY.m9828B(context)) {
                String str = null;
                boolean z = false;
                if (AnonymousClass0Cd.f1698B.m970N()) {
                    AnonymousClass0Cm H = AnonymousClass0Ce.m951H(this);
                    str = H.f1759C;
                    z = AnonymousClass0a2.m5427L(H);
                }
                AnonymousClass0ap.m5490B().FW(str, z);
            }
            AnonymousClass0cQ.m5855E(this, context, intent, 170465598, D);
        }
    }
}

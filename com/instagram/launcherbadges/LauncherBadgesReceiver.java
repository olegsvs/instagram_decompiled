package com.instagram.launcherbadges;

import X.AnonymousClass0Cd;
import X.AnonymousClass0Ce;
import X.AnonymousClass0MO;
import X.AnonymousClass0cQ;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.instagram.service.session.ShouldInitUserSession;

@ShouldInitUserSession
public class LauncherBadgesReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        AnonymousClass0MO C;
        int D = AnonymousClass0cQ.D(this, 2147240836);
        String action = intent.getAction();
        if (AnonymousClass0Cd.f1698B.N()) {
            C = AnonymousClass0MO.C(AnonymousClass0Ce.H(this));
        } else {
            C = AnonymousClass0MO.E();
        }
        if ("com.smartisanos.launcher.ready".equals(action)) {
            C.B();
        } else if ("com.smartisanos.launcher.clear_message".equals(action)) {
            C.A();
        }
        AnonymousClass0cQ.E(this, context, intent, -1640893276, D);
    }
}

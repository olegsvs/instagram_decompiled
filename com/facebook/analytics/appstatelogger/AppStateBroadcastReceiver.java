package com.facebook.analytics.appstatelogger;

import X.AnonymousClass005;
import X.AnonymousClass0HX;
import X.AnonymousClass0cQ;
import X.AnonymousClass1oq;
import X.AnonymousClass1p8;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AppStateBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.D(this, -1656640902);
        if (AnonymousClass0HX.D().A(context, this, intent)) {
            String action = intent.getAction();
            if (action.equals("android.intent.action.BOOT_COMPLETED")) {
                Intent intent2 = new Intent(context, AppStateIntentService.class);
                intent2.setAction(AppStateIntentService.f1407B);
                intent2.putExtra(AppStateIntentService.f1408C, System.currentTimeMillis() / 1000);
                try {
                    AnonymousClass005.B(context, AppStateIntentService.class, "AppStateIntentService".hashCode(), intent2);
                } catch (Throwable e) {
                    AnonymousClass1oq B = AppStateLogger.m13343B();
                    if (B != null) {
                        B.m13329A("Could not start framework start intent service", e);
                    }
                }
            } else if (action.equals("android.intent.action.ACTION_SHUTDOWN")) {
                AppStateLogger.m13346E();
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                AnonymousClass1p8.m13361B(context).f23119B.edit().putLong("deviceShutdown", currentTimeMillis).apply();
            }
            AnonymousClass0cQ.E(this, context, intent, 483118374, D);
            return;
        }
        AnonymousClass0cQ.E(this, context, intent, 853075440, D);
    }
}

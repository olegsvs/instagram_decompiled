package com.facebook.analytics.appstatelogger;

import X.AnonymousClass09p;
import X.AnonymousClass0HX;
import X.AnonymousClass1p8;
import android.content.Intent;

public class AppStateIntentService extends AnonymousClass09p {
    /* renamed from: B */
    public static final String f1407B;
    /* renamed from: C */
    public static final String f1408C;

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(AppStateBroadcastReceiver.class.getCanonicalName());
        stringBuilder.append(".LOG_TO_SHARED_PREFS");
        f1407B = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(AppStateBroadcastReceiver.class.getPackage().getName());
        stringBuilder.append(".FRAMEWORK_TIME");
        f1408C = stringBuilder.toString();
    }

    /* renamed from: C */
    public final void mo173C(Intent intent) {
        if (intent != null) {
            if (AnonymousClass0HX.m2070D().mo1410A(this, this, intent)) {
                if (f1407B.equals(intent.getAction())) {
                    long longExtra = intent.getLongExtra(f1408C, System.currentTimeMillis() / 1000);
                    AnonymousClass1p8.B(getApplicationContext()).f23119B.edit().putLong("frameworkStartTime", longExtra).apply();
                }
            }
        }
    }
}

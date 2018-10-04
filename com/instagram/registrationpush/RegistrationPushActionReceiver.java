package com.instagram.registrationpush;

import X.AnonymousClass0Fr;
import X.AnonymousClass0IW;
import X.AnonymousClass0cQ;
import X.AnonymousClass1UE;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class RegistrationPushActionReceiver extends BroadcastReceiver {
    /* renamed from: B */
    public static PendingIntent m20181B(Context context, String str) {
        Intent intent = new Intent(context, RegistrationPushActionReceiver.class);
        intent.setAction(str);
        return PendingIntent.getBroadcast(context, 0, intent, 0);
    }

    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.D(this, 1560946096);
        AnonymousClass1UE B = AnonymousClass1UE.B(context);
        if ("com.instagram.registrationpush.ACTION_TAPPED".equals(intent.getAction())) {
            AnonymousClass0Fr.PushTapped.I();
            Intent intent2 = new Intent();
            intent2.setClassName(B.f19069C, "com.instagram.android.activity.MainTabActivity");
            intent2.setAction("android.intent.action.MAIN");
            intent2.addCategory("android.intent.category.LAUNCHER");
            intent2.addFlags(268435456);
            AnonymousClass0IW.I(intent2, B.f19069C);
        } else if ("com.instagram.registrationpush.ACTION_DELETED".equals(intent.getAction())) {
            AnonymousClass0Fr.PushDismissed.I();
        }
        AnonymousClass0cQ.E(this, context, intent, 277673059, D);
    }
}

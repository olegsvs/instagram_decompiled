package com.instagram.jobscheduler;

import X.AnonymousClass0IW;
import X.AnonymousClass0cQ;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

public class SchedulerAlarmBroadcastReceiverV2 extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.m5854D(this, 249023612);
        ComponentName componentName = new ComponentName(context, intent.getAction());
        Intent intent2 = new Intent();
        intent2.setComponent(componentName);
        intent2.putExtras(intent);
        AnonymousClass0IW.m2248N(intent2, context);
        AnonymousClass0cQ.m5855E(this, context, intent, -1341412553, D);
    }
}

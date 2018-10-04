package com.facebook.oxygen.preloads.sdk.firstparty.managedappcache;

import X.AnonymousClass0cQ;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.util.Log;
import com.facebook.C0164R;

public class IsManagedAppReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.D(this, -149583057);
        if (intent == null) {
            AnonymousClass0cQ.E(this, context, intent, 2081470689, D);
            return;
        }
        String action = intent.getAction();
        if (action.equals("com.facebook.oxygen.preloads.sdk.firstparty.managedappcache.IS_MANAGED_APP_CHANGED")) {
            if (VERSION.SDK_INT >= 26) {
                Class cls = IsManagedAppCacheJobService.class;
                new Intent(context, cls).setAction(action);
                ((JobScheduler) context.getApplicationContext().getSystemService("jobscheduler")).enqueue(new Builder(C0164R.id.managed_app_cache_job_id, new ComponentName(context, cls)).setOverrideDeadline(0).build(), new JobWorkItem(intent));
            } else {
                Intent intent2 = new Intent(context, IsManagedAppCacheService.class);
                intent2.setAction(action);
                if (context.startService(intent2) == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("sendIntent(): could not start service for intent action=");
                    stringBuilder.append(action);
                    Log.e("IsManagedAppReceiver", stringBuilder.toString());
                }
            }
            AnonymousClass0cQ.E(this, context, intent, -1954695994, D);
            return;
        }
        AnonymousClass0cQ.E(this, context, intent, -877942130, D);
    }
}

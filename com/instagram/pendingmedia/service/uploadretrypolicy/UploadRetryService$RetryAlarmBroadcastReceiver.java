package com.instagram.pendingmedia.service.uploadretrypolicy;

import X.AnonymousClass0IW;
import X.AnonymousClass0cQ;
import X.AnonymousClass1DI;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;

public class UploadRetryService$RetryAlarmBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.D(this, -255171960);
        if ("AutoRetryAlarm".equals(intent.getAction())) {
            WakeLock wakeLock = UploadRetryService.f3850E;
            if (wakeLock != null) {
                AnonymousClass1DI.B(wakeLock, 570737100);
            }
            AnonymousClass0IW.N(new Intent(context, UploadRetryService.class).setAction("AutoRetryAlarm").putExtra("IgSessionManager.USER_ID", intent.getStringExtra("IgSessionManager.USER_ID")), context);
        }
        AnonymousClass0cQ.E(this, context, intent, 1638649561, D);
    }
}

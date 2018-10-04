package com.instagram.common.analytics;

import X.AnonymousClass0FC;
import X.AnonymousClass0FD;
import X.AnonymousClass0FP;
import X.AnonymousClass0cQ;
import X.AnonymousClass0dn;
import X.AnonymousClass1OO;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AnalyticsUploadAlarmReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.m5854D(this, 1642389851);
        AnonymousClass0dn B = AnonymousClass0dn.m6109B(intent.getAction());
        if (B != null) {
            B.m6111A();
        }
        AnonymousClass0FD B2 = AnonymousClass0FC.m1519B();
        if (B2 instanceof AnonymousClass0FP) {
            AnonymousClass0FP anonymousClass0FP = (AnonymousClass0FP) B2;
            AnonymousClass0FP.m1613E(anonymousClass0FP, new AnonymousClass1OO(anonymousClass0FP));
        }
        AnonymousClass0cQ.m5855E(this, context, intent, 163410435, D);
    }
}

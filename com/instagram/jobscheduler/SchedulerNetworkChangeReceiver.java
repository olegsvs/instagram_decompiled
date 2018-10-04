package com.instagram.jobscheduler;

import X.AnonymousClass0Cd;
import X.AnonymousClass0Ce;
import X.AnonymousClass0IW;
import X.AnonymousClass0MM;
import X.AnonymousClass0cQ;
import X.AnonymousClass142;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.instagram.service.session.ShouldInitUserSession;
import java.util.Set;

@ShouldInitUserSession
public class SchedulerNetworkChangeReceiver extends BroadcastReceiver {
    /* renamed from: B */
    private static void m9151B(Context context) {
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, SchedulerNetworkChangeReceiver.class), 2, 1);
    }

    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.m5854D(this, 2051876086);
        if (AnonymousClass0Cd.f1698B.m970N()) {
            if (AnonymousClass0MM.m3155K(context)) {
                AnonymousClass142 B = AnonymousClass142.m9146B(AnonymousClass0Ce.m951H(this));
                synchronized (B) {
                    Set<String> A = B.m9147A();
                    B.f13819B.edit().remove("services_waiting_for_connectivity_change").apply();
                }
                for (String componentName : A) {
                    ComponentName componentName2 = new ComponentName(context, componentName);
                    Intent intent2 = new Intent();
                    intent2.setComponent(componentName2);
                    AnonymousClass0IW.m2248N(intent2, context);
                }
                m9151B(context);
            }
            AnonymousClass0cQ.m5855E(this, context, intent, 799911547, D);
            return;
        }
        m9151B(context);
        AnonymousClass0cQ.m5855E(this, context, intent, 62981278, D);
    }
}

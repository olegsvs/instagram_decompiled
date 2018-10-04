package com.instagram.notifications.push;

import X.AnonymousClass005;
import X.AnonymousClass09e;
import X.AnonymousClass0CC;
import X.AnonymousClass0Ea;
import X.AnonymousClass0Eb;
import X.AnonymousClass0F9;
import X.AnonymousClass0Fx;
import X.AnonymousClass0GG;
import X.AnonymousClass0Gn;
import X.AnonymousClass0IW;
import X.AnonymousClass0Kl;
import X.AnonymousClass0cQ;
import X.AnonymousClass1DI;
import X.AnonymousClass3Ai;
import X.AnonymousClass55V;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

public class GCMBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: B */
    public static void m11047B(Context context, Intent intent) {
        intent.putExtra("foreground", true);
        AnonymousClass0Eb anonymousClass0Eb = AnonymousClass0Ea.f1980C;
        anonymousClass0Eb.m1407j(26607617, ((Integer) AnonymousClass09e.f1096B.m914G()).intValue());
        anonymousClass0Eb.m1436J(26607617, "service", "gcm");
        anonymousClass0Eb.m1406i(26607617, 4000);
        AnonymousClass0IW.m2247M(intent, context);
    }

    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.m5854D(this, 1981960237);
        AnonymousClass0F9.m1509C().m1518H(AnonymousClass0Kl.NOTIFICATION_RECEIVED);
        intent.setClassName(context, GCMReceiver.class.getName());
        if (VERSION.SDK_INT >= 26) {
            boolean equals = "high".equals(intent.getStringExtra("google.priority"));
            if (!equals && ((Boolean) AnonymousClass0CC.FU.m914G()).booleanValue()) {
                AnonymousClass005.m5B(context, GCMJobService.class, AnonymousClass3Ai.f38581D, intent);
            } else if (equals) {
                try {
                    AnonymousClass0IW.m2248N(intent, context);
                } catch (Throwable e) {
                    AnonymousClass0Gn.m1879F("gcm_fail_to_start_service_with_high_pri", "Tried to start service with high priority GCM during app whitelist", e, 1);
                    if (((Boolean) AnonymousClass0CC.tV.m914G()).booleanValue()) {
                        WakeLock D2 = AnonymousClass1DI.m10052D((PowerManager) context.getSystemService("power"), 1, "GCMBroadcastReceiver", -1430620423);
                        AnonymousClass1DI.m10054F(D2, false, -1838053659);
                        AnonymousClass1DI.m10051C(D2, 60000, -1829790928);
                        AnonymousClass0GG.m1763B(AnonymousClass0Fx.m1698B(), new AnonymousClass55V(intent, context, D2), -162098790);
                    } else {
                        m11047B(context, intent);
                    }
                }
            } else {
                m11047B(context, intent);
            }
        } else {
            AnonymousClass0IW.m2248N(intent, context);
        }
        setResult(-1, null, null);
        AnonymousClass0cQ.m5855E(this, context, intent, 524911809, D);
    }
}

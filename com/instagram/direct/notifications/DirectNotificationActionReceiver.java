package com.instagram.direct.notifications;

import X.AnonymousClass0Cd;
import X.AnonymousClass0Dc;
import X.AnonymousClass0Gn;
import X.AnonymousClass0Vs;
import X.AnonymousClass0Vu;
import X.AnonymousClass0cQ;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class DirectNotificationActionReceiver extends AnonymousClass0Vs {
    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.m5854D(this, -148845702);
        if (AnonymousClass0Cd.f1698B.m970N()) {
            String stringExtra = intent.getStringExtra("IgSessionManager.USER_ID");
            if (stringExtra == null) {
                AnonymousClass0Dc.m1253P("DirectNotificationActionReceiver", "No user id to send from passed in");
                AnonymousClass0cQ.m5855E(this, context, intent, 1223760741, D);
                return;
            }
            String stringExtra2 = intent.getStringExtra("thread_id");
            if (stringExtra2 == null) {
                AnonymousClass0Dc.m1253P("DirectNotificationActionReceiver", "No thread id found in notification action");
                AnonymousClass0cQ.m5855E(this, context, intent, -1766998726, D);
                return;
            }
            if ("DirectNotificationActionReceiver.Like".equals(intent.getAction())) {
                AnonymousClass0Vs.m4912C(context, new Intent(context, DirectNotificationActionService.class).setAction("DirectNotificationActionService.Like").putExtra("IgSessionManager.USER_ID", stringExtra).putExtra("thread_id", stringExtra2));
            } else if ("DirectNotificationActionReceiver.Reply".equals(intent.getAction())) {
                CharSequence charSequence;
                Bundle vQ = AnonymousClass0Vu.f5792H.vQ(intent);
                if (vQ == null) {
                    charSequence = null;
                } else {
                    charSequence = vQ.getCharSequence("DirectNotificationConstants.DirectReply");
                }
                AnonymousClass0Vs.m4912C(context, new Intent(context, DirectNotificationActionService.class).setAction("DirectNotificationActionService.Reply").putExtra("IgSessionManager.USER_ID", stringExtra).putExtra("thread_id", stringExtra2).putExtra("reply", charSequence));
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown intent action: ");
                stringBuilder.append(intent.getAction());
                AnonymousClass0Gn.m1876C("DirectNotificationActionReceiver", stringBuilder.toString());
            }
            AnonymousClass0cQ.m5855E(this, context, intent, -615382090, D);
            return;
        }
        AnonymousClass0Dc.m1253P("DirectNotificationActionReceiver", "Received direct notification action whilst not logged in");
        AnonymousClass0cQ.m5855E(this, context, intent, 782902891, D);
    }
}

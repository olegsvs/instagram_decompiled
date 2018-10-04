package com.instagram.direct.notifications;

import X.AnonymousClass0Cd;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Dc;
import X.AnonymousClass0EE;
import X.AnonymousClass0Gn;
import X.AnonymousClass0Sy;
import X.AnonymousClass0Vm;
import X.AnonymousClass0Vs;
import X.AnonymousClass1Sk;
import X.AnonymousClass4h2;
import X.AnonymousClass4h3;
import X.AnonymousClass55Q;
import android.app.IntentService;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.concurrent.CountDownLatch;

public class DirectNotificationActionService extends IntentService implements AnonymousClass0EE {
    public final String getModuleName() {
        return "direct_notification_action_service";
    }

    public DirectNotificationActionService() {
        super("DirectNotificationActionService");
    }

    /* renamed from: B */
    public static void m24797B(DirectNotificationActionService directNotificationActionService, AnonymousClass0Cm anonymousClass0Cm, DirectThreadKey directThreadKey) {
        AnonymousClass55Q.C().B(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, AnonymousClass0Vm.B(anonymousClass0Cm.f1759C, directThreadKey.f5871C, null));
        directNotificationActionService.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }

    /* renamed from: C */
    public static void m24798C(Runnable runnable) {
        if (AnonymousClass0Sy.E()) {
            runnable.run();
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AnonymousClass0Sy.G(new AnonymousClass1Sk(runnable, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Runnable runnable2) {
            AnonymousClass0Gn.J("DirectNotificationActionService", "Error waiting for task to complete on UI thread", runnable2);
        }
    }

    /* renamed from: D */
    public static void m24799D(DirectNotificationActionService directNotificationActionService, int i) {
        AnonymousClass0Sy.D("Trying to show toast from non-ui thread");
        Toast.makeText(directNotificationActionService.getApplicationContext(), i, 1).show();
    }

    /* renamed from: E */
    private void m24800E(Intent intent) {
        Object stringExtra = intent.getStringExtra("IgSessionManager.USER_ID");
        if (stringExtra == null) {
            AnonymousClass0Dc.P("DirectNotificationActionService", "No user id to send from passed in");
            return;
        }
        String stringExtra2 = intent.getStringExtra("thread_id");
        if (stringExtra2 == null) {
            AnonymousClass0Dc.P("DirectNotificationActionService", "No thread id found in notification action");
            return;
        }
        AnonymousClass0Cm G = AnonymousClass0Ce.G(intent.getExtras());
        if (!AnonymousClass0Cd.f1698B.J() || TextUtils.equals(G.f1759C, stringExtra)) {
            DirectThreadKey directThreadKey = new DirectThreadKey(stringExtra2);
            if ("DirectNotificationActionService.Like".equals(intent.getAction())) {
                G.B();
                m24798C(new AnonymousClass4h2(this, G, directThreadKey));
            } else if ("DirectNotificationActionService.Reply".equals(intent.getAction())) {
                CharSequence charSequenceExtra = intent.getCharSequenceExtra("reply");
                if (TextUtils.isEmpty(charSequenceExtra)) {
                    AnonymousClass0Gn.C("DirectNotificationActionService", "Got notification reply action with no input");
                    m24797B(this, G, directThreadKey);
                } else {
                    G.B();
                    m24798C(new AnonymousClass4h3(this, G, directThreadKey, charSequenceExtra));
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown intent action: ");
                stringBuilder.append(intent.getAction());
                AnonymousClass0Gn.C("DirectNotificationActionService", stringBuilder.toString());
            }
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Attempting to send from notification action when logged into a different account (");
        stringBuilder.append(G.f1759C);
        stringBuilder.append(" != ");
        stringBuilder.append(stringExtra);
        stringBuilder.append(")");
        AnonymousClass0Gn.C("DirectNotificationActionService", stringBuilder.toString());
    }

    public final void onHandleIntent(Intent intent) {
        try {
            m24800E(intent);
        } finally {
            AnonymousClass0Vs.B(intent);
        }
    }
}

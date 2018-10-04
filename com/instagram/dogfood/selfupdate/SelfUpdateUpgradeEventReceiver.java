package com.instagram.dogfood.selfupdate;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cn;
import X.AnonymousClass0FF;
import X.AnonymousClass0FL;
import X.AnonymousClass0NN;
import X.AnonymousClass0cQ;
import X.AnonymousClass3Jw;
import X.AnonymousClass3K0;
import X.AnonymousClass3KG;
import X.AnonymousClass3KK;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.instagram.service.session.ShouldInitUserSession;

@ShouldInitUserSession
public class SelfUpdateUpgradeEventReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.m5854D(this, 1214446933);
        if (intent.getData() != null && "android.intent.action.PACKAGE_REPLACED".equals(intent.getAction()) && context.getPackageName().equals(intent.getData().getSchemeSpecificPart())) {
            AnonymousClass0Cn F = AnonymousClass0Ce.m949F((Object) this);
            if (F.xX() && AnonymousClass3KG.B(AnonymousClass0FL.m1559B(F), context)) {
                int B = AnonymousClass0FF.m1523B(context);
                AnonymousClass3Jw B2 = AnonymousClass3K0.B(context);
                if (B2 != null) {
                    int i = B2.f40127E;
                    if (i == B) {
                        AnonymousClass0NN.m3291B("self_update_job_install_success", null).m3294B("build_number", i).m3310R();
                    }
                }
                AnonymousClass3KK.B(context);
            }
        }
        AnonymousClass0cQ.m5855E(this, context, intent, -105564410, D);
    }
}

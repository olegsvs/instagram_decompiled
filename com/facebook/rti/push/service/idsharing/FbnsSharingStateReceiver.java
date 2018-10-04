package com.facebook.rti.push.service.idsharing;

import X.AnonymousClass0Dc;
import X.AnonymousClass0cQ;
import X.AnonymousClass1Bi;
import X.AnonymousClass1D6;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FbnsSharingStateReceiver extends BroadcastReceiver {
    /* renamed from: B */
    private static final String f1017B = "FbnsSharingStateReceiver";

    /* renamed from: B */
    private void m553B(Context context, Intent intent) {
        if (AnonymousClass1D6.m9967B(context, AnonymousClass1D6.f15631E).getBoolean("sharing_state_enabled", false)) {
            SharedPreferences B = AnonymousClass1D6.m9967B(context, AnonymousClass1D6.f15632F);
            String str = JsonProperty.USE_DEFAULT_NAME;
            String string = B.getString("/settings/mqtt/id/mqtt_device_id", str);
            String string2 = B.getString("/settings/mqtt/id/mqtt_device_secret", str);
            String str2 = "/settings/mqtt/id/timestamp";
            long j = B.getLong(str2, Long.MAX_VALUE);
            Bundle resultExtras = getResultExtras(true);
            resultExtras.putString("/settings/mqtt/id/mqtt_device_id", string);
            resultExtras.putString("/settings/mqtt/id/mqtt_device_secret", string2);
            resultExtras.putLong(str2, j);
            setResult(-1, null, resultExtras);
            return;
        }
        Bundle resultExtras2 = getResultExtras(true);
        String str3 = JsonProperty.USE_DEFAULT_NAME;
        resultExtras2.putString("/settings/mqtt/id/mqtt_device_id", str3);
        resultExtras2.putString("/settings/mqtt/id/mqtt_device_secret", str3);
        resultExtras2.putLong("/settings/mqtt/id/timestamp", Long.MAX_VALUE);
        setResult(-1, null, resultExtras2);
    }

    /* renamed from: C */
    private void m554C(Context context, Intent intent) {
        if (intent.getStringExtra("pkg_name") != null) {
            int i = AnonymousClass1D6.m9967B(context, AnonymousClass1D6.f15631E).getInt("shared_qe_flag", -1);
            Bundle resultExtras = getResultExtras(true);
            resultExtras.putInt("shared_qe_flag", i);
            setResult(-1, null, resultExtras);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.m5854D(this, 331409989);
        if (intent == null) {
            AnonymousClass0cQ.m5855E(this, context, intent, 814868148, D);
            return;
        }
        String action = intent.getAction();
        if (new AnonymousClass1Bi(context).m9867I(intent)) {
            if ("com.facebook.rti.fbns.intent.SHARE_IDS".equals(action)) {
                m553B(context, intent);
            } else if ("com.facebook.rti.intent.SHARED_QE_FLAG_REQUEST".equals(action)) {
                m554C(context, intent);
            }
            AnonymousClass0cQ.m5855E(this, context, intent, -1840099475, D);
            return;
        }
        AnonymousClass0Dc.m1243F(f1017B, "Rejecting device credentials sharing request due to failed auth");
        AnonymousClass0cQ.m5855E(this, context, intent, 1650811313, D);
    }
}

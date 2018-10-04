package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.07T */
public final class AnonymousClass07T extends BroadcastReceiver {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Ao f543B;

    public AnonymousClass07T(AnonymousClass0Ao anonymousClass0Ao) {
        this.f543B = anonymousClass0Ao;
    }

    public final void onReceive(Context context, Intent intent) {
        BroadcastReceiver broadcastReceiver = this;
        int D = AnonymousClass0cQ.m5854D(this, -1504088523);
        Intent intent2 = intent;
        Context context2 = context;
        if (AnonymousClass0HX.m2070D().mo1410A(context, this, intent2)) {
            if (intent != null && "com.facebook.rti.mqtt.ACTION_ZR_SWITCH".equals(intent2.getAction())) {
                String stringExtra = intent2.getStringExtra("extra_mqtt_endpoint");
                String stringExtra2 = intent2.getStringExtra("extra_analytics_endpoint");
                String stringExtra3 = intent2.getStringExtra("extra_fbns_endpoint");
                intent = intent2.getStringExtra("extra_fbns_analytics_endpoint");
                String str;
                if (new AnonymousClass1Bi(context, this.f543B.f1297F).m9867I(intent2)) {
                    if (AnonymousClass0Ao.m715B(broadcastReceiver.f543B, stringExtra)) {
                        if (AnonymousClass0Ao.m715B(broadcastReceiver.f543B, stringExtra3)) {
                            AnonymousClass0Ao anonymousClass0Ao = broadcastReceiver.f543B;
                            if (anonymousClass0Ao.f1299H == AnonymousClass1ic.FBNS || anonymousClass0Ao.f1299H == AnonymousClass1ic.PreloadedFBNS) {
                                if (!AnonymousClass1Cn.m9924D(stringExtra3)) {
                                    stringExtra = stringExtra3;
                                }
                                if (!AnonymousClass1Cn.m9924D(intent)) {
                                    stringExtra2 = intent;
                                }
                            }
                            if (!(AnonymousClass1Cn.m9926F(anonymousClass0Ao.f1298G, stringExtra) && AnonymousClass1Cn.m9926F(anonymousClass0Ao.f1293B, stringExtra2))) {
                                anonymousClass0Ao.f1298G = stringExtra;
                                anonymousClass0Ao.f1293B = stringExtra2;
                                anonymousClass0Ao.f1295D.mo129F();
                            }
                        }
                    }
                    str = "ZeroRatingConnectionConfigOverrides";
                    String str2 = "ignore illegal target endpoint switch %s, %s, %s, %s";
                    AnonymousClass0Dc.m1255R(str, str2, stringExtra, stringExtra2, stringExtra3, intent);
                    if (broadcastReceiver.f543B.f1297F != null) {
                        broadcastReceiver.f543B.f1297F.softReportFailHarder(str, AnonymousClass1Cn.m9922B(str2, stringExtra, stringExtra2, stringExtra3, intent));
                    }
                    AnonymousClass0cQ.m5855E(broadcastReceiver, context2, intent2, 333484832, D);
                    return;
                }
                str = "ZeroRatingConnectionConfigOverrides";
                AnonymousClass0Dc.m1255R(str, "ignore unauthorized sender %s, %s, %s, %s", stringExtra, stringExtra2, stringExtra3, intent);
                if (broadcastReceiver.f543B.f1297F != null) {
                    broadcastReceiver.f543B.f1297F.softReportFailHarder(str, AnonymousClass1Cn.m9922B("unauthorized endpoint request to %s, %s, %s, %s", stringExtra, stringExtra2, stringExtra3, intent));
                }
                AnonymousClass0cQ.m5855E(broadcastReceiver, context2, intent2, -890614440, D);
                return;
            }
            AnonymousClass0cQ.m5855E(broadcastReceiver, context2, intent2, 1261454228, D);
            return;
        }
        AnonymousClass0cQ.m5855E(this, context, intent2, 804962651, D);
    }
}

package com.instagram.util.share;

import X.AnonymousClass0NN;
import X.AnonymousClass0cQ;
import X.AnonymousClass3oH;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;

public class ShareUtil$ChosenComponentReceiver extends BroadcastReceiver {
    /* renamed from: B */
    private void m20737B(Intent intent) {
        String stringExtra = intent.getStringExtra("log_event_name");
        if (stringExtra != null) {
            AnonymousClass0NN B = AnonymousClass0NN.B(stringExtra, new AnonymousClass3oH(this, intent.getStringExtra("log_event_module_name")));
            Serializable serializableExtra = intent.getSerializableExtra("log_event_extras");
            if (serializableExtra instanceof HashMap) {
                B.P((HashMap) serializableExtra);
            }
            Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
            if (parcelableExtra instanceof ComponentName) {
                ComponentName componentName = (ComponentName) parcelableExtra;
                B.F("selection_package", componentName.getPackageName());
                B.F("selection_class", componentName.getClassName());
                B.F("selection_short_class", componentName.getShortClassName());
            }
            B.R();
        }
    }

    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.D(this, 1572473312);
        m20737B(intent);
        AnonymousClass0cQ.E(this, context, intent, 2061294867, D);
    }
}

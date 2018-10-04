package com.instagram.api.useragent;

import X.AnonymousClass0FJ;
import X.AnonymousClass0Nl;
import X.AnonymousClass0cQ;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class LocationChangeReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.D(this, -529250968);
        AnonymousClass0Nl.f3693B = null;
        synchronized (AnonymousClass0FJ.class) {
            AnonymousClass0FJ.f2108B = null;
        }
        AnonymousClass0cQ.E(this, context, intent, 2008594354, D);
    }
}

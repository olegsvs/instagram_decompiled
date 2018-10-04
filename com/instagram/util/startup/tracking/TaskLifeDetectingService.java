package com.instagram.util.startup.tracking;

import X.AnonymousClass0F9;
import X.AnonymousClass0cQ;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class TaskLifeDetectingService extends Service {
    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onDestroy() {
        int J = AnonymousClass0cQ.m5860J(this, 927670871);
        super.onDestroy();
        AnonymousClass0cQ.m5861K(this, 834886698, J);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        AnonymousClass0cQ.m5861K(this, -791815545, AnonymousClass0cQ.m5860J(this, 374556871));
        return 2;
    }

    public final void onTaskRemoved(Intent intent) {
        AnonymousClass0F9 C = AnonymousClass0F9.m1509C();
        if (C.f2070C != null) {
            C.m1515E(AnonymousClass0F9.f2065G);
        }
        stopSelf();
    }
}

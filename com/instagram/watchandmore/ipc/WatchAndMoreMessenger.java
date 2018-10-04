package com.instagram.watchandmore.ipc;

import X.AnonymousClass3qY;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;

public class WatchAndMoreMessenger extends Service {
    /* renamed from: B */
    private final Messenger f45258B = new Messenger(new AnonymousClass3qY());

    public final IBinder onBind(Intent intent) {
        return this.f45258B.getBinder();
    }
}

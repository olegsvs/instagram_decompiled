package com.instagram.lazyload.instagram;

import X.AnonymousClass1I2;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;

public class MainProcessCallbackService extends Service {
    /* renamed from: B */
    private final Messenger f16062B = new Messenger(new AnonymousClass1I2(this));

    /* renamed from: B */
    public static String m10365B(String str) {
        String[] split = str.split("java.com.");
        return split.length > 1 ? split[1] : str;
    }

    public final IBinder onBind(Intent intent) {
        return this.f16062B.getBinder();
    }
}

package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.zzv;

public final class RevocationBoundService extends Service {
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction())) {
            boolean isLoggable = Log.isLoggable("RevocationService", 2);
            return new zzv(this);
        }
        String str = "RevocationService";
        String str2 = "Unknown action sent to RevocationBoundService: ";
        String valueOf = String.valueOf(intent.getAction());
        Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        return null;
    }
}

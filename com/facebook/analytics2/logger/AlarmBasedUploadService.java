package com.facebook.analytics2.logger;

import X.AnonymousClass0LR;
import X.AnonymousClass0cQ;
import X.AnonymousClass46o;
import X.AnonymousClass46p;
import android.app.AlarmManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.TimeUnit;

public class AlarmBasedUploadService extends Service {
    /* renamed from: C */
    public static final long f50261C = TimeUnit.HOURS.toMillis(6);
    /* renamed from: D */
    public static final long f50262D = TimeUnit.MINUTES.toMillis(5);
    /* renamed from: E */
    public static AlarmManager f50263E;
    /* renamed from: B */
    private AnonymousClass46p f50264B;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        int J = AnonymousClass0cQ.J(this, -1346410516);
        this.f50264B = AnonymousClass46p.m23257B(this);
        AnonymousClass0cQ.K(this, 192141211, J);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int J = AnonymousClass0cQ.J(this, 1376750835);
        if (intent != null) {
            String str = "com.facebook.analytics2.logger.UPLOAD_NOW";
            if (intent.getAction().startsWith(str)) {
                intent.setAction(str);
            }
        }
        int A = ((AnonymousClass46p) AnonymousClass0LR.D(this.f50264B)).m23260A(intent, new AnonymousClass46o(this, i2), 2);
        AnonymousClass0cQ.K(this, -103674956, J);
        return A;
    }
}

package com.facebook.voltron.download;

import X.AnonymousClass0LR;
import X.AnonymousClass0cQ;
import X.AnonymousClass1yO;
import X.AnonymousClass1yQ;
import android.app.AlarmManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.TimeUnit;

public class AppModuleAlarmBasedDownloader extends Service {
    /* renamed from: C */
    public static final long f24906C = TimeUnit.DAYS.toMillis(1);
    /* renamed from: D */
    public static final long f24907D = TimeUnit.MINUTES.toMillis(1);
    /* renamed from: E */
    public static AlarmManager f24908E;
    /* renamed from: B */
    private AnonymousClass1yQ f24909B;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        int J = AnonymousClass0cQ.J(this, -1490643814);
        this.f24909B = new AnonymousClass1yQ(this);
        AnonymousClass0cQ.K(this, 1931017599, J);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int J = AnonymousClass0cQ.J(this, 960832097);
        ((AnonymousClass1yQ) AnonymousClass0LR.D(this.f24909B)).onStartJob(-1, intent.getExtras(), new AnonymousClass1yO(this, intent, this, i2));
        AnonymousClass0cQ.K(this, 1023872433, J);
        return 3;
    }
}

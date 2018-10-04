package com.instagram.pendingmedia.service.uploadretrypolicy;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Dc;
import X.AnonymousClass0GK;
import X.AnonymousClass0IW;
import X.AnonymousClass0cQ;
import X.AnonymousClass1DI;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.SystemClock;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class UploadRetryService extends Service {
    /* renamed from: C */
    private static Boolean f3848C;
    /* renamed from: D */
    private static boolean f3849D;
    /* renamed from: E */
    public static WakeLock f3850E;
    /* renamed from: B */
    private AlarmManager f3851B;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* renamed from: B */
    public static void m3609B(Context context, AnonymousClass0Cm anonymousClass0Cm, boolean z) {
        if (VERSION.SDK_INT < 26) {
            Boolean bool = f3848C;
            if (bool == null || bool.booleanValue() != z) {
                f3848C = Boolean.valueOf(z);
                AnonymousClass0IW.m2248N(new Intent(context, UploadRetryService.class).setAction("UpdateServiceState").putExtra("EnableReceiver", z).putExtra("IgSessionManager.USER_ID", anonymousClass0Cm.f1759C), context);
            }
        }
    }

    /* renamed from: C */
    public static AlarmManager m3610C(UploadRetryService uploadRetryService) {
        if (uploadRetryService.f3851B == null) {
            uploadRetryService.f3851B = (AlarmManager) uploadRetryService.getSystemService("alarm");
        }
        return uploadRetryService.f3851B;
    }

    /* renamed from: D */
    private WakeLock m3611D() {
        if (f3850E == null) {
            PowerManager powerManager = (PowerManager) getSystemService("power");
            synchronized (this) {
                if (f3850E == null) {
                    f3850E = AnonymousClass1DI.m10052D(powerManager, 1, "UploadServiceWakeLock", -293018117);
                    AnonymousClass1DI.m10054F(f3850E, false, 981036502);
                }
            }
        }
        return f3850E;
    }

    /* renamed from: E */
    private void m3612E(int i, long j, PendingIntent pendingIntent, long j2, boolean z) {
        int i2 = i;
        long j3 = j;
        PendingIntent pendingIntent2 = pendingIntent;
        if (VERSION.SDK_INT < 19) {
            m3610C(this).set(i, j, pendingIntent2);
            return;
        }
        long j4 = 180000;
        long j5 = j2 >= 0 ? (20 * j2) / 100 : 180000;
        if (z) {
            j4 = 3000;
        }
        m3610C(this).setWindow(i2, j3, Math.min(j5, j4), pendingIntent2);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        Service service = this;
        int J = AnonymousClass0cQ.m5860J(this, -36964256);
        if (intent != null) {
            try {
                if ("UpdateServiceState".equals(intent.getAction())) {
                    AnonymousClass1DI.m10050B(m3611D(), 2084443867);
                    if (f3848C == null || f3849D != f3848C.booleanValue()) {
                        if (f3848C == null) {
                            f3848C = Boolean.valueOf(intent.getBooleanExtra("EnableReceiver", true));
                        }
                        f3849D = f3848C.booleanValue();
                        ConnectivityChangeReceiver.C(this, f3849D);
                        if (f3849D) {
                        }
                    }
                } else if ("Connected".equals(intent.getAction())) {
                    f3849D = true;
                    AnonymousClass0GK.m1772F(this, AnonymousClass0Ce.m950G(intent.getExtras()), "connectivity wakeup").m1788D(intent.getBooleanExtra("ConnectedToWifi", false));
                } else if ("ScheduleAlarm".equals(intent.getAction())) {
                    PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent(this, UploadRetryService$RetryAlarmBroadcastReceiver.class).setAction("AutoRetryAlarm").putExtra("IgSessionManager.USER_ID", intent.getStringExtra("IgSessionManager.USER_ID")), 268435456);
                    i2 = intent.getBooleanExtra("AlarmExact", false);
                    if (intent.hasExtra("AlarmDelay")) {
                        intent = intent.getLongExtra("AlarmDelay", 120000);
                        m3612E(2, SystemClock.elapsedRealtime() + intent, broadcast, intent, i2);
                        Long.valueOf(intent / 1000);
                    } else if (intent.hasExtra("AlarmTime")) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long longExtra = intent.getLongExtra("AlarmTime", 120000 + currentTimeMillis);
                        intent = longExtra - currentTimeMillis;
                        m3612E(0, longExtra, broadcast, intent, i2);
                        if (AnonymousClass0Dc.m1247J(3)) {
                            new SimpleDateFormat("HH:mm:ss.SSS", Locale.US).format(new Date(longExtra));
                            Long.valueOf(intent / 1000);
                        }
                    }
                } else if ("AutoRetryAlarm".equals(intent.getAction())) {
                    AnonymousClass0GK.m1769C(AnonymousClass0GK.m1772F(this, AnonymousClass0Ce.m950G(intent.getExtras()), "alarm wakeup"), "retry alarm", false);
                }
            } catch (Throwable th) {
                AnonymousClass1DI.m10053E(m3611D(), 167168247);
                AnonymousClass0cQ.m5861K(service, 1233054657, J);
            }
        }
        AnonymousClass1DI.m10053E(m3611D(), -1560069368);
        AnonymousClass0cQ.m5861K(service, -993828779, J);
        return 2;
    }
}

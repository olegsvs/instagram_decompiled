package X;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.facebook.C0164R;
import com.instagram.registrationpush.RegistrationPushActionReceiver;
import com.instagram.registrationpush.RegistrationPushAlarmReceiver;

/* renamed from: X.1UE */
public final class AnonymousClass1UE implements AnonymousClass0EJ {
    /* renamed from: E */
    private static AnonymousClass1UE f19067E;
    /* renamed from: B */
    public final AlarmManager f19068B;
    /* renamed from: C */
    public final Context f19069C;
    /* renamed from: D */
    public final NotificationManager f19070D = ((NotificationManager) this.f19069C.getSystemService("notification"));

    private AnonymousClass1UE(Context context) {
        this.f19069C = context;
        this.f19068B = (AlarmManager) context.getSystemService("alarm");
    }

    /* renamed from: A */
    public final void m11575A() {
        Context context = this.f19069C;
        Intent intent = new Intent(this.f19069C, RegistrationPushAlarmReceiver.class);
        intent.setAction("RegistrationPush.PUSH_ACTION");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 536870912);
        if (broadcast != null) {
            this.f19068B.cancel(broadcast);
        }
        this.f19070D.cancel("registration", 64278);
    }

    /* renamed from: B */
    public static synchronized AnonymousClass1UE m11574B(Context context) {
        AnonymousClass1UE anonymousClass1UE;
        synchronized (AnonymousClass1UE.class) {
            if (f19067E == null) {
                f19067E = new AnonymousClass1UE(context.getApplicationContext());
            }
            anonymousClass1UE = f19067E;
        }
        return anonymousClass1UE;
    }

    /* renamed from: B */
    public final void m11576B() {
        if (!AnonymousClass1Pj.m11285F()) {
            if (!AnonymousClass1Pj.m11282C()) {
                if (AnonymousClass0Fj.f2192B.m1668C()) {
                    synchronized (AnonymousClass1Pj.class) {
                        AnonymousClass1Pj.f18216F.B(Boolean.valueOf(true));
                    }
                    AnonymousClass0Fr.Pushable.m1693I();
                    AnonymousClass0RT D = new AnonymousClass0RT(this.f19069C, "ig_other").m4171C(true).m4177I(AnonymousClass0G5.m1726G(this.f19069C, C0164R.attr.defaultNotificationIcon, C0164R.drawable.notification_icon)).m4173E(this.f19069C.getString(C0164R.string.instagram)).m4172D(this.f19069C.getString(C0164R.string.local_push_prompt));
                    D.f4681K = RegistrationPushActionReceiver.B(this.f19069C, "com.instagram.registrationpush.ACTION_TAPPED");
                    Notification B = D.m4175G(RegistrationPushActionReceiver.B(this.f19069C, "com.instagram.registrationpush.ACTION_DELETED")).m4170B();
                    AnonymousClass0Fr.Pushed.m1685A().m3294B("time_variation", 30).m3310R();
                    this.f19070D.notify("registration", 64278, B);
                    return;
                }
                return;
            }
        }
        AnonymousClass0Fj.f2192B.m1669D(this);
    }

    public final void onAppBackgrounded() {
        m11575A();
        if (AnonymousClass1Pj.m11282C() || AnonymousClass1Pj.m11285F()) {
            AnonymousClass0Fj.f2192B.m1669D(this);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() + (((long) 30) * 60000);
        Context context = this.f19069C;
        Intent intent = new Intent(this.f19069C, RegistrationPushAlarmReceiver.class);
        intent.setAction("RegistrationPush.PUSH_ACTION");
        this.f19068B.set(2, elapsedRealtime, PendingIntent.getBroadcast(context, 0, intent, 134217728));
    }

    public final void onAppForegrounded() {
        m11575A();
    }
}

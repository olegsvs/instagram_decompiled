package com.instagram.video.videocall.service;

import X.AnonymousClass0CC;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Oq;
import X.AnonymousClass0RT;
import X.AnonymousClass0RU;
import X.AnonymousClass0cQ;
import X.AnonymousClass1F1;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.facebook.C0164R;

public class VideoCallService extends Service {
    /* renamed from: B */
    public AnonymousClass0Cm f72647B;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* renamed from: A */
    public final Notification m29301A(Intent intent) {
        if (!((Boolean) AnonymousClass0CC.ti.H(this.f72647B)).booleanValue()) {
            return null;
        }
        Intent intent2 = intent.setPackage(getPackageName());
        CharSequence string = getString(C0164R.string.videocall_ongoing_notification_text);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent2, 268435456);
        AnonymousClass0RT E = new AnonymousClass0RT(this, "ig_other").E(getString(C0164R.string.videocall_headline));
        E.f4681K = activity;
        AnonymousClass0RT D = E.I(C0164R.drawable.video_call).J(new AnonymousClass1F1().C(string)).D(string);
        AnonymousClass0RT.C(D, 2, true);
        AnonymousClass0RT C = D.C(true);
        Intent intent3 = new Intent(this, VideoCallService.class);
        intent3.setAction("com.instagram.android.intent.action.LEAVE_VIDEO_CALL");
        E = C.A(new AnonymousClass0RU(0, getString(C0164R.string.videocall_leave_action), PendingIntent.getService(this, 0, intent3, 268435456)));
        E.f4697a = 2;
        Notification B = E.B();
        B.flags |= 32;
        return B;
    }

    public final void onCreate() {
        int J = AnonymousClass0cQ.J(this, 1307215084);
        super.onCreate();
        AnonymousClass0Oq B = AnonymousClass0Oq.B();
        if (!(B.f3948B.f63326B || B.f3948B.f63327C)) {
            AnonymousClass0Oq.D(B);
        }
        B.f3948B.f63327C = true;
        AnonymousClass0cQ.K(this, -190130948, J);
    }

    public final void onDestroy() {
        int J = AnonymousClass0cQ.J(this, -1322406207);
        super.onDestroy();
        AnonymousClass0Oq B = AnonymousClass0Oq.B();
        if (!B.f3948B.f63326B && B.f3948B.f63327C) {
            AnonymousClass0Oq.E(B);
        }
        B.f3948B.f63327C = false;
        AnonymousClass0cQ.K(this, -1424364231, J);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int onStartCommand(android.content.Intent r6, int r7, int r8) {
        /*
        r5 = this;
        r0 = -1825079450; // 0xffffffff93377f66 float:-2.316066E-27 double:NaN;
        r3 = X.AnonymousClass0cQ.J(r5, r0);
        r2 = r6.getAction();
        r1 = r2.hashCode();
        r0 = -1922087384; // 0xffffffff8d6f4628 float:-7.373201E-31 double:NaN;
        r4 = 1;
        if (r1 == r0) goto L_0x0034;
    L_0x0015:
        r0 = -324068989; // 0xffffffffecaf1983 float:-1.69346E27 double:NaN;
        if (r1 == r0) goto L_0x002a;
    L_0x001a:
        r0 = 1405139896; // 0x53c0bbb8 float:1.65556624E12 double:6.9423135E-315;
        if (r1 == r0) goto L_0x0020;
    L_0x001f:
        goto L_0x003e;
    L_0x0020:
        r0 = "com.instagram.android.intent.action.LEAVE_VIDEO_CALL";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x003e;
    L_0x0028:
        r0 = 1;
        goto L_0x003f;
    L_0x002a:
        r0 = "com.instagram.android.intent.action.START_VIDEO_CALL_SERVICE";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x003e;
    L_0x0032:
        r0 = 0;
        goto L_0x003f;
    L_0x0034:
        r0 = "com.instagram.android.intent.action.CHANGE_VIDEO_CALL_SERVICE_FOREGROUND_STATUS";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x003e;
    L_0x003c:
        r0 = 2;
        goto L_0x003f;
    L_0x003e:
        r0 = -1;
    L_0x003f:
        switch(r0) {
            case 0: goto L_0x0076;
            case 1: goto L_0x005e;
            case 2: goto L_0x0043;
            default: goto L_0x0042;
        };
    L_0x0042:
        goto L_0x0080;
    L_0x0043:
        r0 = "notification_intent";
        r0 = r6.getParcelableExtra(r0);
        r0 = (android.content.Intent) r0;
        if (r0 != 0) goto L_0x0051;
    L_0x004d:
        r5.stopForeground(r4);
        goto L_0x0080;
    L_0x0051:
        r1 = r5.m29301A(r0);
        if (r1 == 0) goto L_0x0080;
    L_0x0057:
        r0 = 1910377639; // 0x71de0ca7 float:2.199071E30 double:9.43851962E-315;
        r5.startForeground(r0, r1);
        goto L_0x0080;
    L_0x005e:
        r0 = r5.f72647B;
        if (r0 != 0) goto L_0x006a;
    L_0x0062:
        r1 = "VideoCallService";
        r0 = "Null userSession when attempting to leave call";
        X.AnonymousClass0Gn.H(r1, r0);
        goto L_0x004d;
    L_0x006a:
        r2 = X.AnonymousClass0JS.f2919B;
        r1 = r5.f72647B;
        r0 = r5.getApplicationContext();
        r2.M(r1, r0);
        goto L_0x004d;
    L_0x0076:
        r0 = r6.getExtras();
        r0 = X.AnonymousClass0Ce.G(r0);
        r5.f72647B = r0;
    L_0x0080:
        r0 = -1947503544; // 0xffffffff8beb7448 float:-9.069367E-32 double:NaN;
        X.AnonymousClass0cQ.K(r5, r0, r3);
        r0 = 2;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.videocall.service.VideoCallService.onStartCommand(android.content.Intent, int, int):int");
    }
}

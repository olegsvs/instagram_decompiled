package com.instagram.notifications.push;

import X.AnonymousClass08s;
import X.AnonymousClass09e;
import X.AnonymousClass0CB;
import X.AnonymousClass0CC;
import X.AnonymousClass0EA;
import X.AnonymousClass0Ea;
import X.AnonymousClass0Eb;
import X.AnonymousClass0F9;
import X.AnonymousClass0Fx;
import X.AnonymousClass0G5;
import X.AnonymousClass0GG;
import X.AnonymousClass0Gn;
import X.AnonymousClass0HV;
import X.AnonymousClass0IW;
import X.AnonymousClass0Kl;
import X.AnonymousClass0cQ;
import X.AnonymousClass1Bd;
import X.AnonymousClass1DI;
import X.AnonymousClass1bv;
import X.AnonymousClass1bx;
import X.AnonymousClass55T;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.facebook.C0164R;
import com.instagram.common.notifications.push.PushChannelType;

public class FbnsPushNotificationHandler extends AnonymousClass1bx {
    /* renamed from: B */
    private boolean f20537B = false;

    public class IgFbnsCallbackReceiver extends AnonymousClass1bv {
        public IgFbnsCallbackReceiver() {
            super(FbnsPushNotificationHandler.class);
        }

        public final void onReceive(Context context, Intent intent) {
            int D = AnonymousClass0cQ.m5854D(this, 1087745586);
            if (intent.getAction() == null) {
                AnonymousClass0cQ.m5855E(this, context, intent, -778793719, D);
                return;
            }
            if (VERSION.SDK_INT < 26) {
                super.onReceive(context, intent);
            } else if (((Boolean) AnonymousClass0CC.sV.m914G()).booleanValue()) {
                WakeLock D2 = AnonymousClass1DI.m10052D((PowerManager) context.getSystemService("power"), 1, "IgFbnsCallbackReceiver", 1221851737);
                AnonymousClass1DI.m10054F(D2, false, 706695666);
                AnonymousClass1DI.m10051C(D2, 60000, 790624421);
                AnonymousClass0GG.m1763B(AnonymousClass0Fx.m1698B(), new AnonymousClass55T(context, intent, D2), 1149012264);
            } else {
                intent.setClass(context, FbnsPushNotificationHandler.class);
                intent.putExtra("foreground", true);
                AnonymousClass0Eb anonymousClass0Eb = AnonymousClass0Ea.f1980C;
                anonymousClass0Eb.m1407j(26607617, ((Integer) AnonymousClass09e.f1096B.m914G()).intValue());
                anonymousClass0Eb.m1436J(26607617, "service", "fbns");
                anonymousClass0Eb.m1406i(26607617, 4000);
                AnonymousClass0IW.m2247M(intent, context);
            }
            AnonymousClass0F9.m1509C().m1518H(AnonymousClass0Kl.NOTIFICATION_RECEIVED);
            AnonymousClass0cQ.m5855E(this, context, intent, 24001926, D);
        }
    }

    /* renamed from: C */
    public final void mo2589C(int i) {
    }

    public FbnsPushNotificationHandler() {
        super(FbnsPushNotificationHandler.class.getName());
    }

    /* renamed from: A */
    public final boolean mo2587A() {
        return this.f20537B;
    }

    /* renamed from: B */
    public final void mo2588B(Intent intent) {
        AnonymousClass0EA.m1322B().m1332B(intent, PushChannelType.FBNS, AnonymousClass0CB.m840J() ? null : "⚡");
        AnonymousClass1Bd.m9845B(this, intent);
    }

    /* renamed from: D */
    public final void mo2590D(String str, boolean z) {
        AnonymousClass0EA.m1322B().m1333C(getApplicationContext(), str, PushChannelType.FBNS, true);
        AnonymousClass0HV.m2007C().m2061w(str);
    }

    /* renamed from: E */
    public final void mo2591E(String str) {
        AnonymousClass0Gn.m1876C("FbnsPushNotificationHandler onRegistrationError", str);
    }

    /* renamed from: F */
    public final void mo2592F() {
        AnonymousClass0EA.m1322B();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int J = AnonymousClass0cQ.m5860J(this, -1790364892);
        if (intent != null) {
            this.f20537B = intent.getBooleanExtra("foreground", false);
        }
        if (this.f20537B) {
            AnonymousClass0Ea.f1980C.markerEnd(26607617, (short) 2);
            startForeground(20017, AnonymousClass08s.m555B(getApplicationContext(), null, Integer.valueOf(AnonymousClass0G5.m1726G(this, C0164R.attr.defaultNotificationIcon, C0164R.drawable.notification_icon))).f1019B);
        }
        int onStartCommand = super.onStartCommand(intent, i, i2);
        AnonymousClass0cQ.m5861K(this, -1417548080, J);
        return onStartCommand;
    }
}

package com.instagram.pendingmedia.service.uploadretrypolicy;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cn;
import X.AnonymousClass0FL;
import X.AnonymousClass0Gd;
import X.AnonymousClass0IW;
import X.AnonymousClass0b4;
import X.AnonymousClass0cQ;
import X.AnonymousClass1DI;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager.WakeLock;
import com.instagram.service.session.ShouldInitUserSession;

@ShouldInitUserSession
public class ConnectivityChangeReceiver extends BroadcastReceiver {
    /* renamed from: B */
    private static final AnonymousClass0b4 f42345B = new AnonymousClass0b4(4);

    /* renamed from: B */
    public static boolean m20044B(long j) {
        if (f42345B.H() > 0) {
            AnonymousClass0b4 anonymousClass0b4 = f42345B;
            if (j >= ((Long) anonymousClass0b4.E(anonymousClass0b4.H() - 1)).longValue() + 5000) {
                if (f42345B.H() == 4) {
                    if (j >= ((Long) f42345B.E(0)).longValue() + 600000) {
                        f42345B.C();
                    }
                }
            }
            return true;
        }
        f42345B.D(Long.valueOf(j));
        return false;
    }

    /* renamed from: C */
    public static final void m20045C(Context context, boolean z) {
        if (!z || ((Boolean) AnonymousClass0CC.yP.G()).booleanValue()) {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, ConnectivityChangeReceiver.class), z ? 1 : 2, 1);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        int D = AnonymousClass0cQ.D(this, 1531867019);
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (!(activeNetworkInfo == null || !activeNetworkInfo.isConnected() || m20044B(AnonymousClass0Gd.E()))) {
            int type = activeNetworkInfo.getType();
            boolean z = true;
            if (1 != type) {
                z = false;
            }
            WakeLock wakeLock = UploadRetryService.f3850E;
            if (wakeLock != null) {
                AnonymousClass1DI.B(wakeLock, 570737100);
            }
            AnonymousClass0Cn F = AnonymousClass0Ce.F(this);
            if (F.xX()) {
                AnonymousClass0IW.N(new Intent(context, UploadRetryService.class).setAction("Connected").putExtra("ConnectedToWifi", z).putExtra("IgSessionManager.USER_ID", AnonymousClass0FL.D(F)), context);
            }
        }
        AnonymousClass0cQ.E(this, context, intent, -2089220418, D);
    }
}

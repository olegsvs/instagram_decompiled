package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import java.util.List;
import java.util.Map;

/* renamed from: X.1qK */
public final class AnonymousClass1qK {
    /* renamed from: H */
    public static final String f23260H = "BrowserLiteCallbacker";
    /* renamed from: I */
    private static AnonymousClass1qK f23261I;
    /* renamed from: B */
    public ServiceConnection f23262B;
    /* renamed from: C */
    public BrowserLiteCallback f23263C;
    /* renamed from: D */
    public AnonymousClass2P3 f23264D;
    /* renamed from: E */
    private int f23265E;
    /* renamed from: F */
    private Handler f23266F;
    /* renamed from: G */
    private HandlerThread f23267G;

    /* renamed from: A */
    public final void m13399A(Context context, boolean z) {
        this.f23265E++;
        if (this.f23262B != null) {
            AnonymousClass2P3 anonymousClass2P3 = this.f23264D;
            if (anonymousClass2P3 != null) {
                anonymousClass2P3.m15572C(m13401C());
                if (z) {
                    AnonymousClass1qK.m13397C(this, new AnonymousClass2PG(this));
                }
            }
        }
        Intent intent = new Intent("com.facebook.browser.lite.BrowserLiteCallback");
        intent.setPackage(context.getPackageName());
        List queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (!queryIntentServices.isEmpty()) {
            if (queryIntentServices.size() <= 1) {
                HandlerThread handlerThread = new HandlerThread(f23260H);
                this.f23267G = handlerThread;
                handlerThread.start();
                this.f23266F = new Handler(this.f23267G.getLooper());
                this.f23262B = new AnonymousClass1qG(this, z);
                Intent intent2 = new Intent(intent);
                intent2.setComponent(new ComponentName(context.getPackageName(), ((ResolveInfo) queryIntentServices.get(0)).serviceInfo.name));
                AnonymousClass17r.B(context, intent2, this.f23262B, 9, 23556913);
            }
        }
    }

    /* renamed from: B */
    public static synchronized AnonymousClass1qK m13396B() {
        AnonymousClass1qK anonymousClass1qK;
        synchronized (AnonymousClass1qK.class) {
            if (f23261I == null) {
                f23261I = new AnonymousClass1qK();
            }
            anonymousClass1qK = f23261I;
        }
        return anonymousClass1qK;
    }

    /* renamed from: B */
    public final void m13400B() {
        Handler handler = this.f23266F;
        if (handler != null) {
            if (this.f23263C != null) {
                AnonymousClass0OR.D(handler, new AnonymousClass1qF(this), -1917017939);
                return;
            }
        }
        Runtime.getRuntime().exit(0);
    }

    /* renamed from: C */
    public final java.util.HashSet m13401C() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.f23263C;
        r2 = 0;
        if (r0 == 0) goto L_0x0011;
    L_0x0005:
        r1 = r0.oP();	 Catch:{ RemoteException -> 0x0011 }
        if (r1 == 0) goto L_0x0011;	 Catch:{ RemoteException -> 0x0011 }
    L_0x000b:
        r0 = new java.util.HashSet;	 Catch:{ RemoteException -> 0x0011 }
        r0.<init>(r1);	 Catch:{ RemoteException -> 0x0011 }
        r2 = r0;	 Catch:{ RemoteException -> 0x0011 }
    L_0x0011:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1qK.C():java.util.HashSet");
    }

    /* renamed from: C */
    public static void m13397C(AnonymousClass1qK anonymousClass1qK, AnonymousClass1qJ anonymousClass1qJ) {
        if (anonymousClass1qK.f23262B == null) {
            AnonymousClass1rD.m13485E(f23260H, "Callback service is not available.", new Object[0]);
        } else {
            AnonymousClass0OR.D(anonymousClass1qK.f23266F, new AnonymousClass1qI(anonymousClass1qK, anonymousClass1qJ), -1920571210);
        }
    }

    /* renamed from: D */
    public static void m13398D(AnonymousClass1qK anonymousClass1qK, Context context) {
        int i = anonymousClass1qK.f23265E - 1;
        anonymousClass1qK.f23265E = i;
        if (i == 0) {
            ServiceConnection serviceConnection = anonymousClass1qK.f23262B;
            if (serviceConnection != null) {
                if (anonymousClass1qK.f23263C != null) {
                    AnonymousClass17r.C(context, serviceConnection, 1388711253);
                }
                anonymousClass1qK.f23267G.quit();
                anonymousClass1qK.f23262B = null;
                anonymousClass1qK.f23263C = null;
                anonymousClass1qK.f23267G = null;
                anonymousClass1qK.f23266F = null;
            }
        }
    }

    /* renamed from: D */
    public final void m13402D(Map map, Bundle bundle) {
        AnonymousClass1qK.m13397C(this, new AnonymousClass2P8(this, map, bundle));
    }

    /* renamed from: E */
    public final void m13403E(Context context) {
        if (this.f23262B != null) {
            AnonymousClass0OR.D(this.f23266F, new AnonymousClass1qH(this, context), -221847429);
        }
    }
}

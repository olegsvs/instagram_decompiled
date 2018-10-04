package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.06h */
public final class AnonymousClass06h {
    /* renamed from: B */
    public final BroadcastReceiver f384B;
    /* renamed from: C */
    public final RealtimeSinceBootClock f385C;
    /* renamed from: D */
    public final boolean f386D;
    /* renamed from: E */
    public final Context f387E;
    /* renamed from: F */
    public long f388F = 0;
    /* renamed from: G */
    public final Set f389G = new HashSet();
    /* renamed from: H */
    public final Handler f390H;
    /* renamed from: I */
    public long f391I = -1;
    /* renamed from: J */
    private final AnonymousClass05y f392J;
    /* renamed from: K */
    private long f393K = -1;
    /* renamed from: L */
    private final ScheduledExecutorService f394L;
    /* renamed from: M */
    private final AnonymousClass06F f395M;
    /* renamed from: N */
    private long f396N;

    public AnonymousClass06h(AnonymousClass06F anonymousClass06F, Context context, RealtimeSinceBootClock realtimeSinceBootClock, Handler handler, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this.f395M = anonymousClass06F;
        this.f392J = anonymousClass06F.m380A("connectivity", ConnectivityManager.class);
        this.f387E = context;
        this.f385C = realtimeSinceBootClock;
        this.f390H = handler;
        this.f394L = scheduledExecutorService;
        this.f386D = z;
        this.f384B = new AnonymousClass06f(this);
        AnonymousClass06h.m407E(this, AnonymousClass06h.m404B(this));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (this.f386D) {
            intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        this.f387E.registerReceiver(this.f384B, intentFilter, null, this.f390H);
    }

    /* renamed from: A */
    public final NetworkInfo m408A() {
        NetworkInfo B = AnonymousClass06h.m404B(this);
        if (B != null) {
            if (B.isConnected()) {
                return B;
            }
        }
        return null;
    }

    /* renamed from: B */
    public static NetworkInfo m404B(AnonymousClass06h anonymousClass06h) {
        NetworkInfo networkInfo = null;
        try {
            if (anonymousClass06h.f392J.mo83B()) {
                networkInfo = ((ConnectivityManager) anonymousClass06h.f392J.mo82A()).getActiveNetworkInfo();
            }
            return networkInfo;
        } catch (Throwable e) {
            AnonymousClass0Dc.m1254Q("MqttNetworkManager", "getActiveNetworkInfoSafe caught Exception", e);
            return null;
        }
    }

    /* renamed from: B */
    public final String m409B() {
        String str = "none";
        NetworkInfo A = m408A();
        return (A == null || AnonymousClass1Cn.m9924D(A.getTypeName())) ? str : A.getTypeName();
    }

    /* renamed from: C */
    public final synchronized long m410C() {
        long j;
        j = 0;
        if (this.f396N != 0) {
            j = this.f385C.now() - this.f396N;
        }
        return j;
    }

    /* renamed from: C */
    public static void m405C(AnonymousClass06h anonymousClass06h) {
        if (!anonymousClass06h.m415H()) {
            if (anonymousClass06h.m414G()) {
                AnonymousClass06h.m406D(anonymousClass06h);
                return;
            }
            anonymousClass06h.f394L.schedule(new AnonymousClass06g(anonymousClass06h, anonymousClass06h.f385C.now()), 2, TimeUnit.SECONDS);
        }
    }

    /* renamed from: D */
    public final AnonymousClass06A m411D() {
        NetworkInfo B = AnonymousClass06h.m404B(this);
        if (B != null) {
            if (B.isConnected()) {
                return AnonymousClass06B.m375B(B);
            }
        }
        return AnonymousClass06A.f260H;
    }

    /* renamed from: D */
    public static synchronized void m406D(AnonymousClass06h anonymousClass06h) {
        synchronized (anonymousClass06h) {
            int F = anonymousClass06h.m413F();
            Integer.valueOf(F);
            anonymousClass06h.m411D().toString();
            Intent intent = new Intent("com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED");
            intent.putExtra("com.facebook.mqtt.EXTRA_NETWORK_TYPE", F);
            for (AnonymousClass0Ae anonymousClass0Ae : anonymousClass06h.f389G) {
                anonymousClass0Ae.getClass().getName();
                anonymousClass0Ae.m702A(intent);
            }
        }
    }

    /* renamed from: E */
    public final synchronized long m412E() {
        return this.f396N;
    }

    /* renamed from: E */
    public static synchronized void m407E(AnonymousClass06h anonymousClass06h, NetworkInfo networkInfo) {
        synchronized (anonymousClass06h) {
            if (networkInfo != null) {
                if (networkInfo.isConnected()) {
                    if (anonymousClass06h.f396N == 0) {
                        anonymousClass06h.f396N = anonymousClass06h.f385C.now();
                        if (anonymousClass06h.f393K != -1) {
                            anonymousClass06h.f391I = anonymousClass06h.f396N - anonymousClass06h.f393K;
                        }
                    }
                }
            }
            anonymousClass06h.f393K = anonymousClass06h.f385C.now();
            if (anonymousClass06h.f396N != 0) {
                anonymousClass06h.f388F += anonymousClass06h.f393K - anonymousClass06h.f396N;
            }
            anonymousClass06h.f391I = -1;
            anonymousClass06h.f396N = 0;
        }
    }

    /* renamed from: F */
    public final int m413F() {
        NetworkInfo B = AnonymousClass06h.m404B(this);
        return (B == null || !B.isConnected()) ? -1 : B.getType();
    }

    /* renamed from: G */
    public final boolean m414G() {
        NetworkInfo B = AnonymousClass06h.m404B(this);
        return B != null && B.isConnected();
    }

    /* renamed from: H */
    public final boolean m415H() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r4 = this;
        r3 = 0;
        r2 = r4.f395M;	 Catch:{ Exception -> 0x0026 }
        r1 = "power";	 Catch:{ Exception -> 0x0026 }
        r0 = android.os.PowerManager.class;	 Catch:{ Exception -> 0x0026 }
        r2 = r2.m380A(r1, r0);	 Catch:{ Exception -> 0x0026 }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x0026 }
        r0 = 23;	 Catch:{ Exception -> 0x0026 }
        if (r1 < r0) goto L_0x0025;	 Catch:{ Exception -> 0x0026 }
    L_0x0011:
        r0 = r2.mo83B();	 Catch:{ Exception -> 0x0026 }
        if (r0 == 0) goto L_0x0025;	 Catch:{ Exception -> 0x0026 }
    L_0x0017:
        r0 = r2.mo82A();	 Catch:{ Exception -> 0x0026 }
        r0 = (android.os.PowerManager) r0;	 Catch:{ Exception -> 0x0026 }
        r0 = r0.isDeviceIdleMode();	 Catch:{ Exception -> 0x0026 }
        if (r0 == 0) goto L_0x0025;	 Catch:{ Exception -> 0x0026 }
    L_0x0023:
        r0 = 1;	 Catch:{ Exception -> 0x0026 }
        return r0;	 Catch:{ Exception -> 0x0026 }
    L_0x0025:
        return r3;	 Catch:{ Exception -> 0x0026 }
    L_0x0026:
        r1 = "MqttNetworkManager";
        r0 = "Exception in getting DeviceIdleMode";
        X.AnonymousClass0Dc.m1243F(r1, r0);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.06h.H():boolean");
    }
}

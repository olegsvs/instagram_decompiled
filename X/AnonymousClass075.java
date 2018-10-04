package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Handler;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.075 */
public final class AnonymousClass075 {
    /* renamed from: Y */
    private static final List f455Y = Collections.unmodifiableList(new AnonymousClass071());
    /* renamed from: B */
    public final AlarmManager f456B;
    /* renamed from: C */
    public final String f457C;
    /* renamed from: D */
    public final PendingIntent f458D;
    /* renamed from: E */
    public final BroadcastReceiver f459E;
    /* renamed from: F */
    public final int f460F;
    /* renamed from: G */
    public final Context f461G;
    /* renamed from: H */
    public long f462H;
    /* renamed from: I */
    public final RealtimeSinceBootClock f463I;
    /* renamed from: J */
    public final String f464J;
    /* renamed from: K */
    public final PendingIntent f465K;
    /* renamed from: L */
    public final BroadcastReceiver f466L;
    /* renamed from: M */
    public long f467M;
    /* renamed from: N */
    public final String f468N;
    /* renamed from: O */
    public final PendingIntent f469O;
    /* renamed from: P */
    public long f470P = -1;
    /* renamed from: Q */
    public final BroadcastReceiver f471Q;
    /* renamed from: R */
    public final boolean f472R;
    /* renamed from: S */
    public volatile Runnable f473S;
    /* renamed from: T */
    public boolean f474T;
    /* renamed from: U */
    public final AnonymousClass1Bj f475U;
    /* renamed from: V */
    private final Handler f476V;
    /* renamed from: W */
    private final AtomicInteger f477W;
    /* renamed from: X */
    private final String f478X;

    public AnonymousClass075(Context context, AnonymousClass06F anonymousClass06F, String str, AtomicInteger atomicInteger, RealtimeSinceBootClock realtimeSinceBootClock, Handler handler, AnonymousClass1Bj anonymousClass1Bj) {
        this.f461G = context;
        this.f478X = str;
        this.f472R = AnonymousClass1Co.m9934G(context.getPackageName());
        this.f477W = atomicInteger;
        AnonymousClass05y A = anonymousClass06F.m380A("alarm", AlarmManager.class);
        if (A.mo83B()) {
            this.f456B = (AlarmManager) A.mo82A();
            this.f463I = realtimeSinceBootClock;
            this.f460F = VERSION.SDK_INT;
            this.f476V = handler;
            this.f475U = anonymousClass1Bj;
            this.f466L = new AnonymousClass072(this);
            this.f464J = m430D("KeepaliveManager.ACTION_EXACT_ALARM.", context);
            Intent intent = new Intent(this.f464J);
            intent.setPackage(context.getPackageName());
            this.f465K = PendingIntent.getBroadcast(context, 0, intent, 134217728);
            this.f471Q = new AnonymousClass073(this);
            this.f468N = m430D("KeepaliveManager.ACTION_INEXACT_ALARM.", context);
            intent = new Intent(this.f468N);
            intent.setPackage(context.getPackageName());
            this.f469O = PendingIntent.getBroadcast(context, 0, intent, 134217728);
            this.f459E = new AnonymousClass074(this);
            this.f457C = m430D("KeepaliveManager.ACTION_BACKUP_ALARM.", context);
            intent = new Intent(this.f457C);
            intent.setPackage(context.getPackageName());
            this.f458D = PendingIntent.getBroadcast(context, 0, intent, 134217728);
            return;
        }
        throw new IllegalArgumentException("Cannot acquire Alarm service");
    }

    /* renamed from: A */
    public final synchronized void m432A() {
        if (this.f474T) {
            this.f474T = false;
            this.f475U.m9873D(this.f456B, this.f469O);
            if (!this.f472R) {
                this.f475U.m9873D(this.f456B, this.f458D);
            }
            this.f475U.m9873D(this.f456B, this.f465K);
        }
        this.f462H = 900000;
        this.f470P = -1;
    }

    /* renamed from: B */
    public static void m428B(AnonymousClass075 anonymousClass075, long j) {
        long j2 = j;
        if (anonymousClass075.f460F >= 23 && anonymousClass075.f472R) {
            anonymousClass075.f475U.m9872C(anonymousClass075.f456B, 2, j2, anonymousClass075.f458D);
        } else if (anonymousClass075.f460F >= 19) {
            anonymousClass075.f475U.m9870A(anonymousClass075.f456B, 2, j2, anonymousClass075.f458D);
        } else {
            anonymousClass075.f456B.set(2, j, anonymousClass075.f458D);
        }
    }

    /* renamed from: B */
    public final synchronized void m433B(Runnable runnable) {
        if (this.f473S == null) {
            this.f473S = runnable;
            this.f461G.registerReceiver(this.f466L, new IntentFilter(this.f464J), null, this.f476V);
            this.f461G.registerReceiver(this.f471Q, new IntentFilter(this.f468N), null, this.f476V);
            this.f461G.registerReceiver(this.f459E, new IntentFilter(this.f457C), null, this.f476V);
        }
    }

    /* renamed from: C */
    public final synchronized void m434C() {
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
        r17 = this;
        r1 = r17;
        monitor-enter(r1);
        r0 = r1.f477W;	 Catch:{ all -> 0x00c8 }
        r0 = r0.get();	 Catch:{ all -> 0x00c8 }
        r0 = r0 * 1000;	 Catch:{ all -> 0x00c8 }
        r2 = (long) r0;	 Catch:{ all -> 0x00c8 }
        r6 = 900000; // 0xdbba0 float:1.261169E-39 double:4.44659E-318;	 Catch:{ all -> 0x00c8 }
        r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));	 Catch:{ all -> 0x00c8 }
        if (r0 <= 0) goto L_0x0017;	 Catch:{ all -> 0x00c8 }
    L_0x0013:
        r2 = X.AnonymousClass075.m431E(r2);	 Catch:{ all -> 0x00c8 }
    L_0x0017:
        r1.f462H = r2;	 Catch:{ all -> 0x00c8 }
        r0 = r1.f463I;	 Catch:{ all -> 0x00c8 }
        r4 = r0.now();	 Catch:{ all -> 0x00c8 }
        r2 = r1.f462H;	 Catch:{ all -> 0x00c8 }
        r4 = r4 + r2;	 Catch:{ all -> 0x00c8 }
        r1.f467M = r4;	 Catch:{ all -> 0x00c8 }
        r2 = r1.f474T;	 Catch:{ all -> 0x00c8 }
        r0 = 1;	 Catch:{ all -> 0x00c8 }
        if (r2 == 0) goto L_0x0040;	 Catch:{ all -> 0x00c8 }
    L_0x0029:
        r4 = r1.f475U;	 Catch:{ all -> 0x00c8 }
        r3 = r1.f456B;	 Catch:{ all -> 0x00c8 }
        r2 = r1.f465K;	 Catch:{ all -> 0x00c8 }
        r4.m9873D(r3, r2);	 Catch:{ all -> 0x00c8 }
        r2 = r1.f472R;	 Catch:{ all -> 0x00c8 }
        if (r2 != 0) goto L_0x0042;	 Catch:{ all -> 0x00c8 }
    L_0x0036:
        r4 = r1.f475U;	 Catch:{ all -> 0x00c8 }
        r3 = r1.f456B;	 Catch:{ all -> 0x00c8 }
        r2 = r1.f458D;	 Catch:{ all -> 0x00c8 }
        r4.m9873D(r3, r2);	 Catch:{ all -> 0x00c8 }
        goto L_0x0042;	 Catch:{ all -> 0x00c8 }
    L_0x0040:
        r1.f474T = r0;	 Catch:{ all -> 0x00c8 }
    L_0x0042:
        r9 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ all -> 0x00c8 }
        r2 = r1.f462H;	 Catch:{ Throwable -> 0x00af }
        r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));	 Catch:{ Throwable -> 0x00af }
        if (r2 >= 0) goto L_0x0080;	 Catch:{ Throwable -> 0x00af }
    L_0x004a:
        r5 = r1.f467M;	 Catch:{ Throwable -> 0x00af }
        r15 = r1.f462H;	 Catch:{ Throwable -> 0x00af }
        r3 = r1.f460F;	 Catch:{ Throwable -> 0x00af }
        r2 = 23;	 Catch:{ Throwable -> 0x00af }
        if (r3 < r2) goto L_0x0063;	 Catch:{ Throwable -> 0x00af }
    L_0x0054:
        r2 = r1.f472R;	 Catch:{ Throwable -> 0x00af }
        if (r2 == 0) goto L_0x0063;	 Catch:{ Throwable -> 0x00af }
    L_0x0058:
        r2 = r1.f475U;	 Catch:{ Throwable -> 0x00af }
        r3 = r1.f456B;	 Catch:{ Throwable -> 0x00af }
        r4 = 2;	 Catch:{ Throwable -> 0x00af }
        r7 = r1.f465K;	 Catch:{ Throwable -> 0x00af }
        r2.m9872C(r3, r4, r5, r7);	 Catch:{ Throwable -> 0x00af }
        goto L_0x007f;	 Catch:{ Throwable -> 0x00af }
    L_0x0063:
        r3 = r1.f460F;	 Catch:{ Throwable -> 0x00af }
        r2 = 19;	 Catch:{ Throwable -> 0x00af }
        if (r3 < r2) goto L_0x0074;	 Catch:{ Throwable -> 0x00af }
    L_0x0069:
        r2 = r1.f475U;	 Catch:{ Throwable -> 0x00af }
        r3 = r1.f456B;	 Catch:{ Throwable -> 0x00af }
        r4 = 2;	 Catch:{ Throwable -> 0x00af }
        r7 = r1.f465K;	 Catch:{ Throwable -> 0x00af }
        r2.m9870A(r3, r4, r5, r7);	 Catch:{ Throwable -> 0x00af }
        goto L_0x007f;	 Catch:{ Throwable -> 0x00af }
    L_0x0074:
        r11 = r1.f456B;	 Catch:{ Throwable -> 0x00af }
        r12 = 2;	 Catch:{ Throwable -> 0x00af }
        r2 = r1.f465K;	 Catch:{ Throwable -> 0x00af }
        r13 = r5;	 Catch:{ Throwable -> 0x00af }
        r17 = r2;	 Catch:{ Throwable -> 0x00af }
        r11.setRepeating(r12, r13, r15, r17);	 Catch:{ Throwable -> 0x00af }
    L_0x007f:
        goto L_0x00a8;	 Catch:{ Throwable -> 0x00af }
    L_0x0080:
        r4 = r1.f470P;	 Catch:{ Throwable -> 0x00af }
        r2 = r1.f462H;	 Catch:{ Throwable -> 0x00af }
        r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));	 Catch:{ Throwable -> 0x00af }
        if (r2 == 0) goto L_0x009c;	 Catch:{ Throwable -> 0x00af }
    L_0x0088:
        r2 = r1.f462H;	 Catch:{ Throwable -> 0x00af }
        r1.f470P = r2;	 Catch:{ Throwable -> 0x00af }
        r4 = r1.f475U;	 Catch:{ Throwable -> 0x00af }
        r3 = r1.f456B;	 Catch:{ Throwable -> 0x00af }
        r2 = r1.f469O;	 Catch:{ Throwable -> 0x00af }
        r4.m9873D(r3, r2);	 Catch:{ Throwable -> 0x00af }
        r4 = r1.f467M;	 Catch:{ Throwable -> 0x00af }
        r2 = r1.f462H;	 Catch:{ Throwable -> 0x00af }
        X.AnonymousClass075.m429C(r1, r4, r2);	 Catch:{ Throwable -> 0x00af }
    L_0x009c:
        r2 = r1.f472R;	 Catch:{ Throwable -> 0x00af }
        if (r2 != 0) goto L_0x00a8;	 Catch:{ Throwable -> 0x00af }
    L_0x00a0:
        r4 = r1.f467M;	 Catch:{ Throwable -> 0x00af }
        r2 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;	 Catch:{ Throwable -> 0x00af }
        r4 = r4 + r2;	 Catch:{ Throwable -> 0x00af }
        X.AnonymousClass075.m428B(r1, r4);	 Catch:{ Throwable -> 0x00af }
    L_0x00a8:
        r2 = r1.f462H;	 Catch:{ Throwable -> 0x00af }
        r2 = r2 / r9;	 Catch:{ Throwable -> 0x00af }
        java.lang.Long.valueOf(r2);	 Catch:{ Throwable -> 0x00af }
        goto L_0x00c6;	 Catch:{ Throwable -> 0x00af }
    L_0x00af:
        r8 = move-exception;
        r7 = "KeepaliveManager";	 Catch:{ all -> 0x00c8 }
        r6 = "keepalive/alarm_failed; intervalSec=%s";	 Catch:{ all -> 0x00c8 }
        r5 = new java.lang.Object[r0];	 Catch:{ all -> 0x00c8 }
        r4 = 0;	 Catch:{ all -> 0x00c8 }
        r2 = r1.f462H;	 Catch:{ all -> 0x00c8 }
        r2 = r2 / r9;	 Catch:{ all -> 0x00c8 }
        r0 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x00c8 }
        r5[r4] = r0;	 Catch:{ all -> 0x00c8 }
        X.AnonymousClass0Dc.m1256S(r7, r8, r6, r5);	 Catch:{ all -> 0x00c8 }
        r1.m432A();	 Catch:{ Throwable -> 0x00c6 }
    L_0x00c6:
        monitor-exit(r1);
        return;
    L_0x00c8:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.075.C():void");
    }

    /* renamed from: C */
    public static void m429C(AnonymousClass075 anonymousClass075, long j, long j2) {
        long j3 = j;
        if (anonymousClass075.f460F < 23 || !anonymousClass075.f472R) {
            anonymousClass075.f456B.setInexactRepeating(2, j3, j2, anonymousClass075.f469O);
            return;
        }
        anonymousClass075.f475U.m9871B(anonymousClass075.f456B, 2, j3, anonymousClass075.f469O);
    }

    /* renamed from: D */
    private String m430D(String str, Context context) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.append(this.f478X);
        String packageName = context.getPackageName();
        if (!AnonymousClass1Cn.m9924D(packageName)) {
            stringBuilder.append('.');
            stringBuilder.append(packageName);
        }
        return stringBuilder.toString();
    }

    /* renamed from: E */
    private static long m431E(long j) {
        AnonymousClass1DG.m10046B(j >= 900000);
        for (Long longValue : f455Y) {
            long longValue2 = longValue.longValue();
            if (j >= longValue2) {
                return longValue2;
            }
        }
        return 900000;
    }
}

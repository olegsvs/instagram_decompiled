package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.06j */
public final class AnonymousClass06j {
    /* renamed from: I */
    private static final IntentFilter f399I;
    /* renamed from: B */
    public final Context f400B;
    /* renamed from: C */
    public final AtomicReference f401C = new AtomicReference(null);
    /* renamed from: D */
    public final AtomicLong f402D = new AtomicLong(-1);
    /* renamed from: E */
    public final Handler f403E;
    /* renamed from: F */
    public AnonymousClass06k f404F;
    /* renamed from: G */
    public final BroadcastReceiver f405G;
    /* renamed from: H */
    private final AnonymousClass06F f406H;

    static {
        IntentFilter intentFilter = new IntentFilter();
        f399I = intentFilter;
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter = f399I;
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.setPriority(999);
    }

    public AnonymousClass06j(Context context, AnonymousClass06F anonymousClass06F, Handler handler, RealtimeSinceBootClock realtimeSinceBootClock) {
        this.f400B = context;
        this.f406H = anonymousClass06F;
        this.f403E = handler;
        this.f405G = new AnonymousClass06i(this, realtimeSinceBootClock);
    }

    /* renamed from: A */
    public final boolean m416A() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = r4.f401C;
        r0 = r0.get();
        r0 = (java.lang.Boolean) r0;
        if (r0 == 0) goto L_0x000f;
    L_0x000a:
        r0 = r0.booleanValue();
        return r0;
    L_0x000f:
        r3 = 0;
        r2 = r4.f406H;	 Catch:{ RuntimeException -> 0x003d }
        r1 = "power";	 Catch:{ RuntimeException -> 0x003d }
        r0 = android.os.PowerManager.class;	 Catch:{ RuntimeException -> 0x003d }
        r2 = r2.m380A(r1, r0);	 Catch:{ RuntimeException -> 0x003d }
        r0 = r2.mo83B();	 Catch:{ RuntimeException -> 0x003d }
        if (r0 == 0) goto L_0x003c;	 Catch:{ RuntimeException -> 0x003d }
    L_0x0020:
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x003d }
        r0 = 20;	 Catch:{ RuntimeException -> 0x003d }
        if (r1 < r0) goto L_0x0031;	 Catch:{ RuntimeException -> 0x003d }
    L_0x0026:
        r0 = r2.mo82A();	 Catch:{ RuntimeException -> 0x003d }
        r0 = (android.os.PowerManager) r0;	 Catch:{ RuntimeException -> 0x003d }
        r0 = r0.isInteractive();	 Catch:{ RuntimeException -> 0x003d }
        goto L_0x003b;	 Catch:{ RuntimeException -> 0x003d }
    L_0x0031:
        r0 = r2.mo82A();	 Catch:{ RuntimeException -> 0x003d }
        r0 = (android.os.PowerManager) r0;	 Catch:{ RuntimeException -> 0x003d }
        r0 = r0.isScreenOn();	 Catch:{ RuntimeException -> 0x003d }
    L_0x003b:
        return r0;	 Catch:{ RuntimeException -> 0x003d }
    L_0x003c:
        return r3;	 Catch:{ RuntimeException -> 0x003d }
    L_0x003d:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.06j.A():boolean");
    }
}

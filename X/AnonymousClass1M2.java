package X;

import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1M2 */
public final class AnonymousClass1M2 {
    /* renamed from: L */
    public static final Object f17500L = new Object();
    /* renamed from: B */
    public final Map f17501B;
    /* renamed from: C */
    public final Object f17502C = new Object();
    /* renamed from: D */
    public final int f17503D;
    /* renamed from: E */
    public final Executor f17504E;
    /* renamed from: F */
    public final Thread f17505F;
    /* renamed from: G */
    public final CountDownLatch f17506G;
    /* renamed from: H */
    public volatile boolean f17507H = false;
    /* renamed from: I */
    public final AnonymousClass1M3 f17508I;
    /* renamed from: J */
    public final AtomicBoolean f17509J = new AtomicBoolean(false);
    /* renamed from: K */
    private final Map f17510K;

    static {
        Handler handler = new Handler(Looper.getMainLooper());
    }

    public AnonymousClass1M2(File file, Executor executor, int i) {
        this.f17508I = new AnonymousClass1M3((File) AnonymousClass1M2.m10931B(file));
        this.f17501B = new HashMap();
        this.f17510K = new HashMap();
        this.f17504E = (Executor) AnonymousClass1M2.m10931B(executor);
        this.f17503D = i;
        this.f17506G = new CountDownLatch(1);
        Runnable anonymousClass1M4 = new AnonymousClass1M4(this);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LSP-");
        stringBuilder.append(file.getName());
        this.f17505F = new Thread(anonymousClass1M4, stringBuilder.toString());
        this.f17505F.start();
    }

    /* renamed from: A */
    public final boolean m10935A(String str) {
        boolean containsKey;
        AnonymousClass1M2.m10933D(this);
        synchronized (this.f17502C) {
            containsKey = this.f17501B.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: B */
    public final AnonymousClass1ea m10936B() {
        AnonymousClass1M2.m10933D(this);
        return new AnonymousClass1em(this);
    }

    /* renamed from: B */
    public static Object m10931B(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }

    /* renamed from: C */
    public static synchronized void m10932C(AnonymousClass1M2 anonymousClass1M2, Set set) {
        synchronized (anonymousClass1M2) {
            Throwable th = new Throwable("commit stack");
            for (String str : set) {
                Map map = (Map) anonymousClass1M2.f17510K.get(str);
                if (map != null) {
                    for (Entry entry : map.entrySet()) {
                        AnonymousClass0OR.m3624D((Handler) entry.getValue(), new AnonymousClass1tv(anonymousClass1M2, th, (AnonymousClass1tu) entry.getKey(), str), -1502616101);
                    }
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: C */
    public final boolean m10937C(java.lang.String r3, boolean r4) {
        /*
        r2 = this;
        X.AnonymousClass1M2.m10933D(r2);
        r1 = r2.f17502C;
        monitor-enter(r1);
        r0 = r2.f17501B;	 Catch:{ ClassCastException -> 0x0018 }
        r0 = r0.get(r3);	 Catch:{ ClassCastException -> 0x0018 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ ClassCastException -> 0x0018 }
        if (r0 == 0) goto L_0x0014;
    L_0x0010:
        r4 = r0.booleanValue();	 Catch:{ ClassCastException -> 0x0018 }
    L_0x0014:
        monitor-exit(r1);	 Catch:{ all -> 0x0016 }
        return r4;
    L_0x0016:
        r0 = move-exception;
        goto L_0x001e;
    L_0x0018:
        r0 = move-exception;
        r0 = r2.m10934E(r0, r3);	 Catch:{ all -> 0x0016 }
        throw r0;	 Catch:{ all -> 0x0016 }
    L_0x001e:
        monitor-exit(r1);	 Catch:{ all -> 0x0016 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1M2.C(java.lang.String, boolean):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: D */
    public final int m10938D(java.lang.String r3, int r4) {
        /*
        r2 = this;
        X.AnonymousClass1M2.m10933D(r2);
        r1 = r2.f17502C;
        monitor-enter(r1);
        r0 = r2.f17501B;	 Catch:{ ClassCastException -> 0x0018 }
        r0 = r0.get(r3);	 Catch:{ ClassCastException -> 0x0018 }
        r0 = (java.lang.Integer) r0;	 Catch:{ ClassCastException -> 0x0018 }
        if (r0 == 0) goto L_0x0014;
    L_0x0010:
        r4 = r0.intValue();	 Catch:{ ClassCastException -> 0x0018 }
    L_0x0014:
        monitor-exit(r1);	 Catch:{ all -> 0x0016 }
        return r4;
    L_0x0016:
        r0 = move-exception;
        goto L_0x001e;
    L_0x0018:
        r0 = move-exception;
        r0 = r2.m10934E(r0, r3);	 Catch:{ all -> 0x0016 }
        throw r0;	 Catch:{ all -> 0x0016 }
    L_0x001e:
        monitor-exit(r1);	 Catch:{ all -> 0x0016 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1M2.D(java.lang.String, int):int");
    }

    /* renamed from: D */
    public static void m10933D(X.AnonymousClass1M2 r2) {
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
        r0 = r2.f17507H;
        if (r0 != 0) goto L_0x0036;
    L_0x0004:
        r0 = "LightSharedPreferences.waitIfNotLoaded";
        X.AnonymousClass12m.m8993B(r0);
    L_0x0009:
        r0 = r2.f17507H;
        if (r0 != 0) goto L_0x0033;
    L_0x000d:
        monitor-enter(r2);
        r0 = r2.f17505F;	 Catch:{ all -> 0x0037 }
        r1 = r0.getState();	 Catch:{ all -> 0x0037 }
        r0 = java.lang.Thread.State.TERMINATED;	 Catch:{ all -> 0x0037 }
        if (r1 == r0) goto L_0x002d;	 Catch:{ all -> 0x0037 }
    L_0x0018:
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0037 }
        r1 = r0.getPriority();	 Catch:{ all -> 0x0037 }
        r0 = r2.f17505F;	 Catch:{ all -> 0x0037 }
        r0 = r0.getPriority();	 Catch:{ all -> 0x0037 }
        if (r1 <= r0) goto L_0x002d;	 Catch:{ all -> 0x0037 }
    L_0x0028:
        r0 = r2.f17505F;	 Catch:{ all -> 0x0037 }
        r0.setPriority(r1);	 Catch:{ all -> 0x0037 }
    L_0x002d:
        monitor-exit(r2);
        r0 = r2.f17506G;	 Catch:{ InterruptedException -> 0x0009 }
        r0.await();	 Catch:{ InterruptedException -> 0x0009 }
    L_0x0033:
        X.AnonymousClass12m.m8994C();
    L_0x0036:
        return;
    L_0x0037:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1M2.D(X.1M2):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: E */
    public final long m10939E(java.lang.String r3, long r4) {
        /*
        r2 = this;
        X.AnonymousClass1M2.m10933D(r2);
        r1 = r2.f17502C;
        monitor-enter(r1);
        r0 = r2.f17501B;	 Catch:{ ClassCastException -> 0x0018 }
        r0 = r0.get(r3);	 Catch:{ ClassCastException -> 0x0018 }
        r0 = (java.lang.Long) r0;	 Catch:{ ClassCastException -> 0x0018 }
        if (r0 == 0) goto L_0x0014;
    L_0x0010:
        r4 = r0.longValue();	 Catch:{ ClassCastException -> 0x0018 }
    L_0x0014:
        monitor-exit(r1);	 Catch:{ all -> 0x0016 }
        return r4;
    L_0x0016:
        r0 = move-exception;
        goto L_0x001e;
    L_0x0018:
        r0 = move-exception;
        r0 = r2.m10934E(r0, r3);	 Catch:{ all -> 0x0016 }
        throw r0;	 Catch:{ all -> 0x0016 }
    L_0x001e:
        monitor-exit(r1);	 Catch:{ all -> 0x0016 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1M2.E(java.lang.String, long):long");
    }

    /* renamed from: E */
    private RuntimeException m10934E(Exception exception, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LightSharedPreferences threw an exception for Key: ");
        stringBuilder.append(str);
        stringBuilder.append("; ");
        stringBuilder.append("Raw file: ");
        stringBuilder.append(this.f17508I.m10940A());
        return new RuntimeException(stringBuilder.toString(), exception);
    }
}

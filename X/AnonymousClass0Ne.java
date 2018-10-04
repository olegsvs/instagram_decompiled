package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager.WakeLock;
import android.os.SystemClock;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

/* renamed from: X.0Ne */
public final class AnonymousClass0Ne {
    /* renamed from: B */
    public Handler f3653B;
    /* renamed from: C */
    public final HandlerThread f3654C;
    /* renamed from: D */
    public UUID f3655D;
    /* renamed from: E */
    public final Handler f3656E = new Handler(this.f3657F.getLooper());
    /* renamed from: F */
    public final HandlerThread f3657F;
    /* renamed from: G */
    public WakeLock f3658G;
    /* renamed from: H */
    private final Handler f3659H;

    public AnonymousClass0Ne() {
        HandlerThread handlerThread = new HandlerThread("Optic-Task-Handler-Thread");
        this.f3657F = handlerThread;
        handlerThread.start();
        handlerThread = new HandlerThread("Optic-Camera-Handler-Thread");
        this.f3654C = handlerThread;
        handlerThread.start();
        this.f3659H = new Handler(this.f3654C.getLooper());
    }

    /* renamed from: A */
    public final synchronized void m3398A(UUID uuid) {
        if (uuid.equals(this.f3655D)) {
            this.f3656E.removeCallbacksAndMessages(uuid);
            if (this.f3653B != null) {
                this.f3653B.removeCallbacksAndMessages(uuid);
            } else {
                AnonymousClass2oP.f34266B.removeCallbacksAndMessages(uuid);
            }
        }
    }

    /* renamed from: B */
    public final synchronized AnonymousClass2oO m3399B(Callable callable, String str) {
        return m3400C(callable, str, null);
    }

    /* renamed from: B */
    private synchronized AnonymousClass2oO m3396B(Callable callable, String str, AnonymousClass3sw anonymousClass3sw, long j) {
        AnonymousClass2oO anonymousClass2oO = new AnonymousClass2oO(r5, this.f3655D, this.f3658G, callable, str);
        synchronized (r5) {
            synchronized (r5) {
                if (anonymousClass3sw != null) {
                    synchronized (anonymousClass2oO) {
                        if (anonymousClass2oO.isDone()) {
                            synchronized (anonymousClass2oO) {
                                try {
                                    Object obj = anonymousClass2oO.get();
                                    anonymousClass3sw.C(obj);
                                    anonymousClass2oO.f34264D.m3404G(anonymousClass2oO.f34263C, new AnonymousClass2oH(anonymousClass2oO, anonymousClass3sw, obj));
                                } catch (CancellationException e) {
                                    r3 = anonymousClass2oO.f34264D;
                                    r2 = anonymousClass2oO.f34263C;
                                    r1 = new AnonymousClass2oI(anonymousClass2oO, anonymousClass3sw, e);
                                } catch (Exception e2) {
                                    r3 = anonymousClass2oO.f34264D;
                                    r2 = anonymousClass2oO.f34263C;
                                    r1 = new AnonymousClass2oJ(anonymousClass2oO, anonymousClass3sw, e2);
                                }
                            }
                        } else {
                            anonymousClass2oO.f34262B.add(anonymousClass3sw);
                        }
                    }
                }
            }
        }
        AnonymousClass0OR.m3625E(r5.f3656E, anonymousClass2oO, r5.f3655D, SystemClock.uptimeMillis() + j, -1843048413);
        return anonymousClass2oO;
        AnonymousClass0Ne anonymousClass0Ne;
        UUID uuid;
        Runnable anonymousClass2oI;
        anonymousClass0Ne.m3404G(uuid, anonymousClass2oI);
        AnonymousClass0OR.m3625E(r5.f3656E, anonymousClass2oO, r5.f3655D, SystemClock.uptimeMillis() + j, -1843048413);
        return anonymousClass2oO;
    }

    /* renamed from: C */
    public final synchronized AnonymousClass2oO m3400C(Callable callable, String str, AnonymousClass3sw anonymousClass3sw) {
        AnonymousClass2oO B = m3396B(callable, str, anonymousClass3sw, 0);
        return B;
    }

    /* renamed from: C */
    private static void m3397C(android.os.HandlerThread r2) {
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
        r1 = android.os.Build.VERSION.SDK_INT;
        r0 = 18;
        if (r1 < r0) goto L_0x000a;
    L_0x0006:
        r2.quitSafely();
        goto L_0x000d;
    L_0x000a:
        r2.quit();
    L_0x000d:
        r2.join();	 Catch:{ InterruptedException -> 0x0011 }
        goto L_0x0018;	 Catch:{ InterruptedException -> 0x0011 }
    L_0x0011:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x0018:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0Ne.C(android.os.HandlerThread):void");
    }

    /* renamed from: D */
    public final synchronized AnonymousClass2oO m3401D(Callable callable, String str, long j) {
        AnonymousClass2oO B = m3396B(callable, str, null, j);
        return B;
    }

    /* renamed from: E */
    public final Object m3402E(Callable callable, String str) {
        synchronized (this) {
            Object anonymousClass2oO = new AnonymousClass2oO(r3, this.f3655D, this.f3658G, callable, str);
            AnonymousClass0OR.m3624D(r3.f3659H, anonymousClass2oO, 42965059);
            return anonymousClass2oO.get();
        }
    }

    /* renamed from: F */
    public final boolean m3403F() {
        return this.f3656E.getLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: G */
    public final synchronized void m3404G(UUID uuid, Runnable runnable) {
        if (this.f3655D != null) {
            UUID uuid2 = uuid;
            if (this.f3655D.equals(uuid)) {
                Runnable runnable2 = runnable;
                if (this.f3653B != null) {
                    AnonymousClass0OR.m3625E(this.f3653B, runnable2, uuid2, SystemClock.uptimeMillis(), 619984579);
                } else {
                    AnonymousClass0OR.m3625E(AnonymousClass2oP.f34266B, runnable2, uuid2, SystemClock.uptimeMillis(), 197040870);
                }
            }
        }
    }

    public final void finalize() {
        super.finalize();
        AnonymousClass0Ne.m3397C(this.f3654C);
        AnonymousClass0Ne.m3397C(this.f3657F);
    }
}

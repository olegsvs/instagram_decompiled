package X;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.facebook.video.heroplayer.client.HeroPlayer$2;
import com.facebook.video.heroplayer.client.HeroPlayer$HeroServicePlayerListenerImpl;
import com.facebook.video.heroplayer.ipc.HeroServicePlayerListener;
import com.facebook.video.heroplayer.ipc.ServicePlayerState;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1H4 */
public final class AnonymousClass1H4 implements Callback {
    /* renamed from: U */
    public static final AtomicLong f16646U = new AtomicLong(0);
    /* renamed from: V */
    public static final String f16647V = "HeroPlayer";
    /* renamed from: B */
    public final AnonymousClass1Ei f16648B;
    /* renamed from: C */
    public long f16649C;
    /* renamed from: D */
    public final Handler f16650D;
    /* renamed from: E */
    public final AnonymousClass1Gy f16651E;
    /* renamed from: F */
    public final AnonymousClass1c6 f16652F;
    /* renamed from: G */
    public volatile boolean f16653G;
    /* renamed from: H */
    public volatile long f16654H;
    /* renamed from: I */
    public final long[] f16655I;
    /* renamed from: J */
    public final Object f16656J;
    /* renamed from: K */
    public volatile long f16657K;
    /* renamed from: L */
    public volatile long f16658L;
    /* renamed from: M */
    public volatile long f16659M;
    /* renamed from: N */
    public final HeroServicePlayerListener f16660N;
    /* renamed from: O */
    public final AtomicReference f16661O;
    /* renamed from: P */
    public final List f16662P;
    /* renamed from: Q */
    public volatile float f16663Q;
    /* renamed from: R */
    private boolean f16664R;
    /* renamed from: S */
    private final AnonymousClass1H7 f16665S;
    /* renamed from: T */
    private boolean f16666T;

    /* renamed from: I */
    private static long m10588I(long j) {
        return j < 0 ? 0 : j;
    }

    public AnonymousClass1H4(AnonymousClass1H6 anonymousClass1H6, AnonymousClass1Gy anonymousClass1Gy) {
        HandlerThread handlerThread = new HandlerThread("HeroPlayerInternalThread", -2);
        handlerThread.start();
        this(handlerThread.getLooper(), new Handler(Looper.getMainLooper()), anonymousClass1H6, anonymousClass1Gy);
    }

    public AnonymousClass1H4(Looper looper, Handler handler, AnonymousClass1H6 anonymousClass1H6, AnonymousClass1Gy anonymousClass1Gy) {
        this.f16664R = false;
        this.f16665S = new AnonymousClass1H7(this);
        this.f16656J = new Object();
        this.f16654H = 0;
        this.f16655I = new long[]{0, 0};
        this.f16661O = new AtomicReference(new ServicePlayerState());
        this.f16662P = new LinkedList();
        this.f16649C = -1;
        this.f16648B = new AnonymousClass1Ek(this);
        AnonymousClass1H4.m10583D(this, "Create HeroPlayer", new Object[0]);
        this.f16651E = anonymousClass1Gy;
        this.f16664R |= this.f16651E.f16597b;
        this.f16660N = new HeroPlayer$HeroServicePlayerListenerImpl(this);
        this.f16652F = new AnonymousClass1c6(handler, anonymousClass1H6);
        this.f16650D = new Handler(looper, this);
        AnonymousClass17X.f14756W.m9479A(this.f16648B);
    }

    /* renamed from: A */
    public final long m10589A() {
        if (!m10593E()) {
            return 0;
        }
        if (m10587H()) {
            return this.f16657K;
        }
        return ((ServicePlayerState) this.f16661O.get()).f16683B + m10585F();
    }

    /* renamed from: B */
    public final long m10590B() {
        if (!m10593E()) {
            return 0;
        }
        if (!m10587H() || m10586G()) {
            return ((ServicePlayerState) this.f16661O.get()).m10610A() + m10585F();
        }
        return this.f16657K;
    }

    /* renamed from: B */
    public static void m10581B(AnonymousClass1H4 anonymousClass1H4, Message message) {
        anonymousClass1H4.f16650D.sendMessage(message);
    }

    /* renamed from: C */
    public final long m10591C() {
        if (!m10587H() || m10586G()) {
            return AnonymousClass1H4.m10588I(AnonymousClass1H7.m10605J(this.f16665S));
        }
        return this.f16657K;
    }

    /* renamed from: C */
    public static void m10582C(AnonymousClass1H4 anonymousClass1H4, ServicePlayerState servicePlayerState, boolean z) {
        AnonymousClass1H7.m10606K(anonymousClass1H4.f16665S, servicePlayerState);
        if (servicePlayerState.f16698Q > 0 && servicePlayerState.f16699R >= servicePlayerState.f16698Q) {
            long A = servicePlayerState.m10610A();
            long j = servicePlayerState.f16698Q;
            long j2 = servicePlayerState.f16699R;
            Object[] objArr = new Object[1];
            long j3 = j2 - j;
            objArr[0] = Long.valueOf(j3);
            AnonymousClass1H4.m10583D(anonymousClass1H4, "onBufferingStopped, %dms", objArr);
            if (j2 > ((long) anonymousClass1H4.f16651E.wB) + j) {
                synchronized (anonymousClass1H4.f16662P) {
                    anonymousClass1H4.f16662P.add(new Pair(Long.valueOf(j), Long.valueOf(j2)));
                    if (anonymousClass1H4.f16649C == -1) {
                        anonymousClass1H4.f16649C = A;
                    }
                }
            }
            anonymousClass1H4.f16652F.eBA(j3, z);
        }
        if (anonymousClass1H4.f16666T != servicePlayerState.f16689H) {
            anonymousClass1H4.f16666T = servicePlayerState.f16689H;
            boolean z2 = servicePlayerState.f16689H;
            AnonymousClass1H4.m10583D(anonymousClass1H4, "onVisualPlayStateChanged", new Object[0]);
            anonymousClass1H4.f16652F.gGA(z2);
        }
    }

    /* renamed from: D */
    public final Pair m10592D() {
        long j;
        int i;
        long j2;
        synchronized (this.f16662P) {
            j = 0;
            i = 0;
            for (Pair pair : this.f16662P) {
                if (((Long) pair.second).longValue() > ((Long) pair.first).longValue() && ((Long) pair.first).longValue() > 0) {
                    if (((Long) pair.second).longValue() > 0) {
                        j += ((Long) pair.second).longValue() - ((Long) pair.first).longValue();
                        i++;
                    }
                }
                AnonymousClass1H4.m10584E(this, new IllegalStateException("Start stall time is greater or equal to end stall time"), "stallStartMs = %d, stallEndMs = %d", pair.first, pair.second);
            }
            this.f16662P.clear();
            j2 = this.f16649C;
            this.f16649C = -1;
        }
        return new Pair(Long.valueOf(j), new Pair(Integer.valueOf(i), Long.valueOf(j2)));
    }

    /* renamed from: D */
    public static void m10583D(AnonymousClass1H4 anonymousClass1H4, String str, Object... objArr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(anonymousClass1H4.hashCode());
        stringBuilder.append(", playerId[");
        stringBuilder.append(anonymousClass1H4.f16654H);
        stringBuilder.append("]: ");
        stringBuilder.append(str);
        String stringBuilder2 = stringBuilder.toString();
        if (anonymousClass1H4.f16664R) {
            Log.w(f16647V, String.format(stringBuilder2, objArr));
        }
    }

    /* renamed from: E */
    public static void m10584E(AnonymousClass1H4 anonymousClass1H4, Throwable th, String str, Object... objArr) {
        if (anonymousClass1H4.f16664R) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(anonymousClass1H4.hashCode());
            stringBuilder.append(", playerId[");
            stringBuilder.append(anonymousClass1H4.f16654H);
            stringBuilder.append("]: ");
            stringBuilder.append(str);
            stringBuilder.append(", message = ");
            stringBuilder.append(th.getMessage());
            AnonymousClass1Gl.m10576F(f16647V, th, stringBuilder.toString(), objArr);
        }
    }

    /* renamed from: E */
    public final boolean m10593E() {
        return this.f16654H != 0;
    }

    /* renamed from: F */
    private long m10585F() {
        if (m10593E()) {
            return ((ServicePlayerState) this.f16661O.get()).m10611C(SystemClock.elapsedRealtime());
        }
        return 0;
    }

    /* renamed from: F */
    public final void m10594F() {
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
        r7 = this;
        r5 = android.os.SystemClock.elapsedRealtime();
        r3 = r7.f16656J;
        monitor-enter(r3);
        r0 = new X.1c9;	 Catch:{ all -> 0x0037 }
        r0.<init>(r7);	 Catch:{ all -> 0x0037 }
        r7.m10595G(r0);	 Catch:{ all -> 0x0037 }
        r2 = r7.f16656J;	 Catch:{ all -> 0x0037 }
        r0 = r7.f16651E;	 Catch:{ all -> 0x0037 }
        r0 = r0.tB;	 Catch:{ all -> 0x0037 }
        r0 = (long) r0;	 Catch:{ all -> 0x0037 }
        r2.wait(r0);	 Catch:{ InterruptedException -> 0x001a }
        goto L_0x0021;	 Catch:{ InterruptedException -> 0x001a }
    L_0x001a:
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0037 }
        r0.interrupt();	 Catch:{ all -> 0x0037 }
    L_0x0021:
        monitor-exit(r3);	 Catch:{ all -> 0x0037 }
        r4 = "releaseSurface time: %d";
        r0 = 1;
        r3 = new java.lang.Object[r0];
        r2 = 0;
        r0 = android.os.SystemClock.elapsedRealtime();
        r0 = r0 - r5;
        r0 = java.lang.Long.valueOf(r0);
        r3[r2] = r0;
        X.AnonymousClass1H4.m10583D(r7, r4, r3);
        return;
    L_0x0037:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0037 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1H4.F():void");
    }

    /* renamed from: G */
    public final void m10595G(Runnable runnable) {
        AnonymousClass1H4.m10583D(this, "releaseSurface", new Object[0]);
        AnonymousClass1H4.m10581B(this, this.f16650D.obtainMessage(7, new HeroPlayer$2(this, null, runnable)));
    }

    /* renamed from: G */
    private boolean m10586G() {
        VideoPlayRequest videoPlayRequest = this.f16665S.f16672E;
        return videoPlayRequest != null && videoPlayRequest.f15797M.m9474A();
    }

    /* renamed from: H */
    public final void m10596H(VideoPlayRequest videoPlayRequest) {
        AnonymousClass1H4.m10583D(this, "setVideoPlaybackParams: %s", videoPlayRequest.f15797M);
        if (videoPlayRequest.f15797M.m9475B()) {
            AnonymousClass1H4.m10583D(this, "dash manifest: %s", videoPlayRequest.f15797M.f14744I);
            AnonymousClass1H4.m10581B(this, this.f16650D.obtainMessage(1, videoPlayRequest));
            return;
        }
        String str = "Invalid video source";
        AnonymousClass1H4.m10584E(this, new IllegalArgumentException("Invalid video source"), str, new Object[0]);
        this.f16652F.ot("NO_SOURCE", str);
    }

    /* renamed from: H */
    private boolean m10587H() {
        if (((ServicePlayerState) this.f16661O.get()).f16686E >= this.f16658L || SystemClock.elapsedRealtime() - this.f16659M > ((long) this.f16651E.zB)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r17) {
        /*
        r16 = this;
        r0 = r17;
        r2 = r0.what;
        r10 = 1;
        r1 = 0;
        r3 = r16;
        switch(r2) {
            case 1: goto L_0x0513;
            case 2: goto L_0x04b5;
            case 3: goto L_0x046f;
            case 4: goto L_0x0418;
            case 5: goto L_0x03a9;
            case 6: goto L_0x0389;
            case 7: goto L_0x02ff;
            case 8: goto L_0x0276;
            case 9: goto L_0x0250;
            case 10: goto L_0x01f6;
            case 11: goto L_0x01eb;
            case 12: goto L_0x01dc;
            case 13: goto L_0x01ab;
            case 14: goto L_0x01a4;
            case 15: goto L_0x0173;
            case 16: goto L_0x0142;
            case 17: goto L_0x0133;
            case 18: goto L_0x00ef;
            case 19: goto L_0x00a6;
            case 20: goto L_0x005d;
            case 21: goto L_0x000c;
            default: goto L_0x000b;
        };
    L_0x000b:
        return r1;
    L_0x000c:
        r4 = r3.f16665S;
        r5 = r0.obj;
        r5 = (X.AnonymousClass1xR) r5;
        r8 = r4.f16681N;
        r7 = "switchToWarmupPlayer: player id: %d, surface: %s";
        r0 = 2;
        r2 = new java.lang.Object[r0];
        r0 = r5.f24651B;
        r0 = java.lang.Long.valueOf(r0);
        r6 = 0;
        r2[r6] = r0;
        r0 = r5.f24652C;
        r3 = 1;
        r2[r3] = r0;
        X.AnonymousClass1H4.m10583D(r8, r7, r2);
        r0 = r4.f16681N;	 Catch:{ RemoteException -> 0x003e }
        r0 = r0.m10593E();	 Catch:{ RemoteException -> 0x003e }
        if (r0 == 0) goto L_0x0048;
    L_0x0032:
        r2 = X.AnonymousClass1H7.m10599D(r4);	 Catch:{ RemoteException -> 0x003e }
        r0 = r4.f16681N;	 Catch:{ RemoteException -> 0x003e }
        r0 = r0.f16654H;	 Catch:{ RemoteException -> 0x003e }
        r2.JJA(r0, r3);	 Catch:{ RemoteException -> 0x003e }
        goto L_0x0048;
    L_0x003e:
        r3 = move-exception;
        r2 = r4.f16681N;
        r1 = "Error occurs while release player";
        r0 = new java.lang.Object[r6];
        X.AnonymousClass1H4.m10584E(r2, r3, r1, r0);
    L_0x0048:
        r2 = r4.f16681N;
        r0 = r5.f24651B;
        r2.f16654H = r0;
        X.AnonymousClass1H7.m10608M(r4);
        r0 = r5.f24652C;
        if (r0 == 0) goto L_0x005b;
    L_0x0055:
        r0 = r5.f24652C;
        r4.f16678K = r0;
        r4.f16671D = r0;
    L_0x005b:
        goto L_0x051c;
    L_0x005d:
        r6 = r3.f16665S;
        r1 = r0.arg1;
        r0 = r0.arg2;
        r6.f16680M = r1;
        r6.f16679L = r0;
        r5 = 0;
        r0 = r6.f16681N;	 Catch:{ RemoteException -> 0x009a }
        r0 = r0.m10593E();	 Catch:{ RemoteException -> 0x009a }
        if (r0 != 0) goto L_0x007a;
    L_0x0070:
        r2 = r6.f16681N;	 Catch:{ RemoteException -> 0x009a }
        r1 = "Before setSurfaceSize(), service player was evicted. Lazy recover at next play()";
        r0 = new java.lang.Object[r5];	 Catch:{ RemoteException -> 0x009a }
        X.AnonymousClass1H4.m10583D(r2, r1, r0);	 Catch:{ RemoteException -> 0x009a }
        goto L_0x00a4;
    L_0x007a:
        r4 = X.AnonymousClass1H7.m10599D(r6);	 Catch:{ RemoteException -> 0x009a }
        r0 = r6.f16681N;	 Catch:{ RemoteException -> 0x009a }
        r2 = r0.f16654H;	 Catch:{ RemoteException -> 0x009a }
        r1 = r6.f16680M;	 Catch:{ RemoteException -> 0x009a }
        r0 = r6.f16679L;	 Catch:{ RemoteException -> 0x009a }
        r0 = r4.uRA(r2, r1, r0);	 Catch:{ RemoteException -> 0x009a }
        if (r0 != 0) goto L_0x00a4;
    L_0x008c:
        r2 = r6.f16681N;	 Catch:{ RemoteException -> 0x009a }
        r1 = "When setSurfaceSize(), service player is noticed to be evicted earlier. Lazy recover at next play()";
        r0 = new java.lang.Object[r5];	 Catch:{ RemoteException -> 0x009a }
        X.AnonymousClass1H4.m10583D(r2, r1, r0);	 Catch:{ RemoteException -> 0x009a }
        r0 = 1;
        X.AnonymousClass1H7.m10601F(r6, r0);	 Catch:{ RemoteException -> 0x009a }
        goto L_0x00a4;
    L_0x009a:
        r3 = move-exception;
        r2 = r6.f16681N;
        r1 = "Error occurs while setting surface size";
        r0 = new java.lang.Object[r5];
        X.AnonymousClass1H4.m10584E(r2, r3, r1, r0);
    L_0x00a4:
        goto L_0x051c;
    L_0x00a6:
        r5 = r3.f16665S;
        r0 = r0.obj;
        r0 = (java.lang.Boolean) r0;
        r3 = r0.booleanValue();
        r0 = r5.f16681N;
        r0.f16653G = r3;
        r4 = 0;
        r0 = r5.f16681N;	 Catch:{ RemoteException -> 0x00e3 }
        r0 = r0.m10593E();	 Catch:{ RemoteException -> 0x00e3 }
        if (r0 != 0) goto L_0x00c7;
    L_0x00bd:
        r2 = r5.f16681N;	 Catch:{ RemoteException -> 0x00e3 }
        r1 = "Before setLooping(), service player was evicted. Lazy recover at next play()";
        r0 = new java.lang.Object[r4];	 Catch:{ RemoteException -> 0x00e3 }
        X.AnonymousClass1H4.m10583D(r2, r1, r0);	 Catch:{ RemoteException -> 0x00e3 }
        goto L_0x00ed;
    L_0x00c7:
        r2 = X.AnonymousClass1H7.m10599D(r5);	 Catch:{ RemoteException -> 0x00e3 }
        r0 = r5.f16681N;	 Catch:{ RemoteException -> 0x00e3 }
        r0 = r0.f16654H;	 Catch:{ RemoteException -> 0x00e3 }
        r0 = r2.NPA(r0, r3);	 Catch:{ RemoteException -> 0x00e3 }
        if (r0 != 0) goto L_0x00ed;
    L_0x00d5:
        r2 = r5.f16681N;	 Catch:{ RemoteException -> 0x00e3 }
        r1 = "When setLooping(), service player is noticed to be evicted earlier. Lazy recover at next play()";
        r0 = new java.lang.Object[r4];	 Catch:{ RemoteException -> 0x00e3 }
        X.AnonymousClass1H4.m10583D(r2, r1, r0);	 Catch:{ RemoteException -> 0x00e3 }
        r0 = 1;
        X.AnonymousClass1H7.m10601F(r5, r0);	 Catch:{ RemoteException -> 0x00e3 }
        goto L_0x00ed;
    L_0x00e3:
        r3 = move-exception;
        r2 = r5.f16681N;
        r1 = "Error occurs while setting looping";
        r0 = new java.lang.Object[r4];
        X.AnonymousClass1H4.m10584E(r2, r3, r1, r0);
    L_0x00ed:
        goto L_0x051c;
    L_0x00ef:
        r6 = r3.f16665S;
        r0 = r0.arg1;
        r6.f16674G = r0;
        r4 = 0;
        r0 = r6.f16681N;	 Catch:{ RemoteException -> 0x0127 }
        r0 = r0.m10593E();	 Catch:{ RemoteException -> 0x0127 }
        if (r0 != 0) goto L_0x0108;
    L_0x00fe:
        r2 = r6.f16681N;	 Catch:{ RemoteException -> 0x0127 }
        r1 = "Before setRelativePosition(), service player was evicted. Lazy recover at next play()";
        r0 = new java.lang.Object[r4];	 Catch:{ RemoteException -> 0x0127 }
        X.AnonymousClass1H4.m10583D(r2, r1, r0);	 Catch:{ RemoteException -> 0x0127 }
        goto L_0x0131;
    L_0x0108:
        r5 = X.AnonymousClass1H7.m10599D(r6);	 Catch:{ RemoteException -> 0x0127 }
        r0 = r6.f16681N;	 Catch:{ RemoteException -> 0x0127 }
        r2 = r0.f16654H;	 Catch:{ RemoteException -> 0x0127 }
        r0 = r6.f16674G;	 Catch:{ RemoteException -> 0x0127 }
        r0 = (long) r0;	 Catch:{ RemoteException -> 0x0127 }
        r0 = r5.ARA(r2, r0);	 Catch:{ RemoteException -> 0x0127 }
        if (r0 != 0) goto L_0x0131;
    L_0x0119:
        r2 = r6.f16681N;	 Catch:{ RemoteException -> 0x0127 }
        r1 = "When setRelativePosition(), service player is noticed to be evicted earlier. Lazy recover at next play()";
        r0 = new java.lang.Object[r4];	 Catch:{ RemoteException -> 0x0127 }
        X.AnonymousClass1H4.m10583D(r2, r1, r0);	 Catch:{ RemoteException -> 0x0127 }
        r0 = 1;
        X.AnonymousClass1H7.m10601F(r6, r0);	 Catch:{ RemoteException -> 0x0127 }
        goto L_0x0131;
    L_0x0127:
        r3 = move-exception;
        r2 = r6.f16681N;
        r1 = "Error occurs while setting relative position of the video";
        r0 = new java.lang.Object[r4];
        X.AnonymousClass1H4.m10584E(r2, r3, r1, r0);
    L_0x0131:
        goto L_0x051c;
    L_0x0133:
        r0 = r0.obj;
        r0 = (java.lang.String[]) r0;
        r2 = r3.f16665S;
        r1 = r0[r1];
        r0 = r0[r10];
        X.AnonymousClass1H7.m10600E(r2, r1, r0);
        goto L_0x051c;
    L_0x0142:
        r5 = r3.f16665S;
        r3 = r0.obj;
        r3 = (com.facebook.video.heroplayer.ipc.SpatialAudioFocusParams) r3;
        r4 = 0;
        r0 = r5.f16681N;	 Catch:{ RemoteException -> 0x0167 }
        r0 = r0.m10593E();	 Catch:{ RemoteException -> 0x0167 }
        if (r0 != 0) goto L_0x015b;
    L_0x0151:
        r2 = r5.f16681N;	 Catch:{ RemoteException -> 0x0167 }
        r1 = "Before setSpatialAudioFocus(), service player was evicted. Skip setting spatial audio focus";
        r0 = new java.lang.Object[r4];	 Catch:{ RemoteException -> 0x0167 }
        X.AnonymousClass1H4.m10583D(r2, r1, r0);	 Catch:{ RemoteException -> 0x0167 }
        goto L_0x0171;
    L_0x015b:
        r2 = X.AnonymousClass1H7.m10599D(r5);	 Catch:{ RemoteException -> 0x0167 }
        r0 = r5.f16681N;	 Catch:{ RemoteException -> 0x0167 }
        r0 = r0.f16654H;	 Catch:{ RemoteException -> 0x0167 }
        r2.iRA(r0, r3);	 Catch:{ RemoteException -> 0x0167 }
        goto L_0x0171;
    L_0x0167:
        r3 = move-exception;
        r2 = r5.f16681N;
        r1 = "Error occurs while setting spatial audio focus";
        r0 = new java.lang.Object[r4];
        X.AnonymousClass1H4.m10584E(r2, r3, r1, r0);
    L_0x0171:
        goto L_0x051c;
    L_0x0173:
        r5 = r3.f16665S;
        r3 = r0.obj;
        r3 = (com.facebook.video.heroplayer.ipc.DeviceOrientationFrame) r3;
        r4 = 0;
        r0 = r5.f16681N;	 Catch:{ RemoteException -> 0x0198 }
        r0 = r0.m10593E();	 Catch:{ RemoteException -> 0x0198 }
        if (r0 != 0) goto L_0x018c;
    L_0x0182:
        r2 = r5.f16681N;	 Catch:{ RemoteException -> 0x0198 }
        r1 = "Before setDeviceOrientationFrame(), service player was evicted. Skip setting device orientation frame";
        r0 = new java.lang.Object[r4];	 Catch:{ RemoteException -> 0x0198 }
        X.AnonymousClass1H4.m10583D(r2, r1, r0);	 Catch:{ RemoteException -> 0x0198 }
        goto L_0x01a2;
    L_0x018c:
        r2 = X.AnonymousClass1H7.m10599D(r5);	 Catch:{ RemoteException -> 0x0198 }
        r0 = r5.f16681N;	 Catch:{ RemoteException -> 0x0198 }
        r0 = r0.f16654H;	 Catch:{ RemoteException -> 0x0198 }
        r2.hNA(r0, r3);	 Catch:{ RemoteException -> 0x0198 }
        goto L_0x01a2;
    L_0x0198:
        r3 = move-exception;
        r2 = r5.f16681N;
        r1 = "Error occurs while setting device orientation frame";
        r0 = new java.lang.Object[r4];
        X.AnonymousClass1H4.m10584E(r2, r3, r1, r0);
    L_0x01a2:
        goto L_0x051c;
    L_0x01a4:
        r0 = r3.f16665S;
        X.AnonymousClass1H7.m10603H(r0);
        goto L_0x051c;
    L_0x01ab:
        r5 = r3.f16665S;
        r3 = r0.obj;
        r3 = (java.lang.String) r3;
        r4 = 0;
        r0 = r5.f16681N;	 Catch:{ RemoteException -> 0x01d0 }
        r0 = r0.m10593E();	 Catch:{ RemoteException -> 0x01d0 }
        if (r0 != 0) goto L_0x01c4;
    L_0x01ba:
        r2 = r5.f16681N;	 Catch:{ RemoteException -> 0x01d0 }
        r1 = "Before setCustomQuality(), service player was evicted. Skip setting custom quality";
        r0 = new java.lang.Object[r4];	 Catch:{ RemoteException -> 0x01d0 }
        X.AnonymousClass1H4.m10583D(r2, r1, r0);	 Catch:{ RemoteException -> 0x01d0 }
        goto L_0x01da;
    L_0x01c4:
        r2 = X.AnonymousClass1H7.m10599D(r5);	 Catch:{ RemoteException -> 0x01d0 }
        r0 = r5.f16681N;	 Catch:{ RemoteException -> 0x01d0 }
        r0 = r0.f16654H;	 Catch:{ RemoteException -> 0x01d0 }
        r2.aNA(r0, r3);	 Catch:{ RemoteException -> 0x01d0 }
        goto L_0x01da;
    L_0x01d0:
        r3 = move-exception;
        r2 = r5.f16681N;
        r1 = "Error occurs while setting custom quality";
        r0 = new java.lang.Object[r4];
        X.AnonymousClass1H4.m10584E(r2, r3, r1, r0);
    L_0x01da:
        goto L_0x051c;
    L_0x01dc:
        r1 = r3.f16665S;
        r0 = r0.obj;
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        X.AnonymousClass1H7.m10601F(r1, r0);
        goto L_0x051c;
    L_0x01eb:
        r1 = r3.f16665S;
        r0 = r0.obj;
        r0 = (com.facebook.video.heroplayer.ipc.ServicePlayerState) r0;
        X.AnonymousClass1H7.m10606K(r1, r0);
        goto L_0x051c;
    L_0x01f6:
        r7 = r3.f16665S;
        r0 = 0;
        r7.f16676I = r0;
        r7.f16671D = r0;
        r0 = r7.f16681N;
        r0 = r0.m10589A();
        r7.f16669B = r0;
        r0 = r7.f16672E;
        if (r0 == 0) goto L_0x0218;
    L_0x0209:
        r0 = r0.f15797M;
        r0 = r0.m9474A();
        if (r0 == 0) goto L_0x0218;
    L_0x0211:
        r0 = r7.f16681N;
        r0 = r0.m10590B();
        goto L_0x021a;
    L_0x0218:
        r0 = 0;
    L_0x021a:
        r7.f16673F = r0;
        r0 = r7.f16681N;
        r0 = r0.f16661O;
        r6 = r0.get();
        r6 = (com.facebook.video.heroplayer.ipc.ServicePlayerState) r6;
        r4 = android.os.SystemClock.elapsedRealtime();
        r2 = r6.f16683B;
        r0 = r6.m10611C(r4);
        r2 = r2 + r0;
        r6.f16683B = r2;
        r2 = r6.f16696O;
        r0 = r6.m10611C(r4);
        r2 = r2 + r0;
        r6.f16696O = r2;
        r0 = 1;
        r6.f16687F = r0;
        r6.f16701T = r4;
        r0 = r7.f16681N;
        r1 = r0.f16656J;
        monitor-enter(r1);
        r0 = r7.f16681N;	 Catch:{ all -> 0x051d }
        r0 = r0.f16656J;	 Catch:{ all -> 0x051d }
        r0.notifyAll();	 Catch:{ all -> 0x051d }
        monitor-exit(r1);	 Catch:{ all -> 0x051d }
        goto L_0x051c;
    L_0x0250:
        r5 = r3.f16665S;
        r0 = r5.f16681N;	 Catch:{ RemoteException -> 0x0269 }
        r2 = r0.f16654H;	 Catch:{ RemoteException -> 0x0269 }
        X.AnonymousClass1H7.m10598C(r5);	 Catch:{ RemoteException -> 0x0269 }
        r4 = r5.f16681N;	 Catch:{ RemoteException -> 0x0269 }
        r1 = "onVideoServiceConnected";
        r0 = 0;
        r0 = new java.lang.Object[r0];	 Catch:{ RemoteException -> 0x0269 }
        X.AnonymousClass1H4.m10583D(r4, r1, r0);	 Catch:{ RemoteException -> 0x0269 }
        r0 = r4.f16652F;	 Catch:{ RemoteException -> 0x0269 }
        r0.FGA(r2);	 Catch:{ RemoteException -> 0x0269 }
        goto L_0x0274;
    L_0x0269:
        r3 = move-exception;
        r2 = r5.f16681N;
        r1 = "Error occurs in handleServiceConnected";
        r0 = 0;
        r0 = new java.lang.Object[r0];
        X.AnonymousClass1H4.m10584E(r2, r3, r1, r0);
    L_0x0274:
        goto L_0x051c;
    L_0x0276:
        r3 = r3.f16665S;
        r2 = X.AnonymousClass17X.f14756W;
        r0 = r3.f16681N;
        r1 = r0.f16648B;
        r0 = r2.f14770O;
        if (r0 == 0) goto L_0x0288;
    L_0x0282:
        r0 = r2.f14760E;
        r0.remove(r1);
        goto L_0x028d;
    L_0x0288:
        r0 = r2.f14759D;
        r0.remove(r1);
    L_0x028d:
        r5 = 0;
        r0 = r3.f16681N;	 Catch:{ RemoteException -> 0x02bf }
        r0 = r0.m10593E();	 Catch:{ RemoteException -> 0x02bf }
        if (r0 != 0) goto L_0x02a0;
    L_0x0296:
        r2 = r3.f16681N;	 Catch:{ RemoteException -> 0x02bf }
        r1 = "Before release(), service player was evicted. Skip releasing";
        r0 = new java.lang.Object[r5];	 Catch:{ RemoteException -> 0x02bf }
        X.AnonymousClass1H4.m10583D(r2, r1, r0);	 Catch:{ RemoteException -> 0x02bf }
        goto L_0x02c9;
    L_0x02a0:
        r2 = X.AnonymousClass1H7.m10599D(r3);	 Catch:{ RemoteException -> 0x02bf }
        r0 = r3.f16681N;	 Catch:{ RemoteException -> 0x02bf }
        r0 = r0.f16654H;	 Catch:{ RemoteException -> 0x02bf }
        r2.JJA(r0, r5);	 Catch:{ RemoteException -> 0x02bf }
        goto L_0x02c9;
    L_0x02ac:
        r4 = move-exception;
        X.AnonymousClass1H7.m10604I(r3);
        r1 = r3.f16681N;
        r0 = 0;
        r1.f16663Q = r0;
        r2 = r3.f16681N;
        r0 = 0;
        r2.f16654H = r0;
        X.AnonymousClass1H7.m10597B(r3);
        throw r4;
    L_0x02bf:
        r4 = move-exception;
        r2 = r3.f16681N;	 Catch:{ all -> 0x02ac }
        r1 = "Error occurs while release player";
        r0 = new java.lang.Object[r5];	 Catch:{ all -> 0x02ac }
        X.AnonymousClass1H4.m10584E(r2, r4, r1, r0);	 Catch:{ all -> 0x02ac }
    L_0x02c9:
        X.AnonymousClass1H7.m10604I(r3);
        r1 = r3.f16681N;
        r0 = 0;
        r1.f16663Q = r0;
        r2 = r3.f16681N;
        r0 = 0;
        r2.f16654H = r0;
        X.AnonymousClass1H7.m10597B(r3);
        r1 = "HeroPlayerInternalThread";
        r0 = r3.f16681N;
        r0 = r0.f16650D;
        r0 = r0.getLooper();
        r0 = r0.getThread();
        r0 = r0.getName();
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x02fd;
    L_0x02f2:
        r0 = r3.f16681N;
        r0 = r0.f16650D;
        r0 = r0.getLooper();
        r0.quit();
    L_0x02fd:
        goto L_0x051c;
    L_0x02ff:
        r6 = r0.obj;
        r6 = (android.os.ResultReceiver) r6;
        r8 = r3.f16665S;
        r7 = 0;
        r5 = 1;
        r4 = 0;
        r8.f16678K = r4;	 Catch:{ RemoteException -> 0x0379 }
        r0 = -1;
        r8.f16680M = r0;	 Catch:{ RemoteException -> 0x0379 }
        r8.f16679L = r0;	 Catch:{ RemoteException -> 0x0379 }
        r0 = r8.f16681N;	 Catch:{ RemoteException -> 0x0379 }
        r0 = r0.m10593E();	 Catch:{ RemoteException -> 0x0379 }
        if (r0 != 0) goto L_0x0321;
    L_0x0317:
        r2 = r8.f16681N;	 Catch:{ RemoteException -> 0x0379 }
        r1 = "Before releaseSurface(), service player was evicted. Lazy recover at next play()";
        r0 = new java.lang.Object[r7];	 Catch:{ RemoteException -> 0x0379 }
        X.AnonymousClass1H4.m10583D(r2, r1, r0);	 Catch:{ RemoteException -> 0x0379 }
        goto L_0x0373;
    L_0x0321:
        r0 = r8.f16681N;	 Catch:{ RemoteException -> 0x0379 }
        r0 = r0.f16651E;	 Catch:{ RemoteException -> 0x0379 }
        r0 = r0.EC;	 Catch:{ RemoteException -> 0x0379 }
        if (r0 == 0) goto L_0x034e;
    L_0x0329:
        r0 = r8.f16672E;	 Catch:{ RemoteException -> 0x0379 }
        if (r0 != 0) goto L_0x034e;
    L_0x032d:
        r11 = X.AnonymousClass1H7.m10599D(r8);	 Catch:{ RemoteException -> 0x0379 }
        r0 = r8.f16681N;	 Catch:{ RemoteException -> 0x0379 }
        r12 = r0.f16654H;	 Catch:{ RemoteException -> 0x0379 }
        r14 = 0;
        r15 = r8.f16680M;	 Catch:{ RemoteException -> 0x0379 }
        r0 = r8.f16679L;	 Catch:{ RemoteException -> 0x0379 }
        r16 = r0;
        r0 = r11.tRA(r12, r14, r15, r16);	 Catch:{ RemoteException -> 0x0379 }
        if (r0 == 0) goto L_0x034e;
    L_0x0342:
        r2 = r8.f16681N;	 Catch:{ RemoteException -> 0x0379 }
        r1 = "Async release surface since play request is null";
        r0 = new java.lang.Object[r7];	 Catch:{ RemoteException -> 0x0379 }
        X.AnonymousClass1H4.m10583D(r2, r1, r0);	 Catch:{ RemoteException -> 0x0379 }
        r8.f16671D = r4;	 Catch:{ RemoteException -> 0x0379 }
        goto L_0x0373;
    L_0x034e:
        r2 = X.AnonymousClass1H7.m10599D(r8);	 Catch:{ RemoteException -> 0x0379 }
        r0 = r8.f16681N;	 Catch:{ RemoteException -> 0x0379 }
        r0 = r0.f16654H;	 Catch:{ RemoteException -> 0x0379 }
        r0 = r2.UJA(r0, r6);	 Catch:{ RemoteException -> 0x0379 }
        if (r0 == 0) goto L_0x0367;
    L_0x035c:
        r8.f16671D = r4;	 Catch:{ RemoteException -> 0x0364, all -> 0x0360 }
        r6 = r4;
        goto L_0x0373;
    L_0x0360:
        r0 = move-exception;
        r6 = r4;
        goto L_0x0520;
    L_0x0364:
        r3 = move-exception;
        r6 = r4;
        goto L_0x037a;
    L_0x0367:
        r2 = r8.f16681N;	 Catch:{ RemoteException -> 0x0379 }
        r1 = "When releaseSurface(), service player is noticed to be evicted earlier. Lazy recover at next play()";
        r0 = new java.lang.Object[r7];	 Catch:{ RemoteException -> 0x0379 }
        X.AnonymousClass1H4.m10583D(r2, r1, r0);	 Catch:{ RemoteException -> 0x0379 }
        X.AnonymousClass1H7.m10601F(r8, r5);	 Catch:{ RemoteException -> 0x0379 }
    L_0x0373:
        if (r6 == 0) goto L_0x0387;
    L_0x0375:
        goto L_0x0384;
    L_0x0376:
        r0 = move-exception;
        goto L_0x0520;
    L_0x0379:
        r3 = move-exception;
    L_0x037a:
        r2 = r8.f16681N;	 Catch:{ all -> 0x0376 }
        r1 = "Error occurs while releasing surface";
        r0 = new java.lang.Object[r7];	 Catch:{ all -> 0x0376 }
        X.AnonymousClass1H4.m10584E(r2, r3, r1, r0);	 Catch:{ all -> 0x0376 }
        goto L_0x0373;
    L_0x0384:
        r6.send(r5, r4);
    L_0x0387:
        goto L_0x051c;
    L_0x0389:
        r4 = r0.obj;
        r4 = (java.lang.Object[]) r4;
        r3 = r3.f16665S;
        r2 = r4[r1];
        r2 = (android.view.Surface) r2;
        r0 = r4[r10];
        r0 = (java.lang.Integer) r0;
        r1 = r0.intValue();
        r0 = 2;
        r0 = r4[r0];
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        X.AnonymousClass1H7.m10607L(r3, r2, r1, r0);
        goto L_0x051c;
    L_0x03a9:
        r5 = r3.f16665S;
        r0 = r0.obj;
        r0 = (java.lang.Float) r0;
        r9 = r0.floatValue();
        r8 = 0;
        r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1));
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r6 = 1;
        r4 = 0;
        if (r0 < 0) goto L_0x03c0;
    L_0x03bc:
        r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r0 <= 0) goto L_0x03cf;
    L_0x03c0:
        r3 = r5.f16681N;
        r2 = "Trying to set volume with invalid value %f";
        r1 = new java.lang.Object[r6];
        r0 = java.lang.Float.valueOf(r9);
        r1[r4] = r0;
        X.AnonymousClass1H4.m10583D(r3, r2, r1);
    L_0x03cf:
        r1 = r5.f16681N;
        r0 = java.lang.Math.min(r7, r9);
        r0 = java.lang.Math.max(r8, r0);
        r1.f16663Q = r0;
        r0 = r5.f16681N;	 Catch:{ RemoteException -> 0x040c }
        r0 = r0.m10593E();	 Catch:{ RemoteException -> 0x040c }
        if (r0 != 0) goto L_0x03ed;
    L_0x03e3:
        r2 = r5.f16681N;	 Catch:{ RemoteException -> 0x040c }
        r1 = "Before setVolume(), service player was evicted. Lazy recover at next play()";
        r0 = new java.lang.Object[r4];	 Catch:{ RemoteException -> 0x040c }
        X.AnonymousClass1H4.m10583D(r2, r1, r0);	 Catch:{ RemoteException -> 0x040c }
        goto L_0x0416;
    L_0x03ed:
        r3 = X.AnonymousClass1H7.m10599D(r5);	 Catch:{ RemoteException -> 0x040c }
        r0 = r5.f16681N;	 Catch:{ RemoteException -> 0x040c }
        r1 = r0.f16654H;	 Catch:{ RemoteException -> 0x040c }
        r0 = r5.f16681N;	 Catch:{ RemoteException -> 0x040c }
        r0 = r0.f16663Q;	 Catch:{ RemoteException -> 0x040c }
        r0 = r3.pSA(r1, r0);	 Catch:{ RemoteException -> 0x040c }
        if (r0 != 0) goto L_0x0416;
    L_0x03ff:
        r2 = r5.f16681N;	 Catch:{ RemoteException -> 0x040c }
        r1 = "When setVolume(), service player is noticed to be evicted earlier. Lazy recover at next play()";
        r0 = new java.lang.Object[r4];	 Catch:{ RemoteException -> 0x040c }
        X.AnonymousClass1H4.m10583D(r2, r1, r0);	 Catch:{ RemoteException -> 0x040c }
        X.AnonymousClass1H7.m10601F(r5, r6);	 Catch:{ RemoteException -> 0x040c }
        goto L_0x0416;
    L_0x040c:
        r3 = move-exception;
        r2 = r5.f16681N;
        r1 = "Error occurs while setting volume";
        r0 = new java.lang.Object[r4];
        X.AnonymousClass1H4.m10584E(r2, r3, r1, r0);
    L_0x0416:
        goto L_0x051c;
    L_0x0418:
        r2 = r0.obj;
        r2 = (long[]) r2;
        r5 = r3.f16665S;
        r0 = r2[r1];
        r0 = (int) r0;
        r16 = r2[r10];
        r5.f16675H = r0;
        r4 = 0;
        r0 = r5.f16681N;	 Catch:{ RemoteException -> 0x045d }
        r0 = r0.m10593E();	 Catch:{ RemoteException -> 0x045d }
        if (r0 != 0) goto L_0x043e;
    L_0x042e:
        r2 = r5.f16681N;	 Catch:{ RemoteException -> 0x045d }
        r1 = "Before seekTo(), service player was evicted. Lazy recover at next play()";
        r0 = new java.lang.Object[r4];	 Catch:{ RemoteException -> 0x045d }
        X.AnonymousClass1H4.m10583D(r2, r1, r0);	 Catch:{ RemoteException -> 0x045d }
        r2 = r5.f16681N;	 Catch:{ RemoteException -> 0x045d }
        r0 = 0;
        r2.f16658L = r0;	 Catch:{ RemoteException -> 0x045d }
        goto L_0x046d;
    L_0x043e:
        r11 = X.AnonymousClass1H7.m10599D(r5);	 Catch:{ RemoteException -> 0x045d }
        r0 = r5.f16681N;	 Catch:{ RemoteException -> 0x045d }
        r12 = r0.f16654H;	 Catch:{ RemoteException -> 0x045d }
        r0 = r5.f16675H;	 Catch:{ RemoteException -> 0x045d }
        r14 = (long) r0;	 Catch:{ RemoteException -> 0x045d }
        r0 = r11.xLA(r12, r14, r16);	 Catch:{ RemoteException -> 0x045d }
        if (r0 != 0) goto L_0x046d;
    L_0x044f:
        r2 = r5.f16681N;	 Catch:{ RemoteException -> 0x045d }
        r1 = "When seekTo(), service player is noticed to be evicted earlier. Lazy recover at next play()";
        r0 = new java.lang.Object[r4];	 Catch:{ RemoteException -> 0x045d }
        X.AnonymousClass1H4.m10583D(r2, r1, r0);	 Catch:{ RemoteException -> 0x045d }
        r0 = 1;
        X.AnonymousClass1H7.m10601F(r5, r0);	 Catch:{ RemoteException -> 0x045d }
        goto L_0x046d;
    L_0x045d:
        r3 = move-exception;
        r2 = r5.f16681N;
        r0 = 0;
        r2.f16658L = r0;
        r2 = r5.f16681N;
        r1 = "Error occurs while seeking the video";
        r0 = new java.lang.Object[r4];
        X.AnonymousClass1H4.m10584E(r2, r3, r1, r0);
    L_0x046d:
        goto L_0x051c;
    L_0x046f:
        r5 = r3.f16665S;
        r0 = r0.obj;
        r0 = (java.lang.Boolean) r0;
        r3 = r0.booleanValue();
        r4 = 0;
        r5.f16677J = r4;
        r0 = r5.f16681N;	 Catch:{ RemoteException -> 0x04aa }
        r0 = r0.m10593E();	 Catch:{ RemoteException -> 0x04aa }
        if (r0 != 0) goto L_0x048e;
    L_0x0484:
        r2 = r5.f16681N;	 Catch:{ RemoteException -> 0x04aa }
        r1 = "Before pause(), service player was evicted. Lazy recover at next play()";
        r0 = new java.lang.Object[r4];	 Catch:{ RemoteException -> 0x04aa }
        X.AnonymousClass1H4.m10583D(r2, r1, r0);	 Catch:{ RemoteException -> 0x04aa }
        goto L_0x04b4;
    L_0x048e:
        r2 = X.AnonymousClass1H7.m10599D(r5);	 Catch:{ RemoteException -> 0x04aa }
        r0 = r5.f16681N;	 Catch:{ RemoteException -> 0x04aa }
        r0 = r0.f16654H;	 Catch:{ RemoteException -> 0x04aa }
        r0 = r2.HHA(r0, r3);	 Catch:{ RemoteException -> 0x04aa }
        if (r0 != 0) goto L_0x04b4;
    L_0x049c:
        r2 = r5.f16681N;	 Catch:{ RemoteException -> 0x04aa }
        r1 = "When pause(), service player is noticed to be evicted earlier. Lazy recover at next play()";
        r0 = new java.lang.Object[r4];	 Catch:{ RemoteException -> 0x04aa }
        X.AnonymousClass1H4.m10583D(r2, r1, r0);	 Catch:{ RemoteException -> 0x04aa }
        r0 = 1;
        X.AnonymousClass1H7.m10601F(r5, r0);	 Catch:{ RemoteException -> 0x04aa }
        goto L_0x04b4;
    L_0x04aa:
        r3 = move-exception;
        r2 = r5.f16681N;
        r1 = "Error occurs while pausing the video";
        r0 = new java.lang.Object[r4];
        X.AnonymousClass1H4.m10584E(r2, r3, r1, r0);
    L_0x04b4:
        goto L_0x051c;
    L_0x04b5:
        r5 = r3.f16665S;
        r0 = r5.f16670C;
        r4 = 0;
        if (r0 == 0) goto L_0x04ca;
    L_0x04bc:
        X.AnonymousClass1H7.m10598C(r5);	 Catch:{ RemoteException -> 0x04c0 }
        goto L_0x04ca;
    L_0x04c0:
        r3 = move-exception;
        r2 = r5.f16681N;
        r1 = "Error occurs while ensureAndRecoverServicePlayer in play";
        r0 = new java.lang.Object[r4];
        X.AnonymousClass1H4.m10584E(r2, r3, r1, r0);
    L_0x04ca:
        r0 = r5.f16681N;
        r0 = r0.f16652F;
        r0.EGA();
        r3 = 1;
        r5.f16677J = r3;
        r0 = r5.f16681N;	 Catch:{ RemoteException -> 0x0508 }
        r0 = r0.m10593E();	 Catch:{ RemoteException -> 0x0508 }
        if (r0 != 0) goto L_0x04e6;
    L_0x04dc:
        r2 = r5.f16681N;	 Catch:{ RemoteException -> 0x0508 }
        r1 = "Before play(), service player was evicted. Recover now";
        r0 = new java.lang.Object[r4];	 Catch:{ RemoteException -> 0x0508 }
        X.AnonymousClass1H4.m10583D(r2, r1, r0);	 Catch:{ RemoteException -> 0x0508 }
        goto L_0x0501;
    L_0x04e6:
        r2 = X.AnonymousClass1H7.m10599D(r5);	 Catch:{ RemoteException -> 0x0508 }
        r0 = r5.f16681N;	 Catch:{ RemoteException -> 0x0508 }
        r0 = r0.f16654H;	 Catch:{ RemoteException -> 0x0508 }
        r0 = r2.THA(r0);	 Catch:{ RemoteException -> 0x0508 }
        if (r0 == 0) goto L_0x04f5;
    L_0x04f4:
        goto L_0x0502;
    L_0x04f5:
        r2 = r5.f16681N;	 Catch:{ RemoteException -> 0x0508 }
        r1 = "When play(), service player is noticed to be evicted earlier. Recover now";
        r0 = new java.lang.Object[r4];	 Catch:{ RemoteException -> 0x0508 }
        X.AnonymousClass1H4.m10583D(r2, r1, r0);	 Catch:{ RemoteException -> 0x0508 }
        X.AnonymousClass1H7.m10601F(r5, r3);	 Catch:{ RemoteException -> 0x0508 }
    L_0x0501:
        r3 = 0;
    L_0x0502:
        if (r3 != 0) goto L_0x0512;
    L_0x0504:
        X.AnonymousClass1H7.m10598C(r5);	 Catch:{ RemoteException -> 0x0508 }
        goto L_0x0512;
    L_0x0508:
        r3 = move-exception;
        r2 = r5.f16681N;
        r1 = "Error occurs while sending play request";
        r0 = new java.lang.Object[r4];
        X.AnonymousClass1H4.m10584E(r2, r3, r1, r0);
    L_0x0512:
        goto L_0x051c;
    L_0x0513:
        r1 = r3.f16665S;
        r0 = r0.obj;
        r0 = (com.facebook.video.heroplayer.ipc.VideoPlayRequest) r0;
        X.AnonymousClass1H7.m10602G(r1, r0);
    L_0x051c:
        return r10;
    L_0x051d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x051d }
    L_0x051f:
        throw r0;
    L_0x0520:
        if (r6 == 0) goto L_0x051f;
    L_0x0522:
        r6.send(r5, r4);
        goto L_0x051f;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1H4.handleMessage(android.os.Message):boolean");
    }
}

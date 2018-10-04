package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.20K */
public final class AnonymousClass20K implements Callback {
    /* renamed from: O */
    public static final Status f25174O = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* renamed from: P */
    public static final Status f25175P = new Status(4, "The user must be signed in to make this API call.");
    /* renamed from: Q */
    public static AnonymousClass20K f25176Q;
    /* renamed from: R */
    public static final Object f25177R = new Object();
    /* renamed from: B */
    public final Context f25178B;
    /* renamed from: C */
    public final Handler f25179C;
    /* renamed from: D */
    public final AnonymousClass1En f25180D;
    /* renamed from: E */
    public final Map f25181E = new ConcurrentHashMap(5, 0.75f, 1);
    /* renamed from: F */
    public long f25182F = 120000;
    /* renamed from: G */
    public long f25183G = 5000;
    /* renamed from: H */
    public long f25184H = 10000;
    /* renamed from: I */
    public int f25185I = -1;
    /* renamed from: J */
    public final AtomicInteger f25186J = new AtomicInteger(1);
    /* renamed from: K */
    public final AtomicInteger f25187K = new AtomicInteger(0);
    /* renamed from: L */
    public AnonymousClass2dl f25188L = null;
    /* renamed from: M */
    public final Set f25189M = new AnonymousClass1ze();
    /* renamed from: N */
    public final Set f25190N = new AnonymousClass1ze();

    private AnonymousClass20K(Context context, Looper looper, AnonymousClass1En anonymousClass1En) {
        this.f25178B = context;
        this.f25179C = new Handler(looper, this);
        this.f25180D = anonymousClass1En;
        Handler handler = this.f25179C;
        handler.sendMessage(handler.obtainMessage(6));
    }

    /* renamed from: B */
    public static AnonymousClass20K m14145B(Context context) {
        AnonymousClass20K anonymousClass20K;
        synchronized (f25177R) {
            if (f25176Q == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f25176Q = new AnonymousClass20K(context.getApplicationContext(), handlerThread.getLooper(), AnonymousClass1En.f15943B);
            }
            anonymousClass20K = f25176Q;
        }
        return anonymousClass20K;
    }

    /* renamed from: C */
    private final void m14146C(AnonymousClass1yp anonymousClass1yp) {
        AnonymousClass1zz anonymousClass1zz = anonymousClass1yp.f24963D;
        AnonymousClass2dn anonymousClass2dn = (AnonymousClass2dn) this.f25181E.get(anonymousClass1zz);
        if (anonymousClass2dn == null) {
            anonymousClass2dn = new AnonymousClass2dn(this, anonymousClass1yp);
            this.f25181E.put(anonymousClass1zz, anonymousClass2dn);
        }
        if (anonymousClass2dn.f31908B.SYA()) {
            this.f25190N.add(anonymousClass1zz);
        }
        anonymousClass2dn.m16651A();
    }

    /* renamed from: A */
    public final PendingIntent m14147A(AnonymousClass1zz anonymousClass1zz, int i) {
        AnonymousClass2dn anonymousClass2dn = (AnonymousClass2dn) this.f25181E.get(anonymousClass1zz);
        if (anonymousClass2dn != null) {
            AnonymousClass2SU F = anonymousClass2dn.m16656F();
            if (F != null) {
                return PendingIntent.getActivity(this.f25178B, i, F.QYA(), 134217728);
            }
        }
        return null;
    }

    /* renamed from: B */
    public final AnonymousClass21F m14148B(Iterable iterable) {
        AnonymousClass200 anonymousClass200 = new AnonymousClass200(iterable);
        for (AnonymousClass1yp anonymousClass1yp : iterable) {
            AnonymousClass2dn anonymousClass2dn = (AnonymousClass2dn) this.f25181E.get(anonymousClass1yp.f24963D);
            if (anonymousClass2dn != null) {
                if (!anonymousClass2dn.f31908B.isConnected()) {
                }
            }
            Handler handler = this.f25179C;
            handler.sendMessage(handler.obtainMessage(2, anonymousClass200));
        }
        anonymousClass200.f25149C.m14185B(null);
        return anonymousClass200.f25149C.f25283B;
    }

    /* renamed from: C */
    public final void m14149C(ConnectionResult connectionResult, int i) {
        if (!m14150D(connectionResult, i)) {
            Handler handler = this.f25179C;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    /* renamed from: D */
    public final boolean m14150D(ConnectionResult connectionResult, int i) {
        return this.f25180D.F(this.f25178B, connectionResult, i);
    }

    /* renamed from: E */
    public final void m14151E() {
        Handler handler = this.f25179C;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r9) {
        /*
        r8 = this;
        r0 = r9.what;
        r6 = 1;
        r1 = 300000; // 0x493e0 float:4.2039E-40 double:1.482197E-318;
        switch(r0) {
            case 1: goto L_0x0270;
            case 2: goto L_0x0211;
            case 3: goto L_0x01f4;
            case 4: goto L_0x01ac;
            case 5: goto L_0x011a;
            case 6: goto L_0x00dd;
            case 7: goto L_0x00d4;
            case 8: goto L_0x01ac;
            case 9: goto L_0x00b0;
            case 10: goto L_0x008b;
            case 11: goto L_0x003e;
            case 12: goto L_0x0025;
            case 13: goto L_0x01ac;
            default: goto L_0x0009;
        };
    L_0x0009:
        r3 = "GoogleApiManager";
        r2 = r9.what;
        r0 = 31;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r0);
        r0 = "Unknown message id: ";
        r1.append(r0);
        r1.append(r2);
        r0 = r1.toString();
        android.util.Log.w(r3, r0);
        r0 = 0;
        return r0;
    L_0x0025:
        r1 = r8.f25181E;
        r0 = r9.obj;
        r0 = r1.containsKey(r0);
        if (r0 == 0) goto L_0x02a7;
    L_0x002f:
        r1 = r8.f25181E;
        r0 = r9.obj;
        r0 = r1.get(r0);
        r0 = (X.AnonymousClass2dn) r0;
        r0.m16655E();
        goto L_0x02a7;
    L_0x003e:
        r1 = r8.f25181E;
        r0 = r9.obj;
        r0 = r1.containsKey(r0);
        if (r0 == 0) goto L_0x02a7;
    L_0x0048:
        r1 = r8.f25181E;
        r0 = r9.obj;
        r3 = r1.get(r0);
        r3 = (X.AnonymousClass2dn) r3;
        r0 = r3.f31910D;
        r0 = r0.f25179C;
        X.AnonymousClass1Ew.B(r0);
        r0 = r3.f31909C;
        if (r0 == 0) goto L_0x02a7;
    L_0x005d:
        X.AnonymousClass2dn.m16647D(r3);
        r0 = r3.f31910D;
        r1 = r0.f25180D;
        r0 = r3.f31910D;
        r0 = r0.f25178B;
        r1 = r1.B(r0);
        r0 = 18;
        r2 = 8;
        if (r1 != r0) goto L_0x007a;
    L_0x0072:
        r1 = new com.google.android.gms.common.api.Status;
        r0 = "Connection timed out while waiting for Google Play services update to complete.";
        r1.<init>(r2, r0);
        goto L_0x0081;
    L_0x007a:
        r1 = new com.google.android.gms.common.api.Status;
        r0 = "API failed to connect while resuming due to an unknown error.";
        r1.<init>(r2, r0);
    L_0x0081:
        r3.m16657G(r1);
        r0 = r3.f31908B;
        r0.gG();
        goto L_0x02a7;
    L_0x008b:
        r0 = r8.f25190N;
        r2 = r0.iterator();
    L_0x0091:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x00a9;
    L_0x0097:
        r1 = r2.next();
        r1 = (X.AnonymousClass1zz) r1;
        r0 = r8.f25181E;
        r0 = r0.remove(r1);
        r0 = (X.AnonymousClass2dn) r0;
        r0.m16652B();
        goto L_0x0091;
    L_0x00a9:
        r0 = r8.f25190N;
        r0.clear();
        goto L_0x02a7;
    L_0x00b0:
        r1 = r8.f25181E;
        r0 = r9.obj;
        r0 = r1.containsKey(r0);
        if (r0 == 0) goto L_0x02a7;
    L_0x00ba:
        r1 = r8.f25181E;
        r0 = r9.obj;
        r1 = r1.get(r0);
        r1 = (X.AnonymousClass2dn) r1;
        r0 = r1.f31910D;
        r0 = r0.f25179C;
        X.AnonymousClass1Ew.B(r0);
        r0 = r1.f31909C;
        if (r0 == 0) goto L_0x02a7;
    L_0x00cf:
        r1.m16651A();
        goto L_0x02a7;
    L_0x00d4:
        r0 = r9.obj;
        r0 = (X.AnonymousClass1yp) r0;
        r8.m14146C(r0);
        goto L_0x02a7;
    L_0x00dd:
        r0 = r8.f25178B;
        r0 = r0.getApplicationContext();
        r0 = r0 instanceof android.app.Application;
        if (r0 == 0) goto L_0x02a7;
    L_0x00e7:
        r0 = r8.f25178B;
        r3 = r0.getApplicationContext();
        r3 = (android.app.Application) r3;
        r4 = X.AnonymousClass201.f25152F;
        monitor-enter(r4);
        r0 = r4.f25154C;	 Catch:{ all -> 0x02a8 }
        if (r0 != 0) goto L_0x00ff;
    L_0x00f6:
        r3.registerActivityLifecycleCallbacks(r4);	 Catch:{ all -> 0x02a8 }
        r3.registerComponentCallbacks(r4);	 Catch:{ all -> 0x02a8 }
        r0 = 1;
        r4.f25154C = r0;	 Catch:{ all -> 0x02a8 }
    L_0x00ff:
        monitor-exit(r4);	 Catch:{ all -> 0x02a8 }
        r5 = X.AnonymousClass201.f25152F;
        r4 = new X.2TK;
        r4.<init>(r8);
        r3 = X.AnonymousClass201.f25152F;
        monitor-enter(r3);
        r0 = r5.f25153B;	 Catch:{ all -> 0x02ab }
        r0.add(r4);	 Catch:{ all -> 0x02ab }
        monitor-exit(r3);	 Catch:{ all -> 0x02ab }
        r0 = r5.m14137A(r6);
        if (r0 != 0) goto L_0x02a7;
    L_0x0116:
        r8.f25184H = r1;
        goto L_0x02a7;
    L_0x011a:
        r4 = r9.arg1;
        r3 = r9.obj;
        r3 = (com.google.android.gms.common.ConnectionResult) r3;
        r7 = 0;
        r0 = r8.f25181E;
        r0 = r0.values();
        r2 = r0.iterator();
    L_0x012b:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x013c;
    L_0x0131:
        r1 = r2.next();
        r1 = (X.AnonymousClass2dn) r1;
        r0 = r1.f31913G;
        if (r0 != r4) goto L_0x012b;
    L_0x013b:
        r7 = r1;
    L_0x013c:
        if (r7 == 0) goto L_0x0188;
    L_0x013e:
        r5 = new com.google.android.gms.common.api.Status;
        r4 = 17;
        r1 = r8.f25180D;
        r0 = r3.f15967C;
        r0 = r1.A(r0);
        r8 = java.lang.String.valueOf(r0);
        r0 = r3.f15968D;
        r3 = java.lang.String.valueOf(r0);
        r0 = java.lang.String.valueOf(r8);
        r0 = r0.length();
        r2 = r0 + 69;
        r0 = java.lang.String.valueOf(r3);
        r0 = r0.length();
        r2 = r2 + r0;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r2);
        r0 = "Error resolution was canceled by the user, original error message: ";
        r1.append(r0);
        r1.append(r8);
        r0 = ": ";
        r1.append(r0);
        r1.append(r3);
        r0 = r1.toString();
        r5.<init>(r4, r0);
        r7.m16657G(r5);
        goto L_0x02a7;
    L_0x0188:
        r2 = "GoogleApiManager";
        r0 = 76;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r0);
        r0 = "Could not find API instance ";
        r1.append(r0);
        r1.append(r4);
        r0 = " while trying to fail enqueued calls.";
        r1.append(r0);
        r1 = r1.toString();
        r0 = new java.lang.Exception;
        r0.<init>();
        android.util.Log.wtf(r2, r1, r0);
        goto L_0x02a7;
    L_0x01ac:
        r3 = r9.obj;
        r3 = (X.AnonymousClass20W) r3;
        r1 = r8.f25181E;
        r0 = r3.f25207D;
        r0 = r0.f24963D;
        r2 = r1.get(r0);
        r2 = (X.AnonymousClass2dn) r2;
        if (r2 != 0) goto L_0x01cf;
    L_0x01be:
        r0 = r3.f25207D;
        r8.m14146C(r0);
        r1 = r8.f25181E;
        r0 = r3.f25207D;
        r0 = r0.f24963D;
        r2 = r1.get(r0);
        r2 = (X.AnonymousClass2dn) r2;
    L_0x01cf:
        r0 = r2.f31908B;
        r0 = r0.SYA();
        if (r0 == 0) goto L_0x01ed;
    L_0x01d7:
        r0 = r8.f25187K;
        r1 = r0.get();
        r0 = r3.f25206C;
        if (r1 == r0) goto L_0x01ed;
    L_0x01e1:
        r1 = r3.f25205B;
        r0 = f25174O;
        r1.mo3064C(r0);
        r2.m16652B();
        goto L_0x02a7;
    L_0x01ed:
        r0 = r3.f25205B;
        r2.m16653C(r0);
        goto L_0x02a7;
    L_0x01f4:
        r0 = r8.f25181E;
        r0 = r0.values();
        r1 = r0.iterator();
    L_0x01fe:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x02a7;
    L_0x0204:
        r0 = r1.next();
        r0 = (X.AnonymousClass2dn) r0;
        r0.m16654D();
        r0.m16651A();
        goto L_0x01fe;
    L_0x0211:
        r2 = r9.obj;
        r2 = (X.AnonymousClass200) r2;
        r0 = r2.f25148B;
        r0 = r0.keySet();
        r4 = r0.iterator();
    L_0x021f:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x02a7;
    L_0x0225:
        r3 = r4.next();
        r3 = (X.AnonymousClass1zz) r3;
        r0 = r8.f25181E;
        r1 = r0.get(r3);
        r1 = (X.AnonymousClass2dn) r1;
        if (r1 != 0) goto L_0x0240;
    L_0x0235:
        r1 = new com.google.android.gms.common.ConnectionResult;
        r0 = 13;
        r1.<init>(r0);
        r2.m14135A(r3, r1);
        goto L_0x02a7;
    L_0x0240:
        r0 = r1.f31908B;
        r0 = r0.isConnected();
        if (r0 == 0) goto L_0x024e;
    L_0x0248:
        r0 = com.google.android.gms.common.ConnectionResult.f15965F;
    L_0x024a:
        r2.m14135A(r3, r0);
        goto L_0x021f;
    L_0x024e:
        r0 = r1.f31910D;
        r0 = r0.f25179C;
        X.AnonymousClass1Ew.B(r0);
        r0 = r1.f31914H;
        if (r0 == 0) goto L_0x0263;
    L_0x0259:
        r0 = r1.f31910D;
        r0 = r0.f25179C;
        X.AnonymousClass1Ew.B(r0);
        r0 = r1.f31914H;
        goto L_0x024a;
    L_0x0263:
        r0 = r1.f31910D;
        r0 = r0.f25179C;
        X.AnonymousClass1Ew.B(r0);
        r0 = r1.f31911E;
        r0.add(r2);
        goto L_0x021f;
    L_0x0270:
        r0 = r9.obj;
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x027c;
    L_0x027a:
        r1 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
    L_0x027c:
        r8.f25184H = r1;
        r0 = r8.f25179C;
        r5 = 12;
        r0.removeMessages(r5);
        r0 = r8.f25181E;
        r0 = r0.keySet();
        r4 = r0.iterator();
    L_0x028f:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x02a7;
    L_0x0295:
        r0 = r4.next();
        r0 = (X.AnonymousClass1zz) r0;
        r3 = r8.f25179C;
        r2 = r3.obtainMessage(r5, r0);
        r0 = r8.f25184H;
        r3.sendMessageDelayed(r2, r0);
        goto L_0x028f;
    L_0x02a7:
        return r6;
    L_0x02a8:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x02a8 }
    L_0x02aa:
        throw r0;
    L_0x02ab:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x02ab }
        goto L_0x02aa;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.20K.handleMessage(android.os.Message):boolean");
    }
}

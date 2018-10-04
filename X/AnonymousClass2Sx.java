package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: X.2Sx */
public final class AnonymousClass2Sx implements AnonymousClass20O {
    /* renamed from: B */
    public final Map f30666B = new HashMap();
    /* renamed from: C */
    public final Map f30667C = new HashMap();
    /* renamed from: D */
    public final AnonymousClass2TF f30668D;
    /* renamed from: E */
    public final Condition f30669E;
    /* renamed from: F */
    public final boolean f30670F;
    /* renamed from: G */
    public boolean f30671G;
    /* renamed from: H */
    public Map f30672H;
    /* renamed from: I */
    public Map f30673I;
    /* renamed from: J */
    public ConnectionResult f30674J;
    /* renamed from: K */
    public final Lock f30675K;
    /* renamed from: L */
    private final AnonymousClass20K f30676L;
    /* renamed from: M */
    private final AnonymousClass1za f30677M;
    /* renamed from: N */
    private final Map f30678N;
    /* renamed from: O */
    private final AnonymousClass1Eo f30679O;
    /* renamed from: P */
    private final boolean f30680P;
    /* renamed from: Q */
    private final Queue f30681Q = new LinkedList();
    /* renamed from: R */
    private AnonymousClass2Sz f30682R;
    /* renamed from: S */
    private final Looper f30683S;

    public AnonymousClass2Sx(Context context, Lock lock, Looper looper, AnonymousClass1Eo anonymousClass1Eo, Map map, AnonymousClass1za anonymousClass1za, Map map2, AnonymousClass2ST anonymousClass2ST, ArrayList arrayList, AnonymousClass2TF anonymousClass2TF, boolean z) {
        AnonymousClass20K anonymousClass20K;
        ArrayList arrayList2 = arrayList;
        AnonymousClass2Sx anonymousClass2Sx = this;
        Lock lock2 = lock;
        this.f30675K = lock2;
        this.f30683S = looper;
        this.f30669E = lock2.newCondition();
        this.f30679O = anonymousClass1Eo;
        this.f30668D = anonymousClass2TF;
        Map map3 = map2;
        this.f30678N = map3;
        this.f30677M = anonymousClass1za;
        this.f30680P = z;
        Map hashMap = new HashMap();
        for (AnonymousClass1yl anonymousClass1yl : map3.keySet()) {
            AnonymousClass1yl anonymousClass1yl2;
            hashMap.put(anonymousClass1yl2.m13989B(), anonymousClass1yl2);
        }
        Map hashMap2 = new HashMap();
        arrayList2 = arrayList2;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            AnonymousClass2Sr anonymousClass2Sr = (AnonymousClass2Sr) obj;
            hashMap2.put(anonymousClass2Sr.f30644C, anonymousClass2Sr);
        }
        boolean z2 = true;
        Object obj2 = null;
        Object obj3 = 1;
        Object obj4 = null;
        for (Entry entry : map.entrySet()) {
            anonymousClass1yl2 = (AnonymousClass1yl) hashMap.get(entry.getKey());
            AnonymousClass2SU anonymousClass2SU = (AnonymousClass2SU) entry.getValue();
            if (anonymousClass2SU.XYA()) {
                if (!((Boolean) anonymousClass2Sx.f30678N.get(anonymousClass1yl2)).booleanValue()) {
                    obj4 = 1;
                }
                obj2 = 1;
            } else {
                obj3 = null;
            }
            AnonymousClass2SU anonymousClass2SU2 = anonymousClass2SU;
            AnonymousClass1yl anonymousClass1yl3 = anonymousClass1yl2;
            AnonymousClass2Sw anonymousClass2Sw = new AnonymousClass2Sw(context, anonymousClass1yl3, looper, anonymousClass2SU2, (AnonymousClass2Sr) hashMap2.get(anonymousClass1yl2), anonymousClass1za, anonymousClass2ST);
            anonymousClass2Sx.f30666B.put((AnonymousClass1yj) entry.getKey(), anonymousClass2Sw);
            if (anonymousClass2SU.SYA()) {
                anonymousClass2Sx.f30667C.put((AnonymousClass1yj) entry.getKey(), anonymousClass2Sw);
            }
        }
        if (obj2 == null || r12 != null || r11 != null) {
            z2 = false;
        }
        anonymousClass2Sx.f30670F = z2;
        synchronized (AnonymousClass20K.f25177R) {
            AnonymousClass1Ew.E(AnonymousClass20K.f25176Q, "Must guarantee manager is non-null before using getInstance");
            anonymousClass20K = AnonymousClass20K.f25176Q;
        }
        anonymousClass2Sx.f30676L = anonymousClass20K;
    }

    /* renamed from: B */
    public static final boolean m15854B(AnonymousClass2Sx anonymousClass2Sx, AnonymousClass2Sw anonymousClass2Sw, ConnectionResult connectionResult) {
        return !connectionResult.B() && !connectionResult.A() && ((Boolean) anonymousClass2Sx.f30678N.get(anonymousClass2Sw.f24967H)).booleanValue() && anonymousClass2Sw.f30662B.XYA() && anonymousClass2Sx.f30679O.C(connectionResult.f15967C);
    }

    /* renamed from: C */
    public static final ConnectionResult m15855C(AnonymousClass2Sx anonymousClass2Sx, AnonymousClass1yj anonymousClass1yj) {
        anonymousClass2Sx.f30675K.lock();
        try {
            AnonymousClass2Sw anonymousClass2Sw = (AnonymousClass2Sw) anonymousClass2Sx.f30666B.get(anonymousClass1yj);
            if (anonymousClass2Sx.f30672H == null || anonymousClass2Sw == null) {
                anonymousClass2Sx.f30675K.unlock();
                return null;
            }
            ConnectionResult connectionResult = (ConnectionResult) anonymousClass2Sx.f30672H.get(anonymousClass2Sw.f24963D);
            return connectionResult;
        } finally {
            anonymousClass2Sx.f30675K.unlock();
        }
    }

    /* renamed from: D */
    public static final void m15856D(AnonymousClass2Sx anonymousClass2Sx) {
        AnonymousClass2TF anonymousClass2TF;
        Set emptySet;
        AnonymousClass1za anonymousClass1za = anonymousClass2Sx.f30677M;
        if (anonymousClass1za == null) {
            anonymousClass2TF = anonymousClass2Sx.f30668D;
            emptySet = Collections.emptySet();
        } else {
            emptySet = new HashSet(anonymousClass1za.f25083B);
            Map map = anonymousClass2Sx.f30677M.f25086E;
            for (AnonymousClass1yl anonymousClass1yl : map.keySet()) {
                ConnectionResult C = AnonymousClass2Sx.m15855C(anonymousClass2Sx, anonymousClass1yl.m13989B());
                if (C != null && C.B()) {
                    emptySet.addAll(((AnonymousClass1hh) map.get(anonymousClass1yl)).f21551B);
                }
            }
            anonymousClass2TF = anonymousClass2Sx.f30668D;
        }
        anonymousClass2TF.f30735F = emptySet;
    }

    /* renamed from: E */
    public static final void m15857E(AnonymousClass2Sx anonymousClass2Sx) {
        while (!anonymousClass2Sx.f30681Q.isEmpty()) {
            anonymousClass2Sx.FYA((AnonymousClass2dk) anonymousClass2Sx.f30681Q.remove());
        }
        anonymousClass2Sx.f30668D.NYA(null);
    }

    /* renamed from: F */
    public static final ConnectionResult m15858F(AnonymousClass2Sx anonymousClass2Sx) {
        ConnectionResult connectionResult = null;
        ConnectionResult connectionResult2 = null;
        int i = 0;
        int i2 = 0;
        for (AnonymousClass2Sw anonymousClass2Sw : anonymousClass2Sx.f30666B.values()) {
            AnonymousClass1yl anonymousClass1yl = anonymousClass2Sw.f24967H;
            ConnectionResult connectionResult3 = (ConnectionResult) anonymousClass2Sx.f30672H.get(anonymousClass2Sw.f24963D);
            if (!connectionResult3.B() && (!((Boolean) anonymousClass2Sx.f30678N.get(anonymousClass1yl)).booleanValue() || connectionResult3.A() || anonymousClass2Sx.f30679O.C(connectionResult3.f15967C))) {
                if (connectionResult3.f15967C == 4 && anonymousClass2Sx.f30680P) {
                    if (connectionResult2 == null || i2 > Integer.MAX_VALUE) {
                        connectionResult2 = connectionResult3;
                        i2 = Integer.MAX_VALUE;
                    }
                } else if (connectionResult == null || i > Integer.MAX_VALUE) {
                    connectionResult = connectionResult3;
                    i = Integer.MAX_VALUE;
                }
            }
        }
        return (connectionResult == null || connectionResult2 == null || i <= i2) ? connectionResult : connectionResult2;
    }

    /* renamed from: G */
    private final boolean m15859G(AnonymousClass2dk anonymousClass2dk) {
        AnonymousClass1yj anonymousClass1yj = anonymousClass2dk.f31891B;
        ConnectionResult C = AnonymousClass2Sx.m15855C(this, anonymousClass1yj);
        if (C == null || C.f15967C != 4) {
            return false;
        }
        anonymousClass2dk.m16642O(new Status(4, null, this.f30676L.m14147A(((AnonymousClass2Sw) this.f30666B.get(anonymousClass1yj)).f24963D, System.identityHashCode(this.f30668D))));
        return true;
    }

    /* renamed from: H */
    private final boolean m15860H() {
        this.f30675K.lock();
        try {
            if (this.f30671G) {
                if (this.f30680P) {
                    for (AnonymousClass1yj C : this.f30667C.keySet()) {
                        ConnectionResult C2 = AnonymousClass2Sx.m15855C(this, C);
                        if (C2 != null) {
                            if (!C2.B()) {
                            }
                        }
                    }
                    this.f30675K.unlock();
                    return true;
                }
            }
            this.f30675K.unlock();
            return false;
        } catch (Throwable th) {
            this.f30675K.unlock();
        }
    }

    public final AnonymousClass2dk BYA(AnonymousClass2dk anonymousClass2dk) {
        if (this.f30680P && m15859G(anonymousClass2dk)) {
            return anonymousClass2dk;
        }
        if (isConnected()) {
            this.f30668D.f30737H.m14158B(anonymousClass2dk);
            return AnonymousClass1yp.m13991B((AnonymousClass2Sw) this.f30666B.get(anonymousClass2dk.f31891B), 0, anonymousClass2dk);
        }
        this.f30681Q.add(anonymousClass2dk);
        return anonymousClass2dk;
    }

    public final AnonymousClass2dk FYA(AnonymousClass2dk anonymousClass2dk) {
        AnonymousClass1yj anonymousClass1yj = anonymousClass2dk.f31891B;
        if (this.f30680P && m15859G(anonymousClass2dk)) {
            return anonymousClass2dk;
        }
        this.f30668D.f30737H.m14158B(anonymousClass2dk);
        return AnonymousClass1yp.m13991B((AnonymousClass2Sw) this.f30666B.get(anonymousClass1yj), 1, anonymousClass2dk);
    }

    public final void YYA() {
        this.f30675K.lock();
        try {
            AnonymousClass20K anonymousClass20K = this.f30676L;
            anonymousClass20K.f25187K.incrementAndGet();
            Handler handler = anonymousClass20K.f25179C;
            handler.sendMessage(handler.obtainMessage(10));
            if (this.f30682R != null) {
                this.f30682R.f30685B.OYA();
                this.f30682R = null;
            }
            if (this.f30673I == null) {
                this.f30673I = new AnonymousClass0O7(this.f30667C.size());
            }
            ConnectionResult connectionResult = new ConnectionResult(4);
            for (AnonymousClass2Sw anonymousClass2Sw : this.f30667C.values()) {
                this.f30673I.put(anonymousClass2Sw.f24963D, connectionResult);
            }
            if (this.f30672H != null) {
                this.f30672H.putAll(this.f30673I);
            }
            this.f30675K.unlock();
        } catch (Throwable th) {
            this.f30675K.unlock();
        }
    }

    public final void connect() {
        this.f30675K.lock();
        try {
            if (!this.f30671G) {
                this.f30671G = true;
                this.f30672H = null;
                this.f30673I = null;
                this.f30682R = null;
                this.f30674J = null;
                this.f30676L.m14151E();
                this.f30676L.m14148B(this.f30666B.values()).mo3134B(new AnonymousClass20x(this.f30683S), new AnonymousClass2Sy(this));
            }
            this.f30675K.unlock();
        } catch (Throwable th) {
            this.f30675K.unlock();
        }
    }

    public final void gG() {
        this.f30675K.lock();
        try {
            this.f30671G = false;
            this.f30672H = null;
            this.f30673I = null;
            if (this.f30682R != null) {
                this.f30682R.f30685B.OYA();
                this.f30682R = null;
            }
            this.f30674J = null;
            while (!this.f30681Q.isEmpty()) {
                AnonymousClass2dk anonymousClass2dk = (AnonymousClass2dk) this.f30681Q.remove();
                anonymousClass2dk.m15839I(null);
                anonymousClass2dk.m15835E();
            }
            this.f30669E.signalAll();
        } finally {
            this.f30675K.unlock();
        }
    }

    public final boolean isConnected() {
        this.f30675K.lock();
        try {
            boolean z = this.f30672H != null && this.f30674J == null;
            this.f30675K.unlock();
            return z;
        } catch (Throwable th) {
            this.f30675K.unlock();
        }
    }

    public final boolean nXA(AnonymousClass20Z anonymousClass20Z) {
        this.f30675K.lock();
        try {
            if (!this.f30671G || m15860H()) {
                this.f30675K.unlock();
                return false;
            }
            this.f30676L.m14151E();
            this.f30682R = new AnonymousClass2Sz(this, anonymousClass20Z);
            this.f30676L.m14148B(this.f30667C.values()).mo3134B(new AnonymousClass20x(this.f30683S), this.f30682R);
            return true;
        } finally {
            this.f30675K.unlock();
        }
    }

    public final com.google.android.gms.common.ConnectionResult vC() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r3.connect();
    L_0x0003:
        r0 = r3.f30675K;
        r0.lock();
        r0 = r3.f30672H;	 Catch:{ all -> 0x0046 }
        if (r0 != 0) goto L_0x0012;	 Catch:{ all -> 0x0046 }
    L_0x000c:
        r0 = r3.f30671G;	 Catch:{ all -> 0x0046 }
        if (r0 == 0) goto L_0x0012;	 Catch:{ all -> 0x0046 }
    L_0x0010:
        r1 = 1;	 Catch:{ all -> 0x0046 }
        goto L_0x0013;	 Catch:{ all -> 0x0046 }
    L_0x0012:
        r1 = 0;	 Catch:{ all -> 0x0046 }
    L_0x0013:
        r0 = r3.f30675K;
        r0.unlock();
        r2 = 0;
        if (r1 == 0) goto L_0x0030;
    L_0x001b:
        r0 = r3.f30669E;	 Catch:{ InterruptedException -> 0x0021 }
        r0.await();	 Catch:{ InterruptedException -> 0x0021 }
        goto L_0x0003;	 Catch:{ InterruptedException -> 0x0021 }
    L_0x0021:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
        r1 = new com.google.android.gms.common.ConnectionResult;
        r0 = 15;
        r1.<init>(r0, r2);
        return r1;
    L_0x0030:
        r0 = r3.isConnected();
        if (r0 == 0) goto L_0x0039;
    L_0x0036:
        r0 = com.google.android.gms.common.ConnectionResult.f15965F;
        return r0;
    L_0x0039:
        r0 = r3.f30674J;
        if (r0 == 0) goto L_0x003e;
    L_0x003d:
        return r0;
    L_0x003e:
        r1 = new com.google.android.gms.common.ConnectionResult;
        r0 = 13;
        r1.<init>(r0, r2);
        return r1;
    L_0x0046:
        r1 = move-exception;
        r0 = r3.f30675K;
        r0.unlock();
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2Sx.vC():com.google.android.gms.common.ConnectionResult");
    }

    public final void vG(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}

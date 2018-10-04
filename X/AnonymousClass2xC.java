package X;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: X.2xC */
public final class AnonymousClass2xC implements Callback {
    /* renamed from: B */
    public final AnonymousClass2yA f36177B;
    /* renamed from: C */
    public boolean f36178C;
    /* renamed from: D */
    public long f36179D;
    /* renamed from: E */
    public final Handler f36180E = new Handler(this);
    /* renamed from: F */
    public boolean f36181F;
    /* renamed from: G */
    public long f36182G;
    /* renamed from: H */
    public AnonymousClass3w7 f36183H;
    /* renamed from: I */
    public final TreeMap f36184I = new TreeMap();
    /* renamed from: J */
    public final AnonymousClass2xB f36185J;
    /* renamed from: K */
    public boolean f36186K;
    /* renamed from: L */
    private long f36187L;

    public AnonymousClass2xC(AnonymousClass3w7 anonymousClass3w7, AnonymousClass2xB anonymousClass2xB, AnonymousClass2yA anonymousClass2yA) {
        this.f36183H = anonymousClass3w7;
        this.f36185J = anonymousClass2xB;
        this.f36177B = anonymousClass2yA;
        AnonymousClass3va anonymousClass3va = new AnonymousClass3va();
        this.f36182G = -9223372036854775807L;
        this.f36187L = -9223372036854775807L;
    }

    /* renamed from: A */
    public final boolean m17906A(long j) {
        if (!this.f36183H.f47112D) {
            return false;
        }
        boolean z = true;
        if (!this.f36181F) {
            if (!this.f36178C) {
                Entry ceilingEntry = this.f36184I.ceilingEntry(Long.valueOf(this.f36183H.f47116H));
                if (ceilingEntry == null || ((Long) ceilingEntry.getValue()).longValue() >= j) {
                    z = false;
                } else {
                    this.f36179D = ((Long) ceilingEntry.getKey()).longValue();
                    this.f36185J.Li(this.f36179D);
                }
            }
            if (z) {
                AnonymousClass2xC.m17905C(this);
            }
        }
        return z;
    }

    /* renamed from: B */
    public static long m17904B(com.google.android.exoplayer2.metadata.emsg.EventMessage r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = new java.lang.String;	 Catch:{ 2uR -> 0x000c }
        r0 = r2.f46973D;	 Catch:{ 2uR -> 0x000c }
        r1.<init>(r0);	 Catch:{ 2uR -> 0x000c }
        r0 = X.AnonymousClass2yi.m18102W(r1);	 Catch:{ 2uR -> 0x000c }
        return r0;	 Catch:{ 2uR -> 0x000c }
    L_0x000c:
        r0 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2xC.B(com.google.android.exoplayer2.metadata.emsg.EventMessage):long");
    }

    /* renamed from: B */
    public final boolean m17907B(AnonymousClass3vp anonymousClass3vp) {
        if (this.f36183H.f47112D) {
            if (this.f36181F) {
                return true;
            }
            long j = this.f36182G;
            Object obj = (j == -9223372036854775807L || j >= anonymousClass3vp.f47032E) ? null : 1;
            if (obj != null) {
                AnonymousClass2xC.m17905C(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    private static void m17905C(AnonymousClass2xC anonymousClass2xC) {
        long j = anonymousClass2xC.f36187L;
        if (j == -9223372036854775807L || j != anonymousClass2xC.f36182G) {
            anonymousClass2xC.f36181F = true;
            anonymousClass2xC.f36187L = anonymousClass2xC.f36182G;
            anonymousClass2xC.f36185J.Mi();
        }
    }

    public final boolean handleMessage(Message message) {
        if (!this.f36186K) {
            switch (message.what) {
                case 1:
                    this.f36178C = true;
                    this.f36185J.Ki();
                    return true;
                case 2:
                    AnonymousClass2xA anonymousClass2xA = (AnonymousClass2xA) message.obj;
                    long j = anonymousClass2xA.f36175B;
                    long j2 = anonymousClass2xA.f36176C;
                    Long l = (Long) this.f36184I.get(Long.valueOf(j2));
                    if (l != null) {
                        if (l.longValue() > j) {
                        }
                    }
                    this.f36184I.put(Long.valueOf(j2), Long.valueOf(j));
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}

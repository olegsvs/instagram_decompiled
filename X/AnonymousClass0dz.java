package X;

import android.os.HandlerThread;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.0dz */
public final class AnonymousClass0dz {
    /* renamed from: B */
    public final AnonymousClass16D f7559B;
    /* renamed from: C */
    public final AnonymousClass16E f7560C;
    /* renamed from: D */
    public Map f7561D = new HashMap();
    /* renamed from: E */
    public final Random f7562E = new Random();
    /* renamed from: F */
    private volatile boolean f7563F = false;

    public AnonymousClass0dz(AnonymousClass16A anonymousClass16A, AnonymousClass16B anonymousClass16B, AnonymousClass16C anonymousClass16C, AnonymousClass16D anonymousClass16D) {
        if (anonymousClass16C.f14499B == null) {
            HandlerThread handlerThread = new HandlerThread("funnellogger-worker", 10);
            handlerThread.start();
            anonymousClass16C.f14499B = handlerThread.getLooper();
        }
        this.f7560C = new AnonymousClass16E(this, anonymousClass16C.f14499B);
        this.f7559B = anonymousClass16D;
    }

    /* renamed from: A */
    public final synchronized void m6162A(AnonymousClass0e1 anonymousClass0e1, long j, String str) {
        AnonymousClass0dz.m6161J(anonymousClass0e1);
        AnonymousClass16G B = AnonymousClass16F.m9381B();
        B.f14513E = anonymousClass0e1;
        AnonymousClass16G B2 = B.m9383B(j);
        B2.f14515G = str;
        this.f7560C.sendMessage(this.f7560C.obtainMessage(4, B2.m9384C(System.currentTimeMillis()).m9382A()));
    }

    /* renamed from: B */
    public static void m6153B(AnonymousClass0dz anonymousClass0dz, AnonymousClass1IB anonymousClass1IB, AnonymousClass1uf anonymousClass1uf, long j) {
        anonymousClass1IB.f16841B.add(new AnonymousClass1IA("funnel_end", (int) (j - anonymousClass1IB.f16842C), anonymousClass1uf.A(), (AnonymousClass1ug) null));
        anonymousClass1IB.f16845F = j;
        AnonymousClass0lA B = AnonymousClass0lA.m7236B();
        for (AnonymousClass1IA anonymousClass1IA : anonymousClass1IB.f16841B) {
            AnonymousClass0db G = AnonymousClass0db.m6067C().m6074G("name", anonymousClass1IA.f16836B).m6070C("relative_time", anonymousClass1IA.f16839E).m6074G("tag", anonymousClass1IA.f16840F);
            if (anonymousClass1IA.f16837C != null) {
                G.m6072E("payload", AnonymousClass16A.m9378B(anonymousClass1IA.f16837C));
            } else if (anonymousClass1IA.f16838D != null) {
                G.m6074G("payload", anonymousClass1IA.f16838D);
            }
            B.m7238B(G);
        }
        AnonymousClass0NN F = AnonymousClass0NN.m3291B("ig_funnel_analytics", null).m3298F("name", anonymousClass1IB.f16843D.f7570G).m3294B("funnel_id", anonymousClass1IB.f16843D.f7565B).m3295C("instance_id", anonymousClass1IB.f16844E).m3294B("sampling_rate", anonymousClass1IB.f16847H).m3295C(TraceFieldType.StartTime, anonymousClass1IB.f16842C).m3300H("pseudo_end", anonymousClass1IB.f16843D.f7566C).m3297E("actions", B).m3298F("app_device_id", AnonymousClass0Dt.f1941C.m1313B());
        if (anonymousClass1IB.f16848I != null) {
            F.m3299G("tags", anonymousClass1IB.f16848I);
        }
        if (anonymousClass1IB.f16846G != null) {
            F.m3296D("payload", AnonymousClass16A.m9378B(anonymousClass1IB.f16846G));
        }
        F.m3310R();
        anonymousClass1uf.A();
    }

    /* renamed from: B */
    public final synchronized void m6163B(AnonymousClass0e1 anonymousClass0e1, String str) {
        AnonymousClass0dz.m6161J(anonymousClass0e1);
        AnonymousClass16G B = AnonymousClass16F.m9381B();
        B.f14513E = anonymousClass0e1;
        B.f14515G = str;
        this.f7560C.sendMessage(this.f7560C.obtainMessage(4, B.m9384C(System.currentTimeMillis()).m9382A()));
    }

    /* renamed from: C */
    public static String m6154C(AnonymousClass16F anonymousClass16F) {
        if (anonymousClass16F.f14508H == null) {
            return anonymousClass16F.f14505E.f7570G;
        }
        AnonymousClass0e1 anonymousClass0e1 = anonymousClass16F.f14505E;
        long longValue = anonymousClass16F.f14508H.longValue();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(anonymousClass0e1.f7570G);
        stringBuilder.append(":");
        stringBuilder.append(longValue);
        return stringBuilder.toString();
    }

    /* renamed from: C */
    public final synchronized void m6164C(AnonymousClass0e1 anonymousClass0e1, long j, String str) {
        m6168G(anonymousClass0e1, j, str, null, null);
    }

    /* renamed from: D */
    public static AnonymousClass1IB m6155D(AnonymousClass0dz anonymousClass0dz, AnonymousClass0e1 anonymousClass0e1, long j, long j2) {
        return new AnonymousClass1IB(anonymousClass0e1, j, 1, j2);
    }

    /* renamed from: D */
    public final synchronized void m6165D(AnonymousClass0e1 anonymousClass0e1, String str) {
        m6169H(anonymousClass0e1, str, null, null);
    }

    /* renamed from: E */
    public final synchronized void m6166E(AnonymousClass0e1 anonymousClass0e1, long j, String str, String str2) {
        m6168G(anonymousClass0e1, j, str, str2, null);
    }

    /* renamed from: E */
    public static boolean m6156E(AnonymousClass0dz anonymousClass0dz, AnonymousClass1IB anonymousClass1IB) {
        if (!anonymousClass1IB.f16843D.f7569F) {
            return false;
        }
        AnonymousClass0dz.m6153B(anonymousClass0dz, anonymousClass1IB, AnonymousClass1uf.f24038G, System.currentTimeMillis());
        return true;
    }

    /* renamed from: F */
    public final synchronized void m6167F(AnonymousClass0e1 anonymousClass0e1, String str, String str2) {
        m6169H(anonymousClass0e1, str, str2, null);
    }

    /* renamed from: F */
    public static boolean m6157F(AnonymousClass0dz anonymousClass0dz, AnonymousClass1IB anonymousClass1IB) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - anonymousClass1IB.f16845F <= ((long) Math.min(anonymousClass1IB.f16843D.f7567D, 86400)) * 1000) {
            return false;
        }
        AnonymousClass0dz.m6153B(anonymousClass0dz, anonymousClass1IB, AnonymousClass1uf.f24039H, currentTimeMillis);
        return true;
    }

    /* renamed from: G */
    public static void m6158G(AnonymousClass0dz anonymousClass0dz) {
        if (!anonymousClass0dz.f7563F) {
            try {
                Map A = anonymousClass0dz.f7559B.m9379A();
                if (!(A == null || A.isEmpty())) {
                    anonymousClass0dz.f7561D = A;
                }
            } catch (Throwable e) {
                AnonymousClass0Dc.m1260W("FunnelLoggerImpl", e, "Failed to load funnels", new Object[0]);
            } catch (Throwable th) {
                anonymousClass0dz.f7563F = true;
            }
            anonymousClass0dz.f7563F = true;
        }
    }

    /* renamed from: G */
    public final synchronized void m6168G(AnonymousClass0e1 anonymousClass0e1, long j, String str, String str2, AnonymousClass1ug anonymousClass1ug) {
        AnonymousClass0dz.m6161J(anonymousClass0e1);
        AnonymousClass16G B = AnonymousClass16F.m9381B();
        B.f14513E = anonymousClass0e1;
        AnonymousClass16G B2 = B.m9383B(j);
        B2.f14510B = str;
        B2.f14512D = str2;
        B2.f14511C = anonymousClass1ug;
        this.f7560C.sendMessage(this.f7560C.obtainMessage(3, B2.m9384C(System.currentTimeMillis()).m9382A()));
    }

    /* renamed from: H */
    public final synchronized void m6169H(AnonymousClass0e1 anonymousClass0e1, String str, String str2, AnonymousClass1ug anonymousClass1ug) {
        AnonymousClass0dz.m6161J(anonymousClass0e1);
        AnonymousClass16G B = AnonymousClass16F.m9381B();
        B.f14513E = anonymousClass0e1;
        B.f14510B = str;
        B.f14512D = str2;
        B.f14511C = anonymousClass1ug;
        this.f7560C.sendMessage(this.f7560C.obtainMessage(3, B.m9384C(System.currentTimeMillis()).m9382A()));
    }

    /* renamed from: H */
    public static boolean m6159H(AnonymousClass0dz anonymousClass0dz, AnonymousClass1IB anonymousClass1IB) {
        if (!anonymousClass1IB.f16843D.f7566C) {
            return false;
        }
        AnonymousClass1I9 anonymousClass1I9 = new AnonymousClass1I9();
        anonymousClass1I9.f16830D = anonymousClass1IB.f16843D;
        anonymousClass1I9.f16831E = anonymousClass1IB.f16844E;
        anonymousClass1I9.f16834H = anonymousClass1IB.f16847H;
        anonymousClass1I9.f16829C = anonymousClass1IB.f16842C;
        anonymousClass1I9.f16832F = anonymousClass1IB.f16845F;
        if (anonymousClass1IB.f16848I != null) {
            anonymousClass1I9.f16835I = new ArrayList(anonymousClass1IB.f16848I);
        }
        if (anonymousClass1IB.f16841B != null) {
            List arrayList = new ArrayList();
            for (AnonymousClass1IA anonymousClass1IA : anonymousClass1IB.f16841B) {
                arrayList.add(new AnonymousClass1IA(anonymousClass1IA.f16836B, anonymousClass1IA.f16839E, anonymousClass1IA.f16840F, anonymousClass1IA.f16837C));
            }
            anonymousClass1I9.f16828B = arrayList;
        }
        AnonymousClass0dz.m6153B(anonymousClass0dz, new AnonymousClass1IB(anonymousClass1I9), AnonymousClass1uf.f24038G, System.currentTimeMillis());
        return true;
    }

    /* renamed from: I */
    public static void m6160I(AnonymousClass0dz anonymousClass0dz, String str, AnonymousClass0e1 anonymousClass0e1, long j, long j2) {
        AnonymousClass0e1 anonymousClass0e12 = anonymousClass0e1;
        if (anonymousClass0e1.f7568E) {
            AnonymousClass0dz anonymousClass0dz2 = anonymousClass0dz;
            AnonymousClass0dz.m6158G(anonymousClass0dz);
            if (!anonymousClass0dz.f7561D.containsKey(str)) {
                AnonymousClass1IB D = AnonymousClass0dz.m6155D(anonymousClass0dz2, anonymousClass0e12, j, j2);
                if (D != null) {
                    anonymousClass0dz2.f7561D.put(str, D);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Must enable noop funnels in the FunnelDefinition to use startFunnelIfNotStarted()");
    }

    /* renamed from: I */
    public final synchronized void m6170I(AnonymousClass0e1 anonymousClass0e1) {
        AnonymousClass0dz.m6161J(anonymousClass0e1);
        AnonymousClass16G B = AnonymousClass16F.m9381B();
        B.f14513E = anonymousClass0e1;
        this.f7560C.sendMessage(this.f7560C.obtainMessage(2, B.m9384C(System.currentTimeMillis()).m9382A()));
    }

    /* renamed from: J */
    public static void m6161J(AnonymousClass0e1 anonymousClass0e1) {
        if (anonymousClass0e1 == null) {
            throw new IllegalArgumentException("FunnelDefinition is null, expecting non-null value");
        }
    }

    /* renamed from: J */
    public final synchronized void m6171J(AnonymousClass0e1 anonymousClass0e1, long j) {
        AnonymousClass0dz.m6161J(anonymousClass0e1);
        AnonymousClass16G B = AnonymousClass16F.m9381B();
        B.f14513E = anonymousClass0e1;
        this.f7560C.sendMessage(this.f7560C.obtainMessage(2, B.m9383B(j).m9384C(System.currentTimeMillis()).m9382A()));
    }

    /* renamed from: K */
    public final synchronized void m6172K(AnonymousClass0e1 anonymousClass0e1) {
        AnonymousClass0dz.m6161J(anonymousClass0e1);
        AnonymousClass16G B = AnonymousClass16F.m9381B();
        B.f14513E = anonymousClass0e1;
        this.f7560C.sendMessage(this.f7560C.obtainMessage(1, B.m9384C(System.currentTimeMillis()).m9382A()));
    }

    /* renamed from: L */
    public final synchronized void m6173L(AnonymousClass0e1 anonymousClass0e1, long j) {
        AnonymousClass0dz.m6161J(anonymousClass0e1);
        AnonymousClass16G B = AnonymousClass16F.m9381B();
        B.f14513E = anonymousClass0e1;
        this.f7560C.sendMessage(this.f7560C.obtainMessage(1, B.m9383B(j).m9384C(System.currentTimeMillis()).m9382A()));
    }
}

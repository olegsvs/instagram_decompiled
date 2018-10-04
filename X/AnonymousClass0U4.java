package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.MessageQueue.IdleHandler;
import com.facebook.C0164R;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: X.0U4 */
public final class AnonymousClass0U4 implements AnonymousClass0G2 {
    /* renamed from: W */
    public static final IntentFilter f5332W = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    /* renamed from: X */
    public static final List f5333X = new ArrayList();
    /* renamed from: Y */
    public static final List f5334Y = new ArrayList();
    /* renamed from: B */
    public final Handler f5335B;
    /* renamed from: C */
    public final BroadcastReceiver f5336C = new AnonymousClass0Xk(this);
    /* renamed from: D */
    public final Context f5337D;
    /* renamed from: E */
    public final AnonymousClass0Xh f5338E = new AnonymousClass0Xh(6);
    /* renamed from: F */
    public final IdleHandler f5339F = new AnonymousClass0Xl(this);
    /* renamed from: G */
    public boolean f5340G;
    /* renamed from: H */
    public volatile boolean f5341H;
    /* renamed from: I */
    public volatile boolean f5342I;
    /* renamed from: J */
    public final AnonymousClass0Xn f5343J;
    /* renamed from: K */
    public final ArrayList f5344K = new ArrayList();
    /* renamed from: L */
    public final List f5345L;
    /* renamed from: M */
    public final List f5346M;
    /* renamed from: N */
    public final AnonymousClass0WN f5347N;
    /* renamed from: O */
    public final Runnable f5348O = new AnonymousClass0Xj(this);
    /* renamed from: P */
    public final AnonymousClass0Xg f5349P;
    /* renamed from: Q */
    public final boolean f5350Q;
    /* renamed from: R */
    public final boolean f5351R;
    /* renamed from: S */
    public final AnonymousClass0Cm f5352S;
    /* renamed from: T */
    private final int f5353T;
    /* renamed from: U */
    private final Runnable f5354U = new AnonymousClass0Xi(this);
    /* renamed from: V */
    private final int f5355V;

    private AnonymousClass0U4(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0WN anonymousClass0WN, AnonymousClass0Xg anonymousClass0Xg, List list, List list2) {
        this.f5337D = context;
        this.f5352S = anonymousClass0Cm;
        this.f5347N = anonymousClass0WN;
        this.f5349P = anonymousClass0Xg;
        this.f5345L = list;
        this.f5346M = list2;
        this.f5343J = new AnonymousClass0Xn(context, anonymousClass0Cm);
        this.f5335B = new Handler(AnonymousClass0Vg.m4896B(anonymousClass0Cm).m4897A(), new AnonymousClass0Xm(this));
        this.f5350Q = ((Boolean) AnonymousClass0CC.FH.m846H(anonymousClass0Cm)).booleanValue();
        this.f5353T = ((Integer) AnonymousClass0CC.DH.m846H(anonymousClass0Cm)).intValue();
        this.f5355V = ((Integer) AnonymousClass0CC.EH.m846H(anonymousClass0Cm)).intValue();
        this.f5351R = ((Boolean) AnonymousClass0CC.vG.m846H(anonymousClass0Cm)).booleanValue();
        AnonymousClass0Sy.m4437F(new AnonymousClass0Xo(this));
    }

    /* renamed from: A */
    public final void m4685A() {
        for (AnonymousClass5Wh B : this.f5345L) {
            AnonymousClass5Wh.B(B, new AnonymousClass4ic("cancel").A());
        }
        this.f5341H = false;
        this.f5335B.removeMessages(5);
    }

    /* renamed from: B */
    public static synchronized AnonymousClass09b m4676B(String str, AnonymousClass0Oc anonymousClass0Oc, AnonymousClass0U3 anonymousClass0U3) {
        AnonymousClass09b anonymousClass09b;
        synchronized (AnonymousClass0U4.class) {
            anonymousClass09b = new AnonymousClass09b(str, anonymousClass0Oc, anonymousClass0U3);
        }
        return anonymousClass09b;
    }

    /* renamed from: B */
    public final synchronized void m4686B(AnonymousClass0U0 anonymousClass0U0) {
        AnonymousClass4i5 anonymousClass4i5 = new AnonymousClass4i5(anonymousClass0U0, true, false);
        if (this.f5351R) {
            this.f5335B.obtainMessage(1, anonymousClass4i5).sendToTarget();
        } else {
            AnonymousClass0U4.m4679E(this, anonymousClass4i5, true);
        }
    }

    /* renamed from: C */
    public static synchronized AnonymousClass0U4 m4677C(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0U4 anonymousClass0U4;
        Class cls = AnonymousClass0U4.class;
        synchronized (cls) {
            AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
            anonymousClass0U4 = (AnonymousClass0U4) anonymousClass0Cm.m1036A(cls);
            if (anonymousClass0U4 == null) {
                Context context = AnonymousClass0EV.f1977B;
                anonymousClass0Cm = new ArrayList();
                Map hashMap = new HashMap();
                for (Entry entry : AnonymousClass5WY.f65646C.entrySet()) {
                    hashMap.put(entry.getKey(), new AnonymousClass4i2((AnonymousClass4ib) entry.getValue()));
                }
                anonymousClass0Cm.add(new AnonymousClass5WY(hashMap));
                for (AnonymousClass0V5 anonymousClass0V5 : f5333X) {
                    anonymousClass0Cm.add(AnonymousClass5Wh.C(anonymousClass0Cm2));
                }
                List arrayList = new ArrayList();
                for (AnonymousClass0V5 anonymousClass0V52 : f5334Y) {
                    arrayList.add(AnonymousClass5Wh.C(anonymousClass0Cm2));
                }
                AnonymousClass0WN anonymousClass0WN = new AnonymousClass0WN(AnonymousClass0Tt.m4579C(anonymousClass0Cm2));
                hashMap = new HashMap();
                for (Entry entry2 : AnonymousClass0Xg.f6183C.entrySet()) {
                    hashMap.put(entry2.getKey(), new AnonymousClass0Xp(context, anonymousClass0Cm2, (AnonymousClass0U3) entry2.getValue()));
                }
                anonymousClass0U4 = new AnonymousClass0U4(context, anonymousClass0Cm2, anonymousClass0WN, new AnonymousClass0Xg(hashMap), arrayList, anonymousClass0Cm);
                anonymousClass0Cm2.m1039D(cls, anonymousClass0U4);
            }
        }
        return anonymousClass0U4;
    }

    /* renamed from: C */
    public final synchronized void m4687C(AnonymousClass0U0 anonymousClass0U0, boolean z) {
        AnonymousClass4i5 anonymousClass4i5 = new AnonymousClass4i5(anonymousClass0U0, z, false);
        if (this.f5351R) {
            this.f5335B.obtainMessage(1, anonymousClass4i5).sendToTarget();
        } else {
            AnonymousClass0U4.m4679E(this, anonymousClass4i5, true);
        }
    }

    /* renamed from: D */
    public static void m4678D(AnonymousClass0U4 anonymousClass0U4, String str, boolean z) {
        AnonymousClass0U0 C;
        if (z) {
            synchronized (anonymousClass0U4.f5347N) {
                C = anonymousClass0U4.f5347N.m5113C(str);
            }
        } else {
            C = anonymousClass0U4.f5347N.m5113C(str);
        }
        if (C != null) {
            for (AnonymousClass4i9 Wh : anonymousClass0U4.f5346M) {
                Wh.Wh(C);
            }
        }
    }

    /* renamed from: D */
    public final synchronized void m4688D(AnonymousClass4i4 anonymousClass4i4, boolean z) {
        Throwable th;
        boolean z2 = false;
        AnonymousClass0U0 C;
        if (anonymousClass4i4.f56392C != null) {
            if (z) {
                synchronized (this.f5347N) {
                    try {
                        C = this.f5347N.m5113C(anonymousClass4i4.f56392C);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
            C = this.f5347N.m5113C(anonymousClass4i4.f56392C);
            if (C != null) {
                m4684J(C);
                z2 = true;
            }
        } else {
            List D;
            if (z) {
                synchronized (this.f5347N) {
                    try {
                        D = this.f5347N.m5114D(anonymousClass4i4.f56393D);
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
            }
            D = this.f5347N.m5114D(anonymousClass4i4.f56393D);
            for (AnonymousClass0U0 C2 : r0) {
                m4684J(C2);
                z2 = true;
            }
        }
        if (anonymousClass4i4.f56391B != null) {
            anonymousClass4i4.f56391B.Jh(z2);
        }
    }

    /* renamed from: E */
    public final synchronized void m4689E(AnonymousClass4i7 anonymousClass4i7, boolean z) {
        boolean E;
        if (z) {
            synchronized (this.f5347N) {
                try {
                    AnonymousClass0U0 C = this.f5347N.m5113C(anonymousClass4i7.f56401C);
                } catch (Throwable th) {
                    Throwable th2 = th;
                    throw th2;
                }
            }
        }
        C = this.f5347N.m5113C(anonymousClass4i7.f56401C);
        if (C != null) {
            if (z) {
                synchronized (this.f5347N) {
                    try {
                        this.f5347N.m5115E(C, "queued");
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
            }
            this.f5347N.m5115E(C, "queued");
            E = AnonymousClass0U4.m4679E(this, new AnonymousClass4i5(C, true, true), z);
        } else {
            E = false;
        }
        anonymousClass4i7.f56400B.Jh(E);
    }

    /* renamed from: E */
    public static boolean m4679E(AnonymousClass0U4 anonymousClass0U4, AnonymousClass4i5 anonymousClass4i5, boolean z) {
        AnonymousClass0U0 anonymousClass0U0 = anonymousClass4i5.f56395C;
        boolean z2 = anonymousClass4i5.f56396D;
        boolean z3 = anonymousClass4i5.f56394B;
        if (z) {
            synchronized (anonymousClass0U4.f5347N) {
                try {
                    boolean contains = anonymousClass0U4.f5347N.f5970B.contains(anonymousClass0U0);
                } catch (Throwable th) {
                    Throwable th2 = th;
                    throw th2;
                }
            }
        }
        contains = anonymousClass0U4.f5347N.f5970B.contains(anonymousClass0U0);
        if (contains) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DirectMutation has already been dispatched: mutation=");
            stringBuilder.append(anonymousClass0U0);
            stringBuilder.append(" shouldSchedule=");
            stringBuilder.append(z2);
            AnonymousClass0Gn.m1881H("DuplicateDispatch", stringBuilder.toString());
        }
        boolean UC = anonymousClass0U4.f5349P.UC(anonymousClass0U0);
        if (UC) {
            AnonymousClass0WN anonymousClass0WN;
            if (z) {
                synchronized (anonymousClass0U4.f5347N) {
                    try {
                        anonymousClass0WN = anonymousClass0U4.f5347N;
                        anonymousClass0WN.f5970B.add(anonymousClass0U0);
                        AnonymousClass0WN.m5110B(anonymousClass0WN);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
            }
            anonymousClass0WN = anonymousClass0U4.f5347N;
            anonymousClass0WN.f5970B.add(anonymousClass0U0);
            AnonymousClass0WN.m5110B(anonymousClass0WN);
            if (z2) {
                AnonymousClass0Sy.m4437F(anonymousClass0U4.f5354U);
            }
        }
        if (z3) {
            Boolean.valueOf(UC);
            for (AnonymousClass4i9 jx : anonymousClass0U4.f5346M) {
                jx.jx(anonymousClass0U0, UC);
            }
        } else {
            Boolean.valueOf(UC);
            for (AnonymousClass4i9 jx2 : anonymousClass0U4.f5346M) {
                jx2.vi(anonymousClass0U0, UC);
            }
        }
        return UC;
    }

    /* renamed from: F */
    public static void m4680F(AnonymousClass0U4 anonymousClass0U4, AnonymousClass4i6 anonymousClass4i6, boolean z) {
        Object obj;
        long j;
        Throwable th;
        AnonymousClass0U0 anonymousClass0U0 = anonymousClass4i6.f56398C;
        AnonymousClass0VN anonymousClass0VN = anonymousClass4i6.f56399D;
        AnonymousClass0db anonymousClass0db = anonymousClass4i6.f56397B;
        int i = anonymousClass0U0.f5326E;
        String A = anonymousClass0U0.mo1287A();
        int hashCode = A.hashCode();
        boolean z2 = false;
        if (hashCode != -1116718624) {
            if (hashCode == -181967174) {
                if (A.equals("send_visual_item_seen_marker")) {
                    obj = null;
                    switch (obj) {
                        case null:
                        case 1:
                            j = (long) anonymousClass0U4.f5355V;
                            break;
                        default:
                            j = (long) anonymousClass0U4.f5353T;
                            break;
                    }
                    if (anonymousClass0VN.f5721E && ((long) i) < j) {
                        z2 = true;
                    }
                    Integer.valueOf(i);
                    Boolean.valueOf(z2);
                    for (AnonymousClass4i9 Ws : anonymousClass0U4.f5346M) {
                        Ws.Ws(anonymousClass0U0, z2, anonymousClass0VN, anonymousClass0db);
                    }
                    if (z2) {
                        if (((long) i) >= j) {
                            AnonymousClass0V1.m4816E(AnonymousClass0NN.m3291B("direct_mutation_send_retry_failure", null), anonymousClass0VN).m3298F("send_type", "mutation").m3298F("mutation_type", anonymousClass0U0.mo1287A()).m3294B(TraceFieldType.RetryCount, i).m3310R();
                        }
                        A = (anonymousClass0VN.f5720D ^ 1) != 0 ? "upload_failed_transient" : "upload_failed_permanent";
                        anonymousClass0U4.f5349P.BV(anonymousClass0U0, anonymousClass0VN);
                        if (z) {
                            synchronized (anonymousClass0U4.f5347N) {
                                try {
                                    anonymousClass0U4.f5347N.m5115E(anonymousClass0U0, A);
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                        }
                        anonymousClass0U4.f5347N.m5115E(anonymousClass0U0, A);
                    } else if (z) {
                        synchronized (anonymousClass0U4.f5347N) {
                            try {
                                anonymousClass0U4.f5347N.m5111A(anonymousClass0U0);
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                        }
                    } else {
                        anonymousClass0U4.f5347N.m5111A(anonymousClass0U0);
                    }
                    AnonymousClass0Sy.m4437F(new AnonymousClass0Xw(anonymousClass0U4, z2));
                }
            }
        } else if (A.equals("send_thread_seen_marker")) {
            obj = 1;
            switch (obj) {
                case null:
                case 1:
                    j = (long) anonymousClass0U4.f5355V;
                    break;
                default:
                    j = (long) anonymousClass0U4.f5353T;
                    break;
            }
            z2 = true;
            Integer.valueOf(i);
            Boolean.valueOf(z2);
            while (r1.hasNext()) {
                Ws.Ws(anonymousClass0U0, z2, anonymousClass0VN, anonymousClass0db);
            }
            if (z2) {
                if (((long) i) >= j) {
                    AnonymousClass0V1.m4816E(AnonymousClass0NN.m3291B("direct_mutation_send_retry_failure", null), anonymousClass0VN).m3298F("send_type", "mutation").m3298F("mutation_type", anonymousClass0U0.mo1287A()).m3294B(TraceFieldType.RetryCount, i).m3310R();
                }
                if ((anonymousClass0VN.f5720D ^ 1) != 0) {
                }
                anonymousClass0U4.f5349P.BV(anonymousClass0U0, anonymousClass0VN);
                if (z) {
                    anonymousClass0U4.f5347N.m5115E(anonymousClass0U0, A);
                } else {
                    synchronized (anonymousClass0U4.f5347N) {
                        anonymousClass0U4.f5347N.m5115E(anonymousClass0U0, A);
                    }
                }
            } else if (z) {
                anonymousClass0U4.f5347N.m5111A(anonymousClass0U0);
            } else {
                synchronized (anonymousClass0U4.f5347N) {
                    anonymousClass0U4.f5347N.m5111A(anonymousClass0U0);
                }
            }
            AnonymousClass0Sy.m4437F(new AnonymousClass0Xw(anonymousClass0U4, z2));
        }
        obj = -1;
        switch (obj) {
            case null:
            case 1:
                j = (long) anonymousClass0U4.f5355V;
                break;
            default:
                j = (long) anonymousClass0U4.f5353T;
                break;
        }
        z2 = true;
        Integer.valueOf(i);
        Boolean.valueOf(z2);
        while (r1.hasNext()) {
            Ws.Ws(anonymousClass0U0, z2, anonymousClass0VN, anonymousClass0db);
        }
        if (z2) {
            if (((long) i) >= j) {
                AnonymousClass0V1.m4816E(AnonymousClass0NN.m3291B("direct_mutation_send_retry_failure", null), anonymousClass0VN).m3298F("send_type", "mutation").m3298F("mutation_type", anonymousClass0U0.mo1287A()).m3294B(TraceFieldType.RetryCount, i).m3310R();
            }
            if ((anonymousClass0VN.f5720D ^ 1) != 0) {
            }
            anonymousClass0U4.f5349P.BV(anonymousClass0U0, anonymousClass0VN);
            if (z) {
                synchronized (anonymousClass0U4.f5347N) {
                    anonymousClass0U4.f5347N.m5115E(anonymousClass0U0, A);
                }
            } else {
                anonymousClass0U4.f5347N.m5115E(anonymousClass0U0, A);
            }
        } else if (z) {
            synchronized (anonymousClass0U4.f5347N) {
                anonymousClass0U4.f5347N.m5111A(anonymousClass0U0);
            }
        } else {
            anonymousClass0U4.f5347N.m5111A(anonymousClass0U0);
        }
        AnonymousClass0Sy.m4437F(new AnonymousClass0Xw(anonymousClass0U4, z2));
    }

    /* renamed from: G */
    public static void m4681G(AnonymousClass0U4 anonymousClass0U4, AnonymousClass4i6 anonymousClass4i6, boolean z) {
        AnonymousClass0U0 anonymousClass0U0 = anonymousClass4i6.f56398C;
        AnonymousClass0db anonymousClass0db = anonymousClass4i6.f56397B;
        for (AnonymousClass4i9 Xs : anonymousClass0U4.f5346M) {
            Xs.Xs(anonymousClass0U0, anonymousClass0db);
        }
        anonymousClass0U4.f5349P.CV(anonymousClass0U0);
        AnonymousClass0WN anonymousClass0WN;
        if (z) {
            synchronized (anonymousClass0U4.f5347N) {
                anonymousClass0WN = anonymousClass0U4.f5347N;
                if (anonymousClass0WN.f5970B.remove(anonymousClass0U0)) {
                    AnonymousClass0WN.m5110B(anonymousClass0WN);
                }
            }
        } else {
            anonymousClass0WN = anonymousClass0U4.f5347N;
            if (anonymousClass0WN.f5970B.remove(anonymousClass0U0)) {
                AnonymousClass0WN.m5110B(anonymousClass0WN);
            }
        }
        AnonymousClass0Sy.m4437F(new AnonymousClass0Xu(anonymousClass0U4));
    }

    /* renamed from: H */
    public static void m4682H(AnonymousClass0U4 anonymousClass0U4, boolean z) {
        AnonymousClass0Sy.m4434C();
        anonymousClass0U4.f5342I = false;
        if (z) {
            anonymousClass0U4.f5338E.m5264A();
        } else {
            anonymousClass0U4.f5338E.m5265B();
        }
        AnonymousClass0U4.m4683I(anonymousClass0U4, ((long) anonymousClass0U4.f5338E.f6186B) * 2000);
    }

    /* renamed from: I */
    public static boolean m4683I(AnonymousClass0U4 anonymousClass0U4, long j) {
        if (!(anonymousClass0U4.f5342I || anonymousClass0U4.f5341H)) {
            AnonymousClass0Xn anonymousClass0Xn = anonymousClass0U4.f5343J;
            if (anonymousClass0Xn.f6195B && !anonymousClass0Xn.f6196C) {
                AnonymousClass0Xr anonymousClass0Xr = anonymousClass0Xn.f6197D;
                AnonymousClass0Xs anonymousClass0Xs = new AnonymousClass0Xs(C0164R.id.direct_mutation_manager_job_id);
                anonymousClass0Xs.f6212E = anonymousClass0Xn.f6199F;
                anonymousClass0Xs.f6216I = anonymousClass0Xn.f6198E;
                anonymousClass0Xs.f6213F = 1;
                anonymousClass0Xs.f6217J = true;
                anonymousClass0Xr.m5271D(anonymousClass0Xs.m5272A());
            }
            if (AnonymousClass0MM.m3154J(anonymousClass0U4.f5337D) || anonymousClass0U4.f5350Q) {
                Long.valueOf(j);
                for (AnonymousClass5Wh anonymousClass5Wh : anonymousClass0U4.f5345L) {
                    AnonymousClass4ic anonymousClass4ic = new AnonymousClass4ic("schedule");
                    anonymousClass4ic.f56457C = Long.valueOf(j);
                    AnonymousClass5Wh.B(anonymousClass5Wh, anonymousClass4ic.A());
                }
                anonymousClass0U4.f5341H = true;
                Handler handler = anonymousClass0U4.f5335B;
                handler.sendMessageDelayed(handler.obtainMessage(5), j);
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    private void m4684J(AnonymousClass0U0 anonymousClass0U0) {
        this.f5349P.mJA(anonymousClass0U0);
        for (AnonymousClass4i9 Af : this.f5346M) {
            Af.Af(anonymousClass0U0);
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        AnonymousClass0Sy.m4437F(new AnonymousClass0Xz(this));
    }
}

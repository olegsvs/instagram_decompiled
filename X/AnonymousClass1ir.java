package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1ir */
public final class AnonymousClass1ir {
    /* renamed from: W */
    private static final Map f21857W = new AnonymousClass06M();
    /* renamed from: B */
    public volatile String f21858B;
    /* renamed from: C */
    public volatile AnonymousClass06I f21859C;
    /* renamed from: D */
    public volatile String f21860D;
    /* renamed from: E */
    public final ConcurrentMap f21861E = new ConcurrentHashMap();
    /* renamed from: F */
    public final AnonymousClass06P f21862F;
    /* renamed from: G */
    public volatile String f21863G;
    /* renamed from: H */
    public volatile String f21864H;
    /* renamed from: I */
    public volatile String f21865I;
    /* renamed from: J */
    private final String f21866J;
    /* renamed from: K */
    private final AnonymousClass0AJ f21867K;
    /* renamed from: L */
    private final Context f21868L;
    /* renamed from: M */
    private final boolean f21869M;
    /* renamed from: N */
    private final AnonymousClass1iZ f21870N;
    /* renamed from: O */
    private final HashMap f21871O;
    /* renamed from: P */
    private final RealtimeSinceBootClock f21872P;
    /* renamed from: Q */
    private final AnonymousClass06h f21873Q;
    /* renamed from: R */
    private final HashMap f21874R;
    /* renamed from: S */
    private final AnonymousClass0AH f21875S;
    /* renamed from: T */
    private final AnonymousClass06j f21876T;
    /* renamed from: U */
    private final AnonymousClass06F f21877U;
    /* renamed from: V */
    private final String f21878V;

    public AnonymousClass1ir(Context context, AnonymousClass06F anonymousClass06F, String str, AnonymousClass06h anonymousClass06h, AnonymousClass06j anonymousClass06j, RealtimeSinceBootClock realtimeSinceBootClock, AnonymousClass0AJ anonymousClass0AJ, AnonymousClass1iZ anonymousClass1iZ, boolean z, AnonymousClass0AH anonymousClass0AH) {
        String str2 = JsonProperty.USE_DEFAULT_NAME;
        this.f21858B = str2;
        this.f21863G = str2;
        this.f21865I = str2;
        this.f21860D = str2;
        this.f21864H = str2;
        this.f21868L = context;
        this.f21877U = anonymousClass06F;
        this.f21878V = str;
        this.f21873Q = anonymousClass06h;
        this.f21876T = anonymousClass06j;
        this.f21862F = new AnonymousClass06P(context, realtimeSinceBootClock);
        this.f21866J = Secure.getString(context.getContentResolver(), "android_id");
        this.f21867K = anonymousClass0AJ;
        this.f21872P = realtimeSinceBootClock;
        this.f21870N = anonymousClass1iZ;
        this.f21871O = new HashMap();
        this.f21874R = new HashMap();
        this.f21869M = z;
        this.f21875S = anonymousClass0AH;
    }

    /* renamed from: A */
    public final AnonymousClass1iv m12718A(long j, boolean z) {
        return new AnonymousClass1iv(AnonymousClass1ir.m12715D(this), m12717F(j), (AnonymousClass0Bk) m12720C(AnonymousClass0Bk.class), null, this.f21862F.m400A(z), (AnonymousClass0Bl) m12720C(AnonymousClass0Bl.class), (AnonymousClass0Bq) m12720C(AnonymousClass0Bq.class), (AnonymousClass0Bp) m12720C(AnonymousClass0Bp.class), 0, true);
    }

    /* renamed from: B */
    public final AnonymousClass1iv m12719B(long j) {
        return new AnonymousClass1iv(AnonymousClass1ir.m12715D(this), m12717F(j), null, (AnonymousClass0Bn) m12720C(AnonymousClass0Bn.class), null, null, 0, true);
    }

    /* renamed from: B */
    public static String m12713B(Map map) {
        StringBuilder stringBuilder = new StringBuilder();
        Object obj = 1;
        for (Entry entry : map.entrySet()) {
            if (obj != null) {
                obj = null;
            } else {
                stringBuilder.append(";");
            }
            stringBuilder.append((String) entry.getKey());
            stringBuilder.append("|");
            stringBuilder.append(String.valueOf(entry.getValue()));
        }
        return stringBuilder.toString();
    }

    /* renamed from: C */
    public final synchronized AnonymousClass06R m12720C(Class cls) {
        String name;
        try {
            name = cls.getName();
            if (!this.f21874R.containsKey(name)) {
                Object anonymousClass0Bl;
                if (cls == AnonymousClass0Bl.class) {
                    anonymousClass0Bl = new AnonymousClass0Bl(this.f21868L, this.f21878V, this.f21867K, this.f21872P, this.f21869M);
                } else if (cls == AnonymousClass0Bq.class) {
                    anonymousClass0Bl = new AnonymousClass0Bq(this.f21868L, this.f21878V, this.f21867K, this.f21872P, this.f21869M);
                } else if (cls == AnonymousClass0Bp.class) {
                    anonymousClass0Bl = new AnonymousClass0Bp(this.f21868L, this.f21878V, this.f21867K, this.f21872P, this.f21869M);
                } else {
                    anonymousClass0Bl = (AnonymousClass06R) cls.newInstance();
                }
                this.f21874R.put(name, anonymousClass0Bl);
            }
        } catch (Throwable e) {
            throw new RuntimeException("Incorrect stat category used:", e);
        }
        return (AnonymousClass06R) this.f21874R.get(name);
    }

    /* renamed from: C */
    public static String m12714C(List list) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            if (f21857W.containsKey(str)) {
                listIterator.set(String.valueOf(f21857W.get(str)));
            } else {
                AnonymousClass0Dc.m1255R("MqttHealthStatsHelper", "appPkgName %s not found in encoding map", str);
            }
        }
        return TextUtils.join(";", list);
    }

    /* renamed from: D */
    public static AnonymousClass0Bm m12715D(AnonymousClass1ir anonymousClass1ir) {
        Map all;
        AnonymousClass0Bm anonymousClass0Bm = (AnonymousClass0Bm) anonymousClass1ir.m12720C(AnonymousClass0Bm.class);
        anonymousClass0Bm.m689B(AnonymousClass0AP.ServiceName, anonymousClass1ir.f21878V);
        anonymousClass0Bm.m689B(AnonymousClass0AP.ClientCoreName, anonymousClass1ir.f21858B);
        anonymousClass0Bm.m689B(AnonymousClass0AP.NotificationStoreName, anonymousClass1ir.f21863G);
        anonymousClass0Bm.m689B(AnonymousClass0AP.AndroidId, anonymousClass1ir.f21866J);
        SharedPreferences B = AnonymousClass1D6.m9967B(anonymousClass1ir.f21868L, AnonymousClass1D6.f15628B);
        anonymousClass0Bm.m689B(AnonymousClass0AP.YearClass, String.valueOf(B.getInt("year_class", 0)));
        AnonymousClass0AG A = anonymousClass1ir.f21875S.m685A(AnonymousClass061.GATEKEEPERS);
        AnonymousClass06Q anonymousClass06Q = AnonymousClass0AP.MqttGKs;
        synchronized (A) {
            all = A.f1180B.getAll();
        }
        anonymousClass0Bm.m689B(anonymousClass06Q, AnonymousClass1ir.m12713B(all));
        anonymousClass0Bm.m689B(AnonymousClass0AP.MqttFlags, AnonymousClass1ir.m12713B(AnonymousClass1D6.m9967B(anonymousClass1ir.f21868L, AnonymousClass1D6.f15631E).getAll()));
        if (anonymousClass1ir.f21870N != null) {
            anonymousClass0Bm.m689B(AnonymousClass0AP.f1211F, ((Boolean) anonymousClass1ir.f21870N.get()).booleanValue() ? "fg" : "bg");
        }
        anonymousClass0Bm.m689B(AnonymousClass0AP.ScreenState, anonymousClass1ir.f21876T.m416A() ? "1" : "0");
        AnonymousClass05y A2 = anonymousClass1ir.f21877U.m380A("phone", TelephonyManager.class);
        anonymousClass0Bm.m689B(AnonymousClass0AP.Country, AnonymousClass1Cn.m9928H(A2.mo83B() ? ((TelephonyManager) A2.mo82A()).getNetworkCountryIso() : JsonProperty.USE_DEFAULT_NAME));
        anonymousClass0Bm.m689B(AnonymousClass0AP.NetworkType, AnonymousClass1Cn.m9928H(anonymousClass1ir.f21873Q.m409B()));
        AnonymousClass06Q anonymousClass06Q2 = AnonymousClass0AP.NetworkSubtype;
        String str = "none";
        NetworkInfo A3 = anonymousClass1ir.f21873Q.m408A();
        if (!(A3 == null || AnonymousClass1Cn.m9924D(A3.getSubtypeName()))) {
            str = A3.getSubtypeName();
        }
        anonymousClass0Bm.m689B(anonymousClass06Q2, AnonymousClass1Cn.m9928H(str));
        anonymousClass0Bm.m689B(AnonymousClass0AP.IsEmployee, Boolean.valueOf(B.getBoolean("is_employee", false)));
        anonymousClass0Bm.m689B(AnonymousClass0AP.ValidCompatibleApps, anonymousClass1ir.f21865I);
        anonymousClass0Bm.m689B(AnonymousClass0AP.EnabledCompatibleApps, anonymousClass1ir.f21860D);
        anonymousClass0Bm.m689B(AnonymousClass0AP.RegisteredApps, anonymousClass1ir.f21864H);
        return anonymousClass0Bm;
    }

    /* renamed from: D */
    public final void m12721D(String str, String str2, String str3, boolean z) {
        boolean z2;
        String stringBuilder;
        String str4 = str;
        AnonymousClass1iZ anonymousClass1iZ = this.f21870N;
        if (anonymousClass1iZ == null) {
            z2 = false;
        } else {
            z2 = ((Boolean) anonymousClass1iZ.get()).booleanValue();
        }
        boolean z3 = SystemClock.elapsedRealtime() - AnonymousClass08t.f1020D.f1021B > 17000;
        String str5 = AnonymousClass08t.f1020D.f1022C;
        if (str5 != null && ((!z && AnonymousClass086.PINGREQ.name().equals(str4)) || (z && AnonymousClass086.PINGRESP.name().equals(str4)))) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str4);
            stringBuilder2.append("_");
            stringBuilder2.append(str5);
            str4 = stringBuilder2.toString();
        }
        if (z2) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str4);
            stringBuilder2.append("_FG");
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str4);
            stringBuilder2.append("_BG");
            stringBuilder = stringBuilder2.toString();
        }
        if (z3) {
            if (z2) {
                ((AnonymousClass0Bq) m12720C(AnonymousClass0Bq.class)).m695A(1, "tc", "fg", "rw", str3);
            } else {
                ((AnonymousClass0Bq) m12720C(AnonymousClass0Bq.class)).m695A(1, "tc", "bg", "rw", str3);
            }
        } else if (z2) {
            ((AnonymousClass0Bq) m12720C(AnonymousClass0Bq.class)).m695A(1, "tc", "fg", "nw", str3);
        } else {
            ((AnonymousClass0Bq) m12720C(AnonymousClass0Bq.class)).m695A(1, "tc", "bg", "nw", str3);
        }
        String str6 = z2 ? "fg" : "bg";
        String str7 = str2;
        String substring = AnonymousClass1Cn.m9924D(str7) ? stringBuilder : str7.startsWith("/") ? str7.substring(1) : str7;
        ((AnonymousClass0Bp) m12720C(AnonymousClass0Bp.class)).m695A(1, substring, str6);
        AnonymousClass08t.f1020D.f1021B = SystemClock.elapsedRealtime();
        Object[] objArr = new Object[]{Boolean.valueOf(z3), stringBuilder, str2, Boolean.valueOf(z2), str3};
        boolean wX = AnonymousClass0Dc.f1892C.wX(2);
    }

    /* renamed from: E */
    public static synchronized AtomicLong m12716E(AnonymousClass1ir anonymousClass1ir, AnonymousClass06N anonymousClass06N) {
        AtomicLong atomicLong;
        synchronized (anonymousClass1ir) {
            if (!anonymousClass1ir.f21871O.containsKey(anonymousClass06N)) {
                anonymousClass1ir.f21871O.put(anonymousClass06N, new AtomicLong());
            }
            atomicLong = (AtomicLong) anonymousClass1ir.f21871O.get(anonymousClass06N);
        }
        return atomicLong;
    }

    /* renamed from: F */
    private AnonymousClass0Bo m12717F(long j) {
        long C;
        AnonymousClass0Bo anonymousClass0Bo = (AnonymousClass0Bo) m12720C(AnonymousClass0Bo.class);
        ((AtomicLong) anonymousClass0Bo.m688A(AnonymousClass0AR.MqttDurationMs)).set(j);
        ((AtomicLong) anonymousClass0Bo.m688A(AnonymousClass0AR.NetworkDurationMs)).set(this.f21873Q.m410C());
        AtomicLong atomicLong = (AtomicLong) anonymousClass0Bo.m688A(AnonymousClass0AR.NetworkTotalDurationMs);
        AnonymousClass06h anonymousClass06h = this.f21873Q;
        synchronized (anonymousClass06h) {
            C = anonymousClass06h.f388F + anonymousClass06h.m410C();
        }
        atomicLong.set(C);
        ((AtomicLong) anonymousClass0Bo.m688A(AnonymousClass0AR.ServiceDurationMs)).set(this.f21872P.now() - AnonymousClass1ir.m12716E(this, AnonymousClass06N.ServiceCreatedTimestamp).get());
        return anonymousClass0Bo;
    }
}

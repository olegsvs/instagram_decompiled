package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonGenerator;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0T6 */
public final class AnonymousClass0T6 implements AnonymousClass0EE {
    /* renamed from: F */
    private static final long f5085F = TimeUnit.HOURS.toMillis(2);
    /* renamed from: G */
    private static final long f5086G = TimeUnit.DAYS.toMillis(1);
    /* renamed from: H */
    private static final long f5087H = TimeUnit.MINUTES.toMillis(1);
    /* renamed from: I */
    public static final AnonymousClass0T6 f5088I = new AnonymousClass0T6();
    /* renamed from: B */
    public volatile boolean f5089B;
    /* renamed from: C */
    public volatile boolean f5090C;
    /* renamed from: D */
    public AnonymousClass0o9 f5091D;
    /* renamed from: E */
    public final AnonymousClass0T7 f5092E = new AnonymousClass0T7();

    public final String getModuleName() {
        return "quick_promotion";
    }

    private AnonymousClass0T6() {
    }

    /* renamed from: A */
    public final Set m4465A(AnonymousClass19A anonymousClass19A, AnonymousClass0o2 anonymousClass0o2, long j, long j2, AnonymousClass0Cm anonymousClass0Cm) {
        long toSeconds = TimeUnit.MILLISECONDS.toSeconds(j2);
        long j3 = j;
        AnonymousClass19A anonymousClass19A2 = anonymousClass19A;
        AnonymousClass0o2 anonymousClass0o22 = anonymousClass0o2;
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        if (AnonymousClass0T6.m4463Q(this, anonymousClass19A2, anonymousClass0o22, j3, toSeconds, false, anonymousClass0Cm2)) {
            return null;
        }
        Long B = anonymousClass19A2.m9652B();
        Long A = anonymousClass19A2.m9651A();
        Long l = anonymousClass19A2.f15083B;
        boolean L = AnonymousClass0T6.m4458L(anonymousClass19A2, j3);
        boolean K = AnonymousClass0T6.m4457K(anonymousClass19A2, j3);
        boolean N = AnonymousClass0T6.m4460N(anonymousClass19A2, j3, toSeconds);
        boolean J = AnonymousClass0T6.m4456J(anonymousClass19A2, anonymousClass0Cm2);
        boolean M = AnonymousClass0T6.m4459M(anonymousClass19A2, anonymousClass0o22);
        Set hashSet = new HashSet();
        if (anonymousClass19A2.m9652B() != null && anonymousClass19A2.m9651A() != null) {
            if (!K) {
                hashSet.add(AnonymousClass19F.ALREADY_ENDED);
            }
            if (!L) {
                hashSet.add(AnonymousClass19F.NOT_STARTED);
            }
        } else if (B != null || A != null || l == null) {
            hashSet.add(AnonymousClass19F.TIMING_RULE_INCOMPLETE);
        } else if (!N) {
            hashSet.add(AnonymousClass19F.TTL_EXPIRED);
        }
        if (!J) {
            hashSet.add(AnonymousClass19F.CONTENT_NOT_QUALIFIED);
        }
        if (!M) {
            hashSet.add(AnonymousClass19F.TRIGGER_NOT_QUALIFIED);
        }
        return hashSet;
    }

    /* renamed from: B */
    public final void m4466B(AnonymousClass0Cm anonymousClass0Cm, Context context, AnonymousClass0Fz anonymousClass0Fz, AnonymousClass0TD anonymousClass0TD, AnonymousClass0TG anonymousClass0TG, AnonymousClass0TH anonymousClass0TH, AnonymousClass0o1 anonymousClass0o1) {
        AnonymousClass0Cn anonymousClass0Cn = anonymousClass0Cm;
        if (((Boolean) AnonymousClass0CC.qZ.m846H(anonymousClass0Cn)).booleanValue()) {
            Object obj;
            AnonymousClass0Fz anonymousClass0Fz2;
            AnonymousClass0TG anonymousClass0TG2;
            AnonymousClass0TH anonymousClass0TH2;
            AnonymousClass0o1 anonymousClass0o12;
            AnonymousClass0Iw anonymousClass19G;
            AnonymousClass0Pt anonymousClass0Pt;
            AnonymousClass0GA H;
            AnonymousClass0TD anonymousClass0TD2 = anonymousClass0TD;
            String C = AnonymousClass0oA.m7687C(anonymousClass0Cn, anonymousClass0TD2);
            boolean R = AnonymousClass0T6.m4464R(anonymousClass0Cn, C);
            AnonymousClass0T6 anonymousClass0T6 = this;
            Context context2 = context;
            if (this.f5091D != null) {
                if (!AnonymousClass5qG.G(context2)) {
                    obj = null;
                    anonymousClass0Fz2 = anonymousClass0Fz;
                    anonymousClass0TG2 = anonymousClass0TG;
                    anonymousClass0TH2 = anonymousClass0TH;
                    anonymousClass0o12 = anonymousClass0o1;
                    if (obj != null) {
                        AnonymousClass0T6.m4461O(anonymousClass0T6, context2, anonymousClass0Fz2, anonymousClass0Cn, anonymousClass0TD2, R, C, anonymousClass0TG2, anonymousClass0TH2, anonymousClass0o12);
                    }
                    anonymousClass19G = new AnonymousClass19G(this, context2, anonymousClass0Fz2, anonymousClass0Cm, anonymousClass0TD2, R, C, anonymousClass0TG, anonymousClass0TH, anonymousClass0o1);
                    anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
                    anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
                    anonymousClass0Pt.f4229M = "qp/get_cooldowns/";
                    anonymousClass0Pt.f4228L = new AnonymousClass0R8(AnonymousClass1I7.class);
                    anonymousClass0Pt.f4221E = AnonymousClass0oA.f10233B;
                    anonymousClass0Pt.f4220D = AnonymousClass0Ny.UseCacheWithTimeout;
                    anonymousClass0Pt.f4219C = "qp_slot_cooldown_v1";
                    anonymousClass0Pt.m3945N();
                    H = anonymousClass0Pt.m3939H();
                    H.f2849B = anonymousClass19G;
                    AnonymousClass0Px.m3949B(context2, anonymousClass0Fz2, H);
                    return;
                }
            }
            obj = 1;
            anonymousClass0Fz2 = anonymousClass0Fz;
            anonymousClass0TG2 = anonymousClass0TG;
            anonymousClass0TH2 = anonymousClass0TH;
            anonymousClass0o12 = anonymousClass0o1;
            if (obj != null) {
                anonymousClass19G = new AnonymousClass19G(this, context2, anonymousClass0Fz2, anonymousClass0Cm, anonymousClass0TD2, R, C, anonymousClass0TG, anonymousClass0TH, anonymousClass0o1);
                anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
                anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
                anonymousClass0Pt.f4229M = "qp/get_cooldowns/";
                anonymousClass0Pt.f4228L = new AnonymousClass0R8(AnonymousClass1I7.class);
                anonymousClass0Pt.f4221E = AnonymousClass0oA.f10233B;
                anonymousClass0Pt.f4220D = AnonymousClass0Ny.UseCacheWithTimeout;
                anonymousClass0Pt.f4219C = "qp_slot_cooldown_v1";
                anonymousClass0Pt.m3945N();
                H = anonymousClass0Pt.m3939H();
                H.f2849B = anonymousClass19G;
                AnonymousClass0Px.m3949B(context2, anonymousClass0Fz2, H);
                return;
            }
            AnonymousClass0T6.m4461O(anonymousClass0T6, context2, anonymousClass0Fz2, anonymousClass0Cn, anonymousClass0TD2, R, C, anonymousClass0TG2, anonymousClass0TH2, anonymousClass0o12);
        }
    }

    /* renamed from: B */
    public static boolean m4448B(AnonymousClass0ol anonymousClass0ol, EnumSet enumSet, AnonymousClass0Cm anonymousClass0Cm) {
        if (anonymousClass0ol == null || TextUtils.isEmpty(anonymousClass0ol.f10347E)) {
            return true;
        }
        AnonymousClass0oD B = AnonymousClass0oD.m7689B(anonymousClass0ol.f10347E, anonymousClass0Cm);
        if (B != null) {
            enumSet.add(B);
        }
        if (B != null) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public static void m4449C(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0T0 anonymousClass0T0) {
        if (AnonymousClass0Cd.f1698B.m960D(anonymousClass0T0.f5065H) != null) {
            AnonymousClass5qG.C(anonymousClass0Cm, anonymousClass0T0.f5064G);
        }
    }

    /* renamed from: C */
    public final void m4467C(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0T0 anonymousClass0T0, AnonymousClass0ol anonymousClass0ol) {
        AnonymousClass0oj B = this.f5092E.m4469B(anonymousClass0T0);
        switch (anonymousClass0ol.f10344B.ordinal()) {
            case 1:
                synchronized (B) {
                    AnonymousClass0oj.m7697B(B.f10331E);
                    break;
                }
                break;
            case 2:
                synchronized (B) {
                    AnonymousClass0oj.m7697B(B.f10333G);
                    break;
                }
                break;
            case 3:
                synchronized (B) {
                    AnonymousClass0oj.m7697B(B.f10329C);
                    break;
                }
                break;
            default:
                break;
        }
        if (anonymousClass0ol.f10345C) {
            synchronized (B) {
                B.f10334H.isEmpty();
                AnonymousClass0oj.m7697B(B.f10334H);
            }
            this.f5092E.m4470C();
        }
        AnonymousClass0T6.m4454H(this, anonymousClass0T0.OQ(), anonymousClass0T0.f5060C, anonymousClass0ol.f10344B);
        AnonymousClass0T6.m4449C(anonymousClass0Cm, anonymousClass0T0);
    }

    /* renamed from: D */
    public static List m4450D(AnonymousClass0T6 anonymousClass0T6, AnonymousClass199 anonymousClass199, AnonymousClass0o2 anonymousClass0o2, long j, AnonymousClass0Cm anonymousClass0Cm) {
        List arrayList = new ArrayList();
        AnonymousClass0o2 anonymousClass0o22 = anonymousClass0o2;
        List<AnonymousClass19A> F = anonymousClass199.m9650F(anonymousClass0o2);
        if (anonymousClass199 == null || !AnonymousClass0T6.m4451E(F)) {
            return null;
        }
        long toSeconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        long toSeconds2 = TimeUnit.MILLISECONDS.toSeconds(j);
        for (AnonymousClass19A anonymousClass19A : F) {
            if (AnonymousClass0T6.m4463Q(anonymousClass0T6, anonymousClass19A, anonymousClass0o22, toSeconds, toSeconds2, true, anonymousClass0Cm)) {
                arrayList.add(anonymousClass19A);
            }
        }
        return arrayList;
    }

    /* renamed from: E */
    public static boolean m4451E(List list) {
        return (list == null || list.isEmpty() != null) ? null : true;
    }

    /* renamed from: F */
    public static void m4452F(AnonymousClass0T6 anonymousClass0T6, Context context) {
        if (!AnonymousClass5qG.G(context)) {
            if (AnonymousClass5qG.D(context) != null) {
                anonymousClass0T6.f5091D = AnonymousClass0o9.m7682B(AnonymousClass5qG.D(context));
            } else {
                AnonymousClass0Gn.m1876C(anonymousClass0T6.getModuleName(), "QP cooldown response listed as unexpired but is null.");
            }
        }
    }

    /* renamed from: G */
    public static void m4453G(AnonymousClass0NN anonymousClass0NN, AnonymousClass0o2 anonymousClass0o2, String str, boolean z) {
        anonymousClass0NN.m3294B("nux_id", anonymousClass0o2.m7674A().m7677A()).m3298F("promotion_id", str);
        if (z) {
            anonymousClass0NN.m3312T();
        } else {
            anonymousClass0NN.m3310R();
        }
    }

    /* renamed from: H */
    public static void m4454H(AnonymousClass0T6 anonymousClass0T6, AnonymousClass0o2 anonymousClass0o2, String str, AnonymousClass0TC anonymousClass0TC) {
        anonymousClass0T6 = AnonymousClass0NN.m3291B(anonymousClass0TC.m4476A(), (AnonymousClass0EE) anonymousClass0T6);
        if (anonymousClass0TC.m4477B() != null) {
            anonymousClass0T6.m3298F("object_id", anonymousClass0TC.m4477B());
        }
        AnonymousClass0T6.m4453G(anonymousClass0T6, anonymousClass0o2, str, true);
    }

    /* renamed from: I */
    public static boolean m4455I(AnonymousClass0ol anonymousClass0ol, AnonymousClass0Cm anonymousClass0Cm) {
        if (!(anonymousClass0ol == null || anonymousClass0ol.f10344B == AnonymousClass0TC.DISMISS)) {
            if (anonymousClass0ol.f10346D == null || TextUtils.isEmpty(anonymousClass0ol.f10346D.f11230B) || AnonymousClass0oD.m7689B(anonymousClass0ol.f10347E, anonymousClass0Cm) == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: J */
    public static boolean m4456J(AnonymousClass19A anonymousClass19A, AnonymousClass0Cm anonymousClass0Cm) {
        if (anonymousClass19A.f15084C == null) {
            return false;
        }
        if (!AnonymousClass0T6.m4451E(anonymousClass19A.f15084C.f15088C)) {
            return false;
        }
        AnonymousClass0ok anonymousClass0ok = (AnonymousClass0ok) anonymousClass19A.f15084C.f15088C.get(0);
        AnonymousClass0ol anonymousClass0ol = anonymousClass0ok.f10339E;
        AnonymousClass0ol anonymousClass0ol2 = anonymousClass0ok.f10340F;
        if (AnonymousClass0T6.m4455I(anonymousClass0ok.f10337C, anonymousClass0Cm) && AnonymousClass0T6.m4455I(anonymousClass0ol, anonymousClass0Cm) && AnonymousClass0T6.m4455I(anonymousClass0ol2, anonymousClass0Cm)) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public static boolean m4457K(AnonymousClass19A anonymousClass19A, long j) {
        return anonymousClass19A.m9651A() != null && anonymousClass19A.m9651A().longValue() > j;
    }

    /* renamed from: L */
    public static boolean m4458L(AnonymousClass19A anonymousClass19A, long j) {
        return anonymousClass19A.m9652B() != null && anonymousClass19A.m9652B().longValue() <= j;
    }

    /* renamed from: M */
    public static boolean m4459M(AnonymousClass19A anonymousClass19A, AnonymousClass0o2 anonymousClass0o2) {
        AnonymousClass19C anonymousClass19C = anonymousClass19A.f15084C;
        if (anonymousClass19C != null) {
            if (anonymousClass19C.f15095J != null) {
                for (AnonymousClass0o5 contains : anonymousClass19A.f15084C.f15095J) {
                    if (anonymousClass0o2.m7675B().contains(contains)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: N */
    public static boolean m4460N(AnonymousClass19A anonymousClass19A, long j, long j2) {
        Long l = anonymousClass19A.f15083B;
        return l != null && l.longValue() >= j - j2;
    }

    /* renamed from: O */
    public static void m4461O(AnonymousClass0T6 anonymousClass0T6, Context context, AnonymousClass0Fz anonymousClass0Fz, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0TD anonymousClass0TD, boolean z, String str, AnonymousClass0TG anonymousClass0TG, AnonymousClass0TH anonymousClass0TH, AnonymousClass0o1 anonymousClass0o1) {
        AnonymousClass0Pt M = AnonymousClass0oA.m7686B(anonymousClass0Cm, context, AnonymousClass0TF.m4480D(anonymousClass0TD, anonymousClass0Cm)).m3944M(AnonymousClass19D.class);
        M.f4219C = str;
        M.f4220D = z ? AnonymousClass0Ny.UseCache : AnonymousClass0Ny.SkipCache;
        AnonymousClass0GA H = M.m3945N().m3939H();
        H.f2849B = new AnonymousClass19E(anonymousClass0T6, context, anonymousClass0Fz, anonymousClass0Cm, anonymousClass0TD, z, str, anonymousClass0TG, anonymousClass0TH, anonymousClass0o1);
        AnonymousClass0Px.m3949B(context, anonymousClass0Fz, H);
    }

    /* renamed from: P */
    public static void m4462P(AnonymousClass0T6 anonymousClass0T6, Context context, AnonymousClass1IC anonymousClass1IC) {
        anonymousClass0T6.f5091D = AnonymousClass0o9.m7682B(anonymousClass1IC);
        if (anonymousClass1IC == null) {
            AnonymousClass5qG.B(context);
            return;
        }
        long j = f5086G;
        SharedPreferences E = AnonymousClass5qG.E(context);
        try {
            Long l = anonymousClass1IC.f16849B;
            long currentTimeMillis = System.currentTimeMillis();
            if (l != null) {
                j = TimeUnit.SECONDS.toMillis(l.longValue());
            }
            E.edit().putLong("qp_cooldown_response_expiration_time", currentTimeMillis + j).apply();
            Editor edit = E.edit();
            String str = "qp_cooldown_response_json";
            Writer stringWriter = new StringWriter();
            JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
            createGenerator.writeStartObject();
            if (anonymousClass1IC.f16853F != null) {
                createGenerator.writeFieldName("surfaces");
                createGenerator.writeStartArray();
                for (AnonymousClass1K2 anonymousClass1K2 : anonymousClass1IC.f16853F) {
                    if (anonymousClass1K2 != null) {
                        createGenerator.writeStartObject();
                        if (anonymousClass1K2.f17134C != null) {
                            createGenerator.writeNumberField("surface_id", anonymousClass1K2.f17134C.intValue());
                        }
                        if (anonymousClass1K2.f17133B != null) {
                            createGenerator.writeNumberField("cooldown", anonymousClass1K2.f17133B.longValue());
                        }
                        createGenerator.writeEndObject();
                    }
                }
                createGenerator.writeEndArray();
            }
            if (anonymousClass1IC.f16852E != null) {
                createGenerator.writeFieldName("slots");
                createGenerator.writeStartArray();
                for (AnonymousClass1K4 anonymousClass1K4 : anonymousClass1IC.f16852E) {
                    if (anonymousClass1K4 != null) {
                        createGenerator.writeStartObject();
                        if (anonymousClass1K4.f17136C != null) {
                            createGenerator.writeStringField("slot", anonymousClass1K4.f17136C);
                        }
                        if (anonymousClass1K4.f17135B != null) {
                            createGenerator.writeNumberField("cooldown", anonymousClass1K4.f17135B.longValue());
                        }
                        createGenerator.writeEndObject();
                    }
                }
                createGenerator.writeEndArray();
            }
            if (anonymousClass1IC.f16851D != null) {
                createGenerator.writeNumberField("global", anonymousClass1IC.f16851D.longValue());
            }
            if (anonymousClass1IC.f16850C != null) {
                createGenerator.writeNumberField(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, anonymousClass1IC.f16850C.longValue());
            }
            if (anonymousClass1IC.f16849B != null) {
                createGenerator.writeNumberField("ttl", anonymousClass1IC.f16849B.longValue());
            }
            AnonymousClass0Pv.m3948C(createGenerator, anonymousClass1IC, false);
            createGenerator.writeEndObject();
            createGenerator.close();
            edit.putString(str, stringWriter.toString()).apply();
        } catch (Throwable e) {
            AnonymousClass0Dc.m1244G(AnonymousClass5qG.f69298B, "failed to update QP cooldown response.", e);
            AnonymousClass5qG.B(context);
        }
    }

    /* renamed from: Q */
    private static boolean m4463Q(AnonymousClass0T6 anonymousClass0T6, AnonymousClass19A anonymousClass19A, AnonymousClass0o2 anonymousClass0o2, long j, long j2, boolean z, AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0db C;
        String str;
        String str2;
        boolean L = AnonymousClass0T6.m4458L(anonymousClass19A, j);
        boolean K = AnonymousClass0T6.m4457K(anonymousClass19A, j);
        boolean N = AnonymousClass0T6.m4460N(anonymousClass19A, j, j2);
        boolean J = AnonymousClass0T6.m4456J(anonymousClass19A, anonymousClass0Cm);
        boolean M = AnonymousClass0T6.m4459M(anonymousClass19A, anonymousClass0o2);
        Long B = anonymousClass19A.m9652B();
        Long A = anonymousClass19A.m9651A();
        Long l = anonymousClass19A.f15083B;
        boolean z2 = N;
        boolean z3 = true;
        if (B == null || A == null) {
            if (B == null && A == null && l != null) {
                if (z2 || !J || !M) {
                    z3 = false;
                }
                if (z) {
                    C = AnonymousClass0db.m6067C();
                    C.m6076I("start_eligibility", L);
                    C.m6076I("end_eligibility", K);
                    C.m6076I("ttl_eligibility", N);
                    C.m6076I("content_eligibility", J);
                    C.m6076I("trigger_eligibility", M);
                    str = z3 ? "ig_qp_eligibility_check_succeeded" : "ig_qp_eligibility_check_failed";
                    if (anonymousClass19A.f15084C != null) {
                        str2 = anonymousClass19A.f15084C.f15093H;
                    } else {
                        str2 = "UNKNOWN";
                    }
                    AnonymousClass0T6.m4453G(AnonymousClass0NN.m3291B(str, (AnonymousClass0EE) anonymousClass0T6).m3296D("eligibility", C), anonymousClass0o2, str2, false);
                }
                return z3;
            }
        } else if (L && K && (l == null || N)) {
            z2 = true;
            if (z2) {
            }
            z3 = false;
            if (z) {
                C = AnonymousClass0db.m6067C();
                C.m6076I("start_eligibility", L);
                C.m6076I("end_eligibility", K);
                C.m6076I("ttl_eligibility", N);
                C.m6076I("content_eligibility", J);
                C.m6076I("trigger_eligibility", M);
                if (z3) {
                }
                if (anonymousClass19A.f15084C != null) {
                    str2 = "UNKNOWN";
                } else {
                    str2 = anonymousClass19A.f15084C.f15093H;
                }
                AnonymousClass0T6.m4453G(AnonymousClass0NN.m3291B(str, (AnonymousClass0EE) anonymousClass0T6).m3296D("eligibility", C), anonymousClass0o2, str2, false);
            }
            return z3;
        }
        z2 = false;
        if (z2) {
        }
        z3 = false;
        if (z) {
            C = AnonymousClass0db.m6067C();
            C.m6076I("start_eligibility", L);
            C.m6076I("end_eligibility", K);
            C.m6076I("ttl_eligibility", N);
            C.m6076I("content_eligibility", J);
            C.m6076I("trigger_eligibility", M);
            if (z3) {
            }
            if (anonymousClass19A.f15084C != null) {
                str2 = anonymousClass19A.f15084C.f15093H;
            } else {
                str2 = "UNKNOWN";
            }
            AnonymousClass0T6.m4453G(AnonymousClass0NN.m3291B(str, (AnonymousClass0EE) anonymousClass0T6).m3296D("eligibility", C), anonymousClass0o2, str2, false);
        }
        return z3;
    }

    /* renamed from: R */
    private static boolean m4464R(AnonymousClass0Cm anonymousClass0Cm, String str) {
        if (!((Boolean) AnonymousClass0CC.eZ.m846H(anonymousClass0Cm)).booleanValue()) {
            return false;
        }
        long j = AnonymousClass0HV.m2008D(anonymousClass0Cm).f2646B.getLong(AnonymousClass0HV.m2010F(str), -1);
        if (AnonymousClass0CB.m834D()) {
            j = f5087H;
        } else if (j == -1 || !((Boolean) AnonymousClass0CC.fZ.m846H(anonymousClass0Cm)).booleanValue()) {
            j = f5085F;
        }
        return (AnonymousClass5qG.F(anonymousClass0Cm, str) + j <= System.currentTimeMillis() ? 1 : 0) ^ 1;
    }
}

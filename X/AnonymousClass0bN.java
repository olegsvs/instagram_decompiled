package X;

import com.instagram.model.shopping.ProductTag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: X.0bN */
public final class AnonymousClass0bN {
    /* renamed from: B */
    public static String m5538B(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("carousel_");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    /* renamed from: C */
    public static AnonymousClass0bP m5539C(String str, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0MJ anonymousClass0MJ, AnonymousClass0ua anonymousClass0ua) {
        if (AnonymousClass0bN.m5549M(anonymousClass0MJ, anonymousClass0PZ)) {
            str = AnonymousClass0bN.m5545I(str);
        } else {
            str = AnonymousClass0bN.m5571i(str);
        }
        return new AnonymousClass0bP(str, anonymousClass0PZ, anonymousClass0ua);
    }

    /* renamed from: D */
    public static AnonymousClass0bP m5540D(String str, AnonymousClass0MJ anonymousClass0MJ, AnonymousClass0PZ anonymousClass0PZ) {
        if (AnonymousClass0bN.m5549M(anonymousClass0MJ, anonymousClass0PZ)) {
            str = AnonymousClass0bN.m5545I(str);
        } else {
            str = AnonymousClass0bN.m5571i(str);
        }
        return new AnonymousClass0bP(str, anonymousClass0PZ);
    }

    /* renamed from: E */
    public static AnonymousClass0bP m5541E(String str, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0PZ anonymousClass0PZ) {
        return AnonymousClass0bN.m5540D(str, anonymousClass0P7, anonymousClass0PZ).m5581F(anonymousClass0P7);
    }

    /* renamed from: F */
    public static AnonymousClass0bP m5542F(String str, AnonymousClass0PZ anonymousClass0PZ, String str2, AnonymousClass0P7 anonymousClass0P7, boolean z) {
        String str3 = z ? "instagram_commerce" : "instagram_shopping";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str3);
        stringBuilder.append("_");
        stringBuilder.append(str);
        AnonymousClass0bP G = AnonymousClass0bN.m5543G(stringBuilder.toString(), anonymousClass0PZ);
        G.mC = str2;
        if (anonymousClass0P7 != null) {
            G.m5581F(anonymousClass0P7);
        }
        return G;
    }

    /* renamed from: G */
    public static AnonymousClass0bP m5543G(String str, AnonymousClass0PZ anonymousClass0PZ) {
        return new AnonymousClass0bP(str, anonymousClass0PZ);
    }

    /* renamed from: H */
    public static AnonymousClass0bP m5544H(String str, AnonymousClass0hq anonymousClass0hq, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0PZ anonymousClass0PZ, int i) {
        if (!AnonymousClass0bN.m5547K(anonymousClass0P7, anonymousClass0PZ)) {
            return null;
        }
        str = AnonymousClass0bN.m5541E(str, anonymousClass0P7, anonymousClass0PZ);
        str.nB = i;
        if (anonymousClass0hq != null) {
            str.bD = anonymousClass0hq.kR();
        }
        return str;
    }

    /* renamed from: I */
    public static String m5545I(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("instagram_ad_");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    /* renamed from: J */
    public static String m5546J(String str, AnonymousClass0Cm anonymousClass0Cm) {
        String str2 = anonymousClass0Cm.f1759C;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append("_");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    /* renamed from: K */
    public static boolean m5547K(AnonymousClass0MJ anonymousClass0MJ, AnonymousClass0PZ anonymousClass0PZ) {
        if (!(AnonymousClass0bN.m5548L(anonymousClass0MJ, anonymousClass0PZ) || AnonymousClass0bN.m5549M(anonymousClass0MJ, anonymousClass0PZ))) {
            if (!anonymousClass0MJ.bX()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: L */
    public static boolean m5548L(AnonymousClass0MJ anonymousClass0MJ, AnonymousClass0PZ anonymousClass0PZ) {
        return (anonymousClass0MJ.DY() == null || anonymousClass0PZ.isOrganicEligible() == null) ? null : true;
    }

    /* renamed from: M */
    public static boolean m5549M(AnonymousClass0MJ anonymousClass0MJ, AnonymousClass0PZ anonymousClass0PZ) {
        return (anonymousClass0MJ.eY() == null || anonymousClass0PZ.isSponsoredEligible() == null) ? null : true;
    }

    /* renamed from: N */
    public static void m5550N(AnonymousClass0bP anonymousClass0bP, AnonymousClass0P7 anonymousClass0P7, int i) {
        if (anonymousClass0P7.kA() && i != -1) {
            AnonymousClass0P7 S = anonymousClass0P7.m3763S(i);
            anonymousClass0bP.f6770t = i;
            anonymousClass0bP.f6771u = S.NO();
            anonymousClass0bP.f6769s = anonymousClass0P7.m3763S(0).NO();
            anonymousClass0bP.f6773w = anonymousClass0P7.m3761Q();
            anonymousClass0bP.f6772v = S.TO().m3618A();
            anonymousClass0bP.OC = anonymousClass0P7.qB;
        }
    }

    /* renamed from: O */
    public static void m5551O(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0PZ anonymousClass0PZ, int i, int i2, String str, String str2, String str3, Boolean bool, String str4) {
        AnonymousClass0bP E = AnonymousClass0bN.m5541E("action", anonymousClass0P7, anonymousClass0PZ);
        E.nB = i2;
        E.RB = str;
        E.f6726B = str2;
        E.f6730F = str3;
        E.f6728D = bool;
        E.IE = str4;
        E.DB = null;
        AnonymousClass0bN.m5550N(E, anonymousClass0P7, i);
        if (AnonymousClass0bN.m5549M(anonymousClass0P7, anonymousClass0PZ)) {
            AnonymousClass0bN.m5568f(E.m5577B(), AnonymousClass0dd.ZERO);
        } else if (AnonymousClass0bN.m5548L(anonymousClass0P7, anonymousClass0PZ) || anonymousClass0P7.bX()) {
            AnonymousClass0bN.m5568f(E.m5577B(), AnonymousClass0dd.REGULAR);
        }
    }

    /* renamed from: P */
    public static void m5552P(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0PZ anonymousClass0PZ, String str, String str2, String str3, AnonymousClass0ua anonymousClass0ua) {
        AnonymousClass0bP C = AnonymousClass0bN.m5539C("action", anonymousClass0PZ, anonymousClass0P7, anonymousClass0ua);
        C.f6726B = str2;
        C.RB = str;
        C.IE = str3;
        AnonymousClass0bN.m5568f(C.m5577B(), AnonymousClass0dd.ZERO);
    }

    /* renamed from: Q */
    public static void m5553Q(String str, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0MJ anonymousClass0MJ, AnonymousClass0ua anonymousClass0ua, int i, String str2) {
        if (AnonymousClass0bN.m5547K(anonymousClass0MJ, anonymousClass0PZ)) {
            str = AnonymousClass0bN.m5539C(str, anonymousClass0PZ, anonymousClass0MJ, anonymousClass0ua);
            str.iD = str2;
            if (i != -1) {
                str.nB = i;
            }
            AnonymousClass0bN.m5569g(anonymousClass0PZ, anonymousClass0MJ, str.m5577B(), null);
        }
    }

    /* renamed from: R */
    public static void m5554R(AnonymousClass0bP anonymousClass0bP, AnonymousClass0MJ anonymousClass0MJ, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0dd anonymousClass0dd) {
        if (!AnonymousClass0bN.m5549M(anonymousClass0MJ, anonymousClass0PZ)) {
            if (anonymousClass0dd == null || anonymousClass0dd != AnonymousClass0dd.LOW) {
                if (AnonymousClass0bN.m5548L(anonymousClass0MJ, anonymousClass0PZ) || anonymousClass0MJ.bX()) {
                    AnonymousClass0bN.m5568f(anonymousClass0bP.m5577B(), AnonymousClass0dd.REGULAR);
                    return;
                }
                return;
            }
        }
        AnonymousClass0bN.m5568f(anonymousClass0bP.m5577B(), AnonymousClass0dd.LOW);
    }

    /* renamed from: S */
    public static void m5555S(AnonymousClass0bP anonymousClass0bP, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0PZ anonymousClass0PZ, int i) {
        AnonymousClass0bN.m5556T(anonymousClass0bP, anonymousClass0P7, anonymousClass0PZ, i, false);
    }

    /* renamed from: T */
    public static void m5556T(AnonymousClass0bP anonymousClass0bP, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0PZ anonymousClass0PZ, int i, boolean z) {
        AnonymousClass0bN.m5557U(anonymousClass0bP, anonymousClass0P7, anonymousClass0PZ, i, z, AnonymousClass0dd.REGULAR);
    }

    /* renamed from: U */
    public static void m5557U(AnonymousClass0bP anonymousClass0bP, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0PZ anonymousClass0PZ, int i, boolean z, AnonymousClass0dd anonymousClass0dd) {
        AnonymousClass0bN.m5550N(anonymousClass0bP, anonymousClass0P7, i);
        if (z && anonymousClass0P7.kA() && i != -1) {
            ArrayList v = anonymousClass0P7.m3763S(i).m3792v();
            if (!(v == null || v.isEmpty())) {
                ArrayList arrayList = new ArrayList(v.size());
                int size = v.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(((ProductTag) v.get(i2)).f17742B);
                }
                anonymousClass0bP.rC = arrayList;
            }
        }
        AnonymousClass0bN.m5554R(anonymousClass0bP, anonymousClass0P7, anonymousClass0PZ, anonymousClass0dd);
    }

    /* renamed from: V */
    public static void m5558V(String str, String str2, AnonymousClass0PZ anonymousClass0PZ, int i, String str3, String str4) {
        AnonymousClass0bP anonymousClass0bP = new AnonymousClass0bP(AnonymousClass0bN.m5545I("hide_response"), anonymousClass0PZ);
        anonymousClass0bP.EE = str2;
        anonymousClass0bP.VD = str3;
        anonymousClass0bP.iD = str4;
        AnonymousClass0bN.m5550N(anonymousClass0bP, AnonymousClass107.f13182C.m8703A(str), i);
        AnonymousClass0bN.m5568f(anonymousClass0bP.m5577B(), AnonymousClass0dd.LOW);
    }

    /* renamed from: W */
    public static void m5559W(AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0MJ anonymousClass0MJ, String str, AnonymousClass0ua anonymousClass0ua) {
        AnonymousClass0bP C = AnonymousClass0bN.m5539C("invalidation", anonymousClass0PZ, anonymousClass0MJ, anonymousClass0ua);
        C.VD = str;
        AnonymousClass0bN.m5569g(anonymousClass0PZ, anonymousClass0MJ, C.m5577B(), AnonymousClass0dd.LOW);
    }

    /* renamed from: X */
    public static void m5560X(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0ua anonymousClass0ua, String str) {
        AnonymousClass0bP C = AnonymousClass0bN.m5539C("political_ad_unit_action", anonymousClass0PZ, anonymousClass0P7, anonymousClass0ua);
        C.LB = str;
        AnonymousClass0bN.m5568f(C.m5577B(), AnonymousClass0dd.LOW);
    }

    /* renamed from: Y */
    public static void m5561Y(AnonymousClass0PZ anonymousClass0PZ, String str, String str2, String str3, String str4, String str5) {
        AnonymousClass0bP G = AnonymousClass0bN.m5543G(AnonymousClass0bN.m5545I("political_info_sheet_action"), anonymousClass0PZ);
        G.LB = str;
        G.f6726B = str2;
        G.IE = str3;
        G.RB = str4;
        G.EE = str5;
        AnonymousClass0bN.m5568f(G.m5577B(), AnonymousClass0dd.LOW);
    }

    /* renamed from: Z */
    public static void m5562Z(AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0MJ anonymousClass0MJ, AnonymousClass0ua anonymousClass0ua, boolean z, AnonymousClass0ub anonymousClass0ub, String str, AnonymousClass0hq anonymousClass0hq) {
        String str2;
        switch (anonymousClass0ub.ordinal()) {
            case 1:
                str2 = "user_profile";
                break;
            case 2:
                str2 = "influencer_profile";
                break;
            default:
                str2 = "brand_profile";
                break;
        }
        if (AnonymousClass0bN.m5547K(anonymousClass0MJ, anonymousClass0PZ)) {
            AnonymousClass0bP C = AnonymousClass0bN.m5539C(str2, anonymousClass0PZ, anonymousClass0MJ, anonymousClass0ua);
            if (AnonymousClass0bN.m5549M(anonymousClass0MJ, anonymousClass0PZ)) {
                C.CC = Boolean.valueOf(z);
            }
            C.iD = str;
            if (anonymousClass0hq != null) {
                C.bD = anonymousClass0hq.kR();
            }
            AnonymousClass0bN.m5569g(anonymousClass0PZ, anonymousClass0MJ, C.m5577B(), null);
        }
    }

    /* renamed from: a */
    public static void m5563a(String str, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0PZ anonymousClass0PZ, int i) {
        if (AnonymousClass0bN.m5547K(anonymousClass0P7, anonymousClass0PZ)) {
            AnonymousClass0bN.m5555S(AnonymousClass0bN.m5541E(str, anonymousClass0P7, anonymousClass0PZ), anonymousClass0P7, anonymousClass0PZ, i);
        }
    }

    /* renamed from: b */
    public static void m5564b(String str, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0PZ anonymousClass0PZ, int i, int i2) {
        if (AnonymousClass0bN.m5547K(anonymousClass0P7, anonymousClass0PZ)) {
            AnonymousClass0bP E = AnonymousClass0bN.m5541E(str, anonymousClass0P7, anonymousClass0PZ);
            E.nB = i2;
            AnonymousClass0bN.m5555S(E, anonymousClass0P7, anonymousClass0PZ, i);
        }
    }

    /* renamed from: c */
    public static void m5565c(String str, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0PZ anonymousClass0PZ, int i, int i2, int i3) {
        if (AnonymousClass0bN.m5547K(anonymousClass0P7, anonymousClass0PZ)) {
            AnonymousClass0bP E = AnonymousClass0bN.m5541E(str, anonymousClass0P7, anonymousClass0PZ);
            E.nB = i2;
            E.JB = i3;
            AnonymousClass0bN.m5555S(E, anonymousClass0P7, anonymousClass0PZ, i);
        }
    }

    /* renamed from: d */
    public static void m5566d(String str, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0MJ anonymousClass0MJ, AnonymousClass0ua anonymousClass0ua, AnonymousClass0dd anonymousClass0dd) {
        if (AnonymousClass0bN.m5547K(anonymousClass0MJ, anonymousClass0PZ)) {
            AnonymousClass0bN.m5569g(anonymousClass0PZ, anonymousClass0MJ, AnonymousClass0bN.m5539C(str, anonymousClass0PZ, anonymousClass0MJ, anonymousClass0ua).m5577B(), anonymousClass0dd);
        }
    }

    /* renamed from: e */
    public static void m5567e(String str, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0PZ anonymousClass0PZ, int i, int i2, String str2, String str3) {
        if (AnonymousClass0bN.m5547K(anonymousClass0P7, anonymousClass0PZ)) {
            AnonymousClass0bP E = AnonymousClass0bN.m5541E(str, anonymousClass0P7, anonymousClass0PZ);
            E.nB = i2;
            E.IE = str2;
            E.f6726B = str3;
            AnonymousClass0bN.m5555S(E, anonymousClass0P7, anonymousClass0PZ, i);
        }
    }

    /* renamed from: f */
    public static void m5568f(AnonymousClass0NN anonymousClass0NN, AnonymousClass0dd anonymousClass0dd) {
        switch (anonymousClass0dd.ordinal()) {
            case 1:
                anonymousClass0NN.m3311S();
                return;
            case 2:
                anonymousClass0NN.m3312T();
                return;
            default:
                anonymousClass0NN.m3310R();
                return;
        }
    }

    /* renamed from: g */
    public static void m5569g(AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0MJ anonymousClass0MJ, AnonymousClass0NN anonymousClass0NN, AnonymousClass0dd anonymousClass0dd) {
        if (anonymousClass0dd == null) {
            if (AnonymousClass0bN.m5549M(anonymousClass0MJ, anonymousClass0PZ)) {
                anonymousClass0dd = AnonymousClass0dd.LOW;
            } else if (AnonymousClass0bN.m5548L(anonymousClass0MJ, anonymousClass0PZ) || anonymousClass0MJ.bX()) {
                anonymousClass0dd = AnonymousClass0dd.REGULAR;
            }
        }
        AnonymousClass0bN.m5568f(anonymousClass0NN, anonymousClass0dd);
    }

    /* renamed from: h */
    public static void m5570h(AnonymousClass0Ma anonymousClass0Ma, int i, long j) {
        Set hashSet;
        AnonymousClass0Ma anonymousClass0Ma2 = anonymousClass0Ma;
        synchronized (anonymousClass0Ma2) {
            hashSet = new HashSet(anonymousClass0Ma.f3446E.entrySet());
        }
        List arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        int i2 = 0;
        while (true) {
            long j2 = j;
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            if (((Long) entry.getValue()).compareTo(Long.valueOf(j)) > 0) {
                i2++;
            }
            arrayList.add((Long) entry.getValue());
        }
        Collections.sort(arrayList);
        if (i2 > 0) {
            int min = Math.min(i2, i);
            AnonymousClass0bN.m5572j(hashSet, anonymousClass0Ma2, j2, ((Long) arrayList.get(((arrayList.size() - i2) + min) - 1)).longValue());
            i -= min;
        }
        if (i > 0) {
            AnonymousClass0bN.m5572j(hashSet, anonymousClass0Ma2, 0, ((Long) arrayList.get(i - 1)).longValue());
        }
    }

    /* renamed from: i */
    private static String m5571i(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("instagram_organic_");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    /* renamed from: j */
    private static void m5572j(Set set, AnonymousClass0Ma anonymousClass0Ma, long j, long j2) {
        for (Entry entry : set) {
            Long l = (Long) entry.getValue();
            if (l.compareTo(Long.valueOf(j)) >= 0 && l.compareTo(Long.valueOf(j2)) <= 0) {
                anonymousClass0Ma.m3215H((String) entry.getKey());
            }
        }
    }
}

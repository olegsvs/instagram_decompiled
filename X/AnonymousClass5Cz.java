package X;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: X.5Cz */
public abstract class AnonymousClass5Cz implements AnonymousClass0kc {
    /* renamed from: E */
    public static int f61213E = -1;
    /* renamed from: B */
    public AnonymousClass5Cx f61214B;
    /* renamed from: C */
    public AnonymousClass0KY f61215C = new AnonymousClass0KY(25);
    /* renamed from: D */
    public AnonymousClass0Cm f61216D;

    public AnonymousClass5Cz(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass5Cx anonymousClass5Cx) {
        this.f61216D = anonymousClass0Cm;
        this.f61214B = anonymousClass5Cx;
    }

    /* renamed from: A */
    public final int m25986A(AnonymousClass0nO anonymousClass0nO) {
        anonymousClass0nO = AnonymousClass5Cz.m25985C(this, anonymousClass0nO);
        if (anonymousClass0nO == null) {
            return f61213E;
        }
        return this.f61214B.m25977G(anonymousClass0nO);
    }

    /* renamed from: B */
    public final int m25987B(AnonymousClass0nO anonymousClass0nO) {
        AnonymousClass0MI C = AnonymousClass5Cz.m25985C(this, anonymousClass0nO);
        if (C == null) {
            return f61213E;
        }
        return C.F().indexOf(anonymousClass0nO.f10057B);
    }

    /* renamed from: B */
    public static void m25984B(StringBuilder stringBuilder, String str, AnonymousClass0Pj anonymousClass0Pj, int i, int i2, boolean z, Map map) {
        stringBuilder.append("[");
        stringBuilder.append(i);
        stringBuilder.append(",");
        stringBuilder.append(i2);
        stringBuilder.append("] ");
        if (anonymousClass0Pj.l()) {
            if (anonymousClass0Pj.q()) {
                stringBuilder.append(" (V)");
            } else {
                stringBuilder.append(" (P)");
            }
        } else if (anonymousClass0Pj.pW()) {
            stringBuilder.append("(B)");
        }
        if (anonymousClass0Pj.eY()) {
            stringBuilder.append(" (S)");
        }
        if (z) {
            stringBuilder.append(" *");
        }
        if (str != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(" ");
            stringBuilder2.append(str.substring(0, Math.min(str.length(), 10)));
            stringBuilder.append(stringBuilder2.toString());
        }
        AnonymousClass1Tj anonymousClass1Tj = map != null ? (AnonymousClass1Tj) map.get(anonymousClass0Pj.getId()) : null;
        if (anonymousClass1Tj != null) {
            stringBuilder.append(" - ");
            stringBuilder.append(anonymousClass1Tj.f18975E);
            stringBuilder.append(" kb");
        }
        stringBuilder.append("\n");
    }

    /* renamed from: C */
    public static AnonymousClass0MI m25985C(AnonymousClass5Cz anonymousClass5Cz, AnonymousClass0nO anonymousClass0nO) {
        return AnonymousClass0MB.C(anonymousClass5Cz.f61216D).D(((AnonymousClass0Pj) anonymousClass0nO.f10057B).f4136H);
    }

    public final /* bridge */ /* synthetic */ CharSequence WN(LinkedHashSet linkedHashSet, Object obj, Map map) {
        AnonymousClass0Pj anonymousClass0Pj = (AnonymousClass0Pj) obj;
        StringBuilder stringBuilder = new StringBuilder();
        AnonymousClass14t E = this.f61214B.m25975E(anonymousClass0Pj.f4136H);
        Map map2 = map;
        AnonymousClass5Cz.m25984B(stringBuilder, E.f14103H.f3385R.getName(), anonymousClass0Pj, this.f61214B.m25978H(E), E.f14107L, true, map2);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            AnonymousClass0nO anonymousClass0nO = (AnonymousClass0nO) it.next();
            AnonymousClass0MI C = AnonymousClass5Cz.m25985C(this, anonymousClass0nO);
            if (C == null) {
                stringBuilder.append("UNKNOWN!");
                stringBuilder.append("\n");
            } else {
                String name = C.f3385R.getName();
                int A = m25986A(anonymousClass0nO);
                int B = m25987B(anonymousClass0nO);
                AnonymousClass5Cz.m25984B(stringBuilder, name, C.E(B), A, B, false, map2);
            }
        }
        return stringBuilder.toString();
    }
}

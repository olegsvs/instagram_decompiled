package X;

import java.util.List;

/* renamed from: X.161 */
public final class AnonymousClass161 {
    /* renamed from: B */
    public static String m9347B(AnonymousClass0Pj anonymousClass0Pj, AnonymousClass1Zo anonymousClass1Zo) {
        AnonymousClass1mY.C(Boolean.valueOf(anonymousClass1Zo.f20270E != null));
        return ((AnonymousClass1Ay) AnonymousClass161.m9350E(anonymousClass0Pj).f14398E.get(anonymousClass1Zo.f20270E.intValue())).f15351D.toLowerCase(AnonymousClass0EH.m1375E()).replace('\n', ' ').trim();
    }

    /* renamed from: C */
    public static int[] m9348C(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass160 anonymousClass160) {
        AnonymousClass0el B = AnonymousClass0f2.m6474B(anonymousClass0Cm);
        anonymousClass0Cm = B.m6410A(anonymousClass160.f14397D) ? B.m6482Q(anonymousClass160) : null;
        List list = anonymousClass160.f14398E;
        int i = ((AnonymousClass1Ay) list.get(0)).f15349B;
        int i2 = ((AnonymousClass1Ay) list.get(1)).f15349B;
        if (anonymousClass0Cm != null) {
            if (anonymousClass0Cm.intValue() == 0) {
                i++;
            } else {
                i2++;
            }
        }
        return new int[]{i, i2};
    }

    /* renamed from: D */
    public static int[] m9349D(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass160 anonymousClass160) {
        anonymousClass160 = AnonymousClass161.m9348C(anonymousClass0Cm, anonymousClass160);
        if (anonymousClass160[0] == null && anonymousClass160[1] == null) {
            return anonymousClass160;
        }
        int round = 100 - Math.round((((float) anonymousClass160[0]) / ((float) (anonymousClass160[0] + anonymousClass160[1]))) * 100.0f);
        return new int[]{Math.round((((float) anonymousClass160[0]) / ((float) (anonymousClass160[0] + anonymousClass160[1]))) * 100.0f), round};
    }

    /* renamed from: E */
    public static AnonymousClass160 m9350E(AnonymousClass0Pj anonymousClass0Pj) {
        if (anonymousClass0Pj.m3888l()) {
            anonymousClass0Pj = anonymousClass0Pj.m3864N(AnonymousClass15c.POLLING);
            if (!(anonymousClass0Pj == null || anonymousClass0Pj.isEmpty())) {
                return ((AnonymousClass0ZF) anonymousClass0Pj.get(0)).m5343A();
            }
        }
        return null;
    }
}

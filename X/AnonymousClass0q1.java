package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0q1 */
public final class AnonymousClass0q1 {
    /* renamed from: B */
    public static String m7894B(String str) {
        int indexOf = str.indexOf(95);
        return indexOf != -1 ? str.substring(0, indexOf) : str;
    }

    /* renamed from: C */
    public static String m7895C(String str) {
        int indexOf = str.indexOf(95);
        return indexOf != -1 ? str.substring(indexOf + 1, str.length()) : null;
    }

    /* renamed from: D */
    public static List m7896D(AnonymousClass0P7 anonymousClass0P7) {
        AnonymousClass0Ci pT;
        List arrayList = new ArrayList();
        if (anonymousClass0P7.SA()) {
            pT = anonymousClass0P7.f4028c.pT();
            if (!pT.m1029t()) {
                arrayList.add(pT);
            }
        }
        for (AnonymousClass0SK pT2 : anonymousClass0P7.m3753I().f11811B) {
            pT = pT2.pT();
            if (!pT.m1029t()) {
                arrayList.add(pT);
            }
        }
        return arrayList;
    }

    /* renamed from: E */
    public static boolean m7897E(AnonymousClass0P7 anonymousClass0P7, boolean z, boolean z2) {
        if (anonymousClass0P7.wY()) {
            return anonymousClass0P7.eY() ? z2 : z;
        } else {
            return false;
        }
    }

    /* renamed from: F */
    public static boolean m7898F(AnonymousClass0P7 anonymousClass0P7) {
        return (anonymousClass0P7.kA() || anonymousClass0P7.FD == null || (anonymousClass0P7.FD.intValue() <= 0 && anonymousClass0P7.iB <= 0)) ? false : true;
    }

    /* renamed from: G */
    public static boolean m7899G(AnonymousClass0P7 anonymousClass0P7) {
        return (anonymousClass0P7.KA() == null || anonymousClass0P7.KA().isEmpty()) ? false : true;
    }

    /* renamed from: H */
    public static boolean m7900H(AnonymousClass0P7 anonymousClass0P7) {
        return (AnonymousClass0q1.m7898F(anonymousClass0P7) || anonymousClass0P7.EB == null) ? false : true;
    }
}

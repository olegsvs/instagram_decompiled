package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4tH */
public final class AnonymousClass4tH {
    /* renamed from: B */
    public static AnonymousClass4tG m25295B(AnonymousClass5Xr anonymousClass5Xr) {
        List C;
        AnonymousClass4tG anonymousClass4tG = new AnonymousClass4tG();
        Object obj = anonymousClass5Xr.f65988I != null ? 1 : null;
        if (anonymousClass5Xr.f65988I != null) {
            C = AnonymousClass3Jd.C(anonymousClass5Xr.f65988I);
            AnonymousClass3Jc.C(C);
            anonymousClass4tG.f58221H = C;
        } else {
            anonymousClass4tG.f58221H = Collections.emptyList();
        }
        if (anonymousClass5Xr.f65989J != null) {
            C = AnonymousClass3Jd.C(anonymousClass5Xr.f65989J);
            AnonymousClass3Jc.C(C);
            anonymousClass4tG.f58216C = C;
        } else {
            anonymousClass4tG.f58216C = Collections.emptyList();
        }
        Iterator it = (obj != null ? anonymousClass4tG.f58221H : anonymousClass4tG.f58216C).iterator();
        AnonymousClass3J4 anonymousClass3J4 = null;
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof AnonymousClass3J4) {
                if (anonymousClass3J4 == null) {
                    anonymousClass3J4 = (AnonymousClass3J4) next;
                } else {
                    AnonymousClass0Gn.C("HashtagPageResponseParser", "Multiple tab sections.");
                }
                it.remove();
            }
        }
        if (anonymousClass3J4 != null) {
            List list = anonymousClass3J4.f39995D;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AnonymousClass3J0 anonymousClass3J0 = (AnonymousClass3J0) it2.next();
                if (anonymousClass3J0.f39982D.equals(AnonymousClass3J2.UNSPECIFIED)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unsupported tab: ");
                    stringBuilder.append(anonymousClass3J0.f39981C);
                    AnonymousClass0Gn.C("HashtagPageResponseParser", stringBuilder.toString());
                    it2.remove();
                }
            }
            anonymousClass4tG.f58226M = list;
            anonymousClass4tG.f58224K = anonymousClass3J4.f39993B;
        }
        if (anonymousClass4tG.f58226M == null) {
            anonymousClass4tG.f58226M = new ArrayList();
        }
        Iterator it3 = anonymousClass4tG.f58216C.iterator();
        AnonymousClass3Iz anonymousClass3Iz = null;
        while (it3.hasNext()) {
            next = it3.next();
            if (next instanceof AnonymousClass3Iz) {
                if (anonymousClass3Iz == null) {
                    anonymousClass3Iz = (AnonymousClass3Iz) next;
                } else {
                    AnonymousClass0Gn.C("HashtagPageResponseParser", "Multiple search sections.");
                }
                it3.remove();
            }
        }
        anonymousClass4tG.f58223J = anonymousClass3Iz;
        anonymousClass4tG.f58215B = anonymousClass5Xr.f65982C;
        anonymousClass4tG.f58220G = anonymousClass5Xr.f65987H;
        anonymousClass4tG.f58217D = true ^ TextUtils.isEmpty(anonymousClass5Xr.oO());
        anonymousClass4tG.f58225L = AnonymousClass4tH.m25296C(anonymousClass5Xr);
        String D = AnonymousClass4tH.m25297D(anonymousClass5Xr);
        anonymousClass4tG.f58219F = D;
        anonymousClass4tG.f58218E = D != null ? AnonymousClass4tH.m25298E(anonymousClass5Xr) : null;
        if (obj != null) {
            C = anonymousClass5Xr.f65988I;
        } else {
            C = anonymousClass5Xr.f65989J;
        }
        anonymousClass4tG.f58222I = AnonymousClass4tH.m25299F(C);
        return anonymousClass4tG;
    }

    /* renamed from: C */
    private static AnonymousClass4sX m25296C(AnonymousClass5Xr anonymousClass5Xr) {
        AnonymousClass4mt anonymousClass4mt = anonymousClass5Xr.f65983D;
        if (!(anonymousClass4mt == null || anonymousClass4mt.f57260B == null)) {
            if (!anonymousClass4mt.f57260B.isEmpty()) {
                anonymousClass5Xr = new AnonymousClass4sX();
                anonymousClass5Xr.f58092B = (AnonymousClass1Ak) anonymousClass4mt.f57260B.get(0);
                return anonymousClass5Xr;
            }
        }
        return null;
    }

    /* renamed from: D */
    private static String m25297D(AnonymousClass5Xr anonymousClass5Xr) {
        if (!(anonymousClass5Xr == null || anonymousClass5Xr.f65989J.isEmpty())) {
            for (AnonymousClass3JV B : anonymousClass5Xr.f65989J) {
                AnonymousClass0P7 B2 = AnonymousClass3Jg.B(B);
                if (B2 != null) {
                    return B2.HA();
                }
            }
        }
        return null;
    }

    /* renamed from: E */
    private static String m25298E(AnonymousClass5Xr anonymousClass5Xr) {
        if (anonymousClass5Xr == null || anonymousClass5Xr.f65989J.isEmpty()) {
            return null;
        }
        for (AnonymousClass3JV B : anonymousClass5Xr.f65989J) {
            AnonymousClass0P7 B2 = AnonymousClass3Jg.B(B);
            if (B2 != null) {
                if (B2.MA() != null) {
                    return B2.MA().uT();
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: F */
    private static List m25299F(List list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return null;
        }
        AnonymousClass3JV anonymousClass3JV = (AnonymousClass3JV) list.get(0);
        if (AnonymousClass3Jg.C(anonymousClass3JV, 0)) {
            return anonymousClass3JV.f40048G.f40052E;
        }
        return null;
    }
}

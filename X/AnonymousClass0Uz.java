package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Uz */
public final class AnonymousClass0Uz {
    /* renamed from: B */
    public static List m4808B(List list) {
        List arrayList = new ArrayList(list.size());
        for (DirectShareTarget directShareTarget : list) {
            arrayList.add(directShareTarget.f5604E);
        }
        return arrayList;
    }

    /* renamed from: C */
    public static Long m4809C(AnonymousClass0Tw anonymousClass0Tw, List list, List list2) {
        Long l = null;
        for (DirectShareTarget directShareTarget : list) {
            DirectShareTarget directShareTarget2;
            DirectThreadKey directThreadKey = directShareTarget2.f5604E;
            String str = directThreadKey != null ? directThreadKey.f5871C : null;
            AnonymousClass0Vw W = anonymousClass0Tw.m4625W(str, directShareTarget2.m4804B());
            if (str == null) {
                if (W.m4943O() != null) {
                    directShareTarget2 = new DirectShareTarget(directShareTarget2.m4804B(), new DirectThreadKey(W.m4943O(), directShareTarget2.m4804B()), directShareTarget2.f5601B, directShareTarget2.f5602C);
                }
            }
            list2.add(directShareTarget2);
            Long T = anonymousClass0Tw.m4622T(directShareTarget2.f5604E);
            if (T != null && (l == null || T.longValue() > l.longValue())) {
                l = T;
            }
        }
        return l;
    }
}

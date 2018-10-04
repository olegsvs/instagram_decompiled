package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1k5 */
public final class AnonymousClass1k5 extends AnonymousClass1k6 {
    public AnonymousClass1k5(AnonymousClass1jm anonymousClass1jm, AnonymousClass0Ox anonymousClass0Ox, boolean z) {
        super(anonymousClass1jm, anonymousClass0Ox, z);
    }

    /* renamed from: E */
    public final Object mo2716E(List list) {
        int size = list.size();
        AnonymousClass1Ka.m10783C(size, "initialArraySize");
        List arrayList = new ArrayList(size);
        for (AnonymousClass1Fp anonymousClass1Fp : list) {
            arrayList.add(anonymousClass1Fp != null ? anonymousClass1Fp.mo2319B() : null);
        }
        return Collections.unmodifiableList(arrayList);
    }
}

package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1wu */
public final class AnonymousClass1wu {
    /* renamed from: B */
    public static AnonymousClass0L4 m13902B() {
        Set<AnonymousClass1ws> set = AnonymousClass0L5.f3171C;
        Set set2 = AnonymousClass0L6.f3197B;
        Map hashMap = new HashMap();
        for (AnonymousClass1ws put : set) {
            hashMap.put(put, Collections.unmodifiableSet(set2));
        }
        return new AnonymousClass0L4(Collections.unmodifiableMap(hashMap));
    }
}

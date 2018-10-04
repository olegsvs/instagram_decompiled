package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.65R */
public final class AnonymousClass65R {
    /* renamed from: B */
    public AnonymousClass65L f71608B;
    /* renamed from: C */
    public final Map f71609C = new LinkedHashMap();
    /* renamed from: D */
    public final Map f71610D = new LinkedHashMap();
    /* renamed from: E */
    public final Map f71611E = new LinkedHashMap();

    /* renamed from: A */
    public final List m28944A() {
        List arrayList = new ArrayList(this.f71609C.size() + this.f71610D.size());
        arrayList.addAll(this.f71610D.values());
        arrayList.addAll(this.f71611E.values());
        arrayList.addAll(this.f71609C.values());
        return arrayList;
    }

    /* renamed from: B */
    public final void m28945B(List list) {
        this.f71609C.clear();
        for (AnonymousClass65L anonymousClass65L : list) {
            this.f71609C.put(Long.valueOf(anonymousClass65L.f71586C), anonymousClass65L);
        }
    }
}

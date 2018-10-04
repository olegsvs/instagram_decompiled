package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.41j */
public final class AnonymousClass41j implements AnonymousClass3e5 {
    /* renamed from: C */
    private static final AnonymousClass3e3 f48535C = new AnonymousClass3e3(AnonymousClass3e4.NONE, null, null, null, null);
    /* renamed from: B */
    private final Map f48536B = Collections.synchronizedMap(new HashMap());

    public final AnonymousClass3e3 KQ(String str) {
        AnonymousClass3e3 anonymousClass3e3 = (AnonymousClass3e3) this.f48536B.get(str);
        if (anonymousClass3e3 != null) {
            return anonymousClass3e3;
        }
        return f48535C;
    }

    public final void clear() {
        this.f48536B.clear();
    }

    public final void wB(String str, AnonymousClass3e3 anonymousClass3e3) {
        synchronized (this.f48536B) {
            AnonymousClass3e3 anonymousClass3e32 = (AnonymousClass3e3) this.f48536B.get(str);
            if (!(anonymousClass3e32 == null || anonymousClass3e32.f42954D == null)) {
                List list = anonymousClass3e32.f42954D;
                list.addAll(anonymousClass3e3.f42954D);
                anonymousClass3e3 = new AnonymousClass3e3(AnonymousClass3e4.FULL, list, anonymousClass3e3.f42952B, anonymousClass3e3.f42955E, anonymousClass3e3.f42953C);
            }
            this.f48536B.put(str, anonymousClass3e3);
        }
    }

    public final void xB(String str, List list, String str2) {
        wB(str, new AnonymousClass3e3(AnonymousClass3e4.FULL, list, null, str2, null));
    }
}

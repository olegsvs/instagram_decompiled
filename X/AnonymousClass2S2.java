package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2S2 */
public final class AnonymousClass2S2 implements AnonymousClass1wV {
    /* renamed from: B */
    public Map f30520B;
    /* renamed from: C */
    public final /* synthetic */ Map f30521C;

    public AnonymousClass2S2(AnonymousClass1wW anonymousClass1wW, Map map) {
        this.f30521C = map;
    }

    public final void nWA(String str, int i) {
        this.f30520B.put(str, String.valueOf(i));
    }

    public final void oWA(String str, long j) {
        this.f30520B.put(str, String.valueOf(j));
    }

    public final void pWA(String str, String str2) {
        this.f30520B.put(str, str2);
    }

    public final void qWA(String str) {
        this.f30520B = new HashMap();
        this.f30521C.put(str, this.f30520B);
    }
}

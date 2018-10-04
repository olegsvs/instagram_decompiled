package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0Xg */
public final class AnonymousClass0Xg implements AnonymousClass0U2 {
    /* renamed from: C */
    public static final Map f6183C = new HashMap();
    /* renamed from: B */
    public final Map f6184B;

    public AnonymousClass0Xg(Map map) {
        Map hashMap = new HashMap();
        this.f6184B = hashMap;
        hashMap.putAll(map);
    }

    /* renamed from: B */
    private AnonymousClass0U2 m5263B(AnonymousClass0U0 anonymousClass0U0) {
        anonymousClass0U0 = anonymousClass0U0.mo1287A();
        AnonymousClass0Xp anonymousClass0Xp = (AnonymousClass0Xp) this.f6184B.get(anonymousClass0U0);
        synchronized (anonymousClass0Xp) {
            if (anonymousClass0Xp.f6203D == null) {
                anonymousClass0Xp.f6203D = anonymousClass0Xp.f6202C.AI(anonymousClass0Xp.f6201B, anonymousClass0Xp.f6204E);
            }
            AnonymousClass0U2 anonymousClass0U2 = anonymousClass0Xp.f6203D;
        }
        if (anonymousClass0U2 != null) {
            return anonymousClass0U2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No processor registered for type: ");
        stringBuilder.append(anonymousClass0U0);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final void BV(AnonymousClass0U0 anonymousClass0U0, AnonymousClass0VN anonymousClass0VN) {
        m5263B(anonymousClass0U0).BV(anonymousClass0U0, anonymousClass0VN);
    }

    public final void CV(AnonymousClass0U0 anonymousClass0U0) {
        m5263B(anonymousClass0U0).CV(anonymousClass0U0);
    }

    public final void KMA(AnonymousClass0U0 anonymousClass0U0, AnonymousClass0db anonymousClass0db, AnonymousClass0XZ anonymousClass0XZ) {
        m5263B(anonymousClass0U0).KMA(anonymousClass0U0, anonymousClass0db, anonymousClass0XZ);
    }

    public final boolean UC(AnonymousClass0U0 anonymousClass0U0) {
        return m5263B(anonymousClass0U0).UC(anonymousClass0U0);
    }

    public final void mJA(AnonymousClass0U0 anonymousClass0U0) {
        m5263B(anonymousClass0U0).mJA(anonymousClass0U0);
    }
}

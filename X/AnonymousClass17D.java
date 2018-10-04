package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.17D */
public final class AnonymousClass17D implements AnonymousClass0G2 {
    /* renamed from: B */
    public final Map f14676B = new LinkedHashMap();

    private AnonymousClass17D() {
    }

    /* renamed from: A */
    public final List m9467A() {
        return new ArrayList(AnonymousClass17D.m9466D(this, AnonymousClass1Zp.CURRENT_USER_SUGGESTED_HIGHLIGHT_REELS));
    }

    /* renamed from: B */
    public static void m9464B(AnonymousClass17D anonymousClass17D, AnonymousClass1Zp anonymousClass1Zp, AnonymousClass0MI anonymousClass0MI) {
        Map map = (Map) anonymousClass17D.f14676B.get(anonymousClass1Zp);
        if (map == null) {
            map = new HashMap();
            anonymousClass17D.f14676B.put(anonymousClass1Zp, map);
        }
        map.put(anonymousClass0MI.getId(), anonymousClass0MI);
    }

    /* renamed from: C */
    public static synchronized AnonymousClass17D m9465C(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass17D anonymousClass17D;
        Class cls = AnonymousClass17D.class;
        synchronized (cls) {
            anonymousClass17D = (AnonymousClass17D) anonymousClass0Cm.m1036A(cls);
            if (anonymousClass17D == null) {
                anonymousClass17D = new AnonymousClass17D();
                anonymousClass0Cm.m1039D(cls, anonymousClass17D);
            }
        }
        return anonymousClass17D;
    }

    /* renamed from: D */
    public static Collection m9466D(AnonymousClass17D anonymousClass17D, AnonymousClass1Zp anonymousClass1Zp) {
        Map map = (Map) anonymousClass17D.f14676B.get(anonymousClass1Zp);
        return map == null ? Collections.emptySet() : map.values();
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.f14676B.clear();
    }
}

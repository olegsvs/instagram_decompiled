package X;

import java.util.concurrent.ConcurrentMap;

/* renamed from: X.107 */
public final class AnonymousClass107 {
    /* renamed from: C */
    public static final AnonymousClass107 f13182C = new AnonymousClass107();
    /* renamed from: B */
    private final ConcurrentMap f13183B = new AnonymousClass0LF().m2921A(64).m2923C().m2922B();

    /* renamed from: A */
    public final AnonymousClass0P7 m8703A(String str) {
        return str == null ? null : (AnonymousClass0P7) this.f13183B.get(str);
    }

    /* renamed from: B */
    public final AnonymousClass0P7 m8704B(AnonymousClass0P7 anonymousClass0P7) {
        AnonymousClass0P7 anonymousClass0P72 = (AnonymousClass0P7) this.f13183B.putIfAbsent(anonymousClass0P7.getId(), anonymousClass0P7);
        if (anonymousClass0P72 == null) {
            return anonymousClass0P7;
        }
        anonymousClass0P72.GB(anonymousClass0P7);
        AnonymousClass0F4.f2058E.m1505B(new AnonymousClass0qC(anonymousClass0P72, false));
        return anonymousClass0P72;
    }
}

package X;

import java.util.Map;

/* renamed from: X.431 */
public final class AnonymousClass431 extends AnonymousClass3rb {
    public AnonymousClass431(Map map) {
        super(map);
    }

    /* renamed from: B */
    public final Object mo5115B(AnonymousClass2gu anonymousClass2gu) {
        return anonymousClass2gu.f32461G;
    }

    public final long nK(AnonymousClass2h2 anonymousClass2h2) {
        if (anonymousClass2h2 != null) {
            return m20949A(anonymousClass2h2).nK(anonymousClass2h2);
        }
        long j = 0;
        for (AnonymousClass2h2 anonymousClass2h22 : AnonymousClass2h2.values()) {
            j += m20949A(anonymousClass2h22).nK(anonymousClass2h22);
        }
        return j;
    }
}

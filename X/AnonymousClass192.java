package X;

import java.util.Iterator;

/* renamed from: X.192 */
public final class AnonymousClass192 {
    /* renamed from: B */
    public AnonymousClass190 f15059B;
    /* renamed from: C */
    public final Iterator f15060C;

    public AnonymousClass192(AnonymousClass0bD anonymousClass0bD, Iterator it) {
        this.f15060C = it;
    }

    /* renamed from: A */
    public final AnonymousClass190 m9641A() {
        AnonymousClass190 anonymousClass190 = (AnonymousClass190) this.f15060C.next();
        this.f15059B = anonymousClass190;
        return anonymousClass190;
    }
}

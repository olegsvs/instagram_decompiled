package X;

import java.util.List;

/* renamed from: X.577 */
public final class AnonymousClass577 extends AnonymousClass17n {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass57K f60277B;

    public AnonymousClass577(AnonymousClass57K anonymousClass57K) {
        this.f60277B = anonymousClass57K;
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void m25779B(Object obj) {
        this.f60277B.f60307K = (List) obj;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        if (this.f60277B.getContext() != null) {
            return AnonymousClass1BX.C(this.f60277B.getContext(), null, null);
        }
        throw new Exception("the context should not bu null.");
    }
}

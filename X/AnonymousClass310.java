package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.310 */
public final class AnonymousClass310 {
    /* renamed from: D */
    public static AnonymousClass310 f36896D;
    /* renamed from: B */
    private final AnonymousClass0C9 f36897B;
    /* renamed from: C */
    private final Map f36898C = Collections.synchronizedMap(new HashMap());

    public AnonymousClass310(AnonymousClass0C9 anonymousClass0C9) {
        this.f36897B = anonymousClass0C9;
    }

    /* renamed from: A */
    public final void m18202A(String str) {
        this.f36898C.put(str, Long.valueOf(this.f36897B.now()));
    }

    /* renamed from: B */
    public final void m18203B(String str, AnonymousClass0NN anonymousClass0NN) {
        if (this.f36898C.containsKey(str)) {
            long longValue = ((Long) this.f36898C.get(str)).longValue();
            anonymousClass0NN.C("time_taken", this.f36897B.now() - longValue);
        }
        anonymousClass0NN.R();
        this.f36898C.remove(str);
    }
}

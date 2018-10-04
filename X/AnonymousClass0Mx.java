package X;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: X.0Mx */
public final class AnonymousClass0Mx implements AnonymousClass0My {
    /* renamed from: B */
    private final Map f3491B = new HashMap();
    /* renamed from: C */
    private final Random f3492C;

    public AnonymousClass0Mx(Random random) {
        this.f3492C = random;
    }

    public final void DJA(AnonymousClass0FT anonymousClass0FT) {
        Object obj = 1;
        if (anonymousClass0FT.f2163B.length <= 1) {
            obj = null;
        }
        if (obj != null) {
            AnonymousClass23b anonymousClass23b = new AnonymousClass23b(anonymousClass0FT.f2163B.length);
            for (Object put : anonymousClass0FT.f2163B) {
                this.f3491B.put(put, anonymousClass23b);
            }
        }
    }

    public final boolean QTA(AnonymousClass0NN anonymousClass0NN, AnonymousClass1PA anonymousClass1PA) {
        String str = anonymousClass0NN.f3556F;
        boolean z = this.f3492C.nextDouble() < anonymousClass1PA.getFrequency();
        if (!this.f3491B.containsKey(str)) {
            return z;
        }
        AnonymousClass23b anonymousClass23b = (AnonymousClass23b) this.f3491B.get(str);
        if (anonymousClass23b.f25512C == anonymousClass23b.f25511B) {
            anonymousClass23b.f25512C = 0;
            anonymousClass23b.f25513D = z;
        }
        anonymousClass23b.f25512C++;
        return anonymousClass23b.f25513D;
    }
}

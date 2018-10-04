package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0lM */
public final class AnonymousClass0lM {
    /* renamed from: C */
    private static AnonymousClass0lM f9521C;
    /* renamed from: B */
    public final Map f9522B = new HashMap();

    public AnonymousClass0lM(AnonymousClass0lO[] anonymousClass0lOArr) {
        for (AnonymousClass0lO anonymousClass0lO : anonymousClass0lOArr) {
            if (this.f9522B.containsKey(anonymousClass0lO.dL())) {
                throw new IllegalStateException("Tried to register the same event with multiple histograms.");
            }
            this.f9522B.put(anonymousClass0lO.dL(), anonymousClass0lO);
        }
    }

    /* renamed from: B */
    public static synchronized AnonymousClass0lM m7294B() {
        AnonymousClass0lM anonymousClass0lM;
        synchronized (AnonymousClass0lM.class) {
            if (f9521C == null) {
                f9521C = new AnonymousClass0lM(AnonymousClass1Vg.f19378B);
            }
            anonymousClass0lM = f9521C;
        }
        return anonymousClass0lM;
    }
}

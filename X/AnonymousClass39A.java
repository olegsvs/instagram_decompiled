package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.39A */
public enum AnonymousClass39A {
    f38339J(r1),
    f38334E(r1),
    f38338I(r1),
    f38333D(r1),
    f38335F(r1),
    f38336G(r1),
    f38337H(r1);
    
    /* renamed from: K */
    private static final Map f38340K = null;
    /* renamed from: B */
    private final String f38341B;

    static {
        f38340K = new HashMap();
        AnonymousClass39A[] values = AnonymousClass39A.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass39A anonymousClass39A = values[i];
            f38340K.put(anonymousClass39A.f38341B, anonymousClass39A);
            i++;
        }
    }

    private AnonymousClass39A(String str) {
        this.f38341B = str;
    }

    /* renamed from: B */
    public static AnonymousClass39A m18752B(String str) {
        return (AnonymousClass39A) f38340K.get(str);
    }
}

package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.39B */
public enum AnonymousClass39B {
    f38347H(r1),
    f38344E(r1),
    f38343D(r1),
    f38345F(r1),
    f38346G(r1),
    f38348I(r1);
    
    /* renamed from: J */
    private static final Map f38349J = null;
    /* renamed from: B */
    private final String f38350B;

    static {
        f38349J = new HashMap();
        AnonymousClass39B[] values = AnonymousClass39B.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass39B anonymousClass39B = values[i];
            f38349J.put(anonymousClass39B.f38350B, anonymousClass39B);
            i++;
        }
    }

    private AnonymousClass39B(String str) {
        this.f38350B = str;
    }

    /* renamed from: B */
    public static AnonymousClass39B m18753B(String str) {
        return (AnonymousClass39B) f38349J.get(str);
    }
}

package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.39J */
public enum AnonymousClass39J {
    f38397G(r1),
    f38396F(r1),
    f38394D(r1),
    f38395E(r1);
    
    /* renamed from: H */
    private static final Map f38398H = null;
    /* renamed from: B */
    private final String f38399B;

    static {
        f38398H = new HashMap();
        AnonymousClass39J[] values = AnonymousClass39J.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass39J anonymousClass39J = values[i];
            f38398H.put(anonymousClass39J.f38399B, anonymousClass39J);
            i++;
        }
    }

    private AnonymousClass39J(String str) {
        this.f38399B = str;
    }

    /* renamed from: B */
    public static AnonymousClass39J m18758B(String str) {
        return (AnonymousClass39J) f38398H.get(str);
    }
}

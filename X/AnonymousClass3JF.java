package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3JF */
public enum AnonymousClass3JF {
    f40016F(r1),
    f40014D(r1),
    f40015E(r1);
    
    /* renamed from: G */
    private static final Map f40017G = null;
    /* renamed from: B */
    private final String f40018B;

    static {
        f40017G = new HashMap();
        AnonymousClass3JF[] values = AnonymousClass3JF.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass3JF anonymousClass3JF = values[i];
            f40017G.put(anonymousClass3JF.f40018B, anonymousClass3JF);
            i++;
        }
    }

    private AnonymousClass3JF(String str) {
        this.f40018B = str;
    }

    /* renamed from: B */
    public static AnonymousClass3JF m19333B(String str) {
        return (AnonymousClass3JF) f40017G.get(str);
    }
}

package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Yz */
public enum AnonymousClass1Yz {
    USER("user");
    
    /* renamed from: E */
    private static final Map f20118E = null;
    /* renamed from: B */
    private final String f20119B;

    static {
        f20118E = new HashMap();
        AnonymousClass1Yz[] values = AnonymousClass1Yz.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass1Yz anonymousClass1Yz = values[i];
            f20118E.put(anonymousClass1Yz.f20119B, anonymousClass1Yz);
            i++;
        }
    }

    private AnonymousClass1Yz(String str) {
        this.f20119B = str;
    }

    /* renamed from: B */
    public static AnonymousClass1Yz m11865B(String str) {
        return (AnonymousClass1Yz) f20118E.get(str);
    }
}

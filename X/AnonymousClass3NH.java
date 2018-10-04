package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3NH */
public enum AnonymousClass3NH {
    SUGGESTED_USER("user_card"),
    FBC_UPSELL("upsell_fbc_card"),
    CI_UPSELL("upsell_ci_card"),
    UNKNOWN("unknown");
    
    /* renamed from: H */
    private static final Map f40597H = null;
    /* renamed from: B */
    private final String f40598B;

    static {
        f40597H = new HashMap();
        AnonymousClass3NH[] values = AnonymousClass3NH.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass3NH anonymousClass3NH = values[i];
            f40597H.put(anonymousClass3NH.f40598B, anonymousClass3NH);
            i++;
        }
    }

    private AnonymousClass3NH(String str) {
        this.f40598B = str;
    }

    /* renamed from: B */
    public static AnonymousClass3NH m19492B(String str) {
        return (AnonymousClass3NH) f40597H.get(str);
    }

    public final String toString() {
        return this.f40598B;
    }
}

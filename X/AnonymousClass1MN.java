package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1MN */
public enum AnonymousClass1MN {
    EXPLORE_ALL("explore_all"),
    HASHTAG_INSPIRED("hashtag_inspired"),
    FOLLOWED_HASHTAG("followed_hashtag"),
    YOUR_HASHTAGS("your_hashtags"),
    SHOPPING("shopping"),
    UNKNOWN("unknown");
    
    /* renamed from: J */
    private static final Map f17633J = null;
    /* renamed from: B */
    private final String f17634B;

    static {
        f17633J = new HashMap();
        AnonymousClass1MN[] values = AnonymousClass1MN.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass1MN anonymousClass1MN = values[i];
            f17633J.put(anonymousClass1MN.f17634B, anonymousClass1MN);
            i++;
        }
    }

    private AnonymousClass1MN(String str) {
        this.f17634B = str;
    }

    /* renamed from: A */
    public final String m10982A() {
        return this.f17634B;
    }

    /* renamed from: B */
    public static AnonymousClass1MN m10981B(String str) {
        AnonymousClass1MN anonymousClass1MN = (AnonymousClass1MN) f17633J.get(str);
        return anonymousClass1MN != null ? anonymousClass1MN : UNKNOWN;
    }
}

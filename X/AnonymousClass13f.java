package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.13f */
public enum AnonymousClass13f {
    FOLLOWING("following"),
    EXPLORE("explore"),
    POPULAR("popular"),
    USER("user"),
    SINGLE_MEDIA("single_media"),
    CHAINING("chaining"),
    EMPTY_PLACEHOLDER("empty_placeholder");
    
    /* renamed from: K */
    private static final Map f13757K = null;
    /* renamed from: B */
    private final String f13758B;

    static {
        f13757K = new HashMap();
        AnonymousClass13f[] values = AnonymousClass13f.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass13f anonymousClass13f = values[i];
            f13757K.put(anonymousClass13f.f13758B, anonymousClass13f);
            i++;
        }
    }

    private AnonymousClass13f(String str) {
        this.f13758B = str;
    }

    /* renamed from: B */
    public static AnonymousClass13f m9115B(String str) {
        return (AnonymousClass13f) f13757K.get(str);
    }
}

package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.49I */
public enum AnonymousClass49I {
    IN_TRAY("in_tray"),
    IN_HEADER("in_header"),
    IN_HEADER_AS_TEXT("in_header_as_text");
    
    /* renamed from: G */
    private static final Map f50885G = null;
    /* renamed from: B */
    public String f50886B;

    static {
        f50885G = new HashMap();
        AnonymousClass49I[] values = AnonymousClass49I.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass49I anonymousClass49I = values[i];
            f50885G.put(anonymousClass49I.f50886B, anonymousClass49I);
            i++;
        }
    }

    private AnonymousClass49I(String str) {
        this.f50886B = str;
    }

    /* renamed from: B */
    public static AnonymousClass49I m23424B(String str) {
        return f50885G.get(str) == null ? IN_TRAY : (AnonymousClass49I) f50885G.get(str);
    }
}

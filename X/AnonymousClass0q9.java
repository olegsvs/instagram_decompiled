package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0q9 */
public enum AnonymousClass0q9 {
    TOP_MAIN_BOTTOM_THREE_THUMBNAIL(1);
    
    /* renamed from: E */
    private static final Map f10876E = null;
    /* renamed from: B */
    private final int f10877B;

    static {
        f10876E = new HashMap();
        AnonymousClass0q9[] values = AnonymousClass0q9.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass0q9 anonymousClass0q9 = values[i];
            f10876E.put(Integer.valueOf(anonymousClass0q9.f10877B), anonymousClass0q9);
            i++;
        }
    }

    private AnonymousClass0q9(int i) {
        this.f10877B = i;
    }

    /* renamed from: A */
    public final int m7917A() {
        return this.f10877B;
    }

    /* renamed from: B */
    public static AnonymousClass0q9 m7916B(int i) {
        return (AnonymousClass0q9) f10876E.get(Integer.valueOf(i));
    }
}

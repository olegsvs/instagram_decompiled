package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3dX */
public enum AnonymousClass3dX {
    f42901E(r1, "All Posts"),
    f42903G(r1, "Wish List"),
    f42902F(r1, "Media");
    
    /* renamed from: H */
    private static final Map f42904H = null;
    /* renamed from: B */
    private final String f42905B;
    /* renamed from: C */
    private final String f42906C;

    static {
        f42904H = new HashMap();
        AnonymousClass3dX[] values = AnonymousClass3dX.values();
        int length = values.length;
        int i;
        while (i < length) {
            AnonymousClass3dX anonymousClass3dX = values[i];
            f42904H.put(anonymousClass3dX.f42906C, anonymousClass3dX);
            i++;
        }
    }

    private AnonymousClass3dX(String str, String str2) {
        this.f42906C = str;
        this.f42905B = str2;
    }

    /* renamed from: A */
    public final String m20255A() {
        return this.f42905B;
    }

    /* renamed from: B */
    public static AnonymousClass3dX m20254B(String str) {
        if (str == null) {
            return f42902F;
        }
        AnonymousClass3dX anonymousClass3dX = (AnonymousClass3dX) f42904H.get(str);
        if (anonymousClass3dX != null) {
            return anonymousClass3dX;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can't parse collection type ");
        stringBuilder.append(str);
        AnonymousClass0Gn.H("SavedCollectionType", stringBuilder.toString());
        return f42902F;
    }

    /* renamed from: B */
    public final String m20256B() {
        return this.f42906C;
    }
}

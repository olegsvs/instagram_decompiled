package X;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.09A */
public final class AnonymousClass09A {
    /* renamed from: B */
    private static final AnonymousClass099 f1046B = new AnonymousClass0BW();
    /* renamed from: C */
    private static final AnonymousClass099 f1047C = new AnonymousClass0BX();
    /* renamed from: D */
    private static final AnonymousClass098 f1048D = new AnonymousClass0BY();
    /* renamed from: E */
    private static final ThreadLocal f1049E = new AnonymousClass097();

    /* renamed from: B */
    public static AnonymousClass098 m576B(long j, String str) {
        return AnonymousClass09A.m578D(j, f1046B, str);
    }

    /* renamed from: C */
    public static AnonymousClass098 m577C(long j) {
        return AnonymousClass09A.m578D(j, f1047C, JsonProperty.USE_DEFAULT_NAME);
    }

    /* renamed from: D */
    private static AnonymousClass098 m578D(long j, AnonymousClass099 anonymousClass099, String str) {
        if (!AnonymousClass0CM.m897N(j)) {
            return f1048D;
        }
        AnonymousClass0BZ anonymousClass0BZ = (AnonymousClass0BZ) f1049E.get();
        anonymousClass0BZ.f1385D = j;
        anonymousClass0BZ.f1383B = anonymousClass099;
        StringBuilder stringBuilder = anonymousClass0BZ.f1384C;
        stringBuilder.delete(0, stringBuilder.length());
        anonymousClass0BZ.f1384C.append(str);
        anonymousClass0BZ.f1386E = '|';
        return anonymousClass0BZ;
    }
}

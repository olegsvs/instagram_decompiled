package X;

import java.util.Map;
import java.util.Map.Entry;

/* renamed from: X.16A */
public final class AnonymousClass16A {
    /* renamed from: B */
    public static AnonymousClass0db m9378B(AnonymousClass1ug anonymousClass1ug) {
        AnonymousClass0db C = AnonymousClass0db.m6067C();
        synchronized (anonymousClass1ug) {
            Map map = anonymousClass1ug.f24041B;
        }
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                C.m6074G(str, (String) null);
            } else if (value instanceof String) {
                C.m6074G(str, (String) value);
            } else if (value instanceof Long) {
                C.m6071D(str, ((Long) value).longValue());
            } else if (value instanceof Integer) {
                C.m6070C(str, ((Integer) value).intValue());
            } else if (value instanceof Double) {
                C.m6069B(str, ((Double) value).doubleValue());
            } else if (value instanceof Boolean) {
                C.m6076I(str, ((Boolean) value).booleanValue());
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown value type: ");
                stringBuilder.append(value.getClass());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return C;
    }
}

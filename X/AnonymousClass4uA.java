package X;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: X.4uA */
public final class AnonymousClass4uA {
    /* renamed from: B */
    public String f58336B;
    /* renamed from: C */
    public final Map f58337C;

    public AnonymousClass4uA(String str) {
        this(str, null);
    }

    public AnonymousClass4uA(String str, Map map) {
        this.f58336B = str;
        Map hashMap = new HashMap();
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                boolean z;
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    if (str2.equalsIgnoreCase("false")) {
                        z = false;
                        hashMap.put(entry.getKey(), Boolean.valueOf(z));
                    }
                }
                z = true;
                hashMap.put(entry.getKey(), Boolean.valueOf(z));
            }
        }
        this.f58337C = new AnonymousClass1t6(hashMap);
    }
}

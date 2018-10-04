package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: X.1bb */
public final class AnonymousClass1bb {
    /* renamed from: B */
    public String f20488B;
    /* renamed from: C */
    public long f20489C;
    /* renamed from: D */
    public boolean f20490D;
    /* renamed from: E */
    public String f20491E;
    /* renamed from: F */
    public String f20492F;
    /* renamed from: G */
    public List f20493G;
    /* renamed from: H */
    public String f20494H;

    public AnonymousClass1bb(String str, String str2, boolean z, String str3, Map map, String str4) {
        this.f20489C = RealtimeSinceBootClock.get().now();
        this.f20492F = str;
        this.f20491E = str2;
        this.f20490D = z;
        this.f20488B = str3;
        if (map != null) {
            this.f20493G = new ArrayList();
            for (Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    this.f20493G.add(entry.getKey());
                    this.f20493G.add(entry.getValue());
                }
            }
        }
        this.f20494H = str4;
    }
}

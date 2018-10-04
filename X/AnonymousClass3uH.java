package X;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.3uH */
public final class AnonymousClass3uH implements AnonymousClass2s0 {
    /* renamed from: B */
    private final Map f46406B = new HashMap();

    /* renamed from: A */
    public final void m21348A(UUID uuid, AnonymousClass2rz anonymousClass2rz) {
        if (AnonymousClass2u6.f35518F < 26 && AnonymousClass2s1.f35176B.equals(uuid) && ("video/mp4".equals(anonymousClass2rz.f35175C) || "audio/mp4".equals(anonymousClass2rz.f35175C))) {
            anonymousClass2rz = new AnonymousClass2rz("cenc", anonymousClass2rz.f35174B);
        }
        this.f46406B.put(uuid, anonymousClass2rz);
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                AnonymousClass3uH anonymousClass3uH = (AnonymousClass3uH) obj;
                if (this.f46406B.size() == anonymousClass3uH.f46406B.size()) {
                    for (UUID uuid : this.f46406B.keySet()) {
                        if (!AnonymousClass2u6.m17649B(this.f46406B.get(uuid), anonymousClass3uH.f46406B.get(uuid))) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f46406B.hashCode();
    }

    public final AnonymousClass2rz zH(UUID uuid) {
        return (AnonymousClass2rz) this.f46406B.get(uuid);
    }
}

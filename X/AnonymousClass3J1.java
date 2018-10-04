package X;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: X.3J1 */
public final class AnonymousClass3J1 {
    /* renamed from: B */
    public final String f39984B = UUID.randomUUID().toString();
    /* renamed from: C */
    public final List f39985C = new ArrayList();

    /* renamed from: A */
    public final int m19325A(AnonymousClass3J2 anonymousClass3J2) {
        for (int i = 0; i < this.f39985C.size(); i++) {
            if (((AnonymousClass3J0) this.f39985C.get(i)).f39982D == anonymousClass3J2) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: B */
    public final String m19326B(AnonymousClass3J2 anonymousClass3J2) {
        for (int i = 0; i < this.f39985C.size(); i++) {
            if (((AnonymousClass3J0) this.f39985C.get(i)).f39982D == anonymousClass3J2) {
                return ((AnonymousClass3J0) this.f39985C.get(i)).f39981C;
            }
        }
        return null;
    }
}

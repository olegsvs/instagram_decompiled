package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3PC */
public final class AnonymousClass3PC {
    /* renamed from: B */
    public final List f40829B = new ArrayList();

    /* renamed from: A */
    public final boolean m19544A() {
        return this.f40829B.isEmpty() ^ 1;
    }

    /* renamed from: B */
    public final boolean m19545B(AnonymousClass0Ci anonymousClass0Ci) {
        for (Object next : this.f40829B) {
            if ((next instanceof AnonymousClass0Ci) && anonymousClass0Ci.getId().equals(((AnonymousClass0Ci) next).getId())) {
                return true;
            }
        }
        return false;
    }
}

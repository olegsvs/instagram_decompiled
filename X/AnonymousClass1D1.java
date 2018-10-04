package X;

import java.util.List;

/* renamed from: X.1D1 */
public final class AnonymousClass1D1 {
    /* renamed from: B */
    public String f15617B;
    /* renamed from: C */
    public String f15618C;
    /* renamed from: D */
    public List f15619D;

    /* renamed from: A */
    public final String m9963A() {
        String str = this.f15618C;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(95);
        if (indexOf != -1) {
            return this.f15618C.substring(0, indexOf);
        }
        return this.f15618C;
    }

    /* renamed from: B */
    public final String m9964B() {
        List list = this.f15619D;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return ((AnonymousClass0vq) this.f15619D.get(0)).f12151J;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof AnonymousClass1D1)) {
                return false;
            }
            AnonymousClass1D1 anonymousClass1D1 = (AnonymousClass1D1) obj;
            List list = this.f15619D;
            if (list != null) {
                z = list.equals(anonymousClass1D1.f15619D);
            } else if (anonymousClass1D1.f15619D != null) {
                z = false;
            }
        }
        return z;
    }

    public final int hashCode() {
        List list = this.f15619D;
        return list != null ? list.hashCode() : 0;
    }
}

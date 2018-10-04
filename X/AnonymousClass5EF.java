package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5EF */
public final class AnonymousClass5EF implements Iterable {
    /* renamed from: B */
    public final List f61426B = new ArrayList();

    /* renamed from: A */
    public final void m26012A(AnonymousClass1KA anonymousClass1KA, boolean z, String str) {
        anonymousClass1KA.f17159E = z ? "LOCAL" : "NETWORK";
        anonymousClass1KA.f17158D = str;
        this.f61426B.add(anonymousClass1KA);
    }

    /* renamed from: B */
    public final void m26013B(List list, boolean z, String str) {
        for (AnonymousClass1KA A : list) {
            m26012A(A, z, str);
        }
    }

    /* renamed from: C */
    public final void m26014C(List list, boolean z) {
        for (AnonymousClass1KA anonymousClass1KA : list) {
            if (!this.f61426B.contains(anonymousClass1KA)) {
                m26012A(anonymousClass1KA, z, null);
            }
        }
    }

    /* renamed from: D */
    public final void m26015D() {
        this.f61426B.clear();
    }

    /* renamed from: E */
    public final boolean m26016E(String str) {
        for (AnonymousClass1KA A : this.f61426B) {
            if (A.A().equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    public final AnonymousClass1KA m26017F(int i) {
        return (AnonymousClass1KA) this.f61426B.get(i);
    }

    /* renamed from: G */
    public final boolean m26018G() {
        return this.f61426B.isEmpty();
    }

    /* renamed from: H */
    public final boolean m26019H(String str) {
        Iterator it = this.f61426B.iterator();
        while (it.hasNext()) {
            if (((AnonymousClass1KA) it.next()).A().equals(str)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /* renamed from: I */
    public final int m26020I() {
        return this.f61426B.size();
    }

    public final Iterator iterator() {
        return this.f61426B.iterator();
    }
}

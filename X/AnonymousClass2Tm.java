package X;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: X.2Tm */
public final class AnonymousClass2Tm extends AnonymousClass22R implements Serializable {
    /* renamed from: B */
    public final Comparator f30837B;

    public AnonymousClass2Tm(Comparator comparator) {
        this.f30837B = (Comparator) AnonymousClass1Cy.G(comparator);
    }

    public final int compare(Object obj, Object obj2) {
        return this.f30837B.compare(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass2Tm)) {
            return false;
        }
        return this.f30837B.equals(((AnonymousClass2Tm) obj).f30837B);
    }

    public final int hashCode() {
        return this.f30837B.hashCode();
    }

    public final String toString() {
        return this.f30837B.toString();
    }
}

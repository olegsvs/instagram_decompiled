package X;

import java.io.Serializable;

/* renamed from: X.2U4 */
public final class AnonymousClass2U4 extends AnonymousClass22R implements Serializable {
    /* renamed from: B */
    public final AnonymousClass22R f30860B;

    public AnonymousClass2U4(AnonymousClass22R anonymousClass22R) {
        this.f30860B = (AnonymousClass22R) AnonymousClass1Cy.G(anonymousClass22R);
    }

    /* renamed from: A */
    public final AnonymousClass22R mo3174A() {
        return this.f30860B;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f30860B.compare(obj2, obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass2U4)) {
            return false;
        }
        return this.f30860B.equals(((AnonymousClass2U4) obj).f30860B);
    }

    public final int hashCode() {
        return -this.f30860B.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f30860B);
        stringBuilder.append(".reverse()");
        return stringBuilder.toString();
    }
}

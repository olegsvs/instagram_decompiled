package X;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* renamed from: X.1i2 */
public final class AnonymousClass1i2 extends AnonymousClass1hJ implements Serializable {
    /* renamed from: B */
    private final Queue f21583B;
    public final int maxSize;

    public AnonymousClass1i2(int i) {
        String str = "maxSize (%s) must >= 0";
        if ((i >= 0 ? 1 : null) != null) {
            this.f21583B = new ArrayDeque(i);
            this.maxSize = i;
            return;
        }
        throw new IllegalArgumentException(AnonymousClass1Cy.m9958M(str, Integer.valueOf(i)));
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ Object mo2694A() {
        return mo2696C();
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ Collection mo2695B() {
        return mo2696C();
    }

    /* renamed from: C */
    public final Queue mo2696C() {
        return this.f21583B;
    }

    public final boolean add(Object obj) {
        AnonymousClass1Cy.m9952G(obj);
        if (this.maxSize == 0) {
            return true;
        }
        if (size() == this.maxSize) {
            this.f21583B.remove();
        }
        this.f21583B.add(obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.maxSize) {
            return AnonymousClass1De.m10089B(this, collection.iterator());
        }
        clear();
        return AnonymousClass22M.B(this, AnonymousClass22M.C(collection, size - this.maxSize));
    }

    public final boolean contains(Object obj) {
        return mo2696C().contains(AnonymousClass1Cy.m9952G(obj));
    }

    public final boolean offer(Object obj) {
        return add(obj);
    }

    public final boolean remove(Object obj) {
        return mo2696C().remove(AnonymousClass1Cy.m9952G(obj));
    }
}

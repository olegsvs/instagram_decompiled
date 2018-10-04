package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: X.0MQ */
public final class AnonymousClass0MQ implements Queue {
    /* renamed from: B */
    private final AnonymousClass0b4 f3414B;

    public AnonymousClass0MQ(int i) {
        this.f3414B = new AnonymousClass0b4(i);
    }

    public final boolean add(Object obj) {
        this.f3414B.m5512D(obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f3414B.m5510B();
    }

    public final boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean containsAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object element() {
        if (!this.f3414B.m5515G()) {
            return this.f3414B.m5513E(0);
        }
        throw new NoSuchElementException();
    }

    public final boolean isEmpty() {
        return this.f3414B.m5515G();
    }

    public final Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    public final boolean offer(Object obj) {
        this.f3414B.m5512D(obj);
        return true;
    }

    public final Object peek() {
        return this.f3414B.m5515G() ? null : this.f3414B.m5513E(0);
    }

    public final Object poll() {
        return this.f3414B.m5515G() ? null : this.f3414B.m5511C();
    }

    public final Object remove() {
        return this.f3414B.m5511C();
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.f3414B.m5516H();
    }

    public final Object[] toArray() {
        return this.f3414B.m5509A().toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }
}

package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.0Ow */
public abstract class AnonymousClass0Ow extends AnonymousClass0Ox implements List, RandomAccess {
    /* renamed from: A */
    public final AnonymousClass0Ow mo942A() {
        return this;
    }

    /* renamed from: B */
    public int m3687B(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    /* renamed from: B */
    public static AnonymousClass0Ow mo943B(Object[] objArr, int i) {
        switch (i) {
            case 0:
                return AnonymousClass13w.f13788C;
            case 1:
                return new AnonymousClass1JU(objArr[0]);
            default:
                if (i < objArr.length) {
                    objArr = AnonymousClass13v.m9127B(objArr, i);
                }
                return new AnonymousClass13w(objArr);
        }
    }

    /* renamed from: C */
    public static AnonymousClass0Ow m3682C(Object... objArr) {
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            if (objArr[i] != null) {
                i++;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("at index ");
                stringBuilder.append(i);
                throw new NullPointerException(stringBuilder.toString());
            }
        }
        return AnonymousClass0Ow.mo943B(objArr, objArr.length);
    }

    /* renamed from: D */
    public static AnonymousClass0Ow m3683D(Collection collection) {
        if (!(collection instanceof AnonymousClass0Ox)) {
            return AnonymousClass0Ow.m3682C(collection.toArray());
        }
        AnonymousClass0Ow A = ((AnonymousClass0Ox) collection).mo942A();
        if (A.mo2098C() != null) {
            Object[] toArray = A.toArray();
            A = AnonymousClass0Ow.mo943B(toArray, toArray.length);
        }
        return A;
    }

    /* renamed from: D */
    public AnonymousClass1Dd mo944D() {
        return m3689E();
    }

    /* renamed from: E */
    public static AnonymousClass0Ow m3684E(Iterator it) {
        if (!it.hasNext()) {
            return AnonymousClass13w.f13788C;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return new AnonymousClass1jJ().m12744E(next).m12746G(it).m12747H();
        }
        return AnonymousClass0Ow.m3685F(next);
    }

    /* renamed from: E */
    public final AnonymousClass1Dg m3689E() {
        return mo2099F(0);
    }

    /* renamed from: F */
    public static AnonymousClass0Ow m3685F(Object obj) {
        return new AnonymousClass1JU(obj);
    }

    /* renamed from: F */
    public AnonymousClass1Dg mo2099F(int i) {
        return new AnonymousClass228(this, size(), i);
    }

    /* renamed from: G */
    public AnonymousClass0Ow m3691G() {
        return size() <= 1 ? this : new AnonymousClass229(this);
    }

    /* renamed from: H */
    public AnonymousClass0Ow mo2403H(int i, int i2) {
        AnonymousClass1Cy.m9955J(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        switch (i3) {
            case 0:
                return AnonymousClass13w.f13788C;
            case 1:
                return AnonymousClass0Ow.m3685F(get(i));
            default:
                return m3693I(i, i2);
        }
    }

    /* renamed from: I */
    public AnonymousClass0Ow m3693I(int i, int i2) {
        return new AnonymousClass22A(this, i, i2 - i);
    }

    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        return AnonymousClass1KZ.m10776B(this, obj);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    public int indexOf(Object obj) {
        return obj == null ? -1 : AnonymousClass1KZ.m10777C(this, obj);
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return mo944D();
    }

    public int lastIndexOf(Object obj) {
        return obj == null ? -1 : AnonymousClass1KZ.m10778D(this, obj);
    }

    public /* bridge */ /* synthetic */ ListIterator listIterator() {
        return m3689E();
    }

    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return mo2099F(i);
    }

    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return mo2403H(i, i2);
    }
}

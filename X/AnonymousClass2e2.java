package X;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: X.2e2 */
public final class AnonymousClass2e2 extends AnonymousClass2Tu implements NavigableMap {
    /* renamed from: E */
    public static final AnonymousClass2e2 f31933E = new AnonymousClass2e2(AnonymousClass2Tv.m15967B(AnonymousClass2U0.f30854B), AnonymousClass13w.f13788C);
    /* renamed from: B */
    public final transient AnonymousClass2e4 f31934B;
    /* renamed from: C */
    public final transient AnonymousClass0Ow f31935C;
    /* renamed from: D */
    private transient AnonymousClass2e2 f31936D;

    public AnonymousClass2e2(AnonymousClass2e4 anonymousClass2e4, AnonymousClass0Ow anonymousClass0Ow) {
        this(anonymousClass2e4, anonymousClass0Ow, null);
    }

    public AnonymousClass2e2(AnonymousClass2e4 anonymousClass2e4, AnonymousClass0Ow anonymousClass0Ow, AnonymousClass2e2 anonymousClass2e2) {
        this.f31934B = anonymousClass2e4;
        this.f31935C = anonymousClass0Ow;
        this.f31936D = anonymousClass2e2;
    }

    /* renamed from: A */
    public final AnonymousClass1GR mo3168A() {
        if (isEmpty()) {
            return AnonymousClass1GW.f16296E;
        }
        return new AnonymousClass2Tt(this);
    }

    /* renamed from: D */
    public static AnonymousClass2e2 m16689D(Comparator comparator) {
        if (AnonymousClass2U0.f30854B.equals(comparator)) {
            return f31933E;
        }
        return new AnonymousClass2e2(AnonymousClass2Tv.m15967B(comparator), AnonymousClass13w.f13788C);
    }

    /* renamed from: E */
    private AnonymousClass2e2 m16690E(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i == i2) {
            return AnonymousClass2e2.m16689D(comparator());
        }
        return new AnonymousClass2e2(this.f31934B.m16712Q(i, i2), this.f31935C.H(i, i2));
    }

    /* renamed from: F */
    public final boolean mo3179F() {
        if (!this.f31934B.m16703C()) {
            if (!this.f31935C.C()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    public final /* bridge */ /* synthetic */ AnonymousClass1GR mo3575H() {
        return this.f31934B;
    }

    /* renamed from: I */
    public final AnonymousClass0Ox mo3162I() {
        return this.f31935C;
    }

    /* renamed from: J */
    public final AnonymousClass2e2 m16695J() {
        AnonymousClass2e2 anonymousClass2e2 = this.f31936D;
        if (anonymousClass2e2 != null) {
            return anonymousClass2e2;
        }
        if (isEmpty()) {
            return AnonymousClass2e2.m16689D(AnonymousClass22R.m14256B(comparator()).mo3174A());
        }
        return new AnonymousClass2e2((AnonymousClass2e4) this.f31934B.mo3559I(), this.f31935C.G(), this);
    }

    /* renamed from: K */
    public final AnonymousClass2e2 m16696K(Object obj, boolean z) {
        return m16690E(0, this.f31934B.m16713R(AnonymousClass1Cy.G(obj), z));
    }

    /* renamed from: L */
    public final AnonymousClass2e2 m16697L(Object obj, boolean z, Object obj2, boolean z2) {
        AnonymousClass1Cy.G(obj);
        AnonymousClass1Cy.G(obj2);
        String str = "expected fromKey <= toKey but %s > %s";
        if ((comparator().compare(obj, obj2) <= 0 ? 1 : null) != null) {
            return m16696K(obj2, z2).m16698M(obj, z);
        }
        throw new IllegalArgumentException(AnonymousClass1Cy.M(str, new Object[]{obj, obj2}));
    }

    /* renamed from: M */
    public final AnonymousClass2e2 m16698M(Object obj, boolean z) {
        return m16690E(this.f31934B.m16714S(AnonymousClass1Cy.G(obj), z), size());
    }

    public final Entry ceilingEntry(Object obj) {
        return m16698M(obj, true).firstEntry();
    }

    public final Object ceilingKey(Object obj) {
        return AnonymousClass22P.m14255C(ceilingEntry(obj));
    }

    public final Comparator comparator() {
        return this.f31934B.comparator();
    }

    public final /* bridge */ /* synthetic */ NavigableSet descendingKeySet() {
        return this.f31934B.mo3559I();
    }

    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        return m16695J();
    }

    public final /* bridge */ /* synthetic */ Set entrySet() {
        return m14234D();
    }

    public final Entry firstEntry() {
        return isEmpty() ? null : (Entry) m14234D().A().get(0);
    }

    public final Object firstKey() {
        return this.f31934B.first();
    }

    public final Entry floorEntry(Object obj) {
        return m16696K(obj, true).lastEntry();
    }

    public final Object floorKey(Object obj) {
        return AnonymousClass22P.m14255C(floorEntry(obj));
    }

    public final Object get(Object obj) {
        int L = this.f31934B.mo3561L(obj);
        if (L == -1) {
            return null;
        }
        return this.f31935C.get(L);
    }

    public final /* bridge */ /* synthetic */ NavigableMap headMap(Object obj, boolean z) {
        return m16696K(obj, z);
    }

    public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        return m16696K(obj, false);
    }

    public final Entry higherEntry(Object obj) {
        return m16698M(obj, false).firstEntry();
    }

    public final Object higherKey(Object obj) {
        return AnonymousClass22P.m14255C(higherEntry(obj));
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        return this.f31934B;
    }

    public final Entry lastEntry() {
        return isEmpty() ? null : (Entry) m14234D().A().get(size() - 1);
    }

    public final Object lastKey() {
        return this.f31934B.last();
    }

    public final Entry lowerEntry(Object obj) {
        return m16696K(obj, false).lastEntry();
    }

    public final Object lowerKey(Object obj) {
        return AnonymousClass22P.m14255C(lowerEntry(obj));
    }

    public final /* bridge */ /* synthetic */ NavigableSet navigableKeySet() {
        return this.f31934B;
    }

    public final Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    public final Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.f31935C.size();
    }

    public final /* bridge */ /* synthetic */ NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return m16697L(obj, z, obj2, z2);
    }

    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return m16697L(obj, true, obj2, false);
    }

    public final /* bridge */ /* synthetic */ NavigableMap tailMap(Object obj, boolean z) {
        return m16698M(obj, z);
    }

    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        return m16698M(obj, true);
    }

    public final /* bridge */ /* synthetic */ Collection values() {
        return mo3162I();
    }
}

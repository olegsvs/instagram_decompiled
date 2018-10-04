package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.0lo */
public abstract class AnonymousClass0lo {
    /* renamed from: B */
    public final Map f9604B = new HashMap();
    /* renamed from: C */
    public List f9605C = Collections.unmodifiableList(new ArrayList());
    /* renamed from: D */
    private final LinkedList f9606D = new LinkedList();
    /* renamed from: E */
    private final Map f9607E = new HashMap();

    /* renamed from: L */
    public abstract String mo1796L(Object obj);

    /* renamed from: O */
    public void mo1797O(Object obj) {
    }

    /* renamed from: P */
    public void mo1798P(Object obj) {
    }

    /* renamed from: Q */
    public void mo1799Q() {
    }

    /* renamed from: A */
    public final void m7390A(Object obj) {
        AnonymousClass0lo.m7388B(this, obj, this.f9606D.size());
    }

    /* renamed from: B */
    public static void m7388B(AnonymousClass0lo anonymousClass0lo, Object obj, int i) {
        String L = anonymousClass0lo.mo1796L(obj);
        if (anonymousClass0lo.f9607E.get(L) == null) {
            anonymousClass0lo.f9607E.put(L, obj);
            anonymousClass0lo.f9606D.add(i, obj);
            anonymousClass0lo.mo1797O(obj);
        }
    }

    /* renamed from: B */
    public final void m7391B(List list) {
        for (Object A : list) {
            m7390A(A);
        }
    }

    /* renamed from: C */
    private void m7389C() {
        for (int i = 0; i < this.f9605C.size(); i++) {
            this.f9604B.put(mo1796L(this.f9605C.get(i)), Integer.valueOf(i));
        }
    }

    /* renamed from: D */
    public final void m7392D() {
        this.f9607E.clear();
        this.f9606D.clear();
        this.f9605C = Collections.unmodifiableList(new ArrayList());
        this.f9604B.clear();
        mo1799Q();
    }

    /* renamed from: E */
    public final boolean m7393E(Object obj) {
        return m7394F(mo1796L(obj));
    }

    /* renamed from: F */
    public final boolean m7394F(String str) {
        return this.f9607E.containsKey(str);
    }

    /* renamed from: G */
    public final void m7395G() {
        this.f9605C = Collections.unmodifiableList(new ArrayList(this.f9606D));
        m7389C();
    }

    /* renamed from: H */
    public final void m7396H(AnonymousClass0lr anonymousClass0lr) {
        List<Object> arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        Iterator it = this.f9606D.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (anonymousClass0lr.aTA(next)) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        for (Object R : arrayList) {
            m7406R(R);
        }
        this.f9605C = Collections.unmodifiableList(arrayList2);
        m7389C();
    }

    /* renamed from: I */
    public int mo2673I() {
        return this.f9605C.size();
    }

    /* renamed from: J */
    public final Object m7398J(int i) {
        return this.f9605C.get(i);
    }

    /* renamed from: K */
    public final int m7399K() {
        return this.f9605C.size();
    }

    /* renamed from: M */
    public final boolean m7401M() {
        return this.f9605C.isEmpty() ^ 1;
    }

    /* renamed from: N */
    public final boolean m7402N() {
        return mo2673I() == 0;
    }

    /* renamed from: R */
    public final boolean m7406R(Object obj) {
        boolean remove = this.f9606D.remove(obj);
        this.f9607E.remove(mo1796L(obj));
        if (remove) {
            mo1798P(obj);
        }
        return remove;
    }

    /* renamed from: S */
    public final boolean m7407S(String str) {
        Integer num = (Integer) this.f9604B.get(str);
        return num != null && m7406R(m7398J(num.intValue()));
    }
}

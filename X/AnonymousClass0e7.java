package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.0e7 */
public class AnonymousClass0e7 {
    /* renamed from: B */
    public final Set f7580B = new CopyOnWriteArraySet();
    /* renamed from: C */
    public boolean f7581C = true;
    /* renamed from: D */
    public final Map f7582D = new HashMap();
    /* renamed from: E */
    private final CopyOnWriteArraySet f7583E = new CopyOnWriteArraySet();
    /* renamed from: F */
    private final AnonymousClass0eO f7584F;

    public AnonymousClass0e7(AnonymousClass0eO anonymousClass0eO) {
        if (anonymousClass0eO != null) {
            this.f7584F = anonymousClass0eO;
            anonymousClass0eO.f7709B = this;
            return;
        }
        throw new IllegalArgumentException("springLooper is required");
    }

    /* renamed from: A */
    public final void m6191A(String str) {
        AnonymousClass0cN anonymousClass0cN = (AnonymousClass0cN) this.f7582D.get(str);
        if (anonymousClass0cN != null) {
            this.f7580B.add(anonymousClass0cN);
            if (this.f7581C) {
                this.f7581C = false;
                this.f7584F.mo1520A();
                return;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("springId ");
        stringBuilder.append(str);
        stringBuilder.append(" does not reference a registered spring");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: B */
    public final void m6192B(AnonymousClass1wk anonymousClass1wk) {
        if (anonymousClass1wk != null) {
            this.f7583E.add(anonymousClass1wk);
            return;
        }
        throw new IllegalArgumentException("newListener is required");
    }

    /* renamed from: C */
    public final AnonymousClass0cN m6193C() {
        AnonymousClass0cN anonymousClass0cN = new AnonymousClass0cN(this);
        if (anonymousClass0cN == null) {
            throw new IllegalArgumentException("spring is required");
        } else if (this.f7582D.containsKey(anonymousClass0cN.f7107E)) {
            throw new IllegalArgumentException("spring is already registered");
        } else {
            this.f7582D.put(anonymousClass0cN.f7107E, anonymousClass0cN);
            return anonymousClass0cN;
        }
    }

    /* renamed from: D */
    public final List m6194D() {
        List list;
        Collection values = this.f7582D.values();
        if (values instanceof List) {
            list = (List) values;
        } else {
            list = new ArrayList(values);
        }
        return Collections.unmodifiableList(list);
    }

    /* renamed from: E */
    public final void m6195E(double d) {
        Iterator it = this.f7583E.iterator();
        while (it.hasNext()) {
            ((AnonymousClass1wk) it.next()).Oe(this);
        }
        for (AnonymousClass0cN anonymousClass0cN : this.f7580B) {
            Object obj;
            if (anonymousClass0cN.m5762G()) {
                if (anonymousClass0cN.f7113K) {
                    obj = null;
                    if (obj == null) {
                        anonymousClass0cN.m5757B(d / 1000.0d);
                    } else {
                        this.f7580B.remove(anonymousClass0cN);
                    }
                }
            }
            obj = 1;
            if (obj == null) {
                this.f7580B.remove(anonymousClass0cN);
            } else {
                anonymousClass0cN.m5757B(d / 1000.0d);
            }
        }
        if (this.f7580B.isEmpty()) {
            this.f7581C = true;
        }
        it = this.f7583E.iterator();
        while (it.hasNext()) {
            ((AnonymousClass1wk) it.next()).Jd(this);
        }
        if (this.f7581C) {
            this.f7584F.mo1521B();
        }
    }

    /* renamed from: F */
    public final void m6196F() {
        this.f7583E.clear();
    }

    /* renamed from: G */
    public final void m6197G(AnonymousClass1wk anonymousClass1wk) {
        if (anonymousClass1wk != null) {
            this.f7583E.remove(anonymousClass1wk);
            return;
        }
        throw new IllegalArgumentException("listenerToRemove is required");
    }
}

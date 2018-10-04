package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.32E */
public final class AnonymousClass32E {
    /* renamed from: B */
    public boolean f37193B;
    /* renamed from: C */
    public final Set f37194C = new CopyOnWriteArraySet();
    /* renamed from: D */
    public final Set f37195D = new HashSet();
    /* renamed from: E */
    private final Map f37196E = new HashMap();
    /* renamed from: F */
    private final Set f37197F = new HashSet();
    /* renamed from: G */
    private final List f37198G = new ArrayList();

    /* renamed from: A */
    public final AnonymousClass32C m18247A() {
        AnonymousClass32C anonymousClass32C = new AnonymousClass32C();
        for (AnonymousClass0Ci anonymousClass0Ci : this.f37197F) {
            if (!this.f37195D.contains(anonymousClass0Ci)) {
                anonymousClass32C.f37191D.add(anonymousClass0Ci);
                if (this.f37196E.get(anonymousClass0Ci) == AnonymousClass31x.SEARCH) {
                    anonymousClass32C.f37189B++;
                } else if (this.f37196E.get(anonymousClass0Ci) == AnonymousClass31x.SUGGESTION) {
                    anonymousClass32C.f37190C++;
                }
            }
        }
        for (AnonymousClass0Ci anonymousClass0Ci2 : this.f37195D) {
            if (!this.f37197F.contains(anonymousClass0Ci2)) {
                anonymousClass32C.f37192E.add(anonymousClass0Ci2);
            }
        }
        return anonymousClass32C;
    }

    /* renamed from: B */
    public final List m18248B() {
        return new ArrayList(this.f37198G);
    }

    /* renamed from: B */
    private void m18246B() {
        for (WeakReference weakReference : this.f37194C) {
            AnonymousClass32D anonymousClass32D = (AnonymousClass32D) weakReference.get();
            if (anonymousClass32D == null) {
                this.f37194C.remove(weakReference);
            } else {
                anonymousClass32D.nl(this);
            }
        }
    }

    /* renamed from: C */
    public final boolean m18249C(AnonymousClass0Ci anonymousClass0Ci) {
        return this.f37197F.contains(anonymousClass0Ci);
    }

    /* renamed from: D */
    public final void m18250D(AnonymousClass32D anonymousClass32D) {
        for (WeakReference weakReference : this.f37194C) {
            AnonymousClass32D anonymousClass32D2 = (AnonymousClass32D) weakReference.get();
            if (anonymousClass32D2 == null || anonymousClass32D2 == anonymousClass32D) {
                this.f37194C.remove(weakReference);
            }
        }
    }

    /* renamed from: E */
    public final void m18251E(AnonymousClass0Ci anonymousClass0Ci, boolean z, AnonymousClass31x anonymousClass31x, int i, String str) {
        AnonymousClass32E anonymousClass32E = this;
        Set set = this.f37197F;
        AnonymousClass0Ci anonymousClass0Ci2 = anonymousClass0Ci;
        boolean contains = set.contains(anonymousClass0Ci);
        anonymousClass0Ci = z;
        if (contains && z) {
            anonymousClass32E.f37198G.remove(anonymousClass0Ci2);
            anonymousClass32E.f37198G.add(0, anonymousClass0Ci2);
        } else if (z) {
            anonymousClass32E.f37197F.add(anonymousClass0Ci2);
            anonymousClass32E.f37198G.add(0, anonymousClass0Ci2);
        } else {
            anonymousClass32E.f37197F.remove(anonymousClass0Ci2);
            anonymousClass32E.f37198G.remove(anonymousClass0Ci2);
        }
        z = anonymousClass31x;
        if (!(anonymousClass0Ci == null || anonymousClass31x == AnonymousClass31x.MEMBER)) {
            anonymousClass32E.f37196E.put(anonymousClass0Ci2, anonymousClass31x);
        }
        for (WeakReference weakReference : anonymousClass32E.f37194C) {
            AnonymousClass32D anonymousClass32D = (AnonymousClass32D) weakReference.get();
            if (anonymousClass32D == null) {
                anonymousClass32E.f37194C.remove(weakReference);
            } else {
                anonymousClass32D.tz(anonymousClass32E, anonymousClass0Ci2, anonymousClass0Ci, z, str, i);
            }
        }
        m18246B();
    }

    /* renamed from: F */
    public final void m18252F(List list) {
        this.f37195D.clear();
        this.f37197F.clear();
        this.f37195D.addAll(list);
        this.f37197F.addAll(list);
        this.f37198G.clear();
        this.f37198G.addAll(list);
        this.f37193B = true;
        m18246B();
    }
}

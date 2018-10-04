package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.5nG */
public final class AnonymousClass5nG {
    /* renamed from: B */
    public final List f69015B;
    /* renamed from: C */
    public boolean f69016C;

    public AnonymousClass5nG(List list) {
        boolean z = true;
        AnonymousClass0LH.B(list.isEmpty() ^ true);
        this.f69015B = list;
        int i = 0;
        for (AnonymousClass0MI Q : list) {
            if (Q.Q()) {
                i++;
            }
        }
        if (list.size() > 1) {
            if (i != 0) {
                z = false;
            }
            AnonymousClass0LH.H(z);
        }
    }

    /* renamed from: A */
    public final Set m28443A() {
        if (!m28449H()) {
            return new HashSet();
        }
        AnonymousClass0LH.H(m28449H());
        return AnonymousClass5nG.m28441B(this).f3388U.F();
    }

    /* renamed from: B */
    public static AnonymousClass0MI m28441B(AnonymousClass5nG anonymousClass5nG) {
        return (AnonymousClass0MI) anonymousClass5nG.f69015B.get(0);
    }

    /* renamed from: B */
    public final AnonymousClass2Fi m28444B() {
        if (m28450I()) {
            return AnonymousClass2Fi.NO_REELS;
        }
        if (m28449H()) {
            return AnonymousClass2Fi.LIVE;
        }
        return AnonymousClass5mT.m28425B(m28447F());
    }

    /* renamed from: C */
    private AnonymousClass0MI m28442C() {
        for (AnonymousClass0MI anonymousClass0MI : this.f69015B) {
            if (!anonymousClass0MI.Q() && !anonymousClass0MI.R()) {
                return anonymousClass0MI;
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: D */
    public final X.AnonymousClass0MI m28445D() {
        /*
        r2 = this;
        r1 = r2.m28447F();
        r0 = r1.f68881F;
        if (r0 == 0) goto L_0x000d;
    L_0x0008:
        r0 = X.AnonymousClass5nG.m28441B(r2);
        return r0;
    L_0x000d:
        r0 = r1.f68878C;
        if (r0 == 0) goto L_0x003c;
    L_0x0011:
        r0 = r1.f68879D;
        if (r0 != 0) goto L_0x0023;
    L_0x0015:
        r0 = r1.f68879D;
        if (r0 != 0) goto L_0x0020;
    L_0x0019:
        r0 = r1.f68880E;
        if (r0 == 0) goto L_0x001e;
    L_0x001d:
        goto L_0x0020;
    L_0x001e:
        r0 = 0;
        goto L_0x0021;
    L_0x0020:
        r0 = 1;
    L_0x0021:
        if (r0 != 0) goto L_0x003c;
    L_0x0023:
        r0 = r2.f69015B;
        r2 = r0.iterator();
    L_0x0029:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0057;
    L_0x002f:
        r1 = r2.next();
        r1 = (X.AnonymousClass0MI) r1;
        r0 = r1.R();
        if (r0 == 0) goto L_0x0029;
    L_0x003b:
        return r1;
    L_0x003c:
        r0 = r1.f68882G;
        if (r0 == 0) goto L_0x004c;
    L_0x0040:
        r0 = r2.m28449H();
        X.AnonymousClass0LH.H(r0);
        r0 = X.AnonymousClass5nG.m28441B(r2);
        return r0;
    L_0x004c:
        r0 = r2.m28442C();
        r0 = X.AnonymousClass0LH.E(r0);
        r0 = (X.AnonymousClass0MI) r0;
        return r0;
    L_0x0057:
        r1 = new java.lang.IllegalStateException;
        r0 = "Invalid Decoration";
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.5nG.D():X.0MI");
    }

    /* renamed from: E */
    public final List m28446E() {
        List arrayList = new ArrayList();
        for (AnonymousClass0MI anonymousClass0MI : this.f69015B) {
            if (!anonymousClass0MI.V()) {
                arrayList.add(anonymousClass0MI);
            }
        }
        return arrayList;
    }

    /* renamed from: F */
    public final AnonymousClass5mO m28447F() {
        AnonymousClass5mO anonymousClass5mO = new AnonymousClass5mO();
        if (m28450I()) {
            anonymousClass5mO.f68881F = true;
            return anonymousClass5mO;
        } else if (m28449H()) {
            anonymousClass5mO.f68882G = true;
            return anonymousClass5mO;
        } else {
            for (AnonymousClass0MI anonymousClass0MI : m28446E()) {
                boolean z;
                AnonymousClass0LH.H(anonymousClass0MI.V() ^ true);
                AnonymousClass0LH.H(anonymousClass0MI.Q() ^ true);
                if (anonymousClass0MI.R()) {
                    anonymousClass5mO.f68878C = true;
                    if (!anonymousClass0MI.W()) {
                        anonymousClass5mO.f68879D = true;
                    }
                }
                if (!anonymousClass0MI.W()) {
                    anonymousClass5mO.f68880E = true;
                }
                if (!anonymousClass5mO.f68877B) {
                    if (!anonymousClass0MI.I()) {
                        z = false;
                        anonymousClass5mO.f68877B = z;
                    }
                }
                z = true;
                anonymousClass5mO.f68877B = z;
            }
            return anonymousClass5mO;
        }
    }

    /* renamed from: G */
    public final AnonymousClass0MI m28448G() {
        AnonymousClass0MI C = m28442C();
        return C == null ? (AnonymousClass0MI) AnonymousClass0LH.E(AnonymousClass5nG.m28441B(this)) : C;
    }

    /* renamed from: H */
    public final boolean m28449H() {
        return this.f69015B.size() == 1 && ((AnonymousClass0MI) this.f69015B.get(0)).Q();
    }

    /* renamed from: I */
    public final boolean m28450I() {
        for (AnonymousClass0MI V : this.f69015B) {
            if (!V.V()) {
                return false;
            }
        }
        return true;
    }
}

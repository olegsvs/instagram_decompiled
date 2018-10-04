package X;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.28k */
public final class AnonymousClass28k {
    /* renamed from: B */
    public final Map f26599B = new HashMap();
    /* renamed from: C */
    public final Set f26600C = new HashSet();
    /* renamed from: D */
    public final Set f26601D = new HashSet();
    /* renamed from: E */
    public final AnonymousClass28o f26602E;
    /* renamed from: F */
    private final Set f26603F = new HashSet();
    /* renamed from: G */
    private final StringBuilder f26604G = new StringBuilder();
    /* renamed from: H */
    private final Map f26605H = new HashMap();
    /* renamed from: I */
    private final Set f26606I = new HashSet();

    public AnonymousClass28k(Context context) {
        this.f26602E = new AnonymousClass28o(context);
    }

    /* renamed from: A */
    public final void m14589A() {
        for (AnonymousClass28l B : this.f26601D) {
            this.f26602E.m14604B(B);
        }
        this.f26601D.clear();
        for (AnonymousClass2eX cleanup : this.f26606I) {
            cleanup.cleanup();
        }
        this.f26606I.clear();
        for (AnonymousClass28q cleanup2 : this.f26605H.keySet()) {
            cleanup2.cleanup();
        }
        this.f26605H.clear();
        for (AnonymousClass28l QE : this.f26603F) {
            QE.QE(this);
        }
        this.f26603F.clear();
        for (String str : this.f26600C) {
            String[] split = str.split("x");
            AnonymousClass28o anonymousClass28o = this.f26602E;
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            int intValue = ((Integer) this.f26599B.get(str)).intValue();
            List list = (List) anonymousClass28o.f26612D.get(AnonymousClass28o.m14602B(anonymousClass28o, parseInt, parseInt2));
            while (list.size() > 0) {
                parseInt2 = intValue - 1;
                if (intValue <= 0) {
                    break;
                }
                ((AnonymousClass2eX) list.remove(0)).cleanup();
                intValue = parseInt2;
            }
        }
        this.f26599B.clear();
        this.f26600C.clear();
    }

    /* renamed from: B */
    private String m14588B(int i, int i2) {
        this.f26604G.setLength(0);
        StringBuilder stringBuilder = this.f26604G;
        stringBuilder.append(i);
        stringBuilder.append("x");
        stringBuilder.append(i2);
        return this.f26604G.toString();
    }

    /* renamed from: B */
    public final void m14590B(AnonymousClass28l anonymousClass28l) {
        this.f26602E.m14604B(anonymousClass28l);
        this.f26601D.remove(anonymousClass28l);
        if (this.f26603F.contains(anonymousClass28l)) {
            anonymousClass28l.QE(this);
        }
        this.f26603F.remove(anonymousClass28l);
    }

    /* renamed from: C */
    public final boolean m14591C(AnonymousClass28l anonymousClass28l) {
        return this.f26603F.contains(anonymousClass28l);
    }

    /* renamed from: D */
    public final AnonymousClass2Vh m14592D(AnonymousClass28l anonymousClass28l, String str) {
        Set set;
        AnonymousClass28n anonymousClass28n;
        this.f26601D.add(anonymousClass28l);
        AnonymousClass28o anonymousClass28o = this.f26602E;
        if (anonymousClass28o.f26611C.containsKey(anonymousClass28l)) {
            set = (Set) anonymousClass28o.f26611C.get(anonymousClass28l);
        } else {
            set = new HashSet();
            anonymousClass28o.f26611C.put(anonymousClass28l, set);
        }
        synchronized (anonymousClass28o) {
            if (anonymousClass28o.f26613E.containsKey(str)) {
                anonymousClass28n = (AnonymousClass28n) anonymousClass28o.f26613E.get(str);
            } else {
                anonymousClass28n = new AnonymousClass28n(str, AnonymousClass28j.m14583F(anonymousClass28o.f26610B, str));
                AnonymousClass28j.m14579B("TextureManager.loadTexture");
                anonymousClass28o.f26613E.put(str, anonymousClass28n);
            }
            if (set.add(anonymousClass28n)) {
                anonymousClass28n.f26607B++;
            }
        }
        return anonymousClass28n.f26609D;
    }

    /* renamed from: E */
    public final void m14593E(AnonymousClass28l anonymousClass28l) {
        this.f26603F.add(anonymousClass28l);
    }

    /* renamed from: F */
    public final AnonymousClass2eX m14594F(int i, int i2) {
        AnonymousClass2eX A = this.f26602E.m14603A(i, i2);
        this.f26606I.add(A);
        String B = m14588B(i, i2);
        Integer num = (Integer) this.f26599B.get(B);
        if (num == null) {
            num = Integer.valueOf(0);
        }
        this.f26599B.put(B, Integer.valueOf(Math.max(num.intValue() - 1, 0)));
        return A;
    }

    /* renamed from: G */
    public final AnonymousClass2eX m14595G(int i, int i2, AnonymousClass28l anonymousClass28l) {
        AnonymousClass2eX F = m14594F(i, i2);
        if (anonymousClass28l != null) {
            this.f26606I.remove(F);
            this.f26605H.put(F, anonymousClass28l);
        }
        return F;
    }

    /* renamed from: H */
    public final void m14596H(AnonymousClass28q anonymousClass28q, AnonymousClass28l anonymousClass28l) {
        Object obj;
        AnonymousClass28o anonymousClass28o;
        AnonymousClass2eX anonymousClass2eX;
        Integer num;
        if (!this.f26606I.remove(anonymousClass28q)) {
            if (anonymousClass28l == null || !anonymousClass28l.equals(this.f26605H.get(anonymousClass28q))) {
                obj = null;
                if (obj != null) {
                    anonymousClass28o = this.f26602E;
                    anonymousClass2eX = (AnonymousClass2eX) anonymousClass28q;
                    synchronized (anonymousClass28o) {
                        ((List) anonymousClass28o.f26612D.get(AnonymousClass28o.m14602B(anonymousClass28o, anonymousClass2eX.getWidth(), anonymousClass2eX.getHeight()))).add(anonymousClass2eX);
                    }
                    String B = m14588B(anonymousClass28q.getWidth(), anonymousClass28q.getHeight());
                    num = (Integer) this.f26599B.get(B);
                    if (num == null) {
                        num = Integer.valueOf(0);
                    }
                    this.f26599B.put(B, Integer.valueOf(num.intValue() + 1));
                    this.f26600C.add(B);
                }
            }
            this.f26605H.remove(anonymousClass28q);
        }
        obj = 1;
        if (obj != null) {
            anonymousClass28o = this.f26602E;
            anonymousClass2eX = (AnonymousClass2eX) anonymousClass28q;
            synchronized (anonymousClass28o) {
                ((List) anonymousClass28o.f26612D.get(AnonymousClass28o.m14602B(anonymousClass28o, anonymousClass2eX.getWidth(), anonymousClass2eX.getHeight()))).add(anonymousClass2eX);
            }
            String B2 = m14588B(anonymousClass28q.getWidth(), anonymousClass28q.getHeight());
            num = (Integer) this.f26599B.get(B2);
            if (num == null) {
                num = Integer.valueOf(0);
            }
            this.f26599B.put(B2, Integer.valueOf(num.intValue() + 1));
            this.f26600C.add(B2);
        }
    }

    /* renamed from: I */
    public final boolean m14597I(AnonymousClass2eX anonymousClass2eX, AnonymousClass28l anonymousClass28l) {
        if (anonymousClass28l != null) {
            if (anonymousClass28l == this.f26605H.get(anonymousClass2eX)) {
                this.f26606I.add(anonymousClass2eX);
                this.f26605H.remove(anonymousClass2eX);
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public final boolean m14598J(AnonymousClass2eX anonymousClass2eX, AnonymousClass28l anonymousClass28l) {
        boolean z = false;
        if (anonymousClass28l != null) {
            AnonymousClass28l anonymousClass28l2 = (AnonymousClass28l) this.f26605H.get(anonymousClass2eX);
            if (anonymousClass28l2 == null) {
                this.f26606I.remove(anonymousClass2eX);
                this.f26605H.put(anonymousClass2eX, anonymousClass28l);
                return true;
            } else if (anonymousClass28l == anonymousClass28l2) {
                z = true;
            }
        }
        return z;
    }
}

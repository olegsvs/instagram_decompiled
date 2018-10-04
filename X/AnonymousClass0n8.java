package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0n8 */
public final class AnonymousClass0n8 extends AnonymousClass0Pn {
    /* renamed from: B */
    public String f10006B;
    /* renamed from: C */
    public List f10007C;
    /* renamed from: D */
    public String f10008D;
    /* renamed from: E */
    public Map f10009E;
    /* renamed from: F */
    public final List f10010F;
    /* renamed from: G */
    public final Map f10011G;
    /* renamed from: H */
    public HashMap f10012H;
    /* renamed from: I */
    public String f10013I;
    /* renamed from: J */
    public AnonymousClass13f f10014J;
    /* renamed from: K */
    public AnonymousClass0Ci f10015K;
    /* renamed from: L */
    public final List f10016L;
    /* renamed from: M */
    private final Map f10017M;

    public AnonymousClass0n8() {
        this.f10007C = new ArrayList();
        this.f10012H = new HashMap();
        this.f10009E = new HashMap();
        this.f10016L = new ArrayList();
        this.f10010F = new ArrayList();
        this.f10011G = new HashMap();
        this.f10017M = new HashMap();
    }

    public AnonymousClass0n8(String str, AnonymousClass13f anonymousClass13f, String str2) {
        this.f10007C = new ArrayList();
        this.f10012H = new HashMap();
        this.f10009E = new HashMap();
        this.f10016L = new ArrayList();
        this.f10010F = new ArrayList();
        this.f10011G = new HashMap();
        this.f10017M = new HashMap();
        this.f10006B = str;
        this.f10014J = anonymousClass13f;
        this.f10013I = str2;
        this.f10007C = new ArrayList();
    }

    public AnonymousClass0n8(String str, AnonymousClass13f anonymousClass13f, String str2, AnonymousClass0P7 anonymousClass0P7) {
        this(str, anonymousClass13f, str2);
        this.f10007C.add(anonymousClass0P7);
    }

    /* renamed from: B */
    public static boolean m7602B(AnonymousClass0P7 anonymousClass0P7) {
        if (anonymousClass0P7.wY()) {
            if (anonymousClass0P7.gA()) {
                return true;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id: ");
        stringBuilder.append(anonymousClass0P7.NO());
        stringBuilder.append(" type: ");
        stringBuilder.append(anonymousClass0P7.TO());
        AnonymousClass0Gn.m1881H("InvalidVideoMediaInIGTVFeed", stringBuilder.toString());
        return false;
    }

    /* renamed from: F */
    public final AnonymousClass2CT m7603F(AnonymousClass0P7 anonymousClass0P7) {
        AnonymousClass2CT anonymousClass2CT = (AnonymousClass2CT) this.f10017M.get(anonymousClass0P7.getId());
        if (anonymousClass2CT != null) {
            return anonymousClass2CT;
        }
        anonymousClass2CT = new AnonymousClass2CT(this, anonymousClass0P7);
        this.f10017M.put(anonymousClass2CT.E(), anonymousClass2CT);
        return anonymousClass2CT;
    }

    /* renamed from: G */
    public final AnonymousClass2CT m7604G(AnonymousClass0OA anonymousClass0OA) {
        AnonymousClass2CT anonymousClass2CT = (AnonymousClass2CT) this.f10017M.get(anonymousClass0OA.getId());
        if (anonymousClass2CT != null) {
            return anonymousClass2CT;
        }
        anonymousClass2CT = new AnonymousClass2CT(this, anonymousClass0OA, this.f10015K);
        this.f10017M.put(anonymousClass2CT.E(), anonymousClass2CT);
        return anonymousClass2CT;
    }

    /* renamed from: H */
    public final List m7605H() {
        List arrayList = new ArrayList();
        for (AnonymousClass0OA G : this.f10010F) {
            arrayList.add(m7604G(G));
        }
        return arrayList;
    }

    /* renamed from: I */
    public final AnonymousClass2CT m7606I(int i) {
        return (AnonymousClass2CT) m7607J().get(i);
    }

    /* renamed from: J */
    public final List m7607J() {
        List arrayList = new ArrayList();
        for (AnonymousClass0P7 F : m7608K()) {
            arrayList.add(m7603F(F));
        }
        return arrayList;
    }

    /* renamed from: K */
    public final List m7608K() {
        this.f10016L.clear();
        for (AnonymousClass0P7 anonymousClass0P7 : this.f10007C) {
            if (!AnonymousClass0nL.m7653B().m7655B(anonymousClass0P7)) {
                if (anonymousClass0P7.f4042q == 0) {
                    this.f10016L.add(anonymousClass0P7);
                }
            }
        }
        return this.f10016L;
    }

    /* renamed from: L */
    public final boolean m7609L() {
        return this.f10008D != null;
    }

    /* renamed from: M */
    public final boolean m7610M(AnonymousClass0P7 anonymousClass0P7) {
        if (!AnonymousClass0n8.m7602B(anonymousClass0P7)) {
            return false;
        }
        this.f10009E.put(anonymousClass0P7.getId(), anonymousClass0P7);
        this.f10007C.add(0, anonymousClass0P7);
        AnonymousClass0F4.f2058E.m1505B(new AnonymousClass13e(this));
        return true;
    }

    /* renamed from: N */
    public final boolean m7611N(AnonymousClass2CT anonymousClass2CT) {
        if (anonymousClass2CT.f27423K == AnonymousClass2CS.f27412D) {
            if (anonymousClass2CT.H().eB != null) {
                AnonymousClass0P7 anonymousClass0P7 = anonymousClass2CT.H().eB;
                anonymousClass2CT.f27423K = AnonymousClass2CS.f27411C;
                anonymousClass2CT.f27418F = anonymousClass0P7;
                if (anonymousClass0P7.wY()) {
                    if (anonymousClass0P7.gA()) {
                        this.f10009E.put(anonymousClass2CT.E(), anonymousClass0P7);
                        return true;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("id: ");
                stringBuilder.append(anonymousClass0P7.NO());
                stringBuilder.append(" type: ");
                stringBuilder.append(anonymousClass0P7.TO());
                AnonymousClass0Gn.m1881H("InvalidVideoMediaInIGTVFeed", stringBuilder.toString());
                return false;
            }
        }
        return false;
    }

    /* renamed from: O */
    public final AnonymousClass0n8 m7612O(AnonymousClass0n8 anonymousClass0n8, boolean z) {
        Object obj;
        if (AnonymousClass0LQ.m2954B(anonymousClass0n8.f10013I, this.f10013I)) {
            obj = null;
        } else {
            this.f10013I = anonymousClass0n8.f10013I;
            obj = 1;
        }
        if (anonymousClass0n8.f10014J != this.f10014J) {
            this.f10014J = anonymousClass0n8.f10014J;
        }
        if (!(anonymousClass0n8.f10015K == null || AnonymousClass0LQ.m2954B(anonymousClass0n8.f10015K, this.f10015K))) {
            this.f10015K = anonymousClass0n8.f10015K;
        }
        if (z) {
            this.f10009E.clear();
            this.f10007C.clear();
        }
        for (AnonymousClass0P7 anonymousClass0P7 : anonymousClass0n8.f10007C) {
            if (AnonymousClass0n8.m7602B(anonymousClass0P7)) {
                if (!this.f10009E.containsKey(anonymousClass0P7.getId())) {
                    this.f10007C.add(anonymousClass0P7);
                    this.f10009E.put(anonymousClass0P7.getId(), anonymousClass0P7);
                    obj = 1;
                }
            }
        }
        if (!AnonymousClass0LQ.m2954B(anonymousClass0n8.f10008D, this.f10008D)) {
            this.f10008D = anonymousClass0n8.f10008D;
            obj = 1;
        }
        if (obj != null) {
            AnonymousClass0F4.f2058E.m1506C(new AnonymousClass13e(this));
        }
        return this;
    }
}

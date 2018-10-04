package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: X.30Y */
public final class AnonymousClass30Y {
    /* renamed from: K */
    private static AnonymousClass30Y f36820K;
    /* renamed from: B */
    public AnonymousClass30n f36821B;
    /* renamed from: C */
    public Map f36822C = new HashMap();
    /* renamed from: D */
    public String f36823D = JsonProperty.USE_DEFAULT_NAME;
    /* renamed from: E */
    public String f36824E;
    /* renamed from: F */
    private Set f36825F = new HashSet();
    /* renamed from: G */
    private AnonymousClass30n f36826G;
    /* renamed from: H */
    private Map f36827H = new HashMap();
    /* renamed from: I */
    private String f36828I;
    /* renamed from: J */
    private SortedMap f36829J = new TreeMap();

    private AnonymousClass30Y() {
    }

    /* renamed from: A */
    public final void m18172A(AnonymousClass30X anonymousClass30X) {
        this.f36825F.add(anonymousClass30X);
    }

    /* renamed from: B */
    public static synchronized void m18168B() {
        synchronized (AnonymousClass30Y.class) {
            if (f36820K != null) {
                f36820K = null;
            }
        }
    }

    /* renamed from: B */
    public final boolean m18173B() {
        if (this.f36821B == null) {
            return true;
        }
        String D = m18175D();
        if (D == null || this.f36822C.containsKey(D)) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public final AnonymousClass30W m18174C() {
        boolean z;
        AnonymousClass30W anonymousClass30W = new AnonymousClass30W();
        for (AnonymousClass0P7 anonymousClass0P7 : this.f36822C.values()) {
            if (!this.f36827H.keySet().contains(anonymousClass0P7.getId())) {
                anonymousClass30W.f36815B.put(anonymousClass0P7.getId(), anonymousClass0P7);
            }
        }
        for (AnonymousClass0P7 anonymousClass0P72 : this.f36827H.values()) {
            if (!this.f36822C.keySet().contains(anonymousClass0P72.getId())) {
                anonymousClass30W.f36819F.put(anonymousClass0P72.getId(), anonymousClass0P72);
            }
        }
        anonymousClass30W.f36818E = this.f36823D.equals(this.f36828I) ^ true;
        if (AnonymousClass0LQ.B(this.f36821B.f36864E, this.f36826G.f36864E)) {
            if (AnonymousClass0LQ.B(this.f36821B.f36865F, this.f36826G.f36865F)) {
                z = false;
                anonymousClass30W.f36817D = z;
                anonymousClass30W.f36816C = this.f36821B.f36861B.equals(this.f36826G.f36861B) ^ true;
                return anonymousClass30W;
            }
        }
        z = true;
        anonymousClass30W.f36817D = z;
        anonymousClass30W.f36816C = this.f36821B.f36861B.equals(this.f36826G.f36861B) ^ true;
        return anonymousClass30W;
    }

    /* renamed from: C */
    public static AnonymousClass30n m18169C(AnonymousClass0MI anonymousClass0MI) {
        Rect G;
        anonymousClass0MI = anonymousClass0MI.f3390W;
        AnonymousClass1NF anonymousClass1NF = anonymousClass0MI.f17775E;
        AnonymousClass0Ls anonymousClass0Ls = new AnonymousClass0Ls();
        anonymousClass0Ls.f3295F = anonymousClass1NF.f17779C;
        anonymousClass0Ls.f3296G = anonymousClass1NF.f17780D;
        anonymousClass0Ls.f3292C = anonymousClass1NF.f17778B;
        RectF A = anonymousClass0MI.A();
        if (A != null) {
            G = AnonymousClass2Mh.m15235G(anonymousClass0Ls.f3296G, anonymousClass0Ls.f3292C, 1, 1, A);
        } else {
            G = AnonymousClass2Mh.m15230B(new Rect(0, 0, anonymousClass0Ls.f3296G, anonymousClass0Ls.f3292C));
        }
        return AnonymousClass30n.m18197B(anonymousClass0Ls, G, anonymousClass0MI.f17776F);
    }

    /* renamed from: D */
    public final String m18175D() {
        return this.f36821B.f36864E;
    }

    /* renamed from: D */
    public static List m18170D(AnonymousClass30n anonymousClass30n) {
        RectF F = AnonymousClass2Mh.m15234F(anonymousClass30n.f36861B, anonymousClass30n.f36863D.f3296G, anonymousClass30n.f36863D.f3292C, 1, 1);
        return Arrays.asList(new Float[]{Float.valueOf(F.left), Float.valueOf(F.top), Float.valueOf(F.right), Float.valueOf(F.bottom)});
    }

    /* renamed from: E */
    public static synchronized AnonymousClass30Y m18171E() {
        AnonymousClass30Y anonymousClass30Y;
        synchronized (AnonymousClass30Y.class) {
            if (f36820K == null) {
                f36820K = new AnonymousClass30Y();
            }
            anonymousClass30Y = f36820K;
        }
        return anonymousClass30Y;
    }

    /* renamed from: E */
    public final String m18176E() {
        return this.f36821B.f36863D.f3295F;
    }

    /* renamed from: F */
    public final List m18177F() {
        return new ArrayList(this.f36829J.values());
    }

    /* renamed from: G */
    public final Set m18178G() {
        return this.f36822C.keySet();
    }

    /* renamed from: H */
    public final void m18179H(AnonymousClass0MI anonymousClass0MI) {
        if (this.f36827H.isEmpty()) {
            List<AnonymousClass0Pj> F = anonymousClass0MI.F();
            List<AnonymousClass0P7> arrayList = new ArrayList();
            for (AnonymousClass0Pj anonymousClass0Pj : F) {
                if (anonymousClass0Pj.f4137I == AnonymousClass17B.MEDIA) {
                    arrayList.add(anonymousClass0Pj.f4134F);
                }
            }
            String str = anonymousClass0MI.f3391X;
            for (AnonymousClass0P7 anonymousClass0P7 : arrayList) {
                this.f36827H.put(anonymousClass0P7.getId(), anonymousClass0P7);
            }
            this.f36828I = str;
            this.f36823D = str;
            this.f36824E = anonymousClass0MI.Z() ? anonymousClass0MI.getId() : null;
            this.f36821B = AnonymousClass30Y.m18169C(anonymousClass0MI);
            this.f36826G = AnonymousClass30Y.m18169C(anonymousClass0MI);
            for (AnonymousClass0P7 anonymousClass0P72 : arrayList) {
                this.f36822C.put(anonymousClass0P72.getId(), anonymousClass0P72);
                this.f36829J.put(anonymousClass0P72.FA(), anonymousClass0P72);
            }
        }
    }

    /* renamed from: I */
    public final void m18180I(AnonymousClass30X anonymousClass30X) {
        this.f36825F.remove(anonymousClass30X);
    }

    /* renamed from: J */
    public final void m18181J(String str, String str2, AnonymousClass0Ls anonymousClass0Ls, Rect rect) {
        AnonymousClass30n B;
        if (str != null) {
            B = AnonymousClass30n.m18197B(anonymousClass0Ls, rect, str);
        } else {
            B = new AnonymousClass30n(anonymousClass0Ls, rect, null, str2);
        }
        this.f36821B = B;
    }

    /* renamed from: K */
    public final void m18182K(Context context) {
        SortedMap sortedMap = this.f36829J;
        AnonymousClass0P7 anonymousClass0P7 = (AnonymousClass0P7) sortedMap.get(sortedMap.firstKey());
        AnonymousClass0Ls y = anonymousClass0P7.y(context);
        m18181J(anonymousClass0P7.getId(), null, y, AnonymousClass2Mh.m15230B(new Rect(0, 0, y.f3296G, y.f3292C)));
    }

    /* renamed from: L */
    public final void m18183L(AnonymousClass0P7 anonymousClass0P7) {
        if (this.f36822C.containsKey(anonymousClass0P7.getId())) {
            this.f36822C.remove(anonymousClass0P7.getId());
            this.f36829J.remove(anonymousClass0P7.FA());
        } else {
            this.f36822C.put(anonymousClass0P7.getId(), anonymousClass0P7);
            this.f36829J.put(anonymousClass0P7.FA(), anonymousClass0P7);
        }
        for (AnonymousClass30X ar : this.f36825F) {
            ar.ar();
        }
    }
}

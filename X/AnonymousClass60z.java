package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ListView;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.60z */
public final class AnonymousClass60z extends AnonymousClass0Rq implements AnonymousClass5Eu {
    /* renamed from: B */
    public boolean f70912B;
    /* renamed from: C */
    public String f70913C = JsonProperty.USE_DEFAULT_NAME;
    /* renamed from: D */
    public boolean f70914D;
    /* renamed from: E */
    public final AnonymousClass5EF f70915E = new AnonymousClass5EF();
    /* renamed from: F */
    public final AnonymousClass3j2 f70916F = new AnonymousClass3j2();
    /* renamed from: G */
    public final AnonymousClass3j3 f70917G = new AnonymousClass3j3();
    /* renamed from: H */
    public boolean f70918H;
    /* renamed from: I */
    private final AnonymousClass3e5 f70919I;
    /* renamed from: J */
    private final AnonymousClass3e5 f70920J = new AnonymousClass41j();
    /* renamed from: K */
    private final Context f70921K;
    /* renamed from: L */
    private final AnonymousClass5EX f70922L;
    /* renamed from: M */
    private final AnonymousClass5EY f70923M = new AnonymousClass5EY();
    /* renamed from: N */
    private final AnonymousClass60t f70924N;
    /* renamed from: O */
    private AnonymousClass6HP f70925O;
    /* renamed from: P */
    private final AnonymousClass3iw f70926P;
    /* renamed from: Q */
    private final AnonymousClass5ED f70927Q;
    /* renamed from: R */
    private final AnonymousClass3j4 f70928R;
    /* renamed from: S */
    private final Map f70929S = new HashMap();

    public AnonymousClass60z(Context context, AnonymousClass6HP anonymousClass6HP, AnonymousClass3e5 anonymousClass3e5) {
        this.f70921K = context;
        this.f70925O = anonymousClass6HP;
        this.f70919I = anonymousClass3e5;
        this.f70926P = new AnonymousClass3iw(this.f70921K);
        this.f70922L = new AnonymousClass5EX(this.f70921K);
        this.f70924N = new AnonymousClass60t(this.f70921K, anonymousClass6HP);
        this.f70927Q = new AnonymousClass5ED(this.f70921K, anonymousClass6HP, false);
        this.f70928R = new AnonymousClass3j4(this.f70921K, anonymousClass6HP);
        D(new AnonymousClass0TB[]{this.f70926P, this.f70922L, this.f70924N, this.f70927Q, this.f70928R});
    }

    /* renamed from: B */
    public static void m28771B(AnonymousClass60z anonymousClass60z) {
        anonymousClass60z.C();
        if (!anonymousClass60z.f70912B) {
            Object obj = (anonymousClass60z.f70914D && anonymousClass60z.f70915E.m26018G()) ? 1 : null;
            if (obj != null) {
                anonymousClass60z.A(anonymousClass60z.f70921K.getString(C0164R.string.no_places_found), anonymousClass60z.f70926P);
            } else {
                anonymousClass60z.m28772C(0);
            }
        } else if (!anonymousClass60z.f70915E.m26018G() || anonymousClass60z.f70923M.m26029A()) {
            anonymousClass60z.A(null, anonymousClass60z.f70924N);
            AnonymousClass6HP anonymousClass6HP = anonymousClass60z.f70925O;
            ListView listView = anonymousClass6HP.f74075G;
            if (listView != null) {
                listView.removeCallbacks(anonymousClass6HP.f74076H);
                anonymousClass6HP.f74075G.postDelayed(anonymousClass6HP.f74076H, 100);
            }
            anonymousClass60z.m28772C(1);
        } else {
            anonymousClass60z.B(null, anonymousClass60z.f70923M, anonymousClass60z.f70922L);
        }
        if (anonymousClass60z.f70918H) {
            anonymousClass60z.B(anonymousClass60z.f70916F, anonymousClass60z.f70917G, anonymousClass60z.f70928R);
        }
        anonymousClass60z.E();
    }

    /* renamed from: C */
    private void m28772C(int i) {
        for (int i2 = 0; i2 < this.f70915E.m26020I(); i2++) {
            AnonymousClass1KG anonymousClass1KG = (AnonymousClass1KG) this.f70915E.m26017F(i2);
            AnonymousClass3du D = m28773D(anonymousClass1KG.f17167B.B());
            D.f42934B = i2 + i;
            D.f42937E = anonymousClass1KG.f17159E;
            D.f42935C = anonymousClass1KG.f17158D;
            B(anonymousClass1KG.f17167B, D, this.f70927Q);
        }
    }

    /* renamed from: D */
    private AnonymousClass3du m28773D(String str) {
        AnonymousClass3du anonymousClass3du = (AnonymousClass3du) this.f70929S.get(str);
        if (anonymousClass3du != null) {
            return anonymousClass3du;
        }
        anonymousClass3du = new AnonymousClass3du();
        this.f70929S.put(str, anonymousClass3du);
        return anonymousClass3du;
    }

    public final AnonymousClass3du ES(String str) {
        return m28773D(str);
    }

    /* renamed from: F */
    public final List m28774F() {
        List arrayList = new ArrayList();
        Iterator it = this.f70915E.iterator();
        while (it.hasNext()) {
            arrayList.add(((AnonymousClass1KG) it.next()).f17167B.A());
        }
        return arrayList;
    }

    /* renamed from: G */
    public final boolean m28775G(String str) {
        this.f70914D = false;
        boolean isEmpty = TextUtils.isEmpty(str);
        this.f70912B = isEmpty;
        if (isEmpty) {
            List arrayList;
            this.f70915E.m26015D();
            AnonymousClass5EF anonymousClass5EF = this.f70915E;
            AnonymousClass3dj anonymousClass3dj = AnonymousClass3di.f42918B;
            synchronized (anonymousClass3dj) {
                AnonymousClass3dj.B(anonymousClass3dj);
                arrayList = new ArrayList(anonymousClass3dj.f42919B.size());
                for (AnonymousClass1KG anonymousClass1KG : anonymousClass3dj.f42919B) {
                    arrayList.add(anonymousClass1KG.f17167B);
                }
            }
            anonymousClass5EF.m26013B(AnonymousClass3dt.D(arrayList), true, "RECENT");
        } else {
            List arrayList2 = new ArrayList();
            arrayList2.addAll(AnonymousClass3dt.D(AnonymousClass16L.f14521B.C(AnonymousClass1Zd.B(str))));
            List list = this.f70920J.KQ(str).f42954D;
            if (list == null) {
                AnonymousClass5EF anonymousClass5EF2 = this.f70915E;
                list = new ArrayList();
                Iterator it = anonymousClass5EF2.iterator();
                while (it.hasNext()) {
                    AnonymousClass1KG anonymousClass1KG2 = (AnonymousClass1KG) it.next();
                    if (anonymousClass1KG2.f17167B.C().toLowerCase(AnonymousClass0EH.E()).startsWith(str.toLowerCase(AnonymousClass0EH.E()))) {
                        list.add(anonymousClass1KG2);
                    }
                }
                this.f70920J.xB(str, list, null);
            }
            AnonymousClass5Eb.m26030B(r6, 3);
            for (AnonymousClass1KG anonymousClass1KG3 : r6) {
                if (!arrayList2.contains(anonymousClass1KG3)) {
                    arrayList2.add(anonymousClass1KG3);
                }
            }
            this.f70915E.m26015D();
            if (!arrayList2.isEmpty()) {
                this.f70915E.m26013B(arrayList2, true, null);
            }
        }
        if (!this.f70912B) {
            AnonymousClass3e3 KQ = this.f70919I.KQ(str);
            if (KQ.f42954D != null) {
                switch (KQ.f42956F.ordinal()) {
                    case 1:
                        this.f70915E.m26014C(KQ.f42954D, true);
                        break;
                    case 2:
                        List list2 = KQ.f42954D;
                        this.f70913C = KQ.f42955E;
                        this.f70914D = true;
                        this.f70915E.m26014C(list2, true);
                        AnonymousClass60z.m28771B(this);
                        break;
                    default:
                        break;
                }
            }
        }
        this.f70914D = true;
        boolean isLocationEnabled = AnonymousClass0JI.isLocationEnabled(this.f70921K);
        boolean isLocationPermitted = AnonymousClass0JI.isLocationPermitted(this.f70921K);
        AnonymousClass5EY anonymousClass5EY = this.f70923M;
        anonymousClass5EY.f61487B = isLocationEnabled;
        anonymousClass5EY.f61488C = isLocationPermitted;
        AnonymousClass60z.m28771B(this);
        return this.f70914D;
    }
}

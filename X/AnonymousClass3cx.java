package X;

import android.content.Context;
import android.widget.ListAdapter;
import com.facebook.C0164R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3cx */
public final class AnonymousClass3cx extends AnonymousClass0Rq implements AnonymousClass0iD, AnonymousClass1bW, AnonymousClass1fI, AnonymousClass1TP, ListAdapter, AnonymousClass0Rr, AnonymousClass0iC, AnonymousClass0Rs {
    /* renamed from: B */
    public final AnonymousClass1ex f42812B;
    /* renamed from: C */
    public final AnonymousClass3cy f42813C;
    /* renamed from: D */
    public final Map f42814D = new HashMap();
    /* renamed from: E */
    public boolean f42815E;
    /* renamed from: F */
    public final AnonymousClass0Ro f42816F;
    /* renamed from: G */
    public final AnonymousClass1Wa f42817G;
    /* renamed from: H */
    public final Map f42818H = new HashMap();
    /* renamed from: I */
    public final AnonymousClass0qL f42819I;
    /* renamed from: J */
    public final AnonymousClass3cw f42820J;
    /* renamed from: K */
    public boolean f42821K;
    /* renamed from: L */
    public final Set f42822L = new HashSet();
    /* renamed from: M */
    public AnonymousClass0nS f42823M = AnonymousClass0nS.GRID;
    /* renamed from: N */
    private boolean f42824N;
    /* renamed from: O */
    private final AnonymousClass0qL f42825O;
    /* renamed from: P */
    private boolean f42826P;
    /* renamed from: Q */
    private final AnonymousClass2Lm f42827Q;
    /* renamed from: R */
    private final AnonymousClass1ew f42828R;
    /* renamed from: S */
    private final AnonymousClass3ck f42829S;
    /* renamed from: T */
    private final AnonymousClass2Gi f42830T;

    public AnonymousClass3cx(Context context, AnonymousClass3d1 anonymousClass3d1, AnonymousClass2Gi anonymousClass2Gi, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass1ew anonymousClass1ew, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0jC anonymousClass0jC, AnonymousClass0jC anonymousClass0jC2, AnonymousClass3cu anonymousClass3cu, AnonymousClass0Ro anonymousClass0Ro, AnonymousClass1ex anonymousClass1ex) {
        this.f42830T = anonymousClass2Gi;
        this.f42828R = anonymousClass1ew;
        this.f42812B = anonymousClass1ex;
        this.f42820J = new AnonymousClass3cw(anonymousClass3cu, this.f42823M, this.f42812B);
        Context context2 = context;
        this.f42825O = new AnonymousClass0qL(context);
        this.f42829S = new AnonymousClass3ck(context);
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        this.f42817G = new AnonymousClass1Wa(context2, anonymousClass0PZ, false, true, true, true, anonymousClass0Cm2, anonymousClass0jC2);
        AnonymousClass3d1 anonymousClass3d12 = anonymousClass3d1;
        Context context3 = context2;
        boolean z = false;
        this.f42813C = new AnonymousClass3cy(context3, anonymousClass3d12, z, this, anonymousClass0jC, anonymousClass0Cm2.B(), this.f42812B, anonymousClass0PZ);
        this.f42827Q = new AnonymousClass2Lm(context2);
        AnonymousClass0qL anonymousClass0qL = new AnonymousClass0qL(context2);
        this.f42819I = anonymousClass0qL;
        anonymousClass0qL.f10915C = context2.getResources().getDimensionPixelSize(C0164R.dimen.save_collections_pivots_cta_view_height);
        this.f42816F = anonymousClass0Ro;
        D(new AnonymousClass0TB[]{this.f42825O, this.f42829S, this.f42817G, this.f42813C, this.f42827Q, this.f42819I});
    }

    /* renamed from: B */
    public static void m20216B(AnonymousClass3cx anonymousClass3cx, AnonymousClass0nS anonymousClass0nS, boolean z) {
        if (anonymousClass0nS != anonymousClass3cx.f42823M) {
            anonymousClass3cx.f42823M = anonymousClass0nS;
            AnonymousClass3cw anonymousClass3cw = anonymousClass3cx.f42820J;
            anonymousClass3cw.f42811G = anonymousClass0nS;
            if (z) {
                AnonymousClass3cu anonymousClass3cu = anonymousClass3cw.f42810F;
                AnonymousClass0nS anonymousClass0nS2 = anonymousClass3cw.f42811G;
                List<AnonymousClass3dS> list = anonymousClass3cw.f42806B;
                int i = AnonymousClass0MN.F(anonymousClass3cu.f42802B) ? 1 : 0;
                for (AnonymousClass3dS anonymousClass3dS : list) {
                    int i2;
                    boolean z2;
                    AnonymousClass0jO anonymousClass0jO = anonymousClass3cu.f42803C;
                    AnonymousClass0P7 anonymousClass0P7 = anonymousClass3dS.f42896B;
                    if (anonymousClass3dS.f42896B.wY()) {
                        i2 = i - 1;
                        if (i > 0) {
                            z2 = true;
                            anonymousClass0jO.B(anonymousClass0nS2, anonymousClass0P7, z2);
                            i = i2;
                        } else {
                            i = i2;
                        }
                    }
                    i2 = i;
                    z2 = false;
                    anonymousClass0jO.B(anonymousClass0nS2, anonymousClass0P7, z2);
                    i = i2;
                }
            }
            if (anonymousClass3cx.f42823M == AnonymousClass0nS.GRID) {
                anonymousClass3cx.f42817G.A();
                AnonymousClass0nL.B().A();
            }
            AnonymousClass3cx.m20217C(anonymousClass3cx);
        }
    }

    /* renamed from: C */
    public static void m20217C(AnonymousClass3cx anonymousClass3cx) {
        anonymousClass3cx.f42824N = true;
        anonymousClass3cx.C();
        anonymousClass3cx.f42820J.m20214D(anonymousClass3cx.f42828R);
        anonymousClass3cx.f42826P = anonymousClass3cx.f42820J.f42806B.isEmpty() ^ 1;
        if (!anonymousClass3cx.f42815E || anonymousClass3cx.f42826P) {
            anonymousClass3cx.A(null, anonymousClass3cx.f42825O);
            int i;
            if (anonymousClass3cx.f42823M == AnonymousClass0nS.FEED) {
                Iterator E = anonymousClass3cx.f42820J.m20215E();
                i = 0;
                while (E.hasNext()) {
                    AnonymousClass0P7 anonymousClass0P7 = ((AnonymousClass3dS) E.next()).f42896B;
                    AnonymousClass0m3 RO = anonymousClass3cx.RO(anonymousClass0P7);
                    RO.f9717z = i;
                    if (anonymousClass0P7.kA()) {
                        RO.N(0);
                        RO.M(0);
                    }
                    if (!RO.f9692a) {
                        anonymousClass3cx.B(anonymousClass0P7, RO, anonymousClass3cx.f42817G);
                    }
                    i++;
                }
            } else {
                if (anonymousClass3cx.f42830T == AnonymousClass2Gi.ALL_TAB) {
                    anonymousClass3cx.A(null, anonymousClass3cx.f42829S);
                }
                Iterator E2 = anonymousClass3cx.f42820J.m20215E();
                i = 0;
                while (E2.hasNext()) {
                    Object next = E2.next();
                    if (next instanceof AnonymousClass2MJ) {
                        AnonymousClass2MJ anonymousClass2MJ = (AnonymousClass2MJ) next;
                        if (!AnonymousClass3cw.m20210B(anonymousClass2MJ, anonymousClass3cx.f42812B) || !anonymousClass3cx.f42816F.QV()) {
                            AnonymousClass1Xu LO = anonymousClass3cx.LO(anonymousClass2MJ.m15207B());
                            boolean z = (anonymousClass3cx.f42816F.QV() || E2.hasNext()) ? false : true;
                            LO.B(i, z);
                            anonymousClass3cx.B(anonymousClass2MJ, LO, anonymousClass3cx.f42813C);
                        }
                    }
                    i++;
                }
                if (!(anonymousClass3cx.f42816F.QV() || !anonymousClass3cx.f42821K || anonymousClass3cx.dX())) {
                    anonymousClass3cx.A(null, anonymousClass3cx.f42819I);
                }
            }
        }
        if (!anonymousClass3cx.f42815E || anonymousClass3cx.f42816F.QV()) {
            anonymousClass3cx.A(anonymousClass3cx.f42816F, anonymousClass3cx.f42827Q);
        }
        anonymousClass3cx.E();
    }

    public final void FOA(AnonymousClass0jZ anonymousClass0jZ) {
        this.f42817G.f19557L = anonymousClass0jZ;
    }

    public final boolean FX() {
        return this.f42824N;
    }

    public final boolean LF(String str) {
        return this.f42820J.m20213C(str);
    }

    public final AnonymousClass1Xu LO(String str) {
        AnonymousClass1Xu anonymousClass1Xu = (AnonymousClass1Xu) this.f42814D.get(str);
        if (anonymousClass1Xu != null) {
            return anonymousClass1Xu;
        }
        anonymousClass1Xu = new AnonymousClass1Xu();
        this.f42814D.put(str, anonymousClass1Xu);
        return anonymousClass1Xu;
    }

    public final void OH() {
        AnonymousClass3cx.m20216B(this, AnonymousClass0nS.FEED, false);
    }

    public final AnonymousClass0m3 RO(AnonymousClass0P7 anonymousClass0P7) {
        AnonymousClass0m3 anonymousClass0m3 = (AnonymousClass0m3) this.f42818H.get(anonymousClass0P7);
        if (anonymousClass0m3 != null) {
            return anonymousClass0m3;
        }
        anonymousClass0m3 = new AnonymousClass0m3(anonymousClass0P7);
        anonymousClass0m3.f9715x = AnonymousClass0a4.SAVE_HOME;
        this.f42818H.put(anonymousClass0P7, anonymousClass0m3);
        return anonymousClass0m3;
    }

    public final void Tc() {
        this.f42824N = false;
    }

    public final void UOA(int i) {
        this.f42825O.f10915C = i;
        AnonymousClass3cx.m20217C(this);
    }

    public final void XH() {
        this.f42822L.clear();
        AnonymousClass3cx.m20216B(this, AnonymousClass0nS.GRID, true);
    }

    public final Object aM(Object obj) {
        if (dX()) {
            throw new RuntimeException("trying to get grid model during contextual feed mode");
        }
        if (obj instanceof AnonymousClass0P7) {
            for (int i = 0; i < getCount(); i++) {
                Object item = getItem(i);
                if (item instanceof AnonymousClass2MJ) {
                    AnonymousClass2MJ anonymousClass2MJ = (AnonymousClass2MJ) item;
                    for (int i2 = 0; i2 < anonymousClass2MJ.m15208C(); i2++) {
                        Object A = anonymousClass2MJ.m15206A(i2);
                        if ((A instanceof AnonymousClass3dS) && obj.equals(((AnonymousClass3dS) A).f42896B)) {
                            return anonymousClass2MJ;
                        }
                    }
                    continue;
                }
            }
        }
        return obj;
    }

    public final void cH() {
        AnonymousClass3cx.m20217C(this);
    }

    public final boolean dX() {
        return this.f42823M == AnonymousClass0nS.FEED;
    }

    public final void fNA(AnonymousClass0jx anonymousClass0jx) {
        this.f42817G.B(anonymousClass0jx);
    }

    public final boolean isEmpty() {
        return this.f42826P ^ 1;
    }

    public final void notifyDataSetChanged() {
        AnonymousClass3cx.m20217C(this);
    }
}

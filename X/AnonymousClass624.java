package X;

import android.content.Context;
import com.facebook.C0164R;
import com.instagram.model.shopping.Product;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.624 */
public final class AnonymousClass624 extends AnonymousClass0Rq implements AnonymousClass0iE, AnonymousClass0iD, AnonymousClass1bW, AnonymousClass1fI, AnonymousClass0ht, AnonymousClass0Rr, AnonymousClass0iC {
    /* renamed from: B */
    public String f71070B;
    /* renamed from: C */
    public AnonymousClass62B f71071C;
    /* renamed from: D */
    public AnonymousClass3fr f71072D;
    /* renamed from: E */
    public List f71073E;
    /* renamed from: F */
    public final AnonymousClass6Ha f71074F;
    /* renamed from: G */
    public AnonymousClass1ey f71075G;
    /* renamed from: H */
    public boolean f71076H;
    /* renamed from: I */
    public AnonymousClass62B f71077I;
    /* renamed from: J */
    public Product f71078J;
    /* renamed from: K */
    public AnonymousClass622 f71079K;
    /* renamed from: L */
    public AnonymousClass3fv f71080L;
    /* renamed from: M */
    public AnonymousClass62B f71081M;
    /* renamed from: N */
    public AnonymousClass62B f71082N;
    /* renamed from: O */
    public final AnonymousClass0Cm f71083O;
    /* renamed from: P */
    public List f71084P;
    /* renamed from: Q */
    public AnonymousClass0nS f71085Q = AnonymousClass0nS.GRID;
    /* renamed from: R */
    private AnonymousClass0qL f71086R;
    /* renamed from: S */
    private boolean f71087S;
    /* renamed from: T */
    private AnonymousClass625 f71088T;
    /* renamed from: U */
    private AnonymousClass0qL f71089U;
    /* renamed from: V */
    private AnonymousClass1XL f71090V;
    /* renamed from: W */
    private AnonymousClass0qL f71091W;
    /* renamed from: X */
    private final boolean f71092X;
    /* renamed from: Y */
    private AnonymousClass1Wa f71093Y;
    /* renamed from: Z */
    private final Map f71094Z = new HashMap();
    /* renamed from: a */
    private final Map f71095a = new HashMap();
    /* renamed from: b */
    private AnonymousClass61l f71096b;
    /* renamed from: c */
    private AnonymousClass61n f71097c;
    /* renamed from: d */
    private AnonymousClass61t f71098d;
    /* renamed from: e */
    private AnonymousClass61z f71099e;
    /* renamed from: f */
    private AnonymousClass626 f71100f;
    /* renamed from: g */
    private AnonymousClass62J f71101g;
    /* renamed from: h */
    private AnonymousClass62O f71102h;
    /* renamed from: i */
    private AnonymousClass62U f71103i;
    /* renamed from: j */
    private AnonymousClass62d f71104j;
    /* renamed from: k */
    private AnonymousClass62f f71105k;
    /* renamed from: l */
    private boolean f71106l;

    public AnonymousClass624(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass6Ha anonymousClass6Ha, boolean z, boolean z2, String str, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0gi anonymousClass0gi, AnonymousClass0jC anonymousClass0jC) {
        this.f71074F = anonymousClass6Ha;
        this.f71106l = z;
        this.f71092X = z2;
        Context context2 = context;
        this.f71101g = new AnonymousClass62J(context, anonymousClass6Ha);
        AnonymousClass0Cm anonymousClass0Cm2 = anonymousClass0Cm;
        this.f71083O = anonymousClass0Cm;
        this.f71098d = new AnonymousClass61t(context, anonymousClass6Ha);
        this.f71104j = new AnonymousClass62d(context, anonymousClass6Ha);
        this.f71102h = new AnonymousClass62O(context, anonymousClass0Cm, anonymousClass6Ha, str);
        this.f71079K = new AnonymousClass622(anonymousClass6Ha.f74116B, true);
        this.f71100f = new AnonymousClass626(anonymousClass6Ha);
        this.f71099e = new AnonymousClass61z(context, anonymousClass6Ha, AnonymousClass0ew.B(anonymousClass0Cm));
        this.f71105k = new AnonymousClass62f(context, anonymousClass6Ha, this.f71106l);
        this.f71103i = new AnonymousClass62U(context, anonymousClass6Ha);
        this.f71097c = new AnonymousClass61n(context, anonymousClass6Ha);
        AnonymousClass0qL anonymousClass0qL = new AnonymousClass0qL(context);
        this.f71091W = anonymousClass0qL;
        anonymousClass0qL.f10915C = context.getResources().getDimensionPixelSize(C0164R.dimen.shopping_viewer_margin);
        this.f71089U = new AnonymousClass0qL(context);
        AnonymousClass0qL anonymousClass0qL2 = new AnonymousClass0qL(context);
        this.f71086R = anonymousClass0qL2;
        anonymousClass0qL2.f10915C = AnonymousClass0ip.B(context);
        this.f71088T = new AnonymousClass625(context);
        this.f71096b = new AnonymousClass61l(context);
        AnonymousClass0PZ anonymousClass0PZ2 = anonymousClass0PZ;
        this.f71090V = new AnonymousClass1XL(context2, anonymousClass0gi, null, anonymousClass0jC, anonymousClass0Cm.B(), AnonymousClass1ex.f21064C, anonymousClass0PZ2);
        this.f71075G = new AnonymousClass1ey(AnonymousClass0nS.GRID, new AnonymousClass0jO(context2, anonymousClass0PZ2, anonymousClass0Cm2), AnonymousClass1ex.f21064C);
        this.f71093Y = new AnonymousClass1Wa(context2, anonymousClass0PZ2, false, false, true, true, anonymousClass0Cm2, anonymousClass0jC);
        D(new AnonymousClass0TB[]{this.f71093Y, this.f71096b, this.f71090V, this.f71101g, this.f71098d, this.f71104j, this.f71102h, this.f71079K, this.f71100f, this.f71099e, this.f71105k, this.f71103i, this.f71097c, this.f71091W, this.f71089U, this.f71086R, this.f71088T});
        AnonymousClass624.m28804B(this);
    }

    /* renamed from: B */
    public static void m28804B(AnonymousClass624 anonymousClass624) {
        anonymousClass624.C();
        anonymousClass624.f71075G.G();
        anonymousClass624.f71087S = true;
        if (anonymousClass624.f71078J != null) {
            anonymousClass624.A(null, anonymousClass624.f71089U);
            if (!anonymousClass624.f71092X) {
                anonymousClass624.A(null, anonymousClass624.f71086R);
            }
            anonymousClass624.A(anonymousClass624.f71078J.D(), anonymousClass624.f71101g);
            Product product = anonymousClass624.f71078J;
            AnonymousClass3fv anonymousClass3fv = anonymousClass624.f71080L;
            boolean z = anonymousClass624.f71076H && !((Product) AnonymousClass0LH.E(anonymousClass624.f71078J)).A() && ((Boolean) AnonymousClass0CC.Qc.H(anonymousClass624.f71083O)).booleanValue();
            anonymousClass624.A(new AnonymousClass3fu(product, anonymousClass3fv, z), anonymousClass624.f71099e);
            anonymousClass624.m28805C();
            anonymousClass624.A(anonymousClass624.f71078J, anonymousClass624.f71079K);
            Object obj = (anonymousClass624.f71072D == null || !anonymousClass624.f71078J.A()) ? null : 1;
            if (!(anonymousClass624.f71078J.f4982D == null && obj == null)) {
                anonymousClass624.A(null, anonymousClass624.f71088T);
                if (anonymousClass624.f71078J.f4982D != null) {
                    anonymousClass624.B(new AnonymousClass62B(AnonymousClass3fk.DESCRIPTION, AnonymousClass62A.PRODUCT_DESCRIPTION), Boolean.valueOf(false), anonymousClass624.f71100f);
                }
                if (obj != null) {
                    anonymousClass624.B(new AnonymousClass62B(AnonymousClass3fk.SHIPPING_AND_RETURNS, AnonymousClass62A.SHIPPING_AND_RETURNS), Boolean.valueOf(anonymousClass624.f71078J.f4982D != null), anonymousClass624.f71100f);
                }
                anonymousClass624.A(null, anonymousClass624.f71088T);
            }
            AnonymousClass62B anonymousClass62B = anonymousClass624.f71082N;
            Object obj2 = (((anonymousClass62B == null || anonymousClass62B.f71130B == null || (((AnonymousClass61s) anonymousClass624.f71082N.f71130B).f71035C.isEmpty() ^ 1) == 0) && !(anonymousClass624.f71106l && anonymousClass624.f71076H)) || !((Boolean) AnonymousClass0CC.Pd.H(anonymousClass624.f71083O)).booleanValue()) ? null : 1;
            anonymousClass62B = anonymousClass624.f71081M;
            obj = (anonymousClass62B == null || anonymousClass62B.f71130B == null || (((AnonymousClass61s) anonymousClass624.f71081M.f71130B).f71035C.isEmpty() ^ 1) == 0 || !((Boolean) AnonymousClass0CC.Qd.H(anonymousClass624.f71083O)).booleanValue()) ? null : 1;
            anonymousClass62B = anonymousClass624.f71077I;
            Object obj3 = (anonymousClass62B == null || anonymousClass62B.f71130B == null) ? null : 1;
            if (obj2 != null) {
                anonymousClass624.A(anonymousClass624.f71082N, anonymousClass624.f71105k);
            }
            anonymousClass62B = anonymousClass624.f71071C;
            if (!(anonymousClass62B == null || anonymousClass62B.f71130B == null || !((Boolean) AnonymousClass0CC.Rd.H(anonymousClass624.f71083O)).booleanValue())) {
                anonymousClass624.A(anonymousClass624.f71071C, anonymousClass624.f71102h);
                anonymousClass624.A(null, anonymousClass624.f71088T);
            }
            if (obj != null) {
                anonymousClass624.A(anonymousClass624.f71081M, anonymousClass624.f71103i);
            }
            if (obj3 != null) {
                anonymousClass624.A(anonymousClass624.f71077I, anonymousClass624.f71097c);
            }
            if (!(anonymousClass624.f71075G.N() || anonymousClass624.f71070B == null || !((Boolean) AnonymousClass0CC.Nd.H(anonymousClass624.f71083O)).booleanValue())) {
                anonymousClass624.A(anonymousClass624.f71070B, anonymousClass624.f71096b);
                int i = 0;
                while (i < anonymousClass624.f71075G.I()) {
                    AnonymousClass2MJ U = anonymousClass624.f71075G.U(i);
                    AnonymousClass1Xu LO = anonymousClass624.LO(U.B());
                    LO.B(i, i == anonymousClass624.f71075G.I() - 1);
                    anonymousClass624.B(U, LO, anonymousClass624.f71090V);
                    i++;
                }
            }
        }
        anonymousClass624.E();
    }

    /* renamed from: C */
    private void m28805C() {
        List list = this.f71084P;
        if (list == null) {
            return;
        }
        if (!list.isEmpty()) {
            AnonymousClass0LH.B(this.f71084P.size() <= 3);
            int i = 0;
            while (i < this.f71084P.size()) {
                ((AnonymousClass3g3) this.f71084P.get(i)).f43235D = i == 0;
                if ((this.f71084P.size() % 2) - i == 1) {
                    A(Arrays.asList(new AnonymousClass3g3[]{r5}), this.f71098d);
                    i++;
                } else {
                    ((AnonymousClass3g3) this.f71084P.get(i + 1)).f43235D = i == 0;
                    A(Arrays.asList(new AnonymousClass3g3[]{r5, r1}), this.f71098d);
                    i += 2;
                }
                if (i == this.f71084P.size()) {
                    A(null, this.f71091W);
                }
            }
        }
    }

    /* renamed from: D */
    private void m28806D(AnonymousClass0nS anonymousClass0nS, boolean z) {
        if (anonymousClass0nS != this.f71085Q) {
            this.f71085Q = anonymousClass0nS;
            this.f71075G.V(anonymousClass0nS, z);
            if (this.f71085Q == AnonymousClass0nS.GRID) {
                this.f71093Y.A();
                AnonymousClass0nL.B().A();
            }
            AnonymousClass624.m28804B(this);
        }
    }

    /* renamed from: F */
    public final void m28807F(Product product, boolean z) {
        this.f71078J = product;
        AnonymousClass622 anonymousClass622 = this.f71079K;
        boolean z2 = !z && this.f71078J.A();
        anonymousClass622.f71067B = z2;
        AnonymousClass624.m28804B(this);
    }

    public final void FOA(AnonymousClass0jZ anonymousClass0jZ) {
        this.f71093Y.f19557L = anonymousClass0jZ;
    }

    public final boolean FX() {
        return this.f71087S;
    }

    public final boolean JF(AnonymousClass0P7 anonymousClass0P7) {
        return this.f71075G.E(anonymousClass0P7);
    }

    public final AnonymousClass1Xu LO(String str) {
        AnonymousClass1Xu anonymousClass1Xu = (AnonymousClass1Xu) this.f71094Z.get(str);
        if (anonymousClass1Xu != null) {
            return anonymousClass1Xu;
        }
        anonymousClass1Xu = new AnonymousClass1Xu();
        this.f71094Z.put(str, anonymousClass1Xu);
        return anonymousClass1Xu;
    }

    public final void OH() {
        m28806D(AnonymousClass0nS.FEED, false);
    }

    public final AnonymousClass0m3 RO(AnonymousClass0P7 anonymousClass0P7) {
        AnonymousClass0m3 anonymousClass0m3 = (AnonymousClass0m3) this.f71095a.get(anonymousClass0P7);
        if (anonymousClass0m3 != null) {
            return anonymousClass0m3;
        }
        anonymousClass0m3 = new AnonymousClass0m3(anonymousClass0P7);
        this.f71095a.put(anonymousClass0P7, anonymousClass0m3);
        return anonymousClass0m3;
    }

    public final void Tc() {
        this.f71087S = false;
    }

    public final void UOA(int i) {
        this.f71091W.f10915C = i;
        AnonymousClass624.m28804B(this);
    }

    public final void XH() {
        m28806D(AnonymousClass0nS.GRID, true);
    }

    public final Object aM(Object obj) {
        if (dX()) {
            throw new RuntimeException("trying to get grid model during contextual feed mode");
        }
        for (int i = 0; i < getCount(); i++) {
            Object item = getItem(i);
            if (item instanceof AnonymousClass2MJ) {
                AnonymousClass2MJ anonymousClass2MJ = (AnonymousClass2MJ) item;
                for (int i2 = 0; i2 < anonymousClass2MJ.C(); i2++) {
                    if (obj.equals(anonymousClass2MJ.A(i2))) {
                        return anonymousClass2MJ;
                    }
                }
                continue;
            }
        }
        return obj;
    }

    public final void cH() {
        AnonymousClass624.m28804B(this);
    }

    public final boolean dX() {
        return this.f71085Q == AnonymousClass0nS.FEED;
    }

    public final void fNA(AnonymousClass0jx anonymousClass0jx) {
        this.f71093Y.B(anonymousClass0jx);
    }

    public final void jr() {
        AnonymousClass624.m28804B(this);
    }

    public final void notifyDataSetChanged() {
        AnonymousClass624.m28804B(this);
    }
}

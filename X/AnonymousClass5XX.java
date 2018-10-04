package X;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.C0164R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.igtv.feed.IGTVFeedTrayControllerImpl;
import com.instagram.ui.listview.StickyHeaderListView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.5XX */
public final class AnonymousClass5XX extends AnonymousClass0Ie implements AnonymousClass0Ro, AnonymousClass0hq, AnonymousClass0PZ, AnonymousClass0Pa, AnonymousClass0IS, OnScrollListener, AnonymousClass0Ii, AnonymousClass0Pb, AnonymousClass3Lk, AnonymousClass0IT, AnonymousClass0EJ, AnonymousClass1MX, AnonymousClass1MY, AnonymousClass1MZ, AnonymousClass0Pc, AnonymousClass4oK, AnonymousClass1Ma, AnonymousClass2CN {
    /* renamed from: u */
    public static final Class f65886u = AnonymousClass5XX.class;
    /* renamed from: B */
    public AnonymousClass5XL f65887B;
    /* renamed from: C */
    public long f65888C;
    /* renamed from: D */
    public AnonymousClass4nC f65889D;
    /* renamed from: E */
    public AnonymousClass1Uv f65890E;
    /* renamed from: F */
    public AnonymousClass1Ri f65891F;
    /* renamed from: G */
    public final AnonymousClass4pH f65892G = new AnonymousClass4pH();
    /* renamed from: H */
    public AnonymousClass1ex f65893H;
    /* renamed from: I */
    public boolean f65894I;
    /* renamed from: J */
    public boolean f65895J;
    /* renamed from: K */
    public AnonymousClass4pp f65896K;
    /* renamed from: L */
    public final AnonymousClass0hr f65897L = new AnonymousClass0hr(new AnonymousClass4ph(this));
    /* renamed from: M */
    public AnonymousClass1Uw f65898M;
    /* renamed from: N */
    public final Set f65899N = new HashSet();
    /* renamed from: O */
    public final AnonymousClass0om f65900O = AnonymousClass0Jd.f2931B.N(this, null);
    /* renamed from: P */
    public AnonymousClass0op f65901P = new AnonymousClass0op();
    /* renamed from: Q */
    public int f65902Q;
    /* renamed from: R */
    public AnonymousClass0iW f65903R;
    /* renamed from: S */
    public String f65904S;
    /* renamed from: T */
    public AnonymousClass0Cm f65905T;
    /* renamed from: U */
    public AnonymousClass4oM f65906U;
    /* renamed from: V */
    public boolean f65907V;
    /* renamed from: W */
    private AnonymousClass2CW f65908W;
    /* renamed from: X */
    private final AnonymousClass1MW f65909X = new AnonymousClass4pf(this);
    /* renamed from: Y */
    private int f65910Y;
    /* renamed from: Z */
    private final AnonymousClass4ns f65911Z = new AnonymousClass5XW(this);
    /* renamed from: a */
    private final AnonymousClass0F8 f65912a = new AnonymousClass4pj(this);
    /* renamed from: b */
    private AnonymousClass4pO f65913b;
    /* renamed from: c */
    private AnonymousClass4ow f65914c;
    /* renamed from: d */
    private AnonymousClass0jP f65915d;
    /* renamed from: e */
    private AnonymousClass0ng f65916e;
    /* renamed from: f */
    private final AnonymousClass0hi f65917f = new AnonymousClass0hi();
    /* renamed from: g */
    private final AnonymousClass0hi f65918g = new AnonymousClass0hi();
    /* renamed from: h */
    private boolean f65919h;
    /* renamed from: i */
    private IGTVFeedTrayControllerImpl f65920i;
    /* renamed from: j */
    private final AnonymousClass0jY f65921j = new AnonymousClass0jY();
    /* renamed from: k */
    private final AnonymousClass0gk f65922k = new AnonymousClass4pl(this);
    /* renamed from: l */
    private final AnonymousClass0F8 f65923l = new AnonymousClass4pk(this);
    /* renamed from: m */
    private final AnonymousClass0hi f65924m = new AnonymousClass0hi();
    /* renamed from: n */
    private final AnonymousClass5bn f65925n = new AnonymousClass5cg(this);
    /* renamed from: o */
    private AnonymousClass0TH f65926o;
    /* renamed from: p */
    private AnonymousClass1Mf f65927p;
    /* renamed from: q */
    private String f65928q;
    /* renamed from: r */
    private final AnonymousClass0F8 f65929r = new AnonymousClass4pi(this);
    /* renamed from: s */
    private boolean f65930s;
    /* renamed from: t */
    private AnonymousClass0gX f65931t;

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* renamed from: B */
    public static void m27392B(AnonymousClass5XX anonymousClass5XX, String str, AnonymousClass0P7 anonymousClass0P7, AnonymousClass5Po anonymousClass5Po) {
        AnonymousClass0SZ.B(anonymousClass5XX.getActivity(), anonymousClass5XX.f65905T, "900759630073733");
        if (anonymousClass0P7 != null) {
            anonymousClass5XX.f65887B.m27378K(str, anonymousClass0P7, anonymousClass5Po);
        }
    }

    /* renamed from: C */
    public static void m27393C(AnonymousClass5XX anonymousClass5XX, int i, boolean z, boolean z2, boolean z3) {
        String str;
        AnonymousClass0IL anonymousClass0IL = anonymousClass5XX;
        AnonymousClass4pH anonymousClass4pH = anonymousClass5XX.f65892G;
        anonymousClass5XX = i;
        anonymousClass4pH.m25169D(i);
        boolean z4 = z;
        z = z2;
        if (z4) {
            AnonymousClass0Pn anonymousClass0Pn;
            AnonymousClass0SA B = AnonymousClass0SA.B(anonymousClass0IL.f65905T);
            String str2 = anonymousClass0IL.f65928q;
            if (str2 != null) {
                anonymousClass0Pn = (AnonymousClass0SE) B.f4858C.remove(str2);
            } else {
                anonymousClass0Pn = (AnonymousClass0SE) B.f4857B.B();
            }
            if (anonymousClass0Pn != null) {
                anonymousClass0IL.f65916e = new AnonymousClass0ng(anonymousClass0IL.getContext(), anonymousClass0IL.f65905T.f1759C, anonymousClass0IL.getLoaderManager(), anonymousClass0Pn.oO(), anonymousClass0Pn.jW());
                anonymousClass0IL.m27395E(anonymousClass5XX, z4, z, true, z3).Kr(anonymousClass0Pn);
                return;
            }
        }
        z2 = anonymousClass0IL.m27395E(anonymousClass5XX, z4, z, false, z3);
        Object obj = anonymousClass0IL.f65905T;
        String str3 = null;
        if (z4) {
            str = null;
        } else {
            str = anonymousClass0IL.f65916e.f10109E;
        }
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(obj);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        anonymousClass0Pt.f4229M = "discover/explore/";
        anonymousClass0Pt.f4228L = new AnonymousClass0R8(AnonymousClass1Rk.class);
        anonymousClass0Pt.f4219C = AnonymousClass1Dl.G(str);
        anonymousClass0Pt.f4220D = AnonymousClass0Ny.UseCache;
        AnonymousClass0RF.C(anonymousClass0Pt, obj);
        anonymousClass5XX = anonymousClass0Pt.H();
        AnonymousClass0ng anonymousClass0ng = anonymousClass0IL.f65916e;
        if (!z4) {
            str3 = anonymousClass0ng.f10109E;
        }
        anonymousClass0ng.D(AnonymousClass1Dl.C(anonymousClass0IL.f65905T, anonymousClass0IL.f65904S, false, false, anonymousClass0IL.getModuleName(), str3), anonymousClass5XX, 4500, z2);
    }

    /* renamed from: D */
    public static void m27394D(AnonymousClass5XX anonymousClass5XX, int i, boolean z) {
        if (z) {
            AnonymousClass4pE.m25156I(anonymousClass5XX, anonymousClass5XX.f65904S, null);
        }
        if (anonymousClass5XX.UX()) {
            AnonymousClass0iY.B(AnonymousClass0NN.B("action_bar_feed_retry", anonymousClass5XX), anonymousClass5XX.getContext()).R();
        }
        AnonymousClass5XX.m27393C(anonymousClass5XX, i, true, z, false);
    }

    public final void Dl(AnonymousClass5Xd anonymousClass5Xd, int i) {
        switch (anonymousClass5Xd.f65940D.ordinal()) {
            case 0:
                String str = "TOP_LIVE_REEL_ID";
                if (!this.f65899N.contains(str)) {
                    this.f65899N.add(str);
                    AnonymousClass4pE.m25155H(this, this.f65904S, "explore_home_impression", i);
                    return;
                }
                return;
            case 1:
            case 2:
                AnonymousClass0MI anonymousClass0MI = anonymousClass5Xd.f65938B;
                if (!this.f65899N.contains(anonymousClass0MI.getId())) {
                    this.f65899N.add(anonymousClass0MI.getId());
                    this.f65900O.B(anonymousClass0MI, i, this.f65901P, null);
                    AnonymousClass4pE.m25153F(this, this.f65904S, "explore_home_impression", anonymousClass0MI, i);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void Dr() {
        this.f65887B.cH();
    }

    /* renamed from: E */
    private AnonymousClass0nn m27395E(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        return new AnonymousClass4pd(this, z, z4, z3, i, z2);
    }

    /* renamed from: F */
    private void m27396F(AbsListView absListView, int i, int i2, int i3) {
        this.f65924m.onScroll(absListView, i, i2, i3);
        if (this.f65887B.f65813V == AnonymousClass0nS.FEED) {
            this.f65917f.onScroll(absListView, i, i2, i3);
            return;
        }
        this.f65918g.onScroll(absListView, i, i2, i3);
        this.f65889D.m25076B(absListView, i, i2);
    }

    public final void GJA(OnScrollListener onScrollListener) {
        this.f65924m.A(onScrollListener);
    }

    public final boolean NV() {
        return this.f65887B.f65799H;
    }

    public final void OZ() {
        AnonymousClass5XX.m27393C(this, -1, false, false, false);
    }

    public final boolean QV() {
        return this.f65916e.A();
    }

    public final boolean UX() {
        return this.f65916e.f10111G == AnonymousClass0nq.NEEDS_RETRY;
    }

    public final void Vt() {
        this.f65906U.m25124H("peek", true);
    }

    public final void Wt() {
        AnonymousClass4nC anonymousClass4nC = this.f65889D;
        if (anonymousClass4nC != null) {
            anonymousClass4nC.m25077C();
        }
    }

    public final void au(AnonymousClass0P7 anonymousClass0P7, int i) {
        Context context = getContext();
        if (isResumed() && this.f65887B.f65813V == AnonymousClass0nS.GRID && AnonymousClass0MN.F(context)) {
            i++;
            int i2 = i;
            while (i2 < this.f65887B.getCount() && i2 < i + 15) {
                AnonymousClass3Jt EU = this.f65887B.EU(i2);
                if (EU == null || anonymousClass0P7 == EU.f40104D || !EU.f40102B) {
                    i2++;
                } else {
                    AnonymousClass0vA anonymousClass0vA = new AnonymousClass0vA(EU.f40104D.OA());
                    anonymousClass0vA.f11973G = true;
                    anonymousClass0vA.f11974H = getModuleName();
                    AnonymousClass0vB.C(anonymousClass0vA, this.f65905T);
                    return;
                }
            }
        }
    }

    public final void bp() {
        AnonymousClass4nC anonymousClass4nC = this.f65889D;
        if (anonymousClass4nC != null) {
            anonymousClass4nC.m25075A();
        }
        this.f65906U.m25124H("context_switch", false);
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        AnonymousClass0eT anonymousClass0eT2 = anonymousClass0eT;
        if (!this.f65919h) {
            if (!this.f65890E.B()) {
                anonymousClass0eT.l(true);
                View i = anonymousClass0eT.i();
                i.getCompoundDrawablesRelative()[0].mutate().setAlpha(255);
                i.setHint(C0164R.string.search);
                i.clearFocus();
                i.setCursorVisible(false);
                if (AnonymousClass0RC.H(getContext())) {
                    anonymousClass0eT2.M(C0164R.layout.navbar_nametag_button, C0164R.string.nametag_description, new AnonymousClass4pc(this), true, false);
                }
                this.f65927p.A(i);
                return;
            }
        }
        anonymousClass0eT.Z(C0164R.string.explore_contextual_title);
        anonymousClass0eT.n(true);
        anonymousClass0eT.j(this);
    }

    public final void gC() {
        if (this.f65916e.B()) {
            AnonymousClass5XX.m27393C(this, AnonymousClass4pH.m25165B(this.f65892G, 16449539), false, false, false);
        }
    }

    public final String getModuleName() {
        if (this.f65887B.dX()) {
            return "feed_contextual_post";
        }
        return AnonymousClass0Ia.EXPLORE.f2779B;
    }

    public final AnonymousClass0iW iM() {
        return this.f65903R;
    }

    public final String kR() {
        return this.f65904S;
    }

    public final void lu(AnonymousClass0P7 anonymousClass0P7, int i, int i2) {
        this.f65896K.m25181A(anonymousClass0P7, i, i2, false);
    }

    public final int mK() {
        return this.f65910Y;
    }

    public final void mu(AnonymousClass0P7 anonymousClass0P7, AnonymousClass4oE anonymousClass4oE, int i, int i2) {
        this.f65896K.m25181A(anonymousClass0P7, i, i2, true);
        if (!this.f65887B.FX() && anonymousClass0P7.wY()) {
            AnonymousClass4nC anonymousClass4nC = this.f65889D;
            if (anonymousClass4nC != null) {
                anonymousClass4nC.m25078D();
            }
        }
    }

    public final void oLA() {
        AnonymousClass0ib.C(this, getListView());
        AnonymousClass5XL anonymousClass5XL = this.f65887B;
        AnonymousClass4og anonymousClass4og = anonymousClass5XL.f65805N;
        if (anonymousClass4og != null) {
            anonymousClass4og.f57583B = 0;
            AnonymousClass5XL.m27372H(anonymousClass5XL);
        }
    }

    public final void onAppBackgrounded() {
        this.f65888C = SystemClock.elapsedRealtime();
    }

    public final void onAppForegrounded() {
        Object obj = (SystemClock.elapsedRealtime() - this.f65888C < 1200000 || getListViewSafe() == null || !((RefreshableListView) getListViewSafe()).B()) ? null : 1;
        if (obj != null) {
            AnonymousClass5XX.m27394D(this, -1, false);
        }
    }

    public final boolean onBackPressed() {
        if (!(this.f65898M.onBackPressed() || this.f65890E.C())) {
            if (!this.f65913b.m25175A().I()) {
                return false;
            }
        }
        return true;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        AnonymousClass0IL anonymousClass0IL = this;
        int F = AnonymousClass0cQ.F(this, -65388470);
        int B = AnonymousClass4pH.m25165B(this.f65892G, 16449537);
        Bundle arguments = getArguments();
        this.f65928q = arguments.getString("stored_explore_response_key");
        this.f65919h = arguments.getBoolean("hide_search_bar");
        this.f65893H = AnonymousClass1ex.f21064C;
        AnonymousClass0Cm G = AnonymousClass0Ce.G(arguments);
        this.f65905T = G;
        AnonymousClass0SA B2 = AnonymousClass0SA.B(G);
        if (this.f65928q == null) {
            str = B2.f4857B.f4852E;
        } else {
            str = null;
        }
        if (str == null) {
            str = UUID.randomUUID().toString();
        }
        r0.f65904S = str;
        super.onCreate(bundle);
        AnonymousClass0cV.B(r0.f65905T).B();
        AnonymousClass4oM anonymousClass4oM = new AnonymousClass4oM(r0, new AnonymousClass4oI(new AnonymousClass4pm(r0), r0, r0.f65904S));
        r0.f65906U = anonymousClass4oM;
        anonymousClass4oM.f57534D = r0;
        r0.f65902Q = AnonymousClass0ip.B(getContext());
        r0.f65891F = new AnonymousClass1Ri(getContext(), new AnonymousClass0jO(getContext(), r0, r0.f65905T), r0, r0.f65905T);
        r0.f65913b = new AnonymousClass4pO(r0, r0, r0, r0.f65905T);
        AnonymousClass0TK anonymousClass0jC = new AnonymousClass0jC(r0, true, getContext());
        AnonymousClass0jC anonymousClass0jC2 = new AnonymousClass0jC(r0, false, getContext());
        r0.f65926o = AnonymousClass0Jv.f2949B.I(r0, r0, r0.f65905T, AnonymousClass0TD.EXPLORE, AnonymousClass0Jv.f2949B.K().CQA(new AnonymousClass4pX(r0)).DQA(new AnonymousClass4pW(r0)).HD());
        r0.f65908W = AnonymousClass2CP.f27395B.A(r0.f65905T);
        r0.f65920i = AnonymousClass2CP.f27395B.C(r0, r0, r0.f65905T, getLoaderManager(), AnonymousClass2CQ.EXPLORE_TRAY, r0.f65908W, r0);
        AnonymousClass5XU anonymousClass5XU = new AnonymousClass5XU(r0);
        Context context = getContext();
        AnonymousClass4pY anonymousClass4pY = new AnonymousClass4pY(r0);
        AnonymousClass1Ri anonymousClass1Ri = r0.f65891F;
        AnonymousClass4oM anonymousClass4oM2 = r0.f65906U;
        AnonymousClass0Cm anonymousClass0Cm = r0.f65905T;
        AnonymousClass0TH anonymousClass0TH = r0.f65926o;
        AnonymousClass5bn anonymousClass5bn = r0.f65925n;
        AnonymousClass1MW anonymousClass1MW = r0.f65909X;
        AnonymousClass4ns anonymousClass4ns = r0.f65911Z;
        AnonymousClass0lG O = AnonymousClass0Jd.f2931B.O(getActivity(), r0.f65905T);
        AnonymousClass0gk anonymousClass0gk = r0.f65922k;
        AnonymousClass4pY anonymousClass4pY2 = anonymousClass4pY;
        ListAdapter anonymousClass5XL = new AnonymousClass5XL(context, r0, r0, anonymousClass4pY2, r0, anonymousClass1Ri, anonymousClass4oM2, anonymousClass0Cm, anonymousClass0TH, anonymousClass5bn, anonymousClass1MW, anonymousClass0IL, anonymousClass4ns, O, anonymousClass0jC, anonymousClass0gk, r0.f65893H, r0.f65920i.m27446B(), anonymousClass5XU, null, null, null, null, true, false, null, null);
        r0.f65887B = anonymousClass5XL;
        setListAdapter(anonymousClass5XL);
        r0.f65898M = new AnonymousClass1Uw(getContext(), r0, getFragmentManager(), false, r0.f65905T, r0, r0, r0.f65887B, null);
        r0.f65898M.f19226I = r0;
        r0.f65916e = new AnonymousClass0ng(getContext(), r0.f65905T.f1759C, getLoaderManager());
        OnScrollListener anonymousClass0kd = new AnonymousClass0kd(AnonymousClass0ke.DOWN, 6, r0);
        r0.f65903R = new AnonymousClass0iW(getContext());
        AnonymousClass5XL anonymousClass5XL2 = r0.f65887B;
        r0.f65914c = new AnonymousClass4ow(r0, anonymousClass5XL2, new AnonymousClass4oS(r0, r0.f65904S, null), anonymousClass0jC, new HashSet());
        AnonymousClass0jS anonymousClass0jS = new AnonymousClass0jS(r0, r0.f65903R, r0.f65887B, r0.f65917f);
        boolean booleanValue = ((Boolean) AnonymousClass0CC.Wc.H(r0.f65905T)).booleanValue();
        AnonymousClass0IU fragmentManager = getFragmentManager();
        AnonymousClass5XL anonymousClass5XL3 = r0.f65887B;
        AnonymousClass5XL anonymousClass5XL4 = anonymousClass5XL3;
        AnonymousClass0iP B3 = AnonymousClass4pV.m25177B(r0, fragmentManager, r0, anonymousClass5XL4, r0, anonymousClass0jS, r0.f65905T, r0, r0.f65921j, null, anonymousClass0jC2, booleanValue ^ 1);
        AnonymousClass4oM anonymousClass4oM3 = r0.f65906U;
        anonymousClass5XL3 = r0.f65887B;
        r0.f65889D = new AnonymousClass4nC(r0, anonymousClass4oM3, anonymousClass5XL3, r0.f65921j, r0, r0.f65905T);
        AnonymousClass0lj anonymousClass0lj = new AnonymousClass0lj();
        anonymousClass0lj.L(r0.f65889D);
        anonymousClass0lj.L(r0.f65921j);
        anonymousClass0lj.L(r0.f65897L);
        anonymousClass0lj.L(B3);
        anonymousClass0lj.L(new AnonymousClass1et(getContext(), r0.f65905T, new AnonymousClass4pZ(r0)));
        AnonymousClass0TK anonymousClass0jR = new AnonymousClass0jR(r0, r0, r0.f65905T);
        anonymousClass0jR.f9166F = r0;
        anonymousClass0lj.L(anonymousClass0jR);
        anonymousClass0lj.L(r0.f65898M);
        anonymousClass0lj.L(AnonymousClass0kr.B(getActivity()));
        anonymousClass0lj.L(r0.f65913b);
        anonymousClass0lj.L(anonymousClass0jC);
        anonymousClass0lj.L(r0.f65920i);
        registerLifecycleListenerSet(anonymousClass0lj);
        AnonymousClass0TK A = AnonymousClass0jP.B(getContext(), r0.f65905T, r0).A(r0.f65887B);
        r0.f65915d = A;
        registerLifecycleListener(A);
        r0.f65924m.A(anonymousClass0kd);
        r0.f65924m.A(r0.f65903R);
        r0.f65924m.A(r0.f65921j);
        if (booleanValue) {
            r0.f65924m.A(new AnonymousClass0yA(getActivity(), r0.f65905T, r0));
        }
        r0.f65917f.A(B3);
        r0.f65918g.A(r0.f65914c);
        Context context2 = getContext();
        AnonymousClass0hi anonymousClass0hi = r0.f65924m;
        AnonymousClass0hi anonymousClass0hi2 = anonymousClass0hi;
        AnonymousClass5XL anonymousClass5XL5 = r0.f65887B;
        OnScrollListener onScrollListener = anonymousClass0kd;
        r0.f65890E = new AnonymousClass1Uv(context2, anonymousClass0hi2, anonymousClass5XL5, ((BaseFragmentActivity) getActivity()).FI(), onScrollListener, B3, r17, r0, r0.f65915d, true);
        registerLifecycleListener(r0.f65890E);
        AnonymousClass0F4.f2058E.A(AnonymousClass4oG.class, r0.f65929r).A(AnonymousClass4oH.class, r0.f65912a).A(AnonymousClass14V.class, r0.f65923l);
        r0.f65896K = new AnonymousClass4pp(r0.f65892G);
        r0.f65927p = new AnonymousClass1Mf(getContext(), getActivity(), r0.f65905T);
        r0.f65931t = AnonymousClass0gV.B(r0.f65905T);
        AnonymousClass5XX.m27393C(r0, B, true, false, true);
        AnonymousClass0cQ.G(r0, -1320582646, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1436834244);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_feed, viewGroup, false);
        AnonymousClass0cQ.G(this, -1178653587, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, -566555920);
        super.onDestroy();
        AnonymousClass4pH anonymousClass4pH = this.f65892G;
        synchronized (anonymousClass4pH.f57674B) {
            for (AnonymousClass4pG A : anonymousClass4pH.f57674B.values()) {
                A.m25164A((short) 228);
            }
            anonymousClass4pH.f57674B.clear();
        }
        unregisterLifecycleListener(this.f65920i);
        AnonymousClass0F4.f2058E.D(AnonymousClass4oG.class, this.f65929r).D(AnonymousClass4oH.class, this.f65912a).D(AnonymousClass14V.class, this.f65923l);
        AnonymousClass0cQ.G(this, 389133246, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 1239787221);
        super.onDestroyView();
        AnonymousClass0Fj.f2192B.D(this);
        this.f65917f.B(this.f65915d);
        AnonymousClass0cQ.G(this, -816058742, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -561029359);
        AnonymousClass4nC anonymousClass4nC = this.f65889D;
        if (anonymousClass4nC != null) {
            anonymousClass4nC.m25075A();
        }
        this.f65906U.m25123G();
        super.onPause();
        this.f65931t.sJA(this);
        this.f65903R.B(getListView());
        AnonymousClass0Ma anonymousClass0Ma = AnonymousClass0w8.B(this.f65905T).f12218B;
        if (anonymousClass0Ma != null) {
            anonymousClass0Ma.C();
        }
        AnonymousClass0cQ.G(this, -1118671192, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 1866034560);
        super.onResume();
        AnonymousClass0lD anonymousClass0lD = new AnonymousClass0lD(getActivity());
        this.f65903R.D((float) this.f65902Q, new AnonymousClass4pb(this, anonymousClass0lD), new View[]{AnonymousClass0eT.E(getActivity()).f7727C});
        SearchEditText searchEditText = (SearchEditText) ((BaseFragmentActivity) getActivity()).FI().f7727C.findViewById(C0164R.id.action_bar_search_edit_text);
        if (searchEditText != null) {
            this.f65927p.A(searchEditText);
        }
        if (!this.f65887B.FX()) {
            AnonymousClass4nC anonymousClass4nC = this.f65889D;
            if (anonymousClass4nC != null) {
                anonymousClass4nC.m25077C();
            }
        }
        AnonymousClass0JU.f2920B.F(this.f65905T);
        AnonymousClass0lG O = AnonymousClass0Jd.f2931B.O(getActivity(), this.f65905T);
        if (O != null && O.G() && O.f9477U == AnonymousClass0Qf.EXPLORE_FEED_ITEM_HEADER) {
            O.B();
        }
        this.f65931t.GC(this);
        AnonymousClass0V6 B = AnonymousClass0V6.B(this.f65905T);
        B.A(this);
        B.B();
        AnonymousClass0cQ.G(this, 1591652767, F);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, 1880965331);
        if (!this.f65930s && absListView.getChildCount() > 0 && this.f65887B.f65813V == AnonymousClass0nS.GRID && Math.abs(absListView.getChildAt(0).getTop()) > AnonymousClass0Nm.J(getContext()) / this.f65893H.f21066B) {
            this.f65930s = true;
            AnonymousClass4pE.m25157J(this, this.f65904S);
        }
        if (!this.f65887B.FX()) {
            m27396F(absListView, i, i2, i3);
        } else if (AnonymousClass0iI.E(absListView)) {
            this.f65887B.Tc();
            m27396F(absListView, i, i2, i3);
            if (this.f65887B.f65813V == AnonymousClass0nS.GRID) {
                AnonymousClass4nC anonymousClass4nC = this.f65889D;
                if (anonymousClass4nC != null) {
                    anonymousClass4nC.m25078D();
                }
            }
        }
        AnonymousClass0cQ.H(this, 1159734747, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, -1348361897);
        if (!this.f65887B.FX()) {
            this.f65910Y = i;
            this.f65924m.onScrollStateChanged(absListView, i);
            if (this.f65887B.f65813V == AnonymousClass0nS.FEED) {
                this.f65917f.onScrollStateChanged(absListView, i);
            } else {
                this.f65918g.onScrollStateChanged(absListView, i);
                if (i == 0) {
                    this.f65889D.f57292B.sendEmptyMessageDelayed(0, 200);
                }
            }
        }
        AnonymousClass0cQ.H(this, 263183547, I);
    }

    public final void onTokenChange() {
        AnonymousClass0Sy.F(new AnonymousClass4pe(this));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f65903R.G(getListViewSafe(), this.f65887B, this.f65902Q);
        this.f65889D.f57293C = (StickyHeaderListView) view.findViewById(C0164R.id.sticky_header_list);
        super.onViewCreated(view, bundle);
        getListView().setOnScrollListener(this);
        RefreshableListView refreshableListView = (RefreshableListView) getListViewSafe();
        refreshableListView.setupAndEnableRefresh(new AnonymousClass4pa(this));
        boolean z = false;
        refreshableListView.setDrawBorder(false);
        try {
            ((RefreshableListView) getListView()).setPullToRefreshBackgroundColor(AnonymousClass0G5.D(getContext(), C0164R.attr.defaultActionBarBackground));
        } catch (Throwable e) {
            AnonymousClass0Dc.C(f65886u, "Error reading attribute color from theme", e);
        }
        AnonymousClass0Fj.f2192B.A(this);
        if (uX() && !NV()) {
            z = true;
        }
        AnonymousClass2IF.B(z, getView());
        this.f65917f.A(this.f65915d);
        AnonymousClass4pp anonymousClass4pp = this.f65896K;
        ListView listView = getListView();
        AnonymousClass5XL anonymousClass5XL = this.f65887B;
        anonymousClass4pp.f57752C = listView;
        anonymousClass4pp.f57751B = anonymousClass5XL;
        this.f65926o.A();
    }

    public final void ov(String str, int i, List list, AnonymousClass0oo anonymousClass0oo, String str2) {
        if (isResumed()) {
            int i2 = i;
            Object YQ = this.f65887B.YQ(i);
            if (YQ instanceof AnonymousClass0MI) {
                this.f65913b.Vp((AnonymousClass0MI) YQ, i2, list, null, (RecyclerView) anonymousClass0oo.f10370B.getParent(), AnonymousClass0Qf.EXPLORE);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expected a reel in onReelItemClick but reelItem is ");
            stringBuilder.append(YQ);
            AnonymousClass0Gn.H("ExploreFragment#onReelItemClick clicked on invalid reel", stringBuilder.toString());
        }
    }

    public final void pVA(OnScrollListener onScrollListener) {
        this.f65924m.B(onScrollListener);
    }

    public final void sv(String str, int i, List list) {
        AnonymousClass0MI anonymousClass0MI = (AnonymousClass0MI) this.f65887B.YQ(i);
        AnonymousClass59c anonymousClass59c = new AnonymousClass59c(getContext(), getActivity(), getLoaderManager(), anonymousClass0MI, this.f65905T, null, new AnonymousClass5XV(this, anonymousClass0MI));
        if (anonymousClass59c.m25870A()) {
            anonymousClass59c.m25871B();
        }
    }

    public final boolean tX() {
        if (uX()) {
            return this.f65887B.f65799H;
        }
        return true;
    }

    public final boolean uX() {
        return this.f65916e.f10111G == AnonymousClass0nq.LOADING;
    }

    public final void vDA(int i) {
        if (isResumed()) {
            AnonymousClass4pE.m25155H(this, this.f65904S, "explore_home_click", i);
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(getActivity());
            anonymousClass0IZ.f2754D = AnonymousClass0Jh.f2935B.B();
            anonymousClass0IZ.B();
        }
    }

    public final void yn(String str, AnonymousClass0P7 anonymousClass0P7, RectF rectF, AnonymousClass2CW anonymousClass2CW) {
        AnonymousClass0TP anonymousClass0TP = new AnonymousClass0TP(AnonymousClass2CQ.EXPLORE_TRAY, System.currentTimeMillis());
        anonymousClass0TP.f5195I = anonymousClass0P7.getId();
        anonymousClass0TP.f5193G = str;
        anonymousClass0TP.f5190D = true;
        anonymousClass0TP.f5197K = rectF;
        AnonymousClass0TP B = anonymousClass0TP.B();
        if (((Boolean) AnonymousClass0CC.fO.H(this.f65905T)).booleanValue()) {
            anonymousClass2CW = AnonymousClass2CP.f27395B.A(this.f65905T);
            anonymousClass2CW.G(Collections.singletonList(anonymousClass2CW.A(anonymousClass0P7, getResources())));
            B.A();
        }
        B.D(getActivity(), this.f65905T, anonymousClass2CW);
    }
}

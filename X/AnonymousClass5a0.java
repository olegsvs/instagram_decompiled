package X;

import android.app.Activity;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.ui.viewpager.ScrollingOptionalViewPager;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.5a0 */
public final class AnonymousClass5a0 extends AnonymousClass5Ek implements AnonymousClass0IS, AnonymousClass0bw, AnonymousClass0IT {
    /* renamed from: S */
    public static final List f66464S = Arrays.asList(new AnonymousClass5Eq[]{AnonymousClass5Eq.ALL, AnonymousClass5Eq.USERS, AnonymousClass5Eq.TAGS, AnonymousClass5Eq.PLACES});
    /* renamed from: B */
    public int f66465B = 0;
    /* renamed from: C */
    public final Handler f66466C = new AnonymousClass5Eo(this);
    /* renamed from: D */
    public boolean f66467D;
    /* renamed from: E */
    public Location f66468E;
    /* renamed from: F */
    public final AnonymousClass5Ep f66469F = new AnonymousClass5Ep(this);
    /* renamed from: G */
    public SearchEditText f66470G;
    /* renamed from: H */
    public String f66471H = JsonProperty.USE_DEFAULT_NAME;
    /* renamed from: I */
    public boolean f66472I = true;
    /* renamed from: J */
    public AnonymousClass1LM f66473J;
    /* renamed from: K */
    private boolean f66474K = true;
    /* renamed from: L */
    private AnonymousClass1RX f66475L;
    /* renamed from: M */
    private long f66476M = 750;
    /* renamed from: N */
    private AnonymousClass3Nf f66477N;
    /* renamed from: O */
    private int f66478O = -1;
    /* renamed from: P */
    private AnonymousClass5Es f66479P;
    /* renamed from: Q */
    private AnonymousClass5Ew f66480Q;
    /* renamed from: R */
    private AnonymousClass0Cm f66481R;

    public final String getModuleName() {
        return "search";
    }

    /* renamed from: B */
    public static AnonymousClass5Eq m27653B(AnonymousClass5a0 anonymousClass5a0, int i) {
        List list = f66464S;
        if (anonymousClass5a0.f66467D) {
            i = (list.size() - 1) - i;
        }
        return (AnonymousClass5Eq) list.get(i);
    }

    /* renamed from: C */
    public static AnonymousClass5Ej m27654C(AnonymousClass5a0 anonymousClass5a0) {
        return (AnonymousClass5Ej) anonymousClass5a0.f66473J.M();
    }

    /* renamed from: D */
    public static void m27655D(AnonymousClass5a0 anonymousClass5a0) {
        AnonymousClass0JI.getInstance().removeLocationUpdates(anonymousClass5a0.f66469F);
        anonymousClass5a0.f66466C.removeMessages(0);
    }

    /* renamed from: E */
    private static int m27656E(AnonymousClass5a0 anonymousClass5a0, AnonymousClass5Eq anonymousClass5Eq) {
        int indexOf = f66464S.indexOf(anonymousClass5Eq);
        return anonymousClass5a0.f66467D ? (f66464S.size() - 1) - indexOf : indexOf;
    }

    /* renamed from: F */
    private static void m27657F(AnonymousClass5a0 anonymousClass5a0, int i) {
        if (anonymousClass5a0.f66465B != i) {
            AnonymousClass0Iz.f2854L.K((AnonymousClass5Ej) anonymousClass5a0.f66473J.K(anonymousClass5a0.f66465B), anonymousClass5a0.getFragmentManager().H(), null);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0IL aF(Object obj) {
        AnonymousClass0IL anonymousClass6FD;
        switch (AnonymousClass5Em.f61500B[((AnonymousClass5Eq) obj).ordinal()]) {
            case 1:
                AnonymousClass0JU.f2920B.E();
                anonymousClass6FD = new AnonymousClass6FD();
                break;
            case 2:
                AnonymousClass0JU.f2920B.E();
                anonymousClass6FD = new AnonymousClass5a5();
                break;
            case 3:
                AnonymousClass0JU.f2920B.E();
                anonymousClass6FD = new AnonymousClass6FB();
                break;
            case 4:
                AnonymousClass0JU.f2920B.E();
                anonymousClass6FD = new AnonymousClass6HP();
                break;
            default:
                throw new IllegalArgumentException("Invalid position");
        }
        anonymousClass6FD.setArguments(getArguments());
        return anonymousClass6FD;
    }

    /* renamed from: b */
    public final AnonymousClass1RX mo5856b() {
        return this.f66475L;
    }

    /* renamed from: c */
    public final long mo5857c() {
        long j = this.f66476M;
        this.f66476M = 0;
        return j;
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.n(true);
        anonymousClass0eT.l(false);
        SearchEditText i = anonymousClass0eT.i();
        this.f66470G = i;
        i.setSearchIconEnabled(false);
        this.f66470G.setText(this.f66471H);
        this.f66470G.setSelection(this.f66471H.length());
        this.f66470G.setHint(((AnonymousClass5Eq) this.f66473J.N()).f61510C);
        this.f66470G.setOnFilterTextListener(new AnonymousClass5En(this));
        if (this.f66472I) {
            this.f66470G.requestFocus();
            AnonymousClass0Nm.k(this.f66470G);
            this.f66472I = false;
        }
        AnonymousClass0FC.B().IJA(this.f66470G);
    }

    /* renamed from: d */
    public final AnonymousClass3Nf mo5858d() {
        return this.f66477N;
    }

    /* renamed from: e */
    public final Location mo5859e() {
        return this.f66468E;
    }

    /* renamed from: f */
    public final AnonymousClass5Es mo5860f() {
        return this.f66479P;
    }

    /* renamed from: g */
    public final AnonymousClass5Ew mo5861g() {
        return this.f66480Q;
    }

    /* renamed from: h */
    public final String mo5862h() {
        return this.f66471H;
    }

    /* renamed from: i */
    public final void mo5863i() {
        this.f66470G.B();
    }

    /* renamed from: j */
    public final void m27666j(AnonymousClass5Eq anonymousClass5Eq) {
        int E = AnonymousClass5a0.m27656E(this, anonymousClass5Eq);
        if (E != -1) {
            AnonymousClass5a0.m27657F(this, E);
            int i = this.f66478O;
            if (i != -1) {
                AnonymousClass0Iz.f2854L.F((AnonymousClass5Ej) this.f66473J.K(i), getActivity());
                this.f66478O = -1;
            }
            int i2 = this.f66465B;
            this.f66465B = E;
            SearchEditText searchEditText = this.f66470G;
            if (searchEditText != null) {
                searchEditText.setHint(AnonymousClass5a0.m27653B(this, this.f66465B).f61510C);
            }
            if (i2 != E) {
                AnonymousClass5Ej anonymousClass5Ej = (AnonymousClass5Ej) this.f66473J.L(f66464S.get(i2));
                if (anonymousClass5Ej != null && (anonymousClass5Ej instanceof AnonymousClass0IL) && ((AnonymousClass0IL) anonymousClass5Ej).isAdded()) {
                    anonymousClass5Ej.Nt();
                }
            }
            AnonymousClass5a0.m27654C(this).Jt();
            AnonymousClass0Iz anonymousClass0Iz = AnonymousClass0Iz.f2854L;
            anonymousClass0Iz.G(AnonymousClass5a0.m27654C(this));
            anonymousClass0Iz.H(AnonymousClass5a0.m27654C(this));
            this.f66478O = E;
        }
    }

    public final /* bridge */ /* synthetic */ void oCA(Object obj) {
        m27666j((AnonymousClass5Eq) obj);
    }

    public final boolean onBackPressed() {
        AnonymousClass5a0.m27654C(this).onBackPressed();
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -295264984);
        this.f66481R = AnonymousClass0Ce.G(getArguments());
        String string = getArguments().getString("composite_session_id");
        AnonymousClass0LH.E(string);
        this.f66480Q = new AnonymousClass5Ew(string, this.f66481R);
        this.f66477N = new AnonymousClass3Nf();
        super.onCreate(bundle);
        this.f66467D = AnonymousClass0e8.D(getContext());
        this.f66479P = new AnonymousClass5Es(this.f66480Q);
        this.f66475L = new AnonymousClass1RX(this.f66481R);
        AnonymousClass0cQ.G(this, 1794491649, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -366918361);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_composite_search, viewGroup, false);
        AnonymousClass0cQ.G(this, 1637088653, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, -1114222364);
        int i = this.f66478O;
        if (i != -1) {
            AnonymousClass5Ej anonymousClass5Ej = (AnonymousClass5Ej) this.f66473J.K(i);
            this.f66478O = -1;
            AnonymousClass0Iz.f2854L.F(anonymousClass5Ej, getActivity());
        }
        this.f66473J = null;
        super.onDestroy();
        AnonymousClass0cQ.G(this, -287957095, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -1711206607);
        super.onDestroyView();
        SearchEditText searchEditText = this.f66470G;
        if (searchEditText != null) {
            searchEditText.setOnFilterTextListener(null);
        }
        this.f66470G = null;
        AnonymousClass1SZ.f18800F = null;
        AnonymousClass0cQ.G(this, -1798171750, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 1992188312);
        super.onPause();
        AnonymousClass0FC.B().qVA(this.f66470G);
        this.f66470G.B();
        AnonymousClass5a0.m27655D(this);
        AnonymousClass0cQ.G(this, 2078902375, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -1132044890);
        super.onResume();
        if (this.f66479P.m26058D()) {
            AnonymousClass5Ew anonymousClass5Ew = this.f66480Q;
            AnonymousClass0Sy.C();
            anonymousClass5Ew.f61521C = AnonymousClass5Ew.m26059B(anonymousClass5Ew);
            ((AnonymousClass5Ej) this.f66473J.M()).Ez();
        }
        this.f66466C.removeMessages(0);
        this.f66466C.sendEmptyMessageDelayed(0, 5000);
        AnonymousClass0JI.getInstance().requestLocationUpdates(Z(), this.f66469F, new AnonymousClass5El(this), "CompositeSearchTabbedFragment");
        Location location = this.f66468E;
        if (location != null) {
            this.f66469F.onLocationChanged(location);
        }
        if (this.f66474K) {
            AnonymousClass5a0.m27657F(this, this.f66478O);
            AnonymousClass0Iz anonymousClass0Iz = AnonymousClass0Iz.f2854L;
            anonymousClass0Iz.G(AnonymousClass5a0.m27654C(this));
            anonymousClass0Iz.H(AnonymousClass5a0.m27654C(this));
            this.f66478O = AnonymousClass5a0.m27656E(this, (AnonymousClass5Eq) this.f66473J.N());
        } else {
            AnonymousClass5a0.m27654C(this).Jt();
        }
        this.f66474K = false;
        AnonymousClass0cQ.G(this, -724600074, F);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, 365966535);
        super.onStart();
        AnonymousClass3Nf anonymousClass3Nf = this.f66477N;
        Activity activity = getActivity();
        anonymousClass3Nf.f40664B.A(anonymousClass3Nf.f40665C);
        anonymousClass3Nf.f40664B.B(activity);
        AnonymousClass0cQ.G(this, -2008052017, F);
    }

    public final void onStop() {
        int F = AnonymousClass0cQ.F(this, 647428179);
        super.onStop();
        AnonymousClass3Nf anonymousClass3Nf = this.f66477N;
        anonymousClass3Nf.f40664B.D(anonymousClass3Nf.f40665C);
        anonymousClass3Nf.f40664B.C();
        AnonymousClass0cQ.G(this, -317267374, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        ScrollingOptionalViewPager scrollingOptionalViewPager = (ScrollingOptionalViewPager) view.findViewById(C0164R.id.tabbed_explore_pager);
        scrollingOptionalViewPager.setPadding(0, getResources().getDimensionPixelSize(C0164R.dimen.top_tabbar_height), 0, 0);
        AnonymousClass0IU childFragmentManager = getChildFragmentManager();
        FixedTabBar fixedTabBar = (FixedTabBar) view.findViewById(C0164R.id.fixed_tabbar_view);
        view = f66464S;
        this.f66473J = new AnonymousClass1LM(this, childFragmentManager, scrollingOptionalViewPager, fixedTabBar, view, true);
        if (this.f66474K) {
            String str = "composite_starting_tab_index";
            i = getArguments().containsKey(str) ? getArguments().getInt(str) : 0;
            if (r2.f66467D) {
                i = (view.size() - 1) - i;
            }
        } else {
            i = r2.f66465B;
        }
        r2.f66473J.hPA(i);
    }

    public final AnonymousClass1LP vF(Object obj) {
        AnonymousClass5Eq anonymousClass5Eq = (AnonymousClass5Eq) obj;
        switch (AnonymousClass5Em.f61500B[anonymousClass5Eq.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return new AnonymousClass1LP(anonymousClass5Eq.f61511D, -1, -1, anonymousClass5Eq.f61509B, -1, null, null);
            default:
                throw new IllegalArgumentException("Invalid tab");
        }
    }
}

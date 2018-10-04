package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.facebook.C0164R;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.List;

/* renamed from: X.4mh */
public final class AnonymousClass4mh extends AnonymousClass0Ie implements AnonymousClass0Ro, AnonymousClass0Ih, OnScrollListener, AnonymousClass0Ph, AnonymousClass0Ii, AnonymousClass0Pb, AnonymousClass3Lk, AnonymousClass3mI, AnonymousClass0IT {
    /* renamed from: B */
    public String f57206B;
    /* renamed from: C */
    public AnonymousClass4mW f57207C;
    /* renamed from: D */
    public boolean f57208D = true;
    /* renamed from: E */
    public boolean f57209E;
    /* renamed from: F */
    public boolean f57210F;
    /* renamed from: G */
    public String f57211G;
    /* renamed from: H */
    public boolean f57212H = false;
    /* renamed from: I */
    public AnonymousClass0iW f57213I;
    /* renamed from: J */
    public AnonymousClass3na f57214J = AnonymousClass3na.ExplorePeople;
    /* renamed from: K */
    public AnonymousClass0Cm f57215K;
    /* renamed from: L */
    private AnonymousClass0kd f57216L;
    /* renamed from: M */
    private AnonymousClass40X f57217M;
    /* renamed from: N */
    private String f57218N;
    /* renamed from: O */
    private AnonymousClass0iO f57219O;
    /* renamed from: P */
    private AnonymousClass1et f57220P;
    /* renamed from: Q */
    private boolean f57221Q;
    /* renamed from: R */
    private final AnonymousClass0hi f57222R = new AnonymousClass0hi();
    /* renamed from: S */
    private AnonymousClass41H f57223S;
    /* renamed from: T */
    private int f57224T;

    public final boolean UX() {
        return false;
    }

    /* renamed from: A */
    public final void m25063A(List list) {
        Bundle arguments = getArguments();
        AnonymousClass0Cm anonymousClass0Cm = this.f57215K;
        boolean z = this.f57214J == AnonymousClass3na.DiscoverPeopleStories;
        boolean equals = true ^ "newsfeed_see_all_su".equals(this.f57206B);
        String moduleName = getModuleName();
        String str = this.f57211G;
        String str2 = null;
        List stringArrayList = (!this.f57208D || arguments == null) ? null : arguments.getStringArrayList("ExplorePeopleFragment.ARGUMENT_FORCED_USERS");
        String string = (!this.f57208D || arguments == null) ? null : arguments.getString("ExplorePeopleFragment.ARGUMENT_FORCED_USER_IDS");
        List stringArrayList2 = (!this.f57208D || arguments == null) ? null : arguments.getStringArrayList("ExplorePeopleFragment.ARGUMENT_FORCED_USER_ALGORITHMS");
        if (arguments != null) {
            str2 = arguments.getString("ExplorePeopleFragment.ARGUMENT_PUSH_ID");
        }
        AnonymousClass0GA B = AnonymousClass0lv.B(anonymousClass0Cm, null, z, equals, list, moduleName, str, stringArrayList, string, stringArrayList2, str2, this.f57218N);
        B.f2849B = new AnonymousClass4mg(this);
        schedule(B);
    }

    /* renamed from: B */
    public static void m25058B(AnonymousClass4mh anonymousClass4mh) {
        if (anonymousClass4mh.getView() != null && anonymousClass4mh.getListView().getEmptyView() == null) {
            View inflate = LayoutInflater.from(anonymousClass4mh.getContext()).inflate(C0164R.layout.recommended_user_empty, (ViewGroup) anonymousClass4mh.getView(), false);
            anonymousClass4mh.getListView().setEmptyView(inflate);
            ((ViewGroup) anonymousClass4mh.getView()).addView(inflate);
        }
    }

    /* renamed from: C */
    public static AnonymousClass0IL m25059C(Bundle bundle) {
        AnonymousClass0IL anonymousClass4mh = new AnonymousClass4mh();
        if (!bundle.containsKey("ExplorePeopleFragment.ARGUMENT_TYPE")) {
            bundle.putString("ExplorePeopleFragment.ARGUMENT_TYPE", AnonymousClass3na.DiscoverPeople.A());
        }
        if (!bundle.containsKey("ExplorePeopleFragment.ARGUMENT_NO_SCROLLABLE_NAVIGATION_HELPER")) {
            bundle.putBoolean("ExplorePeopleFragment.ARGUMENT_NO_SCROLLABLE_NAVIGATION_HELPER", true);
        }
        String str = "IgSessionManager.USER_ID";
        bundle.putString(str, bundle.getString(str));
        anonymousClass4mh.setArguments(bundle);
        return anonymousClass4mh;
    }

    /* renamed from: D */
    public static void m25060D(AnonymousClass4mh anonymousClass4mh, AnonymousClass0ly anonymousClass0ly) {
        if (anonymousClass0ly != null && !anonymousClass0ly.G()) {
            List<AnonymousClass0mW> list = anonymousClass0ly.f9631I;
            for (AnonymousClass0mW anonymousClass0mW : list) {
                AnonymousClass0Gs.f2431j.E(anonymousClass0mW.f9808G.DQ(), anonymousClass4mh.getModuleName());
            }
            if (!list.isEmpty()) {
                AnonymousClass0GA B = AnonymousClass3lQ.B(anonymousClass4mh.f57215K, list);
                B.f2849B = new AnonymousClass4mc(anonymousClass4mh);
                anonymousClass4mh.schedule(B);
            }
        }
    }

    /* renamed from: E */
    public static void m25061E(AnonymousClass4mh anonymousClass4mh, int i) {
        if (anonymousClass4mh.getRootActivity() instanceof AnonymousClass0Hj) {
            ((AnonymousClass0Hj) anonymousClass4mh.getRootActivity()).CSA(i);
        }
    }

    /* renamed from: F */
    private AnonymousClass40X m25062F() {
        AnonymousClass0Ie anonymousClass0Ie = this;
        if (this.f57217M == null) {
            anonymousClass0Ie.f57217M = new AnonymousClass5X9(anonymousClass0Ie, anonymousClass0Ie, anonymousClass0Ie, this.f57215K, AnonymousClass2Na.EXPLORE_PEOPLE);
        }
        return anonymousClass0Ie.f57217M;
    }

    public final void Jt() {
        setUserVisibleHint(true);
    }

    public final boolean NV() {
        return this.f57207C.isEmpty() ^ 1;
    }

    public final void OZ() {
        m25063A(null);
    }

    public final void Ol() {
        if (getParentFragment() != null && (getParentFragment() instanceof AnonymousClass4mV)) {
            ((AnonymousClass4mV) getParentFragment()).f57158C.A(AnonymousClass0mR.FOLLOW_PEOPLE);
        } else if (this.f57219O.A(AnonymousClass0mR.FOLLOW_PEOPLE)) {
            AnonymousClass0rF.B(this.f57207C, 19023471);
        }
    }

    public final boolean QV() {
        return this.f57211G != null && this.f57210F;
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        AnonymousClass0Ok B;
        if (getArguments() != null) {
            String str = "ExplorePeopleFragment.ARGUMENT_FRAGMENT_TITLE";
            if (getArguments().containsKey(str)) {
                anonymousClass0eT.a(getArguments().getString(str));
                B = AnonymousClass1PJ.B(getActivity());
                if (B != null) {
                    if (((Boolean) AnonymousClass0CC.nd.G()).booleanValue()) {
                        anonymousClass0eT.e(C0164R.string.people_suggestions, new AnonymousClass4me(this, B));
                    } else {
                        anonymousClass0eT.E(getString(C0164R.string.next), new AnonymousClass4md(this, B));
                    }
                    anonymousClass0eT.n(false);
                } else if (this.f57221Q) {
                    anonymousClass0eT.n(true);
                } else {
                    anonymousClass0eT.n(false);
                    anonymousClass0eT.Q(getString(C0164R.string.done), new AnonymousClass4mf(this));
                }
                anonymousClass0eT.j(this);
            }
        }
        anonymousClass0eT.Z(C0164R.string.people_suggestions);
        B = AnonymousClass1PJ.B(getActivity());
        if (B != null) {
            if (((Boolean) AnonymousClass0CC.nd.G()).booleanValue()) {
                anonymousClass0eT.e(C0164R.string.people_suggestions, new AnonymousClass4me(this, B));
            } else {
                anonymousClass0eT.E(getString(C0164R.string.next), new AnonymousClass4md(this, B));
            }
            anonymousClass0eT.n(false);
        } else if (this.f57221Q) {
            anonymousClass0eT.n(true);
        } else {
            anonymousClass0eT.n(false);
            anonymousClass0eT.Q(getString(C0164R.string.done), new AnonymousClass4mf(this));
        }
        anonymousClass0eT.j(this);
    }

    public final void ey(View view) {
        AnonymousClass0IL parentFragment = getParentFragment();
        if (parentFragment instanceof AnonymousClass4mV) {
            ((AnonymousClass4mV) parentFragment).f57163H = false;
        }
        RectF rectF = new RectF();
        AnonymousClass0Nm.M(view, rectF);
        AnonymousClass0Sn anonymousClass0Sn = new AnonymousClass0Sn(TransparentModalActivity.class, "nametag", AnonymousClass0J5.f2887B.A().A(rectF, AnonymousClass319.DISCOVER_PEOPLE, true), getActivity(), this.f57215K.f1759C);
        anonymousClass0Sn.f5013B = ModalActivity.f5023D;
        anonymousClass0Sn.B(getContext());
    }

    public final void gC() {
        if (isResumed() && !uX() && !UX() && QV()) {
            if ((getListView().getFirstVisiblePosition() == 0 ? 1 : null) == null) {
                m25063A(null);
            }
        }
    }

    public final String getModuleName() {
        if (this.f57214J == AnonymousClass3na.DiscoverPeople) {
            return "discover_people";
        }
        return this.f57214J == AnonymousClass3na.RuxExplorePeople ? "rux" : "explore_people";
    }

    public final void hh() {
        AnonymousClass1fn.H(this.f57215K, getParentFragment() == null ? this : getParentFragment(), this);
        AnonymousClass0rF.B(this.f57207C, 44721473);
    }

    public final AnonymousClass0iW iM() {
        return this.f57213I;
    }

    public final void oLA() {
        if (getView() != null) {
            AnonymousClass0ib.C(this, getListView());
        }
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass0IL anonymousClass0IL = this;
        int F = AnonymousClass0cQ.F(this, -141518231);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f57215K = AnonymousClass0Ce.G(arguments);
        this.f57206B = "unknown";
        if (arguments != null) {
            if (arguments.containsKey("ExplorePeopleFragment.ARGUMENT_TYPE")) {
                String string = arguments.getString("ExplorePeopleFragment.ARGUMENT_TYPE");
                if (AnonymousClass3na.DiscoverPeopleStories.f44577B.equals(string)) {
                    this.f57214J = AnonymousClass3na.DiscoverPeopleStories;
                } else if (AnonymousClass3na.ExplorePeople.f44577B.equals(string)) {
                    this.f57214J = AnonymousClass3na.ExplorePeople;
                } else if (AnonymousClass3na.DiscoverPeople.f44577B.equals(string)) {
                    this.f57214J = AnonymousClass3na.DiscoverPeople;
                } else if (AnonymousClass3na.RuxExplorePeople.f44577B.equals(string)) {
                    this.f57214J = AnonymousClass3na.RuxExplorePeople;
                }
            }
            if (arguments.containsKey("ExplorePeopleFragment.ARGUMENT_ENTRY_POINT")) {
                this.f57206B = arguments.getString("ExplorePeopleFragment.ARGUMENT_ENTRY_POINT");
            }
            if (arguments.containsKey("ExplorePeopleFragment.ARGUMENT_ENTRY_FEED_ITEM_TYPE")) {
                this.f57218N = arguments.getString("ExplorePeopleFragment.ARGUMENT_ENTRY_FEED_ITEM_TYPE");
            }
            this.f57221Q = "rux".equals(this.f57206B);
            if (!arguments.getBoolean("ExplorePeopleFragment.ARGUMENT_NO_SCROLLABLE_NAVIGATION_HELPER")) {
                this.f57213I = new AnonymousClass0iW(getContext());
                this.f57222R.A(this.f57213I);
            }
        }
        AnonymousClass0NN.B("friend_center_loaded", this).F("entry_point", this.f57206B).R();
        this.f57216L = new AnonymousClass0kd(AnonymousClass0ke.DOWN, 4, this);
        this.f57222R.A(this.f57216L);
        this.f57219O = new AnonymousClass0iO(this.f57215K, this, this, new AnonymousClass0iw(this, AnonymousClass0iy.DEFAULT));
        anonymousClass0IL.f57207C = new AnonymousClass4mW(getContext(), this.f57215K, anonymousClass0IL, m25062F(), anonymousClass0IL, anonymousClass0IL, this.f57221Q, "nux".equals(anonymousClass0IL.f57206B));
        anonymousClass0IL.f57220P = new AnonymousClass1et(getContext(), anonymousClass0IL.f57215K, anonymousClass0IL.f57207C);
        anonymousClass0IL.f57224T = AnonymousClass0ip.B(getContext());
        if (anonymousClass0IL.f57221Q) {
            AnonymousClass4mh.m25061E(anonymousClass0IL, 8);
        }
        registerLifecycleListener(AnonymousClass0kr.B(getActivity()));
        if ((AnonymousClass0Gd.C() - AnonymousClass3Kb.C(anonymousClass0IL.f57215K).getLong("entry_point_info_last_update_time", -1) > 600000 ? 1 : null) != null) {
            Object obj = anonymousClass0IL.f57215K;
            AnonymousClass4ma anonymousClass4ma = new AnonymousClass4ma(anonymousClass0IL);
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(obj);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
            anonymousClass0Pt.f4229M = "fb/fb_entrypoint_info/";
            AnonymousClass0GA H = anonymousClass0Pt.M(AnonymousClass1U2.class).H();
            H.f2849B = new AnonymousClass3Ka(obj, anonymousClass4ma);
            AnonymousClass0Ix.D(H);
        }
        AnonymousClass0cQ.G(anonymousClass0IL, -1406281857, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -535024091);
        if (AnonymousClass1PJ.B(getActivity()) != null) {
            AnonymousClass0Fr.RegScreenLoaded.C(AnonymousClass2Na.EXPLORE_PEOPLE).R();
        }
        View inflate = layoutInflater.inflate(C0164R.layout.layout_refreshablelistview_with_progress, viewGroup, false);
        AnonymousClass0cQ.G(this, 252768860, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -1441702728);
        getListView().setOnScrollListener(null);
        this.f57220P.C();
        super.onDestroyView();
        AnonymousClass0cQ.G(this, -1422836738, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -1155275134);
        super.onPause();
        m25062F().A();
        AnonymousClass0iW anonymousClass0iW = this.f57213I;
        if (anonymousClass0iW != null) {
            anonymousClass0iW.B(getListView());
        }
        AnonymousClass0cQ.G(this, -1132068991, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 1597366944);
        super.onResume();
        if (this.f57208D) {
            m25063A(null);
        }
        AnonymousClass0iW anonymousClass0iW = this.f57213I;
        if (anonymousClass0iW != null) {
            anonymousClass0iW.D((float) this.f57224T, new AnonymousClass0lD(getActivity()), new View[]{AnonymousClass0eT.E(getActivity()).f7727C});
        }
        m25062F().B();
        AnonymousClass0cQ.G(this, 1223831940, F);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, 946327619);
        this.f57222R.onScroll(absListView, i, i2, i3);
        AnonymousClass0cQ.H(this, 586748689, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, 299175735);
        this.f57222R.onScrollStateChanged(absListView, i);
        AnonymousClass0cQ.H(this, -1954353050, I);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        AnonymousClass0iW anonymousClass0iW = this.f57213I;
        if (anonymousClass0iW != null) {
            anonymousClass0iW.G(getListViewSafe(), this.f57207C, this.f57224T);
        }
        ((RefreshableListView) getListView()).setupAndEnableRefresh(new AnonymousClass4mb(this));
        super.onViewCreated(view, bundle);
        getListView().setOnScrollListener(this);
        setListAdapter(this.f57207C);
        if (!this.f57209E) {
            if (!this.f57208D) {
                z = false;
                AnonymousClass2IF.B(z, getView());
                if (!(uX() || this.f57208D)) {
                    AnonymousClass4mh.m25058B(this);
                }
                this.f57223S = new AnonymousClass41H(getListView(), this.f57215K, 7, this);
                this.f57222R.A(this.f57223S);
                this.f57220P.B();
            }
        }
        z = true;
        AnonymousClass2IF.B(z, getView());
        AnonymousClass4mh.m25058B(this);
        this.f57223S = new AnonymousClass41H(getListView(), this.f57215K, 7, this);
        this.f57222R.A(this.f57223S);
        this.f57220P.B();
    }

    public final void pr(AnonymousClass0XM anonymousClass0XM) {
        AnonymousClass0iN.B(this.f57215K, anonymousClass0XM, AnonymousClass0iM.CLICKED, AnonymousClass0iL.DISCOVER_PEOPLE);
        if (anonymousClass0XM.f6156J == AnonymousClass0lg.FB_UPSELL) {
            AnonymousClass3Kb.D(getContext(), this.f57215K, this, "ig_discover_people_megaphone");
            this.f57207C.m25054G(null);
            AnonymousClass4mW anonymousClass4mW = this.f57207C;
            anonymousClass4mW.f57168C.f44277B = true;
            AnonymousClass4mW.m25052C(anonymousClass4mW);
        }
    }

    public final void qr(AnonymousClass0XM anonymousClass0XM) {
        AnonymousClass0iN.B(this.f57215K, anonymousClass0XM, AnonymousClass0iM.DISMISSED, AnonymousClass0iL.DISCOVER_PEOPLE);
        this.f57207C.m25054G(null);
        AnonymousClass4mW anonymousClass4mW = this.f57207C;
        anonymousClass4mW.f57168C.f44277B = true;
        AnonymousClass4mW.m25052C(anonymousClass4mW);
    }

    public final void rr(AnonymousClass0XM anonymousClass0XM) {
        AnonymousClass0iN.B(this.f57215K, anonymousClass0XM, AnonymousClass0iM.SEEN, AnonymousClass0iL.DISCOVER_PEOPLE);
        if (anonymousClass0XM.f6156J == AnonymousClass0lg.FB_UPSELL) {
            AnonymousClass0GG.B(AnonymousClass0cT.f7161D, new AnonymousClass3KZ(getContext(), this, "ig_discover_people_megaphone", "fb_homepage"), -1652317038);
        }
    }

    public final boolean tX() {
        return this.f57207C.isEmpty() ^ 1;
    }

    public final boolean uX() {
        return this.f57209E;
    }

    public final void wIA(boolean z) {
        if (isResumed()) {
            this.f57212H = true;
            this.f57211G = null;
            m25063A(null);
        }
    }

    public final void zs() {
        setUserVisibleHint(false);
    }
}

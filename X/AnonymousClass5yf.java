package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.modal.ModalActivity;
import com.instagram.save.model.SavedCollection;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.5yf */
public final class AnonymousClass5yf extends AnonymousClass0Ie implements AnonymousClass0Ro, AnonymousClass0hq, AnonymousClass0PZ, AnonymousClass0Ih, AnonymousClass0IS, OnScrollListener, AnonymousClass0Ii, AnonymousClass0Pb, AnonymousClass0gg, AnonymousClass3Lk, AnonymousClass2Hy, AnonymousClass0IT, AnonymousClass3d1 {
    /* renamed from: B */
    public AnonymousClass3cx f70524B;
    /* renamed from: C */
    public SavedCollection f70525C;
    /* renamed from: D */
    public AnonymousClass3db f70526D;
    /* renamed from: E */
    public EmptyStateView f70527E;
    /* renamed from: F */
    public boolean f70528F;
    /* renamed from: G */
    public AnonymousClass2Gi f70529G;
    /* renamed from: H */
    public String f70530H;
    /* renamed from: I */
    public boolean f70531I;
    /* renamed from: J */
    public AnonymousClass0Cm f70532J;
    /* renamed from: K */
    private AnonymousClass1Uv f70533K;
    /* renamed from: L */
    private AnonymousClass0jP f70534L;
    /* renamed from: M */
    private AnonymousClass0ng f70535M;
    /* renamed from: N */
    private final AnonymousClass0hi f70536N = new AnonymousClass0hi();
    /* renamed from: O */
    private AnonymousClass1ex f70537O;
    /* renamed from: P */
    private final AnonymousClass0hi f70538P = new AnonymousClass0hi();
    /* renamed from: Q */
    private ViewGroup f70539Q;
    /* renamed from: R */
    private final AnonymousClass0F8 f70540R = new AnonymousClass5yX(this);
    /* renamed from: S */
    private final AnonymousClass0hr f70541S = new AnonymousClass0hr(new AnonymousClass5yW(this));
    /* renamed from: T */
    private final AnonymousClass0hi f70542T = new AnonymousClass0hi();
    /* renamed from: U */
    private AnonymousClass1Uw f70543U;
    /* renamed from: V */
    private View f70544V;
    /* renamed from: W */
    private final AnonymousClass0F8 f70545W = new AnonymousClass5yZ(this);
    /* renamed from: X */
    private AnonymousClass3cu f70546X;
    /* renamed from: Y */
    private final AnonymousClass0F8 f70547Y = new AnonymousClass5yY(this);
    /* renamed from: Z */
    private int f70548Z;
    /* renamed from: a */
    private AnonymousClass0iW f70549a;

    public final void Jt() {
    }

    public final void Vk() {
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void zs() {
    }

    /* renamed from: A */
    public final void m28700A() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("SaveFragment.SELECTABLE_SAVE_HOME_TAB_MODE", AnonymousClass2Gj.ADD_TO_EXISTING_COLLECTION);
        bundle.putParcelable("SaveFragment.SAVE_HOME_COLLECTION", this.f70525C);
        new AnonymousClass0Sn(ModalActivity.class, "selectable_saved_feed", bundle, getActivity(), this.f70532J.f1759C).B(getContext());
    }

    /* renamed from: B */
    public final void m28701B(AnonymousClass3dS anonymousClass3dS, int i, int i2) {
        anonymousClass3dS = anonymousClass3dS.f42896B;
        if (anonymousClass3dS != null) {
            if (this.f70529G == AnonymousClass2Gi.ALL_TAB) {
                AnonymousClass0xB.D("instagram_save_home_impression", this, anonymousClass3dS, i, i2);
            } else {
                AnonymousClass0xB.C("instagram_collection_home_impression", this.f70525C, this, anonymousClass3dS, i, i2);
            }
        }
    }

    /* renamed from: B */
    public static boolean m28694B(AnonymousClass5yf anonymousClass5yf) {
        if (anonymousClass5yf.getParentFragment() != null) {
            if (!((AnonymousClass3dQ) anonymousClass5yf.getParentFragment()).tD(anonymousClass5yf)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    public static boolean m28695C(AnonymousClass5yf anonymousClass5yf) {
        if (anonymousClass5yf.f70529G != AnonymousClass2Gi.ALL_TAB) {
            if (anonymousClass5yf.f70529G != AnonymousClass2Gi.ALL_MEDIA_COLLECTION_FEED) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: D */
    public static void m28696D(AnonymousClass5yf anonymousClass5yf, boolean z) {
        if (anonymousClass5yf.f70531I && (anonymousClass5yf.f70544V == null || z)) {
            View inflate = LayoutInflater.from(anonymousClass5yf.getContext()).inflate(C0164R.layout.save_collection_pivots_cta, anonymousClass5yf.f70539Q, false);
            anonymousClass5yf.f70544V = inflate;
            ((TextView) inflate.findViewById(C0164R.id.cta_text)).getPaint().setFakeBoldText(true);
            anonymousClass5yf.f70544V.setOnClickListener(new AnonymousClass5yc(anonymousClass5yf));
            anonymousClass5yf.f70539Q.addView(anonymousClass5yf.f70544V);
            anonymousClass5yf.f70539Q.invalidate();
        }
        if (anonymousClass5yf.f70544V != null && anonymousClass5yf.f70529G == AnonymousClass2Gi.COLLECTION_FEED && anonymousClass5yf.f70524B.dX()) {
            anonymousClass5yf.f70544V.setVisibility(8);
        }
    }

    /* renamed from: E */
    public static void m28697E(AnonymousClass5yf anonymousClass5yf) {
        AnonymousClass3dL.D(anonymousClass5yf.f70527E, (RefreshableListView) anonymousClass5yf.getListViewSafe(), anonymousClass5yf.uX(), anonymousClass5yf.UX());
    }

    /* renamed from: F */
    private void m28698F(AbsListView absListView, int i, int i2, int i3) {
        this.f70542T.onScroll(absListView, i, i2, i3);
        if (this.f70524B.f42823M == AnonymousClass0nS.FEED) {
            this.f70536N.onScroll(absListView, i, i2, i3);
        } else {
            this.f70538P.onScroll(absListView, i, i2, i3);
        }
    }

    /* renamed from: G */
    private void m28699G(boolean z, boolean z2) {
        String str;
        String str2;
        AnonymousClass0nn anonymousClass5yV = new AnonymousClass5yV(this, z, z2);
        AnonymousClass0ng anonymousClass0ng = this.f70535M;
        if (z) {
            str = null;
        } else {
            str = anonymousClass0ng.f10109E;
        }
        if (AnonymousClass5yf.m28695C(this)) {
            str2 = "feed/saved/";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("feed/collection/");
            stringBuilder.append(this.f70525C.f12480B);
            stringBuilder.append("/");
            str2 = stringBuilder.toString();
        }
        anonymousClass0ng.C(AnonymousClass0xA.D(str2, str, this.f70532J), anonymousClass5yV);
    }

    public final Map GIA() {
        Map hashMap = new HashMap();
        hashMap.put(MemoryDumpUploadJob.EXTRA_USER_ID, this.f70532J.f1759C);
        return hashMap;
    }

    public final boolean NV() {
        return this.f70524B.isEmpty() ^ 1;
    }

    public final void OZ() {
        m28699G(false, false);
    }

    public final boolean QV() {
        return this.f70535M.A();
    }

    public final void Tn(AnonymousClass3dS anonymousClass3dS, int i, int i2) {
        anonymousClass3dS = anonymousClass3dS.f42896B;
        if (anonymousClass3dS != null) {
            switch (this.f70529G.ordinal()) {
                case 0:
                    RefreshableListView refreshableListView = (RefreshableListView) getListView();
                    this.f70549a.G(refreshableListView, this.f70524B, 0);
                    refreshableListView.setPullToRefreshBackgroundColor(AnonymousClass0Ca.C(getContext(), C0164R.color.white));
                    AnonymousClass3dQ anonymousClass3dQ = (AnonymousClass3dQ) getParentFragment();
                    if (anonymousClass3dQ != null) {
                        anonymousClass3dQ.wOA(false);
                        anonymousClass3dQ.dG();
                        AnonymousClass0Iz anonymousClass0Iz = AnonymousClass0Iz.f2854L;
                        anonymousClass0Iz.K((AnonymousClass0EE) getParentFragment(), getFragmentManager().H(), null);
                        anonymousClass0Iz.H(this);
                    }
                    AnonymousClass0xB.D("instagram_save_home_click", this, anonymousClass3dS, i, i2);
                    this.f70533K.A(anonymousClass3dS);
                    this.f70549a.E();
                    return;
                case 1:
                case 2:
                    AnonymousClass0xB.C("instagram_collection_home_click", this.f70525C, this, anonymousClass3dS, i, i2);
                    this.f70533K.A(anonymousClass3dS);
                    View view = this.f70544V;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    this.f70549a.E();
                    return;
                case 3:
                    Bundle bundle = new Bundle();
                    bundle.putString("cover_media_id", anonymousClass3dS.getId());
                    bundle.putString("cover_media_url", anonymousClass3dS.HA());
                    Intent intent = new Intent();
                    intent.putExtras(bundle);
                    getActivity().setResult(-1, intent);
                    getActivity().onBackPressed();
                    return;
                default:
                    return;
            }
        }
    }

    public final boolean UX() {
        return this.f70535M.f10111G == AnonymousClass0nq.NEEDS_RETRY;
    }

    public final void Uk() {
        m28700A();
    }

    public final boolean Yn(View view, MotionEvent motionEvent, AnonymousClass0P7 anonymousClass0P7, int i, int i2) {
        return this.f70529G != AnonymousClass2Gi.SELECT_COVER_PHOTO ? this.f70543U.A(view, motionEvent, anonymousClass0P7, (i * this.f70537O.f21066B) + i2) : false;
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.j(this);
        anonymousClass0eT.n(true);
        switch (this.f70529G.ordinal()) {
            case 0:
                anonymousClass0eT.f7726B.setVisibility(8);
                return;
            case 1:
            case 2:
                View X = anonymousClass0eT.X(C0164R.layout.contextual_feed_title, 0, 0);
                ((TextView) X.findViewById(C0164R.id.feed_type)).setText(C0164R.string.saved_feed);
                ((TextView) X.findViewById(C0164R.id.feed_title)).setText(this.f70525C.f12481C);
                if (!this.f70524B.dX() && this.f70525C.f12485G == AnonymousClass3dX.f42902F) {
                    anonymousClass0eT.F(AnonymousClass0eb.OVERFLOW, new AnonymousClass5ye(this));
                    return;
                }
                return;
            case 3:
                anonymousClass0eT.Z(C0164R.string.save_home_collection_feed_change_cover_photo);
                return;
            default:
                return;
        }
    }

    public final void gC() {
        if (this.f70535M.B()) {
            m28699G(false, false);
        }
    }

    public final String getModuleName() {
        if (this.f70524B.dX()) {
            return AnonymousClass5yf.m28695C(this) ? "feed_contextual_saved" : "feed_contextual_saved_collections";
        }
        switch (this.f70529G.ordinal()) {
            case 0:
                return "feed_saved_tab";
            case 1:
            case 2:
                return "feed_saved_collections";
            case 3:
                return "collection_cover_editor";
            default:
                return null;
        }
    }

    public final AnonymousClass0iW iM() {
        return this.f70549a;
    }

    public final String kR() {
        return this.f70530H;
    }

    public final void oLA() {
        if (getView() != null) {
            AnonymousClass0ib.C(this, getListView());
        }
    }

    public final boolean onBackPressed() {
        if (!this.f70543U.onBackPressed()) {
            AnonymousClass3db anonymousClass3db = this.f70526D;
            if (anonymousClass3db == null || !anonymousClass3db.A()) {
                if (this.f70524B.dX() && this.f70529G == AnonymousClass2Gi.ALL_TAB) {
                    this.f70549a.G((RefreshableListView) getListView(), this.f70524B, this.f70548Z);
                    AnonymousClass3dQ anonymousClass3dQ = (AnonymousClass3dQ) getParentFragment();
                    anonymousClass3dQ.wOA(true);
                    anonymousClass3dQ.JH();
                    AnonymousClass0Iz anonymousClass0Iz = AnonymousClass0Iz.f2854L;
                    anonymousClass0Iz.K(this, getFragmentManager().H(), null);
                    anonymousClass0Iz.H((AnonymousClass0EE) getParentFragment());
                } else {
                    View view = this.f70544V;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                }
                return this.f70533K.C();
            }
        }
        return true;
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass0IU fragmentManager;
        AnonymousClass0IU fragmentManager2;
        int F = AnonymousClass0cQ.F(this, 1632381225);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f70537O = AnonymousClass1ex.f21064C;
        this.f70532J = AnonymousClass0Ce.G(arguments);
        this.f70529G = (AnonymousClass2Gi) arguments.getSerializable("SaveFragment.SAVE_HOME_TAB_MODE");
        this.f70525C = (SavedCollection) arguments.getParcelable("SaveFragment.SAVE_HOME_COLLECTION");
        if (this.f70529G == AnonymousClass2Gi.COLLECTION_FEED) {
            AnonymousClass0LH.E(r1.f70525C);
        }
        r1.f70530H = UUID.randomUUID().toString();
        AnonymousClass5ya anonymousClass5ya = new AnonymousClass5ya(r1);
        if (r1.f70529G == AnonymousClass2Gi.ALL_TAB) {
            r1.f70548Z = getResources().getDimensionPixelSize(C0164R.dimen.top_tabbar_height);
        } else {
            r1.f70548Z = AnonymousClass0ip.B(getContext());
        }
        r1.f70549a = new AnonymousClass0iW(getContext());
        r1.f70542T.A(r1.f70549a);
        OnScrollListener anonymousClass0kd = new AnonymousClass0kd(AnonymousClass0ke.DOWN, 6, r1);
        r1.f70542T.A(anonymousClass0kd);
        AnonymousClass0jC anonymousClass0jC = new AnonymousClass0jC(r1, true, getContext());
        AnonymousClass0jC anonymousClass0jC2 = new AnonymousClass0jC(r1, false, getContext());
        r1.f70546X = new AnonymousClass3cu(getContext(), r1, r1.f70532J);
        AnonymousClass0jC anonymousClass0jC3 = anonymousClass0jC;
        AnonymousClass0jC anonymousClass0jC4 = anonymousClass0jC2;
        r1.f70524B = new AnonymousClass3cx(getContext(), r1, r1.f70529G, r1, anonymousClass5ya, r1.f70532J, anonymousClass0jC, anonymousClass0jC2, r1.f70546X, r1, r1.f70537O);
        setListAdapter(r1.f70524B);
        AnonymousClass0jY anonymousClass0jY = new AnonymousClass0jY();
        AnonymousClass0jf anonymousClass0jf = new AnonymousClass0jf(r1.f70524B, r1);
        AnonymousClass0jg anonymousClass0jg = new AnonymousClass0jg(r1.f70524B, r1);
        AnonymousClass0jS anonymousClass0jS = new AnonymousClass0jS(r1, r1.f70549a, r1.f70524B, r1.f70536N);
        AnonymousClass0jZ anonymousClass0jZ = new AnonymousClass0jZ(getContext(), r1.f70532J, r1, r1.f70524B, anonymousClass0jY, r1.f70530H);
        AnonymousClass3kj anonymousClass3kj = new AnonymousClass3kj(getActivity(), r1.f70524B, r1);
        Activity rootActivity = getRootActivity();
        AnonymousClass0jj anonymousClass0ji = rootActivity instanceof AnonymousClass0Hj ? new AnonymousClass0ji(r1, (AnonymousClass0Hw) rootActivity) : new AnonymousClass0y5();
        AnonymousClass0kB anonymousClass3dK = new AnonymousClass3dK(r1.f70524B, new AnonymousClass41e(getActivity(), r1, r1, r1.f70532J, anonymousClass0ji), r1.f70532J, AnonymousClass5yf.m28695C(r1) ? null : r1.f70525C);
        Context context = getContext();
        if (getParentFragment() != null) {
            fragmentManager = getParentFragment().getFragmentManager();
        } else {
            fragmentManager = getFragmentManager();
        }
        AnonymousClass0kZ anonymousClass0kZ = new AnonymousClass0kZ(context, r16, fragmentManager, r1.f70524B, r1, r1.f70532J);
        anonymousClass0kZ.f9318G = anonymousClass0jf;
        anonymousClass0kZ.f9319H = anonymousClass0jg;
        anonymousClass0kZ.f9320I = anonymousClass0jZ;
        anonymousClass0kZ.f9323L = anonymousClass0jY;
        anonymousClass0kZ.f9329R = r1;
        anonymousClass0kZ.f9330S = anonymousClass0jS;
        anonymousClass0kZ.f9333V = anonymousClass3kj;
        anonymousClass0kZ.f9328Q = anonymousClass0ji;
        anonymousClass0kZ.f9327P = anonymousClass3dK;
        anonymousClass0kZ.f9316E = new AnonymousClass0ka(getContext(), r1.f70524B);
        anonymousClass0kZ.f9326O = anonymousClass0jC4;
        AnonymousClass0iP A = anonymousClass0kZ.A();
        r1.f70536N.A(A);
        Context context2 = getContext();
        if (getParentFragment() == null) {
            fragmentManager2 = getFragmentManager();
        } else {
            fragmentManager2 = getParentFragment().getFragmentManager();
        }
        r1.f70543U = new AnonymousClass1Uw(context2, r1, fragmentManager2, false, r1.f70532J, r1, r1, r1.f70524B, null);
        r1.f70534L = AnonymousClass0jP.B(getContext(), r1.f70532J, r1).A(r1.f70524B);
        r1.f70533K = new AnonymousClass1Uv(getContext(), r1.f70542T, r1.f70524B, ((BaseFragmentActivity) getActivity()).FI(), anonymousClass0kd, A, r1, r1, r1.f70534L, getParentFragment() == null ? true : null);
        AnonymousClass0lj anonymousClass0lj = new AnonymousClass0lj();
        anonymousClass0lj.L(r1.f70533K);
        anonymousClass0lj.L(AnonymousClass0kr.B(getActivity()));
        anonymousClass0lj.L(A);
        anonymousClass0lj.L(r1.f70534L);
        anonymousClass0lj.L(r1.f70541S);
        anonymousClass0lj.L(r1.f70543U);
        anonymousClass0lj.L(anonymousClass0jC3);
        anonymousClass0lj.L(new AnonymousClass1et(getContext(), r1.f70532J, r1.f70524B));
        anonymousClass0lj.L(new AnonymousClass0jR(r1, r1, r1.f70532J));
        registerLifecycleListenerSet(anonymousClass0lj);
        AnonymousClass0HV.D(r1.f70532J).AA(true);
        r1.f70535M = new AnonymousClass0ng(getContext(), r1.f70532J.f1759C, getLoaderManager());
        AnonymousClass0F4.f2058E.A(AnonymousClass3dT.class, r1.f70547Y);
        AnonymousClass0F4.f2058E.A(AnonymousClass0x9.class, r1.f70540R);
        AnonymousClass0F4.f2058E.A(AnonymousClass1Y0.class, r1.f70545W);
        m28699G(true, false);
        r1.f70542T.A(new AnonymousClass3cq(r1, r1.f70524B, r1, anonymousClass0jC3));
        AnonymousClass0cQ.G(r1, -1123688868, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1940739723);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_feed, viewGroup, false);
        this.f70539Q = (ViewGroup) inflate.findViewById(C0164R.id.sticky_header_list);
        AnonymousClass0cQ.G(this, 1684501713, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, 336191142);
        super.onDestroy();
        AnonymousClass0F4.f2058E.D(AnonymousClass3dT.class, this.f70547Y);
        AnonymousClass0F4.f2058E.D(AnonymousClass0x9.class, this.f70540R);
        AnonymousClass0F4.f2058E.D(AnonymousClass1Y0.class, this.f70545W);
        AnonymousClass0cQ.G(this, -35526799, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 1027871774);
        this.f70536N.B(this.f70534L);
        super.onDestroyView();
        this.f70527E = null;
        AnonymousClass0cQ.G(this, 341753066, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 1521159063);
        super.onPause();
        this.f70549a.B(getListView());
        AnonymousClass0cQ.G(this, -382917604, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -174099967);
        super.onResume();
        AnonymousClass0cQ.G(this, -1212938559, F);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, 776308413);
        if (!this.f70524B.FX()) {
            m28698F(absListView, i, i2, i3);
        } else if (AnonymousClass0iI.E(absListView)) {
            this.f70524B.Tc();
            m28698F(absListView, i, i2, i3);
        }
        AnonymousClass0cQ.H(this, 839749770, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, 1793325079);
        if (!this.f70524B.FX()) {
            this.f70542T.onScrollStateChanged(absListView, i);
            if (this.f70524B.f42823M == AnonymousClass0nS.FEED) {
                this.f70536N.onScrollStateChanged(absListView, i);
            } else {
                this.f70538P.onScrollStateChanged(absListView, i);
            }
        }
        AnonymousClass0cQ.H(this, 1727426017, I);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f70549a.G(getListView(), this.f70524B, this.f70548Z);
        super.onViewCreated(view, bundle);
        this.f70524B.f42821K = this.f70531I;
        AnonymousClass5yf.m28696D(this, true);
        this.f70527E = (EmptyStateView) getListView().getEmptyView();
        AnonymousClass3dL.C(getContext(), this.f70527E, new AnonymousClass5yd(this));
        AnonymousClass2I0 anonymousClass2I0;
        if (this.f70529G == AnonymousClass2Gi.COLLECTION_FEED) {
            EmptyStateView N = this.f70527E.N(C0164R.string.save_home_collections_empty_collection_title, AnonymousClass2I0.EMPTY);
            String string = getResources().getString(C0164R.string.save_home_collections_empty_collection_subtitle, new Object[]{this.f70525C.f12481C});
            anonymousClass2I0 = AnonymousClass2I0.EMPTY;
            N.M(string, anonymousClass2I0).B(C0164R.string.save_home_collection_feed_add_to_collection, anonymousClass2I0).C(this, anonymousClass2I0);
        } else {
            EmptyStateView emptyStateView = this.f70527E;
            anonymousClass2I0 = AnonymousClass2I0.EMPTY;
            emptyStateView.N(C0164R.string.save_explanation_title, anonymousClass2I0).L(C0164R.string.save_explanation_subtitle, anonymousClass2I0);
        }
        this.f70527E.A();
        AnonymousClass5yf.m28697E(this);
        getListView().setOnScrollListener(this);
        RefreshableListView refreshableListView = (RefreshableListView) getListView();
        refreshableListView.setupAndEnableRefresh(new AnonymousClass5yb(this));
        refreshableListView.setDrawBorder(false);
    }

    public final boolean tX() {
        if (uX()) {
            return this.f70524B.isEmpty() ^ true;
        }
        return true;
    }

    public final boolean uX() {
        return this.f70535M.f10111G == AnonymousClass0nq.LOADING;
    }

    public final void wIA(boolean z) {
        if (!uX()) {
            if (UX()) {
                AnonymousClass0iY.B(AnonymousClass0NN.B("action_bar_feed_retry", this), getContext()).R();
            }
            this.f70530H = UUID.randomUUID().toString();
            this.f70524B.f42822L.clear();
            m28699G(true, z);
        }
    }
}

package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.facebook.C0164R;
import com.instagram.ui.emptystaterow.EmptyStateView;

/* renamed from: X.1LQ */
public final class AnonymousClass1LQ extends AnonymousClass0Ie implements AnonymousClass0Ro, AnonymousClass0Ih, OnScrollListener, AnonymousClass3Lk, AnonymousClass0Pi, AnonymousClass2Hy {
    /* renamed from: B */
    public AnonymousClass0Rp f17339B;
    /* renamed from: C */
    public boolean f17340C;
    /* renamed from: D */
    public boolean f17341D;
    /* renamed from: E */
    public AnonymousClass0Cm f17342E;
    /* renamed from: F */
    private AnonymousClass0kd f17343F;
    /* renamed from: G */
    private AnonymousClass0ng f17344G;
    /* renamed from: H */
    private boolean f17345H;
    /* renamed from: I */
    private final AnonymousClass0hi f17346I = new AnonymousClass0hi();

    public final void Vk() {
    }

    public final String getModuleName() {
        return "newsfeed_following";
    }

    public final void nr(AnonymousClass0XM anonymousClass0XM, AnonymousClass0le anonymousClass0le) {
    }

    public final void zs() {
    }

    /* renamed from: B */
    public static void m10847B(AnonymousClass1LQ anonymousClass1LQ) {
        if (anonymousClass1LQ.getView() != null) {
            EmptyStateView emptyStateView = (EmptyStateView) anonymousClass1LQ.getListView().getEmptyView();
            if (anonymousClass1LQ.uX()) {
                emptyStateView.I();
            } else if (anonymousClass1LQ.f17341D) {
                emptyStateView.E();
            } else if (anonymousClass1LQ.f17340C) {
                emptyStateView.D();
            } else {
                emptyStateView.F();
            }
        }
    }

    /* renamed from: C */
    private void m10848C(boolean z, boolean z2) {
        AnonymousClass0ng anonymousClass0ng = this.f17344G;
        if (anonymousClass0ng != null) {
            String str;
            if (z) {
                str = null;
            } else {
                str = anonymousClass0ng.f10109E;
            }
            String str2 = "news/";
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(this.f17342E);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
            anonymousClass0Pt.f4229M = str2;
            anonymousClass0Pt.f4228L = new AnonymousClass0R8(AnonymousClass3VM.class);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(str);
            anonymousClass0Pt.f4219C = stringBuilder.toString();
            anonymousClass0Pt.f4220D = AnonymousClass0Ny.UseCacheWithTimeout;
            anonymousClass0Pt.f4221E = 4500;
            AnonymousClass0It.m2379F(anonymousClass0Pt, str);
            anonymousClass0ng.m7667C(anonymousClass0Pt.m3939H(), new AnonymousClass5ls(this, z, z2));
        }
    }

    public final void Jt() {
        if (!this.f17340C && !this.f17341D) {
            m10848C(true, false);
        }
    }

    public final boolean NV() {
        return this.f17339B.f4785J.isEmpty() ^ 1;
    }

    public final void OZ() {
        m10848C(false, false);
    }

    public final boolean QV() {
        AnonymousClass0ng anonymousClass0ng = this.f17344G;
        return anonymousClass0ng != null && anonymousClass0ng.m7665A();
    }

    public final boolean UX() {
        AnonymousClass0ng anonymousClass0ng = this.f17344G;
        return anonymousClass0ng != null && anonymousClass0ng.f10111G == AnonymousClass0nq.NEEDS_RETRY;
    }

    public final void Uk() {
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(getActivity());
        anonymousClass0IZ.f2754D = AnonymousClass3Ip.f39973B.A().C("newsfeed", getString(C0164R.string.discover_people));
        anonymousClass0IZ.m2308B();
    }

    public final void gC() {
        AnonymousClass0ng anonymousClass0ng = this.f17344G;
        if (anonymousClass0ng != null && anonymousClass0ng.m7666B()) {
            m10848C(false, false);
        }
    }

    public final void oLA() {
        if (getView() != null) {
            AnonymousClass0ib.m6923C(this, getListView());
        }
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass0IL anonymousClass0IL = this;
        int F = AnonymousClass0cQ.m5856F(this, 1238067758);
        if (((Boolean) AnonymousClass0CC.f1458U.m845G()).booleanValue()) {
            getContext().getTheme().applyStyle(C0164R.style.Theme.ActivityRedesign, true);
        } else {
            AnonymousClass0G5.m1728I(getContext());
        }
        super.onCreate(bundle);
        this.f17342E = AnonymousClass0Ce.m950G(getArguments());
        if (this.f17339B == null) {
            anonymousClass0IL.f17339B = new AnonymousClass0Rp(getContext(), this.f17342E, ((AnonymousClass0bu) getParentFragment()).f6895D, null, null, anonymousClass0IL, null, null, null, anonymousClass0IL, ((AnonymousClass0bu) getParentFragment()).f6894C, getModuleName());
        }
        setListAdapter(anonymousClass0IL.f17339B);
        anonymousClass0IL.f17344G = new AnonymousClass0ng(getContext(), anonymousClass0IL.f17342E.f1759C, getLoaderManager());
        anonymousClass0IL.f17343F = new AnonymousClass0kd(AnonymousClass0ke.DOWN, 8, anonymousClass0IL);
        anonymousClass0IL.f17346I.m6810A(anonymousClass0IL.f17343F);
        anonymousClass0IL.f17346I.m6810A(new AnonymousClass0yA(getActivity(), anonymousClass0IL.f17342E, anonymousClass0IL));
        AnonymousClass0cQ.m5857G(anonymousClass0IL, -1532576146, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.m5856F(this, 964754049);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_refreshablelistview_with_empty_state, viewGroup, false);
        AnonymousClass0cQ.m5857G(this, -677468762, F);
        return inflate;
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.m5856F(this, -809774377);
        ((AnonymousClass0bu) getParentFragment()).f6895D.f17353F.clear();
        super.onPause();
        AnonymousClass0cQ.m5857G(this, -2066742178, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.m5856F(this, -1820381377);
        super.onResume();
        if (this.f17345H) {
            wIA(false);
            this.f17345H = false;
        }
        AnonymousClass0cQ.m5857G(this, 863345955, F);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.m5859I(this, 1470888199);
        if (getUserVisibleHint()) {
            this.f17346I.onScroll(absListView, i, i2, i3);
        }
        AnonymousClass0cQ.m5858H(this, -1342963528, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.m5859I(this, -744733060);
        if (getUserVisibleHint()) {
            this.f17346I.onScrollStateChanged(absListView, i);
        }
        AnonymousClass0cQ.m5858H(this, 1646969992, I);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ((AnonymousClass0bu) getParentFragment()).m5657c(this);
        EmptyStateView G = ((EmptyStateView) getListView().getEmptyView()).G(C0164R.drawable.empty_state_follow, AnonymousClass2I0.f28619C);
        int C = AnonymousClass0Ca.m937C(getContext(), C0164R.color.grey_9);
        AnonymousClass2I0 anonymousClass2I0 = AnonymousClass2I0.f28619C;
        EmptyStateView G2 = G.H(C, anonymousClass2I0).N(C0164R.string.newsfeed_following_empty_view_title, anonymousClass2I0).L(C0164R.string.newsfeed_following_empty_view_subtitle, anonymousClass2I0).G(C0164R.drawable.loadmore_icon_refresh_compound, AnonymousClass2I0.f28620D);
        anonymousClass2I0 = AnonymousClass2I0.f28619C;
        G2.B(C0164R.string.newsfeed_following_empty_view_cta, anonymousClass2I0).C(this, anonymousClass2I0).J(new AnonymousClass5lr(this), AnonymousClass2I0.f28620D).A();
        super.onViewCreated(view, bundle);
        getListView().setOnScrollListener(this);
        AnonymousClass1LQ.m10847B(this);
        AnonymousClass55F.E(this);
    }

    public final void pr(AnonymousClass0XM anonymousClass0XM) {
        AnonymousClass0iN.m6876B(this.f17342E, anonymousClass0XM, AnonymousClass0iM.CLICKED, AnonymousClass0iL.FOLLOWING_FEED);
        if (anonymousClass0XM.f6156J == AnonymousClass0lg.FB_UPSELL) {
            AnonymousClass3Kb.D(getContext(), this.f17342E, this, "ig_following_feed_megaphone");
            this.f17339B.m4245G();
        }
    }

    public final void qr(AnonymousClass0XM anonymousClass0XM) {
        AnonymousClass0iN.m6876B(this.f17342E, anonymousClass0XM, AnonymousClass0iM.DISMISSED, AnonymousClass0iL.FOLLOWING_FEED);
        this.f17339B.m4245G();
    }

    public final void rr(AnonymousClass0XM anonymousClass0XM) {
        AnonymousClass0iN.m6876B(this.f17342E, anonymousClass0XM, AnonymousClass0iM.SEEN, AnonymousClass0iL.FOLLOWING_FEED);
        if (anonymousClass0XM.f6156J == AnonymousClass0lg.FB_UPSELL) {
            AnonymousClass0GG.m1763B(AnonymousClass0cT.f7161D, new AnonymousClass3KZ(getContext(), this, "ig_following_feed_megaphone", "fb_homepage"), -1652317038);
        }
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            Jt();
        }
    }

    public final boolean tX() {
        if (uX()) {
            if (!NV()) {
                return false;
            }
        }
        return true;
    }

    public final boolean uX() {
        AnonymousClass0ng anonymousClass0ng = this.f17344G;
        return anonymousClass0ng != null && anonymousClass0ng.f10111G == AnonymousClass0nq.LOADING;
    }

    public final void wIA(boolean z) {
        if (isResumed()) {
            m10848C(true, z);
        } else {
            this.f17345H = true;
        }
    }
}

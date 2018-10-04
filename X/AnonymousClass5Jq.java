package X;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.facebook.C0164R;
import com.instagram.ui.widget.refresh.RefreshableListView;

/* renamed from: X.5Jq */
public final class AnonymousClass5Jq extends AnonymousClass0Ie implements AnonymousClass0Ro, AnonymousClass0PZ, OnScrollListener, AnonymousClass0Ii, AnonymousClass0Pb, AnonymousClass3Lk, AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass1VM f62183B;
    /* renamed from: C */
    public final Handler f62184C = new Handler();
    /* renamed from: D */
    public boolean f62185D = false;
    /* renamed from: E */
    public String f62186E;
    /* renamed from: F */
    public final AnonymousClass0hr f62187F = new AnonymousClass0hr(new AnonymousClass5Jl(this));
    /* renamed from: G */
    public AnonymousClass0Cm f62188G;
    /* renamed from: H */
    private AnonymousClass0kd f62189H;
    /* renamed from: I */
    private AnonymousClass0jR f62190I;
    /* renamed from: J */
    private AnonymousClass0ng f62191J;
    /* renamed from: K */
    private final AnonymousClass0hi f62192K = new AnonymousClass0hi();
    /* renamed from: L */
    private AnonymousClass0iW f62193L;

    public final boolean QV() {
        return false;
    }

    public final String getModuleName() {
        return "feed_short_url";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final boolean tX() {
        return true;
    }

    /* renamed from: B */
    public static void m26249B(AnonymousClass5Jq anonymousClass5Jq) {
        anonymousClass5Jq.f62191J.C(AnonymousClass0It.B(anonymousClass5Jq.f62186E, anonymousClass5Jq.f62188G), new AnonymousClass5Jn(anonymousClass5Jq));
    }

    public final boolean NV() {
        return this.f62183B.L();
    }

    public final void OZ() {
        AnonymousClass5Jq.m26249B(this);
    }

    public final boolean UX() {
        return this.f62191J.f10111G == AnonymousClass0nq.NEEDS_RETRY;
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.X(C0164R.layout.action_bar_title_logo, getResources().getDimensionPixelSize(C0164R.dimen.action_bar_item_padding), 0);
        anonymousClass0eT.n(true);
        anonymousClass0eT.j(this);
    }

    public final void gC() {
        if (this.f62191J.B()) {
            AnonymousClass5Jq.m26249B(this);
        }
    }

    public final AnonymousClass0iW iM() {
        return this.f62193L;
    }

    public final void oLA() {
        if (getView() != null) {
            setSelection(0);
        }
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass0IL anonymousClass0IL = this;
        int F = AnonymousClass0cQ.F(this, 192588466);
        super.onCreate(bundle);
        this.f62188G = AnonymousClass0Ce.G(getArguments());
        String string = getArguments().getString("com.instagram.url.constants.ARGUMENTS_KEY_MEDIA_SHORT_URL");
        if (string != null) {
            AnonymousClass0GA B = AnonymousClass5Jk.m26248B(this.f62188G, string);
            B.f2849B = new AnonymousClass5Jp(this);
            schedule(B);
        }
        anonymousClass0IL.f62183B = new AnonymousClass1VM(getContext(), null, anonymousClass0IL, false, false, false, AnonymousClass3mP.MEDIA, AnonymousClass1ew.f21063B, null, anonymousClass0IL, anonymousClass0IL, AnonymousClass1ex.f21064C, this.f62188G, null);
        anonymousClass0IL.f62193L = new AnonymousClass0iW(getContext());
        AnonymousClass0jS anonymousClass0jS = new AnonymousClass0jS(anonymousClass0IL, anonymousClass0IL.f62193L, anonymousClass0IL.f62183B, anonymousClass0IL.f62192K);
        AnonymousClass0kZ anonymousClass0kZ = new AnonymousClass0kZ(getContext(), anonymousClass0IL, getFragmentManager(), anonymousClass0IL.f62183B, anonymousClass0IL, anonymousClass0IL.f62188G);
        anonymousClass0kZ.f9330S = anonymousClass0jS;
        Object A = anonymousClass0kZ.A();
        anonymousClass0IL.f62191J = new AnonymousClass0ng(getContext(), anonymousClass0IL.f62188G.f1759C, getLoaderManager());
        anonymousClass0IL.f62189H = new AnonymousClass0kd(AnonymousClass0ke.DOWN, 3, anonymousClass0IL);
        anonymousClass0IL.f62192K.A(anonymousClass0IL.f62189H);
        anonymousClass0IL.f62192K.A(A);
        anonymousClass0IL.f62192K.A(anonymousClass0IL.f62193L);
        anonymousClass0IL.f62190I = new AnonymousClass0jR(anonymousClass0IL, anonymousClass0IL, anonymousClass0IL.f62188G);
        AnonymousClass0lj anonymousClass0lj = new AnonymousClass0lj();
        anonymousClass0lj.L(anonymousClass0IL.f62187F);
        anonymousClass0lj.L(anonymousClass0IL.f62190I);
        anonymousClass0lj.L(A);
        anonymousClass0lj.L(AnonymousClass0kr.B(getActivity()));
        registerLifecycleListenerSet(anonymousClass0lj);
        setListAdapter(anonymousClass0IL.f62183B);
        AnonymousClass0cQ.G(anonymousClass0IL, -1416718633, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -498534122);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_feed, viewGroup, false);
        AnonymousClass0cQ.G(this, 1739764919, F);
        return inflate;
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 276933029);
        super.onPause();
        this.f62193L.B(getListView());
        AnonymousClass0cQ.G(this, 1320612598, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -749832383);
        super.onResume();
        this.f62193L.D((float) AnonymousClass0ip.B(getContext()), new AnonymousClass0lD(getActivity()), new View[]{AnonymousClass0eT.E(getActivity()).f7727C});
        AnonymousClass0cQ.G(this, 1240083623, F);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, -2114440161);
        this.f62192K.onScroll(absListView, i, i2, i3);
        AnonymousClass0cQ.H(this, -1759675806, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, -2139376429);
        this.f62192K.onScrollStateChanged(absListView, i);
        AnonymousClass0cQ.H(this, -404033997, I);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((RefreshableListView) getListView()).setupAndEnableRefresh(new AnonymousClass5Jm(this));
        this.f62193L.G(getListView(), this.f62183B, AnonymousClass0ip.B(getContext()));
        getListView().setOnScrollListener(this);
    }

    public final boolean uX() {
        if (this.f62191J.f10111G != AnonymousClass0nq.LOADING) {
            if (!this.f62185D) {
                return false;
            }
        }
        return true;
    }
}

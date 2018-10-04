package com.instagram.reels.fragment;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Cn;
import X.AnonymousClass0GA;
import X.AnonymousClass0IT;
import X.AnonymousClass0Ie;
import X.AnonymousClass0Jd;
import X.AnonymousClass0MI;
import X.AnonymousClass0Nm;
import X.AnonymousClass0Pt;
import X.AnonymousClass0Pu;
import X.AnonymousClass0Qf;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eT;
import X.AnonymousClass0hi;
import X.AnonymousClass0lG;
import X.AnonymousClass2I0;
import X.AnonymousClass302;
import X.AnonymousClass304;
import X.AnonymousClass3Uq;
import X.AnonymousClass3V3;
import X.AnonymousClass3bG;
import X.AnonymousClass41P;
import X.AnonymousClass5LD;
import X.AnonymousClass5tK;
import X.AnonymousClass5vl;
import X.AnonymousClass5vm;
import X.AnonymousClass5vn;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.facebook.C0164R;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ReelResharesViewerFragment extends AnonymousClass0Ie implements OnScrollListener, AnonymousClass3bG, AnonymousClass0IT, AnonymousClass302 {
    /* renamed from: B */
    public AnonymousClass5tK f70105B;
    /* renamed from: C */
    public AnonymousClass5LD f70106C;
    /* renamed from: D */
    public String f70107D;
    /* renamed from: E */
    public AnonymousClass0Cm f70108E;
    /* renamed from: F */
    private String f70109F;
    /* renamed from: G */
    private final AnonymousClass0hi f70110G = new AnonymousClass0hi();
    public EmptyStateView mEmptyStateView;
    public AnonymousClass41P mHideAnimationCoordinator;

    public final void Iw(AnonymousClass0MI anonymousClass0MI) {
    }

    public final void Mm(AnonymousClass3Uq anonymousClass3Uq) {
    }

    public final String getModuleName() {
        return "reel_view_reshare_reels";
    }

    public final void kv(AnonymousClass0MI anonymousClass0MI) {
    }

    /* renamed from: B */
    public static void m28643B(ReelResharesViewerFragment reelResharesViewerFragment) {
        reelResharesViewerFragment.f70106C.f62383C = false;
        AnonymousClass0Cn anonymousClass0Cn = reelResharesViewerFragment.f70108E;
        String str = reelResharesViewerFragment.f70109F;
        Object obj = reelResharesViewerFragment.f70106C.f62385E;
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        AnonymousClass0Pt M = anonymousClass0Pt.L("media/%s/feed_to_stories_shares/", new Object[]{str}).M(AnonymousClass3V3.class);
        if (!TextUtils.isEmpty(obj)) {
            M.D("max_id", obj);
        }
        AnonymousClass0GA H = M.H();
        H.f2849B = new AnonymousClass5vm(reelResharesViewerFragment);
        reelResharesViewerFragment.schedule(H);
    }

    /* renamed from: C */
    public static void m28644C(ReelResharesViewerFragment reelResharesViewerFragment) {
        if (reelResharesViewerFragment.mEmptyStateView != null) {
            if (reelResharesViewerFragment.f70105B.isEmpty()) {
                reelResharesViewerFragment.mEmptyStateView.D();
            } else {
                reelResharesViewerFragment.mEmptyStateView.F();
            }
            reelResharesViewerFragment.mEmptyStateView.A();
        }
    }

    public final void cd(AnonymousClass0MI anonymousClass0MI, List list, AnonymousClass304 anonymousClass304, int i, int i2, int i3) {
        View view = anonymousClass304.f36763E;
        List arrayList = new ArrayList();
        AnonymousClass0MI anonymousClass0MI2 = anonymousClass0MI;
        arrayList.add(anonymousClass0MI);
        AnonymousClass0lG O = AnonymousClass0Jd.f2931B.O(getActivity(), this.f70108E);
        view.setVisibility(4);
        list = AnonymousClass0Nm.L(view);
        AnonymousClass5vn anonymousClass5vn = new AnonymousClass5vn(this, arrayList, anonymousClass0MI2, i3, O, view);
        O.E(anonymousClass0MI2, i3, null, list, anonymousClass5vn, 0, AnonymousClass0Qf.RESHARED_REELS_VIEWER);
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.a(getContext().getString(C0164R.string.reel_reshares_viewer_title));
        anonymousClass0eT.n(true);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -693643924);
        super.onCreate(bundle);
        this.f70108E = AnonymousClass0Ce.G(getArguments());
        this.f70109F = getArguments().getString("ReelResharesViewerFragment.MEDIA_ID");
        this.f70107D = UUID.randomUUID().toString();
        this.f70106C = new AnonymousClass5vl(this, this);
        this.f70105B = new AnonymousClass5tK(getContext(), this.f70106C, this);
        this.f70106C.f62382B = this.f70105B;
        setListAdapter(this.f70105B);
        m28643B(this);
        AnonymousClass0cQ.G(this, 1761469970, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 938315448);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_feed, viewGroup, false);
        AnonymousClass0cQ.G(this, 1368450246, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 1650494628);
        super.onDestroyView();
        AnonymousClass0cQ.G(this, 1571143073, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -1524335398);
        super.onPause();
        AnonymousClass0cQ.G(this, 63849862, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -1617683056);
        super.onResume();
        this.mEmptyStateView.N(C0164R.string.reel_reshares_empty_state_title, AnonymousClass2I0.EMPTY);
        AnonymousClass0cQ.G(this, -807043488, F);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, -88796030);
        this.f70110G.onScroll(absListView, i, i2, i3);
        AnonymousClass0cQ.H(this, 794727068, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, 288295590);
        this.f70110G.onScrollStateChanged(absListView, i);
        AnonymousClass0cQ.H(this, 2008907920, I);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f70110G.A(this.f70106C);
        this.mEmptyStateView = (EmptyStateView) getListView().getEmptyView();
        getListView().setOnScrollListener(this);
        m28644C(this);
    }
}

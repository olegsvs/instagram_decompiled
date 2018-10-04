package com.instagram.audience;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Ci;
import X.AnonymousClass0Cm;
import X.AnonymousClass0GA;
import X.AnonymousClass0IL;
import X.AnonymousClass0IT;
import X.AnonymousClass0IZ;
import X.AnonymousClass0Ie;
import X.AnonymousClass0Ii;
import X.AnonymousClass0Jj;
import X.AnonymousClass0Ny;
import X.AnonymousClass0Pt;
import X.AnonymousClass0Pu;
import X.AnonymousClass0Rq;
import X.AnonymousClass0bx;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eT;
import X.AnonymousClass0yJ;
import X.AnonymousClass1Zf;
import X.AnonymousClass2I0;
import X.AnonymousClass2IQ;
import X.AnonymousClass31w;
import X.AnonymousClass31x;
import X.AnonymousClass31z;
import X.AnonymousClass321;
import X.AnonymousClass322;
import X.AnonymousClass323;
import X.AnonymousClass324;
import X.AnonymousClass327;
import X.AnonymousClass328;
import X.AnonymousClass32A;
import X.AnonymousClass32D;
import X.AnonymousClass32E;
import X.AnonymousClass3nX;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.facebook.C0164R;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class FavoritesListFragment extends AnonymousClass0Ie implements OnScrollListener, AnonymousClass0Ii, AnonymousClass327, AnonymousClass0IT, AnonymousClass32D {
    /* renamed from: B */
    public AnonymousClass31z f47286B;
    /* renamed from: C */
    public final List f47287C = new ArrayList();
    /* renamed from: D */
    public AnonymousClass2I0 f47288D;
    /* renamed from: E */
    public final List f47289E = new ArrayList();
    /* renamed from: F */
    public AnonymousClass32E f47290F;
    /* renamed from: G */
    public AnonymousClass1Zf f47291G;
    /* renamed from: H */
    public AnonymousClass0Cm f47292H;
    /* renamed from: I */
    public AnonymousClass31w f47293I;
    /* renamed from: J */
    private boolean f47294J;
    /* renamed from: K */
    private String f47295K;
    public EmptyStateView mEmptyStateView;
    public ListView mList;
    public AnonymousClass328 mListRemovalAnimationShimHolder;
    public AnonymousClass2IQ mRowRemovalAnimator;

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
    }

    public final void tz(AnonymousClass32E anonymousClass32E, AnonymousClass0Ci anonymousClass0Ci, boolean z, AnonymousClass31x anonymousClass31x, String str, int i) {
    }

    /* renamed from: A */
    public final void m21668A(List list, String str) {
        this.f47295K = str;
        AnonymousClass0Rq anonymousClass0Rq = this.f47286B;
        String str2 = this.f47295K;
        anonymousClass0Rq.C();
        int i = 0;
        for (AnonymousClass0Ci B : list) {
            anonymousClass0Rq.B(B, new AnonymousClass32A(i, str2), anonymousClass0Rq.f37149B);
            i++;
        }
        anonymousClass0Rq.E();
        m21666C(this, list.isEmpty() ? AnonymousClass2I0.EMPTY : AnonymousClass2I0.GONE);
    }

    /* renamed from: B */
    public static void m21665B(FavoritesListFragment favoritesListFragment) {
        if (favoritesListFragment.f47291G == AnonymousClass1Zf.MEMBERS) {
            favoritesListFragment.m21668A(favoritesListFragment.f47290F.m18246B(), favoritesListFragment.f47295K);
        } else if (favoritesListFragment.f47291G == AnonymousClass1Zf.SUGGESTIONS) {
            m21667D(favoritesListFragment);
        }
    }

    /* renamed from: C */
    public static void m21666C(FavoritesListFragment favoritesListFragment, AnonymousClass2I0 anonymousClass2I0) {
        favoritesListFragment.f47288D = anonymousClass2I0;
        anonymousClass2I0 = favoritesListFragment.mEmptyStateView;
        if (anonymousClass2I0 != null) {
            anonymousClass2I0.m14967K(favoritesListFragment.f47288D);
        }
    }

    /* renamed from: D */
    public static void m21667D(FavoritesListFragment favoritesListFragment) {
        List<AnonymousClass0Ci> arrayList = new ArrayList();
        for (AnonymousClass0Ci anonymousClass0Ci : favoritesListFragment.f47289E) {
            if (!favoritesListFragment.f47290F.m18249C(anonymousClass0Ci)) {
                arrayList.add(anonymousClass0Ci);
            }
        }
        List<AnonymousClass0Ci> arrayList2 = new ArrayList();
        for (AnonymousClass0Ci anonymousClass0Ci2 : favoritesListFragment.f47287C) {
            if (!(favoritesListFragment.f47290F.m18249C(anonymousClass0Ci2) || arrayList.contains(anonymousClass0Ci2))) {
                arrayList2.add(anonymousClass0Ci2);
            }
        }
        AnonymousClass0Rq anonymousClass0Rq = favoritesListFragment.f47286B;
        anonymousClass0Rq.C();
        if (!arrayList.isEmpty()) {
            anonymousClass0Rq.B(anonymousClass0Rq.f37152E, null, anonymousClass0Rq.f37150C);
        }
        int i = 0;
        for (AnonymousClass0Ci B : arrayList) {
            anonymousClass0Rq.B(B, new AnonymousClass32A(i, "recent"), anonymousClass0Rq.f37149B);
            i++;
        }
        if (!(arrayList.isEmpty() || arrayList2.isEmpty())) {
            anonymousClass0Rq.B(anonymousClass0Rq.f37151D, null, anonymousClass0Rq.f37150C);
        }
        for (AnonymousClass0Ci B2 : arrayList2) {
            anonymousClass0Rq.B(B2, new AnonymousClass32A(i, null), anonymousClass0Rq.f37149B);
            i++;
        }
        anonymousClass0Rq.E();
        AnonymousClass2I0 anonymousClass2I0 = (arrayList.isEmpty() && arrayList2.isEmpty()) ? AnonymousClass2I0.EMPTY : AnonymousClass2I0.GONE;
        m21666C(favoritesListFragment, anonymousClass2I0);
        if (!favoritesListFragment.f47294J && favoritesListFragment.f47290F.f37193B) {
            favoritesListFragment.f47294J = true;
            favoritesListFragment.f47293I.f37141J = arrayList.size() + arrayList2.size();
        }
    }

    public final void DDA(AnonymousClass0Ci anonymousClass0Ci) {
        AnonymousClass0bx C = AnonymousClass0bx.C(this.f47292H, anonymousClass0Ci.getId(), "favorites_user");
        C.f6906F = getModuleName();
        AnonymousClass0IL D = AnonymousClass0Jj.f2938B.B().D(C.A());
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(getActivity());
        anonymousClass0IZ.f2754D = D;
        anonymousClass0IZ.B();
    }

    public final AnonymousClass32E fR() {
        return this.f47290F;
    }

    public final String getModuleName() {
        return this.f47291G == AnonymousClass1Zf.SUGGESTIONS ? "favorites_home_suggestions" : "favorites_home_list";
    }

    public final void nl(AnonymousClass32E anonymousClass32E) {
        m21665B(this);
    }

    public final void oLA() {
        this.mList.smoothScrollToPosition(0);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1119313885);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f47291G = (AnonymousClass1Zf) arguments.getSerializable("tab");
        this.f47292H = AnonymousClass0Ce.G(arguments);
        this.f47286B = new AnonymousClass31z(getContext(), this.f47291G == AnonymousClass1Zf.MEMBERS ? AnonymousClass31x.MEMBER : AnonymousClass31x.SUGGESTION, this);
        AnonymousClass0Pt anonymousClass0Pt;
        AnonymousClass0GA H;
        if (this.f47291G == AnonymousClass1Zf.MEMBERS) {
            m21666C(this, AnonymousClass2I0.LOADING);
            anonymousClass0Pt = new AnonymousClass0Pt(this.f47292H);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
            anonymousClass0Pt.f4229M = "friendships/besties/";
            anonymousClass0Pt.f4219C = "favorites_v1";
            anonymousClass0Pt.f4220D = AnonymousClass0Ny.UseCacheWithTimeout;
            H = anonymousClass0Pt.M(AnonymousClass3nX.class).H();
            H.f2849B = new AnonymousClass321(this);
            schedule(H);
        } else {
            m21666C(this, AnonymousClass2I0.LOADING);
            anonymousClass0Pt = new AnonymousClass0Pt(this.f47292H);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
            anonymousClass0Pt.f4229M = "friendships/bestie_suggestions/";
            anonymousClass0Pt.f4219C = "favorites_suggestions";
            anonymousClass0Pt.f4220D = AnonymousClass0Ny.UseCacheWithTimeout;
            H = anonymousClass0Pt.M(AnonymousClass3nX.class).H();
            H.f2849B = new AnonymousClass322(this);
            schedule(H);
            AnonymousClass0Cm anonymousClass0Cm = this.f47292H;
            Object obj = (AnonymousClass0yJ.I(anonymousClass0Cm) && ((Boolean) AnonymousClass0CC.ZE.H(anonymousClass0Cm)).booleanValue()) ? 1 : null;
            if (obj != null) {
                anonymousClass0Pt = new AnonymousClass0Pt(this.f47292H);
                anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
                anonymousClass0Pt.f4229M = "friendships/recent_bestie_suggestions/";
                anonymousClass0Pt.f4219C = "favorites_recent_suggestions";
                anonymousClass0Pt.f4220D = AnonymousClass0Ny.UseCacheWithTimeout;
                H = anonymousClass0Pt.M(AnonymousClass3nX.class).H();
                H.f2849B = new AnonymousClass323(this);
                schedule(H);
            }
        }
        AnonymousClass0cQ.G(this, -1437058869, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -956417646);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0164R.layout.layout_refreshablelistview_with_empty_state, viewGroup, false);
        this.mList = (ListView) viewGroup2.findViewById(16908298);
        EmptyStateView emptyStateView = (EmptyStateView) viewGroup2.findViewById(16908292);
        this.mEmptyStateView = emptyStateView;
        emptyStateView.m14968L(AnonymousClass0yJ.I(this.f47292H) ? C0164R.string.close_friends_home_empty_state_text_v4 : C0164R.string.close_friends_home_empty_state_text, AnonymousClass2I0.EMPTY);
        this.mList.setAdapter(this.f47286B);
        this.mRowRemovalAnimator = new AnonymousClass2IQ(this.mList, this.f47286B);
        AnonymousClass0cQ.G(this, 1976159995, F);
        return viewGroup2;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 458356097);
        super.onDestroyView();
        FavoritesListFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, -326760668, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 36407831);
        super.onPause();
        this.f47290F.m18250D(this);
        getListView().setOnScrollListener(null);
        AnonymousClass0cQ.G(this, 1306007062, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -551132904);
        super.onResume();
        this.f47290F.f37194C.add(new WeakReference(this));
        getListView().setOnScrollListener(this);
        AnonymousClass0cQ.G(this, 1149075795, F);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, -1478236253);
        if (this.f47291G == AnonymousClass1Zf.SUGGESTIONS) {
            AnonymousClass31w anonymousClass31w = this.f47293I;
            anonymousClass31w.f37142K = Math.max(i + i2, anonymousClass31w.f37142K);
        }
        AnonymousClass0cQ.H(this, 1552018644, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        AnonymousClass0cQ.H(this, 485932742, AnonymousClass0cQ.I(this, 327382563));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view = this.mEmptyStateView;
        if (view != null) {
            view.m14967K(this.f47288D);
        }
    }

    public final void zCA(AnonymousClass328 anonymousClass328, AnonymousClass0Ci anonymousClass0Ci, boolean z, AnonymousClass31x anonymousClass31x, int i, String str) {
        FavoritesListFragment favoritesListFragment = this;
        if (!this.mRowRemovalAnimator.f28676C) {
            AnonymousClass0Ci anonymousClass0Ci2 = anonymousClass0Ci;
            this.mRowRemovalAnimator.m14985A(300, anonymousClass328.f37183F, new AnonymousClass324(favoritesListFragment, anonymousClass0Ci2, anonymousClass31x, i, str));
            favoritesListFragment.f47290F.m18251E(anonymousClass0Ci2, z, anonymousClass31x, i, str);
        }
    }
}

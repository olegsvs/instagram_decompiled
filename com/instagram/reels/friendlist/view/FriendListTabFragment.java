package com.instagram.reels.friendlist.view;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Ci;
import X.AnonymousClass0Cm;
import X.AnonymousClass0IT;
import X.AnonymousClass0Ie;
import X.AnonymousClass0Ii;
import X.AnonymousClass0Rq;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eT;
import X.AnonymousClass1BN;
import X.AnonymousClass1ab;
import X.AnonymousClass2I0;
import X.AnonymousClass2IQ;
import X.AnonymousClass5AW;
import X.AnonymousClass5Ak;
import X.AnonymousClass5Al;
import X.AnonymousClass5An;
import X.AnonymousClass5Ao;
import X.AnonymousClass5Av;
import X.AnonymousClass5Aw;
import X.AnonymousClass5Ax;
import X.AnonymousClass5BE;
import X.AnonymousClass5BF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

public class FriendListTabFragment extends AnonymousClass0Ie implements OnScrollListener, AnonymousClass0Ii, AnonymousClass5Ak, AnonymousClass0IT, AnonymousClass5BE {
    /* renamed from: B */
    public AnonymousClass5AW f66440B;
    /* renamed from: C */
    public AnonymousClass2I0 f66441C = AnonymousClass2I0.EMPTY;
    /* renamed from: D */
    public boolean f66442D;
    /* renamed from: E */
    public String f66443E;
    /* renamed from: F */
    public final List f66444F = new ArrayList();
    /* renamed from: G */
    public AnonymousClass5BF f66445G;
    /* renamed from: H */
    public AnonymousClass0Cm f66446H;
    /* renamed from: I */
    private AnonymousClass5Av f66447I;
    public EmptyStateView mEmptyStateView;
    public ListView mList;
    public AnonymousClass5Al mListRemovalAnimationShimHolder;
    public AnonymousClass2IQ mRowRemovalAnimator;

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
    }

    public final void uz(AnonymousClass5BF anonymousClass5BF, AnonymousClass0Ci anonymousClass0Ci, boolean z, AnonymousClass5An anonymousClass5An, String str, int i) {
    }

    public final void ADA(AnonymousClass5Al anonymousClass5Al, AnonymousClass0Ci anonymousClass0Ci, boolean z, AnonymousClass5An anonymousClass5An, int i, String str) {
        m27647C(anonymousClass5Al, anonymousClass0Ci, z, anonymousClass5An, i, str);
    }

    /* renamed from: B */
    public static void m27646B(FriendListTabFragment friendListTabFragment) {
        List<AnonymousClass0Ci> A;
        AnonymousClass0Rq anonymousClass0Rq;
        String str;
        EmptyStateView emptyStateView;
        if (friendListTabFragment.f66447I == AnonymousClass5Av.MEMBERS) {
            A = friendListTabFragment.f66445G.m25929A();
            friendListTabFragment.f66443E = friendListTabFragment.f66443E;
            anonymousClass0Rq = friendListTabFragment.f66440B;
            str = friendListTabFragment.f66443E;
            anonymousClass0Rq.C();
            int i = 0;
            for (AnonymousClass0Ci B : A) {
                anonymousClass0Rq.B(B, new AnonymousClass5Ao(i, str), anonymousClass0Rq.f60811B);
                i++;
            }
            anonymousClass0Rq.E();
            friendListTabFragment.f66441C = A.isEmpty() ? AnonymousClass2I0.EMPTY : AnonymousClass2I0.GONE;
            emptyStateView = friendListTabFragment.mEmptyStateView;
            if (emptyStateView != null) {
                emptyStateView.K(friendListTabFragment.f66441C);
            }
        } else if (friendListTabFragment.f66447I == AnonymousClass5Av.SUGGESTIONS) {
            String str2;
            Collection linkedHashSet = new LinkedHashSet();
            String str3 = (String) AnonymousClass0CC.UB.H(friendListTabFragment.f66446H);
            AnonymousClass1BN C = AnonymousClass1BN.C(friendListTabFragment.f66446H);
            C.B(str3, JsonProperty.USE_DEFAULT_NAME, linkedHashSet, new AnonymousClass5Aw(friendListTabFragment));
            A = new ArrayList(linkedHashSet);
            C.D(str3, A, null);
            List<AnonymousClass0Ci> arrayList = new ArrayList();
            for (AnonymousClass0Ci anonymousClass0Ci : friendListTabFragment.f66444F) {
                if (!friendListTabFragment.f66445G.m25930B(anonymousClass0Ci)) {
                    arrayList.add(anonymousClass0Ci);
                }
            }
            AnonymousClass1ab D = AnonymousClass1BN.D(C, str3);
            if (D != null) {
                str2 = D.f20361C;
            } else {
                str2 = null;
            }
            friendListTabFragment.f66443E = str2;
            anonymousClass0Rq = friendListTabFragment.f66440B;
            str = friendListTabFragment.f66443E;
            anonymousClass0Rq.C();
            if (!arrayList.isEmpty()) {
                anonymousClass0Rq.B(anonymousClass0Rq.f60814E, null, anonymousClass0Rq.f60812C);
            }
            int i2 = 0;
            for (AnonymousClass0Ci B2 : arrayList) {
                anonymousClass0Rq.B(B2, new AnonymousClass5Ao(i2, "recent"), anonymousClass0Rq.f60811B);
                i2++;
            }
            if (!(arrayList.isEmpty() || A.isEmpty())) {
                anonymousClass0Rq.B(anonymousClass0Rq.f60813D, null, anonymousClass0Rq.f60812C);
            }
            for (AnonymousClass0Ci B22 : A) {
                anonymousClass0Rq.B(B22, new AnonymousClass5Ao(i2, str), anonymousClass0Rq.f60811B);
                i2++;
            }
            anonymousClass0Rq.E();
            AnonymousClass2I0 anonymousClass2I0 = (arrayList.isEmpty() && A.isEmpty()) ? AnonymousClass2I0.EMPTY : AnonymousClass2I0.GONE;
            friendListTabFragment.f66441C = anonymousClass2I0;
            emptyStateView = friendListTabFragment.mEmptyStateView;
            if (emptyStateView != null) {
                emptyStateView.K(friendListTabFragment.f66441C);
            }
            if (!friendListTabFragment.f66442D && friendListTabFragment.f66445G.f60919B) {
                friendListTabFragment.f66442D = true;
            }
        }
    }

    /* renamed from: C */
    private void m27647C(AnonymousClass5Al anonymousClass5Al, AnonymousClass0Ci anonymousClass0Ci, boolean z, AnonymousClass5An anonymousClass5An, int i, String str) {
        FriendListTabFragment friendListTabFragment = this;
        if (!this.mRowRemovalAnimator.f28676C) {
            AnonymousClass0Ci anonymousClass0Ci2 = anonymousClass0Ci;
            this.mRowRemovalAnimator.A(300, anonymousClass5Al.f60850F, new AnonymousClass5Ax(friendListTabFragment, anonymousClass0Ci2, anonymousClass5An, i, str));
            friendListTabFragment.f66445G.m25932D(anonymousClass0Ci2, z, anonymousClass5An, i, str);
        }
    }

    public final void CDA(AnonymousClass5Al anonymousClass5Al, AnonymousClass0Ci anonymousClass0Ci, boolean z, AnonymousClass5An anonymousClass5An, int i, String str) {
        m27647C(anonymousClass5Al, anonymousClass0Ci, z, anonymousClass5An, i, str);
    }

    public final void Xz(AnonymousClass5BF anonymousClass5BF) {
        m27646B(this);
    }

    public final AnonymousClass5BF gR() {
        return this.f66445G;
    }

    public final String getModuleName() {
        String str = this.f66447I == AnonymousClass5Av.SUGGESTIONS ? "suggestions" : "list";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("audience_sticker_");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public final void oLA() {
        this.mList.smoothScrollToPosition(0);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 725818627);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f66447I = (AnonymousClass5Av) arguments.getSerializable("tab");
        this.f66446H = AnonymousClass0Ce.G(arguments);
        this.f66440B = new AnonymousClass5AW(getContext(), this.f66447I == AnonymousClass5Av.MEMBERS ? AnonymousClass5An.MEMBER : AnonymousClass5An.SUGGESTION, this);
        AnonymousClass0cQ.G(this, -496619970, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1393475746);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0164R.layout.layout_refreshablelistview_with_empty_state, viewGroup, false);
        this.mList = (ListView) viewGroup2.findViewById(16908298);
        this.mEmptyStateView = (EmptyStateView) viewGroup2.findViewById(16908292);
        this.mList.setAdapter(this.f66440B);
        this.mRowRemovalAnimator = new AnonymousClass2IQ(this.mList, this.f66440B);
        AnonymousClass0cQ.G(this, 974586651, F);
        return viewGroup2;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 23818262);
        super.onDestroyView();
        FriendListTabFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, -211944794, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 2028915228);
        super.onPause();
        this.f66445G.m25931C(this);
        getListView().setOnScrollListener(null);
        AnonymousClass0cQ.G(this, 508692021, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -219751354);
        super.onResume();
        this.f66445G.f60920C.add(new WeakReference(this));
        getListView().setOnScrollListener(this);
        m27646B(this);
        AnonymousClass0cQ.G(this, 1440889310, F);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AnonymousClass0cQ.H(this, 38041688, AnonymousClass0cQ.I(this, -1160129134));
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        AnonymousClass0cQ.H(this, -504552169, AnonymousClass0cQ.I(this, 1723238280));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view = this.mEmptyStateView;
        if (view != null) {
            view.K(this.f66441C);
        }
    }
}

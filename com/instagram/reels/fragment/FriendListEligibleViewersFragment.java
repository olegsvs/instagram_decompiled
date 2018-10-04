package com.instagram.reels.fragment;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Cn;
import X.AnonymousClass0GA;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IT;
import X.AnonymousClass0Pt;
import X.AnonymousClass0Pu;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eT;
import X.AnonymousClass0ea;
import X.AnonymousClass0rr;
import X.AnonymousClass3ay;
import X.AnonymousClass5uh;
import X.AnonymousClass5ui;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;

public class FriendListEligibleViewersFragment extends AnonymousClass0IJ implements AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass5ui f69962B;
    /* renamed from: C */
    public String f69963C;
    /* renamed from: D */
    public AnonymousClass0Cm f69964D;
    public View mLoadingView;
    public RecyclerView mRecyclerView;

    public final String getModuleName() {
        return "friend-sticker-eligible-viewers";
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.a(getContext().getString(C0164R.string.viewer_list_friend_list_fragment_title));
        anonymousClass0eT.n(true);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 2128726245);
        super.onCreate(bundle);
        this.f69964D = AnonymousClass0Ce.G(getArguments());
        this.f69963C = getArguments().getString("FriendListEligibleViewersFragment.MEDIA_ID");
        this.f69962B = new AnonymousClass5ui();
        AnonymousClass0cQ.G(this, 751725986, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -894876972);
        View inflate = layoutInflater.inflate(C0164R.layout.friend_list_eligible_viewers, viewGroup, false);
        AnonymousClass0cQ.G(this, -1687257600, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -1937613402);
        super.onDestroyView();
        AnonymousClass0ea.E(Z().getWindow(), getView(), true);
        FriendListEligibleViewersFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, 559176950, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 1957905993);
        super.onResume();
        AnonymousClass0ea.E(Z().getWindow(), getView(), false);
        AnonymousClass0cQ.G(this, 1274097767, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mRecyclerView = (RecyclerView) view.findViewById(C0164R.id.recycler_view);
        this.mLoadingView = view.findViewById(C0164R.id.loading_view);
        this.mRecyclerView.setAdapter(this.f69962B);
        this.mRecyclerView.setLayoutManager(new AnonymousClass0rr(getContext()));
        this.mRecyclerView.setVisibility(8);
        this.mLoadingView.setVisibility(0);
        AnonymousClass0Cn anonymousClass0Cn = this.f69964D;
        String str = this.f69963C;
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        AnonymousClass0GA H = anonymousClass0Pt.L("friendships/friends_lists/%s/eligible_viewers/", new Object[]{str}).M(AnonymousClass3ay.class).H();
        H.f2849B = new AnonymousClass5uh(this);
        schedule(H);
    }
}

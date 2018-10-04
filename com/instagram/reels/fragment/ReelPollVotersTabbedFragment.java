package com.instagram.reels.fragment;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Hj;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0IT;
import X.AnonymousClass0MB;
import X.AnonymousClass0MI;
import X.AnonymousClass0Pj;
import X.AnonymousClass0bw;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eT;
import X.AnonymousClass161;
import X.AnonymousClass1Ay;
import X.AnonymousClass1LM;
import X.AnonymousClass1LP;
import X.AnonymousClass5vf;
import X.AnonymousClass6Ep;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;
import java.util.List;

public class ReelPollVotersTabbedFragment extends AnonymousClass0IJ implements AnonymousClass0bw, AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass5vf f70077B = AnonymousClass5vf.FIRST_OPTION;
    /* renamed from: C */
    private String f70078C;
    /* renamed from: D */
    private String f70079D;
    /* renamed from: E */
    private final List f70080E = new ArrayList();
    public FixedTabBar mTabBar;
    public AnonymousClass1LM mTabController;
    public ViewPager mViewPager;

    public final String getModuleName() {
        return "reel_poll_voters_tabs";
    }

    public ReelPollVotersTabbedFragment() {
        String str = JsonProperty.USE_DEFAULT_NAME;
        this.f70078C = str;
        this.f70079D = str;
    }

    /* renamed from: B */
    private static AnonymousClass0IL m28639B(ReelPollVotersTabbedFragment reelPollVotersTabbedFragment, int i) {
        Bundle bundle = new Bundle();
        bundle.putAll(reelPollVotersTabbedFragment.getArguments());
        bundle.putInt("ReelPollVotersListFragment.POLL_OPTION_INDEX", i);
        AnonymousClass0IL anonymousClass6Ep = new AnonymousClass6Ep();
        anonymousClass6Ep.setArguments(bundle);
        return anonymousClass6Ep;
    }

    /* renamed from: C */
    private void m28640C(int i) {
        if (Z() instanceof AnonymousClass0Hj) {
            ((AnonymousClass0Hj) Z()).CSA(i);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0IL aF(Object obj) {
        return m28641b((AnonymousClass5vf) obj);
    }

    /* renamed from: b */
    public final AnonymousClass0IL m28641b(AnonymousClass5vf anonymousClass5vf) {
        switch (anonymousClass5vf.ordinal()) {
            case 0:
                return m28639B(this, 0);
            case 1:
                return m28639B(this, 1);
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("illegal tab: ");
                stringBuilder.append(anonymousClass5vf);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: c */
    public final AnonymousClass1LP m28642c(AnonymousClass5vf anonymousClass5vf) {
        switch (anonymousClass5vf.ordinal()) {
            case 0:
                return AnonymousClass1LP.C(this.f70078C);
            case 1:
                return AnonymousClass1LP.C(this.f70079D);
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("illegal tab: ");
                stringBuilder.append(anonymousClass5vf);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.a(getContext().getString(C0164R.string.reel_poll_voters_list_title));
        anonymousClass0eT.n(true);
    }

    public final /* bridge */ /* synthetic */ void oCA(Object obj) {
        this.f70077B = (AnonymousClass5vf) obj;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -323048860);
        super.onCreate(bundle);
        AnonymousClass0Cm G = AnonymousClass0Ce.G(getArguments());
        String string = getArguments().getString("ReelPollVotersListFragment.REEL_ID");
        String string2 = getArguments().getString("ReelPollVotersListFragment.REEL_ITEM_ID");
        AnonymousClass0MI D = AnonymousClass0MB.C(G).D(string);
        if (D != null) {
            for (AnonymousClass0Pj anonymousClass0Pj : D.F()) {
                if (anonymousClass0Pj.getId().equals(string2)) {
                    break;
                }
            }
        }
        AnonymousClass0Pj anonymousClass0Pj2 = null;
        if (anonymousClass0Pj2 != null) {
            List list = AnonymousClass161.E(anonymousClass0Pj2).f14398E;
            this.f70078C = ((AnonymousClass1Ay) list.get(0)).f15351D;
            this.f70079D = ((AnonymousClass1Ay) list.get(1)).f15351D;
        }
        this.f70080E.add(AnonymousClass5vf.FIRST_OPTION);
        this.f70080E.add(AnonymousClass5vf.SECOND_OPTION);
        AnonymousClass0cQ.G(this, -1609783365, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 860003151);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_reel_poll_voters_tabbed_fragment, viewGroup, false);
        AnonymousClass0cQ.G(this, -62047952, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -1784854243);
        super.onDestroyView();
        this.mTabController = null;
        this.mTabBar = null;
        this.mViewPager = null;
        AnonymousClass0cQ.G(this, -1664960007, F);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, -923288217);
        super.onStart();
        m28640C(8);
        AnonymousClass0cQ.G(this, 118682932, F);
    }

    public final void onStop() {
        int F = AnonymousClass0cQ.F(this, -769748780);
        super.onStart();
        m28640C(0);
        AnonymousClass0cQ.G(this, 123659389, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mTabBar = (FixedTabBar) view.findViewById(C0164R.id.fixed_tabbar_view);
        this.mViewPager = (ViewPager) view.findViewById(C0164R.id.view_pager);
        AnonymousClass1LM anonymousClass1LM = new AnonymousClass1LM(this, getChildFragmentManager(), this.mViewPager, this.mTabBar, this.f70080E);
        this.mTabController = anonymousClass1LM;
        anonymousClass1LM.O(this.f70077B);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1LP vF(Object obj) {
        return m28642c((AnonymousClass5vf) obj);
    }
}

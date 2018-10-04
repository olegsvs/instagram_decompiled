package com.instagram.genericsurvey.fragment;

import X.AnonymousClass0Cm;
import X.AnonymousClass0IU;
import X.AnonymousClass0mS;
import X.AnonymousClass5iO;
import android.content.Context;
import com.instagram.ui.viewpager.BakeOffViewPager;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;
import java.util.List;

public class BakeoffFeedPairSectionController implements AnonymousClass0mS {
    /* renamed from: B */
    public final Context f68378B;
    /* renamed from: C */
    public final AdBakeOffFragment f68379C;
    /* renamed from: D */
    public List f68380D = new ArrayList();
    /* renamed from: E */
    public final AnonymousClass0Cm f68381E;
    public FixedTabBar mFixedTabBar;
    public BakeOffViewPager mFragmentPager;
    public AnonymousClass5iO mPagerAdapter;

    public BakeoffFeedPairSectionController(AdBakeOffFragment adBakeOffFragment, AnonymousClass0IU anonymousClass0IU, AnonymousClass0Cm anonymousClass0Cm, Context context) {
        this.f68379C = adBakeOffFragment;
        this.mPagerAdapter = new AnonymousClass5iO(this, anonymousClass0IU);
        this.f68381E = anonymousClass0Cm;
        this.f68378B = context;
    }

    public final void hPA(int i) {
        this.mFragmentPager.P(i, true);
        this.mFixedTabBar.A(i);
    }
}

package com.instagram.genericsurvey.fragment;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0GA;
import X.AnonymousClass0Hj;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0IS;
import X.AnonymousClass0IT;
import X.AnonymousClass0IZ;
import X.AnonymousClass0Jd;
import X.AnonymousClass0MI;
import X.AnonymousClass0PZ;
import X.AnonymousClass0Qf;
import X.AnonymousClass0ST;
import X.AnonymousClass0TK;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eT;
import X.AnonymousClass0lG;
import X.AnonymousClass1Q8;
import X.AnonymousClass3QI;
import X.AnonymousClass3QN;
import X.AnonymousClass3QO;
import X.AnonymousClass4ro;
import X.AnonymousClass4rp;
import X.AnonymousClass4rq;
import X.AnonymousClass4rs;
import X.AnonymousClass5i3;
import X.AnonymousClass5i4;
import X.AnonymousClass5i5;
import X.AnonymousClass5i6;
import X.AnonymousClass5i7;
import X.AnonymousClass5i8;
import X.AnonymousClass5i9;
import X.AnonymousClass5iA;
import X.AnonymousClass5iD;
import X.AnonymousClass5iE;
import X.AnonymousClass5iF;
import X.AnonymousClass5iJ;
import X.AnonymousClass5iM;
import X.AnonymousClass5iN;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.ui.viewpager.BakeOffViewPager;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class AdBakeOffFragment extends AnonymousClass0IJ implements AnonymousClass0PZ, AnonymousClass0IS, AnonymousClass0IT, AnonymousClass5iD, AnonymousClass4ro {
    /* renamed from: B */
    public AnonymousClass5i3 f73004B;
    /* renamed from: C */
    public int f73005C;
    /* renamed from: D */
    public final List f73006D = new ArrayList();
    /* renamed from: E */
    public final List f73007E = new ArrayList();
    /* renamed from: F */
    public String f73008F;
    /* renamed from: G */
    public AnonymousClass3QO f73009G;
    /* renamed from: H */
    public final Set f73010H = new HashSet();
    /* renamed from: I */
    private String f73011I;
    /* renamed from: J */
    private final String f73012J = UUID.randomUUID().toString();
    /* renamed from: K */
    private AnonymousClass0Cm f73013K;
    public AnonymousClass5i8 mAnswerButtonController;
    public BakeoffFeedPairSectionController mBakeoffFeedPairSectionController;
    public AnonymousClass5iA mBakeoffStoryPairSectionController;
    public ViewGroup mContentContainer;
    public SpinnerImageView mLoadingSpinner;
    public AnonymousClass5iE mNavbarController;
    public ViewGroup mRetryView;
    public ViewStub mRetryViewStub;

    public final void Wg() {
    }

    public final String getModuleName() {
        return "hot_or_not";
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    /* renamed from: B */
    public static void m29489B(AdBakeOffFragment adBakeOffFragment) {
        AnonymousClass0GA B = AnonymousClass5i5.m28317B(adBakeOffFragment.f73013K, "bakeoff", adBakeOffFragment.f73011I);
        B.f2849B = new AnonymousClass5iJ(adBakeOffFragment);
        adBakeOffFragment.schedule(B);
    }

    /* renamed from: C */
    public static AlphaAnimation m29490C(float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setDuration(400);
        alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        return alphaAnimation;
    }

    /* renamed from: D */
    public static AnonymousClass0lG m29491D(AdBakeOffFragment adBakeOffFragment) {
        return AnonymousClass0Jd.f2931B.O(adBakeOffFragment.getActivity(), adBakeOffFragment.f73013K);
    }

    /* renamed from: E */
    public static void m29492E(AdBakeOffFragment adBakeOffFragment) {
        adBakeOffFragment.mLoadingSpinner.setVisibility(8);
        adBakeOffFragment.mContentContainer.setVisibility(0);
        FixedTabBar fixedTabBar;
        if (AnonymousClass3QN.BAKEOFF_FEED_ITEM.equals(adBakeOffFragment.f73009G.f41145I)) {
            BakeoffFeedPairSectionController bakeoffFeedPairSectionController = adBakeOffFragment.mBakeoffFeedPairSectionController;
            ViewGroup viewGroup = adBakeOffFragment.mContentContainer;
            View inflate = LayoutInflater.from(bakeoffFeedPairSectionController.f68378B).inflate(C0164R.layout.bakeoff_feed_pair_section, viewGroup, false);
            fixedTabBar = (FixedTabBar) inflate.findViewById(C0164R.id.hon_tabbar);
            bakeoffFeedPairSectionController.mFixedTabBar = fixedTabBar;
            fixedTabBar.setDelegate(bakeoffFeedPairSectionController);
            bakeoffFeedPairSectionController.mFixedTabBar.setTabs(new AnonymousClass5iM(bakeoffFeedPairSectionController));
            bakeoffFeedPairSectionController.mFragmentPager = (BakeOffViewPager) inflate.findViewById(C0164R.id.layout_container_main);
            viewGroup.addView(inflate);
            viewGroup.invalidate();
            BakeoffFeedPairSectionController bakeoffFeedPairSectionController2 = adBakeOffFragment.mBakeoffFeedPairSectionController;
            bakeoffFeedPairSectionController2.mFragmentPager.setAdapter(bakeoffFeedPairSectionController2.mPagerAdapter);
            bakeoffFeedPairSectionController2.mFragmentPager.B(new AnonymousClass5iN(bakeoffFeedPairSectionController2));
            bakeoffFeedPairSectionController2.mFragmentPager.B(bakeoffFeedPairSectionController2.mFixedTabBar);
            bakeoffFeedPairSectionController2.mFragmentPager.setVisibility(0);
            bakeoffFeedPairSectionController2 = adBakeOffFragment.mBakeoffFeedPairSectionController;
            bakeoffFeedPairSectionController2.f68380D = (List) adBakeOffFragment.f73007E.get(adBakeOffFragment.f73005C);
            bakeoffFeedPairSectionController2.mPagerAdapter.C();
            adBakeOffFragment.mAnswerButtonController.m28318A(inflate);
        } else if (AnonymousClass3QN.BAKEOFF_REEL.equals(adBakeOffFragment.f73009G.f41145I)) {
            AnonymousClass5iA anonymousClass5iA = adBakeOffFragment.mBakeoffStoryPairSectionController;
            ViewGroup viewGroup2 = adBakeOffFragment.mContentContainer;
            View inflate2 = LayoutInflater.from(anonymousClass5iA.f68349B).inflate(C0164R.layout.bakeoff_story_pair_section, viewGroup2, false);
            View findViewById = inflate2.findViewById(C0164R.id.reel_preview_hint_container);
            anonymousClass5iA.f68351D = findViewById;
            findViewById.setTag(AnonymousClass4rs.m25227C(findViewById));
            fixedTabBar = (FixedTabBar) inflate2.findViewById(C0164R.id.hon_tabbar);
            anonymousClass5iA.f68350C = fixedTabBar;
            fixedTabBar.setDelegate(anonymousClass5iA);
            anonymousClass5iA.f68350C.setTabs(new AnonymousClass5i9(anonymousClass5iA));
            anonymousClass5iA.f68353F = inflate2.findViewById(C0164R.id.reel_preview_left);
            anonymousClass5iA.f68354G = inflate2.findViewById(C0164R.id.reel_preview_right);
            findViewById = anonymousClass5iA.f68353F;
            findViewById.setTag(AnonymousClass4rq.m25224C(findViewById));
            findViewById = anonymousClass5iA.f68354G;
            findViewById.setTag(AnonymousClass4rq.m25224C(findViewById));
            anonymousClass5iA.f68355H = inflate2.findViewById(C0164R.id.reel_previews_container);
            viewGroup2.addView(inflate2);
            viewGroup2.invalidate();
            adBakeOffFragment.mBakeoffStoryPairSectionController.m28321B((List) adBakeOffFragment.f73007E.get(adBakeOffFragment.f73005C));
            adBakeOffFragment.mBakeoffStoryPairSectionController.m28320A();
            adBakeOffFragment.mAnswerButtonController.m28318A(adBakeOffFragment.mContentContainer);
        }
        AnonymousClass5i8 anonymousClass5i8 = adBakeOffFragment.mAnswerButtonController;
        anonymousClass5i8.f68346G.getPaint().setFakeBoldText(true);
        anonymousClass5i8.f68346G.setText(anonymousClass5i8.f68344E.getResources().getString(C0164R.string.survey_question));
        int i = 0;
        for (TextView textView : anonymousClass5i8.f68343D) {
            int i2 = i + 1;
            textView.getPaint().setFakeBoldText(true);
            textView.setOnTouchListener(new AnonymousClass5i6(anonymousClass5i8, textView, i));
            textView.setOnClickListener(new AnonymousClass5i7(anonymousClass5i8, i));
            i = i2;
        }
        adBakeOffFragment.mAnswerButtonController.m28319B(false);
        m29494G(adBakeOffFragment, 0, true, true);
    }

    /* renamed from: F */
    public static boolean m29493F(AdBakeOffFragment adBakeOffFragment) {
        return adBakeOffFragment.f73007E.isEmpty() ^ 1;
    }

    /* renamed from: G */
    public static void m29494G(AdBakeOffFragment adBakeOffFragment, int i, boolean z, boolean z2) {
        if (AnonymousClass3QN.BAKEOFF_FEED_ITEM.equals(adBakeOffFragment.f73009G.f41145I)) {
            if (z2) {
                adBakeOffFragment.mBakeoffFeedPairSectionController.mFragmentPager.startAnimation(m29490C(0.0f, 1.0f));
            }
            adBakeOffFragment.f73010H.add(String.valueOf(i));
            adBakeOffFragment.mBakeoffFeedPairSectionController.hPA(i);
            if (z) {
                if (m29493F(adBakeOffFragment)) {
                    AnonymousClass5i4.m28315C(((AnonymousClass3QI) ((List) adBakeOffFragment.f73007E.get(adBakeOffFragment.f73005C)).get(i)).f41108B, adBakeOffFragment, "switch", (String) adBakeOffFragment.f73006D.get(adBakeOffFragment.f73005C), adBakeOffFragment.f73008F);
                }
            }
        } else {
            AnonymousClass5iA anonymousClass5iA = adBakeOffFragment.mBakeoffStoryPairSectionController;
            Set set = adBakeOffFragment.f73010H;
            for (int i2 = 0; i2 < anonymousClass5iA.f68352E.size(); i2++) {
                if (set.contains(((AnonymousClass0MI) anonymousClass5iA.f68352E.get(i2)).getId())) {
                    FixedTabBar fixedTabBar = anonymousClass5iA.f68350C;
                    int i3 = i2;
                    if (fixedTabBar.f17431D) {
                        i3 = (fixedTabBar.f17435H.size() - 1) - i2;
                    }
                    ((View) fixedTabBar.f17435H.get(i3)).setSelected(true);
                }
            }
        }
        adBakeOffFragment.mAnswerButtonController.m28319B(adBakeOffFragment.f73010H.size() == ((List) adBakeOffFragment.f73007E.get(adBakeOffFragment.f73005C)).size());
    }

    /* renamed from: H */
    public static void m29495H(AdBakeOffFragment adBakeOffFragment) {
        AnonymousClass5i3 anonymousClass5i3 = adBakeOffFragment.f73004B;
        anonymousClass5i3.f68334B = System.currentTimeMillis();
        anonymousClass5i3.f68335C = 0;
        AnonymousClass0eT.D(((BaseFragmentActivity) adBakeOffFragment.getActivity()).FI());
    }

    /* renamed from: I */
    private void m29496I(int i) {
        if (Z() instanceof AnonymousClass0Hj) {
            ((AnonymousClass0Hj) Z()).CSA(i);
        }
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        AnonymousClass0eT anonymousClass0eT2 = anonymousClass0eT;
        this.mNavbarController.m28323B(anonymousClass0eT);
        if (m29493F(this)) {
            this.mNavbarController.m28322A(anonymousClass0eT2, this.f73009G.f41142F, false, true, false);
            this.mNavbarController.m28324C(this.f73005C, 0, this.f73007E.size());
        }
    }

    public final void of() {
        getFragmentManager().L();
    }

    public final boolean onBackPressed() {
        return m29491D(this).I();
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 340336413);
        super.onCreate(bundle);
        this.f73011I = getArguments().getString("AdBakeOffFragment.EXTRA_DATA_TOKEN");
        this.f73013K = AnonymousClass0Ce.G(getArguments());
        this.mNavbarController = new AnonymousClass5iE(this, getResources());
        this.mBakeoffFeedPairSectionController = new BakeoffFeedPairSectionController(this, getChildFragmentManager(), this.f73013K, getContext());
        this.mBakeoffStoryPairSectionController = new AnonymousClass5iA(this, getContext(), this.f73013K);
        this.mAnswerButtonController = new AnonymousClass5i8(this, getContext());
        AnonymousClass0TK anonymousClass5i3 = new AnonymousClass5i3();
        this.f73004B = anonymousClass5i3;
        registerLifecycleListener(anonymousClass5i3);
        m29489B(this);
        AnonymousClass0cQ.G(this, -411579094, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1646194751);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_bakeoff, viewGroup, false);
        this.mContentContainer = (ViewGroup) inflate.findViewById(C0164R.id.content_container);
        this.mRetryViewStub = (ViewStub) inflate.findViewById(C0164R.id.hon_retry);
        this.mLoadingSpinner = (SpinnerImageView) inflate.findViewById(C0164R.id.loading_spinner);
        AnonymousClass0cQ.G(this, -165966369, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, -747023049);
        super.onDestroy();
        AdBakeOffFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, 1619897403, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -862421504);
        super.onDestroyView();
        AnonymousClass0cQ.G(this, -714016331, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 1915298365);
        super.onResume();
        if (m29491D(this).G()) {
            m29491D(this).D(null, null, new AnonymousClass5iF(this));
        }
        m29496I(8);
        AnonymousClass0cQ.G(this, -110589235, F);
    }

    public final void onStop() {
        int F = AnonymousClass0cQ.F(this, -117066865);
        super.onStop();
        m29496I(0);
        AnonymousClass0cQ.G(this, -1732084279, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (m29493F(this)) {
            m29492E(this);
        }
    }

    public final void zv(AnonymousClass0MI anonymousClass0MI, AnonymousClass4rp anonymousClass4rp, List list) {
        this.f73010H.add(anonymousClass0MI.getId());
        AnonymousClass0ST H = AnonymousClass0Jd.f2931B.H();
        AnonymousClass1Q8 B = new AnonymousClass1Q8().B(list, anonymousClass0MI.getId(), this.f73013K);
        B.f18309M = AnonymousClass0Qf.BAKEOFF;
        B.f18316T = this.f73012J;
        AnonymousClass0IL C = H.C(B.A());
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(getActivity());
        anonymousClass0IZ.f2754D = C;
        anonymousClass0IZ.f2752B = "ReelViewerFragment.BACK_STACK_NAME";
        anonymousClass0IZ.B();
    }
}

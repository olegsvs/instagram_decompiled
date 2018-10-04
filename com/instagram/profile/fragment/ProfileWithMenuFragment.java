package com.instagram.profile.fragment;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0EE;
import X.AnonymousClass0F4;
import X.AnonymousClass0F8;
import X.AnonymousClass0Hl;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0IS;
import X.AnonymousClass0IV;
import X.AnonymousClass0Ia;
import X.AnonymousClass0Ii;
import X.AnonymousClass0Iz;
import X.AnonymousClass0Jj;
import X.AnonymousClass0Nm;
import X.AnonymousClass0Pb;
import X.AnonymousClass0RC;
import X.AnonymousClass0SY;
import X.AnonymousClass0Za;
import X.AnonymousClass0bt;
import X.AnonymousClass0bx;
import X.AnonymousClass0cQ;
import X.AnonymousClass0e8;
import X.AnonymousClass0eT;
import X.AnonymousClass0gg;
import X.AnonymousClass0iW;
import X.AnonymousClass0rF;
import X.AnonymousClass0yJ;
import X.AnonymousClass1fo;
import X.AnonymousClass1gG;
import X.AnonymousClass1gJ;
import X.AnonymousClass3aX;
import X.AnonymousClass3lj;
import X.AnonymousClass5pP;
import X.AnonymousClass5pQ;
import X.AnonymousClass5pR;
import X.AnonymousClass5pi;
import X.AnonymousClass5pq;
import X.AnonymousClass5pr;
import X.AnonymousClass5ps;
import X.AnonymousClass5pt;
import X.AnonymousClass5pu;
import X.AnonymousClass5pv;
import X.AnonymousClass5pw;
import X.AnonymousClass5px;
import X.AnonymousClass5py;
import X.AnonymousClass6EM;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.widget.SlidingPaneLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorLinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProfileWithMenuFragment extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass0Ii, AnonymousClass0Pb, AnonymousClass0gg, AnonymousClass0bt, AnonymousClass3aX {
    /* renamed from: B */
    public boolean f6886B;
    /* renamed from: C */
    public AnonymousClass6EM f6887C;
    /* renamed from: D */
    public float f6888D;
    /* renamed from: E */
    private final OnTouchListener f6889E = new AnonymousClass5pP(this);
    /* renamed from: F */
    private UserDetailFragment f6890F;
    /* renamed from: G */
    private AnonymousClass0Cm f6891G;
    /* renamed from: H */
    private final AnonymousClass0F8 f6892H = new AnonymousClass5pQ(this);
    public TouchInterceptorFrameLayout mActionBar;
    public AnonymousClass0Hl mMainActivity;
    public SlidingPaneLayout mSlidingPaneLayout;
    public TouchInterceptorLinearLayout mTabBar;
    public View mTabBarShadow;

    public final boolean bW() {
        return true;
    }

    /* renamed from: B */
    public static void m5650B(ProfileWithMenuFragment profileWithMenuFragment, boolean z) {
        if (profileWithMenuFragment.isResumed()) {
            AnonymousClass0EE anonymousClass0EE;
            AnonymousClass0EE anonymousClass0EE2;
            if (z) {
                anonymousClass0EE = profileWithMenuFragment.f6890F;
                anonymousClass0EE2 = profileWithMenuFragment.f6887C;
            } else {
                anonymousClass0EE = profileWithMenuFragment.f6887C;
                anonymousClass0EE2 = profileWithMenuFragment.f6890F;
            }
            AnonymousClass0Iz anonymousClass0Iz = AnonymousClass0Iz.f2854L;
            anonymousClass0Iz.m2408K(anonymousClass0EE, profileWithMenuFragment.getActivity().mo382D().mo1456H(), "button");
            anonymousClass0Iz.m2405H(anonymousClass0EE2);
        }
    }

    /* renamed from: C */
    public static void m5651C(ProfileWithMenuFragment profileWithMenuFragment) {
        AnonymousClass1fo anonymousClass1fo = profileWithMenuFragment.f6890F.f8259r;
        AnonymousClass0Cm anonymousClass0Cm = profileWithMenuFragment.f6891G;
        Context context = profileWithMenuFragment.getContext();
        Object arrayList = new ArrayList();
        if (anonymousClass0Cm.m1037B().m993J()) {
            arrayList.add(new AnonymousClass5pw(anonymousClass1fo));
        }
        if (((Boolean) AnonymousClass0CC.jh.m846H(anonymousClass0Cm)).booleanValue()) {
            arrayList.add(new AnonymousClass5py(anonymousClass1fo));
        }
        if (AnonymousClass0yJ.m8633F(anonymousClass0Cm)) {
            arrayList.add(new AnonymousClass5pq(anonymousClass1fo));
        }
        if (AnonymousClass0RC.m4125H(context) && !((Boolean) AnonymousClass0CC.BV.m846H(anonymousClass0Cm)).booleanValue()) {
            arrayList.add(new AnonymousClass5pu(anonymousClass1fo));
        }
        arrayList.add(new AnonymousClass5px(anonymousClass1fo));
        if (anonymousClass0Cm.m1037B().m1004U() && ((Boolean) AnonymousClass0CC.ZV.m846H(anonymousClass0Cm)).booleanValue()) {
            arrayList.add(new AnonymousClass5pv(anonymousClass1fo));
        }
        if (AnonymousClass0yJ.m8631D(anonymousClass0Cm) && !AnonymousClass0yJ.m8633F(anonymousClass0Cm)) {
            arrayList.add(new AnonymousClass5pr(anonymousClass0Cm, anonymousClass1fo));
        }
        arrayList.add(new AnonymousClass5ps(anonymousClass1fo));
        if (((Boolean) AnonymousClass0CC.ML.m846H(anonymousClass0Cm)).booleanValue() || ((Boolean) AnonymousClass0CC.zK.m846H(anonymousClass0Cm)).booleanValue()) {
            arrayList.add(new AnonymousClass5pt(anonymousClass1fo));
        }
        AnonymousClass5pi anonymousClass5pi = profileWithMenuFragment.f6887C.f73184B;
        anonymousClass5pi.f69252B.clear();
        anonymousClass5pi.f69252B.addAll(arrayList);
        AnonymousClass5pi.B(anonymousClass5pi);
        anonymousClass1fo.f21263M = arrayList;
    }

    /* renamed from: D */
    public static void m5652D(ProfileWithMenuFragment profileWithMenuFragment, boolean z) {
        if (profileWithMenuFragment.f6886B != z) {
            if (z) {
                profileWithMenuFragment.mActionBar.m6300A(profileWithMenuFragment.f6889E);
                profileWithMenuFragment.mTabBar.m6306A(profileWithMenuFragment.f6889E);
                profileWithMenuFragment.f6886B = true;
                return;
            }
            profileWithMenuFragment.mActionBar.m6300A(null);
            profileWithMenuFragment.mTabBar.m6306A(null);
            profileWithMenuFragment.f6886B = false;
        }
    }

    /* renamed from: E */
    private void m5653E() {
        this.mActionBar.setTranslationX(0.0f);
        this.mTabBar.setTranslationX(0.0f);
        this.mTabBarShadow.setTranslationX(0.0f);
        this.mSlidingPaneLayout.A();
        this.f6888D = 0.0f;
        m5652D(this, false);
    }

    public final Map GIA() {
        return AnonymousClass3lj.B(new HashMap(), this.f6891G.m1037B());
    }

    public final void bH(boolean z) {
        this.f6890F.bH(z);
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        this.f6890F.configureActionBar(anonymousClass0eT);
    }

    public final String getModuleName() {
        return AnonymousClass0Ia.SELF_PROFILE.f2779B;
    }

    public final AnonymousClass0iW iM() {
        return this.f6890F.iM();
    }

    public final void oLA() {
        this.f6890F.oLA();
    }

    public final boolean onBackPressed() {
        if (this.f6888D <= 0.0f) {
            return false;
        }
        this.mSlidingPaneLayout.A();
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.m5856F(this, -428999667);
        super.onCreate(bundle);
        this.f6891G = AnonymousClass0Ce.m950G(getArguments());
        AnonymousClass0F4.f2058E.m1504A(AnonymousClass0Za.class, this.f6892H);
        Bundle bundle2 = new Bundle();
        bundle2.putString("IgSessionManager.USER_ID", this.f6891G.f1759C);
        AnonymousClass0IL anonymousClass6EM = new AnonymousClass6EM();
        this.f6887C = anonymousClass6EM;
        anonymousClass6EM.setArguments(bundle2);
        getChildFragmentManager().mo1450B().mo1622M(C0164R.id.profile_slideout_menu_fragment, this.f6887C).mo1615F();
        AnonymousClass0SY B = AnonymousClass0Jj.f2938B.mo659B();
        AnonymousClass0Cm anonymousClass0Cm = this.f6891G;
        AnonymousClass0bx C = AnonymousClass0bx.m5660C(anonymousClass0Cm, anonymousClass0Cm.f1759C, "profile_with_menu");
        C.f6911K = true;
        this.f6890F = (UserDetailFragment) B.m4355D(C.m5662A());
        AnonymousClass0IV B2 = getChildFragmentManager().mo1450B();
        AnonymousClass0IL anonymousClass0IL = this.f6890F;
        B2.mo1623N(C0164R.id.user_detail_fragment, anonymousClass0IL, anonymousClass0IL.getClass().getCanonicalName()).mo1615F();
        AnonymousClass0cQ.m5857G(this, -1479342998, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.m5856F(this, -596459766);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_profile_with_menu, viewGroup, false);
        AnonymousClass0cQ.m5857G(this, 1649180525, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.m5856F(this, -1939827913);
        super.onDestroy();
        AnonymousClass0F4.f2058E.m1507D(AnonymousClass0Za.class, this.f6892H);
        this.f6890F = null;
        this.f6887C = null;
        AnonymousClass0cQ.m5857G(this, 1620915604, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.m5856F(this, -784226205);
        super.onDestroyView();
        ProfileWithMenuFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.m5857G(this, -1915522061, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.m5856F(this, 1102003465);
        super.onResume();
        AnonymousClass0rF.m7947B(this.f6887C.f73184B, -489592769);
        this.mMainActivity.yTA(false);
        AnonymousClass0cQ.m5857G(this, 1750552015, F);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.m5856F(this, 513392378);
        super.onStart();
        UserDetailFragment userDetailFragment = this.f6890F;
        AnonymousClass1gG anonymousClass1gG = userDetailFragment.f8223H;
        if (anonymousClass1gG != null) {
            anonymousClass1gG.f21332F = this;
        }
        AnonymousClass1gJ anonymousClass1gJ = userDetailFragment.f8226K;
        if (anonymousClass1gJ != null) {
            anonymousClass1gJ.f21340E = this;
        }
        userDetailFragment.f8259r.f21264N = this;
        m5651C(this);
        m5653E();
        AnonymousClass0cQ.m5857G(this, 1593188513, F);
    }

    public final void onStop() {
        int F = AnonymousClass0cQ.m5856F(this, -1298948175);
        super.onStop();
        m5653E();
        this.mMainActivity.yTA(true);
        AnonymousClass0cQ.m5857G(this, -507087507, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mMainActivity = (AnonymousClass0Hl) m2190Z();
        this.mSlidingPaneLayout = (SlidingPaneLayout) view.findViewById(C0164R.id.profile_sliding_pane_layout);
        this.mActionBar = (TouchInterceptorFrameLayout) AnonymousClass0eT.m6314E(getActivity()).f7727C;
        this.mTabBar = (TouchInterceptorLinearLayout) this.mMainActivity.lS();
        this.mTabBarShadow = this.mMainActivity.mS();
        View findViewById = view.findViewById(C0164R.id.profile_slideout_menu_fragment);
        int J = (int) (((float) AnonymousClass0Nm.m3431J(getContext())) * 0.672f);
        AnonymousClass0Nm.m3457j(findViewById, J);
        View findViewById2 = view.findViewById(C0164R.id.user_detail_fragment);
        this.mSlidingPaneLayout.setLayoutDirection(AnonymousClass0e8.m6200D(getContext()) ^ 1);
        findViewById.setLayoutDirection(3);
        findViewById2.setLayoutDirection(3);
        if ((AnonymousClass0e8.m6200D(getContext()) ^ 1) != 0) {
            this.mSlidingPaneLayout.setShadowResourceRight(C0164R.drawable.menu_vertical_divider);
        } else {
            this.mSlidingPaneLayout.setShadowResourceLeft(C0164R.drawable.menu_vertical_divider);
        }
        this.mSlidingPaneLayout.setSliderFadeColor(0);
        this.mSlidingPaneLayout.setParallaxDistance(J);
        this.mSlidingPaneLayout.setPanelSlideListener(new AnonymousClass5pR(this, J));
    }
}

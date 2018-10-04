package com.instagram.creation.capture.quickcapture.music.search;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0bw;
import X.AnonymousClass0cQ;
import X.AnonymousClass1LM;
import X.AnonymousClass1LP;
import X.AnonymousClass1d2;
import X.AnonymousClass27y;
import X.AnonymousClass4SS;
import X.AnonymousClass4ST;
import X.AnonymousClass5Tv;
import X.AnonymousClass5U0;
import X.AnonymousClass5U4;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;
import java.util.List;

public class MusicOverlaySearchLandingPageFragment extends AnonymousClass0IJ implements AnonymousClass4SS, AnonymousClass0bw, AnonymousClass1d2 {
    /* renamed from: B */
    public int f64693B;
    /* renamed from: C */
    public AnonymousClass27y f64694C;
    /* renamed from: D */
    public AnonymousClass0Cm f64695D;
    /* renamed from: E */
    private final List f64696E = new ArrayList();
    public FixedTabBar mTabBar;
    public AnonymousClass1LM mTabbedFragmentController;
    public ViewPager mViewPager;

    public final String getModuleName() {
        return "music_overlay_search_landing_page";
    }

    public final boolean UY() {
        AnonymousClass1LM anonymousClass1LM = this.mTabbedFragmentController;
        if (anonymousClass1LM != null) {
            AnonymousClass0IL M = anonymousClass1LM.M();
            if (M instanceof AnonymousClass4SS) {
                return ((AnonymousClass4SS) M).UY();
            }
        }
        return true;
    }

    public final boolean VY() {
        AnonymousClass1LM anonymousClass1LM = this.mTabbedFragmentController;
        if (anonymousClass1LM != null) {
            AnonymousClass0IL M = anonymousClass1LM.M();
            if (M instanceof AnonymousClass4SS) {
                return ((AnonymousClass4SS) M).VY();
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0IL aF(Object obj) {
        AnonymousClass0IL anonymousClass5U4;
        AnonymousClass4ST anonymousClass4ST = (AnonymousClass4ST) obj;
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.USER_ID", this.f64695D.f1759C);
        bundle.putSerializable("camera_upload_step", this.f64694C);
        bundle.putInt("list_bottom_padding_px", this.f64693B);
        switch (anonymousClass4ST.ordinal()) {
            case 0:
                anonymousClass5U4 = new AnonymousClass5U4();
                break;
            case 1:
                anonymousClass5U4 = new AnonymousClass5U0();
                break;
            case 2:
                anonymousClass5U4 = new AnonymousClass5Tv();
                break;
            default:
                throw new IllegalArgumentException("unsupported tab type");
        }
        anonymousClass5U4.setArguments(bundle);
        return anonymousClass5U4;
    }

    public final void nm(AnonymousClass0IL anonymousClass0IL) {
        AnonymousClass1LM anonymousClass1LM = this.mTabbedFragmentController;
        if (anonymousClass1LM != null) {
            anonymousClass1LM.M().setUserVisibleHint(false);
        }
    }

    public final /* bridge */ /* synthetic */ void oCA(Object obj) {
        AnonymousClass0IL L = this.mTabbedFragmentController.L((AnonymousClass4ST) obj);
        L.setUserVisibleHint(true);
        for (int i = 0; i < this.mTabbedFragmentController.getCount(); i++) {
            AnonymousClass0IL K = this.mTabbedFragmentController.K(i);
            if (K != L) {
                K.setUserVisibleHint(false);
            }
        }
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null) {
            viewPager.requestFocus();
        }
    }

    public final void om(AnonymousClass0IL anonymousClass0IL) {
        AnonymousClass1LM anonymousClass1LM = this.mTabbedFragmentController;
        if (anonymousClass1LM != null) {
            anonymousClass1LM.M().setUserVisibleHint(true);
        }
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1848337965);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f64695D = AnonymousClass0Ce.G(arguments);
        this.f64694C = (AnonymousClass27y) arguments.getSerializable("camera_upload_step");
        this.f64693B = arguments.getInt("list_bottom_padding_px");
        this.f64696E.clear();
        this.f64696E.add(AnonymousClass4ST.TRENDING);
        this.f64696E.add(AnonymousClass4ST.MOODS);
        this.f64696E.add(AnonymousClass4ST.GENRES);
        addFragmentVisibilityListener(this);
        AnonymousClass0cQ.G(this, 2016394403, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1358219272);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_music_overlay_search_landing_page, viewGroup, false);
        AnonymousClass0cQ.G(this, -1313087598, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -1810890955);
        super.onDestroyView();
        MusicOverlaySearchLandingPageFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, 1392900620, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mTabBar = (FixedTabBar) view.findViewById(C0164R.id.music_overlay_landing_page_tab_bar);
        this.mViewPager = (ViewPager) view.findViewById(C0164R.id.music_overlay_search_results);
        AnonymousClass1LM anonymousClass1LM = new AnonymousClass1LM(this, getChildFragmentManager(), this.mViewPager, this.mTabBar, this.f64696E);
        this.mTabbedFragmentController = anonymousClass1LM;
        anonymousClass1LM.O(this.f64696E.get(0));
    }

    public final AnonymousClass1LP vF(Object obj) {
        return new AnonymousClass1LP(((AnonymousClass4ST) obj).f54243B, C0164R.color.music_search_tab_colors, C0164R.color.white, -1, C0164R.color.transparent, null, null);
    }
}

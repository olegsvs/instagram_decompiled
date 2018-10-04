package com.instagram.archive.fragment;

import X.AnonymousClass0EE;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0JK;
import X.AnonymousClass0bw;
import X.AnonymousClass0cQ;
import X.AnonymousClass1LM;
import X.AnonymousClass1LP;
import X.AnonymousClass48t;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArchiveReelTabbedFragment extends AnonymousClass0IJ implements AnonymousClass0bw {
    /* renamed from: B */
    public AnonymousClass0IJ f50819B;
    /* renamed from: C */
    public AnonymousClass0EE f50820C;
    /* renamed from: D */
    public AnonymousClass48t f50821D;
    /* renamed from: E */
    public ArchiveReelFragment f50822E;
    /* renamed from: F */
    public final Map f50823F = new HashMap();
    /* renamed from: G */
    private final List f50824G = new ArrayList();
    public FixedTabBar mTabBar;
    public AnonymousClass1LM mTabController;
    public ViewPager mViewPager;

    public ArchiveReelTabbedFragment() {
        this.f50824G.add(AnonymousClass48t.GRID);
        this.f50824G.add(AnonymousClass48t.CALENDAR);
        this.f50823F.put(AnonymousClass48t.GRID, AnonymousClass1LP.D(C0164R.string.stories));
        this.f50823F.put(AnonymousClass48t.CALENDAR, AnonymousClass1LP.D(C0164R.string.calendar));
        this.f50821D = AnonymousClass48t.GRID;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0IL aF(Object obj) {
        return m23419b((AnonymousClass48t) obj);
    }

    /* renamed from: b */
    public final AnonymousClass0IL m23419b(AnonymousClass48t anonymousClass48t) {
        switch (anonymousClass48t.ordinal()) {
            case 0:
                return this.f50822E;
            case 1:
                return this.f50819B;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("illegal tab: ");
                stringBuilder.append(anonymousClass48t);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final String getModuleName() {
        return this.f50820C.getModuleName();
    }

    public final /* bridge */ /* synthetic */ void oCA(Object obj) {
        AnonymousClass48t anonymousClass48t = (AnonymousClass48t) obj;
        this.f50821D = anonymousClass48t;
        switch (anonymousClass48t.ordinal()) {
            case 0:
                this.f50820C = this.f50822E;
                return;
            case 1:
                this.f50820C = this.f50819B;
                return;
            default:
                return;
        }
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 926378214);
        super.onCreate(bundle);
        this.f50822E = (ArchiveReelFragment) AnonymousClass0JK.f2907B.C().A(getArguments());
        AnonymousClass0JK.f2907B.C();
        Bundle arguments = getArguments();
        AnonymousClass0IL archiveReelCalendarFragment = new ArchiveReelCalendarFragment();
        archiveReelCalendarFragment.setArguments(arguments);
        this.f50819B = (AnonymousClass0IJ) archiveReelCalendarFragment;
        this.f50820C = this.f50822E;
        AnonymousClass0cQ.G(this, 440777051, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1072015026);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_archive_reel_tabbed_fragment, viewGroup, false);
        AnonymousClass0cQ.G(this, -1865216525, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -635290848);
        super.onDestroyView();
        ArchiveReelTabbedFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, -527094096, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mTabBar = (FixedTabBar) view.findViewById(C0164R.id.fixed_tabbar_view);
        this.mViewPager = (ViewPager) view.findViewById(C0164R.id.view_pager);
        AnonymousClass1LM anonymousClass1LM = new AnonymousClass1LM(this, getChildFragmentManager(), this.mViewPager, this.mTabBar, this.f50824G);
        this.mTabController = anonymousClass1LM;
        anonymousClass1LM.O(this.f50821D);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1LP vF(Object obj) {
        return (AnonymousClass1LP) this.f50823F.get((AnonymousClass48t) obj);
    }
}

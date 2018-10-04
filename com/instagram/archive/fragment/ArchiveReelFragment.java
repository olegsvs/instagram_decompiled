package com.instagram.archive.fragment;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Cn;
import X.AnonymousClass0F4;
import X.AnonymousClass0F8;
import X.AnonymousClass0GA;
import X.AnonymousClass0HV;
import X.AnonymousClass0IC;
import X.AnonymousClass0IT;
import X.AnonymousClass0Ie;
import X.AnonymousClass0Ih;
import X.AnonymousClass0Ii;
import X.AnonymousClass0Ix;
import X.AnonymousClass0Jd;
import X.AnonymousClass0MI;
import X.AnonymousClass0Nm;
import X.AnonymousClass0Ny;
import X.AnonymousClass0ON;
import X.AnonymousClass0P7;
import X.AnonymousClass0Pb;
import X.AnonymousClass0Pn;
import X.AnonymousClass0Pt;
import X.AnonymousClass0Pu;
import X.AnonymousClass0Pv;
import X.AnonymousClass0Q6;
import X.AnonymousClass0Qf;
import X.AnonymousClass0Rq;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eT;
import X.AnonymousClass0fq;
import X.AnonymousClass0hR;
import X.AnonymousClass0hi;
import X.AnonymousClass0iW;
import X.AnonymousClass0ib;
import X.AnonymousClass0lG;
import X.AnonymousClass0lo;
import X.AnonymousClass0nJ;
import X.AnonymousClass0ng;
import X.AnonymousClass0nn;
import X.AnonymousClass0nq;
import X.AnonymousClass0r7;
import X.AnonymousClass2Hx;
import X.AnonymousClass2I0;
import X.AnonymousClass2IF;
import X.AnonymousClass2zR;
import X.AnonymousClass2zh;
import X.AnonymousClass2zi;
import X.AnonymousClass302;
import X.AnonymousClass304;
import X.AnonymousClass307;
import X.AnonymousClass30J;
import X.AnonymousClass30M;
import X.AnonymousClass30X;
import X.AnonymousClass30Y;
import X.AnonymousClass30u;
import X.AnonymousClass30z;
import X.AnonymousClass3Ul;
import X.AnonymousClass3Uq;
import X.AnonymousClass3V4;
import X.AnonymousClass3b7;
import X.AnonymousClass3bG;
import X.AnonymousClass3bR;
import X.AnonymousClass3wg;
import X.AnonymousClass41P;
import X.AnonymousClass48l;
import X.AnonymousClass48n;
import X.AnonymousClass48o;
import X.AnonymousClass48p;
import X.AnonymousClass48q;
import X.AnonymousClass48r;
import X.AnonymousClass48s;
import X.AnonymousClass48u;
import X.AnonymousClass48x;
import X.AnonymousClass5Ir;
import X.AnonymousClass5Rm;
import X.AnonymousClass5aD;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.facebook.C0164R;
import com.facebook.forker.Process;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ArchiveReelFragment extends AnonymousClass0Ie implements AnonymousClass0nn, AnonymousClass3b7, AnonymousClass0Ih, OnScrollListener, AnonymousClass0Ii, AnonymousClass0Pb, AnonymousClass3bG, AnonymousClass0IT, AnonymousClass302, AnonymousClass30X {
    /* renamed from: B */
    public AnonymousClass3wg f50797B;
    /* renamed from: C */
    public final Map f50798C = new LinkedHashMap();
    /* renamed from: D */
    public boolean f50799D;
    /* renamed from: E */
    public AnonymousClass0ng f50800E;
    /* renamed from: F */
    public boolean f50801F;
    /* renamed from: G */
    public String f50802G;
    /* renamed from: H */
    public String f50803H;
    /* renamed from: I */
    public AnonymousClass30z f50804I;
    /* renamed from: J */
    public AnonymousClass0Cm f50805J;
    /* renamed from: K */
    private View f50806K;
    /* renamed from: L */
    private AnonymousClass5Ir f50807L;
    /* renamed from: M */
    private AnonymousClass30u f50808M;
    /* renamed from: N */
    private boolean f50809N;
    /* renamed from: O */
    private boolean f50810O;
    /* renamed from: P */
    private boolean f50811P;
    /* renamed from: Q */
    private final AnonymousClass0hi f50812Q = new AnonymousClass0hi();
    /* renamed from: R */
    private int f50813R;
    /* renamed from: S */
    private AnonymousClass0iW f50814S;
    /* renamed from: T */
    private AnonymousClass48x f50815T;
    public EmptyStateView mEmptyStateView;
    public AnonymousClass41P mHideAnimationCoordinator;
    public AnonymousClass2zR mReelLoader;

    public final void Br(String str, String str2) {
    }

    public final void Fr(String str, String str2) {
    }

    public final void Hr(AnonymousClass0fq anonymousClass0fq) {
    }

    public final void Jt() {
    }

    public final void Lp(String str) {
    }

    public final void Mm(AnonymousClass3Uq anonymousClass3Uq) {
    }

    public final void Mp(String str) {
    }

    public final void br(String str, String str2) {
    }

    public final void ir(String str, String str2) {
    }

    public final void zs() {
    }

    /* renamed from: B */
    public static void m23412B(ArchiveReelFragment archiveReelFragment) {
        EmptyStateView emptyStateView = archiveReelFragment.mEmptyStateView;
        AnonymousClass2I0 anonymousClass2I0 = AnonymousClass2I0.ERROR;
        emptyStateView.m14963G(C0164R.drawable.loadmore_icon_refresh_compound, anonymousClass2I0);
        archiveReelFragment.mEmptyStateView.m14966J(new AnonymousClass48l(archiveReelFragment), anonymousClass2I0);
        switch (archiveReelFragment.f50805J.B().X().ordinal()) {
            case 0:
                emptyStateView = archiveReelFragment.mEmptyStateView;
                anonymousClass2I0 = AnonymousClass2I0.EMPTY;
                emptyStateView.m14970N(C0164R.string.stories_archive_home_empty_state_title_active, anonymousClass2I0);
                archiveReelFragment.mEmptyStateView.m14968L(C0164R.string.stories_archive_home_empty_state_subtitle_active, anonymousClass2I0);
                archiveReelFragment.mEmptyStateView.m14958B(C0164R.string.stories_archive_home_empty_state_button_active, anonymousClass2I0);
                archiveReelFragment.mEmptyStateView.m14959C(new AnonymousClass48o(archiveReelFragment), anonymousClass2I0);
                break;
            case 1:
                emptyStateView = archiveReelFragment.mEmptyStateView;
                anonymousClass2I0 = AnonymousClass2I0.EMPTY;
                emptyStateView.m14970N(C0164R.string.stories_archive_home_empty_state_title_inactive, anonymousClass2I0);
                archiveReelFragment.mEmptyStateView.m14968L(C0164R.string.stories_archive_home_empty_state_subtitle_inactive, anonymousClass2I0);
                archiveReelFragment.mEmptyStateView.m14958B(C0164R.string.stories_archive_home_empty_state_button_inactive, anonymousClass2I0);
                archiveReelFragment.mEmptyStateView.m14959C(new AnonymousClass48n(archiveReelFragment), anonymousClass2I0);
                break;
            case 2:
                emptyStateView = archiveReelFragment.mEmptyStateView;
                anonymousClass2I0 = AnonymousClass2I0.EMPTY;
                emptyStateView.m14970N(C0164R.string.stories_archive_home_empty_state_title_active, anonymousClass2I0);
                archiveReelFragment.mEmptyStateView.m14968L(C0164R.string.stories_archive_home_empty_state_subtitle_active, anonymousClass2I0);
                ((AnonymousClass2Hx) archiveReelFragment.mEmptyStateView.f28623B.get(anonymousClass2I0)).f28597C = JsonProperty.USE_DEFAULT_NAME;
                break;
            default:
                break;
        }
        emptyStateView = archiveReelFragment.mEmptyStateView;
        anonymousClass2I0 = AnonymousClass2I0.EMPTY;
        emptyStateView.m14964H(C0164R.color.grey_9, anonymousClass2I0);
        archiveReelFragment.mEmptyStateView.m14963G(C0164R.drawable.empty_state_private, anonymousClass2I0);
    }

    /* renamed from: C */
    public static AnonymousClass0lG m23413C(ArchiveReelFragment archiveReelFragment) {
        return AnonymousClass0Jd.f2931B.O(archiveReelFragment.getActivity(), archiveReelFragment.f50805J);
    }

    /* renamed from: D */
    public static void m23414D(ArchiveReelFragment archiveReelFragment, View view) {
        if (((Boolean) AnonymousClass0CC.CB.H(archiveReelFragment.f50805J)).booleanValue()) {
            ListView listView = archiveReelFragment.getListView();
            listView.setVerticalScrollBarEnabled(false);
            ViewStub viewStub = (ViewStub) view.findViewById(C0164R.id.fast_scroll_container);
            if (viewStub != null) {
                archiveReelFragment.f50806K = viewStub.inflate();
            }
            Context context = archiveReelFragment.getContext();
            int B = (int) ((((float) AnonymousClass307.m18154B(context, 3)) / AnonymousClass0Nm.H(AnonymousClass0Nm.G(context))) + ((float) AnonymousClass307.m18155C(context)));
            int G = archiveReelFragment.m23417G();
            OnScrollListener onScrollListener = archiveReelFragment.f50807L;
            if (onScrollListener != null) {
                archiveReelFragment.f50812Q.B(onScrollListener);
            }
            BaseAdapter baseAdapter = archiveReelFragment.f50797B;
            View view2 = archiveReelFragment.f50806K;
            archiveReelFragment.f50807L = new AnonymousClass5Ir(new AnonymousClass5aD(listView, baseAdapter, 0, B, G), listView, baseAdapter, baseAdapter, view2);
            archiveReelFragment.f50812Q.A(archiveReelFragment.f50807L);
        }
    }

    /* renamed from: E */
    public static void m23415E(ArchiveReelFragment archiveReelFragment) {
        AnonymousClass48x anonymousClass48x = archiveReelFragment.f50815T;
        if (anonymousClass48x != null) {
            List A = AnonymousClass0Jd.f2931B.I(anonymousClass48x.f50832F).A();
            if (!A.isEmpty() && ((Boolean) AnonymousClass0CC.Sh.H(anonymousClass48x.f50832F)).booleanValue()) {
                Collections.sort(A);
                anonymousClass48x.f50830D.W(A);
                if (anonymousClass48x.f50831E > 0) {
                    AnonymousClass0Cn anonymousClass0Cn = anonymousClass48x.f50832F;
                    long j = ((AnonymousClass0MI) A.get(0)).f3380M;
                    AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
                    anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
                    anonymousClass0Pt.f4229M = "highlights/suggestions/mark_seen/";
                    AnonymousClass0GA H = anonymousClass0Pt.M(AnonymousClass0Pv.class).D("timestamp", Long.toString(j)).N().H();
                    H.f2849B = new AnonymousClass48u(anonymousClass48x);
                    AnonymousClass0Ix.D(H);
                }
            } else if (!anonymousClass48x.f50830D.T()) {
                anonymousClass48x.f50830D.P();
            }
        }
        List arrayList = new ArrayList();
        for (AnonymousClass0IC anonymousClass0IC : archiveReelFragment.f50798C.values()) {
            AnonymousClass30J anonymousClass30J = (AnonymousClass30J) anonymousClass0IC.f2727B;
            AnonymousClass0MI anonymousClass0MI = (AnonymousClass0MI) anonymousClass0IC.f2728C;
            if (!anonymousClass0MI.T()) {
                int i = 0;
                if (anonymousClass0MI.V()) {
                    while (i < anonymousClass30J.f36799D) {
                        arrayList.add(new AnonymousClass2zi(null, anonymousClass0MI, i, anonymousClass30J.f36800E, AnonymousClass2zh.MEDIA_PLACEHOLDER));
                        i++;
                    }
                } else {
                    while (i < anonymousClass0MI.b()) {
                        arrayList.add(AnonymousClass2zi.m18142B(anonymousClass0MI.E(i), anonymousClass0MI, i, anonymousClass30J.f36800E));
                        i++;
                    }
                }
            }
        }
        AnonymousClass3wg anonymousClass3wg = archiveReelFragment.f50797B;
        anonymousClass3wg.f47206E.D();
        anonymousClass3wg.f47203B.clear();
        int size = arrayList.size();
        if (size > 9) {
            int i2 = size % 3;
            int i3 = 0;
            size = i2 == 0 ? 0 : 3 - i2;
            while (i3 < size) {
                anonymousClass3wg.f47206E.A(new AnonymousClass2zi(null, null, 0, 0, AnonymousClass2zh.SPACE));
                i3++;
            }
        }
        anonymousClass3wg.f47206E.B(arrayList);
        anonymousClass3wg.m21647F();
        m23416F(archiveReelFragment);
    }

    /* renamed from: F */
    public static void m23416F(ArchiveReelFragment archiveReelFragment) {
        if (archiveReelFragment.mEmptyStateView != null) {
            if (archiveReelFragment.uX()) {
                archiveReelFragment.mEmptyStateView.m14965I();
            } else {
                if ((archiveReelFragment.f50800E.f10111G == AnonymousClass0nq.NEEDS_RETRY ? 1 : null) != null) {
                    archiveReelFragment.mEmptyStateView.m14961E();
                } else if (archiveReelFragment.f50797B.isEmpty()) {
                    archiveReelFragment.mEmptyStateView.m14960D();
                } else {
                    archiveReelFragment.mEmptyStateView.m14962F();
                }
            }
            archiveReelFragment.mEmptyStateView.m14957A();
        }
    }

    /* renamed from: G */
    private int m23417G() {
        if (this.f50797B.getCount() <= 0) {
            return 0;
        }
        AnonymousClass0Rq anonymousClass0Rq = this.f50797B;
        View view = anonymousClass0Rq.getView(anonymousClass0Rq.getCount() - 1, null, getListView());
        view.measure(MeasureSpec.makeMeasureSpec(AnonymousClass0Nm.J(getContext()), Process.WAIT_RESULT_TIMEOUT), MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    public final void Gr(AnonymousClass0Q6 anonymousClass0Q6) {
        Toast.makeText(getActivity(), C0164R.string.could_not_refresh_feed, 0).show();
        m23416F(this);
    }

    /* renamed from: H */
    private void m23418H() {
        this.f50800E.C(AnonymousClass0hR.B(this.f50805J, AnonymousClass0Ny.UseCacheWithTimeout, false, this.f50811P), this);
    }

    public final void Ir() {
        ((RefreshableListView) getListView()).setIsLoading(false);
        AnonymousClass2IF.m14981B(false, getView());
    }

    public final void Iw(AnonymousClass0MI anonymousClass0MI) {
        m23415E(this);
    }

    public final void Jr() {
        if (getListViewSafe() != null) {
            ((RefreshableListView) getListViewSafe()).setIsLoading(true);
        }
        m23416F(this);
    }

    public final /* bridge */ /* synthetic */ void Kr(AnonymousClass0Pn anonymousClass0Pn) {
        int i;
        AnonymousClass30M anonymousClass30M = (AnonymousClass30M) anonymousClass0Pn;
        AnonymousClass30M.m18160B(anonymousClass30M, this.f50805J, this.f50798C);
        AnonymousClass3V4 anonymousClass3V4 = anonymousClass30M.f36804E;
        int i2 = 0;
        if (!(anonymousClass3V4 == null || anonymousClass3V4.f41708B == null)) {
            List list = anonymousClass3V4.f41708B;
            for (i = 0; i < list.size(); i++) {
                AnonymousClass0Jd.f2931B.M(this.f50805J).J((AnonymousClass0r7) list.get(i), true);
            }
        }
        m23415E(this);
        m23414D(this, getView());
        int count = this.f50797B.getCount();
        i = count - 1;
        if (!this.f50799D && count > 0) {
            this.f50799D = true;
            AnonymousClass0HV D = AnonymousClass0HV.D(this.f50805J);
            if (!this.f50801F) {
                int i3 = 0;
                if (D.f2646B.getInt("stories_archive_privacy_banner_view_count", 0) < 3) {
                    i3 = 1;
                }
                if (i3 == 0) {
                    i2 = getView().getHeight();
                }
            }
            getListView().setSelectionFromTop(i, i2);
        }
        String str = this.f50802G;
        if (str != null) {
            AnonymousClass3wg anonymousClass3wg = this.f50797B;
            if (anonymousClass3wg.f47206E.F(str)) {
                AnonymousClass0lo anonymousClass0lo = anonymousClass3wg.f47206E;
                AnonymousClass30Y.m18171E().m18183L(((AnonymousClass2zi) anonymousClass0lo.J(((Integer) anonymousClass0lo.f9604B.get(str)).intValue())).f36701D);
            }
        }
    }

    public final void Lr(AnonymousClass0Pn anonymousClass0Pn) {
        AnonymousClass30M anonymousClass30M = (AnonymousClass30M) anonymousClass0Pn;
    }

    public final void Np(String str, boolean z) {
        if (this.f50798C.containsKey(str) && !z) {
            AnonymousClass0MI D = AnonymousClass0Jd.f2931B.M(this.f50805J).D(str);
            if (D != null && !D.V()) {
                m23415E(this);
            }
        }
    }

    public final void ar() {
        AnonymousClass0eT.D(AnonymousClass0eT.E(getActivity()));
    }

    public final void cd(AnonymousClass0MI anonymousClass0MI, List list, AnonymousClass304 anonymousClass304, int i, int i2, int i3) {
        ArchiveReelFragment archiveReelFragment = this;
        boolean z = this.f50809N;
        AnonymousClass0MI anonymousClass0MI2 = anonymousClass0MI;
        int i4 = i3;
        if (z) {
            AnonymousClass30u anonymousClass30u = archiveReelFragment.f50808M;
            AnonymousClass0P7 anonymousClass0P7 = anonymousClass0MI.E(i3).f4134F;
            anonymousClass30u.m18199A(anonymousClass0P7.TO() == AnonymousClass0ON.PHOTO, anonymousClass0P7);
            return;
        }
        View view = anonymousClass304.f36763E;
        List arrayList = new ArrayList();
        for (String D : list) {
            AnonymousClass0MI D2 = AnonymousClass0Jd.f2931B.M(archiveReelFragment.f50805J).D(D);
            if (D2 != null) {
                arrayList.add(D2);
            }
        }
        AnonymousClass0lG C = m23413C(archiveReelFragment);
        view.setVisibility(4);
        C.E(anonymousClass0MI2, i4, null, AnonymousClass0Nm.L(view), new AnonymousClass48q(archiveReelFragment, arrayList, i4, C, view), 0, AnonymousClass0Qf.ARCHIVE);
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        if (this.f50797B.bR().isEmpty()) {
            anonymousClass0eT.Z(C0164R.string.create_highlights_title);
            anonymousClass0eT.P(getResources().getString(C0164R.string.next));
        } else {
            anonymousClass0eT.a(getResources().getString(C0164R.string.highlights_selected_title, new Object[]{Integer.valueOf(this.f50797B.bR().size())}));
            anonymousClass0eT.Q(getResources().getString(C0164R.string.next), new AnonymousClass48p(this));
        }
        anonymousClass0eT.n(true);
    }

    public final String getModuleName() {
        return this.f50809N ? "reel_highlights_gallery" : "archive_stories_tab";
    }

    public final AnonymousClass0iW iM() {
        return this.f50814S;
    }

    public final void kv(AnonymousClass0MI anonymousClass0MI) {
        m23415E(this);
    }

    public final void oLA() {
        AnonymousClass0ib.C(this, getListView());
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass0nJ anonymousClass0nJ;
        int F = AnonymousClass0cQ.F(this, -1131953374);
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        this.f50809N = getArguments().getBoolean("archive_multi_select_mode", false);
        this.f50810O = getArguments().getBoolean("is_standalone_reel_archive", false);
        this.f50801F = getArguments().getBoolean("hide_footer", false);
        this.f50802G = getArguments().getString("initial_selected_media_id");
        this.f50804I = (AnonymousClass30z) getArguments().getSerializable("highlight_management_source");
        this.f50811P = getArguments().getBoolean("suggested_highlights_enabled", false);
        if (bundle == null && r5.f50810O) {
            AnonymousClass30Y.m18168B();
        }
        r5.f50805J = AnonymousClass0Ce.G(getArguments());
        if (r5.f50811P) {
            r5.f50815T = new AnonymousClass48x(new AnonymousClass5Rm(r5), getContext(), r5, getActivity(), r5.f50805J, r5, new AnonymousClass3bR(r5.f50805J, r5, r5), bundle2, AnonymousClass0Jd.f2931B.Q().f18500B);
            AnonymousClass0Jd.f2931B.Q().f18500B = 0;
        }
        r5.f50808M = new AnonymousClass30u(new AnonymousClass48r(r5), new AnonymousClass48s(r5), getContext());
        Context context = getContext();
        boolean z = r5.f50810O;
        boolean z2 = r5.f50801F;
        AnonymousClass48x anonymousClass48x = r5.f50815T;
        if (anonymousClass48x != null) {
            anonymousClass0nJ = anonymousClass48x.f50830D;
        } else {
            anonymousClass0nJ = null;
        }
        ListAdapter anonymousClass3wg = new AnonymousClass3wg(context, r5, z, z2, anonymousClass0nJ);
        r5.f50797B = anonymousClass3wg;
        setListAdapter(anonymousClass3wg);
        AnonymousClass3wg anonymousClass3wg2 = r5.f50797B;
        anonymousClass3wg2.f47204C = r5.f50809N;
        anonymousClass3wg2.m21647F();
        r5.f50803H = UUID.randomUUID().toString();
        r5.f50800E = new AnonymousClass0ng(getContext(), r5.f50805J.f1759C, getLoaderManager());
        r5.f50813R = getResources().getDimensionPixelSize(C0164R.dimen.top_tabbar_height);
        r5.f50814S = new AnonymousClass0iW(getContext());
        m23418H();
        AnonymousClass0cQ.G(r5, -259044417, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1345131084);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_feed, viewGroup, false);
        AnonymousClass0cQ.G(this, 1289206806, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 1553111013);
        super.onDestroyView();
        AnonymousClass30Y.m18171E().m18180I(this);
        AnonymousClass30Y.m18171E().m18180I(this.f50797B);
        ArchiveReelFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, 111825219, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -589546467);
        super.onPause();
        AnonymousClass0Jd.f2931B.L(this.f50805J).H(this);
        this.f50812Q.B(this.f50814S);
        this.f50812Q.B(this.mReelLoader);
        OnScrollListener onScrollListener = this.f50807L;
        if (onScrollListener != null) {
            this.f50812Q.B(onScrollListener);
        }
        AnonymousClass0cQ.G(this, -1347532810, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 1709929027);
        super.onResume();
        AnonymousClass48x anonymousClass48x = this.f50815T;
        if (anonymousClass48x == null || !anonymousClass48x.m23420A()) {
            AnonymousClass0lG C = m23413C(this);
            if (C.G()) {
                anonymousClass48x = this.f50815T;
                if (anonymousClass48x == null || !anonymousClass48x.m23421B(C)) {
                    C.C(getListView());
                }
            }
            AnonymousClass0Jd.f2931B.L(this.f50805J).A(this);
            this.f50812Q.A(this.f50814S);
            this.f50812Q.A(this.mReelLoader);
            OnScrollListener onScrollListener = this.f50807L;
            if (onScrollListener != null) {
                this.f50812Q.A(onScrollListener);
            }
            AnonymousClass0F8 anonymousClass0F8 = this.f50815T;
            if (anonymousClass0F8 != null) {
                anonymousClass0F8.f50829C = null;
                anonymousClass0F8.f50833G = false;
                AnonymousClass0F4.f2058E.D(AnonymousClass3Ul.class, anonymousClass0F8);
            }
            m23412B(this);
            m23415E(this);
            AnonymousClass0cQ.G(this, 1200465864, F);
            return;
        }
        getActivity().finish();
        AnonymousClass0cQ.G(this, -688615862, F);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        AnonymousClass48x anonymousClass48x = this.f50815T;
        if (anonymousClass48x != null) {
            bundle.putString("launched_suggested_highlights_reel_id", anonymousClass48x.f50829C);
        }
        super.onSaveInstanceState(bundle);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, -1571032066);
        this.f50812Q.onScroll(absListView, i, i2, i3);
        AnonymousClass0cQ.H(this, 881284529, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, -1078772019);
        this.f50812Q.onScrollStateChanged(absListView, i);
        AnonymousClass0cQ.H(this, 904329432, I);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mEmptyStateView = (EmptyStateView) getListView().getEmptyView();
        this.f50814S.G(getListView(), this.f50797B, this.f50813R);
        RefreshableListView refreshableListView = (RefreshableListView) getListView();
        refreshableListView.A();
        boolean z = false;
        refreshableListView.setDrawBorder(false);
        refreshableListView.setOnScrollListener(this);
        if (uX() && !this.f50797B.isEmpty()) {
            z = true;
        }
        AnonymousClass2IF.m14981B(z, getView());
        m23416F(this);
        AnonymousClass30Y.m18171E().m18172A(this);
        AnonymousClass30Y.m18171E().m18172A(this.f50797B);
        this.mReelLoader = new AnonymousClass2zR(this.f50797B, this.f50805J, this);
        m23414D(this, view);
    }

    public final boolean uX() {
        return this.f50800E.f10111G == AnonymousClass0nq.LOADING;
    }

    public final void wIA(boolean z) {
        m23418H();
    }
}

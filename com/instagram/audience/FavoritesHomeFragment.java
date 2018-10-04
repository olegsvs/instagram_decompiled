package com.instagram.audience;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ca;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Ci;
import X.AnonymousClass0Cm;
import X.AnonymousClass0G5;
import X.AnonymousClass0GA;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0IS;
import X.AnonymousClass0IZ;
import X.AnonymousClass0Iz;
import X.AnonymousClass0Jj;
import X.AnonymousClass0NN;
import X.AnonymousClass0Nm;
import X.AnonymousClass0P2;
import X.AnonymousClass0Px;
import X.AnonymousClass0Rq;
import X.AnonymousClass0TK;
import X.AnonymousClass0Ur;
import X.AnonymousClass0bt;
import X.AnonymousClass0bw;
import X.AnonymousClass0bx;
import X.AnonymousClass0cJ;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eT;
import X.AnonymousClass0eV;
import X.AnonymousClass0eW;
import X.AnonymousClass0kV;
import X.AnonymousClass0x6;
import X.AnonymousClass0xH;
import X.AnonymousClass0xq;
import X.AnonymousClass0yJ;
import X.AnonymousClass1LM;
import X.AnonymousClass1LP;
import X.AnonymousClass1YE;
import X.AnonymousClass1YF;
import X.AnonymousClass1Zf;
import X.AnonymousClass22r;
import X.AnonymousClass25i;
import X.AnonymousClass31j;
import X.AnonymousClass31k;
import X.AnonymousClass31l;
import X.AnonymousClass31m;
import X.AnonymousClass31n;
import X.AnonymousClass31o;
import X.AnonymousClass31p;
import X.AnonymousClass31q;
import X.AnonymousClass31u;
import X.AnonymousClass31v;
import X.AnonymousClass31w;
import X.AnonymousClass31x;
import X.AnonymousClass31z;
import X.AnonymousClass327;
import X.AnonymousClass328;
import X.AnonymousClass32C;
import X.AnonymousClass32D;
import X.AnonymousClass32E;
import X.AnonymousClass32F;
import X.AnonymousClass3dl;
import X.AnonymousClass3e1;
import X.AnonymousClass3jm;
import X.AnonymousClass3jn;
import X.AnonymousClass3jo;
import X.AnonymousClass3x1;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import com.instagram.ui.widget.search.SearchController;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class FavoritesHomeFragment extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass3jn, AnonymousClass327, AnonymousClass0bw, AnonymousClass32D, AnonymousClass0bt {
    /* renamed from: B */
    public boolean f47269B;
    /* renamed from: C */
    public int f47270C;
    /* renamed from: D */
    public AnonymousClass1Zf f47271D;
    /* renamed from: E */
    public boolean f47272E;
    /* renamed from: F */
    public AnonymousClass25i f47273F;
    /* renamed from: G */
    public AnonymousClass0IZ f47274G;
    /* renamed from: H */
    public boolean f47275H = true;
    /* renamed from: I */
    public SearchController f47276I;
    /* renamed from: J */
    public final AnonymousClass32E f47277J = new AnonymousClass32E();
    /* renamed from: K */
    public List f47278K;
    /* renamed from: L */
    public AnonymousClass0Cm f47279L;
    /* renamed from: M */
    public final AnonymousClass31w f47280M = new AnonymousClass31w(new AnonymousClass31l(this));
    /* renamed from: N */
    private float f47281N;
    /* renamed from: O */
    private int f47282O;
    /* renamed from: P */
    private int f47283P;
    /* renamed from: Q */
    private AnonymousClass3e1 f47284Q;
    /* renamed from: R */
    private ColorStateList f47285R;
    public View mHeader;
    public TextView mHeaderDescription;
    public View mMainContainer;
    public View mMembersTabView;
    public TextView mMembersTabViewLabel;
    public AnonymousClass0Ur mProgressDialog;
    public AnonymousClass31z mSearchAdapter;
    public View mSearchRow;
    public AnonymousClass1LM mTabbedFragmentController;

    public final void Cl() {
    }

    public final boolean KV(SearchController searchController) {
        return false;
    }

    public final boolean bW() {
        return true;
    }

    public final void zy(SearchController searchController, boolean z) {
    }

    /* renamed from: B */
    public static void m21660B(FavoritesHomeFragment favoritesHomeFragment) {
        if (AnonymousClass0cJ.E(favoritesHomeFragment.getFragmentManager())) {
            favoritesHomeFragment.getActivity().onBackPressed();
        }
    }

    /* renamed from: C */
    public static void m21661C(FavoritesHomeFragment favoritesHomeFragment) {
        if (favoritesHomeFragment.mProgressDialog == null) {
            AnonymousClass32C A = favoritesHomeFragment.f47277J.m18247A();
            if (A.m18245A()) {
                favoritesHomeFragment.f47280M.m18241A();
                AnonymousClass0kV.f9305E = true;
                m21660B(favoritesHomeFragment);
            } else if (A.f37191D.isEmpty() || !AnonymousClass0xH.B(favoritesHomeFragment.f47279L)) {
                Object obj = (favoritesHomeFragment.f47277J.m18246B().size() >= 5 || favoritesHomeFragment.f47272E) ? null : 1;
                if (obj != null) {
                    favoritesHomeFragment.f47272E = true;
                    new AnonymousClass0P2(favoritesHomeFragment.getContext()).V(C0164R.string.close_friends_home_title_add_more_people_dialog).K(C0164R.string.close_friends_home_message_add_more_people_dialog).S(C0164R.string.close_friends_home_positive_button_add_more_people_dialog, new AnonymousClass31q(favoritesHomeFragment)).N(C0164R.string.not_now, new AnonymousClass31p(favoritesHomeFragment, A)).A().show();
                    return;
                }
                m21662D(favoritesHomeFragment, A);
            } else {
                AnonymousClass0xH.C(favoritesHomeFragment.getContext(), favoritesHomeFragment.f47279L, new AnonymousClass31o(favoritesHomeFragment, A));
            }
        }
    }

    /* renamed from: D */
    public static void m21662D(FavoritesHomeFragment favoritesHomeFragment, AnonymousClass32C anonymousClass32C) {
        AnonymousClass0Ur anonymousClass0Ur = new AnonymousClass0Ur(favoritesHomeFragment.getContext());
        favoritesHomeFragment.mProgressDialog = anonymousClass0Ur;
        anonymousClass0Ur.A(favoritesHomeFragment.getContext().getResources().getString(C0164R.string.close_friends_home_saving));
        favoritesHomeFragment.mProgressDialog.show();
        List arrayList = new ArrayList();
        for (AnonymousClass0Ci id : anonymousClass32C.f37191D) {
            arrayList.add(id.getId());
        }
        List arrayList2 = new ArrayList();
        for (AnonymousClass0Ci id2 : anonymousClass32C.f37192E) {
            arrayList2.add(id2.getId());
        }
        AnonymousClass0GA B = AnonymousClass1YE.B(favoritesHomeFragment.f47279L, favoritesHomeFragment, AnonymousClass32F.AUDIENCE_MANAGER, arrayList, arrayList2);
        B.f2849B = new AnonymousClass31u(favoritesHomeFragment, anonymousClass32C);
        favoritesHomeFragment.schedule(B);
    }

    public final void DDA(AnonymousClass0Ci anonymousClass0Ci) {
        if (this.f47276I.m22216D()) {
            this.f47276I.m22213A(true, (float) this.mHeader.getHeight());
        }
        AnonymousClass0bx C = AnonymousClass0bx.C(this.f47279L, anonymousClass0Ci.getId(), "favorites_home_user_row");
        C.f6906F = getModuleName();
        AnonymousClass0IL D = AnonymousClass0Jj.f2938B.B().D(C.A());
        AnonymousClass0IZ anonymousClass0IZ = this.f47274G;
        anonymousClass0IZ.f2754D = D;
        anonymousClass0IZ.B();
    }

    /* renamed from: E */
    public static void m21663E(FavoritesHomeFragment favoritesHomeFragment) {
        String string;
        if (AnonymousClass0yJ.I(favoritesHomeFragment.f47279L)) {
            string = favoritesHomeFragment.getResources().getString(C0164R.string.close_friends_home_header_text_v4);
        } else {
            string = favoritesHomeFragment.getResources().getString(C0164R.string.close_friends_home_header_text);
        }
        String string2 = favoritesHomeFragment.getResources().getString(C0164R.string.close_friends_home_header_action_text);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" ");
        stringBuilder.append(string2);
        Object stringBuilder2 = stringBuilder.toString();
        CharSequence spannableString = new SpannableString(stringBuilder2);
        AnonymousClass1YF anonymousClass1YF = new AnonymousClass1YF(favoritesHomeFragment);
        int lastIndexOf = stringBuilder2.lastIndexOf(string2);
        spannableString.setSpan(anonymousClass1YF, lastIndexOf, string2.length() + lastIndexOf, 33);
        favoritesHomeFragment.mHeaderDescription.setText(spannableString);
        favoritesHomeFragment.mHeaderDescription.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void Iz(String str) {
        this.f47284Q.mQA(str);
    }

    public final void UBA(SearchController searchController, AnonymousClass3jo anonymousClass3jo, AnonymousClass3jo anonymousClass3jo2) {
        AnonymousClass1Zf anonymousClass1Zf = (AnonymousClass1Zf) this.mTabbedFragmentController.N();
        if (anonymousClass3jo == AnonymousClass3jo.HIDDEN) {
            FavoritesListFragment.m21665B((FavoritesListFragment) this.mTabbedFragmentController.L(AnonymousClass1Zf.SUGGESTIONS));
            FavoritesListFragment.m21665B((FavoritesListFragment) this.mTabbedFragmentController.L(AnonymousClass1Zf.MEMBERS));
        }
    }

    public final float UI(SearchController searchController, AnonymousClass3jm anonymousClass3jm) {
        return (float) this.mHeader.getHeight();
    }

    public final void Vd(SearchController searchController, float f, float f2, AnonymousClass3jm anonymousClass3jm) {
        f2 -= (float) this.mHeader.getHeight();
        AnonymousClass0eT.E(getActivity()).f7727C.setTranslationY(f2);
        this.mMainContainer.setTranslationY(f2);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0IL aF(Object obj) {
        return AnonymousClass0x6.f12474B.C(this.f47279L.f1759C, (AnonymousClass1Zf) obj);
    }

    /* renamed from: b */
    public final AnonymousClass1LP m21664b(AnonymousClass1Zf anonymousClass1Zf) {
        switch (anonymousClass1Zf.ordinal()) {
            case 0:
                return AnonymousClass1LP.B(this.mMembersTabView);
            case 1:
                return AnonymousClass1LP.D(C0164R.string.close_friends_home_suggestions_tab_label);
            default:
                throw new IllegalArgumentException("unsupported tab type");
        }
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        AnonymousClass22r B = AnonymousClass0eW.B(AnonymousClass0eV.DEFAULT);
        B.f25418L = 0;
        anonymousClass0eT.n(false);
        anonymousClass0eT.l(false);
        anonymousClass0eT.Z(C0164R.string.close_friends_home_action_bar_title);
        AnonymousClass0eT.E(getActivity()).Q(getContext().getResources().getString(C0164R.string.done), new AnonymousClass31j(this));
        anonymousClass0eT.d(B.m14277B());
    }

    public final AnonymousClass32E fR() {
        return this.f47277J;
    }

    public final String getModuleName() {
        return this.f47271D == AnonymousClass1Zf.MEMBERS ? "favorites_home_list" : "favorites_home_suggestions";
    }

    public final void nl(AnonymousClass32E anonymousClass32E) {
        if (this.f47276I.m22216D()) {
            this.f47276I.m22213A(true, (float) this.mHeader.getHeight());
        }
        if (!this.f47276I.m22215C()) {
            this.mTabbedFragmentController.O(AnonymousClass1Zf.MEMBERS);
        }
        this.f47273F.m14376A(this.f47277J.m18246B().size());
        this.mMembersTabViewLabel.setCompoundDrawables(null, null, this.f47273F, null);
        this.mMembersTabViewLabel.setCompoundDrawablePadding(this.f47270C);
        AnonymousClass0eT.D(AnonymousClass0eT.E(getActivity()));
    }

    public final /* bridge */ /* synthetic */ void oCA(Object obj) {
        AnonymousClass1Zf anonymousClass1Zf = (AnonymousClass1Zf) obj;
        if (anonymousClass1Zf != this.f47271D) {
            if (isResumed()) {
                AnonymousClass0Iz.f2854L.I(getActivity());
            }
            FavoritesListFragment.m21665B((FavoritesListFragment) this.mTabbedFragmentController.M());
            this.f47271D = anonymousClass1Zf;
            FavoritesListFragment.m21665B((FavoritesListFragment) this.mTabbedFragmentController.M());
            if (isResumed()) {
                AnonymousClass0Iz.f2854L.H(this);
            }
            m21663E(this);
        }
    }

    public final void onAttachFragment(AnonymousClass0IL anonymousClass0IL) {
        super.onAttachFragment(anonymousClass0IL);
        if (anonymousClass0IL instanceof FavoritesListFragment) {
            FavoritesListFragment favoritesListFragment = (FavoritesListFragment) anonymousClass0IL;
            favoritesListFragment.f47290F = this.f47277J;
            AnonymousClass0Rq anonymousClass0Rq = favoritesListFragment.f47286B;
            if (anonymousClass0Rq != null) {
                anonymousClass0Rq.E();
            }
            favoritesListFragment.f47293I = this.f47280M;
        }
    }

    public final boolean onBackPressed() {
        if (!this.f47277J.m18247A().m18245A()) {
            if (!this.f47269B) {
                this.f47280M.f37140I = AnonymousClass31v.CANCEL_DIALOG_SAVE_CHANGES;
                m21661C(this);
                return true;
            }
        }
        if (this.f47280M.f37140I == null) {
            this.f47280M.f37140I = this.f47269B ? AnonymousClass31v.CANCEL_DIALOG_DISCARD_CHANGES : AnonymousClass31v.CANCEL;
        }
        this.f47280M.m18241A();
        AnonymousClass0kV.f9305E = true;
        return false;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int F = AnonymousClass0cQ.F(this, -1016716526);
        super.onCreate(bundle);
        this.f47279L = AnonymousClass0Ce.G(getArguments());
        this.f47274G = new AnonymousClass0IZ(getActivity());
        if (getArguments() != null) {
            str = "entry_point";
            if (getArguments().containsKey(str)) {
                this.f47280M.f37138G = (AnonymousClass0xq) getArguments().getSerializable(str);
            }
        }
        this.f47270C = Math.round(AnonymousClass0Nm.C(getContext(), 8));
        this.f47282O = Math.round(AnonymousClass0Nm.C(getContext(), 4));
        this.f47283P = getContext().getResources().getDimensionPixelSize(C0164R.dimen.top_tabbar_text_size_normal);
        this.f47281N = AnonymousClass0Nm.C(getContext(), 4);
        int C = AnonymousClass0Ca.C(getContext(), AnonymousClass0G5.F(getContext(), C0164R.attr.textColorPrimary));
        int C2 = AnonymousClass0Ca.C(getContext(), AnonymousClass0G5.F(getContext(), C0164R.attr.textColorSecondary));
        r5 = new int[2][];
        r5[0] = new int[]{16842913};
        r5[1] = new int[0];
        this.f47285R = new ColorStateList(r5, new int[]{C, C2});
        List arrayList = new ArrayList();
        this.f47278K = arrayList;
        arrayList.add(AnonymousClass1Zf.MEMBERS);
        this.f47278K.add(AnonymousClass1Zf.SUGGESTIONS);
        str = "initial_tab";
        this.f47271D = getArguments().containsKey(str) ? (AnonymousClass1Zf) getArguments().getSerializable(str) : AnonymousClass1Zf.MEMBERS;
        AnonymousClass0cQ.G(this, 1043981289, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 665970009);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_close_friends_home, viewGroup, false);
        AnonymousClass0cQ.G(this, 2004510918, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -504521046);
        super.onDestroyView();
        FavoritesHomeFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, 1412608837, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -959553967);
        super.onPause();
        this.f47277J.m18250D(this);
        AnonymousClass0cQ.G(this, -933573467, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -1448532166);
        super.onResume();
        this.f47277J.f37194C.add(new WeakReference(this));
        this.mTabbedFragmentController.O(this.f47271D);
        AnonymousClass0cQ.G(this, 701681205, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        super.onViewCreated(view, bundle);
        this.mMainContainer = view.findViewById(C0164R.id.main_container);
        this.mHeader = view.findViewById(C0164R.id.header);
        this.mHeaderDescription = (TextView) view.findViewById(C0164R.id.close_friends_home_description);
        View findViewById = view.findViewById(C0164R.id.search_row);
        this.mSearchRow = findViewById;
        findViewById.findViewById(C0164R.id.search_row_underline).setBackgroundColor(AnonymousClass0Ca.C(getContext(), C0164R.color.black_20_transparent));
        FixedTabBar fixedTabBar = (FixedTabBar) view.findViewById(C0164R.id.fixed_tabbar_view);
        View inflate = fixedTabBar.f17430C.inflate(C0164R.layout.members_tab_header, fixedTabBar.f17436I, false);
        this.mMembersTabView = inflate;
        this.mMembersTabViewLabel = (TextView) inflate.findViewById(C0164R.id.label);
        this.f47273F = new AnonymousClass25i(this.f47277J.m18246B().size(), this.f47285R, this.f47282O, this.f47281N, (float) this.f47283P);
        this.mMembersTabViewLabel.setCompoundDrawables(null, null, this.f47273F, null);
        this.mMembersTabViewLabel.setCompoundDrawablePadding(this.f47270C);
        this.mMembersTabViewLabel.setTextColor(this.f47285R);
        this.mMembersTabView.setOnClickListener(new AnonymousClass31m(this));
        this.mSearchAdapter = new AnonymousClass31z(getContext(), AnonymousClass31x.SEARCH, this);
        AnonymousClass3e1 B = AnonymousClass3dl.m20277B(this.f47279L, new AnonymousClass0Px(getContext(), getLoaderManager()), this, (String) AnonymousClass0CC.UB.H(this.f47279L), new AnonymousClass3x1(this), null, null, null);
        this.f47284Q = B;
        B.EPA(this.mSearchAdapter);
        AnonymousClass0TK searchController = new SearchController(getActivity(), (ViewGroup) view2.findViewById(C0164R.id.search_container), 0, this.mSearchAdapter, (AnonymousClass3jn) this, false, null);
        this.f47276I = searchController;
        registerLifecycleListener(searchController);
        this.mSearchRow.setOnClickListener(new AnonymousClass31n(this));
        m21663E(this);
        this.mTabbedFragmentController = new AnonymousClass1LM(this, getChildFragmentManager(), (ViewPager) view2.findViewById(C0164R.id.view_pager), fixedTabBar, this.f47278K);
        if (this.f47275H) {
            r9.f47275H = false;
            if (r9.f47279L.B().a()) {
                r9.mTabbedFragmentController.O(AnonymousClass1Zf.MEMBERS);
            } else {
                r9.mTabbedFragmentController.O(AnonymousClass1Zf.SUGGESTIONS);
            }
        }
    }

    public final void tz(AnonymousClass32E anonymousClass32E, AnonymousClass0Ci anonymousClass0Ci, boolean z, AnonymousClass31x anonymousClass31x, String str, int i) {
        AnonymousClass0NN B = AnonymousClass0NN.B("ig_search_result_selected", new AnonymousClass31k(this, anonymousClass31x));
        B.F("uid", anonymousClass0Ci.getId()).H("selected", z).B("position", i);
        if (anonymousClass31x == AnonymousClass31x.SEARCH) {
            B.F("query", this.f47284Q.LQ());
        }
        if (str != null) {
            B.F("rank_token", str);
        }
        B.R();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1LP vF(Object obj) {
        return m21664b((AnonymousClass1Zf) obj);
    }

    public final void zCA(AnonymousClass328 anonymousClass328, AnonymousClass0Ci anonymousClass0Ci, boolean z, AnonymousClass31x anonymousClass31x, int i, String str) {
        this.f47277J.m18251E(anonymousClass0Ci, z, anonymousClass31x, i, str);
    }
}

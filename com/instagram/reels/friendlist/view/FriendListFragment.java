package com.instagram.reels.friendlist.view;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ca;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Ci;
import X.AnonymousClass0Cm;
import X.AnonymousClass0Cn;
import X.AnonymousClass0EE;
import X.AnonymousClass0G5;
import X.AnonymousClass0GA;
import X.AnonymousClass0HV;
import X.AnonymousClass0IG;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0IS;
import X.AnonymousClass0Iz;
import X.AnonymousClass0Nm;
import X.AnonymousClass0Pt;
import X.AnonymousClass0Pu;
import X.AnonymousClass0Px;
import X.AnonymousClass0Rq;
import X.AnonymousClass0TK;
import X.AnonymousClass0Ur;
import X.AnonymousClass0bt;
import X.AnonymousClass0bw;
import X.AnonymousClass0cJ;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ca;
import X.AnonymousClass0eT;
import X.AnonymousClass0eV;
import X.AnonymousClass0eW;
import X.AnonymousClass0eb;
import X.AnonymousClass1LM;
import X.AnonymousClass1LP;
import X.AnonymousClass22r;
import X.AnonymousClass25i;
import X.AnonymousClass2Fo;
import X.AnonymousClass2Fp;
import X.AnonymousClass3dl;
import X.AnonymousClass3e1;
import X.AnonymousClass3jm;
import X.AnonymousClass3jn;
import X.AnonymousClass3jo;
import X.AnonymousClass5AR;
import X.AnonymousClass5AU;
import X.AnonymousClass5AW;
import X.AnonymousClass5AY;
import X.AnonymousClass5AZ;
import X.AnonymousClass5Aa;
import X.AnonymousClass5Ab;
import X.AnonymousClass5Ac;
import X.AnonymousClass5Ad;
import X.AnonymousClass5Af;
import X.AnonymousClass5Ag;
import X.AnonymousClass5Ah;
import X.AnonymousClass5Ak;
import X.AnonymousClass5Al;
import X.AnonymousClass5An;
import X.AnonymousClass5At;
import X.AnonymousClass5Av;
import X.AnonymousClass5BE;
import X.AnonymousClass5BF;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import com.instagram.ui.widget.search.SearchController;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;

public class FriendListFragment extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass3jn, AnonymousClass5Ak, AnonymousClass0bw, AnonymousClass5BE, AnonymousClass0bt {
    /* renamed from: B */
    public int f66418B;
    /* renamed from: C */
    public AnonymousClass5Av f66419C;
    /* renamed from: D */
    public final AnonymousClass0EE f66420D = new AnonymousClass5AZ(this);
    /* renamed from: E */
    public AnonymousClass25i f66421E;
    /* renamed from: F */
    public AnonymousClass2Fo f66422F;
    /* renamed from: G */
    public boolean f66423G = true;
    /* renamed from: H */
    public SearchController f66424H;
    /* renamed from: I */
    public AnonymousClass5BF f66425I;
    /* renamed from: J */
    public List f66426J;
    /* renamed from: K */
    public AnonymousClass0Cm f66427K;
    /* renamed from: L */
    private boolean f66428L;
    /* renamed from: M */
    private float f66429M;
    /* renamed from: N */
    private int f66430N;
    /* renamed from: O */
    private int f66431O;
    /* renamed from: P */
    private String f66432P;
    /* renamed from: Q */
    private String f66433Q;
    /* renamed from: R */
    private final AnonymousClass0EE f66434R = new AnonymousClass5AY(this);
    /* renamed from: S */
    private AnonymousClass3e1 f66435S;
    /* renamed from: T */
    private ColorStateList f66436T;
    /* renamed from: U */
    private boolean f66437U;
    public View mCheckButton;
    public View mDoneButton;
    public View mFocusOverlay;
    public View mFriendListNameEditTextContainer;
    public AnonymousClass5At mFriendListNameEditorController;
    public View mHeader;
    public View mMainContainer;
    public View mMembersTabView;
    public TextView mMembersTabViewLabel;
    public AnonymousClass5AW mSearchAdapter;
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

    public final void ADA(AnonymousClass5Al anonymousClass5Al, AnonymousClass0Ci anonymousClass0Ci, boolean z, AnonymousClass5An anonymousClass5An, int i, String str) {
        this.f66425I.m25932D(anonymousClass0Ci, z, anonymousClass5An, i, str);
    }

    /* renamed from: B */
    public static void m27643B(FriendListFragment friendListFragment) {
        if (!friendListFragment.mFriendListNameEditorController.m25915A()) {
            friendListFragment.f66422F.f28149D = new ArrayList(friendListFragment.f66425I.m25929A());
            if (!TextUtils.isEmpty(friendListFragment.f66422F.f28148C)) {
                AnonymousClass0Cn anonymousClass0Cn;
                String str;
                String str2;
                JSONArray jSONArray;
                List<AnonymousClass0Ci> A = friendListFragment.f66425I.m25929A();
                boolean z = friendListFragment.f66422F.f28147B == null;
                if (z) {
                    anonymousClass0Cn = friendListFragment.f66427K;
                    str = friendListFragment.f66422F.f28148C;
                    str2 = "friendships/friends_lists/create/";
                    jSONArray = new JSONArray();
                    for (AnonymousClass0Ci id : A) {
                        jSONArray.put(id.getId());
                    }
                } else {
                    anonymousClass0Cn = friendListFragment.f66427K;
                    str2 = friendListFragment.f66422F.f28147B;
                    str = friendListFragment.f66422F.f28148C;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("friendships/friends_lists/");
                    stringBuilder.append(str2);
                    stringBuilder.append("/edit/");
                    str2 = stringBuilder.toString();
                    jSONArray = new JSONArray();
                    for (AnonymousClass0Ci id2 : A) {
                        jSONArray.put(id2.getId());
                    }
                }
                AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
                anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
                anonymousClass0Pt.f4229M = str2;
                AnonymousClass0GA H = anonymousClass0Pt.D("name", str).D("user_ids", jSONArray.toString()).M(AnonymousClass5AR.class).N().H();
                AnonymousClass0Ur anonymousClass0Ur = new AnonymousClass0Ur(friendListFragment.getActivity());
                anonymousClass0Ur.A(friendListFragment.getResources().getString(C0164R.string.friends_sticker_saving));
                anonymousClass0Ur.show();
                H.f2849B = new AnonymousClass5Af(friendListFragment, z, anonymousClass0Ur);
                friendListFragment.schedule(H);
            } else if (friendListFragment.f66422F.A()) {
                friendListFragment.f66428L = true;
                friendListFragment.f66422F.f28148C = friendListFragment.f66433Q;
                m27644C(friendListFragment);
            } else {
                friendListFragment.mFriendListNameEditorController.f60873I.requestFocus();
            }
        }
    }

    /* renamed from: C */
    public static void m27644C(FriendListFragment friendListFragment) {
        if (AnonymousClass0cJ.E(friendListFragment.getFragmentManager())) {
            friendListFragment.getActivity().onBackPressed();
        }
    }

    public final void CDA(AnonymousClass5Al anonymousClass5Al, AnonymousClass0Ci anonymousClass0Ci, boolean z, AnonymousClass5An anonymousClass5An, int i, String str) {
        this.f66425I.m25932D(anonymousClass0Ci, z, anonymousClass5An, i, str);
    }

    public final void Iz(String str) {
        this.f66435S.mQA(str);
    }

    public final void UBA(SearchController searchController, AnonymousClass3jo anonymousClass3jo, AnonymousClass3jo anonymousClass3jo2) {
        AnonymousClass5Av anonymousClass5Av = (AnonymousClass5Av) this.mTabbedFragmentController.N();
        if (anonymousClass3jo == AnonymousClass3jo.HIDDEN) {
            FriendListTabFragment.m27646B((FriendListTabFragment) this.mTabbedFragmentController.L(AnonymousClass5Av.SUGGESTIONS));
            FriendListTabFragment.m27646B((FriendListTabFragment) this.mTabbedFragmentController.L(AnonymousClass5Av.MEMBERS));
        }
        AnonymousClass0Iz anonymousClass0Iz;
        if (anonymousClass3jo == AnonymousClass3jo.REVEALED) {
            anonymousClass0Iz = AnonymousClass0Iz.f2854L;
            anonymousClass0Iz.K(this, 0, null);
            anonymousClass0Iz.H(this.f66434R);
        } else if (anonymousClass3jo == AnonymousClass3jo.HIDDEN) {
            anonymousClass0Iz = AnonymousClass0Iz.f2854L;
            anonymousClass0Iz.K(this.f66434R, 0, null);
            anonymousClass0Iz.H(this);
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

    public final void Xz(AnonymousClass5BF anonymousClass5BF) {
        if (this.f66424H.D()) {
            this.f66424H.A(true, (float) this.mHeader.getHeight());
        }
        if (!this.f66424H.C()) {
            this.mTabbedFragmentController.O(AnonymousClass5Av.MEMBERS);
        }
        this.f66421E.A(this.f66425I.m25929A().size());
        this.mMembersTabViewLabel.setCompoundDrawables(null, null, this.f66421E, null);
        this.mMembersTabViewLabel.setCompoundDrawablePadding(this.f66418B);
        AnonymousClass0eT.D(AnonymousClass0eT.E(getActivity()));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0IL aF(Object obj) {
        AnonymousClass5Av anonymousClass5Av = (AnonymousClass5Av) obj;
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.USER_ID", this.f66427K.f1759C);
        bundle.putSerializable("tab", anonymousClass5Av);
        AnonymousClass0IL friendListTabFragment = new FriendListTabFragment();
        friendListTabFragment.setArguments(bundle);
        friendListTabFragment.f66445G = this.f66425I;
        AnonymousClass0Rq anonymousClass0Rq = friendListTabFragment.f66440B;
        if (anonymousClass0Rq != null) {
            anonymousClass0Rq.E();
        }
        return friendListTabFragment;
    }

    /* renamed from: b */
    public final AnonymousClass1LP m27645b(AnonymousClass5Av anonymousClass5Av) {
        switch (anonymousClass5Av.ordinal()) {
            case 0:
                return AnonymousClass1LP.B(this.mMembersTabView);
            case 1:
                return AnonymousClass1LP.D(C0164R.string.friends_sticker_suggestions_tab_label);
            default:
                throw new IllegalArgumentException("unsupported tab type");
        }
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        AnonymousClass22r B = AnonymousClass0eW.B(AnonymousClass0eV.DEFAULT);
        B.f25418L = 0;
        anonymousClass0eT.W(getResources().getDimensionPixelSize(C0164R.dimen.friends_editor_action_bar_height));
        anonymousClass0eT.n(false);
        anonymousClass0eT.l(false);
        View Q = anonymousClass0eT.Q(getResources().getString(C0164R.string.done), new AnonymousClass5Ag(this));
        this.mDoneButton = Q;
        LayoutParams layoutParams = (LayoutParams) Q.getLayoutParams();
        layoutParams.gravity = 16;
        this.mDoneButton.setLayoutParams(layoutParams);
        AnonymousClass0eb anonymousClass0eb = AnonymousClass0eb.DONE;
        int C = AnonymousClass0Ca.C(getContext(), C0164R.color.blue_5);
        ImageView H = anonymousClass0eT.H(anonymousClass0eb.f7807C, anonymousClass0eb.f7806B, new AnonymousClass5Ah(this), null);
        H.setColorFilter(AnonymousClass0ca.B(C));
        this.mCheckButton = H;
        layoutParams = (LayoutParams) H.getLayoutParams();
        layoutParams.gravity = 16;
        this.mCheckButton.setLayoutParams(layoutParams);
        anonymousClass0eT.d(B.B());
        AnonymousClass5At anonymousClass5At = this.mFriendListNameEditorController;
        View view = this.mDoneButton;
        Q = this.mCheckButton;
        anonymousClass5At.f60868D = view;
        anonymousClass5At.f60867C = Q;
        AnonymousClass5At.m25914D(anonymousClass5At);
        AnonymousClass5At.m25913C(anonymousClass5At, anonymousClass0eT);
    }

    public final AnonymousClass5BF gR() {
        return this.f66425I;
    }

    public final String getModuleName() {
        switch (this.f66419C.ordinal()) {
            case 0:
                return "friend-sticker-edit";
            case 1:
                return "friend-sticker-suggestions";
            default:
                throw new IllegalArgumentException("unsupported tab type");
        }
    }

    public final /* bridge */ /* synthetic */ void oCA(Object obj) {
        AnonymousClass5Av anonymousClass5Av = (AnonymousClass5Av) obj;
        if (anonymousClass5Av != this.f66419C) {
            if (isResumed()) {
                AnonymousClass0Iz.f2854L.I(getActivity());
            }
            FriendListTabFragment.m27646B((FriendListTabFragment) this.mTabbedFragmentController.M());
            this.f66419C = anonymousClass5Av;
            FriendListTabFragment.m27646B((FriendListTabFragment) this.mTabbedFragmentController.M());
            if (isResumed()) {
                AnonymousClass0Iz.f2854L.H(this);
            }
        }
    }

    public final boolean onBackPressed() {
        if (this.mFriendListNameEditorController.m25915A()) {
            return true;
        }
        AnonymousClass5BF anonymousClass5BF = this.f66425I;
        AnonymousClass5AU anonymousClass5AU = new AnonymousClass5AU();
        for (AnonymousClass0Ci anonymousClass0Ci : anonymousClass5BF.f60921D) {
            if (!anonymousClass5BF.f60923F.contains(anonymousClass0Ci)) {
                anonymousClass5AU.f60809D.add(anonymousClass0Ci);
                if (anonymousClass5BF.f60922E.get(anonymousClass0Ci) == AnonymousClass5An.SEARCH) {
                    anonymousClass5AU.f60807B++;
                } else if (anonymousClass5BF.f60922E.get(anonymousClass0Ci) == AnonymousClass5An.SUGGESTION) {
                    anonymousClass5AU.f60808C++;
                }
            }
        }
        for (AnonymousClass0Ci anonymousClass0Ci2 : anonymousClass5BF.f60923F) {
            if (!anonymousClass5BF.f60921D.contains(anonymousClass0Ci2)) {
                anonymousClass5AU.f60810E.add(anonymousClass0Ci2);
            }
        }
        Object obj = (anonymousClass5AU.f60809D.isEmpty() && anonymousClass5AU.f60810E.isEmpty()) ? 1 : null;
        if (obj == null) {
            if (!this.f66428L) {
                m27643B(this);
                return true;
            }
        }
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -2012830024);
        super.onCreate(bundle);
        this.f66427K = AnonymousClass0Ce.G(getArguments());
        this.f66425I = new AnonymousClass5BF();
        this.f66418B = Math.round(AnonymousClass0Nm.C(getContext(), 8));
        this.f66430N = Math.round(AnonymousClass0Nm.C(getContext(), 4));
        this.f66431O = getContext().getResources().getDimensionPixelSize(C0164R.dimen.top_tabbar_text_size_normal);
        this.f66429M = AnonymousClass0Nm.C(getContext(), 4);
        int C = AnonymousClass0Ca.C(getContext(), AnonymousClass0G5.F(getContext(), C0164R.attr.textColorPrimary));
        int C2 = AnonymousClass0Ca.C(getContext(), AnonymousClass0G5.F(getContext(), C0164R.attr.textColorSecondary));
        r5 = new int[2][];
        r5[0] = new int[]{16842913};
        r5[1] = new int[0];
        this.f66436T = new ColorStateList(r5, new int[]{C, C2});
        List arrayList = new ArrayList();
        this.f66426J = arrayList;
        arrayList.add(AnonymousClass5Av.MEMBERS);
        this.f66426J.add(AnonymousClass5Av.SUGGESTIONS);
        String string = getArguments().getString("friend_list_id");
        this.f66432P = string;
        if (string != null) {
            this.f66422F = (AnonymousClass2Fo) AnonymousClass2Fp.B(this.f66427K).f28150B.get(this.f66432P);
        } else {
            this.f66422F = new AnonymousClass2Fo(null, null);
        }
        this.f66433Q = this.f66422F.f28148C;
        this.f66419C = this.f66422F.A() ? AnonymousClass5Av.SUGGESTIONS : AnonymousClass5Av.MEMBERS;
        AnonymousClass2Fo anonymousClass2Fo = this.f66422F;
        if (anonymousClass2Fo != null) {
            AnonymousClass5BF anonymousClass5BF = this.f66425I;
            List list = anonymousClass2Fo.f28149D;
            if (list == null) {
                list = Collections.emptyList();
            }
            anonymousClass5BF.m25933E(list);
        }
        AnonymousClass0cQ.G(this, -979301815, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1463915453);
        View inflate = layoutInflater.inflate(C0164R.layout.friend_list_editor, viewGroup, false);
        AnonymousClass0cQ.G(this, -2136510003, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -270995554);
        super.onDestroyView();
        FriendListFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0cQ.G(this, -1530478702, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 1333817475);
        super.onPause();
        this.f66425I.m25931C(this);
        AnonymousClass0cQ.G(this, 1606035795, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 1338667571);
        super.onResume();
        this.f66425I.f60920C.add(new WeakReference(this));
        this.mTabbedFragmentController.O(this.f66419C);
        FriendListTabFragment friendListTabFragment = (FriendListTabFragment) this.mTabbedFragmentController.L(AnonymousClass5Av.SUGGESTIONS);
        AnonymousClass5Av anonymousClass5Av = this.f66419C;
        FriendListTabFragment.m27646B(friendListTabFragment);
        friendListTabFragment = (FriendListTabFragment) this.mTabbedFragmentController.L(AnonymousClass5Av.MEMBERS);
        anonymousClass5Av = this.f66419C;
        FriendListTabFragment.m27646B(friendListTabFragment);
        AnonymousClass0cQ.G(this, -366293747, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        super.onViewCreated(view, bundle);
        this.mMainContainer = view.findViewById(C0164R.id.main_container);
        this.mHeader = view.findViewById(C0164R.id.header);
        View findViewById = view.findViewById(C0164R.id.search_row);
        this.mSearchRow = findViewById;
        findViewById.findViewById(C0164R.id.search_row_underline).setBackgroundColor(AnonymousClass0Ca.C(getContext(), C0164R.color.black_20_transparent));
        findViewById = view.findViewById(C0164R.id.focus_overlay);
        this.mFocusOverlay = findViewById;
        findViewById.setOnClickListener(new AnonymousClass5Aa(this));
        FixedTabBar fixedTabBar = (FixedTabBar) view.findViewById(C0164R.id.fixed_tabbar_view);
        View inflate = fixedTabBar.f17430C.inflate(C0164R.layout.members_tab_header, fixedTabBar.f17436I, false);
        this.mMembersTabView = inflate;
        this.mMembersTabViewLabel = (TextView) inflate.findViewById(C0164R.id.label);
        this.f66421E = new AnonymousClass25i(this.f66425I.m25929A().size(), this.f66436T, this.f66430N, this.f66429M, (float) this.f66431O);
        this.mMembersTabViewLabel.setCompoundDrawables(null, null, this.f66421E, null);
        this.mMembersTabViewLabel.setCompoundDrawablePadding(this.f66418B);
        this.mMembersTabViewLabel.setTextColor(this.f66436T);
        this.mMembersTabView.setOnClickListener(new AnonymousClass5Ab(this));
        this.mSearchAdapter = new AnonymousClass5AW(getContext(), AnonymousClass5An.SEARCH, this);
        AnonymousClass3e1 B = AnonymousClass3dl.B(this.f66427K, new AnonymousClass0Px(getContext(), getLoaderManager()), this, (String) AnonymousClass0CC.UB.H(this.f66427K), new AnonymousClass5Ac(this), null, null, null);
        this.f66435S = B;
        B.EPA(this.mSearchAdapter);
        AnonymousClass0TK searchController = new SearchController(getActivity(), (ViewGroup) view2.findViewById(C0164R.id.search_container), 0, this.mSearchAdapter, this, false, null);
        this.f66424H = searchController;
        registerLifecycleListener(searchController);
        this.mSearchRow.setOnClickListener(new AnonymousClass5Ad(this));
        this.mTabbedFragmentController = new AnonymousClass1LM(this, getChildFragmentManager(), (ViewPager) view2.findViewById(C0164R.id.view_pager), fixedTabBar, this.f66426J);
        if (this.f66423G) {
            r9.f66423G = false;
            if (r9.f66422F.A()) {
                r9.mTabbedFragmentController.O(AnonymousClass5Av.SUGGESTIONS);
            } else {
                r9.mTabbedFragmentController.O(AnonymousClass5Av.MEMBERS);
            }
        }
        r9.mFriendListNameEditorController = new AnonymousClass5At(getActivity(), r9.f66422F, r9.mFocusOverlay, r9);
    }

    public final void uz(AnonymousClass5BF anonymousClass5BF, AnonymousClass0Ci anonymousClass0Ci, boolean z, AnonymousClass5An anonymousClass5An, String str, int i) {
        if ((this.f66422F.f28147B == null ? 1 : null) == null) {
            AnonymousClass0HV D = AnonymousClass0HV.D(this.f66427K);
            Object obj = (!z || D.f2646B.getInt("friend_list_add_count", 0) >= 2) ? null : 1;
            Object obj2 = (z || D.f2646B.getInt("friend_list_remove_count", 0) >= 2) ? null : 1;
            if (!this.f66437U) {
                if (obj != null || obj2 != null) {
                    AnonymousClass0IG.B(getContext(), getResources().getString(z ? C0164R.string.friend_list_friend_added_nux : C0164R.string.friend_list_friend_removed_nux, new Object[]{anonymousClass0Ci.uT()}), 0, 0);
                    String str2;
                    if (z) {
                        str2 = "friend_list_add_count";
                        D.f2646B.edit().putInt(str2, D.f2646B.getInt(str2, 0) + 1).apply();
                    } else {
                        str2 = "friend_list_remove_count";
                        D.f2646B.edit().putInt(str2, D.f2646B.getInt(str2, 0) + 1).apply();
                    }
                    this.f66437U = true;
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1LP vF(Object obj) {
        return m27645b((AnonymousClass5Av) obj);
    }
}

package X;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.facebook.C0164R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.model.hashtag.Hashtag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: X.6FD */
public final class AnonymousClass6FD extends AnonymousClass0IJ implements AnonymousClass3dy, AnonymousClass3eM, AnonymousClass5Ej, AnonymousClass5EZ, AnonymousClass3e8, AnonymousClass3eF, AnonymousClass5Et, AnonymousClass1ev {
    /* renamed from: B */
    public AnonymousClass616 f73311B;
    /* renamed from: C */
    public String f73312C = JsonProperty.USE_DEFAULT_NAME;
    /* renamed from: D */
    public boolean f73313D;
    /* renamed from: E */
    public boolean f73314E;
    /* renamed from: F */
    public AnonymousClass5Ew f73315F;
    /* renamed from: G */
    private AnonymousClass3e5 f73316G;
    /* renamed from: H */
    private boolean f73317H;
    /* renamed from: I */
    private AnonymousClass5F5 f73318I;
    /* renamed from: J */
    private final AnonymousClass5Ev f73319J = new AnonymousClass619(this);
    /* renamed from: K */
    private AnonymousClass3e0 f73320K;
    /* renamed from: L */
    private AnonymousClass3bR f73321L;
    /* renamed from: M */
    private AnonymousClass5Ef f73322M;
    /* renamed from: N */
    private AnonymousClass0MC f73323N;
    /* renamed from: O */
    private final AnonymousClass0F8 f73324O = new AnonymousClass61A(this);
    /* renamed from: P */
    private AnonymousClass0Cm f73325P;
    /* renamed from: Q */
    private final AnonymousClass3eO f73326Q = new AnonymousClass61B(this);

    public final void Fx(String str) {
    }

    public final void Lx(String str) {
    }

    public final String getModuleName() {
        return "blended_search";
    }

    public final void AFA(AnonymousClass0Ci anonymousClass0Ci, int i) {
        AnonymousClass0Ci anonymousClass0Ci2 = anonymousClass0Ci;
        String id = anonymousClass0Ci.getId();
        String D = AnonymousClass6FD.m29618D(this, id);
        int i2 = i;
        m29621G(id, D, i);
        anonymousClass0Ci.QC = Integer.valueOf(0);
        AnonymousClass6FD.m29616B(this).mo5860f().m26057C(this.f73325P, getActivity(), anonymousClass0Ci2, this.f73312C, D, i2, this);
        AnonymousClass1KJ.f17170B.E(anonymousClass0Ci);
    }

    public final void Ax(String str, AnonymousClass0Q6 anonymousClass0Q6) {
        if (str.equals(this.f73312C)) {
            this.f73314E = false;
            this.f73313D = true;
            m29622H(this.f73312C, false);
        }
    }

    /* renamed from: B */
    public static AnonymousClass5Ek m29616B(AnonymousClass6FD anonymousClass6FD) {
        return (AnonymousClass5Ek) anonymousClass6FD.getParentFragment();
    }

    /* renamed from: C */
    public static String m29617C(AnonymousClass6FD anonymousClass6FD) {
        if (anonymousClass6FD.f73311B.f70939C) {
            return anonymousClass6FD.f73311B.f70948L;
        }
        return anonymousClass6FD.f73311B.f70943G;
    }

    public final void Cz() {
        if (this.f73313D) {
            this.f73314E = true;
            this.f73320K.B(this.f73312C);
            hV();
        }
    }

    /* renamed from: D */
    public static String m29618D(AnonymousClass6FD anonymousClass6FD, String str) {
        if (anonymousClass6FD.f73311B.m28783I(str)) {
            return anonymousClass6FD.f73311B.f70948L;
        }
        return anonymousClass6FD.f73311B.f70943G;
    }

    /* renamed from: E */
    public static void m29619E(AnonymousClass6FD anonymousClass6FD, boolean z) {
        AnonymousClass615 G = anonymousClass6FD.f73311B.m28781G(null);
        AnonymousClass5Ef anonymousClass5Ef = anonymousClass6FD.f73322M;
        String C = AnonymousClass6FD.m29617C(anonymousClass6FD);
        String str = anonymousClass6FD.f73312C;
        List list = G.f70934C;
        AnonymousClass5Ef.m26036C(anonymousClass5Ef, C, str, z, list).G("results_type_list", G.f70935D).R();
    }

    public final void EFA(AnonymousClass0Ci anonymousClass0Ci, int i) {
        String id = anonymousClass0Ci.getId();
        if (TextUtils.isEmpty(this.f73312C) && this.f73311B.m28783I(id)) {
            boolean I = this.f73311B.m28783I(id);
            AnonymousClass6FD.m29616B(this).mo5856b().A(anonymousClass0Ci, I);
            AnonymousClass6FD.m29620F(this, id, i, I);
        }
    }

    public final void Ez() {
        this.f73317H = true;
    }

    /* renamed from: F */
    public static void m29620F(AnonymousClass6FD anonymousClass6FD, String str, int i, boolean z) {
        AnonymousClass5Ef.m26037D(AnonymousClass6FD.m29616B(anonymousClass6FD), anonymousClass6FD.f73315F.m26060A(), AnonymousClass6FD.m29617C(anonymousClass6FD), str, "USER", i, z ? "suggested" : JsonProperty.USE_DEFAULT_NAME);
    }

    public final void FFA(AnonymousClass0Ci anonymousClass0Ci, int i) {
        String id = anonymousClass0Ci.getId();
        m29621G(id, AnonymousClass6FD.m29618D(this, id), i);
    }

    /* renamed from: G */
    private void m29621G(String str, String str2, int i) {
        AnonymousClass615 G = this.f73311B.m28781G(str);
        AnonymousClass5Ef anonymousClass5Ef = this.f73322M;
        String str3 = G.f70936E;
        String str4 = G.f70933B;
        String str5 = this.f73312C;
        str = G.f70934C;
        anonymousClass5Ef.m26038A(str2, str5, AnonymousClass1KN.BLENDED, str3, str4, i, str).G("results_type_list", G.f70935D).R();
    }

    /* renamed from: H */
    private void m29622H(CharSequence charSequence, boolean z) {
        int C;
        String string;
        if (this.f73313D) {
            C = AnonymousClass0Ca.C(getContext(), C0164R.color.blue_5);
            string = getResources().getString(C0164R.string.search_for_x, new Object[]{charSequence});
        } else {
            C = AnonymousClass0Ca.C(getContext(), C0164R.color.grey_5);
            string = getContext().getString(C0164R.string.searching);
        }
        AnonymousClass616 anonymousClass616 = this.f73311B;
        anonymousClass616.f70946J = true;
        anonymousClass616.f70945I.f43664B = z;
        anonymousClass616.f70944H.A(string, C);
        AnonymousClass616.m28776B(anonymousClass616);
    }

    public final boolean IFA(AnonymousClass0Ci anonymousClass0Ci, int i) {
        boolean I = this.f73311B.m28783I(anonymousClass0Ci.getId());
        if (!TextUtils.isEmpty(this.f73312C) || !I) {
            return false;
        }
        AnonymousClass5FO.m26068B(getContext(), anonymousClass0Ci.uT(), anonymousClass0Ci.DQ(), new AnonymousClass61F(this, anonymousClass0Ci, I, i));
        return true;
    }

    public final void Iz(String str) {
        if (!str.equals(this.f73312C)) {
            this.f73312C = str;
            this.f73322M.m26043F();
            this.f73314E = true;
            if (this.f73311B.m28785K(this.f73312C)) {
                AnonymousClass616 anonymousClass616 = this.f73311B;
                anonymousClass616.f70946J = false;
                AnonymousClass616.m28776B(anonymousClass616);
                if (!this.f73311B.f70939C) {
                    AnonymousClass6FD.m29619E(this, true);
                }
            } else {
                this.f73320K.C(this.f73312C);
                m29622H(this.f73312C, true);
            }
            AnonymousClass5F5.m26064B(this.f73318I);
        }
    }

    public final void Jt() {
        if (AnonymousClass6FD.m29616B(this) != null) {
            Iz(AnonymousClass6FD.m29616B(this).mo5862h());
            if (TextUtils.isEmpty(this.f73312C)) {
                this.f73311B.m28785K(this.f73312C);
            }
        }
    }

    public final void Nt() {
        AnonymousClass5F5 anonymousClass5F5 = this.f73318I;
        if (anonymousClass5F5 != null) {
            AnonymousClass5F5.m26064B(anonymousClass5F5);
        }
    }

    public final void PZ() {
        if (this.f73314E && !this.f73313D && !this.f73320K.A() && !TextUtils.isEmpty(this.f73312C) && this.f73312C.length() > 1) {
            this.f73320K.D(this.f73312C);
            m29622H(null, true);
        }
    }

    public final void QFA() {
        this.f73321L.A();
    }

    public final /* bridge */ /* synthetic */ void Qx(String str, AnonymousClass0Pn anonymousClass0Pn) {
        AnonymousClass61I anonymousClass61I = (AnonymousClass61I) anonymousClass0Pn;
        if (str.equals(this.f73312C)) {
            if (TextUtils.isEmpty(anonymousClass61I.QQ())) {
                AnonymousClass0Gn.H("TopSearchResponse", "Invalid TopSearchResponse format, missing rankToken");
            }
            List VN = anonymousClass61I.VN();
            boolean z = anonymousClass61I.f70978B;
            this.f73313D = false;
            this.f73311B.m28784J(VN, anonymousClass61I.QQ(), false);
            boolean z2 = z && !VN.isEmpty();
            this.f73314E = z2;
            if (!z) {
                AnonymousClass616 anonymousClass616 = this.f73311B;
                anonymousClass616.f70946J = false;
                AnonymousClass616.m28776B(anonymousClass616);
            }
            AnonymousClass6FD.m29619E(this, false);
        }
    }

    public final void dn(Hashtag hashtag, int i) {
        Hashtag hashtag2 = hashtag;
        String str = hashtag.f2793M;
        String D = AnonymousClass6FD.m29618D(this, str);
        int i2 = i;
        m29621G(str, D, i);
        AnonymousClass6FD.m29616B(this).mo5860f().m26055A(getActivity(), hashtag2, this.f73312C, D, i2, this);
        AnonymousClass3dg.f42916B.A(hashtag);
    }

    public final void hV() {
        AnonymousClass6FD.m29616B(this).mo5863i();
    }

    public final boolean hn(Hashtag hashtag) {
        boolean I = this.f73311B.m28783I(hashtag.f2793M);
        if (!TextUtils.isEmpty(this.f73312C) || !I) {
            return false;
        }
        AnonymousClass5FO.m26068B(getContext(), StringFormatUtil.formatStrLocaleSafe("#%s", hashtag.f2793M), null, new AnonymousClass618(this, hashtag, I));
        return true;
    }

    public final void jV(String str) {
        this.f73311B.m28782H(str);
    }

    public final void jt(AnonymousClass1Ak anonymousClass1Ak, int i) {
        AnonymousClass1Ak anonymousClass1Ak2 = anonymousClass1Ak;
        String B = anonymousClass1Ak.B();
        String D = AnonymousClass6FD.m29618D(this, B);
        int i2 = i;
        m29621G(B, D, i);
        AnonymousClass6FD.m29616B(this).mo5860f().m26056B(getActivity(), anonymousClass1Ak2, this.f73312C, D, i2, false, this);
        AnonymousClass3di.f42918B.A(anonymousClass1Ak);
    }

    public final boolean kt(AnonymousClass1Ak anonymousClass1Ak) {
        boolean I = this.f73311B.m28783I(anonymousClass1Ak.B());
        if (!TextUtils.isEmpty(this.f73312C) || !I) {
            return false;
        }
        AnonymousClass5FO.m26068B(getContext(), anonymousClass1Ak.C(), null, new AnonymousClass61E(this, anonymousClass1Ak, I));
        return true;
    }

    public final void nf(AnonymousClass0Ci anonymousClass0Ci, AnonymousClass0MI anonymousClass0MI, AnonymousClass10I anonymousClass10I, int i) {
        AnonymousClass0MI anonymousClass0MI2 = anonymousClass0MI;
        List singletonList = Collections.singletonList(anonymousClass0MI);
        AnonymousClass3bR anonymousClass3bR = this.f73321L;
        anonymousClass3bR.f42625M = UUID.randomUUID().toString();
        AnonymousClass10I anonymousClass10I2 = anonymousClass10I;
        anonymousClass3bR.f42622J = new AnonymousClass41T(anonymousClass10I.kI(), new AnonymousClass61H(this));
        anonymousClass3bR.f42621I = new AnonymousClass61G(this, anonymousClass0MI, i);
        anonymousClass3bR.f42614B = this;
        anonymousClass3bR.f42615C = "search_result";
        anonymousClass3bR.B(anonymousClass10I2, anonymousClass0MI2, singletonList, singletonList, singletonList, AnonymousClass0Qf.SEARCH_ITEM_HEADER, null, 0);
    }

    public final boolean onBackPressed() {
        AnonymousClass5Ef anonymousClass5Ef = this.f73322M;
        if (anonymousClass5Ef != null) {
            anonymousClass5Ef.m26039B(this.f73312C);
        }
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 993275030);
        super.onCreate(bundle);
        this.f73325P = AnonymousClass0Ce.G(getArguments());
        this.f73315F = AnonymousClass6FD.m29616B(this).mo5861g();
        this.f73323N = new AnonymousClass0MD(getContext()).A().XB("BROADCAST_UPDATED_SEARCHES", new AnonymousClass61D(this)).XB("BROADCAST_CLEAR_SEARCHES", new AnonymousClass61C(this)).FD();
        this.f73316G = AnonymousClass1SZ.B().f18801B;
        this.f73322M = new AnonymousClass5Ef(this, this.f73315F);
        AnonymousClass3e0 anonymousClass3e0 = new AnonymousClass3e0(this, this.f73316G, false);
        this.f73320K = anonymousClass3e0;
        anonymousClass3e0.f42947D = this;
        this.f73311B = new AnonymousClass616(getContext(), this.f73325P, this, this.f73316G, this.f73326Q);
        AnonymousClass0F4.f2058E.A(AnonymousClass0ko.class, this.f73324O);
        this.f73321L = new AnonymousClass3bR(this.f73325P, this, this);
        AnonymousClass0TK anonymousClass5F5 = new AnonymousClass5F5(this, this.f73325P, this.f73322M, this.f73319J, AnonymousClass6FD.m29616B(this).mo5858d());
        this.f73318I = anonymousClass5F5;
        registerLifecycleListener(anonymousClass5F5);
        AnonymousClass0cQ.G(this, 863296185, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -328792479);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_search, viewGroup, false);
        ListView listView = (ListView) inflate.findViewById(16908298);
        listView.setAdapter(this.f73311B);
        OnScrollListener anonymousClass0hi = new AnonymousClass0hi();
        anonymousClass0hi.A(new AnonymousClass5Ea(this));
        this.f73318I.m26065A(anonymousClass0hi, listView, this.f73311B, AnonymousClass6FD.m29616B(this).mo5857c());
        listView.setOnScrollListener(anonymousClass0hi);
        AnonymousClass0cQ.G(this, 2070602502, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, -1273723751);
        this.f73320K.ei();
        this.f73323N.B();
        unregisterLifecycleListener(this.f73318I);
        AnonymousClass0F4.f2058E.D(AnonymousClass0ko.class, this.f73324O);
        super.onDestroy();
        AnonymousClass0cQ.G(this, -249738025, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 1037034934);
        super.onResume();
        if (this.f73317H) {
            this.f73317H = false;
            AnonymousClass615 G = this.f73311B.m28781G(null);
            AnonymousClass5Ef anonymousClass5Ef = this.f73322M;
            String str = this.f73312C;
            String C = AnonymousClass6FD.m29617C(this);
            List list = G.f70934C;
            AnonymousClass5Ef.m26035B(anonymousClass5Ef, C, "instagram_search_session_initiated", str).G("results_list", list).G("results_type_list", G.f70935D).R();
        }
        AnonymousClass0lG O = AnonymousClass0Jd.f2931B.O(getActivity(), this.f73325P);
        if (O != null && O.G()) {
            O.B();
        }
        AnonymousClass0cQ.G(this, -302315118, F);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, 1368674037);
        super.onStart();
        AnonymousClass6FD.m29616B(this).mo5856b().f18606D.add(this);
        AnonymousClass6FD.m29616B(this).mo5856b().f18604B.add(this);
        AnonymousClass6FD.m29616B(this).mo5856b().f18605C.add(this);
        AnonymousClass0cQ.G(this, -2040516831, F);
    }

    public final void onStop() {
        int F = AnonymousClass0cQ.F(this, -1311322282);
        super.onStop();
        AnonymousClass6FD.m29616B(this).mo5856b().f18606D.remove(this);
        AnonymousClass6FD.m29616B(this).mo5856b().f18605C.remove(this);
        AnonymousClass6FD.m29616B(this).mo5856b().f18604B.remove(this);
        AnonymousClass0cQ.G(this, -125601315, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f73323N.A();
        if (TextUtils.isEmpty(this.f73312C)) {
            this.f73322M.m26043F();
            AnonymousClass0LH.B(this.f73311B.m28785K(this.f73312C));
        }
    }

    public final AnonymousClass0Iu tF(String str) {
        AnonymousClass3e3 KQ = this.f73316G.KQ(str);
        List<AnonymousClass1K9> list = KQ.f42954D;
        String str2 = KQ.f42955E;
        AnonymousClass0Cn anonymousClass0Cn = this.f73325P;
        Location e = AnonymousClass6FD.m29616B(this).mo5859e();
        boolean booleanValue = ((Boolean) AnonymousClass0CC.yJ.H(anonymousClass0Cn)).booleanValue();
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        String str3 = null;
        AnonymousClass0Pt D = anonymousClass0Pt.D("query", str).D("count", Integer.toString(30)).D("context", "blended").D("lat", e != null ? String.valueOf(e.getLatitude()) : null);
        String str4 = "lng";
        if (e != null) {
            str3 = String.valueOf(e.getLongitude());
        }
        D = D.D(str4, str3).D("timezone_offset", Long.toString(AnonymousClass0dw.J().longValue()));
        D.f4229M = "fbsearch/topsearch_flat/";
        D.M(AnonymousClass617.class);
        if (str2 != null) {
            D.D("rank_token", str2);
        }
        if (list != null) {
            str4 = "exclude_list";
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            List arrayList3 = new ArrayList();
            for (AnonymousClass1K9 anonymousClass1K9 : list) {
                switch (anonymousClass1K9.f17160F) {
                    case 0:
                        arrayList.add(anonymousClass1K9.F());
                        break;
                    case 1:
                        arrayList3.add(anonymousClass1K9.B());
                        break;
                    case 2:
                        arrayList2.add(anonymousClass1K9.D());
                        break;
                    default:
                        break;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("{\"users\":");
            stringBuilder.append(arrayList.toString());
            stringBuilder.append(",\"places\":");
            stringBuilder.append(arrayList2.toString());
            stringBuilder.append(",\"tags\":");
            stringBuilder.append(arrayList3.toString());
            stringBuilder.append("}");
            D.D(str4, stringBuilder.toString());
        }
        if (booleanValue) {
            D.A();
        }
        return D.H();
    }
}

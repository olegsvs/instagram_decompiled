package X;

import android.graphics.ColorFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.5S1 */
public final class AnonymousClass5S1 extends AnonymousClass0Ie implements AnonymousClass3dy, AnonymousClass0VE, AnonymousClass5EZ, AnonymousClass0IT, AnonymousClass1ev {
    /* renamed from: B */
    public AnonymousClass4EK f63741B;
    /* renamed from: C */
    public Callback f63742C;
    /* renamed from: D */
    public String f63743D;
    /* renamed from: E */
    public boolean f63744E;
    /* renamed from: F */
    public boolean f63745F;
    /* renamed from: G */
    public boolean f63746G;
    /* renamed from: H */
    public SearchEditText f63747H;
    /* renamed from: I */
    private AnonymousClass3e5 f63748I;
    /* renamed from: J */
    private AnonymousClass3e0 f63749J;
    /* renamed from: K */
    private AnonymousClass0Cm f63750K;

    public final void Cz() {
    }

    public final void Fx(String str) {
    }

    public final void Fz(SearchEditText searchEditText, String str) {
    }

    public final void Lx(String str) {
    }

    public final void QFA() {
    }

    public final String getModuleName() {
        return "block_commenters";
    }

    public final void Ax(String str, AnonymousClass0Q6 anonymousClass0Q6) {
        if (str.equals(this.f63743D)) {
            this.f63746G = false;
            this.f63744E = true;
            m26625C(this.f63743D, false);
        }
    }

    /* renamed from: B */
    public static WritableNativeArray m26624B(Set set) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (AnonymousClass1KI anonymousClass1KI : set) {
            WritableMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("pk", Double.parseDouble(anonymousClass1KI.f17169B.getId()));
            writableNativeMap.putBoolean("is_verified", anonymousClass1KI.f17169B.u());
            writableNativeMap.putBoolean("is_private", anonymousClass1KI.f17169B.qB == AnonymousClass0Lo.PrivacyStatusPrivate);
            writableNativeMap.putString("username", anonymousClass1KI.f17169B.uT());
            writableNativeMap.putString("full_name", anonymousClass1KI.f17169B.f1757z);
            writableNativeMap.putString("profile_pic_url", anonymousClass1KI.f17169B.DQ());
            writableNativeMap.putString("profile_pic_id", anonymousClass1KI.f17169B.uB);
            writableNativeArray.pushMap(writableNativeMap);
        }
        return writableNativeArray;
    }

    /* renamed from: C */
    private void m26625C(CharSequence charSequence, boolean z) {
        int C;
        String string;
        if (this.f63744E) {
            C = AnonymousClass0Ca.C(getContext(), C0164R.color.blue_5);
            string = getResources().getString(C0164R.string.search_for_x, new Object[]{charSequence});
        } else {
            C = AnonymousClass0Ca.C(getContext(), C0164R.color.grey_5);
            string = getContext().getString(C0164R.string.searching);
        }
        AnonymousClass4EK anonymousClass4EK = this.f63741B;
        anonymousClass4EK.f51769L = true;
        anonymousClass4EK.f51768K.f43664B = z;
        anonymousClass4EK.f51767J.A(string, C);
        anonymousClass4EK.F();
    }

    public final void Gz(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        String G = AnonymousClass0IE.G(charSequence);
        if (!G.equals(this.f63743D)) {
            this.f63743D = G;
            this.f63745F = true;
            this.f63746G = true;
            AnonymousClass4EK anonymousClass4EK = this.f63741B;
            String str = this.f63743D;
            anonymousClass4EK.f51766I = false;
            boolean isEmpty = TextUtils.isEmpty(str);
            anonymousClass4EK.f51765H = isEmpty;
            if (isEmpty) {
                anonymousClass4EK.f51772O.m26015D();
            } else {
                List arrayList = new ArrayList();
                Collection B = AnonymousClass5Ed.m26031B(str, anonymousClass4EK.f51771N);
                AnonymousClass5Eb.m26030B(B, 3);
                arrayList.addAll(B);
                List list = anonymousClass4EK.f51762E.KQ(str).f42954D;
                if (list == null) {
                    list = AnonymousClass5Ed.m26032C(anonymousClass4EK.f51772O, str);
                    anonymousClass4EK.f51762E.xB(str, list, null);
                }
                AnonymousClass5Eb.m26030B(r1, 3);
                for (AnonymousClass1KI anonymousClass1KI : r1) {
                    if (!arrayList.contains(anonymousClass1KI)) {
                        arrayList.add(anonymousClass1KI);
                    }
                }
                anonymousClass4EK.f51772O.m26015D();
                if (!arrayList.isEmpty()) {
                    anonymousClass4EK.f51772O.m26013B(arrayList, true, null);
                }
            }
            if (!anonymousClass4EK.f51765H) {
                AnonymousClass3e3 KQ = anonymousClass4EK.f51761D.KQ(str);
                if (KQ.f42954D != null) {
                    switch (KQ.f42956F.ordinal()) {
                        case 1:
                            anonymousClass4EK.f51772O.m26014C(KQ.f42954D, true);
                            break;
                        case 2:
                            List list2 = KQ.f42954D;
                            anonymousClass4EK.f51766I = true;
                            anonymousClass4EK.f51772O.m26014C(list2, true);
                            anonymousClass4EK.F();
                            break;
                        default:
                            break;
                    }
                }
            }
            anonymousClass4EK.f51766I = true;
            anonymousClass4EK.F();
            if (anonymousClass4EK.f51766I) {
                AnonymousClass4EK anonymousClass4EK2 = this.f63741B;
                anonymousClass4EK2.f51769L = false;
                anonymousClass4EK2.F();
                return;
            }
            this.f63749J.C(this.f63743D);
            m26625C(this.f63743D, true);
        }
    }

    public final void PZ() {
        if (this.f63746G && !this.f63744E && !this.f63749J.A() && !TextUtils.isEmpty(this.f63743D) && this.f63743D.length() > 1) {
            this.f63745F = false;
            this.f63749J.D(this.f63743D);
            m26625C(null, true);
        }
    }

    public final /* bridge */ /* synthetic */ void Qx(String str, AnonymousClass0Pn anonymousClass0Pn) {
        AnonymousClass1Sw anonymousClass1Sw = (AnonymousClass1Sw) anonymousClass0Pn;
        if (str.equals(this.f63743D)) {
            if (TextUtils.isEmpty(anonymousClass1Sw.QQ())) {
                AnonymousClass0Gn.H("UserSearchResponse", "Invalid UserSearchResponse format, missing rankToken");
            }
            List VN = anonymousClass1Sw.VN();
            boolean z = false;
            this.f63744E = false;
            AnonymousClass4EK anonymousClass4EK = this.f63741B;
            anonymousClass4EK.f51766I = true;
            anonymousClass4EK.f51772O.m26014C(VN, false);
            anonymousClass4EK.F();
            if (this.f63745F) {
                getListView().setSelection(0);
            }
            if (anonymousClass1Sw.f18853B && !VN.isEmpty()) {
                z = true;
            }
            this.f63746G = z;
            AnonymousClass4EK anonymousClass4EK2 = this.f63741B;
            anonymousClass4EK2.f51769L = false;
            anonymousClass4EK2.F();
        }
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.a(getContext().getString(C0164R.string.block_commenter_title));
        anonymousClass0eT.n(true);
    }

    public final void hV() {
        this.f63747H.B();
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -2086743470);
        super.onCreate(bundle);
        ArrayList parcelableArrayList = getArguments().getParcelableArrayList("BlockCommentersSettingFragment.BLOCKED_COMMENTERS_LIST");
        this.f63750K = AnonymousClass0Ce.G(getArguments());
        this.f63748I = AnonymousClass1SZ.B().f18804E;
        this.f63741B = new AnonymousClass4EK(getContext(), this.f63750K, parcelableArrayList, this, this.f63748I);
        AnonymousClass3e0 anonymousClass3e0 = new AnonymousClass3e0(this, this.f63748I, true);
        this.f63749J = anonymousClass3e0;
        anonymousClass3e0.f42947D = this;
        AnonymousClass0cQ.G(this, -580102799, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 342001797);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_block_commenter, viewGroup, false);
        AnonymousClass0cQ.G(this, -259829280, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, -1451009623);
        Callback callback = this.f63742C;
        Object[] objArr = new Object[1];
        Set unmodifiableSet = Collections.unmodifiableSet(this.f63741B.f51763F);
        Set unmodifiableSet2 = Collections.unmodifiableSet(this.f63741B.f51764G);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (!(unmodifiableSet.isEmpty() && unmodifiableSet2.isEmpty())) {
            writableNativeMap.putArray("newlyBlockedUserDicts", AnonymousClass5S1.m26624B(unmodifiableSet));
            writableNativeMap.putArray("newlyUnblockedUserDicts", AnonymousClass5S1.m26624B(unmodifiableSet2));
        }
        objArr[0] = writableNativeMap;
        callback.invoke(objArr);
        this.f63749J.ei();
        super.onDestroy();
        AnonymousClass0cQ.G(this, 738568909, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -1605917648);
        this.f63747H.B();
        this.f63747H.setOnFilterTextListener(null);
        this.f63747H = null;
        super.onDestroyView();
        AnonymousClass0cQ.G(this, -1621359800, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f63747H = (SearchEditText) view.findViewById(C0164R.id.block_commenter_search_edit_text);
        ColorFilter B = AnonymousClass0ca.B(AnonymousClass0Ca.C(getContext(), C0164R.color.grey_3));
        this.f63747H.setClearButtonColorFilter(B);
        this.f63747H.getCompoundDrawablesRelative()[0].mutate().setColorFilter(B);
        this.f63747H.setOnFilterTextListener(this);
        setListAdapter(this.f63741B);
        getListView().setOnScrollListener(new AnonymousClass5Ea(this));
        this.f63741B.F();
    }

    public final AnonymousClass0Iu tF(String str) {
        AnonymousClass3e3 KQ = this.f63748I.KQ(str);
        List list = KQ.f42954D;
        return AnonymousClass3nY.C(this.f63750K, str, 30, KQ.f42955E, list);
    }
}

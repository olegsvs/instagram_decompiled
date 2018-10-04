package X;

import android.content.Intent;
import android.graphics.ColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ListView;
import com.facebook.C0164R;
import com.facebook.common.dextricks.DexStore;
import com.instagram.model.fbfriend.FbFriend;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.421 */
public final class AnonymousClass421 extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass0Ij, AnonymousClass1ev {
    /* renamed from: B */
    public final AtomicBoolean f48612B = new AtomicBoolean(false);
    /* renamed from: C */
    public View f48613C;
    /* renamed from: D */
    public AnonymousClass3Zy f48614D;
    /* renamed from: E */
    public AnonymousClass1ak f48615E;
    /* renamed from: F */
    public boolean f48616F = false;
    /* renamed from: G */
    public boolean f48617G = false;
    /* renamed from: H */
    public ListView f48618H;
    /* renamed from: I */
    public List f48619I;
    /* renamed from: J */
    public SearchEditText f48620J;
    /* renamed from: K */
    public int f48621K;
    /* renamed from: L */
    public boolean f48622L = false;
    /* renamed from: M */
    public AnonymousClass3ht f48623M;
    /* renamed from: N */
    public AnonymousClass0Cm f48624N;
    /* renamed from: O */
    private final AnonymousClass0F8 f48625O = new AnonymousClass3i7(this);
    /* renamed from: P */
    private List f48626P;
    /* renamed from: Q */
    private final OnGlobalLayoutListener f48627Q = new AnonymousClass3i2(this);
    /* renamed from: R */
    private boolean f48628R;
    /* renamed from: S */
    private ContextThemeWrapper f48629S;
    /* renamed from: T */
    private boolean f48630T;
    /* renamed from: U */
    private final AnonymousClass0Iw f48631U = new AnonymousClass3i3(this);

    public final void Dy(AnonymousClass0Ci anonymousClass0Ci, int i) {
    }

    public final void Tg(AnonymousClass0MI anonymousClass0MI, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
    }

    public final void bw(AnonymousClass0Ci anonymousClass0Ci) {
    }

    public final void dm(AnonymousClass0Ci anonymousClass0Ci, int i) {
    }

    public final String getModuleName() {
        return "people_tagging_search";
    }

    /* renamed from: B */
    public static void m22191B(AnonymousClass421 anonymousClass421, FbFriend fbFriend, int i) {
        AnonymousClass3ht anonymousClass3ht = anonymousClass421.f48623M;
        if (anonymousClass3ht != null) {
            anonymousClass3ht.zB(fbFriend);
            AnonymousClass1ak.E(anonymousClass421.f48615E, i, fbFriend.getId(), "invite_tag_added", anonymousClass421.f48624N);
        }
    }

    /* renamed from: C */
    public static void m22192C(AnonymousClass421 anonymousClass421, SearchEditText searchEditText) {
        anonymousClass421.f48622L = false;
        Object G = AnonymousClass0IE.G(searchEditText.getStrippedText());
        anonymousClass421.f48614D.getFilter().filter(G);
        if (G.isEmpty()) {
            anonymousClass421.f48618H.setVisibility(8);
            anonymousClass421.f48614D.m20057F();
            anonymousClass421.f48617G = false;
            return;
        }
        if (!anonymousClass421.f48630T) {
            anonymousClass421.f48630T = true;
            AnonymousClass3ht anonymousClass3ht = anonymousClass421.f48623M;
            if (anonymousClass3ht != null) {
                anonymousClass3ht.gWA();
            }
        }
        anonymousClass421.f48614D.m20058G(anonymousClass421.getString(C0164R.string.search_for_x, new Object[]{G}), anonymousClass421.f48621K, false);
        anonymousClass421.f48618H.setVisibility(0);
    }

    public final void Cz() {
        if (!this.f48616F) {
            this.f48617G = true;
            m22195c(this.f48620J.getStrippedText().toString());
            this.f48620J.B();
        }
    }

    /* renamed from: D */
    public static void m22193D(FragmentActivity fragmentActivity, String str, ArrayList arrayList, ArrayList arrayList2, AnonymousClass3ht anonymousClass3ht) {
        Bundle bundle = new Bundle();
        if (arrayList != null) {
            bundle.putParcelableArrayList("peopleTags", arrayList);
        }
        if (arrayList2 != null) {
            bundle.putParcelableArrayList("fbFriendTags", arrayList2);
        }
        bundle.putString("IgSessionManager.USER_ID", str);
        AnonymousClass421 anonymousClass421 = (AnonymousClass421) AnonymousClass0IY.B().a(bundle);
        anonymousClass421.f48623M = anonymousClass3ht;
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(fragmentActivity);
        anonymousClass0IZ.f2752B = "PeopleTagSearch";
        anonymousClass0IZ.f2754D = anonymousClass421;
        anonymousClass0IZ.B();
    }

    public final void OFA(AnonymousClass0Ci anonymousClass0Ci, int i) {
        AnonymousClass3ht anonymousClass3ht = this.f48623M;
        if (anonymousClass3ht != null) {
            anonymousClass3ht.BC(anonymousClass0Ci);
        }
    }

    /* renamed from: b */
    public final void m22194b(FbFriend fbFriend, int i) {
        if (((Boolean) AnonymousClass0CC.iX.H(this.f48624N)).booleanValue()) {
            this.f48615E.D(i, fbFriend.getId(), this.f48624N);
            if (!AnonymousClass0HV.D(this.f48624N).f2646B.getBoolean("preference_fb_friend_tag_dialog_has_been_shown", false)) {
                AnonymousClass0P2 anonymousClass0P2 = new AnonymousClass0P2(getContext());
                anonymousClass0P2.f3974H = getString(C0164R.string.tag_fbFriend_dialog_title, new Object[]{fbFriend.f9869C});
                anonymousClass0P2.K(C0164R.string.tag_fbFriend_dialog_message).S(C0164R.string.tag_fbFriend_dialog_primary_btn, new AnonymousClass3i5(this, fbFriend, i)).B(C0164R.string.cancel, new AnonymousClass3i4(this, fbFriend)).E(true).F(false).A().show();
                return;
            }
        }
        AnonymousClass421.m22191B(this, fbFriend, i);
    }

    /* renamed from: c */
    public final void m22195c(String str) {
        Object G = AnonymousClass0IE.G(str);
        this.f48620J.clearFocus();
        if (TextUtils.isEmpty(G)) {
            AnonymousClass3ht anonymousClass3ht = this.f48623M;
            if (anonymousClass3ht != null) {
                anonymousClass3ht.jH();
            }
            return;
        }
        AnonymousClass0GA B = AnonymousClass3nY.m20666B(this.f48624N, G, null, false);
        B.f2849B = this.f48631U;
        schedule(B);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 64206) {
            AnonymousClass0FO.E(i, i2, intent, new AnonymousClass3i6(this));
        }
        super.onActivityResult(i, i2, intent);
    }

    public final boolean onBackPressed() {
        AnonymousClass3ht anonymousClass3ht = this.f48623M;
        if (anonymousClass3ht != null) {
            anonymousClass3ht.jH();
        }
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1734518957);
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f48615E = new AnonymousClass1ak(this, AnonymousClass0iy.PHOTO_TAG);
        this.f48629S = AnonymousClass0G5.C(getContext(), C0164R.attr.peopleTagSearchTheme);
        this.f48619I = getArguments().getParcelableArrayList("peopleTags");
        this.f48626P = getArguments().getParcelableArrayList("fbFriendTags");
        this.f48624N = AnonymousClass0Ce.G(getArguments());
        this.f48621K = AnonymousClass0Ca.C(getContext(), C0164R.color.grey_5);
        this.f48614D = new AnonymousClass3Zy(this.f48629S, this.f48624N, this, this, this, this, this, this.f48619I, this.f48626P);
        this.f48628R = getArguments().getBoolean("SET_FRAGMENT_BACKGROUND_WHITE");
        AnonymousClass0cQ.G(this, -154160733, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -874973801);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.cloneInContext(this.f48629S).inflate(C0164R.layout.fragment_people_tag_search, viewGroup, false);
        if (this.f48628R) {
            viewGroup2.setBackgroundColor(AnonymousClass0Ca.C(this.f48629S, C0164R.color.white));
        }
        if (bundle != null) {
            this.f48630T = bundle.getBoolean("HAS_USER_TYPED_SOMETHING");
        }
        this.f48620J = (SearchEditText) viewGroup2.findViewById(C0164R.id.row_search_edit_text);
        ColorFilter B = AnonymousClass0ca.B(AnonymousClass0Ca.C(getContext(), AnonymousClass0G5.F(getContext(), C0164R.attr.glyphColorPrimary)));
        this.f48620J.getCompoundDrawablesRelative()[0].mutate().setColorFilter(B);
        this.f48620J.setClearButtonAlpha(128);
        this.f48620J.setClearButtonColorFilter(B);
        if (this.f48620J.getBackground() != null) {
            this.f48620J.getBackground().mutate().setColorFilter(B);
        }
        if (!this.f48622L) {
            this.f48620J.setOnFilterTextListener(new AnonymousClass3i8(this));
        }
        this.f48618H = (ListView) viewGroup2.findViewById(16908298);
        AnonymousClass0cQ.G(this, -2018628363, F);
        return viewGroup2;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 960634967);
        super.onDestroyView();
        View view = this.f48613C;
        if (view != null) {
            view.getViewTreeObserver().removeGlobalOnLayoutListener(this.f48627Q);
            this.f48613C.getLayoutParams().height = -1;
            this.f48613C = null;
        }
        this.f48620J.setOnFilterTextListener(null);
        this.f48620J = null;
        this.f48618H = null;
        this.f48623M = null;
        AnonymousClass0cQ.G(this, -1286939628, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -1115416664);
        super.onPause();
        this.f48620J.B();
        AnonymousClass0F4.f2058E.D(AnonymousClass1Pu.class, this.f48625O);
        AnonymousClass0cQ.G(this, -68064212, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 1578427980);
        super.onResume();
        AnonymousClass0F4.f2058E.A(AnonymousClass1Pu.class, this.f48625O);
        AnonymousClass421.m22192C(this, this.f48620J);
        AnonymousClass0cQ.G(this, -1468152890, F);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("HAS_USER_TYPED_SOMETHING", this.f48630T);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, -1318260115);
        super.onStart();
        if (this.f48622L) {
            this.f48618H.setVisibility(0);
            this.f48614D.m20057F();
            this.f48620J.setOnFilterTextListener(new AnonymousClass3i8(this));
        }
        AnonymousClass0cQ.G(this, -1096763834, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f48618H.setBackground(new ColorDrawable(AnonymousClass0G5.D(this.f48629S, C0164R.attr.peopleTagSearchBackground)));
        this.f48618H.setCacheColorHint(AnonymousClass0G5.D(this.f48629S, C0164R.attr.peopleTagSearchCacheColorHint));
        this.f48618H.setAdapter(this.f48614D);
        this.f48620J.requestFocus();
        this.f48620J.F();
        if ((getActivity().getWindow().getAttributes().flags & DexStore.LOAD_RESULT_MIXED_MODE) != 0) {
            View findViewById = getActivity().findViewById(C0164R.id.root);
            this.f48613C = findViewById;
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this.f48627Q);
        }
        this.f48615E.A("page_loaded", this.f48614D.f42374D.size(), this.f48614D.f42372B.size(), this.f48624N).R();
    }
}

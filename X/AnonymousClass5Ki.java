package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.facebook.C0164R;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.5Ki */
public final class AnonymousClass5Ki extends AnonymousClass0Ie implements OnScrollListener, AnonymousClass0Ij, AnonymousClass0gg, AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass3n0 f62318B;
    /* renamed from: C */
    public AnonymousClass0P7 f62319C;
    /* renamed from: D */
    public AnonymousClass5LD f62320D;
    /* renamed from: E */
    public AnonymousClass0Cm f62321E;
    /* renamed from: F */
    private String f62322F;
    /* renamed from: G */
    private String f62323G;
    /* renamed from: H */
    private final AnonymousClass0hi f62324H = new AnonymousClass0hi();
    /* renamed from: I */
    private String f62325I;
    /* renamed from: J */
    private AnonymousClass3bR f62326J;
    /* renamed from: K */
    private boolean f62327K;
    /* renamed from: L */
    private final AnonymousClass0Iw f62328L = new AnonymousClass5Kh(this);

    public final void Dy(AnonymousClass0Ci anonymousClass0Ci, int i) {
    }

    public final void bw(AnonymousClass0Ci anonymousClass0Ci) {
    }

    public final void dm(AnonymousClass0Ci anonymousClass0Ci, int i) {
    }

    /* renamed from: B */
    public static void m26262B(AnonymousClass5Ki anonymousClass5Ki) {
        String E;
        AnonymousClass5Ki.m26263C(anonymousClass5Ki);
        anonymousClass5Ki.f62320D.f62383C = false;
        if (TextUtils.isEmpty(anonymousClass5Ki.f62322F)) {
            E = AnonymousClass0IE.E(anonymousClass5Ki.f62327K ? "media/%s/likers_chrono/" : "media/%s/likers/", new Object[]{anonymousClass5Ki.f62323G});
        } else {
            E = AnonymousClass0IE.E("live/%s/likers/", new Object[]{anonymousClass5Ki.f62322F});
        }
        AnonymousClass0GA B = AnonymousClass3nV.B(anonymousClass5Ki.f62321E, E, null, anonymousClass5Ki.f62320D.f62385E, null);
        B.f2849B = anonymousClass5Ki.f62328L;
        anonymousClass5Ki.schedule(B);
    }

    /* renamed from: C */
    public static void m26263C(AnonymousClass5Ki anonymousClass5Ki) {
        anonymousClass5Ki.f62320D.f62384D = true;
        AnonymousClass0eT.E(anonymousClass5Ki.getActivity()).Y(true);
        if (anonymousClass5Ki.f62318B.G()) {
            AnonymousClass5Ki.m26264D(anonymousClass5Ki);
        }
    }

    /* renamed from: D */
    public static void m26264D(AnonymousClass5Ki anonymousClass5Ki) {
        boolean z = anonymousClass5Ki.f62320D.uX() && !anonymousClass5Ki.f62320D.QV();
        AnonymousClass2IF.B(z, anonymousClass5Ki.getView());
    }

    public final Map GIA() {
        AnonymousClass0P7 anonymousClass0P7 = this.f62319C;
        if (anonymousClass0P7 == null || anonymousClass0P7.MA() == null) {
            return null;
        }
        Map hashMap = new HashMap();
        hashMap.put(MemoryDumpUploadJob.EXTRA_USER_ID, this.f62319C.MA().getId());
        return hashMap;
    }

    public final void OFA(AnonymousClass0Ci anonymousClass0Ci, int i) {
        AnonymousClass0bx C = AnonymousClass0bx.C(this.f62321E, anonymousClass0Ci.getId(), "likes_list_user_row");
        C.f6906F = getModuleName();
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(getActivity());
        anonymousClass0IZ.f2754D = AnonymousClass0Jj.f2938B.B().D(C.A());
        anonymousClass0IZ.B();
    }

    public final void Tg(AnonymousClass0MI anonymousClass0MI, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        AnonymousClass0MI anonymousClass0MI2 = anonymousClass0MI;
        List singletonList = Collections.singletonList(anonymousClass0MI);
        AnonymousClass3bR anonymousClass3bR = this.f62326J;
        anonymousClass3bR.f42625M = this.f62325I;
        GradientSpinnerAvatarView gradientSpinnerAvatarView2 = gradientSpinnerAvatarView;
        anonymousClass3bR.f42622J = new AnonymousClass41T(gradientSpinnerAvatarView.getAvatarBounds(), new AnonymousClass5Kg(this));
        anonymousClass3bR.C(gradientSpinnerAvatarView2, anonymousClass0MI2, singletonList, singletonList, singletonList, AnonymousClass0Qf.LIKES_LIST, null, null);
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        String string;
        AnonymousClass0P7 anonymousClass0P7 = this.f62319C;
        if (anonymousClass0P7 == null || anonymousClass0P7.FD == null) {
            string = getContext().getString(C0164R.string.likes);
        } else {
            string = getContext().getString(C0164R.string.views_and_likes_title_title_case);
        }
        anonymousClass0eT.a(string);
        anonymousClass0eT.n(true);
    }

    public final String getModuleName() {
        AnonymousClass0P7 anonymousClass0P7 = this.f62319C;
        String str = (anonymousClass0P7 == null || !AnonymousClass0Co.D(this.f62321E, anonymousClass0P7.MA())) ? "likers" : "self_likers";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("_");
        stringBuilder.append(AnonymousClass0Iz.f2854L.f2860G);
        return stringBuilder.toString();
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        CharSequence string;
        AnonymousClass3n2 anonymousClass3n2;
        AnonymousClass0P7 anonymousClass0P7;
        int F = AnonymousClass0cQ.F(this, -45065652);
        super.onCreate(bundle);
        this.f62321E = AnonymousClass0Ce.G(getArguments());
        boolean z2 = false;
        if (!getArguments().containsKey("LikesListFragment.MEDIA_ID")) {
            if (!getArguments().containsKey("LikersListFragment.BROADCAST_ID")) {
                z = false;
                AnonymousClass0LH.B(z);
                this.f62322F = getArguments().getString("LikersListFragment.BROADCAST_ID");
                string = getArguments().getString("LikesListFragment.MEDIA_ID", null);
                this.f62323G = string;
                if (!(TextUtils.isEmpty(string) && TextUtils.isEmpty(this.f62322F))) {
                    z2 = true;
                }
                AnonymousClass0LH.B(z2);
                this.f62319C = AnonymousClass107.f13182C.A(this.f62323G);
                this.f62327K = getArguments().getBoolean("LikesListFragment.TIME_ORDERED");
                this.f62320D = new AnonymousClass5aT(this, this);
                anonymousClass3n2 = new AnonymousClass3n2(getContext(), this.f62321E, this);
                anonymousClass3n2.f44501F = true;
                anonymousClass3n2.f44499D = this.f62320D;
                anonymousClass3n2.f44497B = new AnonymousClass35P(getActivity());
                anonymousClass3n2.f44503H = true;
                this.f62318B = anonymousClass3n2.A();
                this.f62320D.f62382B = this.f62318B;
                anonymousClass0P7 = this.f62319C;
                if (anonymousClass0P7 != null) {
                    AnonymousClass3n0 anonymousClass3n0 = this.f62318B;
                    anonymousClass3n0.f44460K = anonymousClass0P7;
                    AnonymousClass3n0.C(anonymousClass3n0);
                }
                this.f62326J = new AnonymousClass3bR(this.f62321E, this, this);
                this.f62325I = UUID.randomUUID().toString();
                registerLifecycleListener(AnonymousClass0kr.B(getActivity()));
                AnonymousClass5Ki.m26262B(this);
                AnonymousClass0cQ.G(this, 563108220, F);
            }
        }
        z = true;
        AnonymousClass0LH.B(z);
        this.f62322F = getArguments().getString("LikersListFragment.BROADCAST_ID");
        string = getArguments().getString("LikesListFragment.MEDIA_ID", null);
        this.f62323G = string;
        z2 = true;
        AnonymousClass0LH.B(z2);
        this.f62319C = AnonymousClass107.f13182C.A(this.f62323G);
        this.f62327K = getArguments().getBoolean("LikesListFragment.TIME_ORDERED");
        this.f62320D = new AnonymousClass5aT(this, this);
        anonymousClass3n2 = new AnonymousClass3n2(getContext(), this.f62321E, this);
        anonymousClass3n2.f44501F = true;
        anonymousClass3n2.f44499D = this.f62320D;
        anonymousClass3n2.f44497B = new AnonymousClass35P(getActivity());
        anonymousClass3n2.f44503H = true;
        this.f62318B = anonymousClass3n2.A();
        this.f62320D.f62382B = this.f62318B;
        anonymousClass0P7 = this.f62319C;
        if (anonymousClass0P7 != null) {
            AnonymousClass3n0 anonymousClass3n02 = this.f62318B;
            anonymousClass3n02.f44460K = anonymousClass0P7;
            AnonymousClass3n0.C(anonymousClass3n02);
        }
        this.f62326J = new AnonymousClass3bR(this.f62321E, this, this);
        this.f62325I = UUID.randomUUID().toString();
        registerLifecycleListener(AnonymousClass0kr.B(getActivity()));
        AnonymousClass5Ki.m26262B(this);
        AnonymousClass0cQ.G(this, 563108220, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1906707487);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_listview_with_progress, viewGroup, false);
        AnonymousClass0cQ.G(this, -229978748, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, 1117548964);
        AnonymousClass1et anonymousClass1et = this.f62318B.f44458I;
        if (anonymousClass1et != null) {
            anonymousClass1et.C();
        }
        super.onDestroy();
        AnonymousClass0cQ.G(this, -1816588305, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 657743669);
        super.onResume();
        AnonymousClass0lG O = AnonymousClass0Jd.f2931B.O(getActivity(), this.f62321E);
        if (O != null && O.G() && O.f9477U == AnonymousClass0Qf.LIKES_LIST) {
            O.B();
        }
        AnonymousClass0cQ.G(this, -190446127, F);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, 1680291589);
        this.f62324H.onScroll(absListView, i, i2, i3);
        AnonymousClass0cQ.H(this, 1091354432, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, -562398986);
        this.f62324H.onScrollStateChanged(absListView, i);
        AnonymousClass0cQ.H(this, 567889469, I);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, 1967540963);
        super.onStart();
        AnonymousClass5Ki.m26264D(this);
        AnonymousClass0cQ.G(this, 947691651, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f62324H.A(this.f62320D);
        getListView().setOnScrollListener(this);
        setListAdapter(this.f62318B);
    }
}

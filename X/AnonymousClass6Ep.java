package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.facebook.C0164R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: X.6Ep */
public final class AnonymousClass6Ep extends AnonymousClass0Ie implements AnonymousClass5uW, OnScrollListener, AnonymousClass3ld, AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass5tG f73218B;
    /* renamed from: C */
    public boolean f73219C = true;
    /* renamed from: D */
    public AnonymousClass5LD f73220D;
    /* renamed from: E */
    public AnonymousClass0MI f73221E;
    /* renamed from: F */
    public AnonymousClass3le f73222F;
    /* renamed from: G */
    public AnonymousClass0Pj f73223G;
    /* renamed from: H */
    public AnonymousClass5CC f73224H;
    /* renamed from: I */
    public AnonymousClass0Cm f73225I;
    /* renamed from: J */
    private final AnonymousClass0hi f73226J = new AnonymousClass0hi();
    /* renamed from: K */
    private int f73227K;
    /* renamed from: L */
    private String f73228L;
    /* renamed from: M */
    private AnonymousClass3bR f73229M;

    public final void Od(AnonymousClass1cM anonymousClass1cM) {
    }

    public final void eDA(AnonymousClass1cM anonymousClass1cM) {
    }

    public final String getModuleName() {
        return "reel_poll_voters_list";
    }

    /* renamed from: B */
    public static void m29593B(AnonymousClass6Ep anonymousClass6Ep) {
        if (anonymousClass6Ep.f73223G != null) {
            AnonymousClass6Ep.m29594C(anonymousClass6Ep);
            anonymousClass6Ep.f73220D.f62383C = false;
            AnonymousClass0Cn anonymousClass0Cn = anonymousClass6Ep.f73225I;
            String id = anonymousClass6Ep.f73223G.f4134F.getId();
            String str = AnonymousClass161.E(anonymousClass6Ep.f73223G).f14397D;
            int i = anonymousClass6Ep.f73227K;
            Object obj = anonymousClass6Ep.f73220D.f62385E;
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
            AnonymousClass0Pt M = anonymousClass0Pt.L("media/%s/%s/story_poll_voters/", new Object[]{id, str}).M(AnonymousClass3az.class);
            if (i != -1) {
                M.D("vote", Integer.toString(i));
            }
            if (!TextUtils.isEmpty(obj)) {
                M.D("max_id", obj);
            }
            AnonymousClass0GA H = M.H();
            H.f2849B = new AnonymousClass5ve(anonymousClass6Ep);
            anonymousClass6Ep.schedule(H);
        }
    }

    /* renamed from: C */
    public static void m29594C(AnonymousClass6Ep anonymousClass6Ep) {
        anonymousClass6Ep.f73220D.f62384D = true;
        AnonymousClass0eT.E(anonymousClass6Ep.getActivity()).Y(true);
        if (anonymousClass6Ep.f73218B.f69662E.isEmpty()) {
            AnonymousClass6Ep.m29595D(anonymousClass6Ep);
        }
    }

    /* renamed from: D */
    public static void m29595D(AnonymousClass6Ep anonymousClass6Ep) {
        boolean z = anonymousClass6Ep.f73220D.uX() && !anonymousClass6Ep.f73220D.QV();
        AnonymousClass2IF.B(z, anonymousClass6Ep.getView());
    }

    public final void Tg(AnonymousClass0MI anonymousClass0MI, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        AnonymousClass0MI anonymousClass0MI2 = anonymousClass0MI;
        List singletonList = Collections.singletonList(anonymousClass0MI);
        AnonymousClass3bR anonymousClass3bR = this.f73229M;
        anonymousClass3bR.f42625M = this.f73228L;
        GradientSpinnerAvatarView gradientSpinnerAvatarView2 = gradientSpinnerAvatarView;
        anonymousClass3bR.f42622J = new AnonymousClass41T(gradientSpinnerAvatarView.getAvatarBounds(), new AnonymousClass5vd(this));
        anonymousClass3bR.C(gradientSpinnerAvatarView2, anonymousClass0MI2, singletonList, singletonList, singletonList, AnonymousClass0Qf.REEL_VIEWER_LIST, null, null);
    }

    public final void aGA(AnonymousClass1Zo anonymousClass1Zo) {
        AnonymousClass0bx C = AnonymousClass0bx.C(this.f73225I, anonymousClass1Zo.f20276K.getId(), "reel_poll_voters_list");
        C.f6906F = getModuleName();
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(getActivity());
        anonymousClass0IZ.f2754D = AnonymousClass0Jj.f2938B.B().D(C.A());
        anonymousClass0IZ.B();
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.a(getContext().getString(C0164R.string.reel_poll_voters_list_title));
        anonymousClass0eT.n(true);
    }

    public final void fDA(AnonymousClass0Ci anonymousClass0Ci) {
        AnonymousClass6Ep anonymousClass6Ep = this;
        if (this.f73222F == null) {
            this.f73222F = new AnonymousClass3le(getContext(), this.f73225I);
        }
        this.f73222F.A(anonymousClass0Ci, anonymousClass6Ep, "poll_voters_list", false, this.f73221E.Q());
    }

    public final void iv() {
        AnonymousClass0rF.B(this.f73218B, 2123347074);
    }

    public final void ki(AnonymousClass1Zo anonymousClass1Zo, AnonymousClass0Ci anonymousClass0Ci, AnonymousClass0Pj anonymousClass0Pj, boolean z) {
        AnonymousClass3Io C;
        if (anonymousClass1Zo.f20270E == null || !((Boolean) AnonymousClass0CC.qF.H(this.f73225I)).booleanValue()) {
            C = AnonymousClass0J7.f2895B.O().C(this.f73225I, this, "reel_dashboard_viewer");
        } else {
            C = AnonymousClass0J7.f2895B.O().C(this.f73225I, this, "reel_dashboard_poll_response").UQA(anonymousClass1Zo.f20269D).WQA(anonymousClass1Zo.f20270E.intValue()).HRA(AnonymousClass161.B(anonymousClass0Pj, anonymousClass1Zo));
        }
        C.tQA(anonymousClass0Pj.f4136H).vQA(anonymousClass0Pj.getId()).iOA(z).fSA(anonymousClass0Ci.getId());
        AnonymousClass0bz.B(getContext()).C(C.RD());
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -747076404);
        super.onCreate(bundle);
        this.f73225I = AnonymousClass0Ce.G(getArguments());
        String string = getArguments().getString("ReelPollVotersListFragment.REEL_ID");
        String string2 = getArguments().getString("ReelPollVotersListFragment.REEL_ITEM_ID");
        this.f73227K = getArguments().getInt("ReelPollVotersListFragment.POLL_OPTION_INDEX", -1);
        AnonymousClass0MI D = AnonymousClass0MB.C(this.f73225I).D(string);
        this.f73221E = D;
        if (D != null) {
            for (AnonymousClass0Pj anonymousClass0Pj : D.F()) {
                if (anonymousClass0Pj.getId().equals(string2)) {
                    this.f73223G = anonymousClass0Pj;
                    break;
                }
            }
        }
        this.f73220D = new AnonymousClass5vb(this, this);
        this.f73218B = new AnonymousClass5tG(getContext(), this.f73225I, this.f73220D, this);
        this.f73220D.f62382B = this.f73218B;
        this.f73229M = new AnonymousClass3bR(this.f73225I, this, this);
        this.f73228L = UUID.randomUUID().toString();
        AnonymousClass6Ep.m29593B(this);
        AnonymousClass0cQ.G(this, -2111011143, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1628940763);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_listview_with_progress, viewGroup, false);
        AnonymousClass0cQ.G(this, 259665309, F);
        return inflate;
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -1297694460);
        super.onResume();
        if (this.f73223G == null) {
            getActivity().onBackPressed();
        }
        AnonymousClass0lG O = AnonymousClass0Jd.f2931B.O(getActivity(), this.f73225I);
        if (O != null && O.G() && O.f9477U == AnonymousClass0Qf.REEL_VIEWER_LIST) {
            O.B();
        }
        AnonymousClass0cQ.G(this, 1875921095, F);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, -666908210);
        this.f73226J.onScroll(absListView, i, i2, i3);
        AnonymousClass0cQ.H(this, -447418684, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, 427985438);
        this.f73226J.onScrollStateChanged(absListView, i);
        AnonymousClass0cQ.H(this, -48555708, I);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, -225246166);
        super.onStart();
        AnonymousClass6Ep.m29595D(this);
        AnonymousClass0cQ.G(this, 1659601474, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f73226J.A(this.f73220D);
        getListView().setOnScrollListener(this);
        setListAdapter(this.f73218B);
    }

    public final void xs(AnonymousClass1Zo anonymousClass1Zo) {
        AnonymousClass0Ci anonymousClass0Ci = anonymousClass1Zo.f20276K;
        if (this.f73224H == null) {
            this.f73224H = new AnonymousClass5CC(getRootActivity());
        }
        this.f73224H.m25958A(anonymousClass0Ci, this.f73221E, new AnonymousClass5vc(this, anonymousClass1Zo));
    }
}

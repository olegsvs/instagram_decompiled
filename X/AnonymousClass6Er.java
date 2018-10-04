package X;

import android.os.Bundle;
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

/* renamed from: X.6Er */
public final class AnonymousClass6Er extends AnonymousClass0Ie implements AnonymousClass5uW, OnScrollListener, AnonymousClass3ld, AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass5tL f73237B;
    /* renamed from: C */
    public boolean f73238C = true;
    /* renamed from: D */
    public AnonymousClass5LD f73239D;
    /* renamed from: E */
    public AnonymousClass0MI f73240E;
    /* renamed from: F */
    public AnonymousClass3le f73241F;
    /* renamed from: G */
    public AnonymousClass0Pj f73242G;
    /* renamed from: H */
    public AnonymousClass5CC f73243H;
    /* renamed from: I */
    public AnonymousClass0Cm f73244I;
    /* renamed from: J */
    private final AnonymousClass0hi f73245J = new AnonymousClass0hi();
    /* renamed from: K */
    private String f73246K;
    /* renamed from: L */
    private AnonymousClass3bR f73247L;

    public final void Od(AnonymousClass1cM anonymousClass1cM) {
    }

    public final void eDA(AnonymousClass1cM anonymousClass1cM) {
    }

    public final String getModuleName() {
        return "reel_slider_voters_list";
    }

    /* renamed from: B */
    public static void m29599B(AnonymousClass6Er anonymousClass6Er) {
        if (anonymousClass6Er.f73242G != null) {
            AnonymousClass6Er.m29600C(anonymousClass6Er);
            anonymousClass6Er.f73239D.f62383C = false;
            AnonymousClass0Cn anonymousClass0Cn = anonymousClass6Er.f73244I;
            String id = anonymousClass6Er.f73242G.f4134F.getId();
            String str = ((AnonymousClass0ZF) anonymousClass6Er.f73242G.N(AnonymousClass15c.SLIDER).get(0)).f6312T.f15068E;
            String str2 = anonymousClass6Er.f73239D.f62385E;
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
            anonymousClass0Pt.f4229M = String.format("media/%s/%s/story_slider_voters/", new Object[]{id, str});
            AnonymousClass0GA H = anonymousClass0Pt.D("max_id", str2).M(AnonymousClass1R0.class).H();
            H.f2849B = new AnonymousClass5wB(anonymousClass6Er);
            anonymousClass6Er.schedule(H);
        }
    }

    /* renamed from: C */
    public static void m29600C(AnonymousClass6Er anonymousClass6Er) {
        anonymousClass6Er.f73239D.f62384D = true;
        AnonymousClass0eT.E(anonymousClass6Er.getActivity()).Y(true);
        if (anonymousClass6Er.f73237B.f69683E.isEmpty()) {
            AnonymousClass6Er.m29601D(anonymousClass6Er);
        }
    }

    /* renamed from: D */
    public static void m29601D(AnonymousClass6Er anonymousClass6Er) {
        boolean z = anonymousClass6Er.f73239D.uX() && !anonymousClass6Er.f73239D.QV();
        AnonymousClass2IF.B(z, anonymousClass6Er.getView());
    }

    public final void Tg(AnonymousClass0MI anonymousClass0MI, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        AnonymousClass0MI anonymousClass0MI2 = anonymousClass0MI;
        List singletonList = Collections.singletonList(anonymousClass0MI);
        AnonymousClass3bR anonymousClass3bR = this.f73247L;
        anonymousClass3bR.f42625M = this.f73246K;
        GradientSpinnerAvatarView gradientSpinnerAvatarView2 = gradientSpinnerAvatarView;
        anonymousClass3bR.f42622J = new AnonymousClass41T(gradientSpinnerAvatarView.getAvatarBounds(), new AnonymousClass5wA(this));
        anonymousClass3bR.C(gradientSpinnerAvatarView2, anonymousClass0MI2, singletonList, singletonList, singletonList, AnonymousClass0Qf.REEL_VIEWER_LIST, null, null);
    }

    public final void aGA(AnonymousClass1Zo anonymousClass1Zo) {
        AnonymousClass0bx C = AnonymousClass0bx.C(this.f73244I, anonymousClass1Zo.f20276K.getId(), "reel_slider_voters_list");
        C.f6906F = getModuleName();
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(getActivity());
        anonymousClass0IZ.f2754D = AnonymousClass0Jj.f2938B.B().D(C.A());
        anonymousClass0IZ.B();
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.a(getContext().getString(C0164R.string.reel_slider_voters_list_title));
        anonymousClass0eT.n(true);
    }

    public final void fDA(AnonymousClass0Ci anonymousClass0Ci) {
        AnonymousClass6Er anonymousClass6Er = this;
        if (this.f73241F == null) {
            this.f73241F = new AnonymousClass3le(getContext(), this.f73244I);
        }
        this.f73241F.A(anonymousClass0Ci, anonymousClass6Er, "slider_voters_list", false, this.f73240E.Q());
    }

    public final void iv() {
        AnonymousClass0rF.B(this.f73237B, -1611374524);
    }

    public final void ki(AnonymousClass1Zo anonymousClass1Zo, AnonymousClass0Ci anonymousClass0Ci, AnonymousClass0Pj anonymousClass0Pj, boolean z) {
        AnonymousClass3Io C;
        if (anonymousClass1Zo.f20275J == null || !((Boolean) AnonymousClass0CC.qF.H(this.f73244I)).booleanValue()) {
            C = AnonymousClass0J7.f2895B.O().C(this.f73244I, this, "reel_dashboard_viewer");
        } else {
            C = AnonymousClass0J7.f2895B.O().C(this.f73244I, this, "reel_dashboard_slider_response").gRA(anonymousClass1Zo.f20274I).hRA(anonymousClass1Zo.f20275J.floatValue());
        }
        C.tQA(anonymousClass0Pj.f4136H).vQA(anonymousClass0Pj.getId()).iOA(z).fSA(anonymousClass0Ci.getId());
        AnonymousClass0bz.B(getContext()).C(C.RD());
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -52613619);
        super.onCreate(bundle);
        this.f73244I = AnonymousClass0Ce.G(getArguments());
        String string = getArguments().getString("ReelSliderVotersListFragment.REEL_ID");
        String string2 = getArguments().getString("ReelSliderVotersListFragment.REEL_ITEM_ID");
        AnonymousClass0MI D = AnonymousClass0MB.C(this.f73244I).D(string);
        this.f73240E = D;
        if (D != null) {
            for (AnonymousClass0Pj anonymousClass0Pj : D.F()) {
                if (anonymousClass0Pj.getId().equals(string2)) {
                    this.f73242G = anonymousClass0Pj;
                    break;
                }
            }
        }
        this.f73239D = new AnonymousClass5w8(this, this);
        this.f73237B = new AnonymousClass5tL(getContext(), this.f73244I, this.f73239D, this);
        this.f73239D.f62382B = this.f73237B;
        this.f73247L = new AnonymousClass3bR(this.f73244I, this, this);
        this.f73246K = UUID.randomUUID().toString();
        AnonymousClass6Er.m29599B(this);
        AnonymousClass0cQ.G(this, 1275685538, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1887115576);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_listview_with_progress, viewGroup, false);
        AnonymousClass0cQ.G(this, -773987903, F);
        return inflate;
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 1248867837);
        super.onResume();
        if (this.f73242G == null) {
            getActivity().onBackPressed();
        }
        AnonymousClass0lG O = AnonymousClass0Jd.f2931B.O(getActivity(), this.f73244I);
        if (O != null && O.G() && O.f9477U == AnonymousClass0Qf.REEL_VIEWER_LIST) {
            O.B();
        }
        AnonymousClass0cQ.G(this, -1697905873, F);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, 1550346443);
        this.f73245J.onScroll(absListView, i, i2, i3);
        AnonymousClass0cQ.H(this, -743328925, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, -1999579652);
        this.f73245J.onScrollStateChanged(absListView, i);
        AnonymousClass0cQ.H(this, -615472162, I);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, -767738090);
        super.onStart();
        AnonymousClass6Er.m29601D(this);
        AnonymousClass0cQ.G(this, -1538934199, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f73245J.A(this.f73239D);
        getListView().setOnScrollListener(this);
        setListAdapter(this.f73237B);
    }

    public final void xs(AnonymousClass1Zo anonymousClass1Zo) {
        AnonymousClass0Ci anonymousClass0Ci = anonymousClass1Zo.f20276K;
        if (this.f73243H == null) {
            this.f73243H = new AnonymousClass5CC(getRootActivity());
        }
        this.f73243H.m25958A(anonymousClass0Ci, this.f73240E, new AnonymousClass5w9(this, anonymousClass1Zo));
    }
}

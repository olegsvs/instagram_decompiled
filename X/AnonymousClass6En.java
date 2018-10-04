package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.facebook.C0164R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.6En */
public final class AnonymousClass6En extends AnonymousClass0Ie implements AnonymousClass5uW, OnScrollListener, AnonymousClass3ld, AnonymousClass0IT {
    /* renamed from: B */
    public AnonymousClass5tF f73208B;
    /* renamed from: C */
    public boolean f73209C = true;
    /* renamed from: D */
    public AnonymousClass5LD f73210D;
    /* renamed from: E */
    public AnonymousClass0MI f73211E;
    /* renamed from: F */
    public AnonymousClass3le f73212F;
    /* renamed from: G */
    public AnonymousClass0Pj f73213G;
    /* renamed from: H */
    public AnonymousClass5CC f73214H;
    /* renamed from: I */
    public AnonymousClass0Cm f73215I;
    /* renamed from: J */
    private final AnonymousClass0hi f73216J = new AnonymousClass0hi();

    public final void Od(AnonymousClass1cM anonymousClass1cM) {
    }

    public final void Tg(AnonymousClass0MI anonymousClass0MI, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
    }

    public final void eDA(AnonymousClass1cM anonymousClass1cM) {
    }

    public final String getModuleName() {
        return "reel_feedback_reactions_list";
    }

    /* renamed from: B */
    public static void m29590B(AnonymousClass6En anonymousClass6En) {
        AnonymousClass0Pj anonymousClass0Pj = anonymousClass6En.f73213G;
        if (anonymousClass0Pj != null) {
            if (anonymousClass0Pj.f4134F != null) {
                AnonymousClass6En.m29591C(anonymousClass6En);
                anonymousClass6En.f73210D.f62383C = false;
                String EA = anonymousClass6En.f73213G.f4134F.EA();
                String str = anonymousClass6En.f73210D.f62385E;
                AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass6En.f73215I);
                anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
                anonymousClass0Pt.f4229M = String.format("media/%s/list_reel_media_reactions/", new Object[]{EA});
                AnonymousClass0GA H = anonymousClass0Pt.D("max_id", str).M(AnonymousClass2bQ.class).H();
                H.f2849B = new AnonymousClass5vE(anonymousClass6En);
                anonymousClass6En.schedule(H);
            }
        }
    }

    /* renamed from: C */
    public static void m29591C(AnonymousClass6En anonymousClass6En) {
        anonymousClass6En.f73210D.f62384D = true;
        AnonymousClass0eT.E(anonymousClass6En.getActivity()).Y(true);
        if (anonymousClass6En.f73208B.f69652D.isEmpty()) {
            AnonymousClass6En.m29592D(anonymousClass6En);
        }
    }

    /* renamed from: D */
    public static void m29592D(AnonymousClass6En anonymousClass6En) {
        boolean z = anonymousClass6En.f73210D.uX() && !anonymousClass6En.f73210D.QV();
        AnonymousClass2IF.B(z, anonymousClass6En.getView());
    }

    public final void aGA(AnonymousClass1Zo anonymousClass1Zo) {
        if (!(this.f73213G.f4134F == null || this.f73213G.f4134F.pC == null)) {
            AnonymousClass0P7 anonymousClass0P7 = this.f73213G.f4134F;
            int i = 0;
            while (i < this.f73208B.f69652D.size()) {
                AnonymousClass2Fk anonymousClass2Fk = (AnonymousClass2Fk) this.f73208B.f69652D.get(i);
                if (anonymousClass2Fk.f28119B == anonymousClass1Zo.f20271F && anonymousClass1Zo.f20277L == AnonymousClass3Up.USER && anonymousClass1Zo.f20276K.getId().equals(anonymousClass2Fk.f28121D.getId())) {
                    break;
                }
                i++;
            }
            i = 0;
            AnonymousClass5uf.m28633B(this, i, anonymousClass0P7.EA(), anonymousClass0P7.pC.f28126F, false);
        }
        ki(anonymousClass1Zo, anonymousClass1Zo.f20276K, this.f73213G, this.f73211E.P());
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.a(getContext().getString(C0164R.string.reel_feedback_replies_list_title));
        anonymousClass0eT.n(true);
    }

    public final void fDA(AnonymousClass0Ci anonymousClass0Ci) {
        AnonymousClass6En anonymousClass6En = this;
        if (this.f73212F == null) {
            this.f73212F = new AnonymousClass3le(getContext(), this.f73215I);
        }
        this.f73212F.A(anonymousClass0Ci, anonymousClass6En, "feedback_replies_list", false, this.f73211E.Q());
    }

    public final void iv() {
        AnonymousClass0rF.B(this.f73208B, -365713439);
    }

    public final void ki(AnonymousClass1Zo anonymousClass1Zo, AnonymousClass0Ci anonymousClass0Ci, AnonymousClass0Pj anonymousClass0Pj, boolean z) {
        AnonymousClass0bz.B(getContext()).C(AnonymousClass0J7.f2895B.O().C(this.f73215I, this, "reel_dashboard_viewer").tQA(anonymousClass0Pj.f4136H).vQA(anonymousClass0Pj.getId()).iOA(z).fSA(anonymousClass0Ci.getId()).RD());
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1035207100);
        super.onCreate(bundle);
        this.f73215I = AnonymousClass0Ce.G(getArguments());
        String string = getArguments().getString("ReelFeedbackRepliesListFragment.REEL_ID");
        String string2 = getArguments().getString("ReelFeedbackRepliesListFragment.REEL_ITEM_ID");
        AnonymousClass0MI D = AnonymousClass0MB.C(this.f73215I).D(string);
        this.f73211E = D;
        if (D != null) {
            for (AnonymousClass0Pj anonymousClass0Pj : D.F()) {
                if (anonymousClass0Pj.getId().equals(string2)) {
                    this.f73213G = anonymousClass0Pj;
                    break;
                }
            }
        }
        this.f73210D = new AnonymousClass5vC(this, this);
        this.f73208B = new AnonymousClass5tF(getContext(), this.f73215I, this.f73210D, this);
        this.f73210D.f62382B = this.f73208B;
        AnonymousClass6En.m29590B(this);
        AnonymousClass0cQ.G(this, 1981151013, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1861517459);
        View inflate = layoutInflater.inflate(C0164R.layout.layout_listview_with_progress, viewGroup, false);
        AnonymousClass0cQ.G(this, -754848664, F);
        return inflate;
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -1408168236);
        super.onResume();
        if (this.f73213G == null) {
            getActivity().onBackPressed();
        }
        AnonymousClass0lG F2 = AnonymousClass0lG.F(getActivity(), this.f73215I);
        if (F2 != null && F2.G() && F2.f9477U == AnonymousClass0Qf.REEL_VIEWER_LIST) {
            F2.D(F2.f9460D, F2.f9465I, new AnonymousClass5vD(this));
        }
        AnonymousClass0cQ.G(this, 860016832, F);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, -1409616936);
        this.f73216J.onScroll(absListView, i, i2, i3);
        AnonymousClass0cQ.H(this, 1647847863, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, -1460214785);
        this.f73216J.onScrollStateChanged(absListView, i);
        AnonymousClass0cQ.H(this, 1485400004, I);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, -355549030);
        super.onStart();
        AnonymousClass6En.m29592D(this);
        AnonymousClass0cQ.G(this, -573872265, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f73216J.A(this.f73210D);
        getListView().setOnScrollListener(this);
        setListAdapter(this.f73208B);
    }

    public final void xs(AnonymousClass1Zo anonymousClass1Zo) {
        AnonymousClass0Ci anonymousClass0Ci = anonymousClass1Zo.f20276K;
        if (this.f73214H == null) {
            this.f73214H = new AnonymousClass5CC(getRootActivity());
        }
        this.f73214H.m25958A(anonymousClass0Ci, this.f73211E, new AnonymousClass5vF(this));
    }
}

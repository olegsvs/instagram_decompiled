package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0164R;
import com.instagram.ui.emptystaterow.EmptyStateView;

/* renamed from: X.4D0 */
public final class AnonymousClass4D0 extends AnonymousClass0IJ implements AnonymousClass0nn, AnonymousClass3Lk, AnonymousClass2Hy, AnonymousClass0IT {
    /* renamed from: J */
    public static String f51511J = "CreatePromotionMediaPickerFragment.ARGUMENT_ENTRY_POINT";
    /* renamed from: B */
    public AnonymousClass0P7 f51512B;
    /* renamed from: C */
    public AnonymousClass0Cm f51513C;
    /* renamed from: D */
    private AnonymousClass33V f51514D;
    /* renamed from: E */
    private AnonymousClass0ng f51515E;
    /* renamed from: F */
    private AnonymousClass0rr f51516F;
    /* renamed from: G */
    private EmptyStateView f51517G;
    /* renamed from: H */
    private RecyclerView f51518H;
    /* renamed from: I */
    private boolean f51519I;

    public final void Hr(AnonymousClass0fq anonymousClass0fq) {
    }

    public final void Jr() {
    }

    public final void Vk() {
    }

    public final String getModuleName() {
        return "create_promotion_media_picker";
    }

    /* renamed from: B */
    public static void m23541B(AnonymousClass4D0 anonymousClass4D0, AnonymousClass0P7 anonymousClass0P7) {
        anonymousClass4D0.f51512B = anonymousClass0P7;
        AnonymousClass0nJ anonymousClass0nJ = anonymousClass4D0.f51514D;
        anonymousClass0nJ.f37396H = anonymousClass0P7;
        anonymousClass0nJ.notifyDataSetChanged();
        AnonymousClass0IL P = AnonymousClass0Ir.f2848B.A().P(anonymousClass0P7.NO());
        String str = "IgSessionManager.USER_ID";
        P.getArguments().putString(str, anonymousClass4D0.getArguments().getString(str));
        anonymousClass4D0.getChildFragmentManager().B().M(C0164R.id.fragment_container, P).F();
    }

    /* renamed from: C */
    private AnonymousClass0Iu m23542C() {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(this.f51513C);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        anonymousClass0Pt.f4229M = "feed/promotable_media/";
        anonymousClass0Pt = anonymousClass0Pt.M(AnonymousClass11j.class);
        AnonymousClass0It.F(anonymousClass0Pt, this.f51515E.f10109E);
        return anonymousClass0Pt.H();
    }

    /* renamed from: D */
    private void m23543D(int i) {
        if (getActivity().getParent() != null && (getActivity().getParent() instanceof AnonymousClass0Hj)) {
            ((AnonymousClass0Hj) getActivity().getParent()).CSA(i);
        }
    }

    public final void Gr(AnonymousClass0Q6 anonymousClass0Q6) {
        AnonymousClass0xr.E(m23544b(), "Network error", AnonymousClass0a2.I(this.f51513C));
        AnonymousClass0IG.G(getContext(), C0164R.string.error_msg);
    }

    public final void Ir() {
        getView().findViewById(C0164R.id.loading_indicator).setVisibility(8);
    }

    public final /* bridge */ /* synthetic */ void Kr(AnonymousClass0Pn anonymousClass0Pn) {
        m23545c((AnonymousClass0ft) anonymousClass0Pn);
    }

    public final void Lr(AnonymousClass0Pn anonymousClass0Pn) {
        AnonymousClass0ft anonymousClass0ft = (AnonymousClass0ft) anonymousClass0Pn;
    }

    public final void Uk() {
        Intent B = AnonymousClass0EM.f1972B.B(getContext(), 335544320);
        B.setData(Uri.parse("ig://share").buildUpon().appendQueryParameter("source", AnonymousClass0g1.PROMOTIONS_MANAGER.f8051B).build());
        AnonymousClass0IW.I(B, getContext());
        this.f51519I = true;
    }

    /* renamed from: b */
    public final String m23544b() {
        String string = getArguments().getString(f51511J);
        if (string != null) {
            return string;
        }
        AnonymousClass0Gn.H(getModuleName(), "Missing entry point");
        return getModuleName();
    }

    /* renamed from: c */
    public final void m23545c(AnonymousClass0ft anonymousClass0ft) {
        if (anonymousClass0ft.f8015E.isEmpty()) {
            AnonymousClass0xr.E(m23544b(), "Empty Response", AnonymousClass0a2.I(this.f51513C));
            this.f51517G.m14957A();
            return;
        }
        String b = m23544b();
        AnonymousClass2NX.BOOST_POSTS_ENTER.m15347A().F("step", "media_selection").F("entry_point", b).F("fb_user_id", AnonymousClass0a2.I(this.f51513C)).R();
        this.f51519I = false;
        this.f51517G.setVisibility(8);
        this.f51518H.setVisibility(0);
        getView().findViewById(C0164R.id.fragment_container).setVisibility(0);
        AnonymousClass0nJ anonymousClass0nJ = this.f51514D;
        anonymousClass0nJ.f37394F.addAll(anonymousClass0ft.f8015E);
        anonymousClass0nJ.notifyDataSetChanged();
        if (this.f51518H.getAdapter() == null) {
            this.f51518H.setAdapter(this.f51514D);
        }
        if (this.f51512B == null) {
            AnonymousClass4D0.m23541B(this, (AnonymousClass0P7) anonymousClass0ft.f8015E.get(0));
        }
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.Z(C0164R.string.create_promotion);
        AnonymousClass22r anonymousClass22r = new AnonymousClass22r(AnonymousClass0eV.MODAL);
        anonymousClass22r.f25414H = C0164R.drawable.instagram_x_outline_24;
        anonymousClass22r.f25410D = C0164R.drawable.nav_arrow_next;
        anonymousClass22r.f25408B = AnonymousClass0ca.B(AnonymousClass0Ca.C(getContext(), C0164R.color.blue_5));
        anonymousClass0eT.d(anonymousClass22r.m14277B());
        anonymousClass0eT.m(true, new AnonymousClass4Cz(this));
        anonymousClass0eT.n(true);
    }

    public final void gC() {
        if (this.f51515E.B()) {
            this.f51515E.C(m23542C(), this);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -386147888);
        this.f51514D = new AnonymousClass33V(this, getContext(), 1.0f, false);
        this.f51513C = AnonymousClass0Ce.G(getArguments());
        AnonymousClass0ng anonymousClass0ng = new AnonymousClass0ng(getContext(), this.f51513C.f1759C, getLoaderManager());
        this.f51515E = anonymousClass0ng;
        anonymousClass0ng.C(m23542C(), this);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0164R.layout.create_promotion_media_picker_fragment, viewGroup, false);
        EmptyStateView emptyStateView = new EmptyStateView(getContext());
        AnonymousClass2I0 anonymousClass2I0 = AnonymousClass2I0.EMPTY;
        View C = emptyStateView.m14963G(C0164R.drawable.promote, anonymousClass2I0).m14970N(C0164R.string.no_eligible_post_title, anonymousClass2I0).m14968L(C0164R.string.no_eligible_post_subtitle, anonymousClass2I0).m14958B(C0164R.string.create_a_post, anonymousClass2I0).m14959C(this, anonymousClass2I0);
        this.f51517G = C;
        viewGroup2.addView(C);
        AnonymousClass0cQ.G(this, 165513011, F);
        return viewGroup2;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 1469360839);
        super.onDestroyView();
        String b = m23544b();
        AnonymousClass2NX.BOOST_POSTS_CLOSE.m15347A().F("entry_point", b).F("fb_user_id", AnonymousClass0a2.I(this.f51513C)).R();
        AnonymousClass0cQ.G(this, 1198409400, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -362827178);
        super.onPause();
        m23543D(0);
        AnonymousClass0cQ.G(this, -925366345, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -865632685);
        super.onResume();
        m23543D(8);
        if (this.f51519I) {
            this.f51515E.C(m23542C(), this);
        }
        AnonymousClass0cQ.G(this, 882349358, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f51518H = (RecyclerView) view.findViewById(C0164R.id.recycler_view);
        AnonymousClass0la anonymousClass0rr = new AnonymousClass0rr(getContext(), 0, false);
        this.f51516F = anonymousClass0rr;
        anonymousClass0rr.f9543B = true;
        this.f51518H.setLayoutManager(this.f51516F);
        if (((Boolean) AnonymousClass0CC.OZ.H(this.f51513C)).booleanValue()) {
            this.f51518H.D(new AnonymousClass1VV(this, this.f51516F, 5));
        }
        this.f51518H.A(new AnonymousClass0ru(getContext().getResources().getDimensionPixelSize(C0164R.dimen.media_carousel_padding), getContext().getResources().getDimensionPixelSize(C0164R.dimen.media_carousel_padding)));
    }
}

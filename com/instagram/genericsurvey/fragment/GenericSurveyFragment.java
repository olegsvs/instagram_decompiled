package com.instagram.genericsurvey.fragment;

import X.AnonymousClass0Ce;
import X.AnonymousClass0Cm;
import X.AnonymousClass0EJ;
import X.AnonymousClass0Fj;
import X.AnonymousClass0GA;
import X.AnonymousClass0Hj;
import X.AnonymousClass0IS;
import X.AnonymousClass0IT;
import X.AnonymousClass0IU;
import X.AnonymousClass0IY;
import X.AnonymousClass0IZ;
import X.AnonymousClass0Ie;
import X.AnonymousClass0Jd;
import X.AnonymousClass0MI;
import X.AnonymousClass0Nm;
import X.AnonymousClass0PZ;
import X.AnonymousClass0Qd;
import X.AnonymousClass0Qf;
import X.AnonymousClass0TK;
import X.AnonymousClass0bN;
import X.AnonymousClass0bP;
import X.AnonymousClass0cQ;
import X.AnonymousClass0db;
import X.AnonymousClass0dd;
import X.AnonymousClass0eT;
import X.AnonymousClass0hi;
import X.AnonymousClass0hj;
import X.AnonymousClass0hp;
import X.AnonymousClass0hq;
import X.AnonymousClass0hr;
import X.AnonymousClass0iI;
import X.AnonymousClass0iW;
import X.AnonymousClass0is;
import X.AnonymousClass0j9;
import X.AnonymousClass0jB;
import X.AnonymousClass0jC;
import X.AnonymousClass0jM;
import X.AnonymousClass0jR;
import X.AnonymousClass0jS;
import X.AnonymousClass0jU;
import X.AnonymousClass0jW;
import X.AnonymousClass0jY;
import X.AnonymousClass0jZ;
import X.AnonymousClass0jf;
import X.AnonymousClass0jg;
import X.AnonymousClass0jj;
import X.AnonymousClass0jr;
import X.AnonymousClass0kV;
import X.AnonymousClass0kW;
import X.AnonymousClass0kZ;
import X.AnonymousClass0ka;
import X.AnonymousClass0lA;
import X.AnonymousClass0lG;
import X.AnonymousClass0mp;
import X.AnonymousClass0mq;
import X.AnonymousClass0mw;
import X.AnonymousClass0ss;
import X.AnonymousClass0st;
import X.AnonymousClass0w1;
import X.AnonymousClass0y5;
import X.AnonymousClass14H;
import X.AnonymousClass1VG;
import X.AnonymousClass3QF;
import X.AnonymousClass3QH;
import X.AnonymousClass3QI;
import X.AnonymousClass3QK;
import X.AnonymousClass3QL;
import X.AnonymousClass3QM;
import X.AnonymousClass3QO;
import X.AnonymousClass3kj;
import X.AnonymousClass4ro;
import X.AnonymousClass4rp;
import X.AnonymousClass5hz;
import X.AnonymousClass5i4;
import X.AnonymousClass5i5;
import X.AnonymousClass5iD;
import X.AnonymousClass5iE;
import X.AnonymousClass5iP;
import X.AnonymousClass5iQ;
import X.AnonymousClass5iT;
import X.AnonymousClass5iU;
import X.AnonymousClass5iV;
import X.AnonymousClass5iW;
import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.facebook.C0164R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.List;

public class GenericSurveyFragment extends AnonymousClass0Ie implements AnonymousClass0PZ, AnonymousClass0IS, OnScrollListener, AnonymousClass0jB, AnonymousClass0IT, AnonymousClass0EJ, AnonymousClass5iD, AnonymousClass0Qd, AnonymousClass0j9, AnonymousClass4ro {
    /* renamed from: B */
    public AnonymousClass5hz f73014B;
    /* renamed from: C */
    public int f73015C = -1;
    /* renamed from: D */
    public boolean f73016D;
    /* renamed from: E */
    public boolean f73017E;
    /* renamed from: F */
    public boolean f73018F;
    /* renamed from: G */
    public final List f73019G = new ArrayList();
    /* renamed from: H */
    public ViewGroup f73020H;
    /* renamed from: I */
    public final AnonymousClass0hq f73021I = new AnonymousClass0hp();
    /* renamed from: J */
    public long f73022J;
    /* renamed from: K */
    public AnonymousClass3QO f73023K;
    /* renamed from: L */
    public long f73024L;
    /* renamed from: M */
    public AnonymousClass0Cm f73025M;
    /* renamed from: N */
    private final AnonymousClass0hj f73026N = new AnonymousClass0hj();
    /* renamed from: O */
    private final AnonymousClass0hr f73027O = new AnonymousClass0hr(new AnonymousClass5iP(this));
    /* renamed from: P */
    private final AnonymousClass0hi f73028P = new AnonymousClass0hi();
    /* renamed from: Q */
    private String f73029Q;
    public ViewGroup mContentContainer;
    public ViewGroup mEndScreen;
    public ViewStub mEndScreenViewStub;
    public SpinnerImageView mLoadingSpinner;
    public AnonymousClass5iE mNavbarController;
    public ViewGroup mRetryView;
    public ViewStub mRetryViewStub;

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    /* renamed from: B */
    public static void m29497B(GenericSurveyFragment genericSurveyFragment) {
        AnonymousClass0GA B = AnonymousClass5i5.m28317B(genericSurveyFragment.f73025M, genericSurveyFragment.f73029Q, null);
        B.f2849B = new AnonymousClass5iT(genericSurveyFragment);
        genericSurveyFragment.schedule(B);
    }

    /* renamed from: C */
    public static AnonymousClass0lG m29498C(GenericSurveyFragment genericSurveyFragment) {
        if (genericSurveyFragment.getActivity() == null) {
            return null;
        }
        return AnonymousClass0Jd.f2931B.O(genericSurveyFragment.getActivity(), genericSurveyFragment.f73025M);
    }

    /* renamed from: D */
    public static void m29499D(GenericSurveyFragment genericSurveyFragment) {
        genericSurveyFragment.mContentContainer.setVisibility(8);
        AnonymousClass3QF anonymousClass3QF = genericSurveyFragment.f73023K.f41138B;
        switch (AnonymousClass5iW.f68393B[anonymousClass3QF.f41102C.ordinal()]) {
            case 1:
                View C = AnonymousClass0ss.C(genericSurveyFragment.getContext(), genericSurveyFragment.f73020H);
                AnonymousClass0ss.B((AnonymousClass0st) C.getTag(), anonymousClass3QF.f41101B, new AnonymousClass0mq(0), genericSurveyFragment, true);
                genericSurveyFragment.f73020H.addView(C);
                genericSurveyFragment.f73020H.invalidate();
                return;
            case 2:
                if (genericSurveyFragment.mEndScreen == null) {
                    genericSurveyFragment.mEndScreen = (ViewGroup) genericSurveyFragment.mEndScreenViewStub.inflate();
                }
                genericSurveyFragment.mEndScreen.setVisibility(0);
                return;
            default:
                return;
        }
    }

    /* renamed from: E */
    public static void m29500E(GenericSurveyFragment genericSurveyFragment) {
        AnonymousClass0eT.D(((BaseFragmentActivity) genericSurveyFragment.getActivity()).FI());
    }

    /* renamed from: F */
    private void m29501F(int i) {
        if (getRootActivity() instanceof AnonymousClass0Hj) {
            ((AnonymousClass0Hj) getRootActivity()).CSA(i);
        }
    }

    /* renamed from: G */
    private void m29502G() {
        AnonymousClass0Nm.N(getView());
        this.f73022J = System.currentTimeMillis();
        this.f73024L = 0;
        AnonymousClass5hz anonymousClass5hz = this.f73014B;
        anonymousClass5hz.f68320C.clear();
        AnonymousClass3QL anonymousClass3QL = anonymousClass5hz.f68321D;
        anonymousClass3QL.f41125G.clear();
        anonymousClass3QL.f41127I = 0;
        anonymousClass3QL.f41123E = false;
        anonymousClass3QL.f41126H = 0;
        anonymousClass3QL.f41128J = 0;
        anonymousClass3QL.f41122D = -1;
        anonymousClass3QL.f41121C = -1;
        anonymousClass3QL.f41124F = false;
        anonymousClass5hz.f68319B.D();
        AnonymousClass5hz.m28308B(anonymousClass5hz);
        if (this.f73015C >= this.f73019G.size() - 1) {
            this.f73017E = true;
            m29500E(this);
            m29499D(this);
            return;
        }
        this.f73015C++;
        m29500E(this);
        this.f73014B.m28309F(((AnonymousClass3QM) this.f73019G.get(this.f73015C)).f41129B);
    }

    public final void MAA(AnonymousClass0mp anonymousClass0mp, AnonymousClass0mq anonymousClass0mq) {
        Object obj;
        String str = anonymousClass0mp.f9906B;
        if (str.hashCode() == -1950200311) {
            if (str.equals("bake_off")) {
                obj = null;
                if (obj != null) {
                    getFragmentManager().L();
                    AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(getActivity());
                    anonymousClass0IZ.f2754D = AnonymousClass0IY.B().Z(null);
                    anonymousClass0IZ.B();
                }
            }
        }
        obj = -1;
        if (obj != null) {
            getFragmentManager().L();
            AnonymousClass0IZ anonymousClass0IZ2 = new AnonymousClass0IZ(getActivity());
            anonymousClass0IZ2.f2754D = AnonymousClass0IY.B().Z(null);
            anonymousClass0IZ2.B();
        }
    }

    public final void Nm(Object obj, Object obj2) {
        String str = this.f73023K.f41144H;
        String str2 = this.f73029Q;
        String str3 = ((AnonymousClass3QM) this.f73023K.f41143G.get(this.f73015C)).f41130C;
        int i = ((AnonymousClass3QL) obj2).f41127I;
        AnonymousClass3QK anonymousClass3QK = (AnonymousClass3QK) obj;
        AnonymousClass0bP G = AnonymousClass0bN.G(AnonymousClass5i4.m28314B("response"), this);
        G.dC = "partial";
        G.nD = str;
        G.pD = str2;
        G.cC = str3;
        G.vC = i;
        AnonymousClass0lA B = AnonymousClass0lA.B();
        AnonymousClass0mw A = anonymousClass3QK.A(i);
        AnonymousClass0db C = AnonymousClass0db.C();
        C.G("question_id", A.f9942F);
        C.F("answers", A.B());
        B.B(C);
        G.WD = B;
        AnonymousClass0bN.f(G.B(), AnonymousClass0dd.LOW);
        AnonymousClass14H.C(getView()).J().G(0.0f).N();
        AnonymousClass0Nm.N(getView());
    }

    public final void Pm(Object obj, Object obj2) {
        String str = this.f73023K.f41144H;
        String str2 = this.f73029Q;
        String str3 = ((AnonymousClass3QM) this.f73023K.f41143G.get(this.f73015C)).f41130C;
        String str4 = "finished";
        String str5 = null;
        for (AnonymousClass3QI anonymousClass3QI : ((AnonymousClass3QM) this.f73023K.f41143G.get(this.f73015C)).f41129B) {
            AnonymousClass3QH anonymousClass3QH = anonymousClass3QI.f41109C;
            if (anonymousClass3QH == AnonymousClass3QH.FEED_ITEM || anonymousClass3QH == AnonymousClass3QH.REEL) {
                str5 = anonymousClass3QI.f41108B.NO();
            }
        }
        long currentTimeMillis = (this.f73024L + System.currentTimeMillis()) - this.f73022J;
        int i = ((AnonymousClass3QL) obj2).f41128J;
        AnonymousClass3QK anonymousClass3QK = (AnonymousClass3QK) obj;
        AnonymousClass0bP G = AnonymousClass0bN.G(AnonymousClass5i4.m28314B("response"), this);
        G.nD = str;
        G.dC = str4;
        G.pD = str2;
        G.cC = str3;
        G.QC = str5;
        G.CE = currentTimeMillis;
        G.vC = i;
        AnonymousClass0lA B = AnonymousClass0lA.B();
        for (i = 0; i < anonymousClass3QK.B(); i++) {
            AnonymousClass0mw A = anonymousClass3QK.A(i);
            AnonymousClass0db C = AnonymousClass0db.C();
            C.G("question_id", A.f9942F);
            C.F("answers", A.B());
            B.B(C);
        }
        G.WD = B;
        AnonymousClass0bN.f(G.B(), AnonymousClass0dd.LOW);
        m29502G();
    }

    public final void Sp(int i, boolean z) {
        if (this.f73014B.m28311H()) {
            int height;
            if (i != 0) {
                AnonymousClass3QL anonymousClass3QL = this.f73014B.f68321D;
                height = getListView().getHeight() - (anonymousClass3QL.f41122D + anonymousClass3QL.f41121C);
                getListView().smoothScrollToPosition(this.f73014B.getCount());
            } else {
                height = 0;
            }
            AnonymousClass14H G = AnonymousClass14H.C(getView()).J().G((float) (-height));
            G.f13848N = new AnonymousClass5iU(this, i);
            G.N();
        }
    }

    public final void Wg() {
        String str = this.f73023K.f41144H;
        String str2 = this.f73029Q;
        String str3 = ((AnonymousClass3QM) this.f73023K.f41143G.get(this.f73015C)).f41130C;
        long currentTimeMillis = (this.f73024L + System.currentTimeMillis()) - this.f73022J;
        AnonymousClass0bP G = AnonymousClass0bN.G(AnonymousClass5i4.m28314B("skip_button"), this);
        G.nD = str;
        G.pD = str2;
        G.cC = str3;
        G.CE = currentTimeMillis;
        AnonymousClass0bN.f(G.B(), AnonymousClass0dd.LOW);
        m29502G();
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        AnonymousClass0eT anonymousClass0eT2 = anonymousClass0eT;
        this.mNavbarController.m28323B(anonymousClass0eT);
        if (this.f73018F) {
            this.mNavbarController.m28322A(anonymousClass0eT2, this.f73023K.f41142F, this.f73017E, this.f73023K.f41139C, this.f73023K.f41140D);
            this.mNavbarController.m28324C(this.f73015C, this.f73023K.f41141E, this.f73019G.size());
        }
    }

    public final String getModuleName() {
        return this.f73029Q;
    }

    public final void of() {
        getFragmentManager().L();
    }

    public final void onAppBackgrounded() {
        this.f73024L += System.currentTimeMillis() - this.f73022J;
    }

    public final void onAppForegrounded() {
        this.f73022J = System.currentTimeMillis();
    }

    public final boolean onBackPressed() {
        return m29498C(this).I();
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1795258400);
        super.onCreate(bundle);
        this.f73025M = AnonymousClass0Ce.G(getArguments());
        this.f73014B = new AnonymousClass5hz(getContext(), this, this.f73025M, this);
        this.f73029Q = getArguments().getString("GenericSurveyFragment.SURVEY_TYPE");
        AnonymousClass0jC anonymousClass0jC = new AnonymousClass0jC(this, false, null);
        AnonymousClass0jS anonymousClass0jS = new AnonymousClass0jS(this, new AnonymousClass0iW(getContext()), this.f73014B, this.f73028P);
        AnonymousClass0jY anonymousClass0jY = new AnonymousClass0jY();
        AnonymousClass0jZ anonymousClass0jZ = new AnonymousClass0jZ(getContext(), this.f73025M, this, this.f73014B, anonymousClass0jY);
        AnonymousClass0jZ anonymousClass0jZ2 = anonymousClass0jZ;
        AnonymousClass0jr anonymousClass0jr = new AnonymousClass0jr(this, this, this.f73014B, new AnonymousClass0w1(getContext(), this.f73025M, this, this.f73014B, anonymousClass0jC, null));
        AnonymousClass0jf anonymousClass0jf = new AnonymousClass0jf(this.f73014B, this);
        AnonymousClass0jg anonymousClass0jg = new AnonymousClass0jg(this.f73014B, this);
        AnonymousClass3kj anonymousClass3kj = new AnonymousClass3kj(getActivity(), this.f73014B, this);
        AnonymousClass0is anonymousClass0is = new AnonymousClass0is(getActivity(), this.f73025M, this.f73014B, anonymousClass0jZ);
        AnonymousClass0jj anonymousClass0y5 = new AnonymousClass0y5();
        AnonymousClass0jU anonymousClass0jU = new AnonymousClass0jU(getActivity(), new AnonymousClass0jW(this.f73025M));
        AnonymousClass0IU fragmentManager = getFragmentManager();
        AnonymousClass5hz anonymousClass5hz = this.f73014B;
        AnonymousClass0Cm anonymousClass0Cm = this.f73025M;
        AnonymousClass0hq anonymousClass0hq = this.f73021I;
        AnonymousClass1VG anonymousClass1VG = r16;
        AnonymousClass1VG anonymousClass1VG2 = new AnonymousClass1VG(this, fragmentManager, this, anonymousClass5hz, anonymousClass0jZ, anonymousClass0jf, anonymousClass0jg, anonymousClass0jr, anonymousClass0jS, anonymousClass3kj, anonymousClass0is, anonymousClass0y5, anonymousClass0Cm, anonymousClass0hq, anonymousClass0jC, anonymousClass0jU, new AnonymousClass0kV(getActivity(), this.f73025M), AnonymousClass0jM.B(getContext(), this.f73025M), AnonymousClass0kW.E(this.f73025M));
        AnonymousClass0kZ anonymousClass0kZ = new AnonymousClass0kZ(getContext(), this, getFragmentManager(), this.f73014B, this, this.f73025M);
        anonymousClass0kZ.f9323L = anonymousClass0jY;
        anonymousClass0kZ.f9320I = anonymousClass0jZ2;
        anonymousClass0kZ.f9318G = anonymousClass0jf;
        anonymousClass0kZ.f9325N = anonymousClass0jr;
        anonymousClass0kZ.f9329R = this.f73021I;
        anonymousClass0kZ.f9330S = anonymousClass0jS;
        anonymousClass0kZ.f9333V = anonymousClass3kj;
        anonymousClass0kZ.f9314C = anonymousClass1VG;
        anonymousClass0kZ.f9326O = anonymousClass0jC;
        anonymousClass0kZ.f9331T = anonymousClass0is;
        anonymousClass0kZ.f9317F = anonymousClass0jU;
        anonymousClass0kZ.f9328Q = anonymousClass0y5;
        anonymousClass0kZ.f9316E = new AnonymousClass0ka(getContext(), this.f73014B);
        Object A = anonymousClass0kZ.A();
        AnonymousClass0TK anonymousClass0jR = new AnonymousClass0jR(this, this, this.f73025M);
        registerLifecycleListener(this.f73027O);
        registerLifecycleListener(anonymousClass0jR);
        registerLifecycleListener(A);
        this.f73028P.A(A);
        m29497B(this);
        setListAdapter(this.f73014B);
        AnonymousClass0cQ.G(this, 1582036265, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -707673643);
        m29501F(8);
        this.f73026N.A(this);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_ad_survey, viewGroup, false);
        this.f73020H = (ViewGroup) inflate.findViewById(C0164R.id.layout_container);
        this.mEndScreenViewStub = (ViewStub) inflate.findViewById(C0164R.id.survey_end_screen);
        this.mRetryViewStub = (ViewStub) inflate.findViewById(C0164R.id.survey_retry);
        this.mContentContainer = (ViewGroup) inflate.findViewById(C0164R.id.content_container);
        this.mLoadingSpinner = (SpinnerImageView) inflate.findViewById(C0164R.id.loading_spinner);
        this.mNavbarController = new AnonymousClass5iE(this, getResources());
        inflate = this.f73020H;
        AnonymousClass0cQ.G(this, -1305064042, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, 100112190);
        super.onDestroy();
        AnonymousClass0Fj.f2192B.D(this);
        AnonymousClass0cQ.G(this, -1121700583, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -1898914274);
        super.onDestroyView();
        this.f73020H = null;
        m29501F(0);
        AnonymousClass0cQ.G(this, 44631198, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 578613551);
        AnonymousClass0Nm.N(getView());
        super.onPause();
        AnonymousClass0cQ.G(this, 1882648723, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -72329843);
        super.onResume();
        if (m29498C(this).G()) {
            this.f73020H.post(new AnonymousClass5iQ(this, m29498C(this)));
        }
        AnonymousClass0cQ.G(this, -1881938449, F);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, -762507138);
        if (!this.f73014B.FX()) {
            this.f73028P.onScroll(absListView, i, i2, i3);
        } else if (AnonymousClass0iI.E(absListView)) {
            this.f73014B.Tc();
            this.f73028P.onScroll(absListView, i, i2, i3);
        }
        if (this.f73016D) {
            AnonymousClass0Nm.N(absListView);
        }
        AnonymousClass0cQ.H(this, 1192902625, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, -2067981848);
        if (!this.f73014B.FX()) {
            this.f73028P.onScrollStateChanged(absListView, i);
        }
        AnonymousClass0cQ.H(this, -971736117, I);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, 1741665581);
        super.onStart();
        this.f73026N.B((Activity) getContext());
        AnonymousClass0cQ.G(this, 1177610645, F);
    }

    public final void onStop() {
        int F = AnonymousClass0cQ.F(this, -795196203);
        super.onStop();
        this.f73026N.C();
        AnonymousClass0cQ.G(this, -1791552725, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mLoadingSpinner.setVisibility(this.f73018F ? 8 : 0);
        if (this.f73017E) {
            m29499D(this);
            return;
        }
        AnonymousClass0Fj.f2192B.A(this);
        getListView().setOnScrollListener(this);
    }

    public final void zv(AnonymousClass0MI anonymousClass0MI, AnonymousClass4rp anonymousClass4rp, List list) {
        this.f73014B.f68321D.f41124F = true;
        RectF L = AnonymousClass0Nm.L(anonymousClass4rp.f57957C);
        AnonymousClass0Jd.f2931B.O(getActivity(), this.f73025M).E(anonymousClass0MI, -1, L, new RectF(L.centerX(), L.centerY(), L.centerX(), L.centerY()), new AnonymousClass5iV(this, list, anonymousClass0MI), false, AnonymousClass0Qf.RATE_ADS);
    }
}

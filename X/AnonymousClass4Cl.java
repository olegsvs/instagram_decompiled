package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.facebook.C0164R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.ui.BusinessCategoryInlineSelectionView;
import com.instagram.business.ui.BusinessCategorySelectionView;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.iig.components.stepperheader.StepperHeader;
import com.instagram.login.api.RegistrationFlowExtras;
import com.instagram.model.business.BusinessInfo;

/* renamed from: X.4Cl */
public final class AnonymousClass4Cl extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass369, AnonymousClass35Y, AnonymousClass35i, AnonymousClass36J, AnonymousClass0IT {
    /* renamed from: B */
    public BusinessInfo f51443B;
    /* renamed from: C */
    public AnonymousClass35j f51444C;
    /* renamed from: D */
    public boolean f51445D;
    /* renamed from: E */
    public AnonymousClass34I f51446E;
    /* renamed from: F */
    public String f51447F;
    /* renamed from: G */
    public final Handler f51448G = new Handler(Looper.getMainLooper());
    /* renamed from: H */
    public String f51449H;
    /* renamed from: I */
    public String f51450I;
    /* renamed from: J */
    public String f51451J;
    /* renamed from: K */
    public boolean f51452K;
    /* renamed from: L */
    public AnonymousClass0Cm f51453L;
    /* renamed from: M */
    private BusinessCategoryInlineSelectionView f51454M;
    /* renamed from: N */
    private BusinessCategorySelectionView f51455N;
    /* renamed from: O */
    private BusinessNavBar f51456O;
    /* renamed from: P */
    private AnonymousClass36A f51457P;
    /* renamed from: Q */
    private boolean f51458Q;
    /* renamed from: R */
    private ViewSwitcher f51459R;
    /* renamed from: S */
    private TextView f51460S;
    /* renamed from: T */
    private RegistrationFlowExtras f51461T;
    /* renamed from: U */
    private boolean f51462U;
    /* renamed from: V */
    private boolean f51463V;
    /* renamed from: W */
    private StepperHeader f51464W;
    /* renamed from: X */
    private AnonymousClass0Ci f51465X;

    public final void Cm(String str, String str2) {
    }

    public final void Jz() {
    }

    public final String getModuleName() {
        return "choose_category";
    }

    public final void vl(String str, AnonymousClass368 anonymousClass368, String str2) {
    }

    /* renamed from: B */
    public static void m23519B(AnonymousClass4Cl anonymousClass4Cl) {
        if (anonymousClass4Cl.getView() != null) {
            String str;
            anonymousClass4Cl.f51455N.setVisibility(0);
            anonymousClass4Cl.f51454M.setVisibility(8);
            if (anonymousClass4Cl.f51465X.f1757z != null) {
                str = anonymousClass4Cl.f51465X.f1757z;
            } else {
                str = anonymousClass4Cl.f51465X.uT();
            }
            anonymousClass4Cl.f51457P.m18514B(str, anonymousClass4Cl, anonymousClass4Cl.f51453L);
        }
    }

    public final void BCA(String str) {
        m23530M();
        String str2 = str;
        this.f51457P.m18513A(str2, AnonymousClass368.SUBCATEGORY, this, this.f51453L, m23526I());
    }

    /* renamed from: C */
    public static String m23520C(AnonymousClass4Cl anonymousClass4Cl) {
        if ((anonymousClass4Cl.getView() != null ? 1 : null) == null) {
            return null;
        }
        if (anonymousClass4Cl.f51462U) {
            return anonymousClass4Cl.f51454M.getSelectedSubcategoryId();
        }
        return anonymousClass4Cl.f51455N.getSelectedSubcategoryId();
    }

    /* renamed from: D */
    public static void m23521D(AnonymousClass4Cl anonymousClass4Cl) {
        if (((Boolean) AnonymousClass0CC.KC.H(anonymousClass4Cl.f51453L)).booleanValue()) {
            anonymousClass4Cl.m23524G();
        } else {
            AnonymousClass4Cl.m23519B(anonymousClass4Cl);
        }
    }

    public final void Dm(AnonymousClass2Xk anonymousClass2Xk, String str) {
        this.f51455N.m21691A(str, anonymousClass2Xk);
    }

    /* renamed from: E */
    public static void m23522E(AnonymousClass4Cl anonymousClass4Cl) {
        BusinessInfo businessInfo;
        if (anonymousClass4Cl.f51443B == null) {
            businessInfo = new BusinessInfo(AnonymousClass4Cl.m23520C(anonymousClass4Cl), null, null, null, null);
        } else {
            businessInfo = new BusinessInfo(AnonymousClass4Cl.m23520C(anonymousClass4Cl), anonymousClass4Cl.f51443B.f27750J, anonymousClass4Cl.f51443B.f27752L, anonymousClass4Cl.f51443B.f27742B, anonymousClass4Cl.f51443B.f27751K);
        }
        anonymousClass4Cl.f51443B = businessInfo;
        AnonymousClass34I anonymousClass34I = anonymousClass4Cl.f51446E;
        if (anonymousClass34I != null) {
            ((BusinessConversionActivity) anonymousClass34I).a(anonymousClass4Cl.f51443B);
        }
        if (anonymousClass4Cl.m23528K() || !anonymousClass4Cl.m23529L()) {
        }
    }

    public final void Em(String str, String str2) {
        AnonymousClass33b.m18366H("choose_category", this.f51447F, str);
        AnonymousClass365.m18510B(this.f51446E, getActivity(), this.f51448G, this.f51447F, this.f51443B, this.f51461T);
    }

    /* renamed from: F */
    public static void m23523F(AnonymousClass4Cl anonymousClass4Cl, boolean z) {
        anonymousClass4Cl = anonymousClass4Cl.f51459R;
        if (anonymousClass4Cl != null) {
            anonymousClass4Cl.setDisplayedChild(z);
        }
    }

    public final void FH() {
        this.f51456O.setPrimaryButtonEnabled(AnonymousClass4Cl.m23520C(this) != null);
    }

    public final void Fm() {
        if (m23525H()) {
            this.f51444C.m18471A();
        } else {
            AnonymousClass4Cl.m23523F(this, false);
        }
    }

    /* renamed from: G */
    private void m23524G() {
        if (getView() != null) {
            this.f51462U = true;
            this.f51455N.setVisibility(8);
            this.f51454M.setVisibility(0);
            this.f51454M.setPrefillCategory(this.f51451J, this.f51449H, this.f51450I);
        }
    }

    public final void Gm() {
        if (m23525H()) {
            this.f51444C.m18472B();
        } else {
            AnonymousClass4Cl.m23523F(this, true);
        }
    }

    /* renamed from: H */
    private boolean m23525H() {
        return this.f51445D ^ 1;
    }

    public final void Hm(AnonymousClass2Em anonymousClass2Em, String str) {
        if (AnonymousClass365.m18512D(anonymousClass2Em, this.f51461T)) {
            AnonymousClass365.m18511C(this.f51446E, getActivity(), this.f51448G, this.f51447F, this.f51443B, this.f51461T);
        } else {
            AnonymousClass365.m18510B(this.f51446E, getActivity(), this.f51448G, this.f51447F, this.f51443B, this.f51461T);
        }
    }

    /* renamed from: I */
    private String m23526I() {
        if ((getView() != null ? 1 : null) == null) {
            return null;
        }
        if (this.f51462U) {
            return this.f51454M.getSuperCategory();
        }
        return this.f51455N.getSuperCategory();
    }

    /* renamed from: J */
    private boolean m23527J() {
        if (!AnonymousClass34H.m18398G(this.f51446E)) {
            return false;
        }
        this.f51446E.XLA();
        return true;
    }

    /* renamed from: K */
    private boolean m23528K() {
        AnonymousClass0IL anonymousClass0IL = this;
        if (!this.f51458Q) {
            return false;
        }
        String str = this.f51461T.f27655H;
        if (!AnonymousClass36K.m18521B(anonymousClass0IL, anonymousClass0IL, this.f51447F, this.f51461T.f27664Q, str, null, anonymousClass0IL, "choose_category", AnonymousClass0a2.I(this.f51453L))) {
            AnonymousClass365.m18510B(anonymousClass0IL.f51446E, getActivity(), anonymousClass0IL.f51448G, anonymousClass0IL.f51447F, anonymousClass0IL.f51443B, anonymousClass0IL.f51461T);
        }
        return true;
    }

    /* renamed from: L */
    private boolean m23529L() {
        if (!AnonymousClass34H.m18398G(this.f51446E)) {
            return false;
        }
        AnonymousClass33Z.m18346K("choose_category", this.f51447F, AnonymousClass0a2.I(this.f51453L));
        this.f51446E.fb(AnonymousClass33Y.m18334I("subcategory_id", AnonymousClass4Cl.m23520C(this)));
        return true;
    }

    /* renamed from: M */
    private void m23530M() {
        boolean z = AnonymousClass4Cl.m23520C(this) != null;
        if (m23525H()) {
            BusinessNavBar businessNavBar = this.f51456O;
            if (businessNavBar != null) {
                businessNavBar.setPrimaryButtonEnabled(z);
                return;
            }
        }
        ViewSwitcher viewSwitcher = this.f51459R;
        if (viewSwitcher != null) {
            viewSwitcher.setEnabled(z);
            TextView textView = this.f51460S;
            textView.setTextColor(textView.getTextColors().withAlpha(z ? 255 : 64));
        }
    }

    public final void Pf(String str, boolean z) {
        AnonymousClass0IJ anonymousClass0IJ = this;
        if (z) {
            this.f51457P.m18513A(str, AnonymousClass368.SUBCATEGORY, anonymousClass0IJ, this.f51453L, m23526I());
        }
        m23530M();
    }

    public final void bG() {
        this.f51456O.setPrimaryButtonEnabled(false);
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.c(C0164R.drawable.instagram_arrow_back_24, new AnonymousClass4Cg(this));
        if (!m23525H()) {
            ViewSwitcher viewSwitcher = (ViewSwitcher) anonymousClass0eT.L(C0164R.layout.business_text_action_button, C0164R.string.next, new AnonymousClass4Ch(this), true);
            this.f51459R = viewSwitcher;
            TextView textView = (TextView) viewSwitcher.getChildAt(0);
            this.f51460S = textView;
            textView.setText(C0164R.string.next);
        }
        m23530M();
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f51446E = AnonymousClass34H.m18393B(getActivity());
    }

    public final boolean onBackPressed() {
        if (!this.f51452K) {
            if (this.f51445D) {
                AnonymousClass33a.m18357B("change_category", this.f51447F, AnonymousClass0a2.I(this.f51453L));
            } else {
                AnonymousClass33Z.m18340E("choose_category", this.f51447F, null, AnonymousClass0a2.I(this.f51453L));
            }
            if (m23527J()) {
                return true;
            }
            if (this.f51458Q) {
                AnonymousClass34I anonymousClass34I = this.f51446E;
                if (anonymousClass34I != null) {
                    anonymousClass34I.XLA();
                    return true;
                }
            }
        }
        return false;
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        AnonymousClass0db J;
        int F = AnonymousClass0cQ.F(this, 1829282451);
        super.onCreate(bundle);
        AnonymousClass0lj anonymousClass0lj = new AnonymousClass0lj();
        anonymousClass0lj.L(new AnonymousClass235(getActivity()));
        a(anonymousClass0lj);
        AnonymousClass0Cm G = AnonymousClass0Ce.G(getArguments());
        this.f51453L = G;
        this.f51465X = G.B();
        String str = "choose_category";
        this.f51457P = new AnonymousClass36A(this, str, this.f51447F, AnonymousClass34H.m18395D(this.f51446E), AnonymousClass34H.m18396E(this.f51446E));
        this.f51447F = getArguments().getString("entry_point");
        this.f51449H = getArguments().getString("prefill_sub_category_id");
        this.f51450I = getArguments().getString("prefill_sub_category_name");
        this.f51451J = getArguments().getString("prefill_super_category_name");
        if (!TextUtils.equals(getArguments().getString("business_signup"), "business_signup_flow")) {
            if (!AnonymousClass34H.m18399H(r6.f51446E)) {
                z = false;
                r6.f51458Q = z;
                r6.f51443B = AnonymousClass34H.m18394C(getArguments(), r6.f51446E);
                z = r6.f51465X.i();
                r6.f51445D = z;
                if (z) {
                    J = AnonymousClass1gr.J(r6.f51453L, true);
                    String str2 = r6.f51447F;
                    if (AnonymousClass34H.m18398G(r6.f51446E)) {
                        J = ((BusinessConversionActivity) r6.f51446E).X(J);
                    }
                    AnonymousClass33Z.m18351P(str, str2, J, AnonymousClass0a2.I(r6.f51453L));
                } else {
                    String str3 = r6.f51447F;
                    AnonymousClass33e.EDIT_PROFILE_START_STEP.m18380A().F("step", "change_category").F("entry_point", str3).F("fb_user_id", AnonymousClass0a2.I(r6.f51453L)).R();
                }
                if (r6.f51458Q) {
                    RegistrationFlowExtras F2 = AnonymousClass34H.m18397F(getArguments(), r6.f51446E);
                    r6.f51461T = F2;
                    AnonymousClass0LH.E(F2);
                }
                r6.f51463V = AnonymousClass36V.m18526B(r6.f51446E);
                AnonymousClass0cQ.G(r6, -2027644317, F);
            }
        }
        z = true;
        r6.f51458Q = z;
        r6.f51443B = AnonymousClass34H.m18394C(getArguments(), r6.f51446E);
        z = r6.f51465X.i();
        r6.f51445D = z;
        if (z) {
            J = AnonymousClass1gr.J(r6.f51453L, true);
            String str22 = r6.f51447F;
            if (AnonymousClass34H.m18398G(r6.f51446E)) {
                J = ((BusinessConversionActivity) r6.f51446E).X(J);
            }
            AnonymousClass33Z.m18351P(str, str22, J, AnonymousClass0a2.I(r6.f51453L));
        } else {
            String str32 = r6.f51447F;
            AnonymousClass33e.EDIT_PROFILE_START_STEP.m18380A().F("step", "change_category").F("entry_point", str32).F("fb_user_id", AnonymousClass0a2.I(r6.f51453L)).R();
        }
        if (r6.f51458Q) {
            RegistrationFlowExtras F22 = AnonymousClass34H.m18397F(getArguments(), r6.f51446E);
            r6.f51461T = F22;
            AnonymousClass0LH.E(F22);
        }
        r6.f51463V = AnonymousClass36V.m18526B(r6.f51446E);
        AnonymousClass0cQ.G(r6, -2027644317, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 704516406);
        View inflate = layoutInflater.inflate(C0164R.layout.choose_category_fragment, viewGroup, false);
        this.f51456O = (BusinessNavBar) inflate.findViewById(C0164R.id.navigation_bar);
        AnonymousClass0TK anonymousClass35j = new AnonymousClass35j(this, this.f51456O, C0164R.string.next, -1);
        this.f51444C = anonymousClass35j;
        registerLifecycleListener(anonymousClass35j);
        AnonymousClass0cQ.G(this, -824465946, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -2145091741);
        super.onDestroyView();
        unregisterLifecycleListener(this.f51444C);
        this.f51455N = null;
        this.f51454M = null;
        this.f51444C = null;
        this.f51456O = null;
        this.f51459R = null;
        this.f51464W = null;
        AnonymousClass0cQ.G(this, -526829496, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 418496123);
        super.onPause();
        AnonymousClass1Ee anonymousClass1Ee = this.f51455N.f47350C;
        if (anonymousClass1Ee != null) {
            anonymousClass1Ee.A();
        }
        anonymousClass1Ee = this.f51454M.f47338C;
        if (anonymousClass1Ee != null) {
            anonymousClass1Ee.A();
        }
        AnonymousClass0cQ.G(this, -1927178977, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        BusinessNavBar businessNavBar;
        AnonymousClass0IL anonymousClass0IL = this;
        super.onViewCreated(view, bundle);
        ((TextView) view.findViewById(C0164R.id.title)).setText(this.f51445D ? C0164R.string.change_category : C0164R.string.choose_category);
        ((TextView) view.findViewById(C0164R.id.subtitle)).setText(C0164R.string.choose_category_help_people_understand);
        BusinessCategorySelectionView businessCategorySelectionView = (BusinessCategorySelectionView) view.findViewById(C0164R.id.category_selection_view);
        this.f51455N = businessCategorySelectionView;
        businessCategorySelectionView.setDelegate(this);
        this.f51455N.m21692B();
        BusinessCategoryInlineSelectionView businessCategoryInlineSelectionView = (BusinessCategoryInlineSelectionView) view.findViewById(C0164R.id.category_inline_selection_view);
        this.f51454M = businessCategoryInlineSelectionView;
        businessCategoryInlineSelectionView.setDelegate(this);
        BusinessCategoryInlineSelectionView businessCategoryInlineSelectionView2 = this.f51454M;
        businessCategoryInlineSelectionView2.f47342G.setOnClickListener(new AnonymousClass35T(businessCategoryInlineSelectionView2));
        businessCategoryInlineSelectionView2.f47341F.setOnClickListener(new AnonymousClass35U(businessCategoryInlineSelectionView2));
        this.f51457P.m18513A("-1", AnonymousClass368.CATEGORY, anonymousClass0IL, this.f51453L, null);
        if (!anonymousClass0IL.f51445D) {
            if (AnonymousClass0a2.K(anonymousClass0IL.f51453L)) {
                if (TextUtils.isEmpty(anonymousClass0IL.f51449H)) {
                    AnonymousClass1gr.P(getContext(), anonymousClass0IL.f51453L, getLoaderManager(), new AnonymousClass4Ci(anonymousClass0IL));
                } else {
                    AnonymousClass4Cl.m23521D(anonymousClass0IL);
                }
                if (m23525H()) {
                    businessNavBar = anonymousClass0IL.f51456O;
                    if (businessNavBar != null) {
                        businessNavBar.m18468C(view.findViewById(C0164R.id.scroll_container), true);
                        anonymousClass0IL.f51456O.setVisibility(0);
                    }
                }
                if (anonymousClass0IL.f51463V && anonymousClass0IL.f51446E != null) {
                    StepperHeader stepperHeader = (StepperHeader) view.findViewById(C0164R.id.stepper_header);
                    anonymousClass0IL.f51464W = stepperHeader;
                    stepperHeader.setVisibility(0);
                    anonymousClass0IL.f51464W.A(anonymousClass0IL.f51446E.DG(), anonymousClass0IL.f51446E.dVA());
                    return;
                }
            }
        }
        AnonymousClass4Cl.m23519B(anonymousClass0IL);
        if (m23525H()) {
            businessNavBar = anonymousClass0IL.f51456O;
            if (businessNavBar != null) {
                businessNavBar.m18468C(view.findViewById(C0164R.id.scroll_container), true);
                anonymousClass0IL.f51456O.setVisibility(0);
            }
        }
        if (anonymousClass0IL.f51463V) {
        }
    }

    public final void pu() {
        AnonymousClass4Cl.m23522E(this);
    }

    public final void wl() {
        AnonymousClass4Cl.m23523F(this, false);
    }

    public final void xl() {
        AnonymousClass4Cl.m23523F(this, true);
    }

    public final void yl(AnonymousClass2Xw anonymousClass2Xw, AnonymousClass368 anonymousClass368, String str) {
        this.f51455N.setCategory(anonymousClass2Xw, anonymousClass368);
        this.f51454M.setCategory(anonymousClass2Xw, anonymousClass368);
    }
}

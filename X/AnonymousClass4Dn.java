package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.ui.BusinessCategorySelectionView;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.iig.components.stepperheader.StepperHeader;
import com.instagram.login.api.RegistrationFlowExtras;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;

/* renamed from: X.4Dn */
public final class AnonymousClass4Dn extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass369, AnonymousClass35Y, AnonymousClass35i, AnonymousClass36J, AnonymousClass36X, AnonymousClass0IT, AnonymousClass0Qd {
    /* renamed from: a */
    public static final String f51660a;
    /* renamed from: B */
    public boolean f51661B;
    /* renamed from: C */
    public BusinessCategorySelectionView f51662C;
    /* renamed from: D */
    public BusinessNavBar f51663D;
    /* renamed from: E */
    public AnonymousClass35j f51664E;
    /* renamed from: F */
    public boolean f51665F;
    /* renamed from: G */
    public AnonymousClass36A f51666G;
    /* renamed from: H */
    public AnonymousClass34I f51667H;
    /* renamed from: I */
    public String f51668I;
    /* renamed from: J */
    public final Handler f51669J = new AnonymousClass4Dd(this, Looper.getMainLooper());
    /* renamed from: K */
    public boolean f51670K;
    /* renamed from: L */
    public TextView f51671L;
    /* renamed from: M */
    public ImageView f51672M;
    /* renamed from: N */
    public View f51673N;
    /* renamed from: O */
    public View f51674O;
    /* renamed from: P */
    public View f51675P;
    /* renamed from: Q */
    public AnonymousClass0Cm f51676Q;
    /* renamed from: R */
    private boolean f51677R;
    /* renamed from: S */
    private String f51678S;
    /* renamed from: T */
    private final AnonymousClass0hj f51679T = new AnonymousClass0hj();
    /* renamed from: U */
    private EditText f51680U;
    /* renamed from: V */
    private final TextWatcher f51681V = new AnonymousClass4De(this);
    /* renamed from: W */
    private RegistrationFlowExtras f51682W;
    /* renamed from: X */
    private boolean f51683X;
    /* renamed from: Y */
    private StepperHeader f51684Y;
    /* renamed from: Z */
    private AnonymousClass0Ci f51685Z;

    public final void Cm(String str, String str2) {
    }

    public final void FH() {
    }

    public final void bG() {
    }

    public final String getModuleName() {
        return "page_creation";
    }

    public final void vl(String str, AnonymousClass368 anonymousClass368, String str2) {
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(AnonymousClass4Dn.class.getName());
        stringBuilder.append(".USER_OPTIONS_FRAGMENT_BACKSTATE_NAME");
        f51660a = stringBuilder.toString();
    }

    /* renamed from: B */
    public static void m23588B(X.AnonymousClass4Dn r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r8.f51680U;
        r0 = r0.getText();
        r4 = r0.toString();
        r0 = r8.f51662C;
        r3 = r0.getSubCategory();
        r0 = r8.f51662C;
        r2 = r0.getSelectedSubcategoryId();
        r5 = new X.351;
        r0 = r8.f51676Q;
        r1 = X.AnonymousClass0a2.I(r0);
        r0 = "instagram_creation_flow";
        r5.<init>(r1, r4, r2, r0);
        r1 = new X.352;
        r1.<init>(r5);
        r7 = new java.io.StringWriter;	 Catch:{ IOException -> 0x0098 }
        r7.<init>();	 Catch:{ IOException -> 0x0098 }
        r0 = X.AnonymousClass0Lm.f3274B;	 Catch:{ IOException -> 0x0098 }
        r6 = r0.createGenerator(r7);	 Catch:{ IOException -> 0x0098 }
        r6.writeStartObject();	 Catch:{ IOException -> 0x0098 }
        r0 = r1.f37649B;	 Catch:{ IOException -> 0x0098 }
        if (r0 == 0) goto L_0x006c;	 Catch:{ IOException -> 0x0098 }
    L_0x003a:
        r0 = "input";	 Catch:{ IOException -> 0x0098 }
        r6.writeFieldName(r0);	 Catch:{ IOException -> 0x0098 }
        r5 = r1.f37649B;	 Catch:{ IOException -> 0x0098 }
        r6.writeStartObject();	 Catch:{ IOException -> 0x0098 }
        r0 = r5.f37647C;	 Catch:{ IOException -> 0x0098 }
        if (r0 == 0) goto L_0x004f;	 Catch:{ IOException -> 0x0098 }
    L_0x0048:
        r1 = "name";	 Catch:{ IOException -> 0x0098 }
        r0 = r5.f37647C;	 Catch:{ IOException -> 0x0098 }
        r6.writeStringField(r1, r0);	 Catch:{ IOException -> 0x0098 }
    L_0x004f:
        r0 = r5.f37646B;	 Catch:{ IOException -> 0x0098 }
        if (r0 == 0) goto L_0x005a;	 Catch:{ IOException -> 0x0098 }
    L_0x0053:
        r1 = "category";	 Catch:{ IOException -> 0x0098 }
        r0 = r5.f37646B;	 Catch:{ IOException -> 0x0098 }
        r6.writeStringField(r1, r0);	 Catch:{ IOException -> 0x0098 }
    L_0x005a:
        r0 = r5.f37648D;	 Catch:{ IOException -> 0x0098 }
        if (r0 == 0) goto L_0x0065;	 Catch:{ IOException -> 0x0098 }
    L_0x005e:
        r1 = "ref";	 Catch:{ IOException -> 0x0098 }
        r0 = r5.f37648D;	 Catch:{ IOException -> 0x0098 }
        r6.writeStringField(r1, r0);	 Catch:{ IOException -> 0x0098 }
    L_0x0065:
        r0 = 0;	 Catch:{ IOException -> 0x0098 }
        X.AnonymousClass1kP.B(r6, r5, r0);	 Catch:{ IOException -> 0x0098 }
        r6.writeEndObject();	 Catch:{ IOException -> 0x0098 }
    L_0x006c:
        r6.writeEndObject();	 Catch:{ IOException -> 0x0098 }
        r6.close();	 Catch:{ IOException -> 0x0098 }
        r0 = r7.toString();	 Catch:{ IOException -> 0x0098 }
        r1 = new X.2Ae;
        r1.<init>(r0);
        r0 = r8.f51676Q;
        r0 = X.AnonymousClass0a2.B(r0);
        r0 = X.AnonymousClass1Dj.B(r0);
        r0 = r0.C(r1);
        r1 = r0.A();
        r0 = new X.4Dk;
        r0.<init>(r8, r4, r3, r2);
        r1.f2849B = r0;
        r8.schedule(r1);
        return;
    L_0x0098:
        r1 = new java.lang.IllegalArgumentException;
        r0 = "exception on generate create page mutation query string";
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.4Dn.B(X.4Dn):void");
    }

    public final void BCA(String str) {
        AnonymousClass4Dn.m23593G(this);
        String str2 = str;
        this.f51666G.m18513A(str2, AnonymousClass368.SUBCATEGORY, this, this.f51676Q, this.f51662C.getSuperCategory());
    }

    public final void Bx(String str, String str2) {
        AnonymousClass0IG.H(getContext(), str);
    }

    /* renamed from: C */
    public static void m23589C(AnonymousClass4Dn anonymousClass4Dn, String str, String str2, AnonymousClass2Xp anonymousClass2Xp, String str3) {
        String str4 = anonymousClass2Xp.f31201B.f31200C;
        AnonymousClass34H.m18406O(anonymousClass4Dn.f51667H, AnonymousClass33Y.m18328C(str, str3, null, null));
        if (!AnonymousClass4Dn.m23599M(anonymousClass4Dn, str4, str, str2)) {
            String str5 = anonymousClass2Xp.f31201B.f31199B.f31198B;
            if (!AnonymousClass4Dn.m23598L(anonymousClass4Dn, str4, str5, str, str2)) {
                if (!AnonymousClass4Dn.m23597K(anonymousClass4Dn, str4, str5, str, str2)) {
                }
            }
        }
    }

    /* renamed from: D */
    public static boolean m23590D(AnonymousClass4Dn anonymousClass4Dn) {
        return AnonymousClass34H.m18398G(anonymousClass4Dn.f51667H) && ((BusinessConversionActivity) anonymousClass4Dn.f51667H).f12402U;
    }

    public final void Dm(AnonymousClass2Xk anonymousClass2Xk, String str) {
        this.f51662C.m21691A(str, anonymousClass2Xk);
    }

    /* renamed from: E */
    public static void m23591E(AnonymousClass4Dn anonymousClass4Dn) {
        anonymousClass4Dn.f51669J.removeMessages(1);
        EditText editText = anonymousClass4Dn.f51680U;
        if (editText != null) {
            String obj = editText.getText().toString();
            AnonymousClass0GA A = AnonymousClass1Dj.B(AnonymousClass0a2.B(anonymousClass4Dn.f51676Q)).C(new AnonymousClass2Ai(StringFormatUtil.formatStrLocaleSafe("{\"%s\":\"%s\"}", "0", obj))).A();
            A.f2849B = new AnonymousClass4Di(anonymousClass4Dn, obj);
            anonymousClass4Dn.schedule(A);
        }
    }

    public final void Em(String str, String str2) {
        AnonymousClass0LH.E(this.f51682W);
        AnonymousClass33b.m18366H("create_page", this.f51668I, str);
        AnonymousClass365.m18510B(this.f51667H, getActivity(), this.f51669J, this.f51668I, AnonymousClass4Dn.m23594H(this, str2), this.f51682W);
    }

    public final void Ex() {
        AnonymousClass4Dn.m23592F(this, false);
    }

    /* renamed from: F */
    public static void m23592F(AnonymousClass4Dn anonymousClass4Dn, boolean z) {
        anonymousClass4Dn = anonymousClass4Dn.f51664E;
        if (anonymousClass4Dn == null) {
            return;
        }
        if (z) {
            anonymousClass4Dn.m18472B();
        } else {
            anonymousClass4Dn.m18471A();
        }
    }

    public final void Fm() {
        AnonymousClass4Dn.m23592F(this, false);
    }

    /* renamed from: G */
    public static void m23593G(AnonymousClass4Dn anonymousClass4Dn) {
        boolean z = (anonymousClass4Dn.f51680U.getText().length() == 0 || anonymousClass4Dn.f51662C.getSelectedSubcategoryId() == null || anonymousClass4Dn.f51671L.getVisibility() == 0) ? false : true;
        if (anonymousClass4Dn.f51664E != null) {
            anonymousClass4Dn.f51663D.setPrimaryButtonEnabled(z);
        }
    }

    public final void Gm() {
        AnonymousClass4Dn.m23592F(this, true);
    }

    /* renamed from: H */
    private static BusinessInfo m23594H(AnonymousClass4Dn anonymousClass4Dn, String str) {
        String str2;
        String str3;
        String str4;
        RegistrationFlowExtras registrationFlowExtras = anonymousClass4Dn.f51682W;
        String str5 = null;
        if (registrationFlowExtras == null || registrationFlowExtras.f27652E == null) {
            str2 = null;
        } else {
            str2 = anonymousClass4Dn.f51682W.f27652E.f28033C;
        }
        registrationFlowExtras = anonymousClass4Dn.f51682W;
        if (registrationFlowExtras == null) {
            str3 = null;
        } else {
            str3 = registrationFlowExtras.f27667T;
        }
        registrationFlowExtras = anonymousClass4Dn.f51682W;
        if (registrationFlowExtras == null) {
            str4 = null;
        } else {
            str4 = registrationFlowExtras.f27666S;
        }
        PublicPhoneContact publicPhoneContact = new PublicPhoneContact(str2, str3, str4, AnonymousClass2MA.f29500D.m15202A());
        registrationFlowExtras = anonymousClass4Dn.f51682W;
        if (registrationFlowExtras != null) {
            str5 = registrationFlowExtras.f27655H;
        }
        return new BusinessInfo(null, str5, publicPhoneContact, null, str);
    }

    public final void Hm(AnonymousClass2Em anonymousClass2Em, String str) {
        AnonymousClass0LH.E(this.f51682W);
        boolean D = AnonymousClass365.m18512D(anonymousClass2Em, this.f51682W);
        AnonymousClass33b.m18365G("create_page", this.f51668I, D ? AnonymousClass3X4.m19840E(this.f51682W) : null);
        if (D) {
            AnonymousClass365.m18511C(this.f51667H, getActivity(), this.f51669J, this.f51668I, AnonymousClass4Dn.m23594H(this, str), this.f51682W);
        } else {
            AnonymousClass365.m18510B(this.f51667H, getActivity(), this.f51669J, this.f51668I, AnonymousClass4Dn.m23594H(this, str), this.f51682W);
        }
    }

    /* renamed from: I */
    private static boolean m23595I(AnonymousClass4Dn anonymousClass4Dn) {
        return anonymousClass4Dn.f51676Q.B().i();
    }

    /* renamed from: J */
    private boolean m23596J() {
        if (!AnonymousClass34H.m18398G(this.f51667H)) {
            return false;
        }
        AnonymousClass33Z.m18340E("create_page", this.f51668I, null, AnonymousClass0a2.I(this.f51676Q));
        if (AnonymousClass4Dn.m23595I(this)) {
            ((BusinessConversionActivity) this.f51667H).W();
        }
        this.f51667H.XLA();
        return true;
    }

    public final void Jx() {
        AnonymousClass4Dn.m23592F(this, true);
    }

    public final void Jz() {
        m23604R();
    }

    /* renamed from: K */
    private static boolean m23597K(AnonymousClass4Dn anonymousClass4Dn, String str, String str2, String str3, String str4) {
        if (!anonymousClass4Dn.f51661B) {
            return false;
        }
        if (anonymousClass4Dn.getTargetFragment() instanceof AnonymousClass4D8) {
            AnonymousClass4D8 anonymousClass4D8 = (AnonymousClass4D8) anonymousClass4Dn.getTargetFragment();
            if (!TextUtils.isEmpty(str)) {
                anonymousClass4D8.f51531C = str;
            }
        }
        AnonymousClass33Z.m18349N(anonymousClass4Dn.f51668I, str3, str4, AnonymousClass0a2.I(anonymousClass4Dn.f51676Q));
        AnonymousClass4Dn.m23605S(anonymousClass4Dn, str, str2);
        return true;
    }

    /* renamed from: L */
    private static boolean m23598L(AnonymousClass4Dn anonymousClass4Dn, String str, String str2, String str3, String str4) {
        AnonymousClass4Dn anonymousClass4Dn2 = anonymousClass4Dn;
        if (!AnonymousClass34H.m18398G(anonymousClass4Dn.f51667H)) {
            return false;
        }
        if (anonymousClass4Dn.getTargetFragment() instanceof AnonymousClass4Da) {
            ((AnonymousClass4Da) anonymousClass4Dn.getTargetFragment()).f51610G = str;
        }
        AnonymousClass33Z.m18349N(anonymousClass4Dn.f51668I, str3, str4, AnonymousClass0a2.I(anonymousClass4Dn.f51676Q));
        String str5 = str2;
        if (AnonymousClass4Dn.m23595I(anonymousClass4Dn)) {
            AnonymousClass4Dn.m23605S(anonymousClass4Dn, str, str2);
            return true;
        }
        AnonymousClass0OR.D(anonymousClass4Dn2.f51669J, new AnonymousClass4Dl(anonymousClass4Dn2, AnonymousClass1gr.O(anonymousClass4Dn.f51667H.QJ(), str, anonymousClass4Dn.f51685Z.i()), str5, anonymousClass4Dn.f51680U.getText().toString(), str, anonymousClass4Dn2.f51662C.getSelectedSubcategoryId()), -1222830906);
        return true;
    }

    /* renamed from: M */
    private static boolean m23599M(AnonymousClass4Dn anonymousClass4Dn, String str, String str2, String str3) {
        AnonymousClass0IL anonymousClass0IL = anonymousClass4Dn;
        if (!anonymousClass4Dn.f51670K) {
            return false;
        }
        String str4 = str;
        if (anonymousClass4Dn.getTargetFragment() instanceof AnonymousClass4Da) {
            ((AnonymousClass4Da) anonymousClass4Dn.getTargetFragment()).f51610G = str;
        }
        AnonymousClass34I anonymousClass34I = anonymousClass4Dn.f51667H;
        if (anonymousClass34I != null) {
            ((BusinessConversionActivity) anonymousClass34I).a(AnonymousClass4Dn.m23594H(anonymousClass4Dn, str));
        }
        anonymousClass4Dn = "create_page";
        String str5 = str2;
        AnonymousClass36K.m18521B(anonymousClass0IL, anonymousClass0IL, anonymousClass4Dn.f51668I, str5, anonymousClass4Dn.f51682W.f27655H, str4, anonymousClass0IL, anonymousClass4Dn, AnonymousClass0a2.I(anonymousClass0IL.f51676Q));
        String str6 = anonymousClass0IL.f51668I;
        String I = AnonymousClass0a2.I(anonymousClass0IL.f51676Q);
        AnonymousClass0db C = AnonymousClass0db.C();
        C.G("page_name", str2);
        C.G("sub_category", str3);
        AnonymousClass33d.BUSINESS_SIGNUP_SUBMIT.m18377A().F("entry_point", str6).F("fb_user_id", I).F("step", anonymousClass4Dn).D("selected_values", C).R();
        return true;
    }

    /* renamed from: N */
    private static boolean m23600N(AnonymousClass4Dn anonymousClass4Dn) {
        if (!AnonymousClass34H.m18398G(anonymousClass4Dn.f51667H)) {
            return false;
        }
        AnonymousClass33Z.m18347L("create_page", anonymousClass4Dn.f51668I, (String) null, AnonymousClass0a2.I(anonymousClass4Dn.f51676Q));
        if (AnonymousClass4Dn.m23595I(anonymousClass4Dn)) {
            ((BusinessConversionActivity) anonymousClass4Dn.f51667H).Z();
        } else {
            anonymousClass4Dn.f51667H.NUA();
        }
        return true;
    }

    /* renamed from: O */
    private static boolean m23601O(AnonymousClass4Dn anonymousClass4Dn) {
        if (!anonymousClass4Dn.f51670K) {
            return false;
        }
        AnonymousClass33b.m18367I("create_page", anonymousClass4Dn.f51668I, null, AnonymousClass0a2.I(anonymousClass4Dn.f51676Q));
        AnonymousClass34I anonymousClass34I = anonymousClass4Dn.f51667H;
        if (anonymousClass34I != null) {
            anonymousClass34I.OUA(anonymousClass4Dn.f51682W.m14750G());
            return true;
        }
        AnonymousClass0IL J = AnonymousClass0Ir.f2848B.A().J(anonymousClass4Dn.f51668I, anonymousClass4Dn.getArguments().getString("edit_profile_entry"), null, null, null);
        Bundle G = anonymousClass4Dn.f51682W.m14750G();
        G.putString("entry_point", anonymousClass4Dn.f51668I);
        G.putString("business_signup", anonymousClass4Dn.f51678S);
        J.setArguments(G);
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass4Dn.getActivity());
        anonymousClass0IZ.f2754D = J;
        anonymousClass0IZ.B();
        return true;
    }

    /* renamed from: P */
    private boolean m23602P(String str) {
        if (!AnonymousClass34H.m18398G(this.f51667H)) {
            return false;
        }
        AnonymousClass0OR.D(this.f51669J, new AnonymousClass4Db(this, str), 1885044249);
        return true;
    }

    public final void Pf(String str, boolean z) {
        AnonymousClass0IJ anonymousClass0IJ = this;
        if (z) {
            this.f51666G.m18513A(str, AnonymousClass368.SUBCATEGORY, anonymousClass0IJ, this.f51676Q, this.f51662C.getSuperCategory());
        }
        AnonymousClass4Dn.m23593G(anonymousClass0IJ);
    }

    public final void Px(String str) {
        if (m23602P(str) || !m23603Q()) {
        }
    }

    /* renamed from: Q */
    private boolean m23603Q() {
        if (!this.f51661B) {
            return false;
        }
        AnonymousClass0OR.D(this.f51669J, new AnonymousClass4Dc(this), 66669848);
        return true;
    }

    /* renamed from: R */
    private void m23604R() {
        if (AnonymousClass4Dn.m23601O(this) || !AnonymousClass4Dn.m23600N(this)) {
        }
    }

    /* renamed from: S */
    private static void m23605S(AnonymousClass4Dn anonymousClass4Dn, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        AnonymousClass36Y.m18527B(str3, str4, AnonymousClass0a2.B(anonymousClass4Dn.f51676Q), anonymousClass4Dn, anonymousClass4Dn.f51676Q, anonymousClass4Dn);
    }

    public final void Sp(int i, boolean z) {
        BusinessNavBar businessNavBar = this.f51663D;
        int height = businessNavBar == null ? 0 : businessNavBar.getHeight();
        View currentFocus = getActivity().getCurrentFocus();
        if (currentFocus != null) {
            int[] iArr = new int[2];
            currentFocus.getLocationInWindow(iArr);
            if (i > 0) {
                int I = (AnonymousClass0Nm.I(getContext()) - iArr[1]) - currentFocus.getHeight();
                currentFocus = this.f51674O;
                if (currentFocus != null) {
                    i += height;
                    if (I < i) {
                        currentFocus.postDelayed(new AnonymousClass4Dm(this, i - I), 300);
                    }
                }
            }
        }
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.c(AnonymousClass4Dn.m23595I(this) ? C0164R.drawable.instagram_x_outline_24 : C0164R.drawable.instagram_arrow_back_24, new AnonymousClass4Dg(this));
        AnonymousClass4Dn.m23593G(this);
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f51667H = AnonymousClass34H.m18393B(getActivity());
    }

    public final boolean onBackPressed() {
        if (getArguments().getBoolean("from_null_state")) {
            getFragmentManager().N(AnonymousClass4Da.f51604g, 1);
        }
        if (!this.f51670K) {
            return m23596J();
        }
        AnonymousClass33b.m18364F("create_page", this.f51668I, null, AnonymousClass0a2.I(this.f51676Q));
        AnonymousClass34I anonymousClass34I = this.f51667H;
        if (anonymousClass34I == null) {
            return false;
        }
        anonymousClass34I.XLA();
        return true;
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        AnonymousClass0IL anonymousClass0IL = this;
        int F = AnonymousClass0cQ.F(this, 715243132);
        super.onCreate(bundle);
        AnonymousClass0Cm G = AnonymousClass0Ce.G(getArguments());
        this.f51676Q = G;
        this.f51685Z = G.B();
        this.f51668I = getArguments().getString("entry_point");
        this.f51678S = getArguments().getString("business_signup");
        this.f51661B = getArguments().getBoolean("business_profile_edit_entry", false);
        this.f51677R = ((Boolean) AnonymousClass0CC.sC.H(this.f51676Q)).booleanValue();
        boolean z2 = true;
        if (!TextUtils.equals("business_signup_flow", this.f51678S)) {
            if (!AnonymousClass34H.m18399H(this.f51667H)) {
                z = false;
                this.f51670K = z;
                if (this.f51677R) {
                    if ((this.f51670K || !((Boolean) AnonymousClass0CC.DD.H(this.f51676Q)).booleanValue()) && !(this.f51670K && ((Boolean) AnonymousClass0CC.CD.H(this.f51676Q)).booleanValue())) {
                        if (AnonymousClass34H.m18398G(this.f51667H) && ((BusinessConversionActivity) this.f51667H).f12402U) {
                        }
                    }
                    this.f51665F = z2;
                    if (this.f51670K) {
                        this.f51682W = AnonymousClass34H.m18397F(getArguments(), this.f51667H);
                        AnonymousClass33b.m18370L("create_page", this.f51668I, null, AnonymousClass0a2.I(this.f51676Q));
                        AnonymousClass0LH.E(this.f51682W);
                    }
                    anonymousClass0IL.f51666G = new AnonymousClass36A(anonymousClass0IL, "create_page", this.f51668I, AnonymousClass34H.m18395D(this.f51667H), AnonymousClass34H.m18396E(anonymousClass0IL.f51667H));
                    anonymousClass0IL.f51666G.m18513A("-1", AnonymousClass368.CATEGORY, anonymousClass0IL, anonymousClass0IL.f51676Q, null);
                    anonymousClass0IL.f51679T.A(anonymousClass0IL);
                    anonymousClass0IL.f51683X = AnonymousClass36V.m18526B(anonymousClass0IL.f51667H);
                    AnonymousClass0cQ.G(anonymousClass0IL, -121406475, F);
                }
                z2 = false;
                this.f51665F = z2;
                if (this.f51670K) {
                    this.f51682W = AnonymousClass34H.m18397F(getArguments(), this.f51667H);
                    AnonymousClass33b.m18370L("create_page", this.f51668I, null, AnonymousClass0a2.I(this.f51676Q));
                    AnonymousClass0LH.E(this.f51682W);
                }
                anonymousClass0IL.f51666G = new AnonymousClass36A(anonymousClass0IL, "create_page", this.f51668I, AnonymousClass34H.m18395D(this.f51667H), AnonymousClass34H.m18396E(anonymousClass0IL.f51667H));
                anonymousClass0IL.f51666G.m18513A("-1", AnonymousClass368.CATEGORY, anonymousClass0IL, anonymousClass0IL.f51676Q, null);
                anonymousClass0IL.f51679T.A(anonymousClass0IL);
                anonymousClass0IL.f51683X = AnonymousClass36V.m18526B(anonymousClass0IL.f51667H);
                AnonymousClass0cQ.G(anonymousClass0IL, -121406475, F);
            }
        }
        z = true;
        this.f51670K = z;
        if (this.f51677R) {
            this.f51665F = z2;
            if (this.f51670K) {
                this.f51682W = AnonymousClass34H.m18397F(getArguments(), this.f51667H);
                AnonymousClass33b.m18370L("create_page", this.f51668I, null, AnonymousClass0a2.I(this.f51676Q));
                AnonymousClass0LH.E(this.f51682W);
            }
            anonymousClass0IL.f51666G = new AnonymousClass36A(anonymousClass0IL, "create_page", this.f51668I, AnonymousClass34H.m18395D(this.f51667H), AnonymousClass34H.m18396E(anonymousClass0IL.f51667H));
            anonymousClass0IL.f51666G.m18513A("-1", AnonymousClass368.CATEGORY, anonymousClass0IL, anonymousClass0IL.f51676Q, null);
            anonymousClass0IL.f51679T.A(anonymousClass0IL);
            anonymousClass0IL.f51683X = AnonymousClass36V.m18526B(anonymousClass0IL.f51667H);
            AnonymousClass0cQ.G(anonymousClass0IL, -121406475, F);
        }
        z2 = false;
        this.f51665F = z2;
        if (this.f51670K) {
            this.f51682W = AnonymousClass34H.m18397F(getArguments(), this.f51667H);
            AnonymousClass33b.m18370L("create_page", this.f51668I, null, AnonymousClass0a2.I(this.f51676Q));
            AnonymousClass0LH.E(this.f51682W);
        }
        anonymousClass0IL.f51666G = new AnonymousClass36A(anonymousClass0IL, "create_page", this.f51668I, AnonymousClass34H.m18395D(this.f51667H), AnonymousClass34H.m18396E(anonymousClass0IL.f51667H));
        anonymousClass0IL.f51666G.m18513A("-1", AnonymousClass368.CATEGORY, anonymousClass0IL, anonymousClass0IL.f51676Q, null);
        anonymousClass0IL.f51679T.A(anonymousClass0IL);
        anonymousClass0IL.f51683X = AnonymousClass36V.m18526B(anonymousClass0IL.f51667H);
        AnonymousClass0cQ.G(anonymousClass0IL, -121406475, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object obj;
        int i;
        int i2;
        AnonymousClass0TK anonymousClass35j;
        int F = AnonymousClass0cQ.F(this, -89554144);
        View inflate = layoutInflater.inflate(C0164R.layout.page_creation_fragment, viewGroup, false);
        this.f51663D = (BusinessNavBar) inflate.findViewById(C0164R.id.navigation_bar);
        BusinessNavBar businessNavBar = this.f51663D;
        if (!this.f51661B && AnonymousClass4Dn.m23590D(this)) {
            if (!AnonymousClass34H.m18398G(this.f51667H) || this.f51667H.KHA() != null) {
                obj = null;
                i = obj == null ? C0164R.string.done : C0164R.string.next;
                i2 = (this.f51665F || this.f51661B) ? -1 : C0164R.string.skip;
                anonymousClass35j = new AnonymousClass35j(this, businessNavBar, i, i2);
                this.f51664E = anonymousClass35j;
                registerLifecycleListener(anonymousClass35j);
                AnonymousClass0cQ.G(this, -1287437226, F);
                return inflate;
            }
        }
        obj = 1;
        if (obj == null) {
        }
        if (this.f51665F) {
        }
        anonymousClass35j = new AnonymousClass35j(this, businessNavBar, i, i2);
        this.f51664E = anonymousClass35j;
        registerLifecycleListener(anonymousClass35j);
        AnonymousClass0cQ.G(this, -1287437226, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 1878176318);
        super.onDestroyView();
        this.f51679T.D(this);
        this.f51671L = null;
        this.f51680U = null;
        this.f51672M = null;
        this.f51673N = null;
        this.f51675P = null;
        this.f51662C = null;
        unregisterLifecycleListener(this.f51664E);
        this.f51664E = null;
        this.f51663D = null;
        this.f51674O = null;
        this.f51684Y = null;
        AnonymousClass0cQ.G(this, 887914396, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -1700131283);
        super.onPause();
        AnonymousClass0Nm.N(getView());
        Z().getWindow().setSoftInputMode(48);
        AnonymousClass0cQ.G(this, 895492883, F);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, 2038993487);
        super.onStart();
        this.f51679T.B((Activity) getContext());
        Z().getWindow().setSoftInputMode(16);
        AnonymousClass0cQ.G(this, 1207177986, F);
    }

    public final void onStop() {
        int F = AnonymousClass0cQ.F(this, 1430312790);
        super.onStop();
        AnonymousClass0Nm.N(getView());
        this.f51679T.C();
        AnonymousClass0cQ.G(this, -32959539, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((TextView) view.findViewById(C0164R.id.title)).setText(C0164R.string.create_your_page);
        ((TextView) view.findViewById(C0164R.id.subtitle)).setText(C0164R.string.choose_title_and_category);
        this.f51674O = view.findViewById(C0164R.id.scroll_view);
        BusinessNavBar businessNavBar = this.f51663D;
        if (businessNavBar != null) {
            businessNavBar.setVisibility(0);
        }
        ((TextView) view.findViewById(C0164R.id.page_title_section_label)).getPaint().setFakeBoldText(true);
        this.f51671L = (TextView) view.findViewById(C0164R.id.page_title_error);
        this.f51672M = (ImageView) view.findViewById(C0164R.id.title_check_indicator);
        this.f51673N = view.findViewById(C0164R.id.title_spinner);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(C0164R.id.page_title_edit_container);
        EditText editText = (EditText) view.findViewById(C0164R.id.page_title_edit);
        this.f51680U = editText;
        editText.setText(this.f51685Z.f1757z);
        this.f51680U.addTextChangedListener(this.f51681V);
        this.f51680U.setOnFocusChangeListener(new AnonymousClass4Df(this, viewGroup));
        this.f51675P = view.findViewById(C0164R.id.page_title_error_divider);
        ((TextView) view.findViewById(C0164R.id.page_category_section_label)).getPaint().setFakeBoldText(true);
        BusinessCategorySelectionView businessCategorySelectionView = (BusinessCategorySelectionView) view.findViewById(C0164R.id.category_selection_view);
        this.f51662C = businessCategorySelectionView;
        businessCategorySelectionView.setDelegate(this);
        this.f51662C.m21692B();
        AnonymousClass4Dn.m23591E(this);
        if (this.f51683X && this.f51667H != null) {
            StepperHeader stepperHeader = (StepperHeader) view.findViewById(C0164R.id.stepper_header);
            this.f51684Y = stepperHeader;
            stepperHeader.setVisibility(0);
            this.f51684Y.A(this.f51667H.DG(), this.f51667H.dVA());
        }
    }

    public final void pu() {
        if (AnonymousClass0FO.P(this.f51676Q)) {
            AnonymousClass4Dn.m23588B(this);
        } else {
            AnonymousClass0FO.W(this.f51676Q, new AnonymousClass4Dh(this));
        }
    }

    public final void wl() {
        AnonymousClass4Dn.m23592F(this, false);
    }

    public final void xl() {
        AnonymousClass4Dn.m23592F(this, true);
    }

    public final void yl(AnonymousClass2Xw anonymousClass2Xw, AnonymousClass368 anonymousClass368, String str) {
        this.f51662C.setCategory(anonymousClass2Xw, anonymousClass368);
    }
}

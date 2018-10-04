package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.login.api.RegistrationFlowExtras;
import com.instagram.model.business.BusinessInfo;
import com.instagram.nux.ui.NotificationBar;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.4C7 */
public final class AnonymousClass4C7 extends AnonymousClass0IJ implements AnonymousClass3TC, AnonymousClass3XE, AnonymousClass0IS, AnonymousClass35s {
    /* renamed from: B */
    public BusinessInfo f51325B;
    /* renamed from: C */
    public AnonymousClass3XF f51326C;
    /* renamed from: D */
    public String f51327D;
    /* renamed from: E */
    public final Handler f51328E = new Handler();
    /* renamed from: F */
    public InlineErrorMessageView f51329F;
    /* renamed from: G */
    public ProgressButton f51330G;
    /* renamed from: H */
    public NotificationBar f51331H;
    /* renamed from: I */
    public AnonymousClass0Oh f51332I;
    /* renamed from: J */
    public RegistrationFlowExtras f51333J;
    /* renamed from: K */
    public String f51334K;
    /* renamed from: L */
    public AnonymousClass0Cm f51335L;
    /* renamed from: M */
    public SearchEditText f51336M;
    /* renamed from: N */
    public final Runnable f51337N = new AnonymousClass4C2(this);
    /* renamed from: O */
    public boolean f51338O = false;
    /* renamed from: P */
    private AnonymousClass34I f51339P;
    /* renamed from: Q */
    private final AnonymousClass0F8 f51340Q = new AnonymousClass4C3(this);
    /* renamed from: R */
    private AnonymousClass0ks f51341R;
    /* renamed from: S */
    private AnonymousClass235 f51342S;

    public final void Bv(boolean z) {
    }

    public final void FH() {
    }

    public final void bG() {
    }

    public final String getModuleName() {
        return "business_edit_username";
    }

    public final void AUA(String str, AnonymousClass22w anonymousClass22w) {
        if (AnonymousClass4C6.f51324B[anonymousClass22w.ordinal()] == 1) {
            this.f51329F.m20526B(str);
            this.f51331H.m19931A();
        }
    }

    /* renamed from: B */
    public static void m23508B(AnonymousClass4C7 anonymousClass4C7) {
        if (!anonymousClass4C7.f51336M.C()) {
            AnonymousClass0GA B = AnonymousClass1fh.B(anonymousClass4C7.f51335L, anonymousClass4C7.f51336M.getText().toString());
            B.f2849B = new AnonymousClass4C5(anonymousClass4C7);
            anonymousClass4C7.schedule(B);
        }
    }

    public final AnonymousClass0Oh DM() {
        return this.f51332I;
    }

    public final void Gb(String str) {
        String str2 = "edit_username";
        String str3 = str;
        AnonymousClass33b.m18371M(str2, this.f51327D, this.f51334K, this.f51325B.f27751K, this.f51333J.f27666S, this.f51333J.f27655H, this.f51325B.f27749I, null, this.f51335L.f1759C, str3, AnonymousClass0a2.I(this.f51335L));
        AnonymousClass33b.m18362D(str2, this.f51327D, this.f51334K, this.f51325B.f27751K, this.f51333J.f27666S, this.f51333J.f27655H, this.f51325B.f27749I, null, this.f51335L.f1759C, str3, AnonymousClass0a2.I(this.f51335L));
    }

    public final void Hb(String str, String str2) {
        String str3 = "edit_username";
        String str4 = str;
        String str5 = str2;
        AnonymousClass33b.m18372N(str3, this.f51327D, this.f51325B.f27751K, this.f51333J.f27666S, this.f51333J.f27655H, this.f51325B.f27749I, null, str4, str5, AnonymousClass0a2.I(this.f51335L));
        AnonymousClass33b.m18363E(str3, this.f51327D, this.f51325B.f27751K, this.f51333J.f27666S, this.f51333J.f27655H, this.f51325B.f27749I, null, str4, str5, AnonymousClass0a2.I(this.f51335L));
    }

    public final AnonymousClass2Na IS() {
        return AnonymousClass2Na.USERNAME_CHANGE_STEP;
    }

    public final void Jx() {
        this.f51326C.m19859C();
        this.f51336M.setEnabled(false);
    }

    public final boolean KY() {
        return this.f51338O;
    }

    public final void ms() {
        AnonymousClass0IJ anonymousClass0IJ = this;
        AnonymousClass0OR.G(this.f51328E, this.f51337N, -2030270627);
        if (!this.f51333J.f27658K) {
            if (!AnonymousClass3Q9.m19589B().f41078I) {
                AnonymousClass35t.m18503C(this.f51335L, AnonymousClass0Nm.K(this.f51336M), anonymousClass0IJ, this.f51333J, this.f51328E, this.f51332I, this.f51325B, anonymousClass0IJ, anonymousClass0IJ, false);
                return;
            }
        }
        AnonymousClass3Q9.m19589B().m19591B(this.f51325B);
        AnonymousClass3Q9.m19589B().m19590A(this.f51327D);
        AnonymousClass3Q9.m19589B().m19592C("edit_username");
        AnonymousClass3Q9.m19589B().m19595F(true);
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(getActivity());
        anonymousClass0IZ.f2754D = AnonymousClass0Jr.f2946B.A().A(AnonymousClass1QC.UNKNOWN, AnonymousClass3Q8.NEW_USER, true).yQA(this.f51333J).xQA(this.f51336M.getText().toString(), this.f51334K, this.f51333J.m14746C(), AnonymousClass2Na.USERNAME_CHANGE_STEP).DD();
        anonymousClass0IZ.f2752B = AnonymousClass3Q6.f41057E;
        anonymousClass0IZ.B();
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f51339P = AnonymousClass34H.m18393B(getActivity());
    }

    public final boolean onBackPressed() {
        AnonymousClass33b.m18364F("edit_username", this.f51327D, null, AnonymousClass0a2.I(this.f51335L));
        AnonymousClass34I anonymousClass34I = this.f51339P;
        if (anonymousClass34I == null) {
            return false;
        }
        anonymousClass34I.XLA();
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -957085026);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        AnonymousClass0Cm G = AnonymousClass0Ce.G(arguments);
        this.f51335L = G;
        AnonymousClass0LH.E(G);
        this.f51327D = arguments.getString("entry_point");
        AnonymousClass0TK anonymousClass235 = new AnonymousClass235(getActivity());
        this.f51342S = anonymousClass235;
        registerLifecycleListener(anonymousClass235);
        RegistrationFlowExtras F2 = AnonymousClass34H.m18397F(arguments, this.f51339P);
        this.f51333J = F2;
        AnonymousClass0LH.E(F2);
        BusinessInfo C = AnonymousClass34H.m18394C(arguments, this.f51339P);
        this.f51325B = C;
        AnonymousClass0LH.E(C);
        this.f51332I = this.f51333J.m14746C();
        AnonymousClass0TK B = AnonymousClass0kr.B(getActivity());
        this.f51341R = B;
        registerLifecycleListener(B);
        CharSequence E = AnonymousClass3X4.m19840E(this.f51333J);
        this.f51334K = E;
        if (!TextUtils.isEmpty(E)) {
            this.f51338O = true;
        }
        AnonymousClass3Q4.m19584B(getContext(), this.f51335L);
        AnonymousClass33b.m18370L("edit_username", this.f51327D, null, AnonymousClass0a2.I(this.f51335L));
        AnonymousClass0F4.f2058E.A(AnonymousClass4qu.class, this.f51340Q);
        AnonymousClass0cQ.G(this, 874936208, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        AnonymousClass0TK anonymousClass3XF;
        int F = AnonymousClass0cQ.F(this, -746113666);
        View inflate = layoutInflater.inflate(C0164R.layout.reg_container, viewGroup, false);
        layoutInflater.inflate(C0164R.layout.business_edit_username_fragment, (ViewGroup) inflate.findViewById(C0164R.id.content_container), true);
        this.f51331H = (NotificationBar) inflate.findViewById(C0164R.id.notification_bar);
        this.f51329F = (InlineErrorMessageView) inflate.findViewById(C0164R.id.username_inline_error);
        SearchEditText searchEditText = (SearchEditText) inflate.findViewById(C0164R.id.username_edittext);
        this.f51336M = searchEditText;
        searchEditText.setAllowTextSelection(true);
        this.f51336M.setText(this.f51334K);
        this.f51336M.addTextChangedListener(new AnonymousClass4C4(this));
        this.f51330G = (ProgressButton) inflate.findViewById(C0164R.id.done_button);
        TextView textView = this.f51336M;
        ProgressButton progressButton = this.f51330G;
        if (!this.f51333J.f27658K) {
            if (!AnonymousClass3Q9.m19589B().f41078I) {
                i = C0164R.string.done;
                anonymousClass3XF = new AnonymousClass3XF(this, textView, progressButton, i);
                this.f51326C = anonymousClass3XF;
                registerLifecycleListener(anonymousClass3XF);
                AnonymousClass3X4.m19849N(getContext(), (TextView) inflate.findViewById(C0164R.id.business_sign_up_terms_footer), this.f51333J.f27671X);
                AnonymousClass0cQ.G(this, -407229501, F);
                return inflate;
            }
        }
        i = C0164R.string.next;
        anonymousClass3XF = new AnonymousClass3XF(this, textView, progressButton, i);
        this.f51326C = anonymousClass3XF;
        registerLifecycleListener(anonymousClass3XF);
        AnonymousClass3X4.m19849N(getContext(), (TextView) inflate.findViewById(C0164R.id.business_sign_up_terms_footer), this.f51333J.f27671X);
        AnonymousClass0cQ.G(this, -407229501, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, 1232859609);
        super.onDestroy();
        AnonymousClass0F4.f2058E.D(AnonymousClass4qu.class, this.f51340Q);
        unregisterLifecycleListener(this.f51342S);
        unregisterLifecycleListener(this.f51341R);
        this.f51342S = null;
        this.f51341R = null;
        AnonymousClass0cQ.G(this, 179892166, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 1983340763);
        super.onDestroyView();
        unregisterLifecycleListener(this.f51326C);
        this.f51331H = null;
        this.f51329F = null;
        this.f51336M = null;
        this.f51330G = null;
        this.f51326C = null;
        AnonymousClass0cQ.G(this, 429075727, F);
    }

    public final void xw() {
        this.f51326C.m19858B();
        this.f51336M.setEnabled(true);
    }
}

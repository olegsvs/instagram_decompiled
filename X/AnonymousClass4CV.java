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
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.login.api.RegistrationFlowExtras;
import com.instagram.model.business.BusinessInfo;
import com.instagram.nux.ui.NotificationBar;

/* renamed from: X.4CV */
public final class AnonymousClass4CV extends AnonymousClass0IJ implements AnonymousClass3TC, AnonymousClass0IS, AnonymousClass35i, AnonymousClass35s {
    /* renamed from: B */
    public BusinessInfo f51398B;
    /* renamed from: C */
    public BusinessNavBar f51399C;
    /* renamed from: D */
    public AnonymousClass35j f51400D;
    /* renamed from: E */
    public AnonymousClass0Oh f51401E;
    /* renamed from: F */
    public Handler f51402F;
    /* renamed from: G */
    public RegistrationFlowExtras f51403G;
    /* renamed from: H */
    public AnonymousClass0Cm f51404H;
    /* renamed from: I */
    public String f51405I;
    /* renamed from: J */
    private AnonymousClass34I f51406J;
    /* renamed from: K */
    private final AnonymousClass0F8 f51407K = new AnonymousClass4CU(this);
    /* renamed from: L */
    private String f51408L;
    /* renamed from: M */
    private AnonymousClass0ks f51409M;
    /* renamed from: N */
    private AnonymousClass235 f51410N;
    /* renamed from: O */
    private NotificationBar f51411O;

    public final String getModuleName() {
        return "business_signup_confirmation";
    }

    public final void AUA(String str, AnonymousClass22w anonymousClass22w) {
        NotificationBar notificationBar = this.f51411O;
        int C = AnonymousClass0Ca.C(notificationBar.getContext(), C0164R.color.white);
        if (notificationBar.f42174C == AnonymousClass3YA.HIDDEN) {
            notificationBar.f42174C = AnonymousClass3YA.SHOWING_TRANSIENT;
            NotificationBar.m19929C(notificationBar, str, C0164R.color.red_5, C);
            notificationBar.postDelayed(notificationBar.f42173B, 3000);
        }
    }

    /* renamed from: B */
    private void m23518B() {
        AnonymousClass33b.m18373O("welcome_user", this.f51408L, "change_username", null, null, AnonymousClass0a2.I(this.f51404H));
        AnonymousClass34I anonymousClass34I = this.f51406J;
        if (anonymousClass34I != null) {
            anonymousClass34I.gb(this.f51403G.m14750G(), ConversionStep.EDIT_USERNAME, true);
            return;
        }
        AnonymousClass0IL C = AnonymousClass0Ir.f2848B.A().C(this.f51408L, this.f51398B, this.f51403G.m14750G());
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(getActivity());
        anonymousClass0IZ.f2754D = C;
        anonymousClass0IZ.B();
    }

    public final void FH() {
        this.f51399C.setPrimaryButtonEnabled(true);
    }

    public final void Gb(String str) {
        String str2 = "welcome_user";
        String str3 = str;
        AnonymousClass33b.m18371M(str2, this.f51408L, this.f51405I, this.f51398B.f27751K, this.f51403G.f27666S, this.f51403G.f27655H, this.f51398B.f27749I, null, this.f51404H.f1759C, str3, AnonymousClass0a2.I(this.f51404H));
        AnonymousClass33b.m18362D(str2, this.f51408L, this.f51405I, this.f51398B.f27751K, this.f51403G.f27666S, this.f51403G.f27655H, this.f51398B.f27749I, null, this.f51404H.f1759C, str3, AnonymousClass0a2.I(this.f51404H));
    }

    public final void Hb(String str, String str2) {
        String str3 = "welcome_user";
        String str4 = str;
        String str5 = str2;
        AnonymousClass33b.m18372N(str3, this.f51408L, this.f51398B.f27751K, this.f51403G.f27666S, this.f51403G.f27655H, this.f51398B.f27749I, null, str4, str5, AnonymousClass0a2.I(this.f51404H));
        AnonymousClass33b.m18363E(str3, this.f51408L, this.f51398B.f27751K, this.f51403G.f27666S, this.f51403G.f27655H, this.f51398B.f27749I, null, str4, str5, AnonymousClass0a2.I(this.f51404H));
    }

    public final void Jx() {
        this.f51400D.m18472B();
    }

    public final void Jz() {
        m23518B();
    }

    public final void bG() {
        this.f51399C.setPrimaryButtonEnabled(false);
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f51406J = AnonymousClass34H.m18393B(getActivity());
    }

    public final boolean onBackPressed() {
        AnonymousClass33b.m18364F("welcome_user", this.f51408L, null, AnonymousClass0a2.I(this.f51404H));
        AnonymousClass34I anonymousClass34I = this.f51406J;
        if (anonymousClass34I == null) {
            return false;
        }
        anonymousClass34I.XLA();
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 297023132);
        super.onCreate(bundle);
        this.f51402F = new Handler();
        Bundle arguments = getArguments();
        this.f51403G = AnonymousClass34H.m18397F(arguments, this.f51406J);
        AnonymousClass0Cm G = AnonymousClass0Ce.G(arguments);
        this.f51404H = G;
        AnonymousClass0LH.E(G);
        this.f51398B = AnonymousClass34H.m18394C(arguments, this.f51406J);
        this.f51408L = arguments.getString("entry_point");
        AnonymousClass33b.m18370L("welcome_user", this.f51408L, null, AnonymousClass0a2.I(this.f51404H));
        AnonymousClass0LH.E(this.f51398B);
        AnonymousClass0LH.E(this.f51403G);
        this.f51405I = AnonymousClass3X4.m19840E(this.f51403G);
        if (this.f51403G.f27655H != null) {
            this.f51401E = AnonymousClass0Oh.EMAIL;
        } else if (!(TextUtils.isEmpty(this.f51403G.f27666S) && TextUtils.isEmpty(this.f51403G.f27667T))) {
            this.f51401E = AnonymousClass0Oh.PHONE;
        }
        AnonymousClass3Q4.m19584B(getContext(), this.f51404H);
        this.f51403G.m14749F(this.f51401E);
        AnonymousClass0TK anonymousClass235 = new AnonymousClass235(getActivity());
        this.f51410N = anonymousClass235;
        registerLifecycleListener(anonymousClass235);
        AnonymousClass0TK B = AnonymousClass0kr.B(getActivity());
        this.f51409M = B;
        registerLifecycleListener(B);
        AnonymousClass0F4.f2058E.A(AnonymousClass4qu.class, this.f51407K);
        AnonymousClass0cQ.G(this, -50166379, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        AnonymousClass0TK anonymousClass35j;
        int F = AnonymousClass0cQ.F(this, 309685315);
        View inflate = layoutInflater.inflate(C0164R.layout.reg_container, viewGroup, false);
        layoutInflater.inflate(C0164R.layout.business_reg_confirmation_fragment, (ViewGroup) inflate.findViewById(C0164R.id.content_container), true);
        this.f51411O = (NotificationBar) inflate.findViewById(C0164R.id.notification_bar);
        TextView textView = (TextView) inflate.findViewById(C0164R.id.field_title);
        TextView textView2 = (TextView) inflate.findViewById(C0164R.id.field_detail);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getString(C0164R.string.business_signup_welcome_user_title));
        stringBuilder.append(" ");
        stringBuilder.append(AnonymousClass3X4.m19840E(this.f51403G));
        textView.setText(stringBuilder.toString());
        textView2.setText(getString(C0164R.string.business_signup_welcome_user_desc));
        this.f51399C = (BusinessNavBar) inflate.findViewById(C0164R.id.business_sign_up_nav_bar);
        BusinessNavBar businessNavBar = this.f51399C;
        if (!this.f51403G.f27658K) {
            if (!AnonymousClass3Q9.m19589B().f41078I) {
                i = C0164R.string.done;
                anonymousClass35j = new AnonymousClass35j(this, businessNavBar, i, C0164R.string.business_signup_change_username);
                this.f51400D = anonymousClass35j;
                registerLifecycleListener(anonymousClass35j);
                AnonymousClass3X4.m19849N(getContext(), (TextView) inflate.findViewById(C0164R.id.business_sign_up_terms_footer), this.f51403G.f27671X);
                AnonymousClass0cQ.G(this, 729320343, F);
                return inflate;
            }
        }
        i = C0164R.string.next;
        anonymousClass35j = new AnonymousClass35j(this, businessNavBar, i, C0164R.string.business_signup_change_username);
        this.f51400D = anonymousClass35j;
        registerLifecycleListener(anonymousClass35j);
        AnonymousClass3X4.m19849N(getContext(), (TextView) inflate.findViewById(C0164R.id.business_sign_up_terms_footer), this.f51403G.f27671X);
        AnonymousClass0cQ.G(this, 729320343, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, 13816333);
        super.onDestroy();
        AnonymousClass0F4.f2058E.D(AnonymousClass4qu.class, this.f51407K);
        unregisterLifecycleListener(this.f51410N);
        unregisterLifecycleListener(this.f51409M);
        this.f51410N = null;
        this.f51409M = null;
        AnonymousClass0cQ.G(this, 410096484, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -593129485);
        super.onDestroyView();
        unregisterLifecycleListener(this.f51400D);
        this.f51399C = null;
        this.f51400D = null;
        AnonymousClass0cQ.G(this, -1378657902, F);
    }

    public final void pu() {
        AnonymousClass0IJ anonymousClass0IJ = this;
        if (!this.f51403G.f27658K) {
            if (!AnonymousClass3Q9.m19589B().f41078I) {
                AnonymousClass35t.m18503C(this.f51404H, this.f51405I, anonymousClass0IJ, this.f51403G, this.f51402F, this.f51401E, this.f51398B, anonymousClass0IJ, anonymousClass0IJ, false);
                return;
            }
        }
        AnonymousClass3Q9.m19589B().m19591B(this.f51398B);
        AnonymousClass3Q9.m19589B().m19590A(this.f51408L);
        AnonymousClass3Q9.m19589B().m19592C("welcome_user");
        AnonymousClass3Q9.m19589B().m19595F(true);
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(getActivity());
        AnonymousClass3Q7 yQA = AnonymousClass0Jr.f2946B.A().A(AnonymousClass1QC.UNKNOWN, AnonymousClass3Q8.NEW_USER, true).yQA(this.f51403G);
        String str = this.f51405I;
        anonymousClass0IZ.f2754D = yQA.xQA(str, str, this.f51403G.m14746C(), AnonymousClass2Na.CONFIRMATION_STEP).DD();
        anonymousClass0IZ.f2752B = AnonymousClass3Q6.f41057E;
        anonymousClass0IZ.B();
    }

    public final void xw() {
        this.f51400D.m18471A();
    }
}

package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.Html;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.login.api.RegistrationFlowExtras;
import com.instagram.nux.ui.NotificationBar;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.584 */
public final class AnonymousClass584 extends AnonymousClass0IJ implements AnonymousClass3TC, AnonymousClass3XE, AnonymousClass0IS, AnonymousClass3Xl, AnonymousClass3Xq, AnonymousClass0EJ {
    /* renamed from: B */
    public SearchEditText f60397B;
    /* renamed from: C */
    public String f60398C;
    /* renamed from: D */
    public boolean f60399D;
    /* renamed from: E */
    public NotificationBar f60400E;
    /* renamed from: F */
    public AnonymousClass57z f60401F;
    /* renamed from: G */
    public AnonymousClass580 f60402G;
    /* renamed from: H */
    public AnonymousClass581 f60403H;
    /* renamed from: I */
    public AnonymousClass582 f60404I;
    /* renamed from: J */
    public String f60405J;
    /* renamed from: K */
    public AnonymousClass3XF f60406K;
    /* renamed from: L */
    public RegistrationFlowExtras f60407L;
    /* renamed from: M */
    public AnonymousClass0Cn f60408M;
    /* renamed from: N */
    private InlineErrorMessageView f60409N;
    /* renamed from: O */
    private final Handler f60410O = new Handler();
    /* renamed from: P */
    private long f60411P;
    /* renamed from: Q */
    private String f60412Q;

    public final void Bv(boolean z) {
    }

    public final void Iy() {
    }

    public final void Oa(String str) {
    }

    public final String getModuleName() {
        return "phone_confirmation";
    }

    public final void onAppForegrounded() {
    }

    public final void pa() {
    }

    public AnonymousClass584() {
        String str = JsonProperty.USE_DEFAULT_NAME;
        this.f60405J = str;
        this.f60398C = str;
    }

    public final void AUA(String str, AnonymousClass22w anonymousClass22w) {
        if (AnonymousClass22w.CONFIRMATION_CODE == anonymousClass22w) {
            this.f60409N.B(str);
            this.f60400E.A();
        } else {
            AnonymousClass3X4.P(str, this.f60400E);
        }
        AnonymousClass0OR.D(this.f60410O, new AnonymousClass57x(this, anonymousClass22w), 1369899956);
    }

    /* renamed from: B */
    public static String m25808B(AnonymousClass584 anonymousClass584) {
        return AnonymousClass3X4.D(anonymousClass584.f60398C, anonymousClass584.f60405J);
    }

    /* renamed from: C */
    private void m25809C(String str) {
        Context context = getContext();
        String str2 = this.f60412Q;
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(AnonymousClass0G7.G());
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "accounts/account_recovery_code_login/";
        AnonymousClass0GA H = anonymousClass0Pt.D("query", str2).D("recover_code", str).D("source", "account_recover_code").D("device_id", AnonymousClass0Dt.B(context)).D("guid", AnonymousClass0Dt.f1941C.A(context)).M(AnonymousClass2aH.class).N().H();
        H.f2849B = new AnonymousClass57y(this, getActivity(), IS(), this, AnonymousClass3TK.SSO, this.f60412Q, new AnonymousClass3TP(getActivity()), null);
        schedule(H);
    }

    public final AnonymousClass0Oh DM() {
        return AnonymousClass0Oh.PHONE;
    }

    public final void FH() {
        this.f60397B.setEnabled(true);
        this.f60397B.setClearButtonEnabled(true);
    }

    public final void Hy(Context context, String str, String str2) {
        if (this.f60399D) {
            AnonymousClass3Xr.D(context, str2, str, false);
        } else {
            m25809C(str);
        }
    }

    public final AnonymousClass2Na IS() {
        return this.f60399D ? AnonymousClass2Na.CONFIRMATION_STEP : AnonymousClass2Na.RECOVERY_PHONE_CONFIRMATION;
    }

    public final boolean KY() {
        return this.f60397B.getText().length() == 6;
    }

    public final void RRA(long j) {
        this.f60411P = j;
    }

    public final void bG() {
        this.f60397B.setEnabled(false);
        this.f60397B.setClearButtonEnabled(false);
    }

    public final long fN() {
        return this.f60411P;
    }

    public final void ms() {
        String K = AnonymousClass0Nm.K(this.f60397B);
        if (this.f60399D) {
            AnonymousClass3Xr.D(getContext(), AnonymousClass584.m25808B(this), K, true);
        } else {
            m25809C(K);
        }
    }

    public final void onAppBackgrounded() {
        if (this.f60399D) {
            RegistrationFlowExtras registrationFlowExtras = this.f60407L;
            if (registrationFlowExtras != null) {
                registrationFlowExtras.E(IS()).F(DM()).f27651D = AnonymousClass0Nm.K(this.f60397B);
                AnonymousClass3Xg.B(getContext()).B(this.f60407L);
            }
        }
    }

    public final boolean onBackPressed() {
        Object obj = (!this.f60399D || AnonymousClass3WT.B()) ? null : 1;
        if (obj != null) {
            AnonymousClass3WT.D(this, IS(), DM(), null);
            return true;
        }
        AnonymousClass0Fr.RegBackPressed.G(IS(), DM()).E();
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1558969250);
        super.onCreate(bundle);
        this.f60408M = AnonymousClass0Ce.E(getArguments());
        registerLifecycleListener(AnonymousClass0kr.B(getActivity()));
        AnonymousClass0cQ.G(this, 1373456028, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String C;
        AnonymousClass0GA D;
        AnonymousClass3Xl anonymousClass3Xl;
        AnonymousClass0F4 anonymousClass0F4;
        AnonymousClass0F8 anonymousClass581;
        AnonymousClass0IL anonymousClass0IL = this;
        int F = AnonymousClass0cQ.F(this, 1967083849);
        View C2 = AnonymousClass3Xc.C(layoutInflater, viewGroup);
        this.f60400E = (NotificationBar) C2.findViewById(C0164R.id.notification_bar);
        layoutInflater.inflate(AnonymousClass3Xc.I() ? C0164R.layout.new_phone_confirmation_fragment : C0164R.layout.phone_confirmation_fragment, (ViewGroup) C2.findViewById(C0164R.id.content_container), true);
        this.f60399D = getArguments().getBoolean("arg_is_reg_flow");
        this.f60407L = (RegistrationFlowExtras) getArguments().getParcelable("RegistrationFlowExtras.EXTRA_KEY");
        String string = getArguments().getString("phone_number_key");
        String string2 = getArguments().getString("query_key");
        boolean z = (this.f60399D && this.f60407L != null) || !(this.f60399D || string == null || string2 == null);
        AnonymousClass0LH.C(z, "Must have the reg flow extra when in the reg flow, or a phone number and a lookup key when otherwise");
        this.f60412Q = string2;
        ((TextView) C2.findViewById(C0164R.id.field_title)).setText(C0164R.string.enter_confirmation_code);
        TextView textView = (TextView) C2.findViewById(C0164R.id.field_detail);
        RegistrationFlowExtras registrationFlowExtras = this.f60407L;
        if (!this.f60399D || registrationFlowExtras == null) {
            this.f60405J = string.replace("+", JsonProperty.USE_DEFAULT_NAME);
        } else {
            this.f60405J = registrationFlowExtras.f27667T;
        }
        if (!this.f60399D || registrationFlowExtras.f27652E == null) {
            C = AnonymousClass3X4.C(this.f60405J, null);
        } else {
            CountryCodeData countryCodeData = registrationFlowExtras.f27652E;
            this.f60398C = countryCodeData.A();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(countryCodeData.f28033C);
            stringBuilder.append(' ');
            stringBuilder.append(AnonymousClass3X4.C(this.f60405J, countryCodeData.f28032B));
            C = stringBuilder.toString();
        }
        if (AnonymousClass0e8.D(getContext())) {
            stringBuilder = new StringBuilder();
            Iterable asList = Arrays.asList(C.split(" "));
            Collections.reverse(asList);
            stringBuilder.append(AnonymousClass0RR.B(' ').A(asList));
            stringBuilder.append('+');
            string = stringBuilder.toString();
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append('+');
            stringBuilder2.append(C);
            string = stringBuilder2.toString();
        }
        textView.setText(Html.fromHtml(getContext().getString(C0164R.string.resend_six_digit_code, new Object[]{string})));
        AnonymousClass3Xy.G(textView, C0164R.color.grey_5);
        this.f60411P = SystemClock.elapsedRealtime();
        SearchEditText searchEditText = (SearchEditText) C2.findViewById(C0164R.id.confirmation_field);
        this.f60397B = searchEditText;
        AnonymousClass3Xy.D(searchEditText);
        this.f60397B.requestFocus();
        this.f60397B.setHint(C0164R.string.confirmation_code);
        this.f60397B.setFilters(new InputFilter[]{new LengthFilter(6)});
        if (this.f60399D && this.f60407L != null && AnonymousClass0Nm.P(this.f60397B) && !TextUtils.isEmpty(this.f60407L.f27651D)) {
            this.f60397B.setText(this.f60407L.f27651D);
        }
        this.f60409N = (InlineErrorMessageView) C2.findViewById(C0164R.id.confirmation_field_inline_error);
        InlineErrorMessageView.B((ViewGroup) C2.findViewById(C0164R.id.confirmation_field_container));
        ProgressButton progressButton = (ProgressButton) C2.findViewById(C0164R.id.next_button);
        AnonymousClass0TK anonymousClass3XF = new AnonymousClass3XF(this, this.f60397B, progressButton);
        this.f60406K = anonymousClass3XF;
        registerLifecycleListener(anonymousClass3XF);
        string2 = AnonymousClass0Dt.B(getContext());
        String A = AnonymousClass0Dt.f1941C.A(getContext());
        if (this.f60399D) {
            D = AnonymousClass2Eh.D(AnonymousClass584.m25808B(this), string2, A, null);
            D.f2849B = new AnonymousClass5Zb(this, this, this.f60406K);
        } else {
            D = AnonymousClass1fi.G(getContext(), this.f60412Q, null, true);
            D.f2849B = new AnonymousClass583(this);
        }
        if (!this.f60399D) {
            if (!((Boolean) AnonymousClass0E6.B(AnonymousClass0CC.f1447J)).booleanValue()) {
                anonymousClass3Xl = null;
                AnonymousClass3Xr.E(anonymousClass0IL, textView, anonymousClass0IL, anonymousClass3Xl, D, IS(), DM(), anonymousClass0IL.f60398C, anonymousClass0IL.f60405J);
                anonymousClass0F4 = AnonymousClass0F4.f2058E;
                anonymousClass581 = new AnonymousClass581(anonymousClass0IL);
                anonymousClass0IL.f60403H = anonymousClass581;
                anonymousClass0F4.A(AnonymousClass3Xo.class, anonymousClass581);
                anonymousClass581 = new AnonymousClass57z(anonymousClass0IL);
                anonymousClass0IL.f60401F = anonymousClass581;
                anonymousClass0F4.A(AnonymousClass3Xm.class, anonymousClass581);
                anonymousClass581 = new AnonymousClass582(anonymousClass0IL);
                anonymousClass0IL.f60404I = anonymousClass581;
                anonymousClass0F4.A(AnonymousClass3Xp.class, anonymousClass581);
                anonymousClass581 = new AnonymousClass580(anonymousClass0IL);
                anonymousClass0IL.f60402G = anonymousClass581;
                anonymousClass0F4.A(AnonymousClass3Xn.class, anonymousClass581);
                if (anonymousClass0IL.f60399D) {
                    C2.findViewById(C0164R.id.reg_footer_container).setVisibility(8);
                } else {
                    AnonymousClass3X4.M(C2, anonymousClass0IL, C0164R.string.already_have_an_account_log_in, IS(), DM());
                    TextView textView2 = (TextView) C2.findViewById(C0164R.id.log_in_button);
                    AnonymousClass3Xc.G(progressButton, new TextView[]{textView, textView2});
                    AnonymousClass3Xc.F(new TextView[]{textView, textView2});
                    AnonymousClass0Fr.RegScreenLoaded.G(IS(), DM()).E();
                }
                AnonymousClass0Fj.f2192B.A(anonymousClass0IL);
                AnonymousClass0cQ.G(anonymousClass0IL, 1319449344, F);
                return C2;
            }
        }
        anonymousClass3Xl = this;
        AnonymousClass3Xr.E(anonymousClass0IL, textView, anonymousClass0IL, anonymousClass3Xl, D, IS(), DM(), anonymousClass0IL.f60398C, anonymousClass0IL.f60405J);
        anonymousClass0F4 = AnonymousClass0F4.f2058E;
        anonymousClass581 = new AnonymousClass581(anonymousClass0IL);
        anonymousClass0IL.f60403H = anonymousClass581;
        anonymousClass0F4.A(AnonymousClass3Xo.class, anonymousClass581);
        anonymousClass581 = new AnonymousClass57z(anonymousClass0IL);
        anonymousClass0IL.f60401F = anonymousClass581;
        anonymousClass0F4.A(AnonymousClass3Xm.class, anonymousClass581);
        anonymousClass581 = new AnonymousClass582(anonymousClass0IL);
        anonymousClass0IL.f60404I = anonymousClass581;
        anonymousClass0F4.A(AnonymousClass3Xp.class, anonymousClass581);
        anonymousClass581 = new AnonymousClass580(anonymousClass0IL);
        anonymousClass0IL.f60402G = anonymousClass581;
        anonymousClass0F4.A(AnonymousClass3Xn.class, anonymousClass581);
        if (anonymousClass0IL.f60399D) {
            C2.findViewById(C0164R.id.reg_footer_container).setVisibility(8);
        } else {
            AnonymousClass3X4.M(C2, anonymousClass0IL, C0164R.string.already_have_an_account_log_in, IS(), DM());
            TextView textView22 = (TextView) C2.findViewById(C0164R.id.log_in_button);
            AnonymousClass3Xc.G(progressButton, new TextView[]{textView, textView22});
            AnonymousClass3Xc.F(new TextView[]{textView, textView22});
            AnonymousClass0Fr.RegScreenLoaded.G(IS(), DM()).E();
        }
        AnonymousClass0Fj.f2192B.A(anonymousClass0IL);
        AnonymousClass0cQ.G(anonymousClass0IL, 1319449344, F);
        return C2;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -1367963899);
        super.onDestroyView();
        unregisterLifecycleListener(this.f60406K);
        AnonymousClass0Fj.f2192B.D(this);
        AnonymousClass0F4 anonymousClass0F4 = AnonymousClass0F4.f2058E;
        AnonymousClass3Xr.f42125E.C(getContext());
        anonymousClass0F4.D(AnonymousClass3Xo.class, this.f60403H);
        anonymousClass0F4.D(AnonymousClass3Xm.class, this.f60401F);
        anonymousClass0F4.D(AnonymousClass3Xp.class, this.f60404I);
        anonymousClass0F4.D(AnonymousClass3Xn.class, this.f60402G);
        this.f60406K = null;
        this.f60397B = null;
        this.f60409N = null;
        this.f60400E = null;
        AnonymousClass0cQ.G(this, -1634135274, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 1143558386);
        super.onPause();
        AnonymousClass0Nm.N(this.f60397B);
        getActivity().getWindow().setSoftInputMode(0);
        AnonymousClass0cQ.G(this, 16518198, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -1752519897);
        super.onResume();
        AnonymousClass3X4.O(this.f60397B);
        getActivity().getWindow().setSoftInputMode(16);
        AnonymousClass0cQ.G(this, 541374712, F);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, 799897039);
        super.onStart();
        AnonymousClass0cQ.G(this, -912062893, F);
    }

    public final void onStop() {
        int F = AnonymousClass0cQ.F(this, -10588112);
        super.onStop();
        AnonymousClass0cQ.G(this, -1543476083, F);
    }
}

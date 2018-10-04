package X;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.5Z8 */
public final class AnonymousClass5Z8 extends AnonymousClass4zL implements AnonymousClass3XE, AnonymousClass0IS {
    /* renamed from: B */
    public SearchEditText f66322B;
    /* renamed from: C */
    public boolean f66323C;
    /* renamed from: D */
    public AnonymousClass3XF f66324D;
    /* renamed from: E */
    public boolean f66325E;
    /* renamed from: F */
    public AnonymousClass50S f66326F;
    /* renamed from: G */
    private boolean f66327G;

    public final void Bv(boolean z) {
    }

    public final AnonymousClass0Oh DM() {
        return null;
    }

    public final String getModuleName() {
        return "two_fac_login_confirmation";
    }

    /* renamed from: B */
    private void m27566B() {
        if (!this.f66327G) {
            if (!isDetached()) {
                this.f66327G = true;
                AnonymousClass1Ba.H(getActivity(), new AnonymousClass50L(this), new String[]{"android.permission.RECEIVE_SMS"});
            }
        }
    }

    /* renamed from: C */
    private void m27567C(View view) {
        TextView textView = (TextView) view.findViewById(C0164R.id.field_send_messenger_code);
        if (getArguments().getBoolean("ARGUMENT_SHOW_MESSENGER_CODE_OPTION")) {
            AnonymousClass4zL.m25529F(getString(C0164R.string.two_fac_login_confirmation_send_messenger_code), getString(C0164R.string.two_fac_login_confirmation_send_messenger_messenge, new Object[]{getString(C0164R.string.two_fac_login_confirmation_send_messenger_code)}), textView, new AnonymousClass50M(this));
            AnonymousClass3Xc.H(new TextView[]{textView});
            AnonymousClass3Xc.F(new TextView[]{textView});
            return;
        }
        textView.setVisibility(8);
    }

    public final void FH() {
        this.f66322B.setEnabled(true);
        this.f66322B.setClearButtonEnabled(true);
    }

    public final AnonymousClass2Na IS() {
        return AnonymousClass2Na.TWO_FAC;
    }

    public final boolean KY() {
        int length = this.f66322B.getText().length();
        if (length != 6) {
            if (length != 8) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final View mo5812b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0164R.layout.reg_container, viewGroup, false);
        layoutInflater.inflate(C0164R.layout.two_fac_login_confirmation_fragment, (ViewGroup) inflate.findViewById(C0164R.id.content_container), true);
        return inflate;
    }

    public final void bG() {
        this.f66322B.setEnabled(false);
        this.f66322B.setClearButtonEnabled(false);
    }

    /* renamed from: c */
    public final void mo5813c() {
        Context context = getContext();
        String string = getArguments().getString("ARGUMENT_OMNISTRING");
        String string2 = getArguments().getString("ARGUMENT_TWOFAC_IDENTIFIER");
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(AnonymousClass0G7.G());
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "accounts/two_factor_login_robocall/";
        AnonymousClass0GA H = anonymousClass0Pt.D("username", string).D("two_factor_identifier", string2).D("device_id", AnonymousClass0Dt.B(context)).D("guid", AnonymousClass0Dt.f1941C.A(context)).N().M(AnonymousClass2aW.class).H();
        H.f2849B = new AnonymousClass50U(this, getContext());
        schedule(H);
    }

    /* renamed from: d */
    public final void mo5814d() {
        AnonymousClass0GA F = AnonymousClass2DM.F(getContext(), getArguments().getString("ARGUMENT_OMNISTRING"), getArguments().getString("ARGUMENT_TWOFAC_IDENTIFIER"));
        F.f2849B = new AnonymousClass5Z6(this, this, this.f66324D);
        schedule(F);
    }

    /* renamed from: e */
    public final void mo5815e(View view) {
        this.f59105D = (TextView) view.findViewById(C0164R.id.field_resend_code);
        this.f59103B = getString(C0164R.string.two_fac_login_confirmation_request_a_new_one);
        this.f59104C = getString(C0164R.string.two_fac_login_confirmation_resend_code, new Object[]{this.f59103B});
    }

    public final void ms() {
        AnonymousClass0GA H = AnonymousClass2DM.H(getContext(), getArguments().getString("ARGUMENT_OMNISTRING"), getArguments().getString("ARGUMENT_TWOFAC_IDENTIFIER"), AnonymousClass0Nm.K(this.f66322B), null);
        H.f2849B = new AnonymousClass50T(this);
        schedule(H);
    }

    public final boolean onBackPressed() {
        AnonymousClass0Fr.RegBackPressed.F(IS()).E();
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1314149004);
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f66323C = getArguments().getBoolean("ARGUMENT_IS_FROM_ONE_CLICK_FLOW");
            this.f66325E = getArguments().getBoolean("ARGUMENT_SHOULD_REMEMBER_PASSWORD");
        }
        AnonymousClass0cQ.G(this, 1288949833, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1781007892);
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        m27567C(onCreateView);
        AnonymousClass3Xc.H(new TextView[]{this.f59105D});
        AnonymousClass3Xc.F(new TextView[]{this.f59105D});
        ((TextView) onCreateView.findViewById(C0164R.id.field_title)).setText(C0164R.string.two_fac_login_confirmation_title);
        ((TextView) onCreateView.findViewById(C0164R.id.field_detail)).setText(Html.fromHtml(getContext().getString(C0164R.string.two_fac_login_confirmation_body, new Object[]{getArguments().get("ARGUMENT_OBFUSCATED_PHONE_NUMBER")})));
        layoutInflater.inflate(C0164R.layout.reg_sms_confirmation_field, (ViewGroup) onCreateView.findViewById(C0164R.id.input_field_group));
        SearchEditText searchEditText = (SearchEditText) onCreateView.findViewById(C0164R.id.confirmation_field);
        this.f66322B = searchEditText;
        AnonymousClass3Xy.D(searchEditText);
        this.f66322B.setFilters(new InputFilter[]{new LengthFilter(8)});
        ProgressButton progressButton = (ProgressButton) onCreateView.findViewById(C0164R.id.next_button);
        AnonymousClass3Xc.G(progressButton, new TextView[0]);
        this.f66324D = new AnonymousClass3XF(this, this.f66322B, progressButton);
        TextView textView = (TextView) onCreateView.findViewById(C0164R.id.field_have_trouble_login);
        textView.setText(Html.fromHtml(getContext().getString(C0164R.string.two_fac_login_confirmation_help_text)));
        textView.setOnClickListener(new AnonymousClass50P(this));
        AnonymousClass3Xc.H(new TextView[]{textView});
        AnonymousClass3Xc.F(new TextView[]{textView});
        AnonymousClass3X4.L(onCreateView, this, C0164R.string.two_fac_login_confirmation_goback, IS(), DM(), null);
        registerLifecycleListener(this.f66324D);
        TextView textView2 = (TextView) onCreateView.findViewById(C0164R.id.log_in_button);
        AnonymousClass3Xc.H(new TextView[]{textView2});
        AnonymousClass3Xc.F(new TextView[]{textView2});
        AnonymousClass0Fr.RegScreenLoaded.F(IS()).E();
        if (((Boolean) AnonymousClass0CC.wh.G()).booleanValue()) {
            m27566B();
        }
        AnonymousClass0cQ.G(r11, -727774259, F);
        return onCreateView;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -705329028);
        super.onDestroyView();
        this.f66322B = null;
        unregisterLifecycleListener(this.f66324D);
        AnonymousClass0cQ.G(this, 1344755414, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -279507665);
        super.onPause();
        getActivity().getWindow().setSoftInputMode(0);
        AnonymousClass50S anonymousClass50S = this.f66326F;
        if (anonymousClass50S != null) {
            anonymousClass50S.m25579C(getActivity().getApplicationContext());
        }
        AnonymousClass0cQ.G(this, -211730435, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -510117098);
        super.onResume();
        getActivity().getWindow().setSoftInputMode(16);
        AnonymousClass50S anonymousClass50S = this.f66326F;
        if (anonymousClass50S != null) {
            anonymousClass50S.m25578B(getActivity().getApplicationContext());
        }
        AnonymousClass0cQ.G(this, -1677576972, F);
    }
}

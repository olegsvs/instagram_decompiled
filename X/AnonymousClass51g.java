package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.facebook.C0164R;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.51g */
public final class AnonymousClass51g extends AnonymousClass0IJ implements AnonymousClass0IT {
    /* renamed from: B */
    public ConfirmationCodeEditText f59344B;
    /* renamed from: C */
    public ProgressButton f59345C;
    /* renamed from: D */
    public String f59346D;
    /* renamed from: E */
    public AnonymousClass2Dx f59347E;
    /* renamed from: F */
    public AnonymousClass1PL f59348F;
    /* renamed from: G */
    public AnonymousClass0Cm f59349G;
    /* renamed from: H */
    private final OnEditorActionListener f59350H = new AnonymousClass51X(this);
    /* renamed from: I */
    private final OnClickListener f59351I = new AnonymousClass51W(this);
    /* renamed from: J */
    private final OnLongClickListener f59352J = new AnonymousClass51a(this);
    /* renamed from: K */
    private final AnonymousClass0Iw f59353K = new AnonymousClass51e(this);
    /* renamed from: L */
    private final TextWatcher f59354L = new AnonymousClass51Y(this);
    /* renamed from: M */
    private final AnonymousClass0Iw f59355M = new AnonymousClass51f(this);
    /* renamed from: N */
    private final AnonymousClass0Iw f59356N = new AnonymousClass51V(this);

    public final String getModuleName() {
        return "two_fac";
    }

    /* renamed from: B */
    public static void m25600B(AnonymousClass51g anonymousClass51g) {
        AnonymousClass0GQ.f2360B.A();
        Bundle arguments = anonymousClass51g.getArguments();
        AnonymousClass0IL anonymousClass51m = new AnonymousClass51m();
        anonymousClass51m.setArguments(arguments);
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass51g.getActivity());
        anonymousClass0IZ.f2754D = anonymousClass51m;
        anonymousClass0IZ.B();
    }

    /* renamed from: C */
    public static void m25601C(AnonymousClass51g anonymousClass51g) {
        if (anonymousClass51g.f59347E == AnonymousClass2Dx.SMS) {
            AnonymousClass0GA C = AnonymousClass2DM.C(anonymousClass51g.getContext(), anonymousClass51g.f59346D, anonymousClass51g.f59344B.getText().toString());
            C.f2849B = anonymousClass51g.f59355M;
            AnonymousClass0Ix.D(C);
        } else if (anonymousClass51g.f59347E == AnonymousClass2Dx.AUTHENTICATOR_APP) {
            AnonymousClass0Cn anonymousClass0Cn = anonymousClass51g.f59349G;
            Context context = anonymousClass51g.getContext();
            String obj = anonymousClass51g.f59344B.getText().toString();
            AnonymousClass0Iw anonymousClass0Iw = anonymousClass51g.f59356N;
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
            anonymousClass0Pt.f4229M = "accounts/enable_totp_two_factor/";
            AnonymousClass0GA H = anonymousClass0Pt.M(AnonymousClass50q.class).D("verification_code", obj).D("device_id", AnonymousClass0Dt.B(context)).D("verification_code", obj).N().H();
            H.f2849B = anonymousClass0Iw;
            AnonymousClass0Ix.D(H);
        }
    }

    /* renamed from: D */
    public static void m25602D(AnonymousClass51g anonymousClass51g) {
        if (anonymousClass51g.f59348F.A()) {
            AnonymousClass3Tc.B(anonymousClass51g.getContext(), 60);
            return;
        }
        AnonymousClass0GA E = AnonymousClass2DM.E(anonymousClass51g.getContext(), anonymousClass51g.f59349G, anonymousClass51g.f59346D);
        E.f2849B = anonymousClass51g.f59353K;
        anonymousClass51g.schedule(E);
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        anonymousClass0eT.Z(C0164R.string.two_fac_confirm_phone_number_actionbar_title);
        anonymousClass0eT.n(true);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -469942046);
        super.onCreate(bundle);
        this.f59348F = new AnonymousClass1PL();
        this.f59349G = AnonymousClass0Ce.G(getArguments());
        this.f59346D = getArguments().getString("phone_number");
        this.f59347E = AnonymousClass2Dx.B(getArguments().getString("two_fac_method"));
        if (getArguments().getBoolean("two_fac_should_fetch_code")) {
            AnonymousClass0GA E = AnonymousClass2DM.E(getContext(), this.f59349G, this.f59346D);
            E.f2849B = new AnonymousClass51b(this);
            schedule(E);
        }
        AnonymousClass0cQ.G(this, -1004823305, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 806459861);
        View inflate = layoutInflater.inflate(C0164R.layout.two_fac_confirm_phone_number_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C0164R.id.two_fac_confirm_phone_number_body);
        ProgressButton progressButton = (ProgressButton) inflate.findViewById(C0164R.id.next_button);
        this.f59345C = progressButton;
        progressButton.setOnClickListener(this.f59351I);
        this.f59345C.setEnabled(false);
        ConfirmationCodeEditText confirmationCodeEditText = (ConfirmationCodeEditText) inflate.findViewById(C0164R.id.edit_text);
        this.f59344B = confirmationCodeEditText;
        confirmationCodeEditText.addTextChangedListener(this.f59354L);
        this.f59344B.setOnEditorActionListener(this.f59350H);
        this.f59344B.setOnLongClickListener(this.f59352J);
        TextView textView2 = (TextView) inflate.findViewById(C0164R.id.footer);
        if (this.f59347E == AnonymousClass2Dx.SMS) {
            textView.setText(getString(C0164R.string.two_fac_confirm_phone_number_fragment_body, new Object[]{AnonymousClass52Q.m25613B(this.f59346D)}));
            AnonymousClass52Q.m25614C(textView2, getString(C0164R.string.two_fac_confirm_phone_number_link_resend_code), new AnonymousClass51c(this, AnonymousClass0Ca.C(getContext(), C0164R.color.blue_5)), getString(C0164R.string.two_fac_confirm_phone_number_link_change_phone_number), new AnonymousClass51d(this, AnonymousClass0Ca.C(getContext(), C0164R.color.blue_5)));
        } else if (this.f59347E == AnonymousClass2Dx.AUTHENTICATOR_APP) {
            inflate.findViewById(C0164R.id.space).setVisibility(0);
            textView2.setVisibility(8);
            textView.setText(C0164R.string.two_fac_confirm_phone_number_fragment_body_authenticator_app);
        }
        registerLifecycleListener(new AnonymousClass235(getActivity()));
        AnonymousClass0cQ.G(this, -952755920, F);
        return inflate;
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 883892952);
        super.onPause();
        getActivity().getWindow().setSoftInputMode(0);
        AnonymousClass0Nm.N(this.f59344B);
        AnonymousClass0cQ.G(this, 869102350, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -1454864499);
        super.onResume();
        Z().getWindow().setSoftInputMode(16);
        this.f59344B.requestFocus();
        AnonymousClass0Nm.k(this.f59344B);
        AnonymousClass0cQ.G(this, -486438853, F);
    }
}

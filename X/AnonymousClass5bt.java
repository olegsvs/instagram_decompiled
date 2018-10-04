package X;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.facebook.C0164R;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.5bt */
public final class AnonymousClass5bt extends AnonymousClass5Xf {
    /* renamed from: B */
    public EditText f67188B;
    /* renamed from: C */
    public AnonymousClass4rZ f67189C;
    /* renamed from: D */
    private AnonymousClass3Pu f67190D;
    /* renamed from: E */
    private final OnEditorActionListener f67191E = new AnonymousClass4rI(this);
    /* renamed from: F */
    private InlineErrorMessageView f67192F;
    /* renamed from: G */
    private final TextWatcher f67193G = new AnonymousClass4rJ(this);

    public final String getModuleName() {
        return "instagram_terms_flow";
    }

    /* renamed from: C */
    public static void m27950C(AnonymousClass5bt anonymousClass5bt, String str) {
        anonymousClass5bt.f67192F.B(str);
        AnonymousClass3Po C = AnonymousClass3Po.C();
        AnonymousClass0NN B = AnonymousClass3Po.B(C, AnonymousClass3Pm.CONSENT_MAIL_FAILURE, anonymousClass5bt);
        B.F("user_state", C.f40956C.toString());
        B.F("reason", str);
        AnonymousClass3Po.D(B);
        B.R();
    }

    public final AnonymousClass3Pp YM() {
        return AnonymousClass3Pp.PARENTAL_CONTACT;
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        if (AnonymousClass3Q9.B().f41084O == AnonymousClass3Q8.NEW_USER) {
            anonymousClass0eT.k(false);
        } else {
            AnonymousClass0eT.H(anonymousClass0eT, getString(C0164R.string.ask_a_parent));
        }
    }

    /* renamed from: d */
    public final void mo6040d() {
        this.f67192F.A();
        if (AnonymousClass3Q9.B().f41084O != AnonymousClass3Q8.NEW_USER) {
            super.mo6040d();
        } else if (AnonymousClass3Q9.B().f41077H) {
            AnonymousClass35t.B(AnonymousClass0FL.B(this.f65945C), getActivity(), getArguments().getString("IgSessionManager.USER_ID"), this);
        } else {
            AnonymousClass3XA.D(this, getArguments().getString("IgSessionManager.USER_ID"), AnonymousClass3Q9.B().f41075F, this);
        }
    }

    public final void ms() {
        super.ms();
        AnonymousClass3Po.C().B(AnonymousClass3Pm.CONSENT_ACTION, AnonymousClass3Pq.NEXT, this, this, this.f67188B.getText().toString());
        if (AnonymousClass0IE.L(this.f67188B.getText().toString())) {
            this.f67189C.m25213A();
            AnonymousClass0Iw anonymousClass5Xj = new AnonymousClass5Xj(this, getContext(), this, this.f67189C);
            AnonymousClass3Q3 anonymousClass3Q3 = new AnonymousClass3Q3(getContext(), AnonymousClass3Q8.EXISTING_USER, AnonymousClass3Q9.B().f41080K, AnonymousClass3Q9.B().f41076G, this.f65945C);
            anonymousClass3Q3.f41034B.D("guardian_email", r4.f67188B.getText().toString());
            AnonymousClass3Q4.C(anonymousClass3Q3, anonymousClass5Xj);
            return;
        }
        AnonymousClass4rZ anonymousClass4rZ = this.f67189C;
        anonymousClass4rZ.f57921C = false;
        anonymousClass4rZ.f57923E.setEnabled(anonymousClass4rZ.f57921C);
        AnonymousClass5bt.m27950C(this, getResources().getString(C0164R.string.email_invalid));
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -61472831);
        super.onCreate(bundle);
        this.f67190D = AnonymousClass3Q9.B().f41073D.f41010E;
        AnonymousClass0cQ.G(this, 1083315363, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 310514871);
        View inflate = layoutInflater.inflate(C0164R.layout.gdpr_parent_contact_info_layout, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C0164R.id.content_title);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0164R.id.paragraphs_container);
        this.f67192F = (InlineErrorMessageView) inflate.findViewById(C0164R.id.inline_error);
        this.f67188B = (EditText) inflate.findViewById(C0164R.id.email_field);
        AnonymousClass3Pu anonymousClass3Pu = this.f67190D;
        if (anonymousClass3Pu != null) {
            textView.setText(anonymousClass3Pu.f41003D);
            AnonymousClass0Ss.E(getContext(), textView);
            AnonymousClass4rf.m25218B(getContext(), linearLayout, this.f67190D.f41005F);
            this.f67188B.setImeOptions(6);
            this.f67188B.setOnEditorActionListener(this.f67191E);
            this.f67189C = new AnonymousClass4rZ((ProgressButton) inflate.findViewById(C0164R.id.next_button), AnonymousClass3Q9.B().f41079J, false, this);
            registerLifecycleListener(this.f67189C);
            AnonymousClass3Po.C().F(AnonymousClass3Pm.CONSENT_VIEW, this, this);
        }
        AnonymousClass0cQ.G(this, -1093804232, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, -1446513290);
        super.onDestroy();
        unregisterLifecycleListener(this.f67189C);
        AnonymousClass0cQ.G(this, 652273998, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -14295406);
        super.onPause();
        this.f67188B.removeTextChangedListener(this.f67193G);
        getActivity().getWindow().setSoftInputMode(0);
        AnonymousClass0Nm.N(getView());
        AnonymousClass0cQ.G(this, -1605078929, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 1771359926);
        super.onResume();
        this.f67188B.addTextChangedListener(this.f67193G);
        Z().getWindow().setSoftInputMode(16);
        AnonymousClass0cQ.G(this, -1328595083, F);
    }
}

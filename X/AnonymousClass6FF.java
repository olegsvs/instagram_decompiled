package X;

import android.os.Bundle;
import android.text.Html;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;

/* renamed from: X.6FF */
public final class AnonymousClass6FF extends AnonymousClass61M {
    /* renamed from: B */
    public String f73328B;
    /* renamed from: C */
    public InlineErrorMessageView f73329C;
    /* renamed from: D */
    public EditText f73330D;
    /* renamed from: E */
    public AnonymousClass0Cm f73331E;
    /* renamed from: F */
    private int f73332F;
    /* renamed from: G */
    private int f73333G;
    /* renamed from: H */
    private TextView f73334H;

    public final String getModuleName() {
        return "data_download_password";
    }

    /* renamed from: B */
    public static void m29623B(AnonymousClass6FF anonymousClass6FF, boolean z) {
        anonymousClass6FF.f73334H.setEnabled(z);
        anonymousClass6FF.f73334H.setTextColor(z ? anonymousClass6FF.f73333G : anonymousClass6FF.f73332F);
    }

    /* renamed from: C */
    public static void m29624C(AnonymousClass6FF anonymousClass6FF) {
        anonymousClass6FF.f73329C.A();
        if (AnonymousClass0Nm.P(anonymousClass6FF.f73330D)) {
            anonymousClass6FF.f73329C.B(anonymousClass6FF.getString(C0164R.string.password_must_be_six_characters));
            return;
        }
        String obj = anonymousClass6FF.f73330D.getText().toString();
        AnonymousClass0Cn anonymousClass0Cn = anonymousClass6FF.f73331E;
        String str = anonymousClass6FF.f73328B;
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(anonymousClass0Cn);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "dyi/request_download_data/";
        AnonymousClass0GA H = anonymousClass0Pt.D("email", str).D("password", obj).M(AnonymousClass3eS.class).N().H();
        H.f2849B = new AnonymousClass61R(anonymousClass6FF);
        AnonymousClass0Ix.D(H);
    }

    public final void configureActionBar(AnonymousClass0eT anonymousClass0eT) {
        super.configureActionBar(anonymousClass0eT);
        boolean z = false;
        anonymousClass0eT.S(false);
        this.f73334H = (TextView) anonymousClass0eT.E(getString(C0164R.string.next), new AnonymousClass61S(this));
        TextView textView = this.f73330D;
        if (!(textView == null || AnonymousClass0Nm.P(textView))) {
            z = true;
        }
        AnonymousClass6FF.m29623B(this, z);
        anonymousClass0eT.c(C0164R.drawable.nav_close, new AnonymousClass61T(this));
    }

    public final boolean onBackPressed() {
        AnonymousClass0Nm.N(this.f73330D);
        return super.onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -565067494);
        super.onCreate(bundle);
        this.f73328B = getArguments().getString("email");
        this.f73331E = AnonymousClass0Ce.G(getArguments());
        this.f73332F = AnonymousClass0Ca.C(getContext(), C0164R.color.blue_5_30_transparent);
        this.f73333G = AnonymousClass0Ca.C(getContext(), C0164R.color.blue_5);
        AnonymousClass0cQ.G(this, 702741799, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1406989078);
        View inflate = layoutInflater.inflate(C0164R.layout.data_download_password_fragment, viewGroup, false);
        ((TextView) inflate.findViewById(C0164R.id.header_text)).setText(getString(C0164R.string.data_download_password_header_text, new Object[]{this.f73331E.B().uT()}));
        ((ViewStub) inflate.findViewById(C0164R.id.inline_error_stub)).inflate();
        this.f73329C = (InlineErrorMessageView) inflate.findViewById(C0164R.id.inline_error);
        TextView textView = (TextView) inflate.findViewById(C0164R.id.help_text);
        textView.setText(Html.fromHtml(getResources().getString(C0164R.string.forget_password)));
        textView.setOnClickListener(new AnonymousClass61O(this));
        EditText editText = (EditText) inflate.findViewById(C0164R.id.text_field);
        this.f73330D = editText;
        editText.setHint(C0164R.string.password);
        this.f73330D.setInputType(128);
        this.f73330D.setTransformationMethod(new PasswordTransformationMethod());
        this.f73330D.setImeOptions(6);
        this.f73330D.setOnEditorActionListener(new AnonymousClass61P(this));
        this.f73330D.addTextChangedListener(new AnonymousClass61Q(this));
        AnonymousClass0cQ.G(this, 832607786, F);
        return inflate;
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 1306254141);
        super.onResume();
        this.f73330D.requestFocus();
        AnonymousClass0Nm.k(this.f73330D);
        AnonymousClass0cQ.G(this, 1862796429, F);
    }
}

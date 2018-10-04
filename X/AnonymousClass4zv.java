package X;

import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.nux.ui.NotificationBar;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.4zv */
public final class AnonymousClass4zv extends AnonymousClass0IJ implements AnonymousClass3XE, AnonymousClass0IS {
    /* renamed from: B */
    public NotificationBar f59180B;
    /* renamed from: C */
    public EditText f59181C;
    /* renamed from: D */
    public String f59182D;
    /* renamed from: E */
    public AnonymousClass3XF f59183E;
    /* renamed from: F */
    public String f59184F;
    /* renamed from: G */
    public AnonymousClass0Cm f59185G;
    /* renamed from: H */
    private Uri f59186H;
    /* renamed from: I */
    private ProgressButton f59187I;
    /* renamed from: J */
    private View f59188J;

    public final void Bv(boolean z) {
    }

    public final AnonymousClass0Oh DM() {
        return null;
    }

    public final String getModuleName() {
        return "one_click_password_reset";
    }

    /* renamed from: B */
    public static void m25557B(AnonymousClass4zv anonymousClass4zv) {
        AnonymousClass1Qv.E(anonymousClass4zv.f59185G, anonymousClass4zv.getActivity(), anonymousClass4zv, anonymousClass4zv.f59186H);
    }

    public final void FH() {
        this.f59187I.setEnabled(true);
        this.f59188J.setEnabled(true);
    }

    public final AnonymousClass2Na IS() {
        return AnonymousClass2Na.ONE_CLICK_PWD_RESET;
    }

    public final boolean KY() {
        return AnonymousClass0Nm.K(this.f59181C).length() >= 6;
    }

    public final void bG() {
        this.f59187I.setEnabled(false);
        this.f59188J.setEnabled(false);
    }

    public final void ms() {
        this.f59180B.A();
        AnonymousClass0Fr.PasswordResetAttempt.C(IS()).R();
        Object obj = this.f59185G;
        String obj2 = this.f59181C.getText().toString();
        String str = this.f59182D;
        String str2 = this.f59184F;
        String B = AnonymousClass0Dt.B(getContext());
        String A = AnonymousClass0Dt.f1941C.A(getContext());
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(obj);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "accounts/change_password/";
        AnonymousClass0GA H = anonymousClass0Pt.D(MemoryDumpUploadJob.EXTRA_USER_ID, obj.f1759C).D("new_password", obj2).D("access_pw_reset_token", str).D("source", str2).D("device_id", B).D("guid", A).M(AnonymousClass0Pv.class).N().H();
        H.f2849B = new AnonymousClass4zu(this);
        schedule(H);
    }

    public final boolean onBackPressed() {
        AnonymousClass4zv.m25557B(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1842430290);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f59185G = AnonymousClass0Ce.G(arguments);
        this.f59182D = (String) AnonymousClass0LH.E(arguments.getString("argument_token"));
        this.f59184F = (String) AnonymousClass0LH.E(arguments.getString("argument_source"));
        this.f59186H = (Uri) arguments.getParcelable("argument_redirect_uri");
        AnonymousClass0Fr.RegScreenLoaded.C(IS()).R();
        AnonymousClass0cQ.G(this, 1462431658, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1357909530);
        View inflate = layoutInflater.inflate(C0164R.layout.fragment_one_click_password_reset, viewGroup, false);
        ((TextView) inflate.findViewById(C0164R.id.field_title)).setText(C0164R.string.enter_a_new_password);
        this.f59180B = (NotificationBar) inflate.findViewById(C0164R.id.notification_bar);
        EditText editText = (EditText) inflate.findViewById(C0164R.id.new_password);
        this.f59181C = editText;
        editText.setTypeface(Typeface.DEFAULT);
        this.f59181C.setTransformationMethod(new PasswordTransformationMethod());
        ((CircularImageView) inflate.findViewById(C0164R.id.user_profile_picture)).setUrl(this.f59185G.B().DQ());
        ((TextView) inflate.findViewById(C0164R.id.field_detail)).setText(getString(C0164R.string.reset_password_to_log_into_instagram, new Object[]{r7.uT()}));
        this.f59187I = (ProgressButton) inflate.findViewById(C0164R.id.next_button);
        AnonymousClass0TK anonymousClass3XF = new AnonymousClass3XF(this, this.f59181C, this.f59187I, C0164R.string.reset_password);
        this.f59183E = anonymousClass3XF;
        registerLifecycleListener(anonymousClass3XF);
        View findViewById = inflate.findViewById(C0164R.id.skip_text);
        this.f59188J = findViewById;
        findViewById.setOnClickListener(new AnonymousClass4zt(this));
        AnonymousClass0cQ.G(this, -1330606596, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 785916726);
        super.onDestroyView();
        this.f59181C = null;
        this.f59187I = null;
        this.f59188J = null;
        this.f59180B = null;
        unregisterLifecycleListener(this.f59183E);
        AnonymousClass0cQ.G(this, 611071929, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -1250535983);
        super.onPause();
        if (getActivity().getCurrentFocus() != null) {
            AnonymousClass0Nm.N(getActivity().getCurrentFocus());
        }
        AnonymousClass0cQ.G(this, 1021350735, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 1246472770);
        super.onResume();
        ((BaseFragmentActivity) getActivity()).Q();
        AnonymousClass0cQ.G(this, 2099254657, F);
    }
}

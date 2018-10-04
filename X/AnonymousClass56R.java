package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.nux.ui.NotificationBar;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.List;

/* renamed from: X.56R */
public final class AnonymousClass56R extends AnonymousClass0IJ implements AnonymousClass3XE, AnonymousClass0IS, AnonymousClass0EJ {
    /* renamed from: B */
    public String f60129B;
    /* renamed from: C */
    public AnonymousClass0F8 f60130C;
    /* renamed from: D */
    public boolean f60131D;
    /* renamed from: E */
    public boolean f60132E;
    /* renamed from: F */
    public List f60133F;
    /* renamed from: G */
    public NotificationBar f60134G;
    /* renamed from: H */
    public AnonymousClass3XF f60135H;
    /* renamed from: I */
    private String f60136I;
    /* renamed from: J */
    private String f60137J;
    /* renamed from: K */
    private TextView f60138K;
    /* renamed from: L */
    private TextView f60139L;
    /* renamed from: M */
    private AnonymousClass0Cm f60140M;

    public final void FH() {
    }

    public final boolean KY() {
        return true;
    }

    public final void bG() {
    }

    public final String getModuleName() {
        return "nux_add_email_screen";
    }

    public final void onAppForegrounded() {
    }

    /* renamed from: B */
    public static void m25732B(AnonymousClass56R anonymousClass56R, boolean z) {
        AnonymousClass0LH.E(AnonymousClass1PJ.B(anonymousClass56R.getActivity()));
        AnonymousClass1PJ.B(anonymousClass56R.getActivity()).hb(z);
    }

    public final void Bv(boolean z) {
        this.f60138K.setEnabled(z);
    }

    public final AnonymousClass0Oh DM() {
        return AnonymousClass0Oh.PHONE;
    }

    public final AnonymousClass2Na IS() {
        return AnonymousClass2Na.ADD_EMAIL;
    }

    public final void ms() {
        AnonymousClass0GA G = AnonymousClass1fh.G(this.f60140M, AnonymousClass1fq.NUX, this.f60136I, AnonymousClass0Dt.B(getContext()), this.f60129B, this.f60137J, this.f60133F);
        G.f2849B = new AnonymousClass56Q(this);
        schedule(G);
        AnonymousClass0Fr.RegNextPressed.C(IS()).R();
        if (((Boolean) AnonymousClass0E6.B(AnonymousClass0CC.BW)).booleanValue()) {
            boolean z = true;
            AnonymousClass0NN H = AnonymousClass0NN.B("nux_add_email_auto_conf_signal_cmpleteness", this).H("fetch_big_blue_completed", this.f60131D).H("fetch_google_tokens_completed", this.f60132E).H("has_big_blue", this.f60129B != null);
            String str = "has_google_tokens";
            if (this.f60133F == null) {
                z = false;
            }
            H.H(str, z).R();
        }
    }

    public final void onAppBackgrounded() {
        AnonymousClass0Fr.StepViewBackgrounded.C(IS()).R();
    }

    public final boolean onBackPressed() {
        AnonymousClass0Fr.RegBackPressed.C(IS()).R();
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1838585932);
        super.onCreate(bundle);
        this.f60140M = AnonymousClass0Ce.G(getArguments());
        String string = getArguments().getString("argument_email");
        this.f60136I = string;
        AnonymousClass0LH.E(string);
        if (((Boolean) AnonymousClass0E6.B(AnonymousClass0CC.BW)).booleanValue()) {
            this.f60130C = new AnonymousClass56N(this);
            AnonymousClass0F4.f2058E.A(AnonymousClass0ky.class, this.f60130C);
            AnonymousClass0i7.B().F();
            schedule(new AnonymousClass56O(this));
            this.f60137J = AnonymousClass0N2.B().A() != null ? AnonymousClass0N2.B().A().f7512B : null;
        }
        AnonymousClass0cQ.G(this, 922278481, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 7432797);
        AnonymousClass0Fr.RegScreenLoaded.C(IS()).R();
        View C = AnonymousClass3Xc.C(layoutInflater, viewGroup);
        layoutInflater.inflate(AnonymousClass3Xc.I() ? C0164R.layout.new_nux_add_email_fragment : C0164R.layout.nux_add_email_fragment, (ViewGroup) C.findViewById(C0164R.id.content_container), true);
        this.f60134G = (NotificationBar) C.findViewById(C0164R.id.notification_bar);
        TextView textView = (TextView) C.findViewById(C0164R.id.skip_button);
        this.f60138K = textView;
        textView.setText(C0164R.string.skip_text);
        this.f60138K.setOnClickListener(new AnonymousClass56P(this));
        this.f60139L = (TextView) C.findViewById(C0164R.id.field_detail);
        ((TextView) C.findViewById(C0164R.id.field_title)).setText(C0164R.string.add_email_title);
        this.f60139L.setText(AnonymousClass0IE.E(getResources().getString(C0164R.string.add_email_subtitle), new Object[]{this.f60136I}));
        ProgressButton progressButton = (ProgressButton) C.findViewById(C0164R.id.next_button);
        AnonymousClass3Xc.G(progressButton, new TextView[0]);
        this.f60135H = new AnonymousClass3XF(this, progressButton);
        registerLifecycleListener(this.f60135H);
        AnonymousClass0Fj.f2192B.A(this);
        AnonymousClass0cQ.G(this, -1134048437, F);
        return C;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, 543585802);
        super.onDestroyView();
        this.f60138K = null;
        this.f60139L = null;
        unregisterLifecycleListener(this.f60135H);
        AnonymousClass0Fj.f2192B.D(this);
        AnonymousClass0cQ.G(this, 354608712, F);
    }
}

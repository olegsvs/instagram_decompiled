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
import com.instagram.nux.ui.NotificationBar;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.58j */
public final class AnonymousClass58j extends AnonymousClass0IJ implements AnonymousClass3TC, AnonymousClass3XE, AnonymousClass0IS, AnonymousClass0EJ {
    /* renamed from: B */
    public RegistrationFlowExtras f60498B;
    /* renamed from: C */
    public AnonymousClass0Cn f60499C;
    /* renamed from: D */
    public String f60500D;
    /* renamed from: E */
    public String f60501E;
    /* renamed from: F */
    private TextView f60502F;
    /* renamed from: G */
    private final AnonymousClass0F8 f60503G = new AnonymousClass58d(this);
    /* renamed from: H */
    private AnonymousClass58g f60504H;
    /* renamed from: I */
    private AnonymousClass58h f60505I;
    /* renamed from: J */
    private final Handler f60506J = new Handler();
    /* renamed from: K */
    private NotificationBar f60507K;
    /* renamed from: L */
    private AnonymousClass58i f60508L;
    /* renamed from: M */
    private AnonymousClass3XF f60509M;
    /* renamed from: N */
    private AnonymousClass0Oh f60510N = AnonymousClass0Oh.FACEBOOK;

    public final void FH() {
    }

    public final boolean KY() {
        return true;
    }

    public final void bG() {
    }

    public final String getModuleName() {
        return "username_sign_up";
    }

    public final void onAppForegrounded() {
    }

    public final void AUA(String str, AnonymousClass22w anonymousClass22w) {
        if (isVisible()) {
            AnonymousClass3X4.P(str, this.f60507K);
        }
    }

    /* renamed from: B */
    private void m25829B() {
        if (this.f60510N != AnonymousClass0Oh.FACEBOOK) {
            this.f60498B.E(IS()).F(DM());
            AnonymousClass3Xg.B(getContext()).B(this.f60498B);
        }
    }

    public final void Bv(boolean z) {
        TextView textView = this.f60502F;
        if (textView != null) {
            textView.setEnabled(z);
        }
    }

    /* renamed from: C */
    private static int m25830C() {
        return AnonymousClass3Xc.I() ? AnonymousClass3Xc.B(AnonymousClass0CC.Qb) ? C0164R.string.suggested_username_title_get_started_as : C0164R.string.suggested_username_title : AnonymousClass3Xc.B(AnonymousClass0CC.Qb) ? C0164R.string.suggested_username_allcaps_title_get_started_as : C0164R.string.suggested_username_allcaps_title;
    }

    /* renamed from: D */
    private void m25831D() {
        List D = this.f60498B.D();
        if (D == null || D.isEmpty()) {
            String str = null;
            this.f60500D = null;
            List list = this.f60498B.f27673Z;
            if (!(list == null || list.isEmpty())) {
                str = (String) list.get(0);
            }
            this.f60501E = str;
            return;
        }
        this.f60501E = ((AnonymousClass2En) D.get(0)).f27929C;
        this.f60500D = ((AnonymousClass2En) D.get(0)).f27928B;
    }

    public final AnonymousClass0Oh DM() {
        return this.f60510N;
    }

    public final AnonymousClass2Na IS() {
        return AnonymousClass2Na.USERNAME_SUGGESTION_STEP;
    }

    public final void ms() {
        AnonymousClass0IJ anonymousClass0IJ = this;
        if (!this.f60498B.f27658K) {
            if (!AnonymousClass3Q9.B().f41078I) {
                if (!TextUtils.isEmpty(this.f60500D)) {
                    AnonymousClass0Fr.UsernameSuggestionPrototypeAccepted.G(IS(), DM()).B("prototype", this.f60500D).E();
                }
                AnonymousClass0Cn anonymousClass0Cn = this.f60499C;
                String str = this.f60501E;
                AnonymousClass3XA.E(anonymousClass0Cn, str, anonymousClass0IJ, this.f60510N, this.f60498B, anonymousClass0IJ, anonymousClass0IJ, this.f60506J, this.f60509M, str, IS(), false);
                return;
            }
        }
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(getActivity());
        AnonymousClass3Q7 yQA = AnonymousClass0Jr.f2946B.A().A(AnonymousClass1QC.UNKNOWN, AnonymousClass3Q8.NEW_USER, true).yQA(this.f60498B);
        String str2 = this.f60501E;
        anonymousClass0IZ.f2754D = yQA.xQA(str2, str2, this.f60510N, IS()).DD();
        anonymousClass0IZ.f2752B = AnonymousClass3Q6.f41057E;
        anonymousClass0IZ.B();
    }

    public final void onAppBackgrounded() {
        m25829B();
    }

    public final boolean onBackPressed() {
        if (AnonymousClass3WT.B()) {
            AnonymousClass0Fr.RegBackPressed.G(IS(), DM()).E();
            return false;
        }
        AnonymousClass3WT.D(this, IS(), DM(), new AnonymousClass58f(this));
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1771236737);
        super.onCreate(bundle);
        this.f60499C = AnonymousClass0Ce.E(getArguments());
        RegistrationFlowExtras registrationFlowExtras = (RegistrationFlowExtras) getArguments().getParcelable("RegistrationFlowExtras.EXTRA_KEY");
        this.f60498B = registrationFlowExtras;
        AnonymousClass0LH.E(registrationFlowExtras);
        if (this.f60498B.f27655H != null) {
            this.f60510N = AnonymousClass0Oh.EMAIL;
        } else if (this.f60498B.f27666S != null) {
            this.f60510N = AnonymousClass0Oh.PHONE;
        }
        AnonymousClass3Q4.B(getContext(), this.f60499C);
        m25831D();
        if (((Boolean) AnonymousClass0E6.B(AnonymousClass0CC.lb)).booleanValue()) {
            Object obj = this.f60510N == AnonymousClass0Oh.FACEBOOK ? 1 : null;
            AnonymousClass0GO C = AnonymousClass0GO.C();
            Context context = getContext();
            boolean z = obj != null && AnonymousClass0a2.K(this.f60499C);
            C.C(context, false, z, false, null, this.f60510N);
        }
        registerLifecycleListener(AnonymousClass0kr.B(getActivity()));
        AnonymousClass0F4.f2058E.A(AnonymousClass4qu.class, this.f60503G);
        AnonymousClass0cQ.G(this, 55181176, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AnonymousClass0F8 anonymousClass58i;
        int F = AnonymousClass0cQ.F(this, 1222669996);
        View C = AnonymousClass3Xc.C(layoutInflater, viewGroup);
        layoutInflater.inflate(AnonymousClass3Xc.I() ? C0164R.layout.new_reg_username_suggestion : C0164R.layout.reg_username_suggestion, (ViewGroup) C.findViewById(C0164R.id.content_container), true);
        ((TextView) C.findViewById(C0164R.id.field_title)).setText(AnonymousClass58j.m25830C());
        TextView textView = (TextView) C.findViewById(C0164R.id.field_title_second_line);
        if (!TextUtils.isEmpty(this.f60501E)) {
            AnonymousClass0Fr.RegSuggestionPrefilled.G(IS(), DM()).B("username_suggestion_string", this.f60501E).D("field", "username").E();
            textView.setText(this.f60501E);
            if (!TextUtils.isEmpty(this.f60500D)) {
                AnonymousClass0Fr.UsernameSuggestionPrototypeUsed.G(IS(), DM()).B("prototype", this.f60500D).E();
            }
        }
        ((TextView) C.findViewById(C0164R.id.field_detail)).setText(C0164R.string.suggested_username_subtitle);
        ((TextView) C.findViewById(C0164R.id.change_username)).setOnClickListener(new AnonymousClass58e(this));
        this.f60507K = (NotificationBar) C.findViewById(C0164R.id.notification_bar);
        ProgressButton progressButton = (ProgressButton) C.findViewById(C0164R.id.next_button);
        this.f60509M = new AnonymousClass3XF(this, textView, progressButton);
        registerLifecycleListener(this.f60509M);
        AnonymousClass3Xc.G(progressButton, new TextView[0]);
        if (this.f60510N == AnonymousClass0Oh.PHONE) {
            anonymousClass58i = new AnonymousClass58i(this);
            this.f60508L = anonymousClass58i;
            AnonymousClass0F4.f2058E.A(AnonymousClass3Xp.class, anonymousClass58i);
        } else if (this.f60510N == AnonymousClass0Oh.EMAIL) {
            anonymousClass58i = new AnonymousClass58h(this);
            this.f60505I = anonymousClass58i;
            AnonymousClass0F4.f2058E.A(AnonymousClass1dE.class, anonymousClass58i);
        }
        anonymousClass58i = new AnonymousClass58g(this);
        this.f60504H = anonymousClass58i;
        AnonymousClass0F4.f2058E.A(AnonymousClass3Vn.class, anonymousClass58i);
        AnonymousClass3X4.N(getContext(), (TextView) C.findViewById(C0164R.id.privacy_policy), this.f60498B.f27671X);
        if (!Arrays.asList(new String[]{"test_excluding_tos", "test_excluding_username_screen"}).contains(AnonymousClass0CC.fh.G())) {
            AnonymousClass3Xc.F(new TextView[]{textView});
        }
        AnonymousClass0Fj.f2192B.A(this);
        AnonymousClass0Fr.RegScreenLoaded.G(IS(), DM()).E();
        AnonymousClass0cQ.G(this, -747825756, F);
        return C;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, 375350777);
        super.onDestroy();
        AnonymousClass0F4.f2058E.D(AnonymousClass4qu.class, this.f60503G);
        AnonymousClass0cQ.G(this, -375544439, F);
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -997909093);
        super.onDestroyView();
        unregisterLifecycleListener(this.f60509M);
        AnonymousClass0Fj.f2192B.D(this);
        this.f60507K = null;
        this.f60509M = null;
        this.f60502F = null;
        if (this.f60508L != null) {
            AnonymousClass0F4.f2058E.D(AnonymousClass3Xp.class, this.f60508L);
            this.f60508L = null;
        }
        if (this.f60505I != null) {
            AnonymousClass0F4.f2058E.D(AnonymousClass1dE.class, this.f60505I);
            this.f60505I = null;
        }
        if (this.f60504H != null) {
            AnonymousClass0F4.f2058E.D(AnonymousClass3Vn.class, this.f60504H);
            this.f60504H = null;
        }
        AnonymousClass0cQ.G(this, 597330094, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, 666761793);
        super.onPause();
        this.f60507K.B();
        this.f60506J.removeCallbacksAndMessages(null);
        getActivity().getWindow().setSoftInputMode(0);
        AnonymousClass0cQ.G(this, 160462824, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -1569541694);
        super.onResume();
        getActivity().getWindow().setSoftInputMode(16);
        AnonymousClass0cQ.G(this, 197739478, F);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, 632021633);
        super.onStart();
        AnonymousClass0cQ.G(this, -1970576078, F);
    }

    public final void onStop() {
        int F = AnonymousClass0cQ.F(this, 1949040369);
        super.onStop();
        AnonymousClass0cQ.G(this, -1795609670, F);
    }
}

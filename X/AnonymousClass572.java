package X;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.facebook.C0164R;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.572 */
public final class AnonymousClass572 extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass0Pc, AnonymousClass2Gm {
    /* renamed from: B */
    public AnonymousClass3Vu f60252B;
    /* renamed from: C */
    public AnonymousClass3Wk f60253C;
    /* renamed from: D */
    public TextSwitcher f60254D;
    /* renamed from: E */
    public long f60255E;
    /* renamed from: F */
    public final AnonymousClass0N2 f60256F = AnonymousClass0N2.B();
    /* renamed from: G */
    public boolean f60257G;
    /* renamed from: H */
    public TextView f60258H;
    /* renamed from: I */
    private ViewGroup f60259I;
    /* renamed from: J */
    private final AnonymousClass0F8 f60260J = new AnonymousClass56v(this);
    /* renamed from: K */
    private final AnonymousClass0F8 f60261K = new AnonymousClass56u(this);
    /* renamed from: L */
    private AnonymousClass0Cn f60262L;
    /* renamed from: M */
    private TextView f60263M;
    /* renamed from: N */
    private AnonymousClass0gX f60264N;

    public final String getModuleName() {
        return "landing_facebook";
    }

    /* renamed from: C */
    public static CharSequence m25776C(AnonymousClass572 anonymousClass572) {
        if (AnonymousClass572.m25778E(anonymousClass572)) {
            return anonymousClass572.getString(C0164R.string.log_in_title);
        }
        return Html.fromHtml(anonymousClass572.getString(C0164R.string.already_have_an_account_log_in));
    }

    /* renamed from: D */
    public static void m25777D(AnonymousClass572 anonymousClass572) {
        AnonymousClass0gb ET = anonymousClass572.f60264N.ET();
        if (ET.B("ig_landing_screen_text")) {
            String str;
            if (ET.f8201E != null) {
                str = ET.f8201E;
            } else {
                str = anonymousClass572.getString(C0164R.string.zero_rating_default_carrier_string);
            }
            anonymousClass572.f60263M.setText(anonymousClass572.getResources().getString(C0164R.string.zero_rating_landing_screen_text, new Object[]{str}));
            Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(250);
            anonymousClass572.f60263M.startAnimation(alphaAnimation);
            return;
        }
        anonymousClass572.f60263M.setText(JsonProperty.USE_DEFAULT_NAME);
    }

    /* renamed from: E */
    public static boolean m25778E(AnonymousClass572 anonymousClass572) {
        return AnonymousClass0Om.E(anonymousClass572.getContext()) ^ 1;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f60253C.xc(i, i2, intent);
    }

    public final boolean onBackPressed() {
        AnonymousClass0Fr.RegBackPressed.F(AnonymousClass2Na.LANDING_STEP).E();
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1787563163);
        super.onCreate(bundle);
        this.f60262L = AnonymousClass0Ce.I(this);
        AnonymousClass0lj anonymousClass0lj = new AnonymousClass0lj();
        AnonymousClass0Cn anonymousClass0Cn = this.f60262L;
        AnonymousClass2Na anonymousClass2Na = AnonymousClass2Na.LANDING_STEP;
        this.f60253C = new AnonymousClass3Wk(anonymousClass0Cn, this, anonymousClass2Na, this);
        anonymousClass0lj.L(new AnonymousClass3X1(this.f60262L, getActivity(), this, anonymousClass2Na));
        anonymousClass0lj.L(this.f60253C);
        a(anonymousClass0lj);
        AnonymousClass3Vu anonymousClass3Vu = new AnonymousClass3Vu(this.f60262L, this, anonymousClass2Na);
        this.f60252B = anonymousClass3Vu;
        anonymousClass3Vu.A();
        getActivity().getWindow().setSoftInputMode(32);
        this.f60264N = AnonymousClass0gV.B(null);
        AnonymousClass17f.B(this.f60262L).A();
        AnonymousClass3X4.B(AnonymousClass0Fr.RegScreenLoaded.F(anonymousClass2Na)).E();
        AnonymousClass58C.m25814C(this.f60262L, this, anonymousClass2Na);
        AnonymousClass0cQ.G(this, 324816886, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int F = AnonymousClass0cQ.F(this, -671537386);
        boolean E = AnonymousClass572.m25778E(this);
        View inflate = layoutInflater.inflate(AnonymousClass572.m25778E(this) ? C0164R.layout.landing_prominent_login : C0164R.layout.landing_prominent_facebook, viewGroup, false);
        this.f60259I = (ViewGroup) inflate.findViewById(C0164R.id.button_group);
        ImageView imageView = (ImageView) inflate.findViewById(C0164R.id.logo);
        AnonymousClass3X4.H(getContext(), imageView, inflate.findViewById(C0164R.id.subtitle));
        AnonymousClass3Xy.E(imageView, AnonymousClass0G5.F(getContext(), C0164R.attr.nuxLogoTintColor));
        this.f60263M = (TextView) inflate.findViewById(C0164R.id.zero_rating_landing_page_text_view);
        AnonymousClass572.m25777D(this);
        if (E) {
            i = AnonymousClass572.m25778E(this) ? C0164R.layout.email_or_phone_plus_login_button_group : C0164R.layout.email_or_phone_button_group;
        } else {
            i = C0164R.layout.facebook_button_group;
        }
        layoutInflater.inflate(i, this.f60259I);
        if (!E) {
            Resources resources = getResources();
            TextSwitcher textSwitcher = (TextSwitcher) inflate.findViewById(C0164R.id.facebook_text_switcher);
            this.f60254D = textSwitcher;
            textSwitcher.setFactory(new AnonymousClass56y(this, resources));
            this.f60254D.setCurrentText(getString(C0164R.string.log_in_with_facebook));
            this.f60254D.setOnClickListener(new AnonymousClass56z(this));
            this.f60254D.setBackgroundResource(AnonymousClass0G5.F(getContext(), C0164R.attr.nuxActionButtonBackground));
            this.f60255E = SystemClock.elapsedRealtime();
            this.f60257G = false;
            boolean z = this.f60256F.f3500C.getBoolean("analytics_device_id_external", false);
            if (z || AnonymousClass0Om.E(getContext())) {
                TextView textView = (TextView) inflate.findViewById(C0164R.id.social_context);
                this.f60258H = textView;
                textView.setVisibility(0);
                View findViewById = inflate.findViewById(C0164R.id.divider);
                LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
                layoutParams.setMargins(0, 0, 0, 0);
                findViewById.setLayoutParams(layoutParams);
            }
            if (z) {
                AnonymousClass0GA E2 = AnonymousClass2Eh.E(AnonymousClass0Dt.f1941C.A(getContext()), this.f60256F.B(), null, false, "landing");
                E2.f2849B = new AnonymousClass571(this, "phone_id");
                schedule(E2);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(C0164R.id.sign_up_with_email_or_phone);
        textView2.setOnClickListener(new AnonymousClass56w(this));
        textView2.setText(AnonymousClass572.m25778E(this) ? C0164R.string.create_new_account_title : C0164R.string.sign_up_with_email_or_phone);
        TextView textView3 = (TextView) inflate.findViewById(C0164R.id.log_in_button);
        textView3.setText(AnonymousClass572.m25776C(this));
        if (!AnonymousClass572.m25778E(this)) {
            AnonymousClass3Xc.H(new TextView[]{textView3});
            AnonymousClass3Xc.F(new TextView[]{textView3});
        }
        textView3.setOnClickListener(new AnonymousClass56x(this));
        AnonymousClass3aV.B(getActivity(), this);
        AnonymousClass0cQ.G(this, 913868003, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -503136344);
        super.onDestroyView();
        AnonymousClass0F4.f2058E.D(AnonymousClass0ky.class, this.f60260J);
        this.f60259I = null;
        this.f60254D = null;
        this.f60258H = null;
        this.f60263M = null;
        AnonymousClass0cQ.G(this, -359712677, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -4092273);
        super.onPause();
        AnonymousClass0F4.f2058E.D(AnonymousClass23Z.class, this.f60261K);
        AnonymousClass0cQ.G(this, -1528468534, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, 862200392);
        super.onResume();
        AnonymousClass0F4.f2058E.A(AnonymousClass23Z.class, this.f60261K);
        AnonymousClass0cQ.G(this, 528775597, F);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, -1821100845);
        super.onStart();
        this.f60264N.GC(this);
        AnonymousClass0cQ.G(this, -9230632, F);
    }

    public final void onStop() {
        int F = AnonymousClass0cQ.F(this, -1479876037);
        super.onStop();
        this.f60264N.sJA(this);
        AnonymousClass0cQ.G(this, -1080507106, F);
    }

    public final void onTokenChange() {
        AnonymousClass0Sy.F(new AnonymousClass570(this));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass0F4.f2058E.A(AnonymousClass0ky.class, this.f60260J);
    }
}

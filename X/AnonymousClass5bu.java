package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.Arrays;

/* renamed from: X.5bu */
public final class AnonymousClass5bu extends AnonymousClass5Xf implements AnonymousClass4rb {
    /* renamed from: B */
    public boolean f67194B;
    /* renamed from: C */
    public View f67195C;
    /* renamed from: D */
    public AnonymousClass3Pu f67196D;
    /* renamed from: E */
    public AnonymousClass3Q0 f67197E;
    /* renamed from: F */
    public TextView f67198F;
    /* renamed from: G */
    public boolean f67199G;
    /* renamed from: H */
    public SpannableStringBuilder f67200H;
    /* renamed from: I */
    public AnonymousClass3Pu f67201I;
    /* renamed from: J */
    public View f67202J;
    /* renamed from: K */
    public ScrollView f67203K;
    /* renamed from: L */
    private String f67204L;
    /* renamed from: M */
    private AnonymousClass4rZ f67205M;
    /* renamed from: N */
    private ProgressButton f67206N;

    public final String getModuleName() {
        return "instagram_terms_flow";
    }

    /* renamed from: C */
    public static void m27952C(AnonymousClass5bu anonymousClass5bu) {
        Drawable transitionDrawable = new TransitionDrawable(new ColorDrawable[]{new ColorDrawable(AnonymousClass0Ca.C(anonymousClass5bu.getContext(), C0164R.color.blue_0)), new ColorDrawable(AnonymousClass0Ca.C(anonymousClass5bu.getContext(), C0164R.color.white))});
        anonymousClass5bu.f67195C.setBackground(transitionDrawable);
        transitionDrawable.startTransition(StartupQEsConfig.DEFAULT_IDLE_MAX_INTERVAL_MS);
    }

    /* renamed from: D */
    public static void m27953D(AnonymousClass5bu anonymousClass5bu) {
        AnonymousClass0IL anonymousClass0IL = anonymousClass5bu;
        AnonymousClass3Po.C().B(AnonymousClass3Pm.CONSENT_ACTION, AnonymousClass3Pq.NEXT, anonymousClass0IL, anonymousClass5bu, anonymousClass5bu.f67204L);
        anonymousClass5bu.f67205M.m25213A();
        AnonymousClass3Q3 anonymousClass3Q3 = new AnonymousClass3Q3(anonymousClass5bu.getContext(), AnonymousClass3Q9.B().f41084O, AnonymousClass3Q9.B().f41080K, AnonymousClass3Q9.B().f41076G, anonymousClass5bu.f65945C);
        anonymousClass3Q3.A(Arrays.asList(new AnonymousClass3Pu[]{anonymousClass0IL.f67196D, anonymousClass0IL.f67201I}), Arrays.asList(new AnonymousClass3Q0[]{anonymousClass0IL.f67197E, AnonymousClass3Q0.CONSENT}));
        AnonymousClass3Q4.C(anonymousClass3Q3, new AnonymousClass4qs(anonymousClass0IL.getContext(), anonymousClass0IL, anonymousClass0IL.f67205M));
    }

    public final void UMA(AnonymousClass3Q0 anonymousClass3Q0, String str) {
        this.f67205M.f57923E.setVisibility(0);
        this.f67206N.setVisibility(8);
        this.f67197E = anonymousClass3Q0;
        this.f67204L = str;
        AnonymousClass4rZ anonymousClass4rZ = this.f67205M;
        anonymousClass4rZ.f57921C = true;
        anonymousClass4rZ.f57923E.setEnabled(anonymousClass4rZ.f57921C);
        this.f67198F.setText(this.f67200H);
        AnonymousClass4rh anonymousClass4rh = (AnonymousClass4rh) this.f67202J.getTag();
        if (anonymousClass4rh != null && this.f67201I != null) {
            if ((this.f67197E == AnonymousClass3Q0.WITHDRAW || this.f67197E == AnonymousClass3Q0.BLOCKING) && !this.f67199G) {
                this.f67199G = true;
                Context context = getContext();
                ViewGroup viewGroup = anonymousClass4rh.f57936B;
                TextView textView = (TextView) LayoutInflater.from(context).inflate(C0164R.layout.gdpr_text_view, viewGroup, false);
                textView.setText(this.f67201I.A(0));
                viewGroup.addView(textView, 1);
            }
            if (this.f67197E == AnonymousClass3Q0.CONSENT && this.f67199G) {
                this.f67199G = false;
                anonymousClass4rh.f57936B.removeViewAt(1);
            }
        }
    }

    public final AnonymousClass3Pp YM() {
        if (AnonymousClass3Q9.B().f41080K == AnonymousClass3Q5.TOS_AND_TWO_BUTTON_AGE) {
            return AnonymousClass3Pp.TOS_TWO_BUTTON;
        }
        if (AnonymousClass3Q9.B().f41080K == AnonymousClass3Q5.TOS_AND_THREE_BUTTON_AGE) {
            return AnonymousClass3Pp.TOS_THREE_BUTTON;
        }
        return AnonymousClass3Pp.NONE;
    }

    public final void ms() {
        AnonymousClass5bu anonymousClass5bu = this;
        super.ms();
        if (this.f67197E == AnonymousClass3Q0.BLOCKING && AnonymousClass3Q9.B().f41084O == AnonymousClass3Q8.EXISTING_USER) {
            AnonymousClass3Po.C().G(AnonymousClass3Pm.CONSENT_VIEW, this, AnonymousClass3Pp.AGE_DIALOG);
            AnonymousClass0Ss.G(getActivity(), getString(C0164R.string.confirm_age_dialog_title), getString(C0164R.string.confirm_age_dialog_body, new Object[]{Integer.valueOf(AnonymousClass3Q6.f41060H)}), anonymousClass5bu, new AnonymousClass4rO(this), new AnonymousClass4rP(this), getString(C0164R.string.confirm), getString(C0164R.string.cancel));
            return;
        }
        AnonymousClass5bu.m27953D(this);
    }

    public final void onCreate(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, -1980424383);
        super.onCreate(bundle);
        this.f67196D = AnonymousClass3Q9.B().f41073D.f41007B;
        this.f67201I = AnonymousClass3Q9.B().f41073D.f41012G;
        this.f67197E = AnonymousClass3Q0.SEEN;
        this.f67194B = false;
        this.f67199G = false;
        AnonymousClass0cQ.G(this, 2075978412, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1094259264);
        View inflate = layoutInflater.inflate(C0164R.layout.gdpr_single_page_consent_layout, viewGroup, false);
        this.f67203K = (ScrollView) inflate.findViewById(C0164R.id.consent_scroll_view);
        this.f67202J = AnonymousClass4ri.m25221C(getContext(), inflate.findViewById(C0164R.id.policy_review));
        this.f67195C = AnonymousClass4rd.m25215C(getContext(), inflate.findViewById(C0164R.id.age_confirm));
        this.f67205M = new AnonymousClass4rZ((ProgressButton) inflate.findViewById(C0164R.id.agree_button), AnonymousClass3Q9.B().f41079J, true, this);
        registerLifecycleListener(this.f67205M);
        ProgressButton progressButton = (ProgressButton) inflate.findViewById(C0164R.id.disable_clickable_button);
        this.f67206N = progressButton;
        progressButton.setText(AnonymousClass3Q9.B().f41079J);
        this.f67206N.setTextColor(AnonymousClass0Ca.C(getContext(), C0164R.color.blue_5_30_transparent));
        this.f67206N.setOnClickListener(new AnonymousClass4rM(this));
        this.f67200H = AnonymousClass0Ss.B(getContext(), C0164R.string.see_other_options, C0164R.string.other_options, new AnonymousClass4rQ(this, AnonymousClass0Ca.C(getContext(), C0164R.color.blue_8)));
        TextView textView = (TextView) inflate.findViewById(C0164R.id.back_to_top_textview);
        this.f67198F = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f67198F.setText(AnonymousClass0Ss.B(getContext(), C0164R.string.back_to_top_text, C0164R.string.back_to_top_inner_text, new AnonymousClass4rR(this, AnonymousClass0Ca.C(getContext(), C0164R.color.blue_8))).append(" ").append(this.f67200H));
        if (VERSION.SDK_INT >= 23) {
            this.f67203K.setOnScrollChangeListener(new AnonymousClass4rN(this));
        }
        AnonymousClass3Po.C().F(AnonymousClass3Pm.CONSENT_VIEW, this, this);
        if (this.f67201I != null) {
            this.f67202J.setVisibility(0);
            AnonymousClass4ri.m25220B(getContext(), this.f65945C, (AnonymousClass4rh) this.f67202J.getTag(), this.f67201I, this, this);
        } else {
            this.f67202J.setVisibility(8);
        }
        if (this.f67196D != null) {
            this.f67195C.setVisibility(0);
            AnonymousClass4rd.m25214B(getContext(), (AnonymousClass4rc) this.f67195C.getTag(), this.f67196D, this);
        } else {
            this.f67195C.setVisibility(8);
        }
        AnonymousClass0cQ.G(this, -1541992329, F);
        return inflate;
    }

    public final void onDestroy() {
        int F = AnonymousClass0cQ.F(this, 1420155622);
        super.onDestroy();
        unregisterLifecycleListener(this.f67205M);
        AnonymousClass0cQ.G(this, -95654304, F);
    }
}

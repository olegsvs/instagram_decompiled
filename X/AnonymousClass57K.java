package X;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.57K */
public final class AnonymousClass57K extends AnonymousClass0IJ implements AnonymousClass0IS, AnonymousClass2Ds, AnonymousClass2Gm {
    /* renamed from: B */
    public AnonymousClass3Vu f60298B;
    /* renamed from: C */
    public AnonymousClass55n f60299C;
    /* renamed from: D */
    public String f60300D;
    /* renamed from: E */
    public boolean f60301E;
    /* renamed from: F */
    public View f60302F;
    /* renamed from: G */
    public View f60303G;
    /* renamed from: H */
    public TextView f60304H;
    /* renamed from: I */
    public AnonymousClass3Wk f60305I;
    /* renamed from: J */
    public final AnonymousClass0F8 f60306J = new AnonymousClass57A(this);
    /* renamed from: K */
    public List f60307K;
    /* renamed from: L */
    public AutoCompleteTextView f60308L;
    /* renamed from: M */
    public final Map f60309M = new HashMap();
    /* renamed from: N */
    public boolean f60310N = false;
    /* renamed from: O */
    public boolean f60311O = false;
    /* renamed from: P */
    public boolean f60312P;
    /* renamed from: Q */
    public AnonymousClass55m f60313Q;
    /* renamed from: R */
    public Dialog f60314R;
    /* renamed from: S */
    public EditText f60315S;
    /* renamed from: T */
    public CheckBox f60316T;
    /* renamed from: U */
    public AnonymousClass0Cn f60317U;
    /* renamed from: V */
    public boolean f60318V = true;
    /* renamed from: W */
    private final AnonymousClass0F8 f60319W = new AnonymousClass579(this);
    /* renamed from: X */
    private final Handler f60320X = new Handler();
    /* renamed from: Y */
    private ProgressButton f60321Y;
    /* renamed from: Z */
    private final TextWatcher f60322Z = new AnonymousClass578(this);

    public final String getModuleName() {
        return "login_landing";
    }

    /* renamed from: C */
    public static void m25783C(X.AnonymousClass57K r16, boolean r17) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new java.util.Date;
        r0.<init>();
        r2 = r0.getTime();
        r0 = 1347336060000; // 0x139b37cbc60 float:-5.884465E-8 double:6.65672460649E-312;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x0019;
    L_0x0012:
        r0 = 2131693486; // 0x7f0f0fae float:1.9016102E38 double:1.053196519E-314;
        X.AnonymousClass0IG.F(r0);
        return;
    L_0x0019:
        r12 = r16;
        r0 = r12.f60308L;
        r4 = X.AnonymousClass0Nm.K(r0);
        r0 = X.AnonymousClass0Fr.LogInAttempt;
        r2 = X.AnonymousClass2Na.LOGIN_STEP;
        r1 = r0.F(r2);
        r0 = "log_in_token";
        r1 = r1.B(r0, r4);
        r0 = "keyboard";
        r3 = r17;
        r0 = r1.C(r0, r3);
        r0.E();
        r0 = r12.getContext();
        r7 = X.AnonymousClass0Dt.B(r0);
        r1 = X.AnonymousClass0Dt.f1941C;
        r0 = r12.getContext();
        r8 = r1.A(r0);
        r0 = r12.f60315S;
        r5 = X.AnonymousClass0Nm.K(r0);
        r1 = r12.getActivity();	 Catch:{ IOException -> 0x005b }
        r11 = X.AnonymousClass3a8.B(r1, r2);	 Catch:{ IOException -> 0x005b }
        goto L_0x005c;	 Catch:{ IOException -> 0x005b }
    L_0x005b:
        r11 = 0;
    L_0x005c:
        r3 = r12.f60317U;
        r0 = X.AnonymousClass0i7.B();
        r6 = r0.D();
        r9 = X.AnonymousClass1Pj.E();
        r10 = r12.f60307K;
        r0 = X.AnonymousClass1fi.E(r3, r4, r5, r6, r7, r8, r9, r10, r11);
        r11 = new X.57J;
        r13 = r12;
        r17 = r12;
        r14 = r4;
        r15 = r5;
        r11.<init>(r12, r13, r14, r15, r16, r17);
        r0.f2849B = r11;
        r12.schedule(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.57K.C(X.57K, boolean):void");
    }

    /* renamed from: D */
    public static void m25784D(AnonymousClass57K anonymousClass57K, AnonymousClass2Du anonymousClass2Du) {
        boolean z = anonymousClass2Du != null && anonymousClass2Du.f27714C;
        AnonymousClass0IL E = AnonymousClass0GO.C().A().E(anonymousClass57K.f60317U.getToken(), AnonymousClass0Nm.K(anonymousClass57K.f60308L), z);
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass57K.getActivity());
        anonymousClass0IZ.f2754D = E;
        anonymousClass0IZ.B();
    }

    /* renamed from: E */
    public static void m25785E(AnonymousClass57K anonymousClass57K, boolean z) {
        anonymousClass57K.f60318V = z;
        int i = 0;
        anonymousClass57K.f60303G.setVisibility(anonymousClass57K.f60318V ? 0 : 4);
        View view = anonymousClass57K.f60302F;
        if (!anonymousClass57K.f60318V) {
            i = 4;
        }
        view.setVisibility(i);
    }

    /* renamed from: F */
    public static void m25786F(AnonymousClass57K anonymousClass57K) {
        if (anonymousClass57K.f60312P) {
            anonymousClass57K.f60308L.setEnabled(false);
            anonymousClass57K.f60315S.setEnabled(false);
            anonymousClass57K.f60321Y.setShowProgressBar(true);
            anonymousClass57K.f60321Y.setEnabled(false);
            return;
        }
        anonymousClass57K.f60308L.setEnabled(true);
        anonymousClass57K.f60315S.setEnabled(true);
        anonymousClass57K.f60321Y.setShowProgressBar(false);
        if (TextUtils.isEmpty(AnonymousClass0Nm.K(anonymousClass57K.f60308L)) || TextUtils.isEmpty(AnonymousClass0Nm.K(anonymousClass57K.f60315S)) || anonymousClass57K.f60301E) {
            anonymousClass57K.f60321Y.setEnabled(false);
        } else {
            anonymousClass57K.f60321Y.setEnabled(true);
        }
    }

    /* renamed from: G */
    private static boolean m25787G(Context context) {
        boolean z = false;
        if (AnonymousClass0dp.B().E()) {
            if (((Boolean) AnonymousClass0E6.B(AnonymousClass0CC.Ub)).booleanValue()) {
                return ((Boolean) AnonymousClass0CC.Wb.G()).booleanValue();
            }
            if (((Boolean) AnonymousClass0E6.B(AnonymousClass0CC.Vb)).booleanValue() && !AnonymousClass0Om.E(context) && ((Boolean) AnonymousClass0CC.Xb.G()).booleanValue()) {
                z = true;
            }
        }
        return z;
    }

    public final void MBA(AnonymousClass2Du anonymousClass2Du) {
        AnonymousClass57K.m25784D(this, anonymousClass2Du);
    }

    public final void QBA(String str, String str2, String str3, boolean z, boolean z2, boolean z3, Bundle bundle, boolean z4) {
        AnonymousClass0OR.D(this.f60320X, new AnonymousClass576(this, str, str2, str3, z, z2, z3, bundle, z4), 637050733);
    }

    public final void Sq() {
        if (AnonymousClass0i7.B().E()) {
            this.f60305I.B(AnonymousClass0i7.B().A(), AnonymousClass0i7.B().C(), true);
        } else {
            this.f60305I.A(AnonymousClass0mR.LOG_IN);
        }
    }

    public final void as() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r9 = this;
        r0 = r9.f60308L;
        r0 = r0.getText();
        r5 = r0.toString();
        r0 = android.util.Patterns.EMAIL_ADDRESS;
        r0 = r0.matcher(r5);
        r0 = r0.matches();
        if (r0 == 0) goto L_0x0031;
    L_0x0016:
        r0 = X.AnonymousClass0CC.jY;
        r0 = r0.G();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0031;
    L_0x0024:
        r4 = new com.instagram.login.api.RegistrationFlowExtras;
        r4.<init>();
        r0 = X.AnonymousClass0Oh.EMAIL;
        r4.F(r0);
        r4.f27655H = r5;
        goto L_0x009e;
    L_0x0031:
        r0 = android.util.Patterns.PHONE;
        r0 = r0.matcher(r5);
        r0 = r0.matches();
        if (r0 == 0) goto L_0x0099;
    L_0x003d:
        r0 = X.AnonymousClass0CC.jY;
        r0 = r0.G();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0099;
    L_0x004b:
        r0 = r9.getActivity();
        r0 = X.AnonymousClass3a3.E(r0);
        r1 = r0.f28032B;
        r0 = r9.getActivity();
        r8 = com.facebook.phonenumbers.PhoneNumberUtil.C(r0);
        r4 = new com.instagram.login.api.RegistrationFlowExtras;
        r4.<init>();
        r0 = X.AnonymousClass0Oh.PHONE;
        r4.F(r0);
        r7 = r8.T(r5, r1);	 Catch:{ 1w5 -> 0x008f }
        r6 = "%d";	 Catch:{ 1w5 -> 0x008f }
        r0 = 1;	 Catch:{ 1w5 -> 0x008f }
        r3 = new java.lang.Object[r0];	 Catch:{ 1w5 -> 0x008f }
        r2 = 0;	 Catch:{ 1w5 -> 0x008f }
        r0 = r7.f24507N;	 Catch:{ 1w5 -> 0x008f }
        r0 = java.lang.Long.valueOf(r0);	 Catch:{ 1w5 -> 0x008f }
        r3[r2] = r0;	 Catch:{ 1w5 -> 0x008f }
        r0 = X.AnonymousClass0IE.E(r6, r3);	 Catch:{ 1w5 -> 0x008f }
        r4.f27667T = r0;	 Catch:{ 1w5 -> 0x008f }
        r2 = new com.instagram.phonenumber.model.CountryCodeData;	 Catch:{ 1w5 -> 0x008f }
        r1 = r7.f24496C;	 Catch:{ 1w5 -> 0x008f }
        r0 = r7.f24496C;	 Catch:{ 1w5 -> 0x008f }
        r0 = r8.H(r0);	 Catch:{ 1w5 -> 0x008f }
        r2.<init>(r1, r0);	 Catch:{ 1w5 -> 0x008f }
        r4.f27652E = r2;	 Catch:{ 1w5 -> 0x008f }
        goto L_0x0098;	 Catch:{ 1w5 -> 0x008f }
    L_0x008f:
        r1 = "LoginLandingFragment.parseUserHintPhoneNumberError";
        r0 = "Error parsing phone number.";
        X.AnonymousClass0Gn.C(r1, r0);
        r4.f27667T = r5;
    L_0x0098:
        goto L_0x009e;
    L_0x0099:
        r4 = new com.instagram.login.api.RegistrationFlowExtras;
        r4.<init>();
    L_0x009e:
        r0 = X.AnonymousClass0GO.C();
        r2 = r0.A();
        r1 = r4.G();
        r0 = r9.f60317U;
        r0 = r0.getToken();
        r2 = r2.C(r1, r0);
        r1 = r9.getFragmentManager();
        r0 = "android.nux.ContactPointTriageFragment";
        X.AnonymousClass3X4.K(r1, r2, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.57K.as():void");
    }

    public final void ez() {
        AnonymousClass0GA I = AnonymousClass1fi.I(getContext(), AnonymousClass0Nm.K(this.f60308L));
        I.f2849B = new AnonymousClass1fk(getContext(), null);
        schedule(I);
    }

    public final void gz() {
        String K = AnonymousClass0Nm.K(this.f60308L);
        String B = AnonymousClass0Dt.B(getContext());
        String A = AnonymousClass0Dt.f1941C.A(getContext());
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(AnonymousClass0G7.G());
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "accounts/send_password_reset/";
        AnonymousClass0GA H = anonymousClass0Pt.D("username", K).D("device_id", B).D("guid", A).M(AnonymousClass2aL.class).N().H();
        H.f2849B = new AnonymousClass1fk(getContext(), null);
        schedule(H);
    }

    public final void hz() {
        schedule(AnonymousClass1fi.G(getContext(), AnonymousClass0Nm.K(this.f60308L), null, false));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f60305I.xc(i, i2, intent);
    }

    public final boolean onBackPressed() {
        AnonymousClass0Fr.RegBackPressed.F(AnonymousClass2Na.LOGIN_STEP).E();
        return false;
    }

    public final void onCreate(Bundle bundle) {
        Bundle arguments;
        int F = AnonymousClass0cQ.F(this, 1983981610);
        super.onCreate(bundle);
        if (getArguments() != null && AnonymousClass4yt.m25517B(getArguments())) {
            AnonymousClass4yt.m25518C(getArguments(), getActivity(), getLoaderManager(), this);
            arguments = getArguments();
            if (arguments != null) {
                arguments.remove("original_url");
            }
        }
        this.f60317U = AnonymousClass0Ce.I(this);
        this.f60301E = false;
        if (bundle != null && bundle.containsKey("LoginLandingFragment.LOGIN_FAILED")) {
            this.f60301E = bundle.getBoolean("LoginLandingFragment.LOGIN_FAILED");
        }
        AnonymousClass0lj anonymousClass0lj = new AnonymousClass0lj();
        AnonymousClass0Cn anonymousClass0Cn = this.f60317U;
        AnonymousClass2Na anonymousClass2Na = AnonymousClass2Na.LOGIN_STEP;
        this.f60305I = new AnonymousClass3Wk(anonymousClass0Cn, this, anonymousClass2Na, this);
        anonymousClass0lj.L(new AnonymousClass3X1(this.f60317U, getActivity(), this, anonymousClass2Na));
        anonymousClass0lj.L(this.f60305I);
        anonymousClass0lj.L(new AnonymousClass4Av(this.f60317U, this, AnonymousClass4Au.LOGIN));
        a(anonymousClass0lj);
        AnonymousClass3Vu anonymousClass3Vu = new AnonymousClass3Vu(this.f60317U, this, anonymousClass2Na);
        this.f60298B = anonymousClass3Vu;
        anonymousClass3Vu.A();
        arguments = getArguments();
        if (arguments != null) {
            this.f60310N = arguments.getBoolean("IS_ADD_ACCOUNT_FLOW", false);
            this.f60311O = arguments.getBoolean("is_current_user_fb_connected", false);
            this.f60300D = arguments.getString("current_username");
        }
        AnonymousClass3X4.B(AnonymousClass0Fr.RegScreenLoaded.F(anonymousClass2Na)).E();
        registerLifecycleListener(AnonymousClass0kr.B(getActivity()));
        AnonymousClass58C.m25814C(this.f60317U, this, anonymousClass2Na);
        schedule(new AnonymousClass577(this));
        AnonymousClass0cQ.G(this, -1450087778, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TextView textView;
        int F = AnonymousClass0cQ.F(this, 1301732880);
        View inflate = layoutInflater.inflate(C0164R.layout.reg_container, viewGroup, false);
        View inflate2 = layoutInflater.inflate(C0164R.layout.login_landing, (ViewGroup) inflate.findViewById(C0164R.id.content_container), true);
        ImageView imageView = (ImageView) inflate.findViewById(C0164R.id.login_landing_logo);
        AnonymousClass3X4.H(getContext(), imageView, null);
        AnonymousClass3Xy.E(imageView, AnonymousClass0G5.F(getContext(), C0164R.attr.nuxLogoTintColor));
        this.f60302F = inflate2.findViewById(C0164R.id.login_or_divider);
        this.f60308L = (AutoCompleteTextView) inflate.findViewById(C0164R.id.login_username);
        AnonymousClass568 anonymousClass568 = new AnonymousClass568(this.f60308L, getContext(), AnonymousClass2Na.TYPEAHEAD_LOGIN);
        anonymousClass568.f60089B = getResources().getDimensionPixelOffset(C0164R.dimen.field_with_glyph_left_padding);
        anonymousClass568.f60093F = new AnonymousClass5ZZ(this);
        AnonymousClass56A anonymousClass56A = new AnonymousClass56A(anonymousClass568);
        inflate2 = this.f60308L;
        inflate2.addOnLayoutChangeListener(new AnonymousClass55r(getResources(), inflate2, inflate2));
        this.f60299C = new AnonymousClass55n(this, this);
        AnonymousClass55m anonymousClass5Za = new AnonymousClass5Za(this, anonymousClass56A);
        this.f60299C.m25714D(anonymousClass5Za);
        this.f60313Q = anonymousClass5Za;
        EditText editText = (EditText) inflate.findViewById(C0164R.id.password);
        this.f60315S = editText;
        editText.setTypeface(Typeface.DEFAULT);
        this.f60315S.setTransformationMethod(new PasswordTransformationMethod());
        this.f60315S.setImeOptions(6);
        this.f60315S.setOnEditorActionListener(new AnonymousClass57B(this));
        ProgressButton progressButton = (ProgressButton) inflate.findViewById(C0164R.id.next_button);
        this.f60321Y = progressButton;
        progressButton.setOnClickListener(new AnonymousClass57C(this));
        this.f60303G = inflate.findViewById(C0164R.id.login_facebook_container);
        TextView textView2 = (TextView) inflate.findViewById(C0164R.id.login_facebook);
        this.f60304H = textView2;
        AnonymousClass3Xy.F(textView2, C0164R.color.blue_5);
        this.f60303G.setOnClickListener(new AnonymousClass57D(this));
        AnonymousClass3Wk.F(this, AnonymousClass2Na.LOGIN_STEP, this.f60304H, this.f60303G);
        if (((Boolean) AnonymousClass0CC.CT.G()).booleanValue()) {
            inflate.findViewById(C0164R.id.login_forgot_button).setVisibility(8);
            textView = (TextView) inflate.findViewById(C0164R.id.new_login_forgot_button);
            textView.setText(new SpannableStringBuilder(getString(C0164R.string.new_user_forgot_password_message)));
            Rect rect = new Rect();
            textView.getHitRect(rect);
            Rect rect2 = new Rect();
            ViewGroup viewGroup2 = (ViewGroup) textView.getParent();
            viewGroup2.getHitRect(rect2);
            rect.top = rect2.top;
            rect.bottom = rect2.bottom;
            viewGroup2.setTouchDelegate(new TouchDelegate(rect, textView));
            textView.setVisibility(0);
        } else {
            textView = (TextView) inflate.findViewById(C0164R.id.login_forgot_button);
            textView.setText(Html.fromHtml(getString(C0164R.string.user_forgot_password_message)));
        }
        textView.setOnClickListener(new AnonymousClass57E(this));
        TextView textView3 = (TextView) inflate.findViewById(C0164R.id.log_in_button);
        if (AnonymousClass0G5.B(getContext(), C0164R.attr.nuxAllowSignUpFlow, true)) {
            textView3.setText(Html.fromHtml(getString(C0164R.string.user_signup_message)));
            textView3.setOnClickListener(new AnonymousClass57F(this));
            AnonymousClass3Xc.G(this.f60321Y, new TextView[]{textView, textView3});
            AnonymousClass3Xc.F(new TextView[]{textView, textView3});
        } else {
            textView3.setVisibility(8);
            AnonymousClass3Xc.G(this.f60321Y, new TextView[]{textView});
            AnonymousClass3Xc.F(new TextView[]{textView});
        }
        AnonymousClass0FC.B().IJA(this.f60308L);
        AnonymousClass0FC.B().IJA(this.f60315S);
        this.f60308L.setOnFocusChangeListener(new AnonymousClass57G(this));
        this.f60315S.setOnFocusChangeListener(new AnonymousClass574(this));
        AnonymousClass57K.m25786F(this);
        AnonymousClass0cQ.G(this, 1895926441, F);
        return inflate;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -221206744);
        super.onDestroyView();
        AnonymousClass0FC.B().qVA(this.f60308L);
        AnonymousClass0FC.B().qVA(this.f60315S);
        AnonymousClass0F4.f2058E.D(AnonymousClass0ky.class, this.f60319W);
        AnonymousClass0F4.f2058E.D(AnonymousClass55l.class, this.f60306J);
        this.f60308L = null;
        this.f60315S = null;
        this.f60321Y = null;
        this.f60303G = null;
        this.f60304H = null;
        this.f60302F = null;
        this.f60299C = null;
        this.f60316T = null;
        AnonymousClass0cQ.G(this, -1326857595, F);
    }

    public final void onPause() {
        int F = AnonymousClass0cQ.F(this, -767177829);
        super.onPause();
        this.f60308L.removeTextChangedListener(this.f60322Z);
        this.f60315S.removeTextChangedListener(this.f60322Z);
        AnonymousClass0Nm.N(getView());
        getActivity().getWindow().setSoftInputMode(3);
        Dialog dialog = this.f60314R;
        if (dialog != null && dialog.isShowing()) {
            this.f60314R.dismiss();
        }
        AnonymousClass0cQ.G(this, 1451566328, F);
    }

    public final void onResume() {
        int F = AnonymousClass0cQ.F(this, -293242861);
        super.onResume();
        this.f60308L.addTextChangedListener(this.f60322Z);
        this.f60315S.addTextChangedListener(this.f60322Z);
        getActivity().getWindow().setSoftInputMode(16);
        if (AnonymousClass0e8.D(getContext())) {
            this.f60315S.setGravity(21);
        } else {
            this.f60315S.setGravity(16);
        }
        AnonymousClass57K.m25786F(this);
        AnonymousClass0cQ.G(this, 1351198721, F);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("LoginLandingFragment.LOGIN_FAILED", this.f60301E);
    }

    public final void onStart() {
        int F = AnonymousClass0cQ.F(this, -1789594530);
        super.onStart();
        AnonymousClass0cQ.G(this, 4174404, F);
    }

    public final void onStop() {
        int F = AnonymousClass0cQ.F(this, 1684686041);
        super.onStop();
        AnonymousClass0cQ.G(this, -1292305259, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!AnonymousClass0Cd.f1698B.J() && this.f60310N && this.f60311O && ((Boolean) AnonymousClass0E6.B(AnonymousClass0CC.bN)).booleanValue()) {
            AnonymousClass57K.m25785E(this, false);
        }
        AnonymousClass0F4.f2058E.A(AnonymousClass0ky.class, this.f60319W);
        if (AnonymousClass57K.m25787G(getContext())) {
            CheckBox checkBox = (CheckBox) view.findViewById(C0164R.id.remember_password_checkbox);
            checkBox.setVisibility(0);
            checkBox.post(new AnonymousClass575(this, checkBox));
            this.f60316T = checkBox;
        }
    }

    public final void onViewStateRestored(Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 1904453107);
        super.onViewStateRestored(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            CharSequence string = arguments.getString("com.instagram.android.login.fragment.ARGUMENT_OMNISTRING");
            if (!TextUtils.isEmpty(string)) {
                this.f60308L.setText(string);
            }
        }
        if (AnonymousClass0Nm.P(this.f60308L) && !this.f60310N) {
            CharSequence D = AnonymousClass1Pj.D();
            if (!(D == null || AnonymousClass0dp.B().H(D))) {
                AnonymousClass0Fr.LoginUsernamePrefilled.F(AnonymousClass2Na.LOGIN_STEP).B("prefill", D).D("field", "username").E();
                this.f60308L.setText(D);
            }
        }
        AnonymousClass0cQ.G(this, -1023968216, F);
    }

    public final boolean xb(String str) {
        return AnonymousClass562.m25719B(this.f60317U, str, this.f60299C, this, this, null, AnonymousClass2Na.LOGIN_STEP);
    }

    public final boolean zq() {
        return AnonymousClass55v.m25717B(this.f60317U, this, this, this.f60299C.m25712B(AnonymousClass0Nm.K(this.f60308L).trim()));
    }
}

package com.instagram.nux.fragment;

import X.AnonymousClass0CC;
import X.AnonymousClass0Ca;
import X.AnonymousClass0Cd;
import X.AnonymousClass0Ce;
import X.AnonymousClass0Cn;
import X.AnonymousClass0E6;
import X.AnonymousClass0F4;
import X.AnonymousClass0F8;
import X.AnonymousClass0Fr;
import X.AnonymousClass0GA;
import X.AnonymousClass0GO;
import X.AnonymousClass0IJ;
import X.AnonymousClass0IL;
import X.AnonymousClass0IZ;
import X.AnonymousClass0Om;
import X.AnonymousClass0Sb;
import X.AnonymousClass0cQ;
import X.AnonymousClass0dp;
import X.AnonymousClass0dq;
import X.AnonymousClass0dy;
import X.AnonymousClass0dz;
import X.AnonymousClass0e1;
import X.AnonymousClass0i7;
import X.AnonymousClass0ky;
import X.AnonymousClass1fi;
import X.AnonymousClass1ug;
import X.AnonymousClass2Ds;
import X.AnonymousClass2Du;
import X.AnonymousClass2Gm;
import X.AnonymousClass2Na;
import X.AnonymousClass3TP;
import X.AnonymousClass3Vu;
import X.AnonymousClass3X1;
import X.AnonymousClass3X4;
import X.AnonymousClass3Xc;
import X.AnonymousClass3Xy;
import X.AnonymousClass55X;
import X.AnonymousClass55j;
import X.AnonymousClass55n;
import X.AnonymousClass562;
import X.AnonymousClass572;
import X.AnonymousClass57K;
import X.AnonymousClass57d;
import X.AnonymousClass57e;
import X.AnonymousClass57f;
import X.AnonymousClass57g;
import X.AnonymousClass57h;
import X.AnonymousClass57i;
import X.AnonymousClass57j;
import X.AnonymousClass57k;
import X.AnonymousClass57l;
import X.AnonymousClass57m;
import X.AnonymousClass57n;
import X.AnonymousClass57o;
import X.AnonymousClass57p;
import X.AnonymousClass57q;
import X.AnonymousClass57r;
import X.AnonymousClass57s;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.C0164R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import java.util.List;

public class OneTapLoginLandingFragment extends AnonymousClass0IJ implements AnonymousClass2Ds, AnonymousClass2Gm {
    /* renamed from: B */
    public AnonymousClass55X f66389B;
    /* renamed from: C */
    public AnonymousClass55n f66390C;
    /* renamed from: D */
    private AnonymousClass3Vu f66391D;
    /* renamed from: E */
    private final AnonymousClass0F8 f66392E = new AnonymousClass57i(this);
    /* renamed from: F */
    private AnonymousClass0Cn f66393F;
    /* renamed from: G */
    private AnonymousClass3TP f66394G;
    public ViewGroup mRootView;

    public final String getModuleName() {
        return "one_tap";
    }

    /* renamed from: B */
    public static List m27615B() {
        List D = AnonymousClass0dp.B().D();
        List C = AnonymousClass0dp.B().C();
        if (C.size() <= 1 || !((Boolean) AnonymousClass0CC.uU.G()).booleanValue()) {
            return m27621H(D, C);
        }
        return C;
    }

    /* renamed from: C */
    public static void m27616C(OneTapLoginLandingFragment oneTapLoginLandingFragment, AnonymousClass0Fr anonymousClass0Fr, AnonymousClass0dq anonymousClass0dq) {
        anonymousClass0Fr = anonymousClass0Fr.F(AnonymousClass2Na.ONE_TAP);
        if (anonymousClass0dq != null) {
            anonymousClass0Fr.B("instagram_id", anonymousClass0dq.f7532H);
        }
        anonymousClass0Fr.E();
    }

    /* renamed from: D */
    public static void m27617D(OneTapLoginLandingFragment oneTapLoginLandingFragment, String str, AnonymousClass0dq anonymousClass0dq) {
        AnonymousClass0Fr.RegNextPressed.F(AnonymousClass2Na.ONE_TAP).B("instagram_id", anonymousClass0dq.f7532H).B("entry_point", str).E();
    }

    /* renamed from: E */
    public static void m27618E(OneTapLoginLandingFragment oneTapLoginLandingFragment, List list) {
        oneTapLoginLandingFragment.mRootView.removeAllViews();
        if (list.size() == 1) {
            TextView textView;
            AnonymousClass0dq anonymousClass0dq = (AnonymousClass0dq) list.get(0);
            LayoutInflater.from(oneTapLoginLandingFragment.mRootView.getContext()).inflate(C0164R.layout.one_tap_login_landing_single_user, oneTapLoginLandingFragment.mRootView);
            CircularImageView circularImageView = (CircularImageView) oneTapLoginLandingFragment.mRootView.findViewById(C0164R.id.avatar_image_view);
            if (anonymousClass0dq.f7529E != null) {
                circularImageView.setUrl(anonymousClass0dq.f7529E);
            } else {
                circularImageView.setImageDrawable(AnonymousClass0Ca.E(oneTapLoginLandingFragment.getContext(), C0164R.drawable.profile_anonymous_user));
            }
            circularImageView.setOnClickListener(new AnonymousClass57o(oneTapLoginLandingFragment, anonymousClass0dq));
            TextView textView2 = (TextView) oneTapLoginLandingFragment.mRootView.findViewById(C0164R.id.one_tap_log_in_button);
            textView2.setOnClickListener(new AnonymousClass57p(oneTapLoginLandingFragment, anonymousClass0dq));
            TextView textView3 = (TextView) oneTapLoginLandingFragment.mRootView.findViewById(C0164R.id.remove_text_link);
            boolean booleanValue = ((Boolean) AnonymousClass0CC.UW.G()).booleanValue();
            if (((Boolean) AnonymousClass0CC.RW.G()).booleanValue()) {
                textView3.setVisibility(8);
                if (booleanValue) {
                    textView = (TextView) oneTapLoginLandingFragment.mRootView.findViewById(C0164R.id.login_text_link);
                    textView.setOnClickListener(new AnonymousClass57q(oneTapLoginLandingFragment));
                    AnonymousClass3Xc.E(new TextView[]{textView});
                    textView.setVisibility(0);
                }
            } else {
                textView3.setOnClickListener(new AnonymousClass57d(oneTapLoginLandingFragment, anonymousClass0dq));
                AnonymousClass3Xc.E(new TextView[]{textView3});
            }
            if (((Boolean) AnonymousClass0CC.SW.G()).booleanValue()) {
                View findViewById = oneTapLoginLandingFragment.mRootView.findViewById(C0164R.id.login_landing_logo);
                ((LayoutParams) findViewById.getLayoutParams()).bottomMargin = oneTapLoginLandingFragment.getResources().getDimensionPixelSize(C0164R.dimen.logo_large_bottom_margin);
                findViewById.requestLayout();
                ((LayoutParams) circularImageView.getLayoutParams()).bottomMargin = 0;
                circularImageView.requestLayout();
                textView = (TextView) oneTapLoginLandingFragment.mRootView.findViewById(C0164R.id.username);
                textView.setText(anonymousClass0dq.f7533I);
                textView.setVisibility(0);
                oneTapLoginLandingFragment.mRootView.findViewById(C0164R.id.avatar_login_button_container).setOnClickListener(new AnonymousClass57e(oneTapLoginLandingFragment, anonymousClass0dq));
                View findViewById2 = oneTapLoginLandingFragment.mRootView.findViewById(C0164R.id.remove_text_container);
                ((LayoutParams) findViewById2.getLayoutParams()).topMargin = oneTapLoginLandingFragment.getResources().getDimensionPixelSize(C0164R.dimen.remove_large_top_margin);
                findViewById2.requestLayout();
                textView2.setText(C0164R.string.log_in);
            } else {
                textView2.setText(oneTapLoginLandingFragment.getString(C0164R.string.log_in_as_handle, new Object[]{anonymousClass0dq.f7533I}));
            }
            if (!((Boolean) AnonymousClass0CC.TW.G()).booleanValue()) {
                oneTapLoginLandingFragment.m27622I();
            } else if (((Boolean) AnonymousClass0E6.B(AnonymousClass0CC.UW)).booleanValue()) {
                TextView textView4 = (TextView) oneTapLoginLandingFragment.mRootView.findViewById(C0164R.id.new_footer_one_button);
                textView4.setText(Html.fromHtml(oneTapLoginLandingFragment.getString(C0164R.string.one_tap_new_footer_one_button)));
                textView4.setOnClickListener(new AnonymousClass57j(oneTapLoginLandingFragment));
                AnonymousClass3Xc.F(new TextView[]{textView4});
                textView4.setVisibility(0);
                oneTapLoginLandingFragment.mRootView.findViewById(C0164R.id.regular_footer).setVisibility(8);
            } else {
                TextView textView5 = (TextView) oneTapLoginLandingFragment.mRootView.findViewById(C0164R.id.left_button_new);
                textView5.setText(Html.fromHtml(oneTapLoginLandingFragment.getString(C0164R.string.one_tap_new_footer_switch_account)));
                TextView textView6 = (TextView) oneTapLoginLandingFragment.mRootView.findViewById(C0164R.id.right_button_new);
                textView6.setText(Html.fromHtml(oneTapLoginLandingFragment.getString(C0164R.string.one_tap_new_footer_log_in)));
                AnonymousClass3Xc.F(new TextView[]{textView5, textView6});
                OnClickListener anonymousClass57k = new AnonymousClass57k(oneTapLoginLandingFragment);
                OnClickListener anonymousClass57l = new AnonymousClass57l(oneTapLoginLandingFragment);
                oneTapLoginLandingFragment.mRootView.findViewById(C0164R.id.left_container).setOnClickListener(anonymousClass57k);
                textView5.setOnClickListener(anonymousClass57k);
                textView6.setOnClickListener(anonymousClass57l);
                oneTapLoginLandingFragment.mRootView.findViewById(C0164R.id.right_container).setOnClickListener(anonymousClass57l);
                oneTapLoginLandingFragment.mRootView.findViewById(C0164R.id.regular_footer).setVisibility(8);
                oneTapLoginLandingFragment.mRootView.findViewById(C0164R.id.new_footer).setVisibility(0);
            }
        } else {
            LayoutInflater.from(oneTapLoginLandingFragment.mRootView.getContext()).inflate(C0164R.layout.one_tap_login_landing_multiple_users, oneTapLoginLandingFragment.mRootView);
            AnonymousClass55X anonymousClass55X = new AnonymousClass55X(oneTapLoginLandingFragment);
            oneTapLoginLandingFragment.f66389B = anonymousClass55X;
            anonymousClass55X.m25705F(list);
            ((ListView) oneTapLoginLandingFragment.mRootView.findViewById(16908298)).setAdapter(oneTapLoginLandingFragment.f66389B);
            oneTapLoginLandingFragment.m27622I();
        }
        AnonymousClass3Xy.E((ImageView) oneTapLoginLandingFragment.mRootView.findViewById(C0164R.id.login_landing_logo), C0164R.color.grey_9);
        AnonymousClass0dy.B().f7558B.H(AnonymousClass57s.f60381B, "shown_one_tap_users", null, AnonymousClass1ug.B().A("one_tap_user_count", list.size()));
    }

    /* renamed from: F */
    public static void m27619F(OneTapLoginLandingFragment oneTapLoginLandingFragment) {
        m27616C(oneTapLoginLandingFragment, AnonymousClass0Fr.SwitchToLogin, null);
        AnonymousClass57s.m25802B("switch_accounts");
        AnonymousClass0dy.B().f7558B.I(AnonymousClass57s.f60381B);
        AnonymousClass0GO.C().A();
        AnonymousClass0IL anonymousClass57K = new AnonymousClass57K();
        anonymousClass57K.setArguments(oneTapLoginLandingFragment.getArguments());
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(oneTapLoginLandingFragment.getActivity());
        anonymousClass0IZ.f2754D = anonymousClass57K;
        anonymousClass0IZ.B();
    }

    /* renamed from: G */
    public static void m27620G(OneTapLoginLandingFragment oneTapLoginLandingFragment) {
        m27616C(oneTapLoginLandingFragment, AnonymousClass0Fr.SwitchToSignUp, null);
        AnonymousClass57s.m25802B("switch_to_sign_up");
        AnonymousClass0dy.B().f7558B.I(AnonymousClass57s.f60381B);
        if (AnonymousClass0Om.E(oneTapLoginLandingFragment.getContext()) || !((Boolean) AnonymousClass0CC.Me.G()).booleanValue()) {
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(oneTapLoginLandingFragment.getActivity());
            AnonymousClass0GO.C().A();
            anonymousClass0IZ.f2754D = new AnonymousClass572();
            anonymousClass0IZ.B();
            return;
        }
        oneTapLoginLandingFragment.f66391D.B();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: H */
    private static java.util.List m27621H(java.util.List r4, java.util.List r5) {
        /*
        r1 = new java.util.ArrayList;
        r1.<init>();
        r3 = r4.size();
        r0 = r5.size();
        r2 = 0;
        if (r3 != r0) goto L_0x001e;
    L_0x0010:
        r0 = r4.isEmpty();
        if (r0 != 0) goto L_0x001d;
    L_0x0016:
        r0 = r4.get(r2);
        r1.add(r0);
    L_0x001d:
        return r1;
    L_0x001e:
        r0 = X.AnonymousClass0CC.vU;
        r0 = X.AnonymousClass0E6.B(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x003a;
    L_0x002c:
        r0 = r5.isEmpty();
        if (r0 != 0) goto L_0x001d;
    L_0x0032:
        r0 = r5.get(r2);
        r1.add(r0);
        goto L_0x001d;
    L_0x003a:
        r0 = X.AnonymousClass0CC.MW;
        r0 = r0.G();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x004f;
    L_0x0048:
        r0 = r5.isEmpty();
        if (r0 != 0) goto L_0x001d;
    L_0x004e:
        goto L_0x0032;
    L_0x004f:
        r0 = r4.isEmpty();
        if (r0 != 0) goto L_0x001d;
    L_0x0055:
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.fragment.OneTapLoginLandingFragment.H(java.util.List, java.util.List):java.util.List");
    }

    /* renamed from: I */
    private void m27622I() {
        TextView textView = (TextView) this.mRootView.findViewById(C0164R.id.left_button);
        textView.setText(getString(C0164R.string.switch_accounts));
        textView.setOnClickListener(new AnonymousClass57m(this));
        TextView textView2 = (TextView) this.mRootView.findViewById(C0164R.id.right_button);
        textView2.setText(getString(C0164R.string.nux_dayone_sign_up));
        textView2.setOnClickListener(new AnonymousClass57n(this));
        AnonymousClass3Xc.E(new TextView[]{textView, textView2});
    }

    public final void MBA(AnonymousClass2Du anonymousClass2Du) {
        this.f66394G.Sq();
    }

    public final void QBA(String str, String str2, String str3, boolean z, boolean z2, boolean z3, Bundle bundle, boolean z4) {
        this.f66394G.QBA(str, str2, str3, z, z2, z3, bundle, z4);
        AnonymousClass57s.m25802B("start_2fac_login");
        AnonymousClass0dy.B().f7558B.I(AnonymousClass57s.f60381B);
    }

    public final void Sq() {
        this.f66394G.Sq();
    }

    public final void as() {
        this.f66394G.as();
    }

    /* renamed from: b */
    public final void m27623b(AnonymousClass0dq anonymousClass0dq) {
        AnonymousClass57s.m25802B("click_one_tap_user");
        AnonymousClass0GA F = AnonymousClass1fi.F(getContext(), this.f66393F, anonymousClass0dq.f7527C, anonymousClass0dq.f7532H, AnonymousClass0i7.B().D());
        F.f2849B = new AnonymousClass57r(this, this, this, AnonymousClass2Na.ONE_TAP, anonymousClass0dq.f7533I, anonymousClass0dq.f7532H, this);
        schedule(F);
    }

    /* renamed from: c */
    public final void m27624c(AnonymousClass0dq anonymousClass0dq) {
        m27616C(this, AnonymousClass0Fr.RemoveTapped, anonymousClass0dq);
        AnonymousClass57s.m25802B("remove_one_tap_user");
        new AnonymousClass0Sb(getActivity()).Q(C0164R.string.remove_account).I(getString(C0164R.string.remove_account_body)).O(C0164R.string.remove, new AnonymousClass57g(this, anonymousClass0dq)).L(C0164R.string.cancel, new AnonymousClass57f(this, anonymousClass0dq)).C().show();
    }

    public final void ez() {
        this.f66394G.gz();
    }

    public final void gz() {
        this.f66394G.gz();
    }

    public final void hz() {
        this.f66394G.hz();
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass0e1 anonymousClass0e1;
        int F = AnonymousClass0cQ.F(this, -958745445);
        super.onCreate(bundle);
        this.f66393F = AnonymousClass0Ce.I(this);
        AnonymousClass0Cn anonymousClass0Cn = this.f66393F;
        FragmentActivity activity = getActivity();
        AnonymousClass2Na anonymousClass2Na = AnonymousClass2Na.ONE_TAP;
        registerLifecycleListener(new AnonymousClass3X1(anonymousClass0Cn, activity, this, anonymousClass2Na));
        AnonymousClass3Vu anonymousClass3Vu = new AnonymousClass3Vu(this.f66393F, this, anonymousClass2Na);
        this.f66391D = anonymousClass3Vu;
        anonymousClass3Vu.A();
        this.f66394G = new AnonymousClass3TP(getActivity());
        AnonymousClass55n anonymousClass55n = new AnonymousClass55n(this, this);
        this.f66390C = anonymousClass55n;
        AnonymousClass55n.m25710C(anonymousClass55n, null);
        anonymousClass55n.f60040C.schedule(new AnonymousClass55j(anonymousClass55n, null));
        AnonymousClass55n.m25709B(anonymousClass55n, null);
        int C = AnonymousClass0Cd.f1698B.C();
        int size = AnonymousClass0dp.B().C().size();
        AnonymousClass0dz anonymousClass0dz = AnonymousClass0dy.B().f7558B;
        AnonymousClass0e1 anonymousClass0e12 = AnonymousClass57s.f60381B;
        anonymousClass0dz.K(anonymousClass0e12);
        anonymousClass0dz.B(anonymousClass0e12, ((Boolean) AnonymousClass0E6.B(AnonymousClass0CC.uU)).booleanValue() ? "multitap_enabled" : "multitap_disabled");
        anonymousClass0dz.B(anonymousClass0e12, ((Boolean) AnonymousClass0E6.B(AnonymousClass0CC.MW)).booleanValue() ? "logged_out_only_enabled" : "logged_out_only_disabled");
        if (C > 0) {
            anonymousClass0e1 = AnonymousClass57s.f60381B;
            anonymousClass0dz.B(anonymousClass0e12, "has_logged_in_accounts");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("logged_in_");
            stringBuilder.append(C);
            anonymousClass0dz.B(anonymousClass0e1, stringBuilder.toString());
            if (C > 5) {
                anonymousClass0dz.B(anonymousClass0e1, "more_than_5_logged_in_accounts");
            }
        }
        if (size > 0) {
            anonymousClass0e1 = AnonymousClass57s.f60381B;
            anonymousClass0dz.B(anonymousClass0e1, "has_logged_out_one_tap_accounts");
            stringBuilder = new StringBuilder();
            stringBuilder.append("logged_out_one_tap_");
            stringBuilder.append(size);
            anonymousClass0dz.B(anonymousClass0e1, stringBuilder.toString());
            if (size > 5) {
                anonymousClass0dz.B(anonymousClass0e1, "more_than_5_logged_out_one_tap_accounts");
            }
        }
        AnonymousClass0cQ.G(this, -2130233287, F);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int F = AnonymousClass0cQ.F(this, 821342675);
        this.mRootView = (ViewGroup) layoutInflater.inflate(C0164R.layout.one_tap_login_landing_fragment, viewGroup, false);
        List B = m27615B();
        if (B.isEmpty()) {
            AnonymousClass3X4.G(getFragmentManager());
            AnonymousClass57s.m25803C();
            AnonymousClass0cQ.G(this, -367497839, F);
            return null;
        }
        m27616C(this, AnonymousClass0Fr.RegScreenLoaded, null);
        m27618E(this, B);
        View view = this.mRootView;
        AnonymousClass0cQ.G(this, -673345754, F);
        return view;
    }

    public final void onDestroyView() {
        int F = AnonymousClass0cQ.F(this, -1615538625);
        super.onDestroyView();
        AnonymousClass0F4.f2058E.D(AnonymousClass0ky.class, this.f66392E);
        AnonymousClass0cQ.G(this, 329104545, F);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass0F4.f2058E.A(AnonymousClass0ky.class, this.f66392E);
    }

    public final boolean xb(String str) {
        String str2 = str;
        boolean B = AnonymousClass562.m25719B(this.f66393F, str2, this.f66390C, this, this, new AnonymousClass57h(this), AnonymousClass2Na.ONE_TAP);
        if (B) {
            AnonymousClass57s.m25802B("start_alternative_login_path");
            AnonymousClass0dy.B().f7558B.I(AnonymousClass57s.f60381B);
        }
        return B;
    }

    public final boolean zq() {
        return this.f66394G.zq();
    }
}

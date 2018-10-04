package X;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.facebook.C0164R;
import java.util.List;

/* renamed from: X.3Wk */
public final class AnonymousClass3Wk extends AnonymousClass0VA {
    /* renamed from: B */
    public final Activity f41943B;
    /* renamed from: C */
    public final AnonymousClass0EE f41944C;
    /* renamed from: D */
    public final AnonymousClass0IJ f41945D;
    /* renamed from: E */
    public final Handler f41946E = new Handler();
    /* renamed from: F */
    public final AnonymousClass2HN f41947F;
    /* renamed from: G */
    public AnonymousClass2Hh f41948G;
    /* renamed from: H */
    public final AnonymousClass0Cn f41949H;
    /* renamed from: I */
    public final AnonymousClass2Na f41950I;

    public AnonymousClass3Wk(AnonymousClass0Cn anonymousClass0Cn, AnonymousClass0IJ anonymousClass0IJ, AnonymousClass2Na anonymousClass2Na, AnonymousClass0EE anonymousClass0EE) {
        if (AnonymousClass0CB.D()) {
            AnonymousClass0LH.C(anonymousClass0Cn.xX() ^ 1, "FacebookLoginHelper should run within LoggedOutSession");
        }
        this.f41949H = anonymousClass0Cn;
        this.f41945D = anonymousClass0IJ;
        this.f41943B = anonymousClass0IJ.getActivity();
        this.f41950I = anonymousClass2Na;
        this.f41944C = anonymousClass0EE;
        this.f41948G = new AnonymousClass2Hh(this.f41945D, new AnonymousClass3Wi());
        this.f41947F = AnonymousClass2HN.m14912B(this.f41949H);
    }

    /* renamed from: A */
    public final void m19821A(AnonymousClass0mR anonymousClass0mR) {
        AnonymousClass0FO.G(this.f41949H, false);
        String C = AnonymousClass3Wk.m19814C(this);
        String D = AnonymousClass3Wk.m19815D(this);
        if (C == null) {
            AnonymousClass0Fr.TryFacebookAuth.F(this.f41950I).m15363D("token_source", "third_party_token").m15364E();
            AnonymousClass0FO.D(this.f41949H, this.f41945D, AnonymousClass2HL.EMAIL_READ_ONLY, anonymousClass0mR);
            return;
        }
        m19822B(D, C, false);
    }

    /* renamed from: B */
    public static OnClickListener m19813B(AnonymousClass3Wk anonymousClass3Wk, AnonymousClass2Do anonymousClass2Do, String str, boolean z) {
        Object obj;
        String str2 = anonymousClass2Do.f27688B;
        int hashCode = str2.hashCode();
        if (hashCode != -1828522310) {
            if (hashCode != 366006153) {
                if (hashCode == 1160163273) {
                    if (str2.equals("login_with_facebook")) {
                        obj = 2;
                        switch (obj) {
                            case null:
                                return new AnonymousClass3Wa(anonymousClass3Wk, anonymousClass2Do);
                            case 1:
                                return new AnonymousClass3Wb(anonymousClass3Wk);
                            case 2:
                                return new AnonymousClass3Wc(anonymousClass3Wk, str, z, anonymousClass2Do);
                            default:
                                return null;
                        }
                    }
                }
            } else if (str2.equals("username_log_in")) {
                obj = null;
                switch (obj) {
                    case null:
                        return new AnonymousClass3Wa(anonymousClass3Wk, anonymousClass2Do);
                    case 1:
                        return new AnonymousClass3Wb(anonymousClass3Wk);
                    case 2:
                        return new AnonymousClass3Wc(anonymousClass3Wk, str, z, anonymousClass2Do);
                    default:
                        return null;
                }
            }
        } else if (str2.equals("email_sign_up")) {
            obj = 1;
            switch (obj) {
                case null:
                    return new AnonymousClass3Wa(anonymousClass3Wk, anonymousClass2Do);
                case 1:
                    return new AnonymousClass3Wb(anonymousClass3Wk);
                case 2:
                    return new AnonymousClass3Wc(anonymousClass3Wk, str, z, anonymousClass2Do);
                default:
                    return null;
            }
        }
        obj = -1;
        switch (obj) {
            case null:
                return new AnonymousClass3Wa(anonymousClass3Wk, anonymousClass2Do);
            case 1:
                return new AnonymousClass3Wb(anonymousClass3Wk);
            case 2:
                return new AnonymousClass3Wc(anonymousClass3Wk, str, z, anonymousClass2Do);
            default:
                return null;
        }
    }

    /* renamed from: B */
    public final void m19822B(String str, String str2, boolean z) {
        AnonymousClass3Wk.m19818G(this, str, str2, z, AnonymousClass0fp.f7999B);
    }

    /* renamed from: C */
    public static String m19814C(AnonymousClass3Wk anonymousClass3Wk) {
        return AnonymousClass0a2.K(anonymousClass3Wk.f41949H) ? AnonymousClass0a2.B(anonymousClass3Wk.f41949H) : null;
    }

    /* renamed from: D */
    public static String m19815D(AnonymousClass3Wk anonymousClass3Wk) {
        return AnonymousClass0a2.K(anonymousClass3Wk.f41949H) ? AnonymousClass0a2.I(anonymousClass3Wk.f41949H) : null;
    }

    /* renamed from: E */
    public static Uri m19816E(AnonymousClass3Wk anonymousClass3Wk) {
        anonymousClass3Wk = anonymousClass3Wk.f41945D.getArguments();
        return (anonymousClass3Wk == null || anonymousClass3Wk.getString("original_url") == null) ? null : Uri.parse(anonymousClass3Wk.getString("original_url"));
    }

    /* renamed from: F */
    public static void m19817F(AnonymousClass0IJ anonymousClass0IJ, AnonymousClass2Na anonymousClass2Na, TextView textView, View view) {
        CharSequence B = AnonymousClass0i7.B().B();
        AnonymousClass2Na anonymousClass2Na2 = anonymousClass2Na;
        AnonymousClass2NZ B2 = AnonymousClass0Fr.FirstPartyTokenAcquired.F(anonymousClass2Na).m15361B("fbid", AnonymousClass0i7.B().A());
        TextView textView2 = textView;
        if (AnonymousClass0i7.B().E()) {
            AnonymousClass0GA E = AnonymousClass2Eh.m14791E(AnonymousClass0Dt.f1941C.A(anonymousClass0IJ.getContext()), null, AnonymousClass0i7.B().C(), true, "sign_in");
            E.f2849B = new AnonymousClass3Wj("access_token", B, anonymousClass2Na2, textView2, view);
            anonymousClass0IJ.schedule(E);
        } else if (TextUtils.isEmpty(B)) {
            textView.setText(C0164R.string.log_in_with_facebook);
        } else {
            textView.setText(anonymousClass0IJ.getString(C0164R.string.continue_as_facebook, new Object[]{B}));
            B2.m15361B("reason", "no_token_found");
        }
        B2.m15364E();
    }

    /* renamed from: G */
    public static void m19818G(AnonymousClass3Wk anonymousClass3Wk, String str, String str2, boolean z, AnonymousClass0fq anonymousClass0fq) {
        AnonymousClass0IJ anonymousClass0IJ = anonymousClass3Wk.f41945D;
        String str3 = str2;
        boolean z2 = z;
        AnonymousClass0GA B = AnonymousClass1fi.B(anonymousClass3Wk.f41943B, anonymousClass0fq.B() ? (String) anonymousClass0fq.A() : null, str3, null, null, z2, true, false);
        B.f2849B = new AnonymousClass3WV(anonymousClass3Wk, z2, anonymousClass0fq.B(), str, str3);
        anonymousClass0IJ.schedule(B);
        AnonymousClass0Fr.TryFacebookSso.F(anonymousClass3Wk.f41950I).m15363D("token_source", z2 ? "first_party_token" : "third_party_token").m15364E();
    }

    /* renamed from: H */
    public static void m19819H(AnonymousClass3Wk anonymousClass3Wk, List list, List list2, String str) {
        AnonymousClass0Fr.RegisterWithFacebook.F(anonymousClass3Wk.f41950I).m15364E();
        String str2 = (list == null || list.isEmpty()) ? "unknown" : (String) list.get(0);
        if (AnonymousClass3Vm.getInstance() == null && ((Boolean) AnonymousClass0CC.iF.G()).booleanValue()) {
            AnonymousClass3Vm.setInstance(new AnonymousClass40x(anonymousClass3Wk.f41945D.getContext()));
            AnonymousClass3Vm.getInstance().startDeviceValidation(anonymousClass3Wk.f41945D.getContext(), str2);
        }
        AnonymousClass0OR.D(anonymousClass3Wk.f41946E, new AnonymousClass3Wg(anonymousClass3Wk, list, list2, str), 627405820);
    }

    /* renamed from: I */
    public static void m19820I(AnonymousClass3Wk anonymousClass3Wk) {
        if (anonymousClass3Wk.f41945D.getActivity() != null) {
            AnonymousClass0P2 anonymousClass0P2 = new AnonymousClass0P2(anonymousClass3Wk.f41945D.getActivity());
            anonymousClass0P2.K(C0164R.string.network_error);
            anonymousClass0P2.S(C0164R.string.ok, new AnonymousClass3We(anonymousClass3Wk));
            anonymousClass0P2.A().show();
        }
    }

    public final void St() {
        this.f41948G.m14933A();
        this.f41946E.removeCallbacksAndMessages(null);
    }

    public final void gx() {
        Activity activity = this.f41943B;
        Object obj = ((activity instanceof AnonymousClass3VC) && ((AnonymousClass3VC) activity).dW()) ? 1 : null;
        if (AnonymousClass0Cd.f1698B.N() && obj == null) {
            AnonymousClass0NN.B("resumed_non_add_account_flow_is_logged_in", this.f41944C).R();
            this.f41943B.finish();
        }
        AnonymousClass0M7.f3347C.N();
    }

    public final void xc(int i, int i2, Intent intent) {
        AnonymousClass1ve.m13791B(i2, intent, new AnonymousClass3WZ(this));
    }
}

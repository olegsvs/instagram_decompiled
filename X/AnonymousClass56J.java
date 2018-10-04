package X;

import android.os.Handler;
import android.text.TextUtils;
import com.facebook.C0164R;

/* renamed from: X.56J */
public class AnonymousClass56J extends AnonymousClass0Iw {
    /* renamed from: B */
    public final String f60108B;
    /* renamed from: C */
    public final AnonymousClass0IJ f60109C;
    /* renamed from: D */
    public final String f60110D;
    /* renamed from: E */
    public final AnonymousClass0Cn f60111E;
    /* renamed from: F */
    private final AnonymousClass3TC f60112F;
    /* renamed from: G */
    private final Handler f60113G = new Handler();
    /* renamed from: H */
    private final AnonymousClass3XF f60114H;

    public AnonymousClass56J(AnonymousClass0Cn anonymousClass0Cn, String str, AnonymousClass0IJ anonymousClass0IJ, AnonymousClass3XF anonymousClass3XF, AnonymousClass3TC anonymousClass3TC, String str2) {
        this.f60111E = anonymousClass0Cn;
        this.f60108B = str;
        this.f60109C = anonymousClass0IJ;
        this.f60114H = anonymousClass3XF;
        this.f60112F = anonymousClass3TC;
        this.f60110D = str2;
    }

    /* renamed from: A */
    public AnonymousClass2NZ mo5844A(String str) {
        AnonymousClass2NZ G = AnonymousClass0Fr.RegNextBlocked.G(AnonymousClass2Na.EMAIL_STEP, AnonymousClass0Oh.EMAIL);
        String str2 = "reason";
        if (TextUtils.isEmpty(str)) {
            str = "other";
        }
        return G.B(str2, str);
    }

    /* renamed from: B */
    public void mo5845B(AnonymousClass2Ef anonymousClass2Ef) {
        int I = AnonymousClass0cQ.I(this, 665935505);
        if (!anonymousClass2Ef.f27912G) {
            this.f60112F.AUA(this.f60109C.getResources().getString(C0164R.string.email_not_valid), AnonymousClass22w.EMAIL);
            mo5844A(anonymousClass2Ef.f4184J).E();
        } else if (anonymousClass2Ef.f27907B) {
            String str;
            if (TextUtils.isEmpty(anonymousClass2Ef.f27910E)) {
                str = this.f60108B;
            } else {
                str = anonymousClass2Ef.f27910E;
            }
            AnonymousClass1BX.G(this.f60111E, this.f60109C.getContext(), str, AnonymousClass0Oh.EMAIL.B(), false, null);
            AnonymousClass0OR.D(this.f60113G, new AnonymousClass56E(this, str, anonymousClass2Ef), 2102534403);
        } else {
            if (!((Boolean) AnonymousClass0E6.B(AnonymousClass0CC.cJ)).booleanValue() || anonymousClass2Ef.f27913H == null) {
                AnonymousClass0Sb anonymousClass0Sb = new AnonymousClass0Sb(this.f60109C.getContext());
                if (((Boolean) AnonymousClass0CC.lF.G()).booleanValue()) {
                    anonymousClass0Sb.R(this.f60109C.getResources().getString(C0164R.string.contact_point_already_taken_login_dialog_header_email_default)).I(this.f60109C.getResources().getString(C0164R.string.contact_point_already_taken_login_dialog_message_alternative)).L(C0164R.string.cancel, new AnonymousClass56G(this)).P(this.f60109C.getResources().getString(C0164R.string.nux_dayone_log_in), new AnonymousClass56F(this)).C().show();
                } else if (((Boolean) AnonymousClass0CC.kF.G()).booleanValue()) {
                    anonymousClass0Sb.R(this.f60109C.getResources().getString(C0164R.string.contact_point_already_taken_login_dialog_header_email_default)).I(this.f60109C.getResources().getString(C0164R.string.contact_point_already_taken_login_dialog_message_reset_password)).L(C0164R.string.cancel, new AnonymousClass56I(this)).P(this.f60109C.getResources().getString(C0164R.string.new_user_forgot_password_message_alternative), new AnonymousClass56H(this)).C().show();
                }
                this.f60112F.AUA(this.f60109C.getResources().getString(C0164R.string.email_not_available), AnonymousClass22w.EMAIL);
            }
            mo5844A(anonymousClass2Ef.f4184J).E();
        }
        AnonymousClass0cQ.H(this, 1018993330, I);
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        String str;
        int I = AnonymousClass0cQ.I(this, 284247234);
        this.f60112F.AUA(this.f60109C.getString(C0164R.string.request_error), AnonymousClass22w.UNKNOWN);
        if (anonymousClass0Q6.B()) {
            str = ((AnonymousClass2Ef) anonymousClass0Q6.f4288C).f4184J;
        } else {
            str = "network_error";
        }
        mo5844A(str).E();
        AnonymousClass0cQ.H(this, -2106913696, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -1613360542);
        super.onFinish();
        this.f60114H.B();
        AnonymousClass0cQ.H(this, -842995130, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, 679603632);
        super.onStart();
        this.f60114H.C();
        AnonymousClass0cQ.H(this, 2093865782, I);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -370678018);
        mo5845B((AnonymousClass2Ef) obj);
        AnonymousClass0cQ.H(this, 984067390, I);
    }
}

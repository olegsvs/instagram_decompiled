package X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.C0164R;

/* renamed from: X.5G9 */
public final class AnonymousClass5G9 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0IL f61644B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Cm f61645C;

    public AnonymousClass5G9(AnonymousClass0IL anonymousClass0IL, AnonymousClass0Cm anonymousClass0Cm) {
        this.f61644B = anonymousClass0IL;
        this.f61645C = anonymousClass0Cm;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 700952529);
        AnonymousClass2Go.B("switch_to_personal_account_failed");
        CharSequence string = this.f61644B.getString(C0164R.string.error_msg_switch_back_to_personal_profile);
        if (anonymousClass0Q6.B() && !TextUtils.isEmpty(((AnonymousClass1Nf) anonymousClass0Q6.f4288C).A())) {
            string = ((AnonymousClass1Nf) anonymousClass0Q6.f4288C).A();
        }
        AnonymousClass0wt.BUSINESS_CONVERSION_SUBMIT_ERROR.A().F("step", "switch_back").F("entry_point", "setting").F("fb_user_id", AnonymousClass0a2.I(this.f61645C)).F("error_message", string).R();
        AnonymousClass0IG.I(string);
        AnonymousClass0cQ.H(this, -2056153167, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 1516297428);
        super.onFinish();
        AnonymousClass0eT.E(this.f61644B.getActivity()).m(false, null);
        AnonymousClass0eT.E(this.f61644B.getActivity()).Y(false);
        AnonymousClass5GA.f61646F = false;
        AnonymousClass0IL anonymousClass0IL = this.f61644B;
        if (anonymousClass0IL instanceof AnonymousClass5IH) {
            ((AnonymousClass5IH) anonymousClass0IL).m26174A();
        } else if (anonymousClass0IL instanceof AnonymousClass5Fl) {
            AnonymousClass0OR.D(new Handler(Looper.getMainLooper()), new AnonymousClass5G7(this), 1475792635);
        }
        AnonymousClass0cQ.H(this, 179988640, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -103019623);
        super.onStart();
        AnonymousClass5GA.f61646F = true;
        AnonymousClass0eT.E(this.f61644B.getActivity()).m(true, null);
        AnonymousClass0eT.E(this.f61644B.getActivity()).Y(true);
        AnonymousClass0cQ.H(this, 1394495927, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -415216283);
        AnonymousClass1Nf anonymousClass1Nf = (AnonymousClass1Nf) obj;
        int I2 = AnonymousClass0cQ.I(this, -628693521);
        AnonymousClass2Go.B("switch_to_personal_account_successful");
        AnonymousClass0wt.BUSINESS_CONVERSION_SUBMIT.A().F("step", "switch_back").F("entry_point", "setting").F("fb_user_id", AnonymousClass0a2.I(this.f61645C)).R();
        AnonymousClass0Ci anonymousClass0Ci = anonymousClass1Nf.f17816C;
        AnonymousClass0Cg.f1704B.A(anonymousClass0Ci);
        anonymousClass0Ci.D();
        AnonymousClass2FT.D(this.f61645C, null);
        AnonymousClass0HV.D(this.f61645C).eA(true);
        AnonymousClass0OR.D(new Handler(Looper.getMainLooper()), new AnonymousClass5G8(this), -1150535436);
        AnonymousClass0cQ.H(this, -438674583, I2);
        AnonymousClass0cQ.H(this, 350777221, I);
    }
}

package X;

import android.text.TextUtils;
import com.facebook.C0164R;
import com.instagram.login.api.RegistrationFlowExtras;

/* renamed from: X.4CW */
public final class AnonymousClass4CW extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Ry f51412B;
    /* renamed from: C */
    public final /* synthetic */ String f51413C;

    public AnonymousClass4CW(AnonymousClass5Ry anonymousClass5Ry, String str) {
        this.f51412B = anonymousClass5Ry;
        this.f51413C = str;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 1911160232);
        AnonymousClass0IL anonymousClass0IL = this.f51412B;
        anonymousClass0IL.AUA(anonymousClass0IL.getString(C0164R.string.request_error), AnonymousClass22w.UNKNOWN);
        AnonymousClass33b.m18368J("contact", this.f51412B.f63651J, null, null, this.f51412B.getString(C0164R.string.request_error), AnonymousClass0a2.I(this.f51412B.f63660S));
        AnonymousClass0cQ.H(this, -1691026744, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 2146603622);
        if (this.f51412B.f63649H != null) {
            this.f51412B.f63649H.m19858B();
        }
        AnonymousClass0cQ.H(this, 916141546, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, 598680851);
        if (this.f51412B.f63649H != null) {
            this.f51412B.f63649H.m19859C();
        }
        AnonymousClass0cQ.H(this, -352705682, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 151146354);
        AnonymousClass2Ef anonymousClass2Ef = (AnonymousClass2Ef) obj;
        int I2 = AnonymousClass0cQ.I(this, 1827270424);
        AnonymousClass0IL anonymousClass0IL;
        if (!anonymousClass2Ef.f27912G) {
            anonymousClass0IL = this.f51412B;
            anonymousClass0IL.AUA(anonymousClass0IL.getString(C0164R.string.email_not_valid), AnonymousClass22w.EMAIL);
            AnonymousClass33b.m18368J("contact", this.f51412B.f63651J, null, null, this.f51412B.getString(C0164R.string.email_not_valid), AnonymousClass0a2.I(this.f51412B.f63660S));
        } else if (anonymousClass2Ef.f27907B) {
            String str;
            if (TextUtils.isEmpty(anonymousClass2Ef.f27910E)) {
                str = this.f51413C;
            } else {
                str = anonymousClass2Ef.f27910E;
            }
            RegistrationFlowExtras registrationFlowExtras = new RegistrationFlowExtras();
            registrationFlowExtras.f27655H = str;
            registrationFlowExtras.f27658K = anonymousClass2Ef.f27909D;
            registrationFlowExtras.f27671X = anonymousClass2Ef.f27911F;
            registrationFlowExtras.f27659L = anonymousClass2Ef.f27908C;
            this.f51412B.sGA(registrationFlowExtras, false);
        } else {
            anonymousClass0IL = this.f51412B;
            anonymousClass0IL.AUA(anonymousClass0IL.getString(C0164R.string.email_not_available), AnonymousClass22w.EMAIL);
            AnonymousClass33b.m18368J("contact", this.f51412B.f63651J, null, null, this.f51412B.getString(C0164R.string.email_not_available), AnonymousClass0a2.I(this.f51412B.f63660S));
        }
        AnonymousClass0cQ.H(this, -789230698, I2);
        AnonymousClass0cQ.H(this, 1800164841, I);
    }
}

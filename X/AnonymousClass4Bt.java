package X;

import android.text.TextUtils;
import com.facebook.C0164R;

/* renamed from: X.4Bt */
public final class AnonymousClass4Bt extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Bu f51288B;

    public AnonymousClass4Bt(AnonymousClass4Bu anonymousClass4Bu) {
        this.f51288B = anonymousClass4Bu;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 1791082571);
        Object string = this.f51288B.getString(C0164R.string.error_msg_edit_business_profile);
        if (anonymousClass0Q6.B() && !TextUtils.isEmpty(((AnonymousClass1Nf) anonymousClass0Q6.f4288C).A())) {
            string = ((AnonymousClass1Nf) anonymousClass0Q6.f4288C).A();
        }
        AnonymousClass0IG.I(string);
        String str = this.f51288B.f51295G;
        AnonymousClass33e.EDIT_PROFILE_SUBMIT_ERROR.m18380A().F("entry_point", str).F("fb_user_id", AnonymousClass0a2.I(this.f51288B.f51302N)).F("step", "business_contact_info").D("selected_values", AnonymousClass4Bu.m23500B(this.f51288B)).F("error_message", string).R();
        AnonymousClass0cQ.H(this, -1549902680, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 1890940640);
        AnonymousClass0IL anonymousClass0IL = this.f51288B;
        anonymousClass0IL.f51298J = false;
        AnonymousClass0eT.D(AnonymousClass0eT.E(anonymousClass0IL.getActivity()));
        AnonymousClass0cQ.H(this, 1745158325, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -1147531691);
        AnonymousClass0IL anonymousClass0IL = this.f51288B;
        anonymousClass0IL.f51298J = true;
        AnonymousClass0eT.D(AnonymousClass0eT.E(anonymousClass0IL.getActivity()));
        AnonymousClass0cQ.H(this, -1693893026, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 1135510658);
        AnonymousClass1Nf anonymousClass1Nf = (AnonymousClass1Nf) obj;
        int I2 = AnonymousClass0cQ.I(this, 671862581);
        this.f51288B.f51299K = true;
        AnonymousClass0wt anonymousClass0wt;
        if (this.f51288B.f51301M) {
            anonymousClass0wt = AnonymousClass0wt.BOOK_APPOINTMENT_ENABELD;
            anonymousClass0wt.A().F("target_id", this.f51288B.f51292D.getId()).R();
        } else if (this.f51288B.f51300L) {
            anonymousClass0wt = AnonymousClass0wt.BOOK_APPOINTMENT_DISABLED;
            anonymousClass0wt.A().F("target_id", this.f51288B.f51292D.getId()).R();
        }
        AnonymousClass0OR.D(this.f51288B.f51296H, new AnonymousClass4Bs(this), 1372919473);
        AnonymousClass4Bu.m23501C(this.f51288B, AnonymousClass33e.EDIT_PROFILE_SUBMIT);
        AnonymousClass0cQ.H(this, 243183128, I2);
        AnonymousClass0cQ.H(this, 1120817697, I);
    }
}

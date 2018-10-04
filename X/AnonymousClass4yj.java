package X;

import com.facebook.C0164R;

/* renamed from: X.4yj */
public final class AnonymousClass4yj extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4yo f59039B;

    public AnonymousClass4yj(AnonymousClass4yo anonymousClass4yo) {
        this.f59039B = anonymousClass4yo;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -761501941);
        AnonymousClass0IG.H(this.f59039B.getContext(), AnonymousClass35u.B(anonymousClass0Q6, this.f59039B.getString(C0164R.string.error_msg)));
        AnonymousClass0cQ.H(this, 1670830846, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1545342373);
        AnonymousClass2Vt anonymousClass2Vt = (AnonymousClass2Vt) obj;
        int I2 = AnonymousClass0cQ.I(this, 899729935);
        if (!AnonymousClass4yo.m25509D(this.f59039B.f59044B, anonymousClass2Vt)) {
            AnonymousClass0IL anonymousClass0IL = this.f59039B;
            new AnonymousClass0P2(anonymousClass0IL.getContext()).E(true).F(true).S(C0164R.string.ok, new AnonymousClass4yk(anonymousClass0IL)).V(C0164R.string.claim_page_error_dialog_title).K(C0164R.string.claim_page_error_dialog_message).A().show();
        }
        AnonymousClass0cQ.H(this, 1724897344, I2);
        AnonymousClass0cQ.H(this, -2053234351, I);
    }
}

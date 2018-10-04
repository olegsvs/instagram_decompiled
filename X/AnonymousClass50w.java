package X;

import com.facebook.C0164R;

/* renamed from: X.50w */
public final class AnonymousClass50w extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass50y f59290B;

    public AnonymousClass50w(AnonymousClass50y anonymousClass50y) {
        this.f59290B = anonymousClass50y;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -879847063);
        AnonymousClass3nj.F(this.f59290B.getContext(), AnonymousClass0FL.C(this.f59290B.getArguments()), anonymousClass0Q6);
        AnonymousClass0cQ.H(this, -1123763677, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1542548429);
        AnonymousClass2DN anonymousClass2DN = (AnonymousClass2DN) obj;
        int I2 = AnonymousClass0cQ.I(this, 1645326398);
        AnonymousClass1TN.makeText(this.f59290B.getContext(), C0164R.string.two_fac_account_recovery_get_new_codes_toast, 0).show();
        this.f59290B.f59293B.setText(AnonymousClass50y.m25592C(anonymousClass2DN.f27579D));
        AnonymousClass0cQ.H(this, 1849306420, I2);
        AnonymousClass0cQ.H(this, 896527570, I);
    }
}

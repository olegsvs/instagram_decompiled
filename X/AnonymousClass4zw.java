package X;

import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.4zw */
public final class AnonymousClass4zw extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0II f59189B;

    public AnonymousClass4zw(AnonymousClass0II anonymousClass0II) {
        this.f59189B = anonymousClass0II;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -204570633);
        Toast.makeText(this.f59189B.getContext(), C0164R.string.no_account_found, 0).show();
        super.onFail(anonymousClass0Q6);
        AnonymousClass0cQ.H(this, 640387522, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 1660926987);
        super.onFinish();
        this.f59189B.f2736C = false;
        if (this.f59189B.isResumed()) {
            AnonymousClass0eT.E(this.f59189B.getActivity()).Y(false);
        }
        AnonymousClass0cQ.H(this, 213993978, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -978084490);
        super.onStart();
        this.f59189B.f2736C = true;
        AnonymousClass0eT.E(this.f59189B.getActivity()).Y(true);
        AnonymousClass0cQ.H(this, 511891444, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -55921855);
        AnonymousClass1Nf anonymousClass1Nf = (AnonymousClass1Nf) obj;
        int I2 = AnonymousClass0cQ.I(this, -926875121);
        AnonymousClass0Ci anonymousClass0Ci = anonymousClass1Nf.f17816C;
        this.f59189B.f2746M = anonymousClass0Ci.uT();
        this.f59189B.f2740G = anonymousClass0Ci.DQ();
        AnonymousClass0IL anonymousClass0IL = this.f59189B;
        AnonymousClass0II.C(anonymousClass0IL, anonymousClass0IL.getView());
        AnonymousClass0cQ.H(this, -1951132841, I2);
        AnonymousClass0cQ.H(this, -1968979586, I);
    }
}

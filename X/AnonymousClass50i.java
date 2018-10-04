package X;

import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.50i */
public final class AnonymousClass50i extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1PK f59279B;

    public AnonymousClass50i(AnonymousClass1PK anonymousClass1PK) {
        this.f59279B = anonymousClass1PK;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 1515742763);
        AnonymousClass3nj.F(this.f59279B.getContext(), AnonymousClass0FL.D(this.f59279B.f18143M), anonymousClass0Q6);
        AnonymousClass0cQ.H(this, -270267787, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 266805491);
        AnonymousClass0eT.E(this.f59279B.getActivity()).Y(false);
        AnonymousClass0cQ.H(this, -1906614808, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, 1406414023);
        AnonymousClass0eT.E(this.f59279B.getActivity()).Y(true);
        AnonymousClass0cQ.H(this, -212838337, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -43529983);
        AnonymousClass2Dm anonymousClass2Dm = (AnonymousClass2Dm) obj;
        int I2 = AnonymousClass0cQ.I(this, 1517628781);
        Toast.makeText(this.f59279B.getActivity(), this.f59279B.getString(C0164R.string.two_fac_resend_success_toast), 0).show();
        AnonymousClass2Di anonymousClass2Di = this.f59279B.f59107F;
        anonymousClass2Di.f27645B--;
        AnonymousClass0cQ.H(this, -1350807815, I2);
        AnonymousClass0cQ.H(this, 1594000101, I);
    }
}

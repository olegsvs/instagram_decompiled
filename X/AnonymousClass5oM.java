package X;

import android.text.TextUtils;
import android.widget.Toast;
import com.facebook.C0164R;

/* renamed from: X.5oM */
public final class AnonymousClass5oM extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5oN f69097B;

    public AnonymousClass5oM(AnonymousClass5oN anonymousClass5oN) {
        this.f69097B = anonymousClass5oN;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -1091647237);
        Toast.makeText(this.f69097B.getActivity(), C0164R.string.fail_send_confirm_email, 0).show();
        AnonymousClass0cQ.H(this, 535144481, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -1229168879);
        super.onFinish();
        this.f69097B.f69100D = false;
        AnonymousClass0eT.E(this.f69097B.getActivity()).Y(false);
        AnonymousClass0cQ.H(this, 1863716418, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, 1925698857);
        super.onStart();
        this.f69097B.f69100D = true;
        AnonymousClass0eT.E(this.f69097B.getActivity()).Y(true);
        AnonymousClass0cQ.H(this, 719593440, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1453268357);
        AnonymousClass2MF anonymousClass2MF = (AnonymousClass2MF) obj;
        int I2 = AnonymousClass0cQ.I(this, 2095324728);
        if (TextUtils.isEmpty(anonymousClass2MF.f29525C) || TextUtils.isEmpty(anonymousClass2MF.f29524B)) {
            AnonymousClass0OR.D(this.f69097B.f69099C, new AnonymousClass5oL(this, anonymousClass2MF, null), -1785060857);
        } else {
            AnonymousClass0OR.D(this.f69097B.f69099C, new AnonymousClass5oL(this, anonymousClass2MF, AnonymousClass1SA.B(anonymousClass2MF.f29525C, anonymousClass2MF.f29524B)), 338858928);
        }
        AnonymousClass0cQ.H(this, -236528749, I2);
        AnonymousClass0cQ.H(this, 1533646139, I);
    }
}
